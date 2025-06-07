package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class z4 extends u8 implements z9 {
    private static final z4 zza;
    private z8 zze = u8.g();
    private z8 zzf = u8.g();
    private a9 zzg = u8.i();
    private a9 zzh = u8.i();

    static {
        z4 z4Var = new z4();
        zza = z4Var;
        u8.n(z4.class, z4Var);
    }

    private z4() {
    }

    public static y4 A() {
        return (y4) zza.r();
    }

    public static z4 C() {
        return zza;
    }

    static /* synthetic */ void I(z4 z4Var, Iterable iterable) {
        z8 z8Var = z4Var.zze;
        if (!z8Var.d()) {
            z4Var.zze = u8.h(z8Var);
        }
        h7.c(iterable, z4Var.zze);
    }

    static /* synthetic */ void K(z4 z4Var, Iterable iterable) {
        z8 z8Var = z4Var.zzf;
        if (!z8Var.d()) {
            z4Var.zzf = u8.h(z8Var);
        }
        h7.c(iterable, z4Var.zzf);
    }

    static /* synthetic */ void M(z4 z4Var, Iterable iterable) {
        z4Var.S();
        h7.c(iterable, z4Var.zzg);
    }

    static /* synthetic */ void O(z4 z4Var, int i10) {
        z4Var.S();
        z4Var.zzg.remove(i10);
    }

    static /* synthetic */ void P(z4 z4Var, Iterable iterable) {
        z4Var.T();
        h7.c(iterable, z4Var.zzh);
    }

    static /* synthetic */ void R(z4 z4Var, int i10) {
        z4Var.T();
        z4Var.zzh.remove(i10);
    }

    private final void S() {
        a9 a9Var = this.zzg;
        if (a9Var.d()) {
            return;
        }
        this.zzg = u8.j(a9Var);
    }

    private final void T() {
        a9 a9Var = this.zzh;
        if (a9Var.d()) {
            return;
        }
        this.zzh = u8.j(a9Var);
    }

    public final b5 D(int i10) {
        return (b5) this.zzh.get(i10);
    }

    public final List E() {
        return this.zzg;
    }

    public final List F() {
        return this.zzf;
    }

    public final List G() {
        return this.zzh;
    }

    public final List H() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", h4.class, "zzh", b5.class});
        }
        if (i11 == 3) {
            return new z4();
        }
        a4 a4Var = null;
        if (i11 == 4) {
            return new y4(a4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final int v() {
        return this.zzg.size();
    }

    public final int w() {
        return this.zzf.size();
    }

    public final int x() {
        return this.zzh.size();
    }

    public final int y() {
        return this.zze.size();
    }

    public final h4 z(int i10) {
        return (h4) this.zzg.get(i10);
    }
}
