package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class m6 implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final r f11940d = new r() { // from class: com.google.android.gms.internal.ads.l6
        @Override // com.google.android.gms.internal.ads.r
        public final /* synthetic */ k[] a(Uri uri, Map map) {
            int i10 = q.f14114a;
            r rVar = m6.f11940d;
            return new k[]{new m6()};
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private n f11941a;

    /* renamed from: b, reason: collision with root package name */
    private u6 f11942b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11943c;

    private final boolean b(l lVar) {
        u6 q6Var;
        o6 o6Var = new o6();
        if (o6Var.b(lVar, true) && (o6Var.f13019a & 2) == 2) {
            int iMin = Math.min(o6Var.f13023e, 8);
            jm2 jm2Var = new jm2(iMin);
            ((bo4) lVar).E(jm2Var.h(), 0, iMin, false);
            jm2Var.f(0);
            if (jm2Var.i() >= 5 && jm2Var.s() == 127 && jm2Var.A() == 1179402563) {
                q6Var = new k6();
            } else {
                jm2Var.f(0);
                if (y0.d(1, jm2Var, true)) {
                    q6Var = new w6();
                } else {
                    jm2Var.f(0);
                    if (q6.j(jm2Var)) {
                        q6Var = new q6();
                    }
                }
            }
            this.f11942b = q6Var;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final boolean a(l lVar) {
        try {
            return b(lVar);
        } catch (oh0 unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void d(n nVar) {
        this.f11941a = nVar;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final int e(l lVar, l0 l0Var) throws oh0 {
        gt1.b(this.f11941a);
        if (this.f11942b == null) {
            if (!b(lVar)) {
                throw oh0.a("Failed to determine bitstream type", null);
            }
            lVar.j();
        }
        if (!this.f11943c) {
            s0 s0VarS = this.f11941a.S(0, 1);
            this.f11941a.Q();
            this.f11942b.g(this.f11941a, s0VarS);
            this.f11943c = true;
        }
        return this.f11942b.d(lVar, l0Var);
    }

    @Override // com.google.android.gms.internal.ads.k
    public final void f(long j10, long j11) {
        u6 u6Var = this.f11942b;
        if (u6Var != null) {
            u6Var.i(j10, j11);
        }
    }
}
