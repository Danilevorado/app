package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class p4 extends u8 implements z9 {
    private static final p4 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private d4 zzh;

    static {
        p4 p4Var = new p4();
        zza = p4Var;
        u8.n(p4.class, p4Var);
    }

    private p4() {
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new p4();
        }
        a4 a4Var = null;
        if (i11 == 4) {
            return new o4(a4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
