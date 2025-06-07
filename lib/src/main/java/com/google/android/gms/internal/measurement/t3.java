package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class t3 extends u8 implements z9 {
    private static final t3 zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        t3 t3Var = new t3();
        zza = t3Var;
        u8.n(t3.class, t3Var);
    }

    private t3() {
    }

    static /* synthetic */ void y(t3 t3Var, String str) {
        str.getClass();
        t3Var.zze |= 1;
        t3Var.zzf = str;
    }

    public final boolean A() {
        return this.zzh;
    }

    public final boolean B() {
        return (this.zze & 2) != 0;
    }

    public final boolean C() {
        return (this.zze & 4) != 0;
    }

    public final boolean D() {
        return (this.zze & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new t3();
        }
        o3 o3Var = null;
        if (i11 == 4) {
            return new s3(o3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final int v() {
        return this.zzi;
    }

    public final String x() {
        return this.zzf;
    }

    public final boolean z() {
        return this.zzg;
    }
}
