package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class n4 extends u8 implements z9 {
    private static final n4 zza;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private a9 zzk = u8.i();

    static {
        n4 n4Var = new n4();
        zza = n4Var;
        u8.n(n4.class, n4Var);
    }

    private n4() {
    }

    static /* synthetic */ void E(n4 n4Var, String str) {
        str.getClass();
        n4Var.zze |= 1;
        n4Var.zzf = str;
    }

    static /* synthetic */ void F(n4 n4Var, String str) {
        str.getClass();
        n4Var.zze |= 2;
        n4Var.zzg = str;
    }

    static /* synthetic */ void G(n4 n4Var) {
        n4Var.zze &= -3;
        n4Var.zzg = zza.zzg;
    }

    static /* synthetic */ void H(n4 n4Var, long j10) {
        n4Var.zze |= 4;
        n4Var.zzh = j10;
    }

    static /* synthetic */ void I(n4 n4Var) {
        n4Var.zze &= -5;
        n4Var.zzh = 0L;
    }

    static /* synthetic */ void J(n4 n4Var, double d10) {
        n4Var.zze |= 16;
        n4Var.zzj = d10;
    }

    static /* synthetic */ void K(n4 n4Var) {
        n4Var.zze &= -17;
        n4Var.zzj = 0.0d;
    }

    static /* synthetic */ void L(n4 n4Var, n4 n4Var2) {
        n4Var2.getClass();
        n4Var.T();
        n4Var.zzk.add(n4Var2);
    }

    static /* synthetic */ void M(n4 n4Var, Iterable iterable) {
        n4Var.T();
        h7.c(iterable, n4Var.zzk);
    }

    private final void T() {
        a9 a9Var = this.zzk;
        if (a9Var.d()) {
            return;
        }
        this.zzk = u8.j(a9Var);
    }

    public static m4 z() {
        return (m4) zza.r();
    }

    public final String B() {
        return this.zzf;
    }

    public final String C() {
        return this.zzg;
    }

    public final List D() {
        return this.zzk;
    }

    public final boolean O() {
        return (this.zze & 16) != 0;
    }

    public final boolean P() {
        return (this.zze & 8) != 0;
    }

    public final boolean Q() {
        return (this.zze & 4) != 0;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    public final boolean S() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", n4.class});
        }
        if (i11 == 3) {
            return new n4();
        }
        a4 a4Var = null;
        if (i11 == 4) {
            return new m4(a4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final double v() {
        return this.zzj;
    }

    public final float w() {
        return this.zzi;
    }

    public final int x() {
        return this.zzk.size();
    }

    public final long y() {
        return this.zzh;
    }
}
