package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class at3 extends by3 implements kz3 {
    private static final at3 zzb;
    private ns3 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        at3 at3Var = new at3();
        zzb = at3Var;
        by3.B(at3.class, at3Var);
    }

    private at3() {
    }

    public static zs3 M() {
        return (zs3) zzb.G();
    }

    static /* synthetic */ void P(at3 at3Var, ns3 ns3Var) {
        ns3Var.getClass();
        at3Var.zzd = ns3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new at3();
        }
        ws3 ws3Var = null;
        if (i11 == 4) {
            return new zs3(ws3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzf;
    }

    public final ns3 L() {
        ns3 ns3Var = this.zzd;
        return ns3Var == null ? ns3.N() : ns3Var;
    }

    public final ut3 O() {
        ut3 ut3VarB = ut3.b(this.zzg);
        return ut3VarB == null ? ut3.UNRECOGNIZED : ut3VarB;
    }

    public final boolean S() {
        return this.zzd != null;
    }

    public final int T() {
        int i10 = this.zze;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }
}
