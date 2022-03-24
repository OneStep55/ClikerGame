// Generated by data binding compiler. Do not edit!
package com.example.android.dessertclicker.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.dessertclicker.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final Button btnPowerUp;

  @NonNull
  public final ImageButton buttonEnemy;

  @NonNull
  public final ImageView characterSprite;

  @NonNull
  public final Guideline marginBottomGuide;

  @NonNull
  public final Guideline marginEndGuide;

  @NonNull
  public final Guideline marginStartGuide;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final View whiteBackground;

  @Bindable
  protected Integer mRevenue;

  @Bindable
  protected Integer mAmountSold;

  protected ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnPowerUp, ImageButton buttonEnemy, ImageView characterSprite,
      Guideline marginBottomGuide, Guideline marginEndGuide, Guideline marginStartGuide,
      ProgressBar progressBar, View whiteBackground) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnPowerUp = btnPowerUp;
    this.buttonEnemy = buttonEnemy;
    this.characterSprite = characterSprite;
    this.marginBottomGuide = marginBottomGuide;
    this.marginEndGuide = marginEndGuide;
    this.marginStartGuide = marginStartGuide;
    this.progressBar = progressBar;
    this.whiteBackground = whiteBackground;
  }

  public abstract void setRevenue(@Nullable Integer revenue);

  @Nullable
  public Integer getRevenue() {
    return mRevenue;
  }

  public abstract void setAmountSold(@Nullable Integer amountSold);

  @Nullable
  public Integer getAmountSold() {
    return mAmountSold;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMainBinding)bind(component, view, R.layout.activity_main);
  }
}