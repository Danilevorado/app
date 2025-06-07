package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class u7 {

    /* renamed from: a, reason: collision with root package name */
    private final s0 f16194a;

    /* renamed from: b, reason: collision with root package name */
    private long f16195b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16196c;

    /* renamed from: d, reason: collision with root package name */
    private int f16197d;

    /* renamed from: e, reason: collision with root package name */
    private long f16198e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16199f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16200g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f16201h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f16202i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f16203j;

    /* renamed from: k, reason: collision with root package name */
    private long f16204k;

    /* renamed from: l, reason: collision with root package name */
    private long f16205l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16206m;

    public u7(s0 s0Var) {
        this.f16194a = s0Var;
    }

    private final void e(int i10) {
        long j10 = this.f16205l;
        if (j10 == -9223372036854775807L) {
            return;
        }
        boolean z10 = this.f16206m;
        long j11 = this.f16195b - this.f16204k;
        this.f16194a.e(j10, z10 ? 1 : 0, (int) j11, i10, null);
    }

    public final void a(long j10, int i10, boolean z10) {
        if (this.f16203j && this.f16200g) {
            this.f16206m = this.f16196c;
            this.f16203j = false;
        } else if (this.f16201h || this.f16200g) {
            if (z10 && this.f16202i) {
                e(i10 + ((int) (j10 - this.f16195b)));
            }
            this.f16204k = this.f16195b;
            this.f16205l = this.f16198e;
            this.f16206m = this.f16196c;
            this.f16202i = true;
        }
    }

    public final void b(byte[] bArr, int i10, int i11) {
        if (this.f16199f) {
            int i12 = this.f16197d;
            int i13 = (i10 + 2) - i12;
            if (i13 >= i11) {
                this.f16197d = i12 + (i11 - i10);
            } else {
                this.f16200g = (bArr[i13] & 128) != 0;
                this.f16199f = false;
            }
        }
    }

    public final void c() {
        this.f16199f = false;
        this.f16200g = false;
        this.f16201h = false;
        this.f16202i = false;
        this.f16203j = false;
    }

    public final void d(long j10, int i10, int i11, long j11, boolean z10) {
        this.f16200g = false;
        this.f16201h = false;
        this.f16198e = j11;
        this.f16197d = 0;
        this.f16195b = j10;
        if (i11 >= 32 && i11 != 40) {
            if (this.f16202i && !this.f16203j) {
                if (z10) {
                    e(i10);
                }
                this.f16202i = false;
            }
            if (i11 <= 35 || i11 == 39) {
                this.f16201h = !this.f16203j;
                this.f16203j = true;
            }
        }
        boolean z11 = i11 >= 16 && i11 <= 21;
        this.f16196c = z11;
        this.f16199f = z11 || i11 <= 9;
    }
}
