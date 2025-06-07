package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class v3 extends u8 implements z9 {
    private static final v3 zza;
    private int zze;
    private long zzf;
    private int zzh;
    private boolean zzm;
    private String zzg = "";
    private a9 zzi = u8.i();
    private a9 zzj = u8.i();
    private a9 zzk = u8.i();
    private String zzl = "";
    private a9 zzn = u8.i();
    private a9 zzo = u8.i();
    private String zzp = "";

    static {
        v3 v3Var = new v3();
        zza = v3Var;
        u8.n(v3.class, v3Var);
    }

    private v3() {
    }

    public static v3 B() {
        return zza;
    }

    static /* synthetic */ void I(v3 v3Var, int i10, t3 t3Var) {
        t3Var.getClass();
        a9 a9Var = v3Var.zzj;
        if (!a9Var.d()) {
            v3Var.zzj = u8.j(a9Var);
        }
        v3Var.zzj.set(i10, t3Var);
    }

    public static u3 z() {
        return (u3) zza.r();
    }

    public final String C() {
        return this.zzg;
    }

    public final String D() {
        return this.zzp;
    }

    public final List E() {
        return this.zzk;
    }

    public final List F() {
        return this.zzo;
    }

    public final List G() {
        return this.zzn;
    }

    public final List H() {
        return this.zzi;
    }

    public final boolean K() {
        return this.zzm;
    }

    public final boolean L() {
        return (this.zze & 2) != 0;
    }

    public final boolean M() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", z3.class, "zzj", t3.class, "zzk", x2.class, "zzl", "zzm", "zzn", k5.class, "zzo", r3.class, "zzp"});
        }
        if (i11 == 3) {
            return new v3();
        }
        o3 o3Var = null;
        if (i11 == 4) {
            return new u3(o3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final int v() {
        return this.zzn.size();
    }

    public final int w() {
        return this.zzj.size();
    }

    public final long x() {
        return this.zzf;
    }

    public final t3 y(int i10) {
        return (t3) this.zzj.get(i10);
    }
}
