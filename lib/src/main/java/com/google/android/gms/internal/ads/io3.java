package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class io3 extends by3 implements kz3 {
    private static final io3 zzb;
    private int zzd;
    private ww3 zze = ww3.f17284n;
    private oo3 zzf;

    static {
        io3 io3Var = new io3();
        zzb = io3Var;
        by3.B(io3.class, io3Var);
    }

    private io3() {
    }

    public static ho3 L() {
        return (ho3) zzb.G();
    }

    public static io3 N(ww3 ww3Var, qx3 qx3Var) {
        return (io3) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void S(io3 io3Var, oo3 oo3Var) {
        oo3Var.getClass();
        io3Var.zzf = oo3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new io3();
        }
        go3 go3Var = null;
        if (i11 == 4) {
            return new ho3(go3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }

    public final oo3 O() {
        oo3 oo3Var = this.zzf;
        return oo3Var == null ? oo3.N() : oo3Var;
    }

    public final ww3 P() {
        return this.zze;
    }
}
