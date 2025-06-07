package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class k40 implements o3.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u30 f10807a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n40 f10808b;

    k40(n40 n40Var, u30 u30Var) {
        this.f10808b = n40Var;
        this.f10807a = u30Var;
    }

    @Override // o3.d
    public final void a(d3.a aVar) {
        try {
            ze0.b(this.f10808b.f12397m.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + aVar.a() + ". ErrorMessage = " + aVar.c() + ". ErrorDomain = " + aVar.b());
            this.f10807a.I1(aVar.d());
            this.f10807a.X1(aVar.a(), aVar.c());
            this.f10807a.w(aVar.a());
        } catch (RemoteException e5) {
            ze0.e("", e5);
        }
    }
}
