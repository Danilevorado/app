package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class u50 implements o3.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w40 f16169a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u30 f16170b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y50 f16171c;

    u50(y50 y50Var, w40 w40Var, u30 u30Var) {
        this.f16171c = y50Var;
        this.f16169a = w40Var;
        this.f16170b = u30Var;
    }

    @Override // o3.d
    public final void a(d3.a aVar) {
        try {
            this.f16169a.y(aVar.d());
        } catch (RemoteException e5) {
            ze0.e("", e5);
        }
    }
}
