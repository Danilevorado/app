package eb;

/* loaded from: classes2.dex */
public final class d {
    public char a(byte[] bArr) {
        return b(bArr, 0);
    }

    public char b(byte[] bArr, int i10) {
        return (char) ((bArr[i10 + 1] << 8) + (bArr[i10 + 2] & 255));
    }

    public boolean c(byte b10) {
        return b10 == -10;
    }
}
