package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class xt3 extends by3 implements kz3 {
    private static final xt3 zzb;
    private String zzd = "";
    private ky3 zze = by3.u();

    static {
        xt3 xt3Var = new xt3();
        zzb = xt3Var;
        by3.B(xt3.class, xt3Var);
    }

    private xt3() {
    }

    public static xt3 L() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", vs3.class});
        }
        if (i11 == 3) {
            return new xt3();
        }
        vt3 vt3Var = null;
        if (i11 == 4) {
            return new wt3(vt3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final List M() {
        return this.zze;
    }
}
