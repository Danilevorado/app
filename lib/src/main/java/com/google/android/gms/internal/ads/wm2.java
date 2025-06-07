package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class wm2 implements u3.a {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ k3.z1 f17203m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ ym2 f17204n;

    wm2(ym2 ym2Var, k3.z1 z1Var) {
        this.f17204n = ym2Var;
        this.f17203m = z1Var;
    }

    @Override // u3.a
    public final void a() {
        if (this.f17204n.f18111t != null) {
            try {
                this.f17203m.c();
            } catch (RemoteException e5) {
                ze0.i("#007 Could not call remote method.", e5);
            }
        }
    }
}
