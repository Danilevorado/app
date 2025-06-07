package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class b3 extends u8 implements z9 {
    private static final b3 zza;
    private int zze;
    private n3 zzf;
    private g3 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        b3 b3Var = new b3();
        zza = b3Var;
        u8.n(b3.class, b3Var);
    }

    private b3() {
    }

    static /* synthetic */ void A(b3 b3Var, String str) {
        b3Var.zze |= 8;
        b3Var.zzi = str;
    }

    public static b3 w() {
        return zza;
    }

    public final boolean B() {
        return this.zzh;
    }

    public final boolean C() {
        return (this.zze & 4) != 0;
    }

    public final boolean D() {
        return (this.zze & 2) != 0;
    }

    public final boolean E() {
        return (this.zze & 8) != 0;
    }

    public final boolean F() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new b3();
        }
        v2 v2Var = null;
        if (i11 == 4) {
            return new a3(v2Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final g3 x() {
        g3 g3Var = this.zzg;
        return g3Var == null ? g3.w() : g3Var;
    }

    public final n3 y() {
        n3 n3Var = this.zzf;
        return n3Var == null ? n3.x() : n3Var;
    }

    public final String z() {
        return this.zzi;
    }
}
