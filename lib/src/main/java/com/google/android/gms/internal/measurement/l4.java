package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class l4 extends u8 implements z9 {
    private static final l4 zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        l4 l4Var = new l4();
        zza = l4Var;
        u8.n(l4.class, l4Var);
    }

    private l4() {
    }

    public static k4 v() {
        return (k4) zza.r();
    }

    static /* synthetic */ void x(l4 l4Var, String str) {
        str.getClass();
        l4Var.zze |= 1;
        l4Var.zzf = str;
    }

    static /* synthetic */ void y(l4 l4Var, long j10) {
        l4Var.zze |= 2;
        l4Var.zzg = j10;
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new l4();
        }
        a4 a4Var = null;
        if (i11 == 4) {
            return new k4(a4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
