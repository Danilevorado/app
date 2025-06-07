package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class y8 {

    /* renamed from: a, reason: collision with root package name */
    private final i4.e f20592a;

    /* renamed from: b, reason: collision with root package name */
    private long f20593b;

    public y8(i4.e eVar) {
        e4.p.l(eVar);
        this.f20592a = eVar;
    }

    public final void a() {
        this.f20593b = 0L;
    }

    public final void b() {
        this.f20593b = this.f20592a.b();
    }

    public final boolean c(long j10) {
        return this.f20593b == 0 || this.f20592a.b() - this.f20593b >= 3600000;
    }
}
