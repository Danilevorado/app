package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class x5 extends n1 implements v2 {
    private static final x5 zzb;
    private int zzd;
    private int zzf;
    private u1 zze = n1.o();
    private String zzg = "";

    static {
        x5 x5Var = new x5();
        zzb = x5Var;
        n1.t(x5.class, x5Var);
    }

    private x5() {
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return n1.q(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new x5();
        }
        v5 v5Var = null;
        if (i11 == 4) {
            return new w5(v5Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
