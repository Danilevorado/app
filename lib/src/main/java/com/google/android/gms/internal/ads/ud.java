package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ud extends by3 implements kz3 {
    private static final ud zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        ud udVar = new ud();
        zzb = udVar;
        by3.B(ud.class, udVar);
    }

    private ud() {
    }

    public static td K() {
        return (td) zzb.G();
    }

    static /* synthetic */ void M(ud udVar, long j10) {
        udVar.zzd |= 1;
        udVar.zze = j10;
    }

    static /* synthetic */ void N(ud udVar, long j10) {
        udVar.zzd |= 4;
        udVar.zzg = j10;
    }

    static /* synthetic */ void O(ud udVar, long j10) {
        udVar.zzd |= 8;
        udVar.zzh = j10;
    }

    static /* synthetic */ void P(ud udVar, long j10) {
        udVar.zzd |= 16;
        udVar.zzi = j10;
    }

    static /* synthetic */ void Q(ud udVar, long j10) {
        udVar.zzd |= 32;
        udVar.zzj = j10;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new ud();
        }
        wc wcVar = null;
        if (i11 == 4) {
            return new td(wcVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
