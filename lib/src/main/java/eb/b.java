package eb;

/* loaded from: classes2.dex */
public final class b {
    public boolean a(byte b10) {
        return b10 == -12;
    }

    public byte[] b(byte[] bArr) {
        return c(bArr, 0, bArr.length - 1);
    }

    public byte[] c(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10 + 1, bArr2, 0, i11);
        return bArr2;
    }
}
