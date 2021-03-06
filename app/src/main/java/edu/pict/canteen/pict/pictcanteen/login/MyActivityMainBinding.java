package edu.pict.canteen.pict.pictcanteen.login;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import edu.pict.canteen.pict.pictcanteen.R;

import android.view.View;
@SuppressWarnings("unchecked")
public class MyActivityMainBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.wrapper, 1);
        sViewsWithIds.put(R.id.sign_up_fragment, 2);
        sViewsWithIds.put(R.id.button, 3);
        sViewsWithIds.put(R.id.login_fragment, 4);
    }
    // views
    @NonNull
    public final edu.pict.canteen.pict.pictcanteen.login.LoginButton button;
    @NonNull
    public final android.widget.FrameLayout loginFragment;
    @NonNull
    private final android.support.design.widget.CoordinatorLayout mboundView0;
    @NonNull
    public final android.widget.FrameLayout signUpFragment;
    @NonNull
    public final edu.pict.canteen.pict.pictcanteen.login.FlexibleFrameLayout wrapper;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MyActivityMainBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.button = (edu.pict.canteen.pict.pictcanteen.login.LoginButton) bindings[3];
        this.loginFragment = (android.widget.FrameLayout) bindings[4];
        this.mboundView0 = (android.support.design.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.signUpFragment = (android.widget.FrameLayout) bindings[2];
        this.wrapper = (edu.pict.canteen.pict.pictcanteen.login.FlexibleFrameLayout) bindings[1];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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

    @NonNull
    public static MyActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static MyActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<MyActivityMainBinding>inflate(inflater, R.layout.activity_main, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static MyActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static MyActivityMainBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(R.layout.activity_main, null, false), bindingComponent);
    }
    @NonNull
    public static MyActivityMainBinding bind(@NonNull View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static MyActivityMainBinding bind(@NonNull View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new MyActivityMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}