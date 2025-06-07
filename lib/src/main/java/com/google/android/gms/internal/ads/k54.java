package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class k54 implements v74 {

    /* renamed from: a, reason: collision with root package name */
    private final hl4 f10833a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10834b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10835c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10836d;

    /* renamed from: e, reason: collision with root package name */
    private final long f10837e;

    /* renamed from: f, reason: collision with root package name */
    private final long f10838f;

    /* renamed from: g, reason: collision with root package name */
    private int f10839g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10840h;

    public k54() {
        hl4 hl4Var = new hl4(true, 65536);
        j(2500, 0, "bufferForPlaybackMs", "0");
        j(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        j(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j(50000, 50000, "maxBufferMs", "minBufferMs");
        j(0, 0, "backBufferDurationMs", "0");
        this.f10833a = hl4Var;
        this.f10834b = sv2.w(50000L);
        this.f10835c = sv2.w(50000L);
        this.f10836d = sv2.w(2500L);
        this.f10837e = sv2.w(5000L);
        this.f10839g = 13107200;
        this.f10838f = sv2.w(0L);
    }

    private static void j(int i10, int i11, String str, String str2) {
        gt1.e(i10 >= i11, str + " cannot be less than " + str2);
    }

    private final void k(boolean z10) {
        this.f10839g = 13107200;
        this.f10840h = false;
        if (z10) {
            this.f10833a.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.v74
    public final long a() {
        return this.f10838f;
    }

    @Override // com.google.android.gms.internal.ads.v74
    public final void b() {
        k(false);
    }

    @Override // com.google.android.gms.internal.ads.v74
    public final void c(t84[] t84VarArr, fj4 fj4Var, rk4[] rk4VarArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = t84VarArr.length;
            if (i10 >= 2) {
                int iMax = Math.max(13107200, i11);
                this.f10839g = iMax;
                this.f10833a.f(iMax);
                return;
            } else {
                if (rk4VarArr[i10] != null) {
                    i11 += t84VarArr[i10].b() != 1 ? 131072000 : 13107200;
                }
                i10++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.v74
    public final void d() {
        k(true);
    }

    @Override // com.google.android.gms.internal.ads.v74
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.v74
    public final void f() {
        k(true);
    }

    @Override // com.google.android.gms.internal.ads.v74
    public final boolean g(long j10, float f5, boolean z10, long j11) {
        long jV = sv2.v(j10, f5);
        long jMin = z10 ? this.f10837e : this.f10836d;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(j11 / 2, jMin);
        }
        return jMin <= 0 || jV >= jMin || this.f10833a.a() >= this.f10839g;
    }

    @Override // com.google.android.gms.internal.ads.v74
    public final boolean h(long j10, long j11, float f5) {
        int iA = this.f10833a.a();
        int i10 = this.f10839g;
        long jMin = this.f10834b;
        if (f5 > 1.0f) {
            jMin = Math.min(sv2.u(jMin, f5), this.f10835c);
        }
        if (j11 < Math.max(jMin, 500000L)) {
            boolean z10 = iA < i10;
            this.f10840h = z10;
            if (!z10 && j11 < 500000) {
                ad2.e("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f10835c || iA >= i10) {
            this.f10840h = false;
        }
        return this.f10840h;
    }

    @Override // com.google.android.gms.internal.ads.v74
    public final hl4 i() {
        return this.f10833a;
    }
}
