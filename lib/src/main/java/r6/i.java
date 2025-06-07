package r6;

/* loaded from: classes.dex */
public final class i extends g {

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f26621c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26622d;

    /* renamed from: e, reason: collision with root package name */
    private final int f26623e;

    /* renamed from: f, reason: collision with root package name */
    private final int f26624f;

    /* renamed from: g, reason: collision with root package name */
    private final int f26625g;

    public i(byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
        super(i14, i15);
        if (i12 + i14 > i10 || i13 + i15 > i11) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f26621c = bArr;
        this.f26622d = i10;
        this.f26623e = i11;
        this.f26624f = i12;
        this.f26625g = i13;
        if (z10) {
            e(i14, i15);
        }
    }

    private void e(int i10, int i11) {
        byte[] bArr = this.f26621c;
        int i12 = (this.f26625g * this.f26622d) + this.f26624f;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = (i10 / 2) + i12;
            int i15 = (i12 + i10) - 1;
            int i16 = i12;
            while (i16 < i14) {
                byte b10 = bArr[i16];
                bArr[i16] = bArr[i15];
                bArr[i15] = b10;
                i16++;
                i15--;
            }
            i13++;
            i12 += this.f26622d;
        }
    }

    @Override // r6.g
    public byte[] b() {
        int iD = d();
        int iA = a();
        int i10 = this.f26622d;
        if (iD == i10 && iA == this.f26623e) {
            return this.f26621c;
        }
        int i11 = iD * iA;
        byte[] bArr = new byte[i11];
        int i12 = (this.f26625g * i10) + this.f26624f;
        if (iD == i10) {
            System.arraycopy(this.f26621c, i12, bArr, 0, i11);
            return bArr;
        }
        for (int i13 = 0; i13 < iA; i13++) {
            System.arraycopy(this.f26621c, i12, bArr, i13 * iD, iD);
            i12 += this.f26622d;
        }
        return bArr;
    }

    @Override // r6.g
    public byte[] c(int i10, byte[] bArr) {
        if (i10 < 0 || i10 >= a()) {
            throw new IllegalArgumentException("Requested row is outside the image: " + i10);
        }
        int iD = d();
        if (bArr == null || bArr.length < iD) {
            bArr = new byte[iD];
        }
        System.arraycopy(this.f26621c, ((i10 + this.f26625g) * this.f26622d) + this.f26624f, bArr, 0, iD);
        return bArr;
    }
}
