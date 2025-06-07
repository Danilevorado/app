package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.core.view.f;

/* loaded from: classes.dex */
public abstract class j extends androidx.activity.f implements d {

    /* renamed from: o, reason: collision with root package name */
    private f f568o;

    /* renamed from: p, reason: collision with root package name */
    private final f.a f569p;

    public j(Context context, int i10) {
        super(context, h(context, i10));
        this.f569p = new f.a() { // from class: androidx.appcompat.app.i
            @Override // androidx.core.view.f.a
            public final boolean f(KeyEvent keyEvent) {
                return this.f567m.i(keyEvent);
            }
        };
        f fVarF = f();
        fVarF.M(h(context, i10));
        fVarF.x(null);
    }

    private static int h(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.f23310w, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        f().y();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.f.e(this.f569p, getWindow().getDecorView(), this, keyEvent);
    }

    public f f() {
        if (this.f568o == null) {
            this.f568o = f.i(this, this);
        }
        return this.f568o;
    }

    @Override // android.app.Dialog
    public View findViewById(int i10) {
        return f().j(i10);
    }

    @Override // androidx.appcompat.app.d
    public void g(androidx.appcompat.view.b bVar) {
    }

    boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        f().t();
    }

    @Override // androidx.appcompat.app.d
    public void j(androidx.appcompat.view.b bVar) {
    }

    public boolean k(int i10) {
        return f().G(i10);
    }

    @Override // androidx.activity.f, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        f().s();
        super.onCreate(bundle);
        f().x(bundle);
    }

    @Override // androidx.activity.f, android.app.Dialog
    protected void onStop() {
        super.onStop();
        f().D();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        f().H(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        f().I(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f().J(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        f().N(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().N(charSequence);
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b t(b.a aVar) {
        return null;
    }
}
