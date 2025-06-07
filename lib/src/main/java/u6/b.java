package u6;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final a f27638a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f27639b;

    b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f27638a = aVar;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f27639b = iArr;
            return;
        }
        int i10 = 1;
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f27639b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i10];
        this.f27639b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
    }

    b a(b bVar) {
        if (!this.f27638a.equals(bVar.f27638a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (e()) {
            return bVar;
        }
        if (bVar.e()) {
            return this;
        }
        int[] iArr = this.f27639b;
        int[] iArr2 = bVar.f27639b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i10 = length; i10 < iArr.length; i10++) {
            iArr3[i10] = a.a(iArr2[i10 - length], iArr[i10]);
        }
        return new b(this.f27638a, iArr3);
    }

    int b(int i10) {
        if (i10 == 0) {
            return c(0);
        }
        if (i10 == 1) {
            int iA = 0;
            for (int i11 : this.f27639b) {
                iA = a.a(iA, i11);
            }
            return iA;
        }
        int[] iArr = this.f27639b;
        int iA2 = iArr[0];
        int length = iArr.length;
        for (int i12 = 1; i12 < length; i12++) {
            iA2 = a.a(this.f27638a.j(i10, iA2), this.f27639b[i12]);
        }
        return iA2;
    }

    int c(int i10) {
        return this.f27639b[(r0.length - 1) - i10];
    }

    int d() {
        return this.f27639b.length - 1;
    }

    boolean e() {
        return this.f27639b[0] == 0;
    }

    b f(int i10) {
        if (i10 == 0) {
            return this.f27638a.g();
        }
        if (i10 == 1) {
            return this;
        }
        int length = this.f27639b.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f27638a.j(this.f27639b[i11], i10);
        }
        return new b(this.f27638a, iArr);
    }

    b g(b bVar) {
        if (!this.f27638a.equals(bVar.f27638a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (e() || bVar.e()) {
            return this.f27638a.g();
        }
        int[] iArr = this.f27639b;
        int length = iArr.length;
        int[] iArr2 = bVar.f27639b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            for (int i12 = 0; i12 < length2; i12++) {
                int i13 = i10 + i12;
                iArr3[i13] = a.a(iArr3[i13], this.f27638a.j(i11, iArr2[i12]));
            }
        }
        return new b(this.f27638a, iArr3);
    }

    b h(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f27638a.g();
        }
        int length = this.f27639b.length;
        int[] iArr = new int[i10 + length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = this.f27638a.j(this.f27639b[i12], i11);
        }
        return new b(this.f27638a, iArr);
    }

    public String toString() {
        char c10;
        StringBuilder sb2 = new StringBuilder(d() * 8);
        for (int iD = d(); iD >= 0; iD--) {
            int iC = c(iD);
            if (iC != 0) {
                if (iC < 0) {
                    sb2.append(" - ");
                    iC = -iC;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (iD == 0 || iC != 1) {
                    int i10 = this.f27638a.i(iC);
                    if (i10 == 0) {
                        c10 = '1';
                    } else if (i10 == 1) {
                        c10 = 'a';
                    } else {
                        sb2.append("a^");
                        sb2.append(i10);
                    }
                    sb2.append(c10);
                }
                if (iD != 0) {
                    if (iD == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(iD);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
