package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class hp3 extends by3 implements kz3 {
    private static final hp3 zzb;
    private int zzd;
    private np3 zze;
    private ww3 zzf = ww3.f17284n;

    static {
        hp3 hp3Var = new hp3();
        zzb = hp3Var;
        by3.B(hp3.class, hp3Var);
    }

    private hp3() {
    }

    public static gp3 L() {
        return (gp3) zzb.G();
    }

    public static hp3 N(ww3 ww3Var, qx3 qx3Var) {
        return (hp3) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void R(hp3 hp3Var, np3 np3Var) {
        np3Var.getClass();
        hp3Var.zze = np3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new hp3();
        }
        fp3 fp3Var = null;
        if (i11 == 4) {
            return new gp3(fp3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }

    public final np3 O() {
        np3 np3Var = this.zze;
        return np3Var == null ? np3.N() : np3Var;
    }

    public final ww3 P() {
        return this.zzf;
    }
}
