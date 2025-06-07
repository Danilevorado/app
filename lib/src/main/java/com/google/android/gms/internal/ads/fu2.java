package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class fu2 extends by3 implements kz3 {
    private static final fu2 zzb;
    private long zzF;
    private int zzd;
    private boolean zze;
    private long zzf;
    private int zzg;
    private int zzm;
    private int zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private jy3 zzp = by3.t();
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzz = "";
    private String zzA = "";
    private String zzB = "";
    private String zzC = "";
    private String zzD = "";
    private String zzE = "";

    static {
        fu2 fu2Var = new fu2();
        zzb = fu2Var;
        by3.B(fu2.class, fu2Var);
    }

    private fu2() {
    }

    public static eu2 K() {
        return (eu2) zzb.G();
    }

    static /* synthetic */ void M(fu2 fu2Var, String str) {
        str.getClass();
        fu2Var.zzh = str;
    }

    static /* synthetic */ void N(fu2 fu2Var, String str) {
        str.getClass();
        fu2Var.zzk = str;
    }

    static /* synthetic */ void O(fu2 fu2Var, String str) {
        str.getClass();
        fu2Var.zzl = str;
    }

    static /* synthetic */ void T(fu2 fu2Var, String str) {
        str.getClass();
        fu2Var.zzu = str;
    }

    static /* synthetic */ void U(fu2 fu2Var, String str) {
        str.getClass();
        fu2Var.zzv = str;
    }

    static /* synthetic */ void W(fu2 fu2Var, String str) {
        str.getClass();
        fu2Var.zzz = str;
    }

    static /* synthetic */ void Y(fu2 fu2Var, String str) {
        str.getClass();
        fu2Var.zzB = str;
    }

    static /* synthetic */ void Z(fu2 fu2Var, String str) {
        str.getClass();
        fu2Var.zzC = str;
    }

    static /* synthetic */ void a0(fu2 fu2Var, String str) {
        str.getClass();
        fu2Var.zzD = str;
    }

    static /* synthetic */ void b0(fu2 fu2Var, String str) {
        str.getClass();
        fu2Var.zzE = str;
    }

    static /* synthetic */ void d0(fu2 fu2Var, int i10) {
        if (i10 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        fu2Var.zzq = i10 - 2;
    }

    static /* synthetic */ void e0(fu2 fu2Var, int i10) {
        if (i10 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        fu2Var.zzt = i10 - 2;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u001d\u0000\u0000\u0001\u001d\u001d\u0000\u0001\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzk", "zzl", "zzm", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzi", "zzj", "zzn", "zzo", "zzp", "zzw", "zzx", "zzy", "zzF"});
        }
        if (i11 == 3) {
            return new fu2();
        }
        du2 du2Var = null;
        if (i11 == 4) {
            return new eu2(du2Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
