package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class uo3 extends by3 implements kz3 {
    private static final uo3 zzb;
    private bp3 zzd;
    private qr3 zze;

    static {
        uo3 uo3Var = new uo3();
        zzb = uo3Var;
        by3.B(uo3.class, uo3Var);
    }

    private uo3() {
    }

    public static to3 K() {
        return (to3) zzb.G();
    }

    public static uo3 M(ww3 ww3Var, qx3 qx3Var) {
        return (uo3) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void P(uo3 uo3Var, bp3 bp3Var) {
        bp3Var.getClass();
        uo3Var.zzd = bp3Var;
    }

    static /* synthetic */ void Q(uo3 uo3Var, qr3 qr3Var) {
        qr3Var.getClass();
        uo3Var.zze = qr3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new uo3();
        }
        so3 so3Var = null;
        if (i11 == 4) {
            return new to3(so3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final bp3 N() {
        bp3 bp3Var = this.zzd;
        return bp3Var == null ? bp3.N() : bp3Var;
    }

    public final qr3 O() {
        qr3 qr3Var = this.zze;
        return qr3Var == null ? qr3.N() : qr3Var;
    }
}
