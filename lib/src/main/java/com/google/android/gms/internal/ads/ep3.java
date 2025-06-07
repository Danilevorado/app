package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ep3 extends by3 implements kz3 {
    private static final ep3 zzb;
    private int zzd;

    static {
        ep3 ep3Var = new ep3();
        zzb = ep3Var;
        by3.B(ep3.class, ep3Var);
    }

    private ep3() {
    }

    public static dp3 L() {
        return (dp3) zzb.G();
    }

    public static ep3 N() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new ep3();
        }
        cp3 cp3Var = null;
        if (i11 == 4) {
            return new dp3(cp3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }
}
