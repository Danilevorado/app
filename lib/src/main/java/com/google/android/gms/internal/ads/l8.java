package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class l8 implements y8 {

    /* renamed from: a, reason: collision with root package name */
    private final k8 f11363a;

    /* renamed from: b, reason: collision with root package name */
    private final jm2 f11364b = new jm2(32);

    /* renamed from: c, reason: collision with root package name */
    private int f11365c;

    /* renamed from: d, reason: collision with root package name */
    private int f11366d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f11367e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11368f;

    public l8(k8 k8Var) {
        this.f11363a = k8Var;
    }

    @Override // com.google.android.gms.internal.ads.y8
    public final void a(jm2 jm2Var, int i10) {
        int i11 = i10 & 1;
        int iK = i11 != 0 ? jm2Var.k() + jm2Var.s() : -1;
        if (this.f11368f) {
            if (i11 == 0) {
                return;
            }
            this.f11368f = false;
            jm2Var.f(iK);
            this.f11366d = 0;
        }
        while (jm2Var.i() > 0) {
            int i12 = this.f11366d;
            if (i12 < 3) {
                if (i12 == 0) {
                    int iS = jm2Var.s();
                    jm2Var.f(jm2Var.k() - 1);
                    if (iS == 255) {
                        this.f11368f = true;
                        return;
                    }
                }
                int iMin = Math.min(jm2Var.i(), 3 - this.f11366d);
                jm2Var.b(this.f11364b.h(), this.f11366d, iMin);
                int i13 = this.f11366d + iMin;
                this.f11366d = i13;
                if (i13 == 3) {
                    this.f11364b.f(0);
                    this.f11364b.e(3);
                    this.f11364b.g(1);
                    int iS2 = this.f11364b.s();
                    int iS3 = this.f11364b.s();
                    this.f11367e = (iS2 & 128) != 0;
                    this.f11365c = (((iS2 & 15) << 8) | iS3) + 3;
                    int iJ = this.f11364b.j();
                    int i14 = this.f11365c;
                    if (iJ < i14) {
                        int iJ2 = this.f11364b.j();
                        this.f11364b.H(Math.min(4098, Math.max(i14, iJ2 + iJ2)));
                    }
                }
            } else {
                int iMin2 = Math.min(jm2Var.i(), this.f11365c - i12);
                jm2Var.b(this.f11364b.h(), this.f11366d, iMin2);
                int i15 = this.f11366d + iMin2;
                this.f11366d = i15;
                int i16 = this.f11365c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.f11367e) {
                        this.f11364b.e(i16);
                    } else {
                        if (sv2.l(this.f11364b.h(), 0, i16, -1) != 0) {
                            this.f11368f = true;
                            return;
                        }
                        this.f11364b.e(this.f11365c - 4);
                    }
                    this.f11364b.f(0);
                    this.f11363a.a(this.f11364b);
                    this.f11366d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.y8
    public final void b(rt2 rt2Var, n nVar, x8 x8Var) {
        this.f11363a.b(rt2Var, nVar, x8Var);
        this.f11368f = true;
    }

    @Override // com.google.android.gms.internal.ads.y8
    public final void d() {
        this.f11368f = true;
    }
}
