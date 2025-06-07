package s6;

/* loaded from: classes.dex */
public class g extends r6.b {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f27061d = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    private byte[] f27062b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f27063c;

    public g(r6.g gVar) {
        super(gVar);
        this.f27062b = f27061d;
        this.f27063c = new int[32];
    }

    private static int c(int[] iArr) throws r6.h {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (iArr[i13] > i10) {
                i10 = iArr[i13];
                i12 = i13;
            }
            if (iArr[i13] > i11) {
                i11 = iArr[i13];
            }
        }
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            int i17 = i16 - i12;
            int i18 = iArr[i16] * i17 * i17;
            if (i18 > i15) {
                i14 = i16;
                i15 = i18;
            }
        }
        if (i12 <= i14) {
            int i19 = i12;
            i12 = i14;
            i14 = i19;
        }
        if (i12 - i14 <= length / 16) {
            throw r6.h.a();
        }
        int i20 = i12 - 1;
        int i21 = -1;
        int i22 = i20;
        while (i20 > i14) {
            int i23 = i20 - i14;
            int i24 = i23 * i23 * (i12 - i20) * (i11 - iArr[i20]);
            if (i24 > i21) {
                i22 = i20;
                i21 = i24;
            }
            i20--;
        }
        return i22 << 3;
    }

    private void d(int i10) {
        if (this.f27062b.length < i10) {
            this.f27062b = new byte[i10];
        }
        for (int i11 = 0; i11 < 32; i11++) {
            this.f27063c[i11] = 0;
        }
    }

    @Override // r6.b
    public a a() throws r6.h {
        r6.g gVarB = b();
        int iD = gVarB.d();
        int iA = gVarB.a();
        a aVar = new a(iD, iA);
        d(iD);
        int[] iArr = this.f27063c;
        for (int i10 = 1; i10 < 5; i10++) {
            byte[] bArrC = gVarB.c((iA * i10) / 5, this.f27062b);
            int i11 = (iD << 2) / 5;
            for (int i12 = iD / 5; i12 < i11; i12++) {
                int i13 = (bArrC[i12] & 255) >> 3;
                iArr[i13] = iArr[i13] + 1;
            }
        }
        int iC = c(iArr);
        byte[] bArrB = gVarB.b();
        for (int i14 = 0; i14 < iA; i14++) {
            int i15 = i14 * iD;
            for (int i16 = 0; i16 < iD; i16++) {
                if ((bArrB[i15 + i16] & 255) < iC) {
                    aVar.k(i16, i14);
                }
            }
        }
        return aVar;
    }
}
