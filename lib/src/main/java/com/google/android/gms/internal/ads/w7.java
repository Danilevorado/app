package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class w7 implements k7 {

    /* renamed from: b, reason: collision with root package name */
    private s0 f17005b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17006c;

    /* renamed from: e, reason: collision with root package name */
    private int f17008e;

    /* renamed from: f, reason: collision with root package name */
    private int f17009f;

    /* renamed from: a, reason: collision with root package name */
    private final jm2 f17004a = new jm2(10);

    /* renamed from: d, reason: collision with root package name */
    private long f17007d = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.k7
    public final void a(jm2 jm2Var) {
        gt1.b(this.f17005b);
        if (this.f17006c) {
            int i10 = jm2Var.i();
            int i11 = this.f17009f;
            if (i11 < 10) {
                int iMin = Math.min(i10, 10 - i11);
                System.arraycopy(jm2Var.h(), jm2Var.k(), this.f17004a.h(), this.f17009f, iMin);
                if (this.f17009f + iMin == 10) {
                    this.f17004a.f(0);
                    if (this.f17004a.s() != 73 || this.f17004a.s() != 68 || this.f17004a.s() != 51) {
                        ad2.e("Id3Reader", "Discarding invalid ID3 tag");
                        this.f17006c = false;
                        return;
                    } else {
                        this.f17004a.g(3);
                        this.f17008e = this.f17004a.r() + 10;
                    }
                }
            }
            int iMin2 = Math.min(i10, this.f17008e - this.f17009f);
            this.f17005b.a(jm2Var, iMin2);
            this.f17009f += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void b(n nVar, x8 x8Var) {
        x8Var.c();
        s0 s0VarS = nVar.S(x8Var.a(), 5);
        this.f17005b = s0VarS;
        i7 i7Var = new i7();
        i7Var.h(x8Var.b());
        i7Var.s("application/id3");
        s0VarS.b(i7Var.y());
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void c() {
        this.f17006c = false;
        this.f17007d = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void d() {
        int i10;
        gt1.b(this.f17005b);
        if (this.f17006c && (i10 = this.f17008e) != 0 && this.f17009f == i10) {
            long j10 = this.f17007d;
            if (j10 != -9223372036854775807L) {
                this.f17005b.e(j10, 1, i10, 0, null);
            }
            this.f17006c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void e(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f17006c = true;
        if (j10 != -9223372036854775807L) {
            this.f17007d = j10;
        }
        this.f17008e = 0;
        this.f17009f = 0;
    }
}
