package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class sc extends by3 implements kz3 {
    private static final sc zzb;
    private int zzd;
    private int zze = 2;

    static {
        sc scVar = new sc();
        zzb = scVar;
        by3.B(sc.class, scVar);
    }

    private sc() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zzd", "zze", tc.f15773a});
        }
        if (i11 == 3) {
            return new sc();
        }
        oc ocVar = null;
        if (i11 == 4) {
            return new rc(ocVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
