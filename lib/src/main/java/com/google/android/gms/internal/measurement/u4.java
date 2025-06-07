package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class u4 extends u8 implements z9 {
    public static final /* synthetic */ int zza = 0;
    private static final u4 zze;
    private boolean zzA;
    private long zzC;
    private int zzD;
    private boolean zzG;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzN;
    private long zzO;
    private int zzR;
    private x4 zzT;
    private long zzV;
    private long zzW;
    private int zzZ;
    private boolean zzaa;
    private boolean zzac;
    private p4 zzad;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzt;
    private long zzx;
    private long zzy;
    private a9 zzi = u8.i();
    private a9 zzj = u8.i();
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzz = "";
    private String zzB = "";
    private String zzE = "";
    private String zzF = "";
    private a9 zzH = u8.i();
    private String zzI = "";
    private String zzM = "";
    private String zzP = "";
    private String zzQ = "";
    private String zzS = "";
    private y8 zzU = u8.f();
    private String zzX = "";
    private String zzY = "";
    private String zzab = "";
    private String zzae = "";
    private a9 zzaf = u8.i();
    private String zzag = "";

    static {
        u4 u4Var = new u4();
        zze = u4Var;
        u8.n(u4.class, u4Var);
    }

    private u4() {
    }

    static /* synthetic */ void A0(u4 u4Var, String str) {
        str.getClass();
        u4Var.zzg |= 8192;
        u4Var.zzae = str;
    }

    static /* synthetic */ void B0(u4 u4Var) {
        u4Var.zzg &= -8193;
        u4Var.zzae = zze.zzae;
    }

    static /* synthetic */ void C0(u4 u4Var, Iterable iterable) {
        a9 a9Var = u4Var.zzaf;
        if (!a9Var.d()) {
            u4Var.zzaf = u8.j(a9Var);
        }
        h7.c(iterable, u4Var.zzaf);
    }

    static /* synthetic */ void E0(u4 u4Var, String str) {
        str.getClass();
        u4Var.zzg |= 16384;
        u4Var.zzag = str;
    }

    static /* synthetic */ void F0(u4 u4Var, int i10) {
        u4Var.b1();
        u4Var.zzi.remove(i10);
    }

    static /* synthetic */ void G0(u4 u4Var, int i10, d5 d5Var) {
        d5Var.getClass();
        u4Var.c1();
        u4Var.zzj.set(i10, d5Var);
    }

    static /* synthetic */ void H0(u4 u4Var, d5 d5Var) {
        d5Var.getClass();
        u4Var.c1();
        u4Var.zzj.add(d5Var);
    }

    static /* synthetic */ void I0(u4 u4Var, Iterable iterable) {
        u4Var.c1();
        h7.c(iterable, u4Var.zzj);
    }

    static /* synthetic */ void J0(u4 u4Var, int i10) {
        u4Var.c1();
        u4Var.zzj.remove(i10);
    }

    static /* synthetic */ void K(u4 u4Var) {
        u4Var.zzf &= Integer.MAX_VALUE;
        u4Var.zzP = zze.zzP;
    }

    static /* synthetic */ void K0(u4 u4Var, long j10) {
        u4Var.zzf |= 2;
        u4Var.zzk = j10;
    }

    public static t4 K1() {
        return (t4) zze.r();
    }

    static /* synthetic */ void L(u4 u4Var, int i10) {
        u4Var.zzg |= 2;
        u4Var.zzR = i10;
    }

    static /* synthetic */ void L0(u4 u4Var, long j10) {
        u4Var.zzf |= 4;
        u4Var.zzl = j10;
    }

    static /* synthetic */ void M(u4 u4Var, int i10, j4 j4Var) {
        j4Var.getClass();
        u4Var.b1();
        u4Var.zzi.set(i10, j4Var);
    }

    static /* synthetic */ void M0(u4 u4Var, long j10) {
        u4Var.zzf |= 8;
        u4Var.zzm = j10;
    }

    static /* synthetic */ void N(u4 u4Var, String str) {
        str.getClass();
        u4Var.zzg |= 4;
        u4Var.zzS = str;
    }

    static /* synthetic */ void N0(u4 u4Var, long j10) {
        u4Var.zzf |= 16;
        u4Var.zzn = j10;
    }

    static /* synthetic */ void O(u4 u4Var, x4 x4Var) {
        x4Var.getClass();
        u4Var.zzT = x4Var;
        u4Var.zzg |= 8;
    }

    static /* synthetic */ void O0(u4 u4Var) {
        u4Var.zzf &= -17;
        u4Var.zzn = 0L;
    }

    static /* synthetic */ void P(u4 u4Var, Iterable iterable) {
        y8 y8Var = u4Var.zzU;
        if (!y8Var.d()) {
            int size = y8Var.size();
            u4Var.zzU = y8Var.j(size == 0 ? 10 : size + size);
        }
        h7.c(iterable, u4Var.zzU);
    }

    static /* synthetic */ void P0(u4 u4Var, long j10) {
        u4Var.zzf |= 32;
        u4Var.zzo = j10;
    }

    static /* synthetic */ void Q(u4 u4Var, j4 j4Var) {
        j4Var.getClass();
        u4Var.b1();
        u4Var.zzi.add(j4Var);
    }

    static /* synthetic */ void Q0(u4 u4Var) {
        u4Var.zzf &= -33;
        u4Var.zzo = 0L;
    }

    static /* synthetic */ void R(u4 u4Var, long j10) {
        u4Var.zzg |= 16;
        u4Var.zzV = j10;
    }

    static /* synthetic */ void R0(u4 u4Var, String str) {
        u4Var.zzf |= 64;
        u4Var.zzp = "android";
    }

    static /* synthetic */ void S(u4 u4Var, long j10) {
        u4Var.zzg |= 32;
        u4Var.zzW = j10;
    }

    static /* synthetic */ void S0(u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 128;
        u4Var.zzq = str;
    }

    static /* synthetic */ void T(u4 u4Var, String str) {
        u4Var.zzg |= 128;
        u4Var.zzY = str;
    }

    static /* synthetic */ void T0(u4 u4Var) {
        u4Var.zzf &= -129;
        u4Var.zzq = zze.zzq;
    }

    static /* synthetic */ void U(u4 u4Var, Iterable iterable) {
        u4Var.b1();
        h7.c(iterable, u4Var.zzi);
    }

    static /* synthetic */ void U0(u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 256;
        u4Var.zzr = str;
    }

    static /* synthetic */ void V0(u4 u4Var) {
        u4Var.zzf &= -257;
        u4Var.zzr = zze.zzr;
    }

    static /* synthetic */ void W(u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 8192;
        u4Var.zzw = str;
    }

    static /* synthetic */ void W0(u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 512;
        u4Var.zzs = str;
    }

    static /* synthetic */ void X(u4 u4Var, long j10) {
        u4Var.zzf |= 16384;
        u4Var.zzx = j10;
    }

    static /* synthetic */ void X0(u4 u4Var, int i10) {
        u4Var.zzf |= 1024;
        u4Var.zzt = i10;
    }

    static /* synthetic */ void Y(u4 u4Var, long j10) {
        u4Var.zzf |= 32768;
        u4Var.zzy = 68000L;
    }

    static /* synthetic */ void Y0(u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 2048;
        u4Var.zzu = str;
    }

    static /* synthetic */ void Z(u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 65536;
        u4Var.zzz = str;
    }

    static /* synthetic */ void Z0(u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 4096;
        u4Var.zzv = str;
    }

    static /* synthetic */ void a0(u4 u4Var) {
        u4Var.zzf &= -65537;
        u4Var.zzz = zze.zzz;
    }

    static /* synthetic */ void b0(u4 u4Var, boolean z10) {
        u4Var.zzf |= 131072;
        u4Var.zzA = z10;
    }

    private final void b1() {
        a9 a9Var = this.zzi;
        if (a9Var.d()) {
            return;
        }
        this.zzi = u8.j(a9Var);
    }

    static /* synthetic */ void c0(u4 u4Var) {
        u4Var.zzf &= -131073;
        u4Var.zzA = false;
    }

    private final void c1() {
        a9 a9Var = this.zzj;
        if (a9Var.d()) {
            return;
        }
        this.zzj = u8.j(a9Var);
    }

    static /* synthetic */ void d0(u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 262144;
        u4Var.zzB = str;
    }

    static /* synthetic */ void e0(u4 u4Var) {
        u4Var.zzf &= -262145;
        u4Var.zzB = zze.zzB;
    }

    static /* synthetic */ void f0(u4 u4Var, long j10) {
        u4Var.zzf |= 524288;
        u4Var.zzC = j10;
    }

    static /* synthetic */ void g0(u4 u4Var, int i10) {
        u4Var.zzf |= 1048576;
        u4Var.zzD = i10;
    }

    static /* synthetic */ void h0(u4 u4Var, String str) {
        u4Var.zzf |= 2097152;
        u4Var.zzE = str;
    }

    static /* synthetic */ void i0(u4 u4Var) {
        u4Var.zzf &= -2097153;
        u4Var.zzE = zze.zzE;
    }

    static /* synthetic */ void j0(u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 4194304;
        u4Var.zzF = str;
    }

    static /* synthetic */ void k0(u4 u4Var, boolean z10) {
        u4Var.zzf |= 8388608;
        u4Var.zzG = z10;
    }

    static /* synthetic */ void l0(u4 u4Var, Iterable iterable) {
        a9 a9Var = u4Var.zzH;
        if (!a9Var.d()) {
            u4Var.zzH = u8.j(a9Var);
        }
        h7.c(iterable, u4Var.zzH);
    }

    static /* synthetic */ void n0(u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 16777216;
        u4Var.zzI = str;
    }

    static /* synthetic */ void o0(u4 u4Var, int i10) {
        u4Var.zzf |= 33554432;
        u4Var.zzJ = i10;
    }

    static /* synthetic */ void p0(u4 u4Var, int i10) {
        u4Var.zzf |= 1;
        u4Var.zzh = 1;
    }

    static /* synthetic */ void q0(u4 u4Var) {
        u4Var.zzf &= -268435457;
        u4Var.zzM = zze.zzM;
    }

    static /* synthetic */ void r0(u4 u4Var, long j10) {
        u4Var.zzf |= 536870912;
        u4Var.zzN = j10;
    }

    public final String A() {
        return this.zzF;
    }

    public final long A1() {
        return this.zzC;
    }

    public final String B() {
        return this.zzE;
    }

    public final long B1() {
        return this.zzV;
    }

    public final String C() {
        return this.zzq;
    }

    public final long C1() {
        return this.zzm;
    }

    public final String D() {
        return this.zzp;
    }

    public final long D1() {
        return this.zzx;
    }

    public final String E() {
        return this.zzz;
    }

    public final long E1() {
        return this.zzo;
    }

    public final String F() {
        return this.zzae;
    }

    public final long F1() {
        return this.zzn;
    }

    public final String G() {
        return this.zzs;
    }

    public final long G1() {
        return this.zzl;
    }

    public final List H() {
        return this.zzH;
    }

    public final long H1() {
        return this.zzk;
    }

    public final List I() {
        return this.zzi;
    }

    public final long I1() {
        return this.zzy;
    }

    public final List J() {
        return this.zzj;
    }

    public final j4 J1(int i10) {
        return (j4) this.zzi.get(i10);
    }

    public final d5 M1(int i10) {
        return (d5) this.zzj.get(i10);
    }

    public final String N1() {
        return this.zzS;
    }

    public final String O1() {
        return this.zzv;
    }

    public final String P1() {
        return this.zzB;
    }

    public final String Q1() {
        return this.zzu;
    }

    public final int V() {
        return this.zzJ;
    }

    public final int a1() {
        return this.zzD;
    }

    public final boolean d1() {
        return (this.zzf & 536870912) != 0;
    }

    public final boolean e1() {
        return (this.zzg & 128) != 0;
    }

    public final boolean f1() {
        return (this.zzf & 524288) != 0;
    }

    public final boolean g1() {
        return (this.zzg & 16) != 0;
    }

    public final boolean h1() {
        return (this.zzf & 8) != 0;
    }

    public final boolean i1() {
        return (this.zzf & 16384) != 0;
    }

    public final boolean j1() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean k1() {
        return (this.zzf & 32) != 0;
    }

    public final boolean l1() {
        return (this.zzf & 16) != 0;
    }

    public final boolean m1() {
        return (this.zzf & 1) != 0;
    }

    public final boolean n1() {
        return (this.zzg & 2) != 0;
    }

    public final boolean o1() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean p1() {
        return (this.zzg & 8192) != 0;
    }

    public final boolean q1() {
        return (this.zzf & 4) != 0;
    }

    public final boolean r1() {
        return (this.zzf & 1024) != 0;
    }

    public final boolean s0() {
        return this.zzA;
    }

    public final boolean s1() {
        return (this.zzf & 2) != 0;
    }

    public final boolean t0() {
        return this.zzG;
    }

    public final boolean t1() {
        return (this.zzf & 32768) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zze, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.", new Object[]{"zzf", "zzg", "zzh", "zzi", j4.class, "zzj", d5.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", f4.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", b4.f18837a, "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        }
        if (i11 == 3) {
            return new u4();
        }
        a4 a4Var = null;
        if (i11 == 4) {
            return new t4(a4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zze;
    }

    public final boolean u0() {
        return (this.zzf & 33554432) != 0;
    }

    public final int u1() {
        return this.zzi.size();
    }

    public final String v() {
        return this.zzw;
    }

    public final boolean v0() {
        return (this.zzf & 1048576) != 0;
    }

    public final int v1() {
        return this.zzh;
    }

    public final String w() {
        return this.zzY;
    }

    public final int w1() {
        return this.zzR;
    }

    public final String x() {
        return this.zzr;
    }

    public final int x1() {
        return this.zzt;
    }

    public final String y() {
        return this.zzP;
    }

    public final int y1() {
        return this.zzj.size();
    }

    public final String z() {
        return this.zzI;
    }

    public final long z1() {
        return this.zzN;
    }
}
