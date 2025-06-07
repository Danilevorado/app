package eb;

/* loaded from: classes2.dex */
public final class j {
    public short a(byte[] bArr) {
        return b(bArr, 0);
    }

    public short b(byte[] bArr, int i10) {
        return (short) ((bArr[i10 + 1] << 8) + (bArr[i10 + 2] & 255));
    }

    public boolean c(byte b10) {
        return b10 == -9;
    }
}
