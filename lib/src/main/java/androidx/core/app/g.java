package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.f;
import androidx.lifecycle.j;
import androidx.lifecycle.w;

/* loaded from: classes.dex */
public abstract class g extends Activity implements androidx.lifecycle.n, f.a {

    /* renamed from: m, reason: collision with root package name */
    private q.g f2048m = new q.g();

    /* renamed from: n, reason: collision with root package name */
    private androidx.lifecycle.o f2049n = new androidx.lifecycle.o(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.f.d(decorView, keyEvent)) {
            return androidx.core.view.f.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.f.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.core.view.f.a
    public boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w.g(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.f2049n.j(j.c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
