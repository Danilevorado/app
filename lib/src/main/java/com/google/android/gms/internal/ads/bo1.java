package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class bo1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f6563a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6564b;

    /* renamed from: c, reason: collision with root package name */
    private final float f6565c;

    /* renamed from: d, reason: collision with root package name */
    private final float f6566d;

    /* renamed from: e, reason: collision with root package name */
    private final float f6567e;

    /* renamed from: f, reason: collision with root package name */
    private final int f6568f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6569g;

    /* renamed from: h, reason: collision with root package name */
    private final int f6570h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f6571i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f6572j;

    /* renamed from: k, reason: collision with root package name */
    private int f6573k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f6574l;

    /* renamed from: m, reason: collision with root package name */
    private int f6575m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f6576n;

    /* renamed from: o, reason: collision with root package name */
    private int f6577o;

    /* renamed from: p, reason: collision with root package name */
    private int f6578p;

    /* renamed from: q, reason: collision with root package name */
    private int f6579q;

    /* renamed from: r, reason: collision with root package name */
    private int f6580r;

    /* renamed from: s, reason: collision with root package name */
    private int f6581s;

    /* renamed from: t, reason: collision with root package name */
    private int f6582t;

    /* renamed from: u, reason: collision with root package name */
    private int f6583u;

    /* renamed from: v, reason: collision with root package name */
    private int f6584v;

    public bo1(int i10, int i11, float f5, float f10, int i12) {
        this.f6563a = i10;
        this.f6564b = i11;
        this.f6565c = f5;
        this.f6566d = f10;
        this.f6567e = i10 / i12;
        this.f6568f = i10 / 400;
        int i13 = i10 / 65;
        this.f6569g = i13;
        int i14 = i13 + i13;
        this.f6570h = i14;
        this.f6571i = new short[i14];
        int i15 = i14 * i11;
        this.f6572j = new short[i15];
        this.f6574l = new short[i15];
        this.f6576n = new short[i15];
    }

    private final int g(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f6564b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            int i19 = iAbs * i16;
            int i20 = i14 * i11;
            if (i19 < i20) {
                i14 = iAbs;
            }
            if (i19 < i20) {
                i16 = i11;
            }
            int i21 = iAbs * i15;
            int i22 = i17 * i11;
            if (i21 > i22) {
                i17 = iAbs;
            }
            if (i21 > i22) {
                i15 = i11;
            }
            i11++;
        }
        this.f6583u = i14 / i16;
        this.f6584v = i17 / i15;
        return i16;
    }

    private final void h(short[] sArr, int i10, int i11) {
        short[] sArrL = l(this.f6574l, this.f6575m, i11);
        this.f6574l = sArrL;
        int i12 = this.f6564b;
        System.arraycopy(sArr, i10 * i12, sArrL, this.f6575m * i12, i12 * i11);
        this.f6575m += i11;
    }

    private final void i(short[] sArr, int i10, int i11) {
        int i12 = this.f6570h / i11;
        int i13 = this.f6564b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f6571i[i16] = (short) (i17 / i14);
        }
    }

    private static void j(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i13 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i12 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i18] = (short) (((sArr2[i16] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i18 += i11;
                i16 += i11;
                i17 += i11;
            }
        }
    }

    private final void k() {
        int iG;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.f6575m;
        float f5 = this.f6565c;
        float f10 = this.f6566d;
        float f11 = f5 / f10;
        float f12 = this.f6567e * f10;
        double d10 = f11;
        float f13 = 1.0f;
        int i18 = 1;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            int i19 = this.f6573k;
            if (i19 >= this.f6570h) {
                int i20 = 0;
                while (true) {
                    int i21 = this.f6580r;
                    if (i21 > 0) {
                        int iMin = Math.min(this.f6570h, i21);
                        h(this.f6572j, i20, iMin);
                        this.f6580r -= iMin;
                        i20 += iMin;
                    } else {
                        short[] sArr = this.f6572j;
                        int i22 = this.f6563a;
                        int i23 = i22 > 4000 ? i22 / 4000 : i18;
                        if (this.f6564b == i18 && i23 == i18) {
                            iG = g(sArr, i20, this.f6568f, this.f6569g);
                        } else {
                            i(sArr, i20, i23);
                            int iG2 = g(this.f6571i, 0, this.f6568f / i23, this.f6569g / i23);
                            if (i23 != i18) {
                                int i24 = iG2 * i23;
                                int i25 = i23 * 4;
                                int i26 = this.f6568f;
                                int i27 = i24 - i25;
                                if (i27 >= i26) {
                                    i26 = i27;
                                }
                                int i28 = i24 + i25;
                                int i29 = this.f6569g;
                                if (i28 > i29) {
                                    i28 = i29;
                                }
                                if (this.f6564b == i18) {
                                    iG = g(sArr, i20, i26, i28);
                                } else {
                                    i(sArr, i20, i18);
                                    iG = g(this.f6571i, 0, i26, i28);
                                }
                            } else {
                                iG = iG2;
                            }
                        }
                        int i30 = this.f6583u;
                        int i31 = (i30 == 0 || (i12 = this.f6581s) == 0 || this.f6584v > i30 * 3 || i30 + i30 <= this.f6582t * 3) ? iG : i12;
                        this.f6582t = i30;
                        this.f6581s = iG;
                        if (d10 > 1.0d) {
                            short[] sArr2 = this.f6572j;
                            if (f11 >= 2.0f) {
                                i11 = (int) (i31 / ((-1.0f) + f11));
                            } else {
                                this.f6580r = (int) ((i31 * (2.0f - f11)) / ((-1.0f) + f11));
                                i11 = i31;
                            }
                            short[] sArrL = l(this.f6574l, this.f6575m, i11);
                            this.f6574l = sArrL;
                            int i32 = i11;
                            j(i11, this.f6564b, sArrL, this.f6575m, sArr2, i20, sArr2, i20 + i31);
                            this.f6575m += i32;
                            i20 += i31 + i32;
                        } else {
                            int i33 = i31;
                            short[] sArr3 = this.f6572j;
                            if (f11 < 0.5f) {
                                i10 = (int) ((i33 * f11) / (f13 - f11));
                            } else {
                                this.f6580r = (int) ((i33 * ((f11 + f11) - 1.0f)) / (f13 - f11));
                                i10 = i33;
                            }
                            int i34 = i33 + i10;
                            short[] sArrL2 = l(this.f6574l, this.f6575m, i34);
                            this.f6574l = sArrL2;
                            int i35 = this.f6564b;
                            System.arraycopy(sArr3, i20 * i35, sArrL2, this.f6575m * i35, i35 * i33);
                            j(i10, this.f6564b, this.f6574l, this.f6575m + i33, sArr3, i20 + i33, sArr3, i20);
                            this.f6575m += i34;
                            i20 += i10;
                        }
                    }
                    if (this.f6570h + i20 > i19) {
                        break;
                    }
                    f13 = 1.0f;
                    i18 = 1;
                }
                int i36 = this.f6573k - i20;
                short[] sArr4 = this.f6572j;
                int i37 = this.f6564b;
                System.arraycopy(sArr4, i20 * i37, sArr4, 0, i37 * i36);
                this.f6573k = i36;
                f13 = 1.0f;
            }
        } else {
            h(this.f6572j, 0, this.f6573k);
            this.f6573k = 0;
        }
        if (f12 == f13 || this.f6575m == i17) {
            return;
        }
        int i38 = this.f6563a;
        int i39 = (int) (i38 / f12);
        while (true) {
            if (i39 <= 16384 && i38 <= 16384) {
                break;
            }
            i39 /= 2;
            i38 /= 2;
        }
        int i40 = this.f6575m - i17;
        short[] sArrL3 = l(this.f6576n, this.f6577o, i40);
        this.f6576n = sArrL3;
        short[] sArr5 = this.f6574l;
        int i41 = this.f6564b;
        System.arraycopy(sArr5, i17 * i41, sArrL3, this.f6577o * i41, i41 * i40);
        this.f6575m = i17;
        this.f6577o += i40;
        int i42 = 0;
        while (true) {
            i13 = this.f6577o;
            i14 = i13 - 1;
            if (i42 >= i14) {
                break;
            }
            while (true) {
                i15 = this.f6578p + 1;
                int i43 = i15 * i39;
                i16 = this.f6579q;
                if (i43 <= i16 * i38) {
                    break;
                }
                this.f6574l = l(this.f6574l, this.f6575m, 1);
                int i44 = 0;
                while (true) {
                    int i45 = this.f6564b;
                    if (i44 < i45) {
                        short[] sArr6 = this.f6574l;
                        int i46 = this.f6575m * i45;
                        short[] sArr7 = this.f6576n;
                        int i47 = (i42 * i45) + i44;
                        short s10 = sArr7[i47];
                        short s11 = sArr7[i47 + i45];
                        int i48 = this.f6579q * i38;
                        int i49 = this.f6578p;
                        int i50 = i49 * i39;
                        int i51 = (i49 + 1) * i39;
                        int i52 = i51 - i48;
                        int i53 = i51 - i50;
                        sArr6[i46 + i44] = (short) (((s10 * i52) + ((i53 - i52) * s11)) / i53);
                        i44++;
                    }
                }
                this.f6579q++;
                this.f6575m++;
            }
            this.f6578p = i15;
            if (i15 == i38) {
                this.f6578p = 0;
                gt1.f(i16 == i39);
                this.f6579q = 0;
            }
            i42++;
        }
        if (i14 != 0) {
            short[] sArr8 = this.f6576n;
            int i54 = this.f6564b;
            System.arraycopy(sArr8, i14 * i54, sArr8, 0, (i13 - i14) * i54);
            this.f6577o -= i14;
        }
    }

    private final short[] l(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f6564b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int a() {
        int i10 = this.f6575m * this.f6564b;
        return i10 + i10;
    }

    public final int b() {
        int i10 = this.f6573k * this.f6564b;
        return i10 + i10;
    }

    public final void c() {
        this.f6573k = 0;
        this.f6575m = 0;
        this.f6577o = 0;
        this.f6578p = 0;
        this.f6579q = 0;
        this.f6580r = 0;
        this.f6581s = 0;
        this.f6582t = 0;
        this.f6583u = 0;
        this.f6584v = 0;
    }

    public final void d(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f6564b, this.f6575m);
        shortBuffer.put(this.f6574l, 0, this.f6564b * iMin);
        int i10 = this.f6575m - iMin;
        this.f6575m = i10;
        short[] sArr = this.f6574l;
        int i11 = this.f6564b;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public final void e() {
        int i10;
        int i11 = this.f6573k;
        float f5 = this.f6565c;
        float f10 = this.f6566d;
        int i12 = this.f6575m + ((int) ((((i11 / (f5 / f10)) + this.f6577o) / (this.f6567e * f10)) + 0.5f));
        short[] sArr = this.f6572j;
        int i13 = this.f6570h;
        this.f6572j = l(sArr, i11, i13 + i13 + i11);
        int i14 = 0;
        while (true) {
            int i15 = this.f6570h;
            i10 = i15 + i15;
            int i16 = this.f6564b;
            if (i14 >= i10 * i16) {
                break;
            }
            this.f6572j[(i16 * i11) + i14] = 0;
            i14++;
        }
        this.f6573k += i10;
        k();
        if (this.f6575m > i12) {
            this.f6575m = i12;
        }
        this.f6573k = 0;
        this.f6580r = 0;
        this.f6577o = 0;
    }

    public final void f(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.f6564b;
        int i11 = iRemaining / i10;
        int i12 = i10 * i11;
        short[] sArrL = l(this.f6572j, this.f6573k, i11);
        this.f6572j = sArrL;
        shortBuffer.get(sArrL, this.f6573k * this.f6564b, (i12 + i12) / 2);
        this.f6573k += i11;
        k();
    }
}
