package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class h34 extends by3 implements kz3 {
    private static final h34 zzb;
    private int zzd;
    private boolean zzk;
    private double zzl;
    private int zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private String zze = "";
    private String zzf = "";
    private int zzg = 4;
    private ky3 zzh = by3.u();
    private String zzi = "";
    private String zzj = "";
    private ky3 zzm = by3.u();

    static {
        h34 h34Var = new h34();
        zzb = h34Var;
        by3.B(h34.class, h34Var);
    }

    private h34() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဌ\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\nဌ\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzd", "zze", "zzg", g34.f8595a, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", f34.class, "zzf", "zzn", d34.f7180a, "zzo", "zzp", "zzq", "zzr"});
        }
        if (i11 == 3) {
            return new h34();
        }
        c14 c14Var = null;
        if (i11 == 4) {
            return new c34(c14Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
