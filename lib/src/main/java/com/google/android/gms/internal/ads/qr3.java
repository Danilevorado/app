package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qr3 extends by3 implements kz3 {
    private static final qr3 zzb;
    private tr3 zzd;
    private int zze;
    private int zzf;

    static {
        qr3 qr3Var = new qr3();
        zzb = qr3Var;
        by3.B(qr3.class, qr3Var);
    }

    private qr3() {
    }

    public static pr3 L() {
        return (pr3) zzb.G();
    }

    public static qr3 N() {
        return zzb;
    }

    public static qr3 O(ww3 ww3Var, qx3 qx3Var) {
        return (qr3) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void Q(qr3 qr3Var, tr3 tr3Var) {
        tr3Var.getClass();
        qr3Var.zzd = tr3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new qr3();
        }
        or3 or3Var = null;
        if (i11 == 4) {
            return new pr3(or3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zze;
    }

    public final tr3 P() {
        tr3 tr3Var = this.zzd;
        return tr3Var == null ? tr3.N() : tr3Var;
    }
}
