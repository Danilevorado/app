package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class mn4 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f12209a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f12210b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f12211c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f12212d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f12213e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f12214f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f12215g = 0;

    public static int a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f12209a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int b(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b10 = bArr[4];
            return f((b10 & 192) >> 6, b10 & 63);
        }
        int i10 = bArr[2] & 7;
        int i11 = ((bArr[3] & 255) | (i10 << 8)) + 1;
        return i11 + i11;
    }

    public static k9 c(jm2 jm2Var, String str, String str2, c0 c0Var) {
        il2 il2Var = new il2();
        il2Var.h(jm2Var);
        int i10 = f12210b[il2Var.d(2)];
        il2Var.l(8);
        int i11 = f12212d[il2Var.d(3)];
        if (il2Var.d(1) != 0) {
            i11++;
        }
        int i12 = f12213e[il2Var.d(5)] * AdError.NETWORK_ERROR_CODE;
        il2Var.e();
        jm2Var.f(il2Var.b());
        i7 i7Var = new i7();
        i7Var.h(str);
        i7Var.s("audio/ac3");
        i7Var.e0(i11);
        i7Var.t(i10);
        i7Var.b(c0Var);
        i7Var.k(str2);
        i7Var.d0(i12);
        i7Var.o(i12);
        return i7Var.y();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.k9 d(com.google.android.gms.internal.ads.jm2 r7, java.lang.String r8, java.lang.String r9, com.google.android.gms.internal.ads.c0 r10) {
        /*
            com.google.android.gms.internal.ads.il2 r0 = new com.google.android.gms.internal.ads.il2
            r0.<init>()
            r0.h(r7)
            r1 = 13
            int r1 = r0.d(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.l(r2)
            r3 = 2
            int r3 = r0.d(r3)
            int[] r4 = com.google.android.gms.internal.ads.mn4.f12210b
            r3 = r4[r3]
            r4 = 10
            r0.l(r4)
            int[] r4 = com.google.android.gms.internal.ads.mn4.f12212d
            int r5 = r0.d(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.d(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.l(r2)
            r2 = 4
            int r2 = r0.d(r2)
            r0.l(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.m(r2)
            int r2 = r0.d(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.l(r5)
        L4f:
            int r2 = r0.a()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.l(r6)
            int r2 = r0.d(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.e()
            int r0 = r0.b()
            r7.f(r0)
            com.google.android.gms.internal.ads.i7 r7 = new com.google.android.gms.internal.ads.i7
            r7.<init>()
            r7.h(r8)
            r7.s(r2)
            r7.e0(r4)
            r7.t(r3)
            r7.b(r10)
            r7.k(r9)
            r7.o(r1)
            com.google.android.gms.internal.ads.k9 r7 = r7.y()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mn4.d(com.google.android.gms.internal.ads.jm2, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.c0):com.google.android.gms.internal.ads.k9");
    }

    public static ln4 e(il2 il2Var) {
        int i10;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iC = il2Var.c();
        il2Var.l(40);
        int iD = il2Var.d(5);
        il2Var.j(iC);
        int i21 = -1;
        if (iD > 10) {
            il2Var.l(16);
            int iD2 = il2Var.d(2);
            if (iD2 == 0) {
                i21 = 0;
            } else if (iD2 == 1) {
                i21 = 1;
            } else if (iD2 == 2) {
                i21 = 2;
            }
            il2Var.l(3);
            int iD3 = il2Var.d(11) + 1;
            int iD4 = il2Var.d(2);
            if (iD4 == 3) {
                i17 = f12211c[il2Var.d(2)];
                i18 = 6;
                i16 = 3;
            } else {
                int iD5 = il2Var.d(2);
                int i22 = f12209a[iD5];
                i16 = iD5;
                i17 = f12210b[iD4];
                i18 = i22;
            }
            int i23 = iD3 + iD3;
            int i24 = (i23 * i17) / (i18 * 32);
            int iD6 = il2Var.d(3);
            boolean zN = il2Var.n();
            i10 = f12212d[iD6] + (zN ? 1 : 0);
            il2Var.l(10);
            if (il2Var.n()) {
                il2Var.l(8);
            }
            if (iD6 == 0) {
                il2Var.l(5);
                if (il2Var.n()) {
                    il2Var.l(8);
                }
                i19 = 0;
                iD6 = 0;
            } else {
                i19 = iD6;
            }
            if (i21 == 1) {
                if (il2Var.n()) {
                    il2Var.l(16);
                }
                i20 = 1;
            } else {
                i20 = i21;
            }
            if (il2Var.n()) {
                if (i19 > 2) {
                    il2Var.l(2);
                }
                if ((i19 & 1) != 0 && i19 > 2) {
                    il2Var.l(6);
                }
                if ((i19 & 4) != 0) {
                    il2Var.l(6);
                }
                if (zN && il2Var.n()) {
                    il2Var.l(5);
                }
                if (i20 == 0) {
                    if (il2Var.n()) {
                        il2Var.l(6);
                    }
                    if (i19 == 0 && il2Var.n()) {
                        il2Var.l(6);
                    }
                    if (il2Var.n()) {
                        il2Var.l(6);
                    }
                    int iD7 = il2Var.d(2);
                    if (iD7 == 1) {
                        il2Var.l(5);
                    } else if (iD7 == 2) {
                        il2Var.l(12);
                    } else if (iD7 == 3) {
                        int iD8 = il2Var.d(5);
                        if (il2Var.n()) {
                            il2Var.l(5);
                            if (il2Var.n()) {
                                il2Var.l(4);
                            }
                            if (il2Var.n()) {
                                il2Var.l(4);
                            }
                            if (il2Var.n()) {
                                il2Var.l(4);
                            }
                            if (il2Var.n()) {
                                il2Var.l(4);
                            }
                            if (il2Var.n()) {
                                il2Var.l(4);
                            }
                            if (il2Var.n()) {
                                il2Var.l(4);
                            }
                            if (il2Var.n()) {
                                il2Var.l(4);
                            }
                            if (il2Var.n()) {
                                if (il2Var.n()) {
                                    il2Var.l(4);
                                }
                                if (il2Var.n()) {
                                    il2Var.l(4);
                                }
                            }
                        }
                        if (il2Var.n()) {
                            il2Var.l(5);
                            if (il2Var.n()) {
                                il2Var.l(7);
                                if (il2Var.n()) {
                                    il2Var.l(8);
                                }
                            }
                        }
                        il2Var.l((iD8 + 2) * 8);
                        il2Var.e();
                    }
                    if (i19 < 2) {
                        if (il2Var.n()) {
                            il2Var.l(14);
                        }
                        if (iD6 == 0 && il2Var.n()) {
                            il2Var.l(14);
                        }
                    }
                    if (!il2Var.n()) {
                        i20 = 0;
                    } else if (i16 == 0) {
                        il2Var.l(5);
                        i20 = 0;
                        i16 = 0;
                    } else {
                        for (int i25 = 0; i25 < i18; i25++) {
                            if (il2Var.n()) {
                                il2Var.l(5);
                            }
                        }
                        i20 = 0;
                    }
                }
            }
            if (il2Var.n()) {
                il2Var.l(5);
                if (i19 == 2) {
                    il2Var.l(4);
                    i19 = 2;
                }
                if (i19 >= 6) {
                    il2Var.l(2);
                }
                if (il2Var.n()) {
                    il2Var.l(8);
                }
                if (i19 == 0 && il2Var.n()) {
                    il2Var.l(8);
                }
                if (iD4 < 3) {
                    il2Var.k();
                }
            }
            if (i20 == 0 && i16 != 3) {
                il2Var.k();
            }
            if (i20 == 2 && (i16 == 3 || il2Var.n())) {
                il2Var.l(6);
            }
            str = (il2Var.n() && il2Var.d(6) == 1 && il2Var.d(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i11 = i21;
            i13 = i23;
            i14 = i17;
            i15 = i18 * 256;
            i12 = i24;
        } else {
            il2Var.l(32);
            int iD9 = il2Var.d(2);
            String str2 = iD9 == 3 ? null : "audio/ac3";
            int iD10 = il2Var.d(6);
            int i26 = f12213e[iD10 / 2] * AdError.NETWORK_ERROR_CODE;
            int iF = f(iD9, iD10);
            il2Var.l(8);
            int iD11 = il2Var.d(3);
            if ((iD11 & 1) != 0 && iD11 != 1) {
                il2Var.l(2);
            }
            if ((iD11 & 4) != 0) {
                il2Var.l(2);
            }
            if (iD11 == 2) {
                il2Var.l(2);
            }
            int i27 = iD9 < 3 ? f12210b[iD9] : -1;
            i10 = f12212d[iD11] + (il2Var.n() ? 1 : 0);
            str = str2;
            i11 = -1;
            i12 = i26;
            i13 = iF;
            i14 = i27;
            i15 = 1536;
        }
        return new ln4(str, i11, i10, i14, i13, i15, i12, null);
    }

    private static int f(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || (i12 = i11 >> 1) >= 19) {
            return -1;
        }
        int i13 = f12210b[i10];
        if (i13 == 44100) {
            int i14 = f12214f[i12] + (i11 & 1);
            return i14 + i14;
        }
        int i15 = f12213e[i12];
        return i13 == 32000 ? i15 * 6 : i15 * 4;
    }
}
