package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class n5 extends n1 implements v2 {
    private static final n5 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        n5 n5Var = new n5();
        zzb = n5Var;
        n1.t(n5.class, n5Var);
    }

    private n5() {
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return n1.q(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new n5();
        }
        l5 l5Var = null;
        if (i11 == 4) {
            return new m5(l5Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
