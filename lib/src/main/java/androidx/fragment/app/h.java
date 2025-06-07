package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.k0;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final j f2853a;

    private h(j jVar) {
        this.f2853a = jVar;
    }

    public static h b(j jVar) {
        return new h((j) androidx.core.util.h.g(jVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        j jVar = this.f2853a;
        jVar.f2859q.j(jVar, jVar, fragment);
    }

    public void c() {
        this.f2853a.f2859q.y();
    }

    public void d(Configuration configuration) {
        this.f2853a.f2859q.A(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f2853a.f2859q.B(menuItem);
    }

    public void f() {
        this.f2853a.f2859q.C();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f2853a.f2859q.D(menu, menuInflater);
    }

    public void h() {
        this.f2853a.f2859q.E();
    }

    public void i() {
        this.f2853a.f2859q.G();
    }

    public void j(boolean z10) {
        this.f2853a.f2859q.H(z10);
    }

    public boolean k(MenuItem menuItem) {
        return this.f2853a.f2859q.J(menuItem);
    }

    public void l(Menu menu) {
        this.f2853a.f2859q.K(menu);
    }

    public void m() {
        this.f2853a.f2859q.M();
    }

    public void n(boolean z10) {
        this.f2853a.f2859q.N(z10);
    }

    public boolean o(Menu menu) {
        return this.f2853a.f2859q.O(menu);
    }

    public void p() {
        this.f2853a.f2859q.Q();
    }

    public void q() {
        this.f2853a.f2859q.R();
    }

    public void r() {
        this.f2853a.f2859q.T();
    }

    public boolean s() {
        return this.f2853a.f2859q.a0(true);
    }

    public m t() {
        return this.f2853a.f2859q;
    }

    public void u() {
        this.f2853a.f2859q.R0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2853a.f2859q.u0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        j jVar = this.f2853a;
        if (!(jVar instanceof k0)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        jVar.f2859q.e1(parcelable);
    }

    public Parcelable x() {
        return this.f2853a.f2859q.g1();
    }
}
