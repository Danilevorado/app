package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mq3 extends by3 implements kz3 {
    private static final mq3 zzb;

    static {
        mq3 mq3Var = new mq3();
        zzb = mq3Var;
        by3.B(mq3.class, mq3Var);
    }

    private mq3() {
    }

    public static mq3 L() {
        return zzb;
    }

    public static mq3 M(ww3 ww3Var, qx3 qx3Var) {
        return (mq3) by3.o(zzb, ww3Var, qx3Var);
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        kq3 kq3Var = null;
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0000", null);
        }
        if (i11 == 3) {
            return new mq3();
        }
        if (i11 == 4) {
            return new lq3(kq3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
