package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
class n0 extends m0 {

    /* renamed from: q, reason: collision with root package name */
    protected final byte[] f19607q;

    n0(byte[] bArr) {
        super(null);
        Objects.requireNonNull(bArr);
        this.f19607q = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.q0
    public byte e(int i10) {
        return this.f19607q[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.q0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0) || h() != ((q0) obj).h()) {
            return false;
        }
        if (h() == 0) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return obj.equals(this);
        }
        n0 n0Var = (n0) obj;
        int iS = s();
        int iS2 = n0Var.s();
        if (iS != 0 && iS2 != 0 && iS != iS2) {
            return false;
        }
        int iH = h();
        if (iH > n0Var.h()) {
            throw new IllegalArgumentException("Length too large: " + iH + h());
        }
        if (iH > n0Var.h()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iH + ", " + n0Var.h());
        }
        byte[] bArr = this.f19607q;
        byte[] bArr2 = n0Var.f19607q;
        n0Var.v();
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

    @Override // com.google.android.gms.internal.play_billing.q0
    byte f(int i10) {
        return this.f19607q[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.q0
    public int h() {
        return this.f19607q.length;
    }

    @Override // com.google.android.gms.internal.play_billing.q0
    protected final int k(int i10, int i11, int i12) {
        return v1.b(i10, this.f19607q, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.q0
    public final q0 l(int i10, int i11) {
        int iQ = q0.q(0, i11, h());
        return iQ == 0 ? q0.f19623n : new j0(this.f19607q, 0, iQ);
    }

    @Override // com.google.android.gms.internal.play_billing.q0
    protected final String n(Charset charset) {
        return new String(this.f19607q, 0, h(), charset);
    }

    @Override // com.google.android.gms.internal.play_billing.q0
    final void o(f0 f0Var) {
        ((v0) f0Var).A(this.f19607q, 0, h());
    }

    @Override // com.google.android.gms.internal.play_billing.q0
    public final boolean p() {
        return k4.e(this.f19607q, 0, h());
    }

    protected int v() {
        return 0;
    }
}
