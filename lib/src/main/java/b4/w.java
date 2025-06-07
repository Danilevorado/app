package b4;

import java.util.Arrays;

/* loaded from: classes.dex */
final class w extends v {

    /* renamed from: n, reason: collision with root package name */
    private final byte[] f4447n;

    w(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f4447n = bArr;
    }

    @Override // b4.v
    final byte[] p1() {
        return this.f4447n;
    }
}
