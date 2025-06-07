package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class h5 extends n1 implements v2 {
    private static final t1 zzb = new b5();
    private static final h5 zzd;
    private int zze;
    private int zzg;
    private a5 zzj;
    private boolean zzk;
    private boolean zzl;
    private String zzf = "";
    private s1 zzh = n1.n();
    private u1 zzi = n1.o();

    static {
        h5 h5Var = new h5();
        zzd = h5Var;
        n1.t(h5.class, h5Var);
    }

    private h5() {
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return n1.q(zzd, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zze", "zzf", "zzg", g5.f19510a, "zzh", d5.f19482a, "zzi", x5.class, "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new h5();
        }
        b5 b5Var = null;
        if (i11 == 4) {
            return new f5(b5Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }
}
