package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class h4 extends u8 implements z9 {
    private static final h4 zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        h4 h4Var = new h4();
        zza = h4Var;
        u8.n(h4.class, h4Var);
    }

    private h4() {
    }

    static /* synthetic */ void A(h4 h4Var, long j10) {
        h4Var.zze |= 2;
        h4Var.zzg = j10;
    }

    public static g4 x() {
        return (g4) zza.r();
    }

    static /* synthetic */ void z(h4 h4Var, int i10) {
        h4Var.zze |= 1;
        h4Var.zzf = i10;
    }

    public final boolean B() {
        return (this.zze & 2) != 0;
    }

    public final boolean C() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new h4();
        }
        a4 a4Var = null;
        if (i11 == 4) {
            return new g4(a4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final int v() {
        return this.zzf;
    }

    public final long w() {
        return this.zzg;
    }
}
