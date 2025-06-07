package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fy2 extends by3 implements kz3 {
    private static final fy2 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private by2 zzh;

    static {
        fy2 fy2Var = new fy2();
        zzb = fy2Var;
        by3.B(fy2.class, fy2Var);
    }

    private fy2() {
    }

    public static dy2 K() {
        return (dy2) zzb.G();
    }

    static /* synthetic */ void M(fy2 fy2Var, String str) {
        str.getClass();
        fy2Var.zzd |= 2;
        fy2Var.zzf = str;
    }

    static /* synthetic */ void N(fy2 fy2Var, by2 by2Var) {
        by2Var.getClass();
        fy2Var.zzh = by2Var;
        fy2Var.zzd |= 8;
    }

    static /* synthetic */ void O(fy2 fy2Var, int i10) {
        fy2Var.zze = 1;
        fy2Var.zzd = 1 | fy2Var.zzd;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", ey2.f8048a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new fy2();
        }
        cy2 cy2Var = null;
        if (i11 == 4) {
            return new dy2(cy2Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
