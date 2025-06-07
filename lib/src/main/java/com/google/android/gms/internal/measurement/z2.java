package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class z2 extends u8 implements z9 {
    private static final z2 zza;
    private int zze;
    private int zzf;
    private String zzg = "";
    private a9 zzh = u8.i();
    private boolean zzi;
    private g3 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        z2 z2Var = new z2();
        zza = z2Var;
        u8.n(z2.class, z2Var);
    }

    private z2() {
    }

    static /* synthetic */ void D(z2 z2Var, String str) {
        z2Var.zze |= 2;
        z2Var.zzg = str;
    }

    static /* synthetic */ void E(z2 z2Var, int i10, b3 b3Var) {
        b3Var.getClass();
        a9 a9Var = z2Var.zzh;
        if (!a9Var.d()) {
            z2Var.zzh = u8.j(a9Var);
        }
        z2Var.zzh.set(i10, b3Var);
    }

    public static y2 x() {
        return (y2) zza.r();
    }

    public final g3 A() {
        g3 g3Var = this.zzj;
        return g3Var == null ? g3.w() : g3Var;
    }

    public final String B() {
        return this.zzg;
    }

    public final List C() {
        return this.zzh;
    }

    public final boolean F() {
        return this.zzk;
    }

    public final boolean G() {
        return this.zzl;
    }

    public final boolean H() {
        return this.zzm;
    }

    public final boolean I() {
        return (this.zze & 8) != 0;
    }

    public final boolean J() {
        return (this.zze & 1) != 0;
    }

    public final boolean K() {
        return (this.zze & 64) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", b3.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new z2();
        }
        v2 v2Var = null;
        if (i11 == 4) {
            return new y2(v2Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final int v() {
        return this.zzh.size();
    }

    public final int w() {
        return this.zzf;
    }

    public final b3 z(int i10) {
        return (b3) this.zzh.get(i10);
    }
}
