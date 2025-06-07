package s6;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements Cloneable {

    /* renamed from: m, reason: collision with root package name */
    private final int f27030m;

    /* renamed from: n, reason: collision with root package name */
    private final int f27031n;

    /* renamed from: o, reason: collision with root package name */
    private final int f27032o;

    /* renamed from: p, reason: collision with root package name */
    private final int[] f27033p;

    public a(int i10) {
        this(i10, i10);
    }

    public a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f27030m = i10;
        this.f27031n = i11;
        int i12 = (i10 + 31) / 32;
        this.f27032o = i12;
        this.f27033p = new int[i12 * i11];
    }

    private a(int i10, int i11, int i12, int[] iArr) {
        this.f27030m = i10;
        this.f27031n = i11;
        this.f27032o = i12;
        this.f27033p = iArr;
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f27031n * (this.f27030m + 1));
        for (int i10 = 0; i10 < this.f27031n; i10++) {
            for (int i11 = 0; i11 < this.f27030m; i11++) {
                sb2.append(d(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a(this.f27030m, this.f27031n, this.f27032o, (int[]) this.f27033p.clone());
    }

    public void c(int i10, int i11) {
        int i12 = (i11 * this.f27032o) + (i10 / 32);
        int[] iArr = this.f27033p;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    public boolean d(int i10, int i11) {
        return ((this.f27033p[(i11 * this.f27032o) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f27030m == aVar.f27030m && this.f27031n == aVar.f27031n && this.f27032o == aVar.f27032o && Arrays.equals(this.f27033p, aVar.f27033p);
    }

    public int[] f() {
        int length = this.f27033p.length - 1;
        while (length >= 0 && this.f27033p[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i10 = this.f27032o;
        int i11 = length / i10;
        int i12 = (length % i10) << 5;
        int i13 = 31;
        while ((this.f27033p[length] >>> i13) == 0) {
            i13--;
        }
        return new int[]{i12 + i13, i11};
    }

    public int g() {
        return this.f27031n;
    }

    public int hashCode() {
        int i10 = this.f27030m;
        return (((((((i10 * 31) + i10) * 31) + this.f27031n) * 31) + this.f27032o) * 31) + Arrays.hashCode(this.f27033p);
    }

    public int[] i() {
        int[] iArr;
        int i10 = 0;
        while (true) {
            iArr = this.f27033p;
            if (i10 >= iArr.length || iArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == iArr.length) {
            return null;
        }
        int i11 = this.f27032o;
        int i12 = i10 / i11;
        int i13 = (i10 % i11) << 5;
        int i14 = iArr[i10];
        int i15 = 0;
        while ((i14 << (31 - i15)) == 0) {
            i15++;
        }
        return new int[]{i13 + i15, i12};
    }

    public int j() {
        return this.f27030m;
    }

    public void k(int i10, int i11) {
        int i12 = (i11 * this.f27032o) + (i10 / 32);
        int[] iArr = this.f27033p;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public void m(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f27031n || i14 > this.f27030m) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f27032o * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.f27033p;
                int i18 = (i17 / 32) + i16;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    public String r(String str, String str2) {
        return a(str, str2, "\n");
    }

    public String toString() {
        return r("X ", "  ");
    }
}
