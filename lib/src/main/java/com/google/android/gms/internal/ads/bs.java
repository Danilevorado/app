package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class bs extends cs {

    /* renamed from: m, reason: collision with root package name */
    private final j3.f f6650m;

    /* renamed from: n, reason: collision with root package name */
    private final String f6651n;

    /* renamed from: o, reason: collision with root package name */
    private final String f6652o;

    public bs(j3.f fVar, String str, String str2) {
        this.f6650m = fVar;
        this.f6651n = str;
        this.f6652o = str2;
    }

    @Override // com.google.android.gms.internal.ads.es
    public final String b() {
        return this.f6651n;
    }

    @Override // com.google.android.gms.internal.ads.es
    public final void c() {
        this.f6650m.b();
    }

    @Override // com.google.android.gms.internal.ads.es
    public final String d() {
        return this.f6652o;
    }

    @Override // com.google.android.gms.internal.ads.es
    public final void d0(l4.a aVar) {
        if (aVar == null) {
            return;
        }
        this.f6650m.a((View) l4.b.L0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.es
    public final void e() {
        this.f6650m.d();
    }
}
