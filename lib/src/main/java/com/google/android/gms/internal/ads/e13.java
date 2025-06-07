package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class e13 extends x13 {

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ k13 f7601n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ n13 f7602o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ b5.j f7603p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ i13 f7604q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e13(i13 i13Var, b5.j jVar, k13 k13Var, n13 n13Var, b5.j jVar2) {
        super(jVar);
        this.f7604q = i13Var;
        this.f7601n = k13Var;
        this.f7602o = n13Var;
        this.f7603p = jVar2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.IInterface, com.google.android.gms.internal.ads.t13] */
    @Override // com.google.android.gms.internal.ads.x13
    protected final void a() {
        try {
            ?? E = this.f7604q.f9487a.e();
            i13 i13Var = this.f7604q;
            String str = i13Var.f9488b;
            k13 k13Var = this.f7601n;
            String str2 = i13Var.f9488b;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", k13Var.e());
            bundle.putString("adFieldEnifd", k13Var.f());
            bundle.putInt("layoutGravity", k13Var.c());
            bundle.putFloat("layoutVerticalMargin", k13Var.a());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", k13Var.d());
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str2);
            if (k13Var.g() != null) {
                bundle.putString("appId", k13Var.g());
            }
            E.O1(str, bundle, new h13(this.f7604q, this.f7602o));
        } catch (RemoteException e5) {
            i13.f9485c.b(e5, "show overlay display from: %s", this.f7604q.f9488b);
            this.f7603p.d(new RuntimeException(e5));
        }
    }
}
