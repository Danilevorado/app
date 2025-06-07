package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class o00 extends e3.b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12927a;

    /* renamed from: b, reason: collision with root package name */
    private final k3.g4 f12928b;

    /* renamed from: c, reason: collision with root package name */
    private final k3.q0 f12929c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12930d;

    /* renamed from: e, reason: collision with root package name */
    private final l30 f12931e;

    /* renamed from: f, reason: collision with root package name */
    private d3.k f12932f;

    public o00(Context context, String str) {
        l30 l30Var = new l30();
        this.f12931e = l30Var;
        this.f12927a = context;
        this.f12930d = str;
        this.f12928b = k3.g4.f24647a;
        this.f12929c = k3.t.a().e(context, new k3.h4(), str, l30Var);
    }

    @Override // n3.a
    public final d3.u a() {
        k3.j2 j2VarK = null;
        try {
            k3.q0 q0Var = this.f12929c;
            if (q0Var != null) {
                j2VarK = q0Var.k();
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
        return d3.u.e(j2VarK);
    }

    @Override // n3.a
    public final void c(d3.k kVar) {
        try {
            this.f12932f = kVar;
            k3.q0 q0Var = this.f12929c;
            if (q0Var != null) {
                q0Var.r1(new k3.x(kVar));
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // n3.a
    public final void d(boolean z10) {
        try {
            k3.q0 q0Var = this.f12929c;
            if (q0Var != null) {
                q0Var.F3(z10);
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // n3.a
    public final void e(Activity activity) {
        if (activity == null) {
            ze0.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            k3.q0 q0Var = this.f12929c;
            if (q0Var != null) {
                q0Var.f1(l4.b.p1(activity));
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    public final void f(k3.t2 t2Var, d3.d dVar) {
        try {
            k3.q0 q0Var = this.f12929c;
            if (q0Var != null) {
                q0Var.O2(this.f12928b.a(this.f12927a, t2Var), new k3.y3(dVar, this));
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
            dVar.a(new d3.l(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
