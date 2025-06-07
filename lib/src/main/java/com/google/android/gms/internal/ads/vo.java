package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vo extends by3 implements kz3 {
    private static final vo zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        vo voVar = new vo();
        zzb = voVar;
        by3.B(vo.class, voVar);
    }

    private vo() {
    }

    public static oo K() {
        return (oo) zzb.G();
    }

    public static vo M() {
        return zzb;
    }

    static /* synthetic */ void R(vo voVar, int i10) {
        voVar.zze = i10 - 1;
        voVar.zzd |= 1;
    }

    static /* synthetic */ void S(vo voVar, int i10) {
        voVar.zzf = i10 - 1;
        voVar.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", to.f15935a, "zzf", qo.f14428a});
        }
        if (i11 == 3) {
            return new vo();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new oo(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean N() {
        return (this.zzd & 2) != 0;
    }

    public final boolean O() {
        return (this.zzd & 1) != 0;
    }

    public final int P() {
        int iA = ro.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int Q() {
        int iA = uo.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
