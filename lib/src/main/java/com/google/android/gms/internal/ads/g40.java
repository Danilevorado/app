package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class g40 implements o3.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u30 f8597a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o3.a f8598b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n40 f8599c;

    g40(n40 n40Var, u30 u30Var, o3.a aVar) {
        this.f8599c = n40Var;
        this.f8597a = u30Var;
        this.f8598b = aVar;
    }

    @Override // o3.d
    public final void a(d3.a aVar) {
        try {
            ze0.b(this.f8598b.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + aVar.a() + ". ErrorMessage = " + aVar.c() + ". ErrorDomain = " + aVar.b());
            this.f8597a.I1(aVar.d());
            this.f8597a.X1(aVar.a(), aVar.c());
            this.f8597a.w(aVar.a());
        } catch (RemoteException e5) {
            ze0.e("", e5);
        }
    }
}
