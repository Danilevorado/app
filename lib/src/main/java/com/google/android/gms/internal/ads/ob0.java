package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class ob0 extends v3.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f13122a;

    /* renamed from: b, reason: collision with root package name */
    private final ua0 f13123b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f13124c;

    /* renamed from: d, reason: collision with root package name */
    private final mb0 f13125d = new mb0();

    public ob0(Context context, String str) {
        this.f13122a = str;
        this.f13124c = context.getApplicationContext();
        this.f13123b = k3.t.a().m(context, str, new l30());
    }

    @Override // v3.a
    public final d3.u a() {
        k3.j2 j2VarD = null;
        try {
            ua0 ua0Var = this.f13123b;
            if (ua0Var != null) {
                j2VarD = ua0Var.d();
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
        return d3.u.e(j2VarD);
    }

    @Override // v3.a
    public final void c(Activity activity, d3.p pVar) {
        this.f13125d.L5(pVar);
        try {
            ua0 ua0Var = this.f13123b;
            if (ua0Var != null) {
                ua0Var.n2(this.f13125d);
                this.f13123b.J0(l4.b.p1(activity));
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    public final void d(k3.t2 t2Var, v3.b bVar) {
        try {
            ua0 ua0Var = this.f13123b;
            if (ua0Var != null) {
                ua0Var.s3(k3.g4.f24647a.a(this.f13124c, t2Var), new nb0(bVar, this));
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }
}
