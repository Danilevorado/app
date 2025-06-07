package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e30 extends fm0 {

    /* renamed from: m, reason: collision with root package name */
    private final w4.a f7617m;

    e30(w4.a aVar) {
        this.f7617m = aVar;
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final void I2(String str, String str2, Bundle bundle) {
        this.f7617m.n(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final void R2(String str, String str2, l4.a aVar) {
        this.f7617m.t(str, str2, aVar != null ? l4.b.L0(aVar) : null);
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final List S1(String str, String str2) {
        return this.f7617m.g(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final void U(String str) {
        this.f7617m.c(str);
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final void W4(String str, String str2, Bundle bundle) {
        this.f7617m.b(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final void b0(String str) {
        this.f7617m.a(str);
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final String c() {
        return this.f7617m.e();
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final void c0(Bundle bundle) {
        this.f7617m.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final long d() {
        return this.f7617m.d();
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final String e() {
        return this.f7617m.f();
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final void f0(Bundle bundle) {
        this.f7617m.r(bundle);
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final String g() {
        return this.f7617m.i();
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final void g4(l4.a aVar, String str, String str2) {
        this.f7617m.s(aVar != null ? (Activity) l4.b.L0(aVar) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final String h() {
        return this.f7617m.h();
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final Bundle h0(Bundle bundle) {
        return this.f7617m.p(bundle);
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final String i() {
        return this.f7617m.j();
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final void j0(Bundle bundle) {
        this.f7617m.q(bundle);
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final Map r4(String str, String str2, boolean z10) {
        return this.f7617m.m(str, str2, z10);
    }

    @Override // com.google.android.gms.internal.ads.gm0
    public final int x(String str) {
        return this.f7617m.l(str);
    }
}
