package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f15616a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    private boolean f15617b;

    /* renamed from: c, reason: collision with root package name */
    private int f15618c;

    /* renamed from: d, reason: collision with root package name */
    private long f15619d;

    /* renamed from: e, reason: collision with root package name */
    private int f15620e;

    /* renamed from: f, reason: collision with root package name */
    private int f15621f;

    /* renamed from: g, reason: collision with root package name */
    private int f15622g;

    public final void a(s0 s0Var, r0 r0Var) {
        if (this.f15618c > 0) {
            s0Var.e(this.f15619d, this.f15620e, this.f15621f, this.f15622g, r0Var);
            this.f15618c = 0;
        }
    }

    public final void b() {
        this.f15617b = false;
        this.f15618c = 0;
    }

    public final void c(s0 s0Var, long j10, int i10, int i11, int i12, r0 r0Var) {
        if (this.f15622g > i11 + i12) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f15617b) {
            int i13 = this.f15618c;
            int i14 = i13 + 1;
            this.f15618c = i14;
            if (i13 == 0) {
                this.f15619d = j10;
                this.f15620e = i10;
                this.f15621f = 0;
            }
            this.f15621f += i11;
            this.f15622g = i12;
            if (i14 >= 16) {
                a(s0Var, r0Var);
            }
        }
    }

    public final void d(l lVar) {
        if (this.f15617b) {
            return;
        }
        lVar.B(this.f15616a, 0, 10);
        lVar.j();
        byte[] bArr = this.f15616a;
        int i10 = mn4.f12215g;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f15617b = true;
        }
    }
}
