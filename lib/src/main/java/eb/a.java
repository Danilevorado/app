package eb;

/* loaded from: classes2.dex */
public final class a {
    public boolean a(byte b10) {
        return b10 == -7;
    }

    public boolean b(byte[] bArr) {
        return c(bArr, 0);
    }

    public boolean c(byte[] bArr, int i10) {
        return bArr[i10 + 1] != 0;
    }

    public byte[] d(boolean z10) {
        return new byte[]{-7, z10 ? (byte) 1 : (byte) 0};
    }
}
