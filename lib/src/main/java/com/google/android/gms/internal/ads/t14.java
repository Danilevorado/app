package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class t14 extends by3 implements kz3 {
    private static final t14 zzb;
    private int zzd;
    private s14 zzf;
    private long zzg;
    private String zze = "";
    private String zzh = "";

    static {
        t14 t14Var = new t14();
        zzb = t14Var;
        by3.B(t14.class, t14Var);
    }

    private t14() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new t14();
        }
        c14 c14Var = null;
        if (i11 == 4) {
            return new q14(c14Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
