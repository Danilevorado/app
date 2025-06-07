package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class b6 extends n1 implements v2 {
    private static final b6 zzb;
    private int zzd;
    private int zze;

    static {
        b6 b6Var = new b6();
        zzb = b6Var;
        n1.t(b6.class, b6Var);
    }

    private b6() {
    }

    public static b6 C() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return n1.q(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", a6.f19459a});
        }
        if (i11 == 3) {
            return new b6();
        }
        y5 y5Var = null;
        if (i11 == 4) {
            return new z5(y5Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
