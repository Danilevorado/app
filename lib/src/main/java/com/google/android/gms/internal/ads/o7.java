package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class o7 {

    /* renamed from: a, reason: collision with root package name */
    private final s0 f13030a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13031b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13032c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13033d;

    /* renamed from: e, reason: collision with root package name */
    private int f13034e;

    /* renamed from: f, reason: collision with root package name */
    private int f13035f;

    /* renamed from: g, reason: collision with root package name */
    private long f13036g;

    /* renamed from: h, reason: collision with root package name */
    private long f13037h;

    public o7(s0 s0Var) {
        this.f13030a = s0Var;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f13032c) {
            int i12 = this.f13035f;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.f13035f = i12 + (i11 - i10);
            } else {
                this.f13033d = ((bArr[i13] & 192) >> 6) == 0;
                this.f13032c = false;
            }
        }
    }

    public final void b(long j10, int i10, boolean z10) {
        if (this.f13034e == 182 && z10 && this.f13031b) {
            long j11 = this.f13037h;
            if (j11 != -9223372036854775807L) {
                long j12 = j10 - this.f13036g;
                this.f13030a.e(j11, this.f13033d ? 1 : 0, (int) j12, i10, null);
            }
        }
        if (this.f13034e != 179) {
            this.f13036g = j10;
        }
    }

    public final void c(int i10, long j10) {
        boolean z10;
        this.f13034e = i10;
        this.f13033d = false;
        if (i10 == 182) {
            z10 = true;
        } else if (i10 == 179) {
            i10 = 179;
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13031b = z10;
        this.f13032c = i10 == 182;
        this.f13035f = 0;
        this.f13037h = j10;
    }

    public final void d() {
        this.f13031b = false;
        this.f13032c = false;
        this.f13033d = false;
        this.f13034e = -1;
    }
}
