package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jo extends by3 implements kz3 {
    private static final jo zzb;
    private int zzd;
    private int zzf;
    private qp zzh;
    private String zze = "";
    private gy3 zzg = by3.r();

    static {
        jo joVar = new jo();
        zzb = joVar;
        by3.B(jo.class, joVar);
    }

    private jo() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", eo.f7921a, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new jo();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new io(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
