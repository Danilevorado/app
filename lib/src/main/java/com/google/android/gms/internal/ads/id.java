package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class id extends by3 implements kz3 {
    private static final id zzb;
    private int zzd;
    private long zze = -1;

    static {
        id idVar = new id();
        zzb = idVar;
        by3.B(id.class, idVar);
    }

    private id() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new id();
        }
        wc wcVar = null;
        if (i11 == 4) {
            return new hd(wcVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
