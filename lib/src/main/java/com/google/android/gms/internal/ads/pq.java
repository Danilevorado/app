package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pq extends by3 implements kz3 {
    private static final pq zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        pq pqVar = new pq();
        zzb = pqVar;
        by3.B(pq.class, pqVar);
    }

    private pq() {
    }

    public static oq K() {
        return (oq) zzb.G();
    }

    static /* synthetic */ void M(pq pqVar, boolean z10) {
        pqVar.zzd |= 1;
        pqVar.zze = z10;
    }

    static /* synthetic */ void N(pq pqVar, int i10) {
        pqVar.zzd |= 2;
        pqVar.zzf = i10;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new pq();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new oq(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean O() {
        return this.zze;
    }
}
