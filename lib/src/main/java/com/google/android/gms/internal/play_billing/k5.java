package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class k5 extends n1 implements v2 {
    private static final k5 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        k5 k5Var = new k5();
        zzb = k5Var;
        n1.t(k5.class, k5Var);
    }

    private k5() {
    }

    static /* synthetic */ void B(k5 k5Var, String str) {
        str.getClass();
        k5Var.zzd |= 1;
        k5Var.zze = str;
    }

    static /* synthetic */ void C(k5 k5Var, String str) {
        str.getClass();
        k5Var.zzd |= 2;
        k5Var.zzf = str;
    }

    static /* synthetic */ void D(k5 k5Var, int i10) {
        k5Var.zzd |= 4;
        k5Var.zzg = i10;
    }

    public static j5 F() {
        return (j5) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return n1.q(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new k5();
        }
        i5 i5Var = null;
        if (i11 == 4) {
            return new j5(i5Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
