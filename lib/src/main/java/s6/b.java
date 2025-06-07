package s6;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f27034a;

    /* renamed from: b, reason: collision with root package name */
    private int f27035b;

    /* renamed from: c, reason: collision with root package name */
    private int f27036c;

    public b(byte[] bArr) {
        this.f27034a = bArr;
    }

    public int a() {
        return ((this.f27034a.length - this.f27035b) * 8) - this.f27036c;
    }

    public int b(int i10) {
        if (i10 <= 0 || i10 > 32 || i10 > a()) {
            throw new IllegalArgumentException(String.valueOf(i10));
        }
        int i11 = this.f27036c;
        int i12 = 0;
        if (i11 > 0) {
            int i13 = 8 - i11;
            int i14 = i10 < i13 ? i10 : i13;
            int i15 = i13 - i14;
            byte[] bArr = this.f27034a;
            int i16 = this.f27035b;
            int i17 = (((255 >> (8 - i14)) << i15) & bArr[i16]) >> i15;
            i10 -= i14;
            int i18 = i11 + i14;
            this.f27036c = i18;
            if (i18 == 8) {
                this.f27036c = 0;
                this.f27035b = i16 + 1;
            }
            i12 = i17;
        }
        if (i10 <= 0) {
            return i12;
        }
        while (i10 >= 8) {
            int i19 = i12 << 8;
            byte[] bArr2 = this.f27034a;
            int i20 = this.f27035b;
            i12 = (bArr2[i20] & 255) | i19;
            this.f27035b = i20 + 1;
            i10 -= 8;
        }
        if (i10 <= 0) {
            return i12;
        }
        int i21 = 8 - i10;
        int i22 = (i12 << i10) | ((((255 >> i21) << i21) & this.f27034a[this.f27035b]) >> i21);
        this.f27036c += i10;
        return i22;
    }
}
