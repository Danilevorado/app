package u6;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final a f27640a;

    public c(a aVar) {
        this.f27640a = aVar;
    }

    private int[] b(b bVar) throws d {
        int iD = bVar.d();
        int i10 = 0;
        if (iD == 1) {
            return new int[]{bVar.c(1)};
        }
        int[] iArr = new int[iD];
        for (int i11 = 1; i11 < this.f27640a.f() && i10 < iD; i11++) {
            if (bVar.b(i11) == 0) {
                iArr[i10] = this.f27640a.h(i11);
                i10++;
            }
        }
        if (i10 == iD) {
            return iArr;
        }
        throw new d("Error locator degree does not match number of roots");
    }

    private int[] c(b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            int iH = this.f27640a.h(iArr[i10]);
            int iJ = 1;
            for (int i11 = 0; i11 < length; i11++) {
                if (i10 != i11) {
                    int iJ2 = this.f27640a.j(iArr[i11], iH);
                    iJ = this.f27640a.j(iJ, (iJ2 & 1) == 0 ? iJ2 | 1 : iJ2 & (-2));
                }
            }
            iArr2[i10] = this.f27640a.j(bVar.b(iH), this.f27640a.h(iJ));
            if (this.f27640a.d() != 0) {
                iArr2[i10] = this.f27640a.j(iArr2[i10], iH);
            }
        }
        return iArr2;
    }

    private b[] d(b bVar, b bVar2, int i10) throws d {
        if (bVar.d() < bVar2.d()) {
            bVar2 = bVar;
            bVar = bVar2;
        }
        b bVarG = this.f27640a.g();
        b bVarE = this.f27640a.e();
        do {
            b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
            b bVar4 = bVarE;
            b bVar5 = bVarG;
            bVarG = bVar4;
            if (bVar.d() < i10 / 2) {
                int iC = bVarG.c(0);
                if (iC == 0) {
                    throw new d("sigmaTilde(0) was zero");
                }
                int iH = this.f27640a.h(iC);
                return new b[]{bVarG.f(iH), bVar.f(iH)};
            }
            if (bVar.e()) {
                throw new d("r_{i-1} was zero");
            }
            b bVarG2 = this.f27640a.g();
            int iH2 = this.f27640a.h(bVar.c(bVar.d()));
            while (bVar2.d() >= bVar.d() && !bVar2.e()) {
                int iD = bVar2.d() - bVar.d();
                int iJ = this.f27640a.j(bVar2.c(bVar2.d()), iH2);
                bVarG2 = bVarG2.a(this.f27640a.b(iD, iJ));
                bVar2 = bVar2.a(bVar.h(iD, iJ));
            }
            bVarE = bVarG2.g(bVarG).a(bVar5);
        } while (bVar2.d() < bVar.d());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    public void a(int[] iArr, int i10) throws d {
        b bVar = new b(this.f27640a, iArr);
        int[] iArr2 = new int[i10];
        boolean z10 = true;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = this.f27640a;
            int iB = bVar.b(aVar.c(aVar.d() + i11));
            iArr2[(i10 - 1) - i11] = iB;
            if (iB != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return;
        }
        b[] bVarArrD = d(this.f27640a.b(i10, 1), new b(this.f27640a, iArr2), i10);
        b bVar2 = bVarArrD[0];
        b bVar3 = bVarArrD[1];
        int[] iArrB = b(bVar2);
        int[] iArrC = c(bVar3, iArrB);
        for (int i12 = 0; i12 < iArrB.length; i12++) {
            int length = (iArr.length - 1) - this.f27640a.i(iArrB[i12]);
            if (length < 0) {
                throw new d("Bad error location");
            }
            iArr[length] = a.a(iArr[length], iArrC[i12]);
        }
    }
}
