package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g7 implements w8 {

    /* renamed from: a, reason: collision with root package name */
    private final List f8635a;

    public g7(int i10) {
        this.f8635a = c63.u();
    }

    public g7(int i10, List list) {
        this.f8635a = list;
    }

    private final m8 b(v8 v8Var) {
        return new m8(d(v8Var));
    }

    private final a9 c(v8 v8Var) {
        return new a9(d(v8Var));
    }

    private final List d(v8 v8Var) {
        String str;
        int i10;
        List listSingletonList;
        jm2 jm2Var = new jm2(v8Var.f16628d);
        List arrayList = this.f8635a;
        while (jm2Var.i() > 0) {
            int iS = jm2Var.s();
            int iK = jm2Var.k() + jm2Var.s();
            if (iS == 134) {
                arrayList = new ArrayList();
                int iS2 = jm2Var.s() & 31;
                for (int i11 = 0; i11 < iS2; i11++) {
                    String strF = jm2Var.F(3, u23.f16142c);
                    int iS3 = jm2Var.s();
                    boolean z10 = (iS3 & 128) != 0;
                    if (z10) {
                        i10 = iS3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bS = (byte) jm2Var.s();
                    jm2Var.g(1);
                    if (z10) {
                        int i12 = bS & 64;
                        int i13 = iv1.f10186c;
                        listSingletonList = Collections.singletonList(i12 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    i7 i7Var = new i7();
                    i7Var.s(str);
                    i7Var.k(strF);
                    i7Var.c0(i10);
                    i7Var.i(listSingletonList);
                    arrayList.add(i7Var.y());
                }
            }
            jm2Var.f(iK);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.w8
    public final y8 a(int i10, v8 v8Var) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new b8(new y7(v8Var.f16626b));
            }
            if (i10 == 21) {
                return new b8(new w7());
            }
            if (i10 == 27) {
                return new b8(new t7(b(v8Var), false, false));
            }
            if (i10 == 36) {
                return new b8(new v7(b(v8Var)));
            }
            if (i10 == 89) {
                return new b8(new j7(v8Var.f16627c));
            }
            if (i10 == 138) {
                return new b8(new h7(v8Var.f16626b));
            }
            if (i10 == 172) {
                return new b8(new c7(v8Var.f16626b));
            }
            if (i10 == 257) {
                return new l8(new a8("application/vnd.dvb.ait"));
            }
            if (i10 != 128) {
                if (i10 != 129) {
                    if (i10 == 134) {
                        return new l8(new a8("application/x-scte35"));
                    }
                    if (i10 != 135) {
                        switch (i10) {
                            case 15:
                                return new b8(new f7(false, v8Var.f16626b));
                            case 16:
                                return new b8(new p7(c(v8Var)));
                            case 17:
                                return new b8(new x7(v8Var.f16626b));
                            default:
                                return null;
                        }
                    }
                }
                return new b8(new z6(v8Var.f16626b));
            }
        }
        return new b8(new m7(c(v8Var)));
    }
}
