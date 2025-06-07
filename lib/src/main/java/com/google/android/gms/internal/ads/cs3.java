package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class cs3 extends by3 implements kz3 {
    private static final cs3 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        cs3 cs3Var = new cs3();
        zzb = cs3Var;
        by3.B(cs3.class, cs3Var);
    }

    private cs3() {
    }

    public static bs3 K() {
        return (bs3) zzb.G();
    }

    public static cs3 M() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new cs3();
        }
        as3 as3Var = null;
        if (i11 == 4) {
            return new bs3(as3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int N() {
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

    public final int O() {
        int i10 = this.zze;
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

    public final int P() {
        int i10 = this.zzd;
        int i11 = 4;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 == 1) {
            i11 = 3;
        } else if (i10 != 2) {
            i11 = i10 != 3 ? i10 != 4 ? 0 : 6 : 5;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
