package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ku2 extends by3 implements kz3 {
    private static final ku2 zzb;
    private ky3 zzd = by3.u();

    static {
        ku2 ku2Var = new ku2();
        zzb = ku2Var;
        by3.B(ku2.class, ku2Var);
    }

    private ku2() {
    }

    public static hu2 L() {
        return (hu2) zzb.G();
    }

    static /* synthetic */ void O(ku2 ku2Var, ju2 ju2Var) {
        ju2Var.getClass();
        ky3 ky3Var = ku2Var.zzd;
        if (!ky3Var.d()) {
            ku2Var.zzd = by3.v(ky3Var);
        }
        ku2Var.zzd.add(ju2Var);
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", ju2.class});
        }
        if (i11 == 3) {
            return new ku2();
        }
        gu2 gu2Var = null;
        if (i11 == 4) {
            return new hu2(gu2Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd.size();
    }
}
