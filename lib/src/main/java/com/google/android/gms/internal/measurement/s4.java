package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class s4 extends u8 implements z9 {
    private static final s4 zza;
    private a9 zze = u8.i();

    static {
        s4 s4Var = new s4();
        zza = s4Var;
        u8.n(s4.class, s4Var);
    }

    private s4() {
    }

    public static q4 v() {
        return (q4) zza.r();
    }

    static /* synthetic */ void z(s4 s4Var, u4 u4Var) {
        u4Var.getClass();
        a9 a9Var = s4Var.zze;
        if (!a9Var.d()) {
            s4Var.zze = u8.j(a9Var);
        }
        s4Var.zze.add(u4Var);
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", u4.class});
        }
        if (i11 == 3) {
            return new s4();
        }
        a4 a4Var = null;
        if (i11 == 4) {
            return new q4(a4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    public final u4 x(int i10) {
        return (u4) this.zze.get(0);
    }

    public final List y() {
        return this.zze;
    }
}
