package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class i3 extends u8 implements z9 {
    private static final i3 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private b3 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        i3 i3Var = new i3();
        zza = i3Var;
        u8.n(i3.class, i3Var);
    }

    private i3() {
    }

    static /* synthetic */ void A(i3 i3Var, String str) {
        i3Var.zze |= 2;
        i3Var.zzg = str;
    }

    public static h3 x() {
        return (h3) zza.r();
    }

    public final boolean B() {
        return this.zzi;
    }

    public final boolean C() {
        return this.zzj;
    }

    public final boolean D() {
        return this.zzk;
    }

    public final boolean E() {
        return (this.zze & 1) != 0;
    }

    public final boolean F() {
        return (this.zze & 32) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new i3();
        }
        v2 v2Var = null;
        if (i11 == 4) {
            return new h3(v2Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final int v() {
        return this.zzf;
    }

    public final b3 w() {
        b3 b3Var = this.zzh;
        return b3Var == null ? b3.w() : b3Var;
    }

    public final String z() {
        return this.zzg;
    }
}
