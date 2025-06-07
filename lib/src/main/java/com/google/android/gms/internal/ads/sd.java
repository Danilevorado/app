package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class sd extends by3 implements kz3 {
    private static final sd zzb;
    private int zzd;
    private long zzt;
    private long zzu;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = AdError.NETWORK_ERROR_CODE;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = AdError.NETWORK_ERROR_CODE;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        sd sdVar = new sd();
        zzb = sdVar;
        by3.B(sd.class, sdVar);
    }

    private sd() {
    }

    public static rd K() {
        return (rd) zzb.G();
    }

    static /* synthetic */ void M(sd sdVar, long j10) {
        sdVar.zzd |= 1;
        sdVar.zze = j10;
    }

    static /* synthetic */ void N(sd sdVar, long j10) {
        sdVar.zzd |= 2;
        sdVar.zzf = j10;
    }

    static /* synthetic */ void O(sd sdVar, long j10) {
        sdVar.zzd |= 4;
        sdVar.zzg = j10;
    }

    static /* synthetic */ void P(sd sdVar, long j10) {
        sdVar.zzd |= 8;
        sdVar.zzh = j10;
    }

    static /* synthetic */ void Q(sd sdVar) {
        sdVar.zzd &= -9;
        sdVar.zzh = -1L;
    }

    static /* synthetic */ void R(sd sdVar, long j10) {
        sdVar.zzd |= 16;
        sdVar.zzi = j10;
    }

    static /* synthetic */ void S(sd sdVar, long j10) {
        sdVar.zzd |= 32;
        sdVar.zzj = j10;
    }

    static /* synthetic */ void T(sd sdVar, long j10) {
        sdVar.zzd |= 128;
        sdVar.zzl = j10;
    }

    static /* synthetic */ void U(sd sdVar, long j10) {
        sdVar.zzd |= 256;
        sdVar.zzm = j10;
    }

    static /* synthetic */ void V(sd sdVar, long j10) {
        sdVar.zzd |= 512;
        sdVar.zzn = j10;
    }

    static /* synthetic */ void W(sd sdVar, long j10) {
        sdVar.zzd |= 2048;
        sdVar.zzp = j10;
    }

    static /* synthetic */ void X(sd sdVar, long j10) {
        sdVar.zzd |= 4096;
        sdVar.zzq = j10;
    }

    static /* synthetic */ void Y(sd sdVar, long j10) {
        sdVar.zzd |= 8192;
        sdVar.zzr = j10;
    }

    static /* synthetic */ void Z(sd sdVar, long j10) {
        sdVar.zzd |= 16384;
        sdVar.zzs = j10;
    }

    static /* synthetic */ void a0(sd sdVar, long j10) {
        sdVar.zzd |= 32768;
        sdVar.zzt = j10;
    }

    static /* synthetic */ void b0(sd sdVar, long j10) {
        sdVar.zzd |= 65536;
        sdVar.zzu = j10;
    }

    static /* synthetic */ void c0(sd sdVar, long j10) {
        sdVar.zzd |= 131072;
        sdVar.zzv = j10;
    }

    static /* synthetic */ void d0(sd sdVar, long j10) {
        sdVar.zzd |= 262144;
        sdVar.zzw = j10;
    }

    static /* synthetic */ void e0(sd sdVar, int i10) {
        sdVar.zzk = i10 - 1;
        sdVar.zzd |= 64;
    }

    static /* synthetic */ void f0(sd sdVar, int i10) {
        sdVar.zzo = i10 - 1;
        sdVar.zzd |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            fy3 fy3Var = be.f6435a;
            return by3.y(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", fy3Var, "zzl", "zzm", "zzn", "zzo", fy3Var, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        }
        if (i11 == 3) {
            return new sd();
        }
        wc wcVar = null;
        if (i11 == 4) {
            return new rd(wcVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
