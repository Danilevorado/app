package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class r50 implements o3.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z40 f14636a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u30 f14637b;

    r50(y50 y50Var, z40 z40Var, u30 u30Var) {
        this.f14636a = z40Var;
        this.f14637b = u30Var;
    }

    @Override // o3.d
    public final void a(d3.a aVar) {
        try {
            this.f14636a.y(aVar.d());
        } catch (RemoteException e5) {
            ze0.e("", e5);
        }
    }
}
