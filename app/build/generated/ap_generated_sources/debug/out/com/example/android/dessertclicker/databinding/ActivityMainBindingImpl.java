package com.example.android.dessertclicker.databinding;
import com.example.android.dessertclicker.R;
import com.example.android.dessertclicker.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.margin_end_guide, 1);
        sViewsWithIds.put(R.id.margin_bottom_guide, 2);
        sViewsWithIds.put(R.id.margin_start_guide, 3);
        sViewsWithIds.put(R.id.white_background, 4);
        sViewsWithIds.put(R.id.btn_powerUp, 5);
        sViewsWithIds.put(R.id.character_sprite, 6);
        sViewsWithIds.put(R.id.button_enemy, 7);
        sViewsWithIds.put(R.id.progressBar, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[5]
            , (android.widget.ImageButton) bindings[7]
            , (android.widget.ImageView) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[1]
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            , (android.widget.ProgressBar) bindings[8]
            , (android.view.View) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.revenue == variableId) {
            setRevenue((java.lang.Integer) variable);
        }
        else if (BR.amountSold == variableId) {
            setAmountSold((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRevenue(@Nullable java.lang.Integer Revenue) {
        this.mRevenue = Revenue;
    }
    public void setAmountSold(@Nullable java.lang.Integer AmountSold) {
        this.mAmountSold = AmountSold;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): revenue
        flag 1 (0x2L): amountSold
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}