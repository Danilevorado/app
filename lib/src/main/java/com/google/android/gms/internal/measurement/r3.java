package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class r3 extends u8 implements z9 {
    private static final r3 zza;
    private int zze;
    private String zzf = "";
    private a9 zzg = u8.i();
    private boolean zzh;

    static {
        r3 r3Var = new r3();
        zza = r3Var;
        u8.n(r3.class, r3Var);
    }

    private r3() {
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", x3.class, "zzh"});
        }
        if (i11 == 3) {
            return new r3();
        }
        o3 o3Var = null;
        if (i11 == 4) {
            return new p3(o3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final String w() {
        return this.zzf;
    }
}
