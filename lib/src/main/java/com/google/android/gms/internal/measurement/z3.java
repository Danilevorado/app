package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class z3 extends u8 implements z9 {
    private static final z3 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        z3 z3Var = new z3();
        zza = z3Var;
        u8.n(z3.class, z3Var);
    }

    private z3() {
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new z3();
        }
        o3 o3Var = null;
        if (i11 == 4) {
            return new y3(o3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final String w() {
        return this.zzf;
    }

    public final String x() {
        return this.zzg;
    }
}
