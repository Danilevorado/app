package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f10756a;

    /* renamed from: b, reason: collision with root package name */
    private int f10757b;

    /* renamed from: c, reason: collision with root package name */
    private int f10758c;

    /* renamed from: d, reason: collision with root package name */
    private int f10759d = 0;

    public k0(byte[] bArr, int i10, int i11) {
        this.f10756a = bArr;
        this.f10758c = i10;
        this.f10757b = i11;
        h();
    }

    private final int g() {
        int i10 = 0;
        while (!f()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? a(i10) : 0);
    }

    private final void h() {
        int i10;
        int i11 = this.f10758c;
        boolean z10 = true;
        if (i11 < 0 || (i11 >= (i10 = this.f10757b) && (i11 != i10 || this.f10759d != 0))) {
            z10 = false;
        }
        gt1.f(z10);
    }

    private final boolean i(int i10) {
        if (i10 < 2 || i10 >= this.f10757b) {
            return false;
        }
        byte[] bArr = this.f10756a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 + (-1)] == 0;
    }

    public final int a(int i10) {
        int i11;
        this.f10759d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f10759d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f10759d = i13;
            byte[] bArr = this.f10756a;
            int i14 = this.f10758c;
            i12 |= (bArr[i14] & 255) << i13;
            if (true != i(i14 + 1)) {
                i = 1;
            }
            this.f10758c = i14 + i;
        }
        byte[] bArr2 = this.f10756a;
        int i15 = this.f10758c;
        int i16 = i12 | ((bArr2[i15] & 255) >> (8 - i11));
        int i17 = 32 - i10;
        if (i11 == 8) {
            this.f10759d = 0;
            this.f10758c = i15 + (true != i(i15 + 1) ? 1 : 2);
        }
        int i18 = ((-1) >>> i17) & i16;
        h();
        return i18;
    }

    public final int b() {
        int iG = g();
        return (iG % 2 == 0 ? -1 : 1) * ((iG + 1) / 2);
    }

    public final int c() {
        return g();
    }

    public final void d() {
        int i10 = this.f10759d + 1;
        this.f10759d = i10;
        if (i10 == 8) {
            this.f10759d = 0;
            int i11 = this.f10758c;
            this.f10758c = i11 + (true == i(i11 + 1) ? 2 : 1);
        }
        h();
    }

    public final void e(int i10) {
        int i11 = this.f10758c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f10758c = i13;
        int i14 = this.f10759d + (i10 - (i12 * 8));
        this.f10759d = i14;
        if (i14 > 7) {
            this.f10758c = i13 + 1;
            this.f10759d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f10758c) {
                h();
                return;
            } else if (i(i11)) {
                this.f10758c++;
                i11 += 2;
            }
        }
    }

    public final boolean f() {
        int i10 = this.f10756a[this.f10758c] & (128 >> this.f10759d);
        d();
        return i10 != 0;
    }
}
