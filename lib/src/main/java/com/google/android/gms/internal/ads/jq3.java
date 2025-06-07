package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jq3 extends by3 implements kz3 {
    private static final jq3 zzb;
    private int zzd;
    private ww3 zze = ww3.f17284n;

    static {
        jq3 jq3Var = new jq3();
        zzb = jq3Var;
        by3.B(jq3.class, jq3Var);
    }

    private jq3() {
    }

    public static iq3 L() {
        return (iq3) zzb.G();
    }

    public static jq3 N(ww3 ww3Var, qx3 qx3Var) {
        return (jq3) by3.o(zzb, ww3Var, qx3Var);
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new jq3();
        }
        hq3 hq3Var = null;
        if (i11 == 4) {
            return new iq3(hq3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }

    public final ww3 O() {
        return this.zze;
    }
}
