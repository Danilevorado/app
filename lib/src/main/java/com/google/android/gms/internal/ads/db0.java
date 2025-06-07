package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class db0 extends u3.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f7246a;

    /* renamed from: b, reason: collision with root package name */
    private final ua0 f7247b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f7248c;

    /* renamed from: d, reason: collision with root package name */
    private final mb0 f7249d = new mb0();

    public db0(Context context, String str) {
        this.f7248c = context.getApplicationContext();
        this.f7246a = str;
        this.f7247b = k3.t.a().m(context, str, new l30());
    }

    @Override // u3.c
    public final d3.u a() {
        k3.j2 j2VarD = null;
        try {
            ua0 ua0Var = this.f7247b;
            if (ua0Var != null) {
                j2VarD = ua0Var.d();
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
        return d3.u.e(j2VarD);
    }

    @Override // u3.c
    public final void c(Activity activity, d3.p pVar) {
        this.f7249d.L5(pVar);
        if (activity == null) {
            ze0.g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            ua0 ua0Var = this.f7247b;
            if (ua0Var != null) {
                ua0Var.n2(this.f7249d);
                this.f7247b.J0(l4.b.p1(activity));
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    public final void d(k3.t2 t2Var, u3.d dVar) {
        try {
            ua0 ua0Var = this.f7247b;
            if (ua0Var != null) {
                ua0Var.E4(k3.g4.f24647a.a(this.f7248c, t2Var), new hb0(dVar, this));
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }
}
