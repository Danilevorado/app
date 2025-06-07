package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class k24 extends by3 implements kz3 {
    private static final k24 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private ww3 zzg;
    private ww3 zzh;

    static {
        k24 k24Var = new k24();
        zzb = k24Var;
        by3.B(k24.class, k24Var);
    }

    private k24() {
        ww3 ww3Var = ww3.f17284n;
        this.zzg = ww3Var;
        this.zzh = ww3Var;
    }

    public static i24 K() {
        return (i24) zzb.G();
    }

    static /* synthetic */ void M(k24 k24Var, String str) {
        k24Var.zzd |= 2;
        k24Var.zzf = "image/png";
    }

    static /* synthetic */ void N(k24 k24Var, ww3 ww3Var) {
        ww3Var.getClass();
        k24Var.zzd |= 4;
        k24Var.zzg = ww3Var;
    }

    static /* synthetic */ void O(k24 k24Var, int i10) {
        k24Var.zze = 1;
        k24Var.zzd = 1 | k24Var.zzd;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", j24.f10268a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new k24();
        }
        c14 c14Var = null;
        if (i11 == 4) {
            return new i24(c14Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
