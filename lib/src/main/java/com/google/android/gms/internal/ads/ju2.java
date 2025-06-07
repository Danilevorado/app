package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ju2 extends by3 implements kz3 {
    private static final ju2 zzb;
    private fu2 zzd;

    static {
        ju2 ju2Var = new ju2();
        zzb = ju2Var;
        by3.B(ju2.class, ju2Var);
    }

    private ju2() {
    }

    public static iu2 K() {
        return (iu2) zzb.G();
    }

    static /* synthetic */ void M(ju2 ju2Var, fu2 fu2Var) {
        fu2Var.getClass();
        ju2Var.zzd = fu2Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new ju2();
        }
        gu2 gu2Var = null;
        if (i11 == 4) {
            return new iu2(gu2Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
