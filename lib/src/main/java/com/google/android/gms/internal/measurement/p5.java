package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class p5 extends u8 implements z9 {
    private static final p5 zza;
    private int zze;
    private int zzf;
    private a9 zzg = u8.i();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        p5 p5Var = new p5();
        zza = p5Var;
        u8.n(p5.class, p5Var);
    }

    private p5() {
    }

    public final boolean A() {
        return this.zzj;
    }

    public final boolean B() {
        return (this.zze & 8) != 0;
    }

    public final boolean C() {
        return (this.zze & 16) != 0;
    }

    public final boolean D() {
        return (this.zze & 4) != 0;
    }

    public final int E() {
        int iA = o5.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", n5.f19130a, "zzg", p5.class, "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new p5();
        }
        e5 e5Var = null;
        if (i11 == 4) {
            return new l5(e5Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final double v() {
        return this.zzk;
    }

    public final String x() {
        return this.zzh;
    }

    public final String y() {
        return this.zzi;
    }

    public final List z() {
        return this.zzg;
    }
}
