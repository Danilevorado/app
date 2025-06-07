package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ss3 extends by3 implements kz3 {
    private static final ss3 zzb;
    private String zzd = "";
    private ww3 zze = ww3.f17284n;
    private int zzf;

    static {
        ss3 ss3Var = new ss3();
        zzb = ss3Var;
        by3.B(ss3.class, ss3Var);
    }

    private ss3() {
    }

    public static rs3 K() {
        return (rs3) zzb.G();
    }

    public static ss3 M() {
        return zzb;
    }

    static /* synthetic */ void Q(ss3 ss3Var, String str) {
        str.getClass();
        ss3Var.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new ss3();
        }
        qs3 qs3Var = null;
        if (i11 == 4) {
            return new rs3(qs3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final ut3 N() {
        ut3 ut3VarB = ut3.b(this.zzf);
        return ut3VarB == null ? ut3.UNRECOGNIZED : ut3VarB;
    }

    public final ww3 O() {
        return this.zze;
    }

    public final String P() {
        return this.zzd;
    }
}
