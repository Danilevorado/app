package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tr3 extends by3 implements kz3 {
    private static final tr3 zzb;
    private int zzd;
    private int zze;

    static {
        tr3 tr3Var = new tr3();
        zzb = tr3Var;
        by3.B(tr3.class, tr3Var);
    }

    private tr3() {
    }

    public static sr3 L() {
        return (sr3) zzb.G();
    }

    public static tr3 N() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new tr3();
        }
        rr3 rr3Var = null;
        if (i11 == 4) {
            return new sr3(rr3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zze;
    }

    public final int P() {
        int iB = kr3.b(this.zzd);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }
}
