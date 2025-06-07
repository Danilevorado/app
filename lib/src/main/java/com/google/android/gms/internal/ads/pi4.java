package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class pi4 implements bl4 {

    /* renamed from: a, reason: collision with root package name */
    public long f13904a;

    /* renamed from: b, reason: collision with root package name */
    public long f13905b;

    /* renamed from: c, reason: collision with root package name */
    public zk4 f13906c;

    /* renamed from: d, reason: collision with root package name */
    public pi4 f13907d;

    public pi4(long j10, int i10) {
        c(j10, 65536);
    }

    public final int a(long j10) {
        long j11 = j10 - this.f13904a;
        int i10 = this.f13906c.f18621b;
        return (int) j11;
    }

    public final pi4 b() {
        this.f13906c = null;
        pi4 pi4Var = this.f13907d;
        this.f13907d = null;
        return pi4Var;
    }

    public final void c(long j10, int i10) {
        gt1.f(this.f13906c == null);
        this.f13904a = j10;
        this.f13905b = j10 + 65536;
    }

    @Override // com.google.android.gms.internal.ads.bl4
    public final zk4 d() {
        zk4 zk4Var = this.f13906c;
        Objects.requireNonNull(zk4Var);
        return zk4Var;
    }

    @Override // com.google.android.gms.internal.ads.bl4
    public final bl4 f() {
        pi4 pi4Var = this.f13907d;
        if (pi4Var == null || pi4Var.f13906c == null) {
            return null;
        }
        return pi4Var;
    }
}
