package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vn4 {

    /* renamed from: d, reason: collision with root package name */
    public static final vn4 f16820d = new vn4(-3, -9223372036854775807L, -1);

    /* renamed from: a, reason: collision with root package name */
    private final int f16821a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16822b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16823c;

    private vn4(int i10, long j10, long j11) {
        this.f16821a = i10;
        this.f16822b = j10;
        this.f16823c = j11;
    }

    public static vn4 d(long j10, long j11) {
        return new vn4(-1, j10, j11);
    }

    public static vn4 e(long j10) {
        return new vn4(0, -9223372036854775807L, j10);
    }

    public static vn4 f(long j10, long j11) {
        return new vn4(-2, j10, j11);
    }
}
