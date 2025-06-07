package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class cj extends by3 implements kz3 {
    private static final cj zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        cj cjVar = new cj();
        zzb = cjVar;
        by3.B(cj.class, cjVar);
    }

    private cj() {
    }

    public static bj N() {
        return (bj) zzb.G();
    }

    public static cj P() {
        return zzb;
    }

    public static cj Q(ww3 ww3Var) {
        return (cj) by3.l(zzb, ww3Var);
    }

    public static cj R(ww3 ww3Var, qx3 qx3Var) {
        return (cj) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void U(cj cjVar, String str) {
        str.getClass();
        cjVar.zzd |= 1;
        cjVar.zze = str;
    }

    static /* synthetic */ void V(cj cjVar, long j10) {
        cjVar.zzd |= 16;
        cjVar.zzi = j10;
    }

    static /* synthetic */ void W(cj cjVar, String str) {
        str.getClass();
        cjVar.zzd |= 2;
        cjVar.zzf = str;
    }

    static /* synthetic */ void X(cj cjVar, long j10) {
        cjVar.zzd |= 4;
        cjVar.zzg = j10;
    }

    static /* synthetic */ void Y(cj cjVar, long j10) {
        cjVar.zzd |= 8;
        cjVar.zzh = j10;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new cj();
        }
        aj ajVar = null;
        if (i11 == 4) {
            return new bj(ajVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final long K() {
        return this.zzh;
    }

    public final long L() {
        return this.zzg;
    }

    public final long M() {
        return this.zzi;
    }

    public final String S() {
        return this.zzf;
    }

    public final String T() {
        return this.zze;
    }
}
