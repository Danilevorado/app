package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qn extends by3 implements kz3 {
    private static final qn zzb;
    private int zzd;
    private int zze;
    private mp zzf;

    static {
        qn qnVar = new qn();
        zzb = qnVar;
        by3.B(qn.class, qnVar);
    }

    private qn() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", nn.f12714a, "zzf"});
        }
        if (i11 == 3) {
            return new qn();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new pn(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
