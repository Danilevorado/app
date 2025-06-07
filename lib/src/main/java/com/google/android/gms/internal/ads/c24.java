package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class c24 extends by3 implements kz3 {
    private static final c24 zzb;
    private int zzd;
    private ww3 zze;
    private ww3 zzf;
    private ww3 zzg;

    static {
        c24 c24Var = new c24();
        zzb = c24Var;
        by3.B(c24.class, c24Var);
    }

    private c24() {
        ww3 ww3Var = ww3.f17284n;
        this.zze = ww3Var;
        this.zzf = ww3Var;
        this.zzg = ww3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new c24();
        }
        c14 c14Var = null;
        if (i11 == 4) {
            return new b24(c14Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
