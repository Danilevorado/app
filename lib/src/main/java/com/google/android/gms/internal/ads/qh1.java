package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.Collections;

/* loaded from: classes.dex */
public final class qh1 extends g00 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, bu {

    /* renamed from: m, reason: collision with root package name */
    private View f14318m;

    /* renamed from: n, reason: collision with root package name */
    private k3.m2 f14319n;

    /* renamed from: o, reason: collision with root package name */
    private kd1 f14320o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f14321p = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f14322q = false;

    public qh1(kd1 kd1Var, pd1 pd1Var) {
        this.f14318m = pd1Var.Q();
        this.f14319n = pd1Var.U();
        this.f14320o = kd1Var;
        if (pd1Var.c0() != null) {
            pd1Var.c0().U0(this);
        }
    }

    private static final void L5(k00 k00Var, int i10) {
        try {
            k00Var.H(i10);
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    private final void g() {
        View view = this.f14318m;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f14318m);
        }
    }

    private final void h() {
        View view;
        kd1 kd1Var = this.f14320o;
        if (kd1Var == null || (view = this.f14318m) == null) {
            return;
        }
        kd1Var.h(view, Collections.emptyMap(), Collections.emptyMap(), kd1.D(this.f14318m));
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final k3.m2 b() {
        e4.p.e("#008 Must be called on the main UI thread.");
        if (!this.f14321p) {
            return this.f14319n;
        }
        ze0.d("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final nu d() {
        e4.p.e("#008 Must be called on the main UI thread.");
        if (this.f14321p) {
            ze0.d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        kd1 kd1Var = this.f14320o;
        if (kd1Var == null || kd1Var.N() == null) {
            return null;
        }
        return kd1Var.N().a();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void f() {
        e4.p.e("#008 Must be called on the main UI thread.");
        g();
        kd1 kd1Var = this.f14320o;
        if (kd1Var != null) {
            kd1Var.a();
        }
        this.f14320o = null;
        this.f14318m = null;
        this.f14319n = null;
        this.f14321p = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        h();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        h();
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void q4(l4.a aVar, k00 k00Var) {
        e4.p.e("#008 Must be called on the main UI thread.");
        if (this.f14321p) {
            ze0.d("Instream ad can not be shown after destroy().");
            L5(k00Var, 2);
            return;
        }
        View view = this.f14318m;
        if (view == null || this.f14319n == null) {
            ze0.d("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            L5(k00Var, 0);
            return;
        }
        if (this.f14322q) {
            ze0.d("Instream ad should not be used again.");
            L5(k00Var, 1);
            return;
        }
        this.f14322q = true;
        g();
        ((ViewGroup) l4.b.L0(aVar)).addView(this.f14318m, new ViewGroup.LayoutParams(-1, -1));
        j3.t.z();
        bg0.a(this.f14318m, this);
        j3.t.z();
        bg0.b(this.f14318m, this);
        h();
        try {
            k00Var.e();
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.h00
    public final void zze(l4.a aVar) {
        e4.p.e("#008 Must be called on the main UI thread.");
        q4(aVar, new ph1(this));
    }
}
