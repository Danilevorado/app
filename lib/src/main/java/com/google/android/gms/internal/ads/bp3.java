package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bp3 extends by3 implements kz3 {
    private static final bp3 zzb;
    private ep3 zzd;
    private int zze;

    static {
        bp3 bp3Var = new bp3();
        zzb = bp3Var;
        by3.B(bp3.class, bp3Var);
    }

    private bp3() {
    }

    public static ap3 L() {
        return (ap3) zzb.G();
    }

    public static bp3 N() {
        return zzb;
    }

    public static bp3 O(ww3 ww3Var, qx3 qx3Var) {
        return (bp3) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void Q(bp3 bp3Var, ep3 ep3Var) {
        ep3Var.getClass();
        bp3Var.zzd = ep3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new bp3();
        }
        zo3 zo3Var = null;
        if (i11 == 4) {
            return new ap3(zo3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zze;
    }

    public final ep3 P() {
        ep3 ep3Var = this.zzd;
        return ep3Var == null ? ep3.N() : ep3Var;
    }
}
