package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class la {

    /* renamed from: a, reason: collision with root package name */
    private final int f11418a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11419b;

    /* renamed from: c, reason: collision with root package name */
    private float f11420c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private long f11421d;

    public la(int i10, int i11) {
        this.f11418a = i10;
        this.f11419b = i11;
    }

    public final la a(float f5) {
        this.f11420c = f5;
        return this;
    }

    public final la b(long j10) {
        this.f11421d = j10;
        return this;
    }

    public final nc c() {
        return new nc(this.f11418a, this.f11419b, this.f11420c, this.f11421d, 0L, null);
    }
}
