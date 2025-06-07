package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class p14 extends by3 implements kz3 {
    private static final p14 zzb;
    private int zzd;
    private String zze = "";

    static {
        p14 p14Var = new p14();
        zzb = p14Var;
        by3.B(p14.class, p14Var);
    }

    private p14() {
    }

    public static o14 K() {
        return (o14) zzb.G();
    }

    static /* synthetic */ void M(p14 p14Var, String str) {
        p14Var.zzd |= 1;
        p14Var.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new p14();
        }
        c14 c14Var = null;
        if (i11 == 4) {
            return new o14(c14Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
