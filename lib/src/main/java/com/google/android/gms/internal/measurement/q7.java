package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class q7 extends u7 {

    /* renamed from: r, reason: collision with root package name */
    private final int f19221r;

    q7(byte[] bArr, int i10, int i11) {
        super(bArr);
        x7.q(0, i11, bArr.length);
        this.f19221r = i11;
    }

    @Override // com.google.android.gms.internal.measurement.u7, com.google.android.gms.internal.measurement.x7
    public final byte e(int i10) {
        int i11 = this.f19221r;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f19355q[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.measurement.u7, com.google.android.gms.internal.measurement.x7
    final byte f(int i10) {
        return this.f19355q[i10];
    }

    @Override // com.google.android.gms.internal.measurement.u7, com.google.android.gms.internal.measurement.x7
    public final int h() {
        return this.f19221r;
    }

    @Override // com.google.android.gms.internal.measurement.u7
    protected final int x() {
        return 0;
    }
}
