package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class by2 extends by3 implements kz3 {
    private static final hy3 zzb = new yx2();
    private static final by2 zzd;
    private int zze;
    private gy3 zzf = by3.r();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        by2 by2Var = new by2();
        zzd = by2Var;
        by3.B(by2.class, by2Var);
    }

    private by2() {
    }

    public static ay2 K() {
        return (ay2) zzd.G();
    }

    static /* synthetic */ void M(by2 by2Var, String str) {
        str.getClass();
        by2Var.zze |= 1;
        by2Var.zzg = str;
    }

    static /* synthetic */ void N(by2 by2Var, int i10) {
        gy3 gy3Var = by2Var.zzf;
        if (!gy3Var.d()) {
            by2Var.zzf = by3.s(gy3Var);
        }
        by2Var.zzf.X(2);
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", zx2.f18796a, "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new by2();
        }
        yx2 yx2Var = null;
        if (i11 == 4) {
            return new ay2(yx2Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
