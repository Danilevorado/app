package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e extends b implements g.a {

    /* renamed from: o, reason: collision with root package name */
    private Context f665o;

    /* renamed from: p, reason: collision with root package name */
    private ActionBarContextView f666p;

    /* renamed from: q, reason: collision with root package name */
    private b.a f667q;

    /* renamed from: r, reason: collision with root package name */
    private WeakReference f668r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f669s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f670t;

    /* renamed from: u, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f671u;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f665o = context;
        this.f666p = actionBarContextView;
        this.f667q = aVar;
        androidx.appcompat.view.menu.g gVarS = new androidx.appcompat.view.menu.g(actionBarContextView.getContext()).S(1);
        this.f671u = gVarS;
        gVarS.R(this);
        this.f670t = z10;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        return this.f667q.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        k();
        this.f666p.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f669s) {
            return;
        }
        this.f669s = true;
        this.f667q.b(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference weakReference = this.f668r;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f671u;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f666p.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f666p.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f666p.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f667q.a(this, this.f671u);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f666p.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f666p.setCustomView(view);
        this.f668r = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i10) {
        o(this.f665o.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f666p.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i10) {
        r(this.f665o.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f666p.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z10) {
        super.s(z10);
        this.f666p.setTitleOptional(z10);
    }
}
