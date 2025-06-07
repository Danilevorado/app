package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class h24 extends by3 implements kz3 {
    private static final h24 zzb;
    private int zzd;
    private g24 zze;
    private ww3 zzg;
    private ww3 zzh;
    private int zzi;
    private ww3 zzj;
    private byte zzk = 2;
    private ky3 zzf = by3.u();

    static {
        h24 h24Var = new h24();
        zzb = h24Var;
        by3.B(h24.class, h24Var);
    }

    private h24() {
        ww3 ww3Var = ww3.f17284n;
        this.zzg = ww3Var;
        this.zzh = ww3Var;
        this.zzj = ww3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", z14.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new h24();
        }
        c14 c14Var = null;
        if (i11 == 4) {
            return new e24(c14Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
