package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class e6 extends n1 implements v2 {
    private static final e6 zzb;
    private int zzd;
    private int zze;

    static {
        e6 e6Var = new e6();
        zzb = e6Var;
        n1.t(e6.class, e6Var);
    }

    private e6() {
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return n1.q(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new e6();
        }
        c6 c6Var = null;
        if (i11 == 4) {
            return new d6(c6Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
