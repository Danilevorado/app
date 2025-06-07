package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class in extends by3 implements kz3 {
    private static final in zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        in inVar = new in();
        zzb = inVar;
        by3.B(in.class, inVar);
    }

    private in() {
    }

    public static hn K() {
        return (hn) zzb.G();
    }

    public static in M() {
        return zzb;
    }

    static /* synthetic */ void N(in inVar, boolean z10) {
        inVar.zzd |= 1;
        inVar.zze = z10;
    }

    static /* synthetic */ void O(in inVar, int i10) {
        inVar.zzd |= 2;
        inVar.zzf = i10;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new in();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new hn(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
