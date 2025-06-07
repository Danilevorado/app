package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class u4 extends n1 implements v2 {
    private static final u4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        u4 u4Var = new u4();
        zzb = u4Var;
        n1.t(u4.class, u4Var);
    }

    private u4() {
    }

    static /* synthetic */ void B(u4 u4Var, int i10) {
        u4Var.zzg = i10 - 1;
        u4Var.zzd |= 1;
    }

    public static t4 C() {
        return (t4) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return n1.q(zzb, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", r4.f19634a, r5.class, e6.class});
        }
        if (i11 == 3) {
            return new u4();
        }
        s4 s4Var = null;
        if (i11 == 4) {
            return new t4(s4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
