package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vs3 extends by3 implements kz3 {
    private static final vs3 zzb;
    private int zzf;
    private boolean zzg;
    private String zzd = "";
    private String zze = "";
    private String zzh = "";

    static {
        vs3 vs3Var = new vs3();
        zzb = vs3Var;
        by3.B(vs3.class, vs3Var);
    }

    private vs3() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new vs3();
        }
        ts3 ts3Var = null;
        if (i11 == 4) {
            return new us3(ts3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzf;
    }

    public final String M() {
        return this.zzh;
    }

    public final String N() {
        return this.zzd;
    }

    public final String O() {
        return this.zze;
    }

    public final boolean P() {
        return this.zzg;
    }
}
