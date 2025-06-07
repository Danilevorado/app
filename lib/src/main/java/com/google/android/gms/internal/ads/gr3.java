package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gr3 extends by3 implements kz3 {
    private static final gr3 zzb;
    private int zzd;
    private int zze;
    private ww3 zzf = ww3.f17284n;

    static {
        gr3 gr3Var = new gr3();
        zzb = gr3Var;
        by3.B(gr3.class, gr3Var);
    }

    private gr3() {
    }

    public static fr3 K() {
        return (fr3) zzb.G();
    }

    public static gr3 M() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new gr3();
        }
        er3 er3Var = null;
        if (i11 == 4) {
            return new fr3(er3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final ww3 N() {
        return this.zzf;
    }

    public final int P() {
        int i10 = this.zzd;
        int i11 = 5;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 == 2) {
            i11 = 4;
        } else if (i10 != 3) {
            i11 = i10 != 4 ? i10 != 5 ? 0 : 7 : 6;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int Q() {
        int iB = kr3.b(this.zze);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }
}
