package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class j4 extends u8 implements z9 {
    private static final j4 zza;
    private int zze;
    private a9 zzf = u8.i();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        j4 j4Var = new j4();
        zza = j4Var;
        u8.n(j4.class, j4Var);
    }

    private j4() {
    }

    static /* synthetic */ void E(j4 j4Var, int i10, n4 n4Var) {
        n4Var.getClass();
        j4Var.P();
        j4Var.zzf.set(i10, n4Var);
    }

    static /* synthetic */ void F(j4 j4Var, n4 n4Var) {
        n4Var.getClass();
        j4Var.P();
        j4Var.zzf.add(n4Var);
    }

    static /* synthetic */ void G(j4 j4Var, Iterable iterable) {
        j4Var.P();
        h7.c(iterable, j4Var.zzf);
    }

    static /* synthetic */ void I(j4 j4Var, int i10) {
        j4Var.P();
        j4Var.zzf.remove(i10);
    }

    static /* synthetic */ void J(j4 j4Var, String str) {
        str.getClass();
        j4Var.zze |= 1;
        j4Var.zzg = str;
    }

    static /* synthetic */ void K(j4 j4Var, long j10) {
        j4Var.zze |= 2;
        j4Var.zzh = j10;
    }

    static /* synthetic */ void L(j4 j4Var, long j10) {
        j4Var.zze |= 4;
        j4Var.zzi = j10;
    }

    private final void P() {
        a9 a9Var = this.zzf;
        if (a9Var.d()) {
            return;
        }
        this.zzf = u8.j(a9Var);
    }

    public static i4 z() {
        return (i4) zza.r();
    }

    public final n4 B(int i10) {
        return (n4) this.zzf.get(i10);
    }

    public final String C() {
        return this.zzg;
    }

    public final List D() {
        return this.zzf;
    }

    public final boolean M() {
        return (this.zze & 8) != 0;
    }

    public final boolean N() {
        return (this.zze & 4) != 0;
    }

    public final boolean O() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", n4.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new j4();
        }
        a4 a4Var = null;
        if (i11 == 4) {
            return new i4(a4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final int v() {
        return this.zzj;
    }

    public final int w() {
        return this.zzf.size();
    }

    public final long x() {
        return this.zzi;
    }

    public final long y() {
        return this.zzh;
    }
}
