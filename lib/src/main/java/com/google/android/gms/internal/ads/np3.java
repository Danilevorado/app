package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class np3 extends by3 implements kz3 {
    private static final np3 zzb;
    private int zzd;

    static {
        np3 np3Var = new np3();
        zzb = np3Var;
        by3.B(np3.class, np3Var);
    }

    private np3() {
    }

    public static mp3 L() {
        return (mp3) zzb.G();
    }

    public static np3 N() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new np3();
        }
        lp3 lp3Var = null;
        if (i11 == 4) {
            return new mp3(lp3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }
}
