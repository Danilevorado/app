package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class g13 extends x13 {

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ p13 f8575n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ int f8576o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ n13 f8577p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ b5.j f8578q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ i13 f8579r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g13(i13 i13Var, b5.j jVar, p13 p13Var, int i10, n13 n13Var, b5.j jVar2) {
        super(jVar);
        this.f8579r = i13Var;
        this.f8575n = p13Var;
        this.f8576o = i10;
        this.f8577p = n13Var;
        this.f8578q = jVar2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.t13] */
    @Override // com.google.android.gms.internal.ads.x13
    protected final void a() {
        try {
            ?? E = this.f8579r.f9487a.e();
            p13 p13Var = this.f8575n;
            String str = this.f8579r.f9488b;
            int i10 = this.f8576o;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", p13Var.b());
            bundle.putInt("displayMode", i10);
            bundle.putString("callerPackage", str);
            bundle.putString("appId", p13Var.a());
            E.z5(bundle, new h13(this.f8579r, this.f8577p));
        } catch (RemoteException e5) {
            i13.f9485c.b(e5, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.f8576o), this.f8579r.f9488b);
            this.f8578q.d(new RuntimeException(e5));
        }
    }
}
