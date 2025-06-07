package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class j40 implements o3.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u30 f10289a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n40 f10290b;

    j40(n40 n40Var, u30 u30Var) {
        this.f10290b = n40Var;
        this.f10289a = u30Var;
    }

    @Override // o3.d
    public final void a(d3.a aVar) {
        try {
            ze0.b(this.f10290b.f12397m.getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + aVar.a() + ". ErrorMessage = " + aVar.c() + ". ErrorDomain = " + aVar.b());
            this.f10289a.I1(aVar.d());
            this.f10289a.X1(aVar.a(), aVar.c());
            this.f10289a.w(aVar.a());
        } catch (RemoteException e5) {
            ze0.e("", e5);
        }
    }
}
