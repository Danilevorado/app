package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class q50 implements o3.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z40 f14145a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u30 f14146b;

    q50(y50 y50Var, z40 z40Var, u30 u30Var) {
        this.f14145a = z40Var;
        this.f14146b = u30Var;
    }

    @Override // o3.d
    public final void a(d3.a aVar) {
        try {
            this.f14145a.y(aVar.d());
        } catch (RemoteException e5) {
            ze0.e("", e5);
        }
    }
}
