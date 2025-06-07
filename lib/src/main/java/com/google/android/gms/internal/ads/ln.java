package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ln extends by3 implements kz3 {
    private static final ln zzb;
    private ky3 zzd = by3.u();

    static {
        ln lnVar = new ln();
        zzb = lnVar;
        by3.B(ln.class, lnVar);
    }

    private ln() {
    }

    public static fn K() {
        return (fn) zzb.G();
    }

    static /* synthetic */ void M(ln lnVar, en enVar) {
        enVar.getClass();
        ky3 ky3Var = lnVar.zzd;
        if (!ky3Var.d()) {
            lnVar.zzd = by3.v(ky3Var);
        }
        lnVar.zzd.add(enVar);
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", en.class});
        }
        if (i11 == 3) {
            return new ln();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new fn(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
