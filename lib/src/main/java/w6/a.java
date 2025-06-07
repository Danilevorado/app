package w6;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final s6.a f27945a;

    /* renamed from: b, reason: collision with root package name */
    private j f27946b;

    /* renamed from: c, reason: collision with root package name */
    private g f27947c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27948d;

    a(s6.a aVar) throws r6.f {
        int iG = aVar.g();
        if (iG < 21 || (iG & 3) != 1) {
            throw r6.f.a();
        }
        this.f27945a = aVar;
    }

    private int a(int i10, int i11, int i12) {
        return this.f27948d ? this.f27945a.d(i11, i10) : this.f27945a.d(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    void b() {
        int i10 = 0;
        while (i10 < this.f27945a.j()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f27945a.g(); i12++) {
                if (this.f27945a.d(i10, i12) != this.f27945a.d(i12, i10)) {
                    this.f27945a.c(i12, i10);
                    this.f27945a.c(i10, i12);
                }
            }
            i10 = i11;
        }
    }

    byte[] c() throws r6.f {
        g gVarD = d();
        j jVarE = e();
        c cVar = c.values()[gVarD.c()];
        int iG = this.f27945a.g();
        cVar.d(this.f27945a, iG);
        s6.a aVarA = jVarE.a();
        byte[] bArr = new byte[jVarE.h()];
        int i10 = iG - 1;
        boolean z10 = true;
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 > 0) {
            if (i11 == 6) {
                i11--;
            }
            for (int i15 = 0; i15 < iG; i15++) {
                int i16 = z10 ? i10 - i15 : i15;
                for (int i17 = 0; i17 < 2; i17++) {
                    int i18 = i11 - i17;
                    if (!aVarA.d(i18, i16)) {
                        i13++;
                        i14 <<= 1;
                        if (this.f27945a.d(i18, i16)) {
                            i14 |= 1;
                        }
                        if (i13 == 8) {
                            bArr[i12] = (byte) i14;
                            i12++;
                            i13 = 0;
                            i14 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i11 -= 2;
        }
        if (i12 == jVarE.h()) {
            return bArr;
        }
        throw r6.f.a();
    }

    g d() throws r6.f {
        g gVar = this.f27947c;
        if (gVar != null) {
            return gVar;
        }
        int iA = 0;
        int iA2 = 0;
        for (int i10 = 0; i10 < 6; i10++) {
            iA2 = a(i10, 8, iA2);
        }
        int iA3 = a(8, 7, a(8, 8, a(7, 8, iA2)));
        for (int i11 = 5; i11 >= 0; i11--) {
            iA3 = a(8, i11, iA3);
        }
        int iG = this.f27945a.g();
        int i12 = iG - 7;
        for (int i13 = iG - 1; i13 >= i12; i13--) {
            iA = a(8, i13, iA);
        }
        for (int i14 = iG - 8; i14 < iG; i14++) {
            iA = a(i14, 8, iA);
        }
        g gVarA = g.a(iA3, iA);
        this.f27947c = gVarA;
        if (gVarA != null) {
            return gVarA;
        }
        throw r6.f.a();
    }

    j e() throws r6.f {
        j jVar = this.f27946b;
        if (jVar != null) {
            return jVar;
        }
        int iG = this.f27945a.g();
        int i10 = (iG - 17) / 4;
        if (i10 <= 6) {
            return j.i(i10);
        }
        int i11 = iG - 11;
        int iA = 0;
        int iA2 = 0;
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = iG - 9; i13 >= i11; i13--) {
                iA2 = a(i13, i12, iA2);
            }
        }
        j jVarC = j.c(iA2);
        if (jVarC != null && jVarC.e() == iG) {
            this.f27946b = jVarC;
            return jVarC;
        }
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = iG - 9; i15 >= i11; i15--) {
                iA = a(i14, i15, iA);
            }
        }
        j jVarC2 = j.c(iA);
        if (jVarC2 == null || jVarC2.e() != iG) {
            throw r6.f.a();
        }
        this.f27946b = jVarC2;
        return jVarC2;
    }

    void f() {
        if (this.f27947c == null) {
            return;
        }
        c.values()[this.f27947c.c()].d(this.f27945a, this.f27945a.g());
    }

    void g(boolean z10) {
        this.f27946b = null;
        this.f27947c = null;
        this.f27948d = z10;
    }
}
