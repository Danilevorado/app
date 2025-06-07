package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vc extends by3 implements kz3 {
    private static final vc zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        vc vcVar = new vc();
        zzb = vcVar;
        by3.B(vc.class, vcVar);
    }

    private vc() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new vc();
        }
        oc ocVar = null;
        if (i11 == 4) {
            return new uc(ocVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
