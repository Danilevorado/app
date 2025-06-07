package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class wn extends by3 implements kz3 {
    private static final wn zzb;
    private int zzd;
    private int zze;
    private qp zzf;
    private qp zzg;
    private qp zzh;
    private ky3 zzi = by3.u();
    private int zzj;

    static {
        wn wnVar = new wn();
        zzb = wnVar;
        by3.B(wn.class, wnVar);
    }

    private wn() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", qp.class, "zzj"});
        }
        if (i11 == 3) {
            return new wn();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new vn(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
