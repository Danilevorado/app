package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class d5 extends u8 implements z9 {
    private static final d5 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        d5 d5Var = new d5();
        zza = d5Var;
        u8.n(d5.class, d5Var);
    }

    private d5() {
    }

    static /* synthetic */ void C(d5 d5Var, long j10) {
        d5Var.zze |= 1;
        d5Var.zzf = j10;
    }

    static /* synthetic */ void D(d5 d5Var, String str) {
        str.getClass();
        d5Var.zze |= 2;
        d5Var.zzg = str;
    }

    static /* synthetic */ void E(d5 d5Var, String str) {
        str.getClass();
        d5Var.zze |= 4;
        d5Var.zzh = str;
    }

    static /* synthetic */ void F(d5 d5Var) {
        d5Var.zze &= -5;
        d5Var.zzh = zza.zzh;
    }

    static /* synthetic */ void G(d5 d5Var, long j10) {
        d5Var.zze |= 8;
        d5Var.zzi = j10;
    }

    static /* synthetic */ void H(d5 d5Var) {
        d5Var.zze &= -9;
        d5Var.zzi = 0L;
    }

    static /* synthetic */ void I(d5 d5Var, double d10) {
        d5Var.zze |= 32;
        d5Var.zzk = d10;
    }

    static /* synthetic */ void J(d5 d5Var) {
        d5Var.zze &= -33;
        d5Var.zzk = 0.0d;
    }

    public static c5 y() {
        return (c5) zza.r();
    }

    public final String A() {
        return this.zzg;
    }

    public final String B() {
        return this.zzh;
    }

    public final boolean K() {
        return (this.zze & 32) != 0;
    }

    public final boolean L() {
        return (this.zze & 8) != 0;
    }

    public final boolean M() {
        return (this.zze & 1) != 0;
    }

    public final boolean N() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new d5();
        }
        a4 a4Var = null;
        if (i11 == 4) {
            return new c5(a4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final double v() {
        return this.zzk;
    }

    public final long w() {
        return this.zzi;
    }

    public final long x() {
        return this.zzf;
    }
}
