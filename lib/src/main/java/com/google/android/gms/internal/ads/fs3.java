package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fs3 extends by3 implements kz3 {
    private static final fs3 zzb;
    private int zzd;
    private is3 zze;
    private ww3 zzf = ww3.f17284n;

    static {
        fs3 fs3Var = new fs3();
        zzb = fs3Var;
        by3.B(fs3.class, fs3Var);
    }

    private fs3() {
    }

    public static es3 L() {
        return (es3) zzb.G();
    }

    public static fs3 N(ww3 ww3Var, qx3 qx3Var) {
        return (fs3) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void R(fs3 fs3Var, is3 is3Var) {
        is3Var.getClass();
        fs3Var.zze = is3Var;
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
            return new fs3();
        }
        ds3 ds3Var = null;
        if (i11 == 4) {
            return new es3(ds3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }

    public final is3 O() {
        is3 is3Var = this.zze;
        return is3Var == null ? is3.O() : is3Var;
    }

    public final ww3 P() {
        return this.zzf;
    }

    public final boolean T() {
        return this.zze != null;
    }
}
