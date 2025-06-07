package s6;

/* loaded from: classes.dex */
public final class i extends g {

    /* renamed from: e, reason: collision with root package name */
    private a f27065e;

    public i(r6.g gVar) {
        super(gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008e A[PHI: r4
  0x008e: PHI (r4v5 int) = (r4v4 int), (r4v8 int), (r4v8 int) binds: [B:32:0x006c, B:34:0x0070, B:35:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int[][] e(byte[] r17, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 162
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.i.e(byte[], int, int, int, int):int[][]");
    }

    private static void f(byte[] bArr, int i10, int i11, int i12, int i13, int[][] iArr, a aVar) {
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = i14 << 3;
            int i16 = i13 - 8;
            if (i15 > i16) {
                i15 = i16;
            }
            for (int i17 = 0; i17 < i10; i17++) {
                int i18 = i17 << 3;
                int i19 = i12 - 8;
                if (i18 <= i19) {
                    i19 = i18;
                }
                int iG = g(i17, 2, i10 - 3);
                int iG2 = g(i14, 2, i11 - 3);
                int i20 = 0;
                for (int i21 = -2; i21 <= 2; i21++) {
                    int[] iArr2 = iArr[iG2 + i21];
                    i20 += iArr2[iG - 2] + iArr2[iG - 1] + iArr2[iG] + iArr2[iG + 1] + iArr2[iG + 2];
                }
                h(bArr, i19, i15, i20 / 25, i12, aVar);
            }
        }
    }

    private static int g(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    private static void h(byte[] bArr, int i10, int i11, int i12, int i13, a aVar) {
        int i14 = (i11 * i13) + i10;
        int i15 = 0;
        while (i15 < 8) {
            for (int i16 = 0; i16 < 8; i16++) {
                if ((bArr[i14 + i16] & 255) <= i12) {
                    aVar.k(i10 + i16, i11 + i15);
                }
            }
            i15++;
            i14 += i13;
        }
    }

    @Override // s6.g, r6.b
    public a a() throws r6.h {
        a aVarA;
        a aVar = this.f27065e;
        if (aVar != null) {
            return aVar;
        }
        r6.g gVarB = b();
        int iD = gVarB.d();
        int iA = gVarB.a();
        if (iD < 40 || iA < 40) {
            aVarA = super.a();
        } else {
            byte[] bArrB = gVarB.b();
            int i10 = iD >> 3;
            if ((iD & 7) != 0) {
                i10++;
            }
            int i11 = i10;
            int i12 = iA >> 3;
            if ((iA & 7) != 0) {
                i12++;
            }
            int i13 = i12;
            int[][] iArrE = e(bArrB, i11, i13, iD, iA);
            aVarA = new a(iD, iA);
            f(bArrB, i11, i13, iD, iA, iArrE, aVarA);
        }
        this.f27065e = aVarA;
        return this.f27065e;
    }
}
