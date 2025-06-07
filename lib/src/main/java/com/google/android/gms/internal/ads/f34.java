package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class f34 extends by3 implements kz3 {
    private static final f34 zzb;
    private int zzd;
    private String zze = "";

    static {
        f34 f34Var = new f34();
        zzb = f34Var;
        by3.B(f34.class, f34Var);
    }

    private f34() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new f34();
        }
        c14 c14Var = null;
        if (i11 == 4) {
            return new e34(c14Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
