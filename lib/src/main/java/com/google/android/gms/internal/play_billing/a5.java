package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class a5 extends n1 implements v2 {
    private static final a5 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        a5 a5Var = new a5();
        zzb = a5Var;
        n1.t(a5.class, a5Var);
    }

    private a5() {
    }

    static /* synthetic */ void B(a5 a5Var, int i10) {
        a5Var.zzd |= 1;
        a5Var.zze = i10;
    }

    static /* synthetic */ void C(a5 a5Var, String str) {
        str.getClass();
        a5Var.zzd |= 2;
        a5Var.zzf = str;
    }

    static /* synthetic */ void D(a5 a5Var, String str) {
        a5Var.zzd |= 8;
        a5Var.zzh = str;
    }

    static /* synthetic */ void F(a5 a5Var, int i10) {
        a5Var.zzg = i10 - 1;
        a5Var.zzd |= 4;
    }

    public static w4 G() {
        return (w4) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return n1.q(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", y4.f19712a, "zzh"});
        }
        if (i11 == 3) {
            return new a5();
        }
        v4 v4Var = null;
        if (i11 == 4) {
            return new w4(v4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
