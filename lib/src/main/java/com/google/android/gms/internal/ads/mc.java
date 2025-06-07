package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mc extends by3 implements kz3 {
    private static final mc zzb;
    private int zzd;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private ky3 zzp = by3.u();

    static {
        mc mcVar = new mc();
        zzb = mcVar;
        by3.B(mc.class, mcVar);
    }

    private mc() {
    }

    public static ic K() {
        return (ic) zzb.G();
    }

    static /* synthetic */ void M(mc mcVar, long j10) {
        mcVar.zzd |= 2;
        mcVar.zzf = j10;
    }

    static /* synthetic */ void N(mc mcVar, String str) {
        str.getClass();
        mcVar.zzd |= 4;
        mcVar.zzg = str;
    }

    static /* synthetic */ void O(mc mcVar, String str) {
        str.getClass();
        mcVar.zzd |= 8;
        mcVar.zzh = str;
    }

    static /* synthetic */ void P(mc mcVar, String str) {
        mcVar.zzd |= 16;
        mcVar.zzi = str;
    }

    static /* synthetic */ void Q(mc mcVar, String str) {
        mcVar.zzd |= 1024;
        mcVar.zzo = str;
    }

    static /* synthetic */ void R(mc mcVar, String str) {
        str.getClass();
        mcVar.zzd |= 1;
        mcVar.zze = str;
    }

    static /* synthetic */ void S(mc mcVar, int i10) {
        mcVar.zzq = i10 - 1;
        mcVar.zzd |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", kc.class, "zzq", lc.f11444a});
        }
        if (i11 == 3) {
            return new mc();
        }
        hc hcVar = null;
        if (i11 == 4) {
            return new ic(hcVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
