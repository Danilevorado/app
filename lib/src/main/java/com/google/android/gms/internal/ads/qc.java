package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qc extends by3 implements kz3 {
    private static final qc zzb;
    private int zzd;
    private sc zze;
    private vc zzf;

    static {
        qc qcVar = new qc();
        zzb = qcVar;
        by3.B(qc.class, qcVar);
    }

    private qc() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new qc();
        }
        oc ocVar = null;
        if (i11 == 4) {
            return new pc(ocVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
