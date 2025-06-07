package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class x3 extends u8 implements z9 {
    private static final x3 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        x3 x3Var = new x3();
        zza = x3Var;
        u8.n(x3.class, x3Var);
    }

    private x3() {
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
            return new x3();
        }
        o3 o3Var = null;
        if (i11 == 4) {
            return new w3(o3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
