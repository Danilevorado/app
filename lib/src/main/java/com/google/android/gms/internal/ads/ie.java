package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ie extends by3 implements kz3 {
    private static final ie zzb;
    private int zzd;
    private ky3 zze = by3.u();
    private ww3 zzf = ww3.f17284n;
    private int zzg = 1;
    private int zzh = 1;

    static {
        ie ieVar = new ie();
        zzb = ieVar;
        by3.B(ie.class, ieVar);
    }

    private ie() {
    }

    public static he K() {
        return (he) zzb.G();
    }

    static /* synthetic */ void M(ie ieVar, ww3 ww3Var) {
        ky3 ky3Var = ieVar.zze;
        if (!ky3Var.d()) {
            ieVar.zze = by3.v(ky3Var);
        }
        ieVar.zze.add(ww3Var);
    }

    static /* synthetic */ void N(ie ieVar, ww3 ww3Var) {
        ieVar.zzd |= 1;
        ieVar.zzf = ww3Var;
    }

    static /* synthetic */ void O(ie ieVar, int i10) {
        ieVar.zzh = i10 - 1;
        ieVar.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", ce.f6883a, "zzh", ae.f6049a});
        }
        if (i11 == 3) {
            return new ie();
        }
        wc wcVar = null;
        if (i11 == 4) {
            return new he(wcVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
