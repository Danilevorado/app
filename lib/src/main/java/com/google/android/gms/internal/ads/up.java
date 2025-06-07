package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class up extends by3 implements kz3 {
    private static final up zzb;
    private int zzd;
    private fq zze;
    private jq zzf;
    private lq zzg;
    private nq zzh;
    private wp zzi;
    private hq zzj;
    private dq zzk;
    private int zzl;
    private int zzm;
    private qp zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private long zzt;

    static {
        up upVar = new up();
        zzb = upVar;
        by3.B(up.class, upVar);
    }

    private up() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i11 == 3) {
            return new up();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new tp(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
