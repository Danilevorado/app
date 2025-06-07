package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class i5 extends u8 implements z9 {
    private static final i5 zza;
    private int zze;
    private String zzf = "";
    private a9 zzg = u8.i();

    static {
        i5 i5Var = new i5();
        zza = i5Var;
        u8.n(i5.class, i5Var);
    }

    private i5() {
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", p5.class});
        }
        if (i11 == 3) {
            return new i5();
        }
        e5 e5Var = null;
        if (i11 == 4) {
            return new h5(e5Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final String w() {
        return this.zzf;
    }

    public final List x() {
        return this.zzg;
    }
}
