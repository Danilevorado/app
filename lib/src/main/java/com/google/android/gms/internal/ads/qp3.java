package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qp3 extends by3 implements kz3 {
    private static final qp3 zzb;
    private int zzd;
    private ww3 zze = ww3.f17284n;

    static {
        qp3 qp3Var = new qp3();
        zzb = qp3Var;
        by3.B(qp3.class, qp3Var);
    }

    private qp3() {
    }

    public static pp3 L() {
        return (pp3) zzb.G();
    }

    public static qp3 N(ww3 ww3Var, qx3 qx3Var) {
        return (qp3) by3.o(zzb, ww3Var, qx3Var);
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new qp3();
        }
        op3 op3Var = null;
        if (i11 == 4) {
            return new pp3(op3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }

    public final ww3 O() {
        return this.zze;
    }
}
