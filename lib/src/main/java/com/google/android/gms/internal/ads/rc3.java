package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class rc3 {

    /* renamed from: a, reason: collision with root package name */
    private final ss3 f14746a;

    private rc3(ss3 ss3Var) {
        this.f14746a = ss3Var;
    }

    public static rc3 e(String str, byte[] bArr, int i10) {
        rs3 rs3VarK = ss3.K();
        rs3VarK.v(str);
        ww3 ww3Var = ww3.f17284n;
        rs3VarK.w(ww3.I(bArr, 0, bArr.length));
        int i11 = i10 - 1;
        rs3VarK.u(i11 != 0 ? i11 != 1 ? ut3.RAW : ut3.LEGACY : ut3.TINK);
        return new rc3((ss3) rs3VarK.m());
    }

    final ss3 a() {
        return this.f14746a;
    }

    public final String b() {
        return this.f14746a.P();
    }

    public final byte[] c() {
        return this.f14746a.O().f();
    }

    public final int d() {
        ut3 ut3VarN = this.f14746a.N();
        ut3 ut3Var = ut3.UNKNOWN_PREFIX;
        int iOrdinal = ut3VarN.ordinal();
        int i10 = 1;
        if (iOrdinal != 1) {
            i10 = 2;
            if (iOrdinal != 2) {
                i10 = 3;
                if (iOrdinal != 3) {
                    if (iOrdinal == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i10;
    }
}
