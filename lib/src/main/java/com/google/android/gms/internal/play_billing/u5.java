package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class u5 extends n1 implements v2 {
    private static final u5 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private k5 zzg;
    private n5 zzh;

    static {
        u5 u5Var = new u5();
        zzb = u5Var;
        n1.t(u5.class, u5Var);
    }

    private u5() {
    }

    static /* synthetic */ void B(u5 u5Var, b6 b6Var) {
        u5Var.zzf = b6Var;
        u5Var.zze = 4;
    }

    static /* synthetic */ void C(u5 u5Var, k5 k5Var) {
        k5Var.getClass();
        u5Var.zzg = k5Var;
        u5Var.zzd |= 1;
    }

    static /* synthetic */ void D(u5 u5Var, q4 q4Var) {
        u5Var.zzf = q4Var;
        u5Var.zze = 2;
    }

    static /* synthetic */ void F(u5 u5Var, u4 u4Var) {
        u5Var.zzf = u4Var;
        u5Var.zze = 3;
    }

    public static t5 G() {
        return (t5) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return n1.q(zzb, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", q4.class, u4.class, b6.class, h5.class, "zzh"});
        }
        if (i11 == 3) {
            return new u5();
        }
        s5 s5Var = null;
        if (i11 == 4) {
            return new t5(s5Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
