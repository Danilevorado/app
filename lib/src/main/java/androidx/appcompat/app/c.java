package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.i1;
import androidx.core.app.s;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import t0.c;

/* loaded from: classes.dex */
public abstract class c extends androidx.fragment.app.e implements d, s.a {
    private f K;
    private Resources L;

    class a implements c.InterfaceC0188c {
        a() {
        }

        @Override // t0.c.InterfaceC0188c
        public Bundle a() {
            Bundle bundle = new Bundle();
            c.this.P().B(bundle);
            return bundle;
        }
    }

    class b implements d.b {
        b() {
        }

        @Override // d.b
        public void a(Context context) {
            f fVarP = c.this.P();
            fVarP.s();
            fVarP.x(c.this.c().b("androidx:appcompat"));
        }
    }

    public c() {
        R();
    }

    private void R() {
        c().h("androidx:appcompat", new a());
        x(new b());
    }

    private boolean Y(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    private void z() {
        l0.a(getWindow().getDecorView(), this);
        m0.a(getWindow().getDecorView(), this);
        t0.f.a(getWindow().getDecorView(), this);
        androidx.activity.m.a(getWindow().getDecorView(), this);
    }

    @Override // androidx.fragment.app.e
    public void O() {
        P().t();
    }

    public f P() {
        if (this.K == null) {
            this.K = f.h(this, this);
        }
        return this.K;
    }

    public androidx.appcompat.app.a Q() {
        return P().r();
    }

    public void S(androidx.core.app.s sVar) {
        sVar.f(this);
    }

    protected void T(androidx.core.os.i iVar) {
    }

    protected void U(int i10) {
    }

    public void V(androidx.core.app.s sVar) {
    }

    public void W() {
    }

    public boolean X() {
        Intent intentP = p();
        if (intentP == null) {
            return false;
        }
        if (!b0(intentP)) {
            a0(intentP);
            return true;
        }
        androidx.core.app.s sVarI = androidx.core.app.s.i(this);
        S(sVarI);
        V(sVarI);
        sVarI.k();
        try {
            androidx.core.app.b.o(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public void Z(Toolbar toolbar) {
        P().L(toolbar);
    }

    public void a0(Intent intent) {
        androidx.core.app.j.e(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        P().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(P().g(context));
    }

    public boolean b0(Intent intent) {
        return androidx.core.app.j.f(this, intent);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a aVarQ = Q();
        if (getWindow().hasFeature(0)) {
            if (aVarQ == null || !aVarQ.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a aVarQ = Q();
        if (keyCode == 82 && aVarQ != null && aVarQ.o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i10) {
        return P().j(i10);
    }

    @Override // androidx.appcompat.app.d
    public void g(androidx.appcompat.view.b bVar) {
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return P().p();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.L == null && i1.c()) {
            this.L = new i1(this, super.getResources());
        }
        Resources resources = this.L;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        P().t();
    }

    @Override // androidx.appcompat.app.d
    public void j(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        P().w(configuration);
        if (this.L != null) {
            this.L.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        W();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        P().y();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (Y(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a aVarQ = Q();
        if (menuItem.getItemId() != 16908332 || aVarQ == null || (aVarQ.i() & 4) == 0) {
            return false;
        }
        return X();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        P().z(bundle);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        P().A();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onStart() {
        super.onStart();
        P().C();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onStop() {
        super.onStop();
        P().D();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        P().N(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a aVarQ = Q();
        if (getWindow().hasFeature(0)) {
            if (aVarQ == null || !aVarQ.p()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.s.a
    public Intent p() {
        return androidx.core.app.j.a(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        z();
        P().H(i10);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        z();
        P().I(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        z();
        P().J(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        P().M(i10);
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b t(b.a aVar) {
        return null;
    }
}
