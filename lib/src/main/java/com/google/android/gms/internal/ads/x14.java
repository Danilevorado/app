package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class x14 extends by3 implements kz3 {
    private static final x14 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private long zzh;

    static {
        x14 x14Var = new x14();
        zzb = x14Var;
        by3.B(x14.class, x14Var);
    }

    private x14() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", w14.f16939a, "zzf", u14.f16134a, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new x14();
        }
        c14 c14Var = null;
        if (i11 == 4) {
            return new v14(c14Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
