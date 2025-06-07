package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class n3 extends u8 implements z9 {
    private static final n3 zza;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private a9 zzi = u8.i();

    static {
        n3 n3Var = new n3();
        zza = n3Var;
        u8.n(n3.class, n3Var);
    }

    private n3() {
    }

    public static n3 x() {
        return zza;
    }

    public final boolean A() {
        return this.zzh;
    }

    public final boolean B() {
        return (this.zze & 4) != 0;
    }

    public final boolean C() {
        return (this.zze & 2) != 0;
    }

    public final boolean D() {
        return (this.zze & 1) != 0;
    }

    public final int E() {
        int iA = m3.a(this.zzf);
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
            return u8.m(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", l3.f19059a, "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new n3();
        }
        v2 v2Var = null;
        if (i11 == 4) {
            return new j3(v2Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final int v() {
        return this.zzi.size();
    }

    public final String y() {
        return this.zzg;
    }

    public final List z() {
        return this.zzi;
    }
}
