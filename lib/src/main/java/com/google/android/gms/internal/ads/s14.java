package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class s14 extends by3 implements kz3 {
    private static final s14 zzb;
    private int zzd;
    private ww3 zze = ww3.f17284n;

    static {
        s14 s14Var = new s14();
        zzb = s14Var;
        by3.B(s14.class, s14Var);
    }

    private s14() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new s14();
        }
        c14 c14Var = null;
        if (i11 == 4) {
            return new r14(c14Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
