package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class x4 extends u8 implements z9 {
    private static final x4 zza;
    private int zze;
    private int zzf = 1;
    private a9 zzg = u8.i();

    static {
        x4 x4Var = new x4();
        zza = x4Var;
        u8.n(x4.class, x4Var);
    }

    private x4() {
    }

    public static v4 v() {
        return (v4) zza.r();
    }

    static /* synthetic */ void x(x4 x4Var, l4 l4Var) {
        l4Var.getClass();
        a9 a9Var = x4Var.zzg;
        if (!a9Var.d()) {
            x4Var.zzg = u8.j(a9Var);
        }
        x4Var.zzg.add(l4Var);
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", w4.f19382a, "zzg", l4.class});
        }
        if (i11 == 3) {
            return new x4();
        }
        a4 a4Var = null;
        if (i11 == 4) {
            return new v4(a4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
