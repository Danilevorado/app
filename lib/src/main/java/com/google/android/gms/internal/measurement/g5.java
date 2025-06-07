package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class g5 extends u8 implements z9 {
    private static final g5 zza;
    private a9 zze = u8.i();

    static {
        g5 g5Var = new g5();
        zza = g5Var;
        u8.n(g5.class, g5Var);
    }

    private g5() {
    }

    public static g5 x() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", i5.class});
        }
        if (i11 == 3) {
            return new g5();
        }
        e5 e5Var = null;
        if (i11 == 4) {
            return new f5(e5Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final int v() {
        return this.zze.size();
    }

    public final List y() {
        return this.zze;
    }
}
