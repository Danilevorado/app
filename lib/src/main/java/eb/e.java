package eb;

/* loaded from: classes2.dex */
public final class e {
    public double a(byte[] bArr) {
        return b(bArr, 0);
    }

    public double b(byte[] bArr, int i10) {
        return Double.longBitsToDouble((bArr[i10 + 8] & 255) + ((bArr[i10 + 7] & 255) << 8) + ((bArr[i10 + 6] & 255) << 16) + ((bArr[i10 + 5] & 255) << 24) + ((bArr[i10 + 4] & 255) << 32) + ((bArr[i10 + 3] & 255) << 40) + ((bArr[i10 + 2] & 255) << 48) + (bArr[i10 + 1] << 56));
    }

    public boolean c(byte b10) {
        return b10 == -5;
    }
}
