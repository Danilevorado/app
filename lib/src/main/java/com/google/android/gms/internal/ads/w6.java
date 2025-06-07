package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
final class w6 extends u6 {

    /* renamed from: n, reason: collision with root package name */
    private v6 f16995n;

    /* renamed from: o, reason: collision with root package name */
    private int f16996o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f16997p;

    /* renamed from: q, reason: collision with root package name */
    private x0 f16998q;

    /* renamed from: r, reason: collision with root package name */
    private v0 f16999r;

    w6() {
    }

    @Override // com.google.android.gms.internal.ads.u6
    protected final long a(jm2 jm2Var) {
        if ((jm2Var.h()[0] & 1) == 1) {
            return -1L;
        }
        byte b10 = jm2Var.h()[0];
        v6 v6Var = this.f16995n;
        gt1.b(v6Var);
        int i10 = !v6Var.f16601d[(b10 >> 1) & (255 >>> (8 - v6Var.f16602e))].f16922a ? v6Var.f16598a.f17325e : v6Var.f16598a.f17326f;
        int i11 = this.f16997p ? (this.f16996o + i10) / 4 : 0;
        if (jm2Var.j() < jm2Var.l() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(jm2Var.h(), jm2Var.l() + 4);
            jm2Var.d(bArrCopyOf, bArrCopyOf.length);
        } else {
            jm2Var.e(jm2Var.l() + 4);
        }
        long j10 = i11;
        byte[] bArrH = jm2Var.h();
        bArrH[jm2Var.l() - 4] = (byte) (j10 & 255);
        bArrH[jm2Var.l() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrH[jm2Var.l() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrH[jm2Var.l() - 1] = (byte) ((j10 >>> 24) & 255);
        this.f16997p = true;
        this.f16996o = i10;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.u6
    protected final void b(boolean z10) {
        super.b(z10);
        if (z10) {
            this.f16995n = null;
            this.f16998q = null;
            this.f16999r = null;
        }
        this.f16996o = 0;
        this.f16997p = false;
    }

    @Override // com.google.android.gms.internal.ads.u6
    protected final boolean c(jm2 jm2Var, long j10, r6 r6Var) throws oh0 {
        v6 v6Var;
        int i10;
        int iB;
        int i11;
        x0 x0Var;
        if (this.f16995n != null) {
            Objects.requireNonNull(r6Var.f14643a);
            return false;
        }
        x0 x0Var2 = this.f16998q;
        int i12 = 4;
        if (x0Var2 == null) {
            y0.d(1, jm2Var, false);
            int iP = jm2Var.p();
            int iS = jm2Var.s();
            int iP2 = jm2Var.p();
            int iO = jm2Var.o();
            int i13 = iO <= 0 ? -1 : iO;
            int iO2 = jm2Var.o();
            int i14 = iO2 <= 0 ? -1 : iO2;
            int iO3 = jm2Var.o();
            int i15 = iO3 <= 0 ? -1 : iO3;
            int iS2 = jm2Var.s();
            this.f16998q = new x0(iP, iS, iP2, i13, i14, i15, (int) Math.pow(2.0d, iS2 & 15), (int) Math.pow(2.0d, (iS2 & 240) >> 4), 1 == (jm2Var.s() & 1), Arrays.copyOf(jm2Var.h(), jm2Var.l()));
        } else {
            v0 v0Var = this.f16999r;
            if (v0Var == null) {
                this.f16999r = y0.c(jm2Var, true, true);
            } else {
                byte[] bArr = new byte[jm2Var.l()];
                System.arraycopy(jm2Var.h(), 0, bArr, 0, jm2Var.l());
                int i16 = x0Var2.f17321a;
                int i17 = 5;
                y0.d(5, jm2Var, false);
                int iS3 = jm2Var.s() + 1;
                u0 u0Var = new u0(jm2Var.h());
                u0Var.c(jm2Var.k() * 8);
                int i18 = 0;
                while (true) {
                    int i19 = 2;
                    int i20 = 16;
                    if (i18 >= iS3) {
                        x0 x0Var3 = x0Var2;
                        int i21 = 6;
                        int iB2 = u0Var.b(6) + 1;
                        for (int i22 = 0; i22 < iB2; i22++) {
                            if (u0Var.b(16) != 0) {
                                throw oh0.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i23 = 1;
                        int iB3 = u0Var.b(6) + 1;
                        int i24 = 0;
                        while (true) {
                            int i25 = 3;
                            if (i24 < iB3) {
                                int iB4 = u0Var.b(i20);
                                if (iB4 == 0) {
                                    i11 = iB3;
                                    int i26 = 8;
                                    u0Var.c(8);
                                    u0Var.c(16);
                                    u0Var.c(16);
                                    u0Var.c(6);
                                    u0Var.c(8);
                                    int iB5 = u0Var.b(4) + 1;
                                    int i27 = 0;
                                    while (i27 < iB5) {
                                        u0Var.c(i26);
                                        i27++;
                                        i26 = 8;
                                    }
                                } else {
                                    if (iB4 != i23) {
                                        throw oh0.a("floor type greater than 1 not decodable: " + iB4, null);
                                    }
                                    int iB6 = u0Var.b(i17);
                                    int[] iArr = new int[iB6];
                                    int i28 = -1;
                                    for (int i29 = 0; i29 < iB6; i29++) {
                                        int iB7 = u0Var.b(4);
                                        iArr[i29] = iB7;
                                        if (iB7 > i28) {
                                            i28 = iB7;
                                        }
                                    }
                                    int i30 = i28 + 1;
                                    int[] iArr2 = new int[i30];
                                    int i31 = 0;
                                    while (i31 < i30) {
                                        iArr2[i31] = u0Var.b(i25) + 1;
                                        int iB8 = u0Var.b(i19);
                                        int i32 = 8;
                                        if (iB8 > 0) {
                                            u0Var.c(8);
                                        }
                                        int i33 = iB3;
                                        int i34 = 0;
                                        for (int i35 = 1; i34 < (i35 << iB8); i35 = 1) {
                                            u0Var.c(i32);
                                            i34++;
                                            i32 = 8;
                                        }
                                        i31++;
                                        iB3 = i33;
                                        i19 = 2;
                                        i25 = 3;
                                    }
                                    i11 = iB3;
                                    u0Var.c(i19);
                                    int iB9 = u0Var.b(4);
                                    int i36 = 0;
                                    int i37 = 0;
                                    for (int i38 = 0; i38 < iB6; i38++) {
                                        i36 += iArr2[iArr[i38]];
                                        while (i37 < i36) {
                                            u0Var.c(iB9);
                                            i37++;
                                        }
                                    }
                                }
                                i24++;
                                iB3 = i11;
                                i21 = 6;
                                i20 = 16;
                                i19 = 2;
                                i23 = 1;
                                i17 = 5;
                            } else {
                                int i39 = 1;
                                int iB10 = u0Var.b(i21) + 1;
                                int i40 = 0;
                                while (i40 < iB10) {
                                    if (u0Var.b(16) > 2) {
                                        throw oh0.a("residueType greater than 2 is not decodable", null);
                                    }
                                    u0Var.c(24);
                                    u0Var.c(24);
                                    u0Var.c(24);
                                    int iB11 = u0Var.b(i21) + i39;
                                    int i41 = 8;
                                    u0Var.c(8);
                                    int[] iArr3 = new int[iB11];
                                    for (int i42 = 0; i42 < iB11; i42++) {
                                        iArr3[i42] = ((u0Var.d() ? u0Var.b(5) : 0) * 8) + u0Var.b(3);
                                    }
                                    int i43 = 0;
                                    while (i43 < iB11) {
                                        int i44 = 0;
                                        while (i44 < i41) {
                                            if ((iArr3[i43] & (1 << i44)) != 0) {
                                                u0Var.c(i41);
                                            }
                                            i44++;
                                            i41 = 8;
                                        }
                                        i43++;
                                        i41 = 8;
                                    }
                                    i40++;
                                    i21 = 6;
                                    i39 = 1;
                                }
                                int iB12 = u0Var.b(i21) + 1;
                                for (int i45 = 0; i45 < iB12; i45++) {
                                    int iB13 = u0Var.b(16);
                                    if (iB13 != 0) {
                                        ad2.b("VorbisUtil", "mapping type other than 0 not supported: " + iB13);
                                    } else {
                                        if (u0Var.d()) {
                                            i10 = 1;
                                            iB = u0Var.b(4) + 1;
                                        } else {
                                            i10 = 1;
                                            iB = 1;
                                        }
                                        if (u0Var.d()) {
                                            int iB14 = u0Var.b(8) + i10;
                                            for (int i46 = 0; i46 < iB14; i46++) {
                                                int i47 = i16 - 1;
                                                u0Var.c(y0.a(i47));
                                                u0Var.c(y0.a(i47));
                                            }
                                        }
                                        if (u0Var.b(2) != 0) {
                                            throw oh0.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iB > 1) {
                                            for (int i48 = 0; i48 < i16; i48++) {
                                                u0Var.c(4);
                                            }
                                        }
                                        for (int i49 = 0; i49 < iB; i49++) {
                                            u0Var.c(8);
                                            u0Var.c(8);
                                            u0Var.c(8);
                                        }
                                    }
                                }
                                int iB15 = u0Var.b(6) + 1;
                                w0[] w0VarArr = new w0[iB15];
                                for (int i50 = 0; i50 < iB15; i50++) {
                                    w0VarArr[i50] = new w0(u0Var.d(), u0Var.b(16), u0Var.b(16), u0Var.b(8));
                                }
                                if (!u0Var.d()) {
                                    throw oh0.a("framing bit after modes not set as expected", null);
                                }
                                v6Var = new v6(x0Var3, v0Var, bArr, w0VarArr, y0.a(iB15 - 1));
                            }
                        }
                    } else {
                        if (u0Var.b(24) != 5653314) {
                            throw oh0.a("expected code book to start with [0x56, 0x43, 0x42] at " + u0Var.a(), null);
                        }
                        int iB16 = u0Var.b(16);
                        int iB17 = u0Var.b(24);
                        if (u0Var.d()) {
                            u0Var.c(5);
                            for (int iB18 = 0; iB18 < iB17; iB18 += u0Var.b(y0.a(iB17 - iB18))) {
                            }
                        } else {
                            boolean zD = u0Var.d();
                            for (int i51 = 0; i51 < iB17; i51++) {
                                if (!zD || u0Var.d()) {
                                    u0Var.c(5);
                                }
                            }
                        }
                        int iB19 = u0Var.b(i12);
                        if (iB19 > 2) {
                            throw oh0.a("lookup type greater than 2 not decodable: " + iB19, null);
                        }
                        if (iB19 != 1) {
                            if (iB19 != 2) {
                                x0Var = x0Var2;
                            }
                            i18++;
                            x0Var2 = x0Var;
                            i12 = 4;
                        } else {
                            i19 = iB19;
                        }
                        u0Var.c(32);
                        u0Var.c(32);
                        int iB20 = u0Var.b(i12) + 1;
                        u0Var.c(1);
                        x0Var = x0Var2;
                        u0Var.c((int) ((i19 == 1 ? iB16 != 0 ? (long) Math.floor(Math.pow(iB17, 1.0d / iB16)) : 0L : iB17 * iB16) * iB20));
                        i18++;
                        x0Var2 = x0Var;
                        i12 = 4;
                    }
                }
            }
        }
        v6Var = null;
        this.f16995n = v6Var;
        if (v6Var == null) {
            return true;
        }
        x0 x0Var4 = v6Var.f16598a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(x0Var4.f17327g);
        arrayList.add(v6Var.f16600c);
        ld0 ld0VarB = y0.b(c63.t(v6Var.f16599b.f16510b));
        i7 i7Var = new i7();
        i7Var.s("audio/vorbis");
        i7Var.d0(x0Var4.f17324d);
        i7Var.o(x0Var4.f17323c);
        i7Var.e0(x0Var4.f17321a);
        i7Var.t(x0Var4.f17322b);
        i7Var.i(arrayList);
        i7Var.m(ld0VarB);
        r6Var.f14643a = i7Var.y();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.u6
    protected final void h(long j10) {
        super.h(j10);
        this.f16997p = j10 != 0;
        x0 x0Var = this.f16998q;
        this.f16996o = x0Var != null ? x0Var.f17325e : 0;
    }
}
