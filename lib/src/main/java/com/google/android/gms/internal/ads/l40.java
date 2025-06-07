package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class l40 implements o3.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u30 f11317a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n40 f11318b;

    l40(n40 n40Var, u30 u30Var) {
        this.f11318b = n40Var;
        this.f11317a = u30Var;
    }

    @Override // o3.d
    public final void a(d3.a aVar) {
        try {
            ze0.b(this.f11318b.f12397m.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + aVar.a() + ". ErrorMessage = " + aVar.c() + ". ErrorDomain = " + aVar.b());
            this.f11317a.I1(aVar.d());
            this.f11317a.X1(aVar.a(), aVar.c());
            this.f11317a.w(aVar.a());
        } catch (RemoteException e5) {
            ze0.e("", e5);
        }
    }
}
