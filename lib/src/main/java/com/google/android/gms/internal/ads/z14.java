package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class z14 extends by3 implements kz3 {
    private static final z14 zzb;
    private int zzd;
    private ww3 zze;
    private ww3 zzf;
    private byte zzg = 2;

    static {
        z14 z14Var = new z14();
        zzb = z14Var;
        by3.B(z14.class, z14Var);
    }

    private z14() {
        ww3 ww3Var = ww3.f17284n;
        this.zze = ww3Var;
        this.zzf = ww3Var;
    }

    public static y14 K() {
        return (y14) zzb.G();
    }

    static /* synthetic */ void M(z14 z14Var, ww3 ww3Var) {
        z14Var.zzd |= 1;
        z14Var.zze = ww3Var;
    }

    static /* synthetic */ void N(z14 z14Var, ww3 ww3Var) {
        z14Var.zzd |= 2;
        z14Var.zzf = ww3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new z14();
        }
        c14 c14Var = null;
        if (i11 == 4) {
            return new y14(c14Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
