package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class en extends by3 implements kz3 {
    private static final en zzb;
    private int zzd;
    private int zze;
    private in zzf;
    private kn zzg;

    static {
        en enVar = new en();
        zzb = enVar;
        by3.B(en.class, enVar);
    }

    private en() {
    }

    public static dn K() {
        return (dn) zzb.G();
    }

    static /* synthetic */ void M(en enVar, in inVar) {
        inVar.getClass();
        enVar.zzf = inVar;
        enVar.zzd |= 2;
    }

    static /* synthetic */ void N(en enVar, kn knVar) {
        knVar.getClass();
        enVar.zzg = knVar;
        enVar.zzd |= 4;
    }

    static /* synthetic */ void O(en enVar, int i10) {
        enVar.zze = 1;
        enVar.zzd = 1 | enVar.zzd;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", gn.f8818a, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new en();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new dn(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
