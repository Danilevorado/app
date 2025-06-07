package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f16114a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16115b;

    /* renamed from: c, reason: collision with root package name */
    private int f16116c;

    /* renamed from: d, reason: collision with root package name */
    private int f16117d;

    public u0(byte[] bArr) {
        this.f16114a = bArr;
        this.f16115b = bArr.length;
    }

    public final int a() {
        return (this.f16116c * 8) + this.f16117d;
    }

    public final int b(int i10) {
        int i11 = this.f16116c;
        int i12 = i11 + 1;
        int iMin = Math.min(i10, 8 - this.f16117d);
        int i13 = ((this.f16114a[i11] & 255) >> this.f16117d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f16114a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        c(i10);
        return i14;
    }

    public final void c(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.f16116c + i12;
        this.f16116c = i13;
        int i14 = this.f16117d + (i10 - (i12 * 8));
        this.f16117d = i14;
        if (i14 > 7) {
            i13++;
            this.f16116c = i13;
            i14 -= 8;
            this.f16117d = i14;
        }
        boolean z10 = false;
        if (i13 >= 0 && (i13 < (i11 = this.f16115b) || (i13 == i11 && i14 == 0))) {
            z10 = true;
        }
        gt1.f(z10);
    }

    public final boolean d() {
        int i10 = (this.f16114a[this.f16116c] & 255) >> this.f16117d;
        c(1);
        return 1 == (i10 & 1);
    }
}
