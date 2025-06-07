package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class kn extends by3 implements kz3 {
    private static final kn zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        kn knVar = new kn();
        zzb = knVar;
        by3.B(kn.class, knVar);
    }

    private kn() {
    }

    public static jn K() {
        return (jn) zzb.G();
    }

    static /* synthetic */ void M(kn knVar, boolean z10) {
        knVar.zzd |= 1;
        knVar.zze = z10;
    }

    static /* synthetic */ void N(kn knVar, boolean z10) {
        knVar.zzd |= 2;
        knVar.zzf = z10;
    }

    static /* synthetic */ void O(kn knVar, int i10) {
        knVar.zzd |= 4;
        knVar.zzg = i10;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new kn();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new jn(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
