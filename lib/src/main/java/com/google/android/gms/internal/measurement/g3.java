package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class g3 extends u8 implements z9 {
    private static final g3 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        g3 g3Var = new g3();
        zza = g3Var;
        u8.n(g3.class, g3Var);
    }

    private g3() {
    }

    public static g3 w() {
        return zza;
    }

    public final boolean A() {
        return this.zzg;
    }

    public final boolean B() {
        return (this.zze & 1) != 0;
    }

    public final boolean C() {
        return (this.zze & 4) != 0;
    }

    public final boolean D() {
        return (this.zze & 2) != 0;
    }

    public final boolean E() {
        return (this.zze & 16) != 0;
    }

    public final boolean F() {
        return (this.zze & 8) != 0;
    }

    public final int G() {
        int iA = f3.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", e3.f18912a, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new g3();
        }
        v2 v2Var = null;
        if (i11 == 4) {
            return new c3(v2Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final String x() {
        return this.zzh;
    }

    public final String y() {
        return this.zzj;
    }

    public final String z() {
        return this.zzi;
    }
}
