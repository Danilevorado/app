package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class rq3 extends by3 implements kz3 {
    private static final rq3 zzb;
    private ss3 zzd;

    static {
        rq3 rq3Var = new rq3();
        zzb = rq3Var;
        by3.B(rq3.class, rq3Var);
    }

    private rq3() {
    }

    public static qq3 K() {
        return (qq3) zzb.G();
    }

    public static rq3 M() {
        return zzb;
    }

    static /* synthetic */ void O(rq3 rq3Var, ss3 ss3Var) {
        ss3Var.getClass();
        rq3Var.zzd = ss3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new rq3();
        }
        pq3 pq3Var = null;
        if (i11 == 4) {
            return new qq3(pq3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final ss3 N() {
        ss3 ss3Var = this.zzd;
        return ss3Var == null ? ss3.M() : ss3Var;
    }
}
