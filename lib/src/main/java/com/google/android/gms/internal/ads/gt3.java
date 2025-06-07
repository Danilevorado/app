package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gt3 extends by3 implements kz3 {
    private static final gt3 zzb;
    private int zzd;
    private ky3 zze = by3.u();

    static {
        gt3 gt3Var = new gt3();
        zzb = gt3Var;
        by3.B(gt3.class, gt3Var);
    }

    private gt3() {
    }

    public static dt3 K() {
        return (dt3) zzb.G();
    }

    static /* synthetic */ void N(gt3 gt3Var, ft3 ft3Var) {
        ft3Var.getClass();
        ky3 ky3Var = gt3Var.zze;
        if (!ky3Var.d()) {
            gt3Var.zze = by3.v(ky3Var);
        }
        gt3Var.zze.add(ft3Var);
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", ft3.class});
        }
        if (i11 == 3) {
            return new gt3();
        }
        ct3 ct3Var = null;
        if (i11 == 4) {
            return new dt3(ct3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
