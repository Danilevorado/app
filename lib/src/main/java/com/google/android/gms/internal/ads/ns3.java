package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ns3 extends by3 implements kz3 {
    private static final ns3 zzb;
    private String zzd = "";
    private ww3 zze = ww3.f17284n;
    private int zzf;

    static {
        ns3 ns3Var = new ns3();
        zzb = ns3Var;
        by3.B(ns3.class, ns3Var);
    }

    private ns3() {
    }

    public static ks3 K() {
        return (ks3) zzb.G();
    }

    public static ns3 N() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new ns3();
        }
        js3 js3Var = null;
        if (i11 == 4) {
            return new ks3(js3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final ms3 L() {
        int i10 = this.zzf;
        ms3 ms3Var = ms3.UNKNOWN_KEYMATERIAL;
        if (i10 != 0) {
            ms3Var = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? null : ms3.REMOTE : ms3.ASYMMETRIC_PUBLIC : ms3.ASYMMETRIC_PRIVATE : ms3.SYMMETRIC;
        }
        return ms3Var == null ? ms3.UNRECOGNIZED : ms3Var;
    }

    public final ww3 O() {
        return this.zze;
    }

    public final String P() {
        return this.zzd;
    }
}
