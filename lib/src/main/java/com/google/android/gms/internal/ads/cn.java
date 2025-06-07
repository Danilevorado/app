package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class cn extends by3 implements kz3 {
    private static final cn zzb;
    private int zzd;
    private int zze;
    private sn zzg;
    private un zzh;
    private wn zzj;
    private ip zzk;
    private xo zzl;
    private lo zzm;
    private no zzn;
    private int zzf = AdError.NETWORK_ERROR_CODE;
    private ky3 zzi = by3.u();
    private ky3 zzo = by3.u();

    static {
        cn cnVar = new cn();
        zzb = cnVar;
        by3.B(cn.class, cnVar);
    }

    private cn() {
    }

    public static cn L() {
        return zzb;
    }

    static /* synthetic */ void N(cn cnVar, an anVar) {
        cnVar.zze = anVar.a();
        cnVar.zzd |= 1;
    }

    static /* synthetic */ void O(cn cnVar, un unVar) {
        unVar.getClass();
        cnVar.zzh = unVar;
        cnVar.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzd", "zze", zm.f18636a, "zzf", eo.f7921a, "zzg", "zzh", "zzi", qn.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", up.class});
        }
        if (i11 == 3) {
            return new cn();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new bn(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final un M() {
        un unVar = this.zzh;
        return unVar == null ? un.L() : unVar;
    }
}
