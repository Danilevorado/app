package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ft3 extends by3 implements kz3 {
    private static final ft3 zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        ft3 ft3Var = new ft3();
        zzb = ft3Var;
        by3.B(ft3.class, ft3Var);
    }

    private ft3() {
    }

    public static et3 K() {
        return (et3) zzb.G();
    }

    static /* synthetic */ void M(ft3 ft3Var, String str) {
        str.getClass();
        ft3Var.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new ft3();
        }
        ct3 ct3Var = null;
        if (i11 == 4) {
            return new et3(ct3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
