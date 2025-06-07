package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class sp extends by3 implements kz3 {
    private static final sp zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        sp spVar = new sp();
        zzb = spVar;
        by3.B(sp.class, spVar);
    }

    private sp() {
    }

    public static rp K() {
        return (rp) zzb.G();
    }

    static /* synthetic */ void M(sp spVar, int i10) {
        spVar.zzd |= 1;
        spVar.zze = i10;
    }

    static /* synthetic */ void N(sp spVar, int i10) {
        spVar.zzd |= 2;
        spVar.zzf = i10;
    }

    static /* synthetic */ void O(sp spVar, int i10) {
        spVar.zzd |= 4;
        spVar.zzg = i10;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new sp();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new rp(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
