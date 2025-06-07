package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ca2 {

    /* renamed from: a, reason: collision with root package name */
    public final ab3 f6857a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6858b;

    /* renamed from: c, reason: collision with root package name */
    private final i4.e f6859c;

    public ca2(ab3 ab3Var, long j10, i4.e eVar) {
        this.f6857a = ab3Var;
        this.f6859c = eVar;
        this.f6858b = eVar.b() + j10;
    }

    public final boolean a() {
        return this.f6858b < this.f6859c.b();
    }
}
