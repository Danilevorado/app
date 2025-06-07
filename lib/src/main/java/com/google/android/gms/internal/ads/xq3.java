package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xq3 extends by3 implements kz3 {
    private static final xq3 zzb;
    private gr3 zzd;
    private rq3 zze;
    private int zzf;

    static {
        xq3 xq3Var = new xq3();
        zzb = xq3Var;
        by3.B(xq3.class, xq3Var);
    }

    private xq3() {
    }

    public static wq3 L() {
        return (wq3) zzb.G();
    }

    public static xq3 N() {
        return zzb;
    }

    static /* synthetic */ void P(xq3 xq3Var, gr3 gr3Var) {
        gr3Var.getClass();
        xq3Var.zzd = gr3Var;
    }

    static /* synthetic */ void Q(xq3 xq3Var, rq3 rq3Var) {
        rq3Var.getClass();
        xq3Var.zze = rq3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new xq3();
        }
        vq3 vq3Var = null;
        if (i11 == 4) {
            return new wq3(vq3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final rq3 K() {
        rq3 rq3Var = this.zze;
        return rq3Var == null ? rq3.M() : rq3Var;
    }

    public final gr3 O() {
        gr3 gr3Var = this.zzd;
        return gr3Var == null ? gr3.M() : gr3Var;
    }

    public final int R() {
        int i10 = this.zzf;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
