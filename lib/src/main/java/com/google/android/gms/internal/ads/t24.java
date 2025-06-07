package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class t24 extends by3 implements kz3 {
    private static final t24 zzb;
    private int zzd;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        t24 t24Var = new t24();
        zzb = t24Var;
        by3.B(t24.class, t24Var);
    }

    private t24() {
    }

    public static s24 K() {
        return (s24) zzb.G();
    }

    static /* synthetic */ void M(t24 t24Var, String str) {
        t24Var.zzd |= 1;
        t24Var.zze = str;
    }

    static /* synthetic */ void N(t24 t24Var, long j10) {
        t24Var.zzd |= 2;
        t24Var.zzf = j10;
    }

    static /* synthetic */ void O(t24 t24Var, boolean z10) {
        t24Var.zzd |= 4;
        t24Var.zzg = z10;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", u24.f16146a, "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new t24();
        }
        c14 c14Var = null;
        if (i11 == 4) {
            return new s24(c14Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
