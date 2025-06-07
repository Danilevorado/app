package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract class u33 extends m23 {

    /* renamed from: o, reason: collision with root package name */
    final CharSequence f16156o;

    /* renamed from: p, reason: collision with root package name */
    final t23 f16157p;

    /* renamed from: q, reason: collision with root package name */
    int f16158q = 0;

    /* renamed from: r, reason: collision with root package name */
    int f16159r = Integer.MAX_VALUE;

    protected u33(w33 w33Var, CharSequence charSequence) {
        this.f16157p = w33Var.f16948a;
        this.f16156o = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.m23
    protected final /* bridge */ /* synthetic */ Object b() {
        int iD;
        int i10 = this.f16158q;
        while (true) {
            int i11 = this.f16158q;
            if (i11 == -1) {
                c();
                return null;
            }
            int iE = e(i11);
            if (iE == -1) {
                iE = this.f16156o.length();
                this.f16158q = -1;
                iD = -1;
            } else {
                iD = d(iE);
                this.f16158q = iD;
            }
            if (iD != i10) {
                if (i10 < iE) {
                    this.f16156o.charAt(i10);
                }
                if (i10 < iE) {
                    this.f16156o.charAt(iE - 1);
                }
                int i12 = this.f16159r;
                if (i12 == 1) {
                    iE = this.f16156o.length();
                    this.f16158q = -1;
                    if (iE > i10) {
                        this.f16156o.charAt(iE - 1);
                    }
                } else {
                    this.f16159r = i12 - 1;
                }
                return this.f16156o.subSequence(i10, iE).toString();
            }
            int i13 = iD + 1;
            this.f16158q = i13;
            if (i13 > this.f16156o.length()) {
                this.f16158q = -1;
            }
        }
    }

    abstract int d(int i10);

    abstract int e(int i10);
}
