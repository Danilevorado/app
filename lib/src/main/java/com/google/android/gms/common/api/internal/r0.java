package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class r0 implements b5.d {

    /* renamed from: a, reason: collision with root package name */
    private final c f5800a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5801b;

    /* renamed from: c, reason: collision with root package name */
    private final d4.b f5802c;

    /* renamed from: d, reason: collision with root package name */
    private final long f5803d;

    /* renamed from: e, reason: collision with root package name */
    private final long f5804e;

    r0(c cVar, int i10, d4.b bVar, long j10, long j11, String str, String str2) {
        this.f5800a = cVar;
        this.f5801b = i10;
        this.f5802c = bVar;
        this.f5803d = j10;
        this.f5804e = j11;
    }

    static r0 b(c cVar, int i10, d4.b bVar) {
        boolean zX;
        if (!cVar.d()) {
            return null;
        }
        e4.r rVarA = e4.q.b().a();
        if (rVarA == null) {
            zX = true;
        } else {
            if (!rVarA.v()) {
                return null;
            }
            zX = rVarA.x();
            m0 m0VarS = cVar.s(bVar);
            if (m0VarS != null) {
                if (!(m0VarS.s() instanceof e4.c)) {
                    return null;
                }
                e4.c cVar2 = (e4.c) m0VarS.s();
                if (cVar2.N() && !cVar2.i()) {
                    e4.f fVarC = c(m0VarS, cVar2, i10);
                    if (fVarC == null) {
                        return null;
                    }
                    m0VarS.E();
                    zX = fVarC.y();
                }
            }
        }
        return new r0(cVar, i10, bVar, zX ? System.currentTimeMillis() : 0L, zX ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static e4.f c(m0 m0Var, e4.c cVar, int i10) {
        int[] iArrH;
        int[] iArrV;
        e4.f fVarL = cVar.L();
        if (fVarL == null || !fVarL.x() || ((iArrH = fVarL.h()) != null ? !i4.b.b(iArrH, i10) : !((iArrV = fVarL.v()) == null || !i4.b.b(iArrV, i10))) || m0Var.q() >= fVarL.f()) {
            return null;
        }
        return fVarL;
    }

    @Override // b5.d
    public final void a(b5.i iVar) {
        m0 m0VarS;
        int iY;
        int i10;
        int i11;
        int iF;
        long j10;
        long j11;
        int iElapsedRealtime;
        if (this.f5800a.d()) {
            e4.r rVarA = e4.q.b().a();
            if ((rVarA == null || rVarA.v()) && (m0VarS = this.f5800a.s(this.f5802c)) != null && (m0VarS.s() instanceof e4.c)) {
                e4.c cVar = (e4.c) m0VarS.s();
                int i12 = 0;
                boolean zX = this.f5803d > 0;
                int iD = cVar.D();
                int iH = 100;
                if (rVarA != null) {
                    zX &= rVarA.x();
                    int iF2 = rVarA.f();
                    int iH2 = rVarA.h();
                    iY = rVarA.y();
                    if (cVar.N() && !cVar.i()) {
                        e4.f fVarC = c(m0VarS, cVar, this.f5801b);
                        if (fVarC == null) {
                            return;
                        }
                        boolean z10 = fVarC.y() && this.f5803d > 0;
                        iH2 = fVarC.f();
                        zX = z10;
                    }
                    i11 = iF2;
                    i10 = iH2;
                } else {
                    iY = 0;
                    i10 = 100;
                    i11 = 5000;
                }
                c cVar2 = this.f5800a;
                if (iVar.n()) {
                    iF = 0;
                } else if (iVar.l()) {
                    i12 = iH;
                    iF = -1;
                } else {
                    Exception excI = iVar.i();
                    if (excI instanceof c4.a) {
                        Status statusA = ((c4.a) excI).a();
                        iH = statusA.h();
                        b4.b bVarF = statusA.f();
                        if (bVarF != null) {
                            iF = bVarF.f();
                            i12 = iH;
                        }
                        i12 = iH;
                        iF = -1;
                    } else {
                        i12 = 101;
                        iF = -1;
                    }
                }
                if (zX) {
                    long j12 = this.f5803d;
                    long j13 = this.f5804e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j13);
                    j11 = jCurrentTimeMillis;
                    j10 = j12;
                } else {
                    j10 = 0;
                    j11 = 0;
                    iElapsedRealtime = -1;
                }
                cVar2.B(new e4.n(this.f5801b, i12, iF, j10, j11, null, null, iD, iElapsedRealtime), iY, i11, i10);
            }
        }
    }
}
