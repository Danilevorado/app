package eb;

/* loaded from: classes2.dex */
public final class k {
    public String a(byte[] bArr) {
        return b(bArr, 0, bArr.length - 1);
    }

    public String b(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10 + 1, i11);
    }

    public boolean c(byte b10) {
        return b10 == -2;
    }

    public byte[] d(String str) {
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[bytes.length + 1];
        bArr[0] = -2;
        System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        return bArr;
    }
}
