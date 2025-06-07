package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
class u7 extends s7 {

    /* renamed from: q, reason: collision with root package name */
    protected final byte[] f19355q;

    u7(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f19355q = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.x7
    public byte e(int i10) {
        return this.f19355q[i10];
    }

    @Override // com.google.android.gms.internal.measurement.x7
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x7) || h() != ((x7) obj).h()) {
            return false;
        }
        if (h() == 0) {
            return true;
        }
        if (!(obj instanceof u7)) {
            return obj.equals(this);
        }
        u7 u7Var = (u7) obj;
        int iS = s();
        int iS2 = u7Var.s();
        if (iS != 0 && iS2 != 0 && iS != iS2) {
            return false;
        }
        int iH = h();
        if (iH > u7Var.h()) {
            throw new IllegalArgumentException("Length too large: " + iH + h());
        }
        if (iH > u7Var.h()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iH + ", " + u7Var.h());
        }
        byte[] bArr = this.f19355q;
        byte[] bArr2 = u7Var.f19355q;
        u7Var.x();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iH) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.x7
    byte f(int i10) {
        return this.f19355q[i10];
    }

    @Override // com.google.android.gms.internal.measurement.x7
    public int h() {
        return this.f19355q.length;
    }

    @Override // com.google.android.gms.internal.measurement.x7
    protected final int k(int i10, int i11, int i12) {
        return b9.d(i10, this.f19355q, 0, i12);
    }

    @Override // com.google.android.gms.internal.measurement.x7
    public final x7 l(int i10, int i11) {
        int iQ = x7.q(0, i11, h());
        return iQ == 0 ? x7.f19398n : new q7(this.f19355q, 0, iQ);
    }

    @Override // com.google.android.gms.internal.measurement.x7
    protected final String n(Charset charset) {
        return new String(this.f19355q, 0, h(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.x7
    final void o(m7 m7Var) {
        ((c8) m7Var).D(this.f19355q, 0, h());
    }

    @Override // com.google.android.gms.internal.measurement.x7
    public final boolean p() {
        return fb.f(this.f19355q, 0, h());
    }

    protected int x() {
        return 0;
    }
}
