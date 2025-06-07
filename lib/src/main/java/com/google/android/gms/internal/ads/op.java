package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class op extends by3 implements kz3 {
    private static final op zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private qp zzg;

    static {
        op opVar = new op();
        zzb = opVar;
        by3.B(op.class, opVar);
    }

    private op() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", eo.f7921a, "zzg"});
        }
        if (i11 == 3) {
            return new op();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new np(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
