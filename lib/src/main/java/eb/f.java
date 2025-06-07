package eb;

/* loaded from: classes2.dex */
public final class f {
    public float a(byte[] bArr) {
        return b(bArr, 0);
    }

    public float b(byte[] bArr, int i10) {
        return Float.intBitsToFloat((bArr[i10 + 4] & 255) + ((bArr[i10 + 3] & 255) << 8) + ((bArr[i10 + 2] & 255) << 16) + (bArr[i10 + 1] << 24));
    }

    public boolean c(byte b10) {
        return b10 == -6;
    }

    public byte[] d(float f5) {
        int iFloatToIntBits = Float.floatToIntBits(f5);
        return new byte[]{-6, (byte) (iFloatToIntBits >>> 24), (byte) (iFloatToIntBits >>> 16), (byte) (iFloatToIntBits >>> 8), (byte) iFloatToIntBits};
    }
}
