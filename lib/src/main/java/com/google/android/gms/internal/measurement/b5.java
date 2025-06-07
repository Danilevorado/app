package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class b5 extends u8 implements z9 {
    private static final b5 zza;
    private int zze;
    private int zzf;
    private z8 zzg = u8.g();

    static {
        b5 b5Var = new b5();
        zza = b5Var;
        u8.n(b5.class, b5Var);
    }

    private b5() {
    }

    static /* synthetic */ void B(b5 b5Var, int i10) {
        b5Var.zze |= 1;
        b5Var.zzf = i10;
    }

    static /* synthetic */ void C(b5 b5Var, Iterable iterable) {
        z8 z8Var = b5Var.zzg;
        if (!z8Var.d()) {
            b5Var.zzg = u8.h(z8Var);
        }
        h7.c(iterable, b5Var.zzg);
    }

    public static a5 y() {
        return (a5) zza.r();
    }

    public final List A() {
        return this.zzg;
    }

    public final boolean D() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new b5();
        }
        a4 a4Var = null;
        if (i11 == 4) {
            return new a5(a4Var);
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
        return this.zzf;
    }

    public final long x(int i10) {
        return this.zzg.a(i10);
    }
}
