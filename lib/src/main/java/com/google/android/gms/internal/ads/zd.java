package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zd extends by3 implements kz3 {
    private static final zd zzb;
    private int zzd;
    private ww3 zze;
    private ww3 zzf;
    private ww3 zzg;
    private ww3 zzh;

    static {
        zd zdVar = new zd();
        zzb = zdVar;
        by3.B(zd.class, zdVar);
    }

    private zd() {
        ww3 ww3Var = ww3.f17284n;
        this.zze = ww3Var;
        this.zzf = ww3Var;
        this.zzg = ww3Var;
        this.zzh = ww3Var;
    }

    public static yd K() {
        return (yd) zzb.G();
    }

    public static zd M(byte[] bArr, qx3 qx3Var) {
        return (zd) by3.q(zzb, bArr, qx3Var);
    }

    static /* synthetic */ void R(zd zdVar, ww3 ww3Var) {
        zdVar.zzd |= 1;
        zdVar.zze = ww3Var;
    }

    static /* synthetic */ void S(zd zdVar, ww3 ww3Var) {
        zdVar.zzd |= 2;
        zdVar.zzf = ww3Var;
    }

    static /* synthetic */ void T(zd zdVar, ww3 ww3Var) {
        zdVar.zzd |= 4;
        zdVar.zzg = ww3Var;
    }

    static /* synthetic */ void U(zd zdVar, ww3 ww3Var) {
        zdVar.zzd |= 8;
        zdVar.zzh = ww3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zd();
        }
        wc wcVar = null;
        if (i11 == 4) {
            return new yd(wcVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final ww3 N() {
        return this.zze;
    }

    public final ww3 O() {
        return this.zzf;
    }

    public final ww3 P() {
        return this.zzh;
    }

    public final ww3 Q() {
        return this.zzg;
    }
}
