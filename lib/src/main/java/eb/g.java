package eb;

/* loaded from: classes2.dex */
public final class g {
    public int a() {
        return 5;
    }

    public int b(byte[] bArr) {
        return c(bArr, 0);
    }

    public int c(byte[] bArr, int i10) {
        return (bArr[i10 + 4] & 255) + ((bArr[i10 + 3] & 255) << 8) + ((bArr[i10 + 2] & 255) << 16) + (bArr[i10 + 1] << 24);
    }

    public boolean d(byte b10) {
        return b10 == -3;
    }

    public byte[] e(int i10) {
        return new byte[]{-3, (byte) ((i10 >>> 24) & 255), (byte) ((i10 >>> 16) & 255), (byte) ((i10 >>> 8) & 255), (byte) (i10 & 255)};
    }
}
