package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class vd extends by3 implements kz3 {
    private static final vd zzb;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private xd zzM;
    private qd zzaC;
    private long zzaI;
    private gd zzaL;
    private id zzaM;
    private int zzaP;
    private long zzaQ;
    private boolean zzaT;
    private long zzaV;
    private ee zzaW;
    private sd zzae;
    private ud zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private ge zzau;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzg = "";
    private String zzh = "";
    private String zzs = "";
    private String zzC = "";
    private String zzD = "D";
    private String zzE = "";
    private String zzI = "";
    private long zzK = -1;
    private long zzL = -1;
    private long zzN = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private String zzT = "D";
    private String zzU = "D";
    private long zzV = -1;
    private int zzW = AdError.NETWORK_ERROR_CODE;
    private int zzX = AdError.NETWORK_ERROR_CODE;
    private long zzY = -1;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private int zzad = AdError.NETWORK_ERROR_CODE;
    private ky3 zzaf = by3.u();
    private long zzah = -1;
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private String zzap = "D";
    private long zzaq = -1;
    private long zzav = -1;
    private int zzaw = AdError.NETWORK_ERROR_CODE;
    private int zzax = AdError.NETWORK_ERROR_CODE;
    private String zzay = "D";
    private ky3 zzaz = by3.u();
    private int zzaA = AdError.NETWORK_ERROR_CODE;
    private ky3 zzaB = by3.u();
    private String zzaD = "";
    private long zzaE = -1;
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaJ = -1;
    private String zzaK = "";
    private long zzaN = -1;
    private long zzaO = -1;
    private String zzaR = "";
    private int zzaS = 2;
    private String zzaU = "";
    private long zzaX = -1;
    private String zzaY = "";

    static {
        vd vdVar = new vd();
        zzb = vdVar;
        by3.B(vd.class, vdVar);
    }

    private vd() {
    }

    static /* synthetic */ void A0(vd vdVar, int i10) {
        vdVar.zzaw = i10 - 1;
        vdVar.zzf |= 8;
    }

    static /* synthetic */ void B0(vd vdVar, int i10) {
        vdVar.zzax = i10 - 1;
        vdVar.zzf |= 16;
    }

    static /* synthetic */ void C0(vd vdVar, int i10) {
        vdVar.zzaP = i10 - 1;
        vdVar.zzf |= 1048576;
    }

    static /* synthetic */ void D0(vd vdVar, int i10) {
        vdVar.zzaS = 5;
        vdVar.zzf |= 8388608;
    }

    public static vd F0() {
        return zzb;
    }

    public static vd G0(byte[] bArr, qx3 qx3Var) {
        return (vd) by3.q(zzb, bArr, qx3Var);
    }

    static /* synthetic */ void K(vd vdVar, long j10) {
        vdVar.zzd |= 134217728;
        vdVar.zzH = j10;
    }

    static /* synthetic */ void K0(vd vdVar, String str) {
        str.getClass();
        vdVar.zzd |= 1;
        vdVar.zzg = str;
    }

    static /* synthetic */ void L(vd vdVar, String str) {
        str.getClass();
        vdVar.zzd |= 268435456;
        vdVar.zzI = str;
    }

    static /* synthetic */ void L0(vd vdVar, String str) {
        str.getClass();
        vdVar.zzd |= 2;
        vdVar.zzh = str;
    }

    static /* synthetic */ void M(vd vdVar, long j10) {
        vdVar.zzd |= 536870912;
        vdVar.zzJ = j10;
    }

    static /* synthetic */ void M0(vd vdVar, long j10) {
        vdVar.zzd |= 4;
        vdVar.zzi = j10;
    }

    static /* synthetic */ void N(vd vdVar, long j10) {
        vdVar.zzd |= 1073741824;
        vdVar.zzK = j10;
    }

    static /* synthetic */ void N0(vd vdVar, long j10) {
        vdVar.zzd |= 16;
        vdVar.zzk = j10;
    }

    static /* synthetic */ void O(vd vdVar, long j10) {
        vdVar.zzd |= Integer.MIN_VALUE;
        vdVar.zzL = j10;
    }

    static /* synthetic */ void O0(vd vdVar, long j10) {
        vdVar.zzd |= 32;
        vdVar.zzl = j10;
    }

    static /* synthetic */ void P(vd vdVar, long j10) {
        vdVar.zze |= 2;
        vdVar.zzN = j10;
    }

    static /* synthetic */ void P0(vd vdVar, long j10) {
        vdVar.zzd |= 1024;
        vdVar.zzq = j10;
    }

    static /* synthetic */ void Q(vd vdVar, long j10) {
        vdVar.zze |= 4;
        vdVar.zzO = j10;
    }

    static /* synthetic */ void Q0(vd vdVar, long j10) {
        vdVar.zzd |= 2048;
        vdVar.zzr = j10;
    }

    static /* synthetic */ void R(vd vdVar, long j10) {
        vdVar.zze |= 8;
        vdVar.zzP = j10;
    }

    static /* synthetic */ void R0(vd vdVar, long j10) {
        vdVar.zzd |= 8192;
        vdVar.zzt = j10;
    }

    static /* synthetic */ void S(vd vdVar, long j10) {
        vdVar.zze |= 16;
        vdVar.zzQ = j10;
    }

    static /* synthetic */ void S0(vd vdVar, long j10) {
        vdVar.zzd |= 16384;
        vdVar.zzu = j10;
    }

    static /* synthetic */ void T(vd vdVar, long j10) {
        vdVar.zze |= 32;
        vdVar.zzR = j10;
    }

    static /* synthetic */ void T0(vd vdVar, long j10) {
        vdVar.zzd |= 32768;
        vdVar.zzv = j10;
    }

    static /* synthetic */ void U(vd vdVar, long j10) {
        vdVar.zze |= 64;
        vdVar.zzS = j10;
    }

    static /* synthetic */ void U0(vd vdVar, long j10) {
        vdVar.zzd |= 65536;
        vdVar.zzw = j10;
    }

    static /* synthetic */ void V(vd vdVar, String str) {
        str.getClass();
        vdVar.zze |= 128;
        vdVar.zzT = str;
    }

    static /* synthetic */ void V0(vd vdVar, long j10) {
        vdVar.zzd |= 524288;
        vdVar.zzz = j10;
    }

    static /* synthetic */ void W(vd vdVar, String str) {
        str.getClass();
        vdVar.zze |= 256;
        vdVar.zzU = str;
    }

    static /* synthetic */ void W0(vd vdVar, long j10) {
        vdVar.zzd |= 1048576;
        vdVar.zzA = j10;
    }

    static /* synthetic */ void X(vd vdVar, long j10) {
        vdVar.zze |= 4096;
        vdVar.zzY = j10;
    }

    static /* synthetic */ void X0(vd vdVar, long j10) {
        vdVar.zzd |= 2097152;
        vdVar.zzB = j10;
    }

    static /* synthetic */ void Y(vd vdVar, long j10) {
        vdVar.zze |= 8192;
        vdVar.zzZ = j10;
    }

    static /* synthetic */ void Y0(vd vdVar, String str) {
        str.getClass();
        vdVar.zzd |= 4194304;
        vdVar.zzC = str;
    }

    static /* synthetic */ void Z(vd vdVar, long j10) {
        vdVar.zze |= 16384;
        vdVar.zzaa = j10;
    }

    static /* synthetic */ void Z0(vd vdVar, String str) {
        str.getClass();
        vdVar.zzd |= 16777216;
        vdVar.zzE = str;
    }

    static /* synthetic */ void a0(vd vdVar, sd sdVar) {
        sdVar.getClass();
        vdVar.zzae = sdVar;
        vdVar.zze |= 262144;
    }

    static /* synthetic */ void a1(vd vdVar, long j10) {
        vdVar.zzd |= 33554432;
        vdVar.zzF = j10;
    }

    static /* synthetic */ void b0(vd vdVar, sd sdVar) {
        sdVar.getClass();
        ky3 ky3Var = vdVar.zzaf;
        if (!ky3Var.d()) {
            vdVar.zzaf = by3.v(ky3Var);
        }
        vdVar.zzaf.add(sdVar);
    }

    static /* synthetic */ void b1(vd vdVar, long j10) {
        vdVar.zzd |= 67108864;
        vdVar.zzG = j10;
    }

    static /* synthetic */ void d0(vd vdVar, ud udVar) {
        udVar.getClass();
        vdVar.zzag = udVar;
        vdVar.zze |= 524288;
    }

    static /* synthetic */ void e0(vd vdVar, long j10) {
        vdVar.zze |= 2097152;
        vdVar.zzai = j10;
    }

    static /* synthetic */ void f0(vd vdVar, long j10) {
        vdVar.zze |= 4194304;
        vdVar.zzaj = j10;
    }

    static /* synthetic */ void g0(vd vdVar, long j10) {
        vdVar.zze |= 8388608;
        vdVar.zzak = j10;
    }

    static /* synthetic */ void h0(vd vdVar, long j10) {
        vdVar.zze |= 67108864;
        vdVar.zzan = j10;
    }

    static /* synthetic */ void i0(vd vdVar, long j10) {
        vdVar.zze |= 134217728;
        vdVar.zzao = j10;
    }

    static /* synthetic */ void j0(vd vdVar, String str) {
        str.getClass();
        vdVar.zze |= 268435456;
        vdVar.zzap = str;
    }

    public static xc k0() {
        return (xc) zzb.G();
    }

    static /* synthetic */ void l0(vd vdVar, long j10) {
        vdVar.zzf |= 512;
        vdVar.zzaE = j10;
    }

    static /* synthetic */ void m0(vd vdVar, long j10) {
        vdVar.zzf |= 1024;
        vdVar.zzaF = j10;
    }

    static /* synthetic */ void n0(vd vdVar, long j10) {
        vdVar.zzf |= 2048;
        vdVar.zzaG = j10;
    }

    static /* synthetic */ void o0(vd vdVar, long j10) {
        vdVar.zzf |= 4096;
        vdVar.zzaH = j10;
    }

    static /* synthetic */ void p0(vd vdVar, String str) {
        str.getClass();
        vdVar.zzf |= 32768;
        vdVar.zzaK = str;
    }

    static /* synthetic */ void q0(vd vdVar, String str) {
        str.getClass();
        vdVar.zzf |= 4194304;
        vdVar.zzaR = str;
    }

    static /* synthetic */ void r0(vd vdVar, boolean z10) {
        vdVar.zzf |= 16777216;
        vdVar.zzaT = z10;
    }

    static /* synthetic */ void s0(vd vdVar, long j10) {
        vdVar.zzf |= 67108864;
        vdVar.zzaV = j10;
    }

    static /* synthetic */ void x0(vd vdVar, int i10) {
        vdVar.zzW = i10 - 1;
        vdVar.zze |= 1024;
    }

    static /* synthetic */ void y0(vd vdVar, int i10) {
        vdVar.zzX = i10 - 1;
        vdVar.zze |= 2048;
    }

    static /* synthetic */ void z0(vd vdVar, int i10) {
        vdVar.zzad = i10 - 1;
        vdVar.zze |= 131072;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            fy3 fy3Var = be.f6435a;
            return by3.y(zzb, "\u0001a\u0000\u0003\u0001Įa\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂU\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈV\u0019ဂZ\u001aဌW\u001bဈ\u0016\u001cဇX\u001dဈ\u0018\u001eဈY\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bOဌFP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂR]ဂS^ဌTÉဉ[ĭဂ\\Įဈ]", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaQ", "zzA", "zzB", "zzaR", "zzaV", "zzaS", cd.f6877a, "zzC", "zzaT", "zzE", "zzaU", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", sd.class, "zzR", "zzS", "zzT", "zzU", "zzW", fy3Var, "zzX", fy3Var, "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", fy3Var, "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", ae.f6049a, "zzas", ce.f6883a, "zzap", "zzat", yc.f17961a, "zzau", "zzav", "zzal", "zzam", "zzaw", fy3Var, "zzV", "zzD", "zzax", fy3Var, "zzay", "zzaz", nd.class, "zzaA", fy3Var, "zzaB", ad.class, "zzaC", "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", kd.f10962a, "zzaW", "zzaX", "zzaY"});
        }
        if (i11 == 3) {
            return new vd();
        }
        wc wcVar = null;
        if (i11 == 4) {
            return new xc(wcVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final ee H0() {
        ee eeVar = this.zzaW;
        return eeVar == null ? ee.M() : eeVar;
    }

    public final String I0() {
        return this.zzaR;
    }

    public final String J0() {
        return this.zzC;
    }

    public final boolean t0() {
        return this.zzaT;
    }

    public final boolean u0() {
        return (this.zzd & 4194304) != 0;
    }

    public final boolean v0() {
        return (this.zzf & 134217728) != 0;
    }

    public final int w0() {
        int iA = dd.a(this.zzaS);
        if (iA == 0) {
            return 3;
        }
        return iA;
    }
}
