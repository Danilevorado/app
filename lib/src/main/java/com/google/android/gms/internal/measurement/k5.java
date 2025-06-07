package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class k5 extends u8 implements z9 {
    private static final k5 zza;
    private int zze;
    private a9 zzf = u8.i();
    private g5 zzg;

    static {
        k5 k5Var = new k5();
        zza = k5Var;
        u8.n(k5.class, k5Var);
    }

    private k5() {
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", p5.class, "zzg"});
        }
        if (i11 == 3) {
            return new k5();
        }
        e5 e5Var = null;
        if (i11 == 4) {
            return new j5(e5Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final g5 v() {
        g5 g5Var = this.zzg;
        return g5Var == null ? g5.x() : g5Var;
    }

    public final List x() {
        return this.zzf;
    }
}
