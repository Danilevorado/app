package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
class sw3 extends rw3 {

    /* renamed from: q, reason: collision with root package name */
    protected final byte[] f15583q;

    sw3(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f15583q = bArr;
    }

    @Override // com.google.android.gms.internal.ads.ww3
    public final boolean A() {
        int iO = O();
        return y04.j(this.f15583q, iO, n() + iO);
    }

    @Override // com.google.android.gms.internal.ads.rw3
    final boolean N(ww3 ww3Var, int i10, int i11) {
        if (i11 > ww3Var.n()) {
            throw new IllegalArgumentException("Length too large: " + i11 + n());
        }
        int i12 = i10 + i11;
        if (i12 > ww3Var.n()) {
            throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + ww3Var.n());
        }
        if (!(ww3Var instanceof sw3)) {
            return ww3Var.u(i10, i12).equals(u(0, i11));
        }
        sw3 sw3Var = (sw3) ww3Var;
        byte[] bArr = this.f15583q;
        byte[] bArr2 = sw3Var.f15583q;
        int iO = O() + i11;
        int iO2 = O();
        int iO3 = sw3Var.O() + i10;
        while (iO2 < iO) {
            if (bArr[iO2] != bArr2[iO3]) {
                return false;
            }
            iO2++;
            iO3++;
        }
        return true;
    }

    protected int O() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ww3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ww3) || n() != ((ww3) obj).n()) {
            return false;
        }
        if (n() == 0) {
            return true;
        }
        if (!(obj instanceof sw3)) {
            return obj.equals(this);
        }
        sw3 sw3Var = (sw3) obj;
        int iD = D();
        int iD2 = sw3Var.D();
        if (iD == 0 || iD2 == 0 || iD == iD2) {
            return N(sw3Var, 0, n());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ww3
    public byte h(int i10) {
        return this.f15583q[i10];
    }

    @Override // com.google.android.gms.internal.ads.ww3
    byte k(int i10) {
        return this.f15583q[i10];
    }

    @Override // com.google.android.gms.internal.ads.ww3
    public int n() {
        return this.f15583q.length;
    }

    @Override // com.google.android.gms.internal.ads.ww3
    protected void o(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f15583q, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.ww3
    protected final int s(int i10, int i11, int i12) {
        return ly3.b(i10, this.f15583q, O() + i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.ww3
    protected final int t(int i10, int i11, int i12) {
        int iO = O() + i11;
        return y04.f(i10, this.f15583q, iO, i12 + iO);
    }

    @Override // com.google.android.gms.internal.ads.ww3
    public final ww3 u(int i10, int i11) {
        int iB = ww3.B(i10, i11, n());
        return iB == 0 ? ww3.f17284n : new pw3(this.f15583q, O() + i10, iB);
    }

    @Override // com.google.android.gms.internal.ads.ww3
    public final fx3 v() {
        return fx3.h(this.f15583q, O(), n(), true);
    }

    @Override // com.google.android.gms.internal.ads.ww3
    protected final String x(Charset charset) {
        return new String(this.f15583q, O(), n(), charset);
    }

    @Override // com.google.android.gms.internal.ads.ww3
    public final ByteBuffer y() {
        return ByteBuffer.wrap(this.f15583q, O(), n()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.ww3
    final void z(lw3 lw3Var) {
        lw3Var.a(this.f15583q, O(), n());
    }
}
