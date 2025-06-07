package com.google.android.gms.internal.ads;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final class sx1 implements ms2 {

    /* renamed from: m, reason: collision with root package name */
    private final ex1 f15588m;

    /* renamed from: n, reason: collision with root package name */
    private final ix1 f15589n;

    sx1(ex1 ex1Var, ix1 ix1Var) {
        this.f15588m = ex1Var;
        this.f15589n = ix1Var;
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void a(fs2 fs2Var, String str) {
        if (((Boolean) k3.w.c().b(ir.Q5)).booleanValue()) {
            if (fs2.RENDERER == fs2Var) {
                this.f15588m.g(j3.t.b().b());
                return;
            }
            if (fs2.PRELOADED_LOADER == fs2Var || fs2.SERVER_TRANSACTION == fs2Var) {
                this.f15588m.h(j3.t.b().b());
                final ix1 ix1Var = this.f15589n;
                final long jD = this.f15588m.d();
                ix1Var.f14077b.a(new nr2() { // from class: com.google.android.gms.internal.ads.hx1
                    @Override // com.google.android.gms.internal.ads.nr2
                    public final Object a(Object obj) throws SQLException {
                        ix1 ix1Var2 = ix1Var;
                        long j10 = jD;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (ix1Var2.a()) {
                            return null;
                        }
                        ap apVarS = bp.S();
                        apVarS.C(j10);
                        byte[] bArrX = ((bp) apVarS.m()).x();
                        rx1.g(sQLiteDatabase, false, false);
                        rx1.d(sQLiteDatabase, j10, bArrX);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void b(fs2 fs2Var, String str, Throwable th) {
        if (((Boolean) k3.w.c().b(ir.Q5)).booleanValue() && fs2.RENDERER == fs2Var && this.f15588m.c() != 0) {
            this.f15588m.f(j3.t.b().b() - this.f15588m.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void c(fs2 fs2Var, String str) {
        if (((Boolean) k3.w.c().b(ir.Q5)).booleanValue() && fs2.RENDERER == fs2Var && this.f15588m.c() != 0) {
            this.f15588m.f(j3.t.b().b() - this.f15588m.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.ms2
    public final void h(fs2 fs2Var, String str) {
    }
}
