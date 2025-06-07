package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class bp extends by3 implements kz3 {
    private static final hy3 zzb = new yo();
    private static final bp zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private gy3 zzj = by3.r();
    private vo zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        bp bpVar = new bp();
        zzd = bpVar;
        by3.B(bp.class, bpVar);
    }

    private bp() {
    }

    static /* synthetic */ void K(bp bpVar, int i10) {
        bpVar.zzm = i10 - 1;
        bpVar.zze |= 64;
    }

    static /* synthetic */ void L(bp bpVar, int i10) {
        bpVar.zzn = i10 - 1;
        bpVar.zze |= 128;
    }

    static /* synthetic */ void M(bp bpVar, int i10) {
        bpVar.zzp = i10 - 1;
        bpVar.zze |= 512;
    }

    public static ap S() {
        return (ap) zzd.G();
    }

    public static bp U(byte[] bArr) {
        return (bp) by3.m(zzd, bArr);
    }

    static /* synthetic */ void X(bp bpVar, long j10) {
        bpVar.zze |= 1;
        bpVar.zzf = j10;
    }

    static /* synthetic */ void Y(bp bpVar, long j10) {
        bpVar.zze |= 4;
        bpVar.zzh = j10;
    }

    static /* synthetic */ void Z(bp bpVar, long j10) {
        bpVar.zze |= 8;
        bpVar.zzi = j10;
    }

    static /* synthetic */ void a0(bp bpVar, Iterable iterable) {
        gy3 gy3Var = bpVar.zzj;
        if (!gy3Var.d()) {
            bpVar.zzj = by3.s(gy3Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            bpVar.zzj.X(((on) it.next()).a());
        }
    }

    static /* synthetic */ void b0(bp bpVar, vo voVar) {
        voVar.getClass();
        bpVar.zzk = voVar;
        bpVar.zze |= 16;
    }

    static /* synthetic */ void c0(bp bpVar, int i10) {
        bpVar.zze |= 256;
        bpVar.zzo = i10;
    }

    static /* synthetic */ void d0(bp bpVar, fp fpVar) {
        bpVar.zzq = fpVar.a();
        bpVar.zze |= 1024;
    }

    static /* synthetic */ void e0(bp bpVar, long j10) {
        bpVar.zze |= 2048;
        bpVar.zzr = j10;
    }

    static /* synthetic */ void k0(bp bpVar, int i10) {
        bpVar.zzg = i10 - 1;
        bpVar.zze |= 2;
    }

    static /* synthetic */ void l0(bp bpVar, int i10) {
        bpVar.zzl = i10 - 1;
        bpVar.zze |= 32;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            fy3 fy3Var = eo.f7921a;
            return by3.y(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", fy3Var, "zzh", "zzi", "zzj", nn.f12714a, "zzk", "zzl", fy3Var, "zzm", fy3Var, "zzn", fy3Var, "zzo", "zzp", fy3Var, "zzq", ep.f7928a, "zzr"});
        }
        if (i11 == 3) {
            return new bp();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new ap(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzd;
    }

    public final int N() {
        return this.zzo;
    }

    public final long O() {
        return this.zzi;
    }

    public final long P() {
        return this.zzh;
    }

    public final long Q() {
        return this.zzf;
    }

    public final vo R() {
        vo voVar = this.zzk;
        return voVar == null ? vo.M() : voVar;
    }

    public final fp V() {
        fp fpVarB = fp.b(this.zzq);
        return fpVarB == null ? fp.UNSPECIFIED : fpVarB;
    }

    public final List W() {
        return new iy3(this.zzj, zzb);
    }

    public final int f0() {
        int iA = fo.a(this.zzm);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int g0() {
        int iA = fo.a(this.zzn);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int h0() {
        int iA = fo.a(this.zzp);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int i0() {
        int iA = fo.a(this.zzg);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int j0() {
        int iA = fo.a(this.zzl);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
