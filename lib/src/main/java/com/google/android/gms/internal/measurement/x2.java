package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class x2 extends u8 implements z9 {
    private static final x2 zza;
    private int zze;
    private int zzf;
    private a9 zzg = u8.i();
    private a9 zzh = u8.i();
    private boolean zzi;
    private boolean zzj;

    static {
        x2 x2Var = new x2();
        zza = x2Var;
        u8.n(x2.class, x2Var);
    }

    private x2() {
    }

    static /* synthetic */ void D(x2 x2Var, int i10, i3 i3Var) {
        i3Var.getClass();
        a9 a9Var = x2Var.zzg;
        if (!a9Var.d()) {
            x2Var.zzg = u8.j(a9Var);
        }
        x2Var.zzg.set(i10, i3Var);
    }

    static /* synthetic */ void E(x2 x2Var, int i10, z2 z2Var) {
        z2Var.getClass();
        a9 a9Var = x2Var.zzh;
        if (!a9Var.d()) {
            x2Var.zzh = u8.j(a9Var);
        }
        x2Var.zzh.set(i10, z2Var);
    }

    public final i3 A(int i10) {
        return (i3) this.zzg.get(i10);
    }

    public final List B() {
        return this.zzh;
    }

    public final List C() {
        return this.zzg;
    }

    public final boolean F() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", i3.class, "zzh", z2.class, "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new x2();
        }
        v2 v2Var = null;
        if (i11 == 4) {
            return new w2(v2Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final int v() {
        return this.zzf;
    }

    public final int w() {
        return this.zzh.size();
    }

    public final int x() {
        return this.zzg.size();
    }

    public final z2 z(int i10) {
        return (z2) this.zzh.get(i10);
    }
}
