package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class q4 extends n1 implements v2 {
    private static final q4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private a5 zzh;

    static {
        q4 q4Var = new q4();
        zzb = q4Var;
        n1.t(q4.class, q4Var);
    }

    private q4() {
    }

    public static q4 B(byte[] bArr, c1 c1Var) {
        return (q4) n1.m(zzb, bArr, c1Var);
    }

    static /* synthetic */ void C(q4 q4Var, a5 a5Var) {
        a5Var.getClass();
        q4Var.zzh = a5Var;
        q4Var.zzd |= 2;
    }

    static /* synthetic */ void D(q4 q4Var, int i10) {
        q4Var.zzg = i10 - 1;
        q4Var.zzd |= 1;
    }

    public static p4 F() {
        return (p4) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.n1
    protected final Object x(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return n1.q(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", r4.f19634a, "zzh", r5.class});
        }
        if (i11 == 3) {
            return new q4();
        }
        o4 o4Var = null;
        if (i11 == 4) {
            return new p4(o4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
