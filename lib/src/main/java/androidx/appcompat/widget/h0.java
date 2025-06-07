package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;

/* loaded from: classes.dex */
public interface h0 {
    void a(Menu menu, m.a aVar);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    void i(m.a aVar, g.a aVar2);

    void j(int i10);

    void k(t0 t0Var);

    ViewGroup l();

    void m(boolean z10);

    boolean n();

    void o(int i10);

    int p();

    Menu q();

    void r(int i10);

    int s();

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    androidx.core.view.c0 t(int i10, long j10);

    void u();

    void v();

    void w(boolean z10);
}
