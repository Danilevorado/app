package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class j0 extends n0 {

    /* renamed from: r, reason: collision with root package name */
    private final int f19557r;

    j0(byte[] bArr, int i10, int i11) {
        super(bArr);
        q0.q(0, i11, bArr.length);
        this.f19557r = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.n0, com.google.android.gms.internal.play_billing.q0
    public final byte e(int i10) {
        int i11 = this.f19557r;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f19607q[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.play_billing.n0, com.google.android.gms.internal.play_billing.q0
    final byte f(int i10) {
        return this.f19607q[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.n0, com.google.android.gms.internal.play_billing.q0
    public final int h() {
        return this.f19557r;
    }

    @Override // com.google.android.gms.internal.play_billing.n0
    protected final int v() {
        return 0;
    }
}
