package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class b6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6346a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6347b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6348c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6349d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6350e;

    /* renamed from: f, reason: collision with root package name */
    public final k9 f6351f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6352g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f6353h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f6354i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6355j;

    /* renamed from: k, reason: collision with root package name */
    private final c6[] f6356k;

    public b6(int i10, int i11, long j10, long j11, long j12, k9 k9Var, int i12, c6[] c6VarArr, int i13, long[] jArr, long[] jArr2) {
        this.f6346a = i10;
        this.f6347b = i11;
        this.f6348c = j10;
        this.f6349d = j11;
        this.f6350e = j12;
        this.f6351f = k9Var;
        this.f6352g = i12;
        this.f6356k = c6VarArr;
        this.f6355j = i13;
        this.f6353h = jArr;
        this.f6354i = jArr2;
    }

    public final c6 a(int i10) {
        c6[] c6VarArr = this.f6356k;
        if (c6VarArr == null) {
            return null;
        }
        return c6VarArr[i10];
    }
}
