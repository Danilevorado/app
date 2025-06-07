package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class d24 extends by3 implements kz3 {
    private static final d24 zzb;
    private int zzd;
    private c24 zze;
    private ww3 zzg;
    private ww3 zzh;
    private int zzi;
    private byte zzj = 2;
    private ky3 zzf = by3.u();

    static {
        d24 d24Var = new d24();
        zzb = d24Var;
        by3.B(d24.class, d24Var);
    }

    private d24() {
        ww3 ww3Var = ww3.f17284n;
        this.zzg = ww3Var;
        this.zzh = ww3Var;
    }

    public static a24 K() {
        return (a24) zzb.G();
    }

    static /* synthetic */ void M(d24 d24Var, z14 z14Var) {
        z14Var.getClass();
        ky3 ky3Var = d24Var.zzf;
        if (!ky3Var.d()) {
            d24Var.zzf = by3.v(ky3Var);
        }
        d24Var.zzf.add(z14Var);
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", z14.class, "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new d24();
        }
        c14 c14Var = null;
        if (i11 == 4) {
            return new a24(c14Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
