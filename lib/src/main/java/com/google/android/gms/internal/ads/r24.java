package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class r24 extends by3 implements kz3 {
    private static final r24 zzb;
    private int zzd;
    private int zze;
    private d24 zzg;
    private h24 zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private gy3 zzj = by3.r();
    private String zzk = "";
    private ky3 zzm = by3.u();

    static {
        r24 r24Var = new r24();
        zzb = r24Var;
        by3.B(r24.class, r24Var);
    }

    private r24() {
    }

    public static q24 L() {
        return (q24) zzb.G();
    }

    static /* synthetic */ void O(r24 r24Var, int i10) {
        r24Var.zzd |= 1;
        r24Var.zze = i10;
    }

    static /* synthetic */ void P(r24 r24Var, String str) {
        str.getClass();
        r24Var.zzd |= 2;
        r24Var.zzf = str;
    }

    static /* synthetic */ void Q(r24 r24Var, d24 d24Var) {
        d24Var.getClass();
        r24Var.zzg = d24Var;
        r24Var.zzd |= 4;
    }

    static /* synthetic */ void R(r24 r24Var, String str) {
        str.getClass();
        ky3 ky3Var = r24Var.zzm;
        if (!ky3Var.d()) {
            r24Var.zzm = by3.v(ky3Var);
        }
        r24Var.zzm.add(str);
    }

    static /* synthetic */ void S(r24 r24Var, int i10) {
        r24Var.zzl = i10 - 1;
        r24Var.zzd |= 64;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzn);
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", o24.f12968a, "zzm"});
        }
        if (i11 == 3) {
            return new r24();
        }
        c14 c14Var = null;
        if (i11 == 4) {
            return new q24(c14Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzn = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int K() {
        return this.zzm.size();
    }

    public final String N() {
        return this.zzf;
    }
}
