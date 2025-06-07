package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class r5 extends n1 implements v2 {
    private static final r5 zzb;
    private int zzd;
    private int zze;

    static {
        r5 r5Var = new r5();
        zzb = r5Var;
        n1.t(r5.class, r5Var);
    }

    private r5() {
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return n1.q(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", q5.f19630a});
        }
        if (i11 == 3) {
            return new r5();
        }
        o5 o5Var = null;
        if (i11 == 4) {
            return new p5(o5Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
