/*
 * Copyright 2019, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.dessertclicker

import android.content.ActivityNotFoundException
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ShareCompat
import androidx.databinding.DataBindingUtil
import com.example.android.dessertclicker.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private var revenue = 0
    private var cliks = 0

    // Contains all the views
    private lateinit var binding: ActivityMainBinding

    /** Dessert Data **/

    /**
     * Simple data class that represents a dessert. Includes the resource id integer associated with
     * the image, the price it's sold for, and the startProductionAmount, which determines when
     * the dessert starts to be produced.
     */
    data class Enemy(val imageId: Int, val startProductionAmount: Int)

    // Create a list of all desserts, in order of when they start being produced
    private val allEnemies = listOf(
            Enemy(R.drawable.enemy1,  0),
            Enemy(R.drawable.enemy2,  4),
            Enemy(R.drawable.enemy3,  8),
            Enemy(R.drawable.enemy4,  12),
            Enemy(R.drawable.enemy5,  16),
            Enemy(R.drawable.enemy6,  20),


    )
    private var currentEnemy = allEnemies[0]
    private lateinit var sprite_animation: AnimationDrawable
    private var powerUp = false;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("onCreate Called")


        // Use Data Binding to get reference to the views
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.buttonEnemy.setOnClickListener {
            onPlanetClicked()
        }

        binding.btnPowerUp.setOnClickListener {
            powerUp = !powerUp
        }

        val character_sprite = findViewById<ImageView>(R.id.character_sprite).apply {
            setBackgroundResource(R.drawable.animation)
            sprite_animation = background as AnimationDrawable
        }


        // Set the TextViews to the right values


        // Make sure the correct dessert is showing
        binding.buttonEnemy.setImageResource(currentEnemy.imageId)
    }

    override fun onStart() {
        super.onStart()
        Timber.i("onStart Called")

    }
    override fun onResume() {
        super.onResume()
        Timber.i("onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy Called")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.i("onRestart Called")
    }


    /**
     * Updates the score when the dessert is clicked. Possibly shows a new dessert.
     */
    private fun onPlanetClicked() {

        sprite_animation.start()

        Handler(Looper.getMainLooper()).postDelayed(
            {
               sprite_animation.stop()
            },
            1000
        )

        if(powerUp) {
            cliks +=2
            binding.progressBar.progress -= 50
        } else {
            cliks++
            binding.progressBar.progress -= 25;
        }



        // Show the next dessert
        showCurrentEnemy()



    }

    private fun onButtonClicked() {

        // Update the score
        cliks -= cliks
        showCurrentEnemy();

    }

    /**
     * Determine which dessert to show.
     */
    private fun showCurrentEnemy() {
        var newEnemy = allEnemies[0]
        for (dessert in allEnemies) {
            if (cliks >= dessert.startProductionAmount) {
                newEnemy = dessert


            }

            else break
        }

        // If the new dessert is actually different than the current dessert, update the image
        if (newEnemy != currentEnemy) {
            Timber.i("Enemy destroyed")
            currentEnemy = newEnemy
            binding.buttonEnemy.setImageResource(newEnemy.imageId)
            binding.progressBar.progress = 100
        }
    }

    /**
     * Menu methods
     */
    private fun onShare() {
        val shareIntent = ShareCompat.IntentBuilder.from(this)
                .setText(getString(R.string.share_text, cliks, revenue))
                .setType("text/plain")
                .intent
        try {
            startActivity(shareIntent)
        } catch (ex: ActivityNotFoundException) {
            Toast.makeText(this, getString(R.string.sharing_not_available),
                    Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.shareMenuButton -> onShare()
        }
        return super.onOptionsItemSelected(item)
    }
}
