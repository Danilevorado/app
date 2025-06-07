package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class oo3 extends by3 implements kz3 {
    private static final oo3 zzb;
    private int zzd;

    static {
        oo3 oo3Var = new oo3();
        zzb = oo3Var;
        by3.B(oo3.class, oo3Var);
    }

    private oo3() {
    }

    public static no3 L() {
        return (no3) zzb.G();
    }

    public static oo3 N() {
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
            return new oo3();
        }
        mo3 mo3Var = null;
        if (i11 == 4) {
            return new no3(mo3Var);
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
