package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class f4 extends u8 implements z9 {
    private static final f4 zza;
    private int zze;
    private int zzf;
    private z4 zzg;
    private z4 zzh;
    private boolean zzi;

    static {
        f4 f4Var = new f4();
        zza = f4Var;
        u8.n(f4.class, f4Var);
    }

    private f4() {
    }

    static /* synthetic */ void A(f4 f4Var, int i10) {
        f4Var.zze |= 1;
        f4Var.zzf = i10;
    }

    static /* synthetic */ void B(f4 f4Var, z4 z4Var) {
        z4Var.getClass();
        f4Var.zzg = z4Var;
        f4Var.zze |= 2;
    }

    static /* synthetic */ void C(f4 f4Var, z4 z4Var) {
        f4Var.zzh = z4Var;
        f4Var.zze |= 4;
    }

    static /* synthetic */ void D(f4 f4Var, boolean z10) {
        f4Var.zze |= 8;
        f4Var.zzi = z10;
    }

    public static e4 w() {
        return (e4) zza.r();
    }

    public final boolean E() {
        return this.zzi;
    }

    public final boolean F() {
        return (this.zze & 1) != 0;
    }

    public final boolean G() {
        return (this.zze & 8) != 0;
    }

    public final boolean H() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new f4();
        }
        a4 a4Var = null;
        if (i11 == 4) {
            return new e4(a4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final int v() {
        return this.zzf;
    }

    public final z4 y() {
        z4 z4Var = this.zzg;
        return z4Var == null ? z4.C() : z4Var;
    }

    public final z4 z() {
        z4 z4Var = this.zzh;
        return z4Var == null ? z4.C() : z4Var;
    }
}
