package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class el extends f3.a {

    /* renamed from: a, reason: collision with root package name */
    private final il f7890a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7891b;

    /* renamed from: c, reason: collision with root package name */
    private final fl f7892c = new fl();

    public el(il ilVar, String str) {
        this.f7890a = ilVar;
        this.f7891b = str;
    }

    @Override // f3.a
    public final d3.u a() {
        k3.j2 j2VarE;
        try {
            j2VarE = this.f7890a.e();
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
            j2VarE = null;
        }
        return d3.u.e(j2VarE);
    }

    @Override // f3.a
    public final void c(Activity activity) {
        try {
            this.f7890a.l1(l4.b.p1(activity), this.f7892c);
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }
}
