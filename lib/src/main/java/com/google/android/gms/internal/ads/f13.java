package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class f13 extends x13 {

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ z03 f8091n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ n13 f8092o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ b5.j f8093p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ i13 f8094q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f13(i13 i13Var, b5.j jVar, z03 z03Var, n13 n13Var, b5.j jVar2) {
        super(jVar);
        this.f8094q = i13Var;
        this.f8091n = z03Var;
        this.f8092o = n13Var;
        this.f8093p = jVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.t13] */
    @Override // com.google.android.gms.internal.ads.x13
    protected final void a() {
        try {
            ?? E = this.f8094q.f9487a.e();
            z03 z03Var = this.f8091n;
            String str = this.f8094q.f9488b;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", z03Var.b());
            bundle.putString("callerPackage", str);
            bundle.putString("appId", z03Var.a());
            E.c3(bundle, new h13(this.f8094q, this.f8092o));
        } catch (RemoteException e5) {
            i13.f9485c.b(e5, "dismiss overlay display from: %s", this.f8094q.f9488b);
            this.f8093p.d(new RuntimeException(e5));
        }
    }
}
