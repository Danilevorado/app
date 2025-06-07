package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
final class t32 implements jb1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15666a;

    /* renamed from: b, reason: collision with root package name */
    private final dk1 f15667b;

    /* renamed from: c, reason: collision with root package name */
    private final do2 f15668c;

    /* renamed from: d, reason: collision with root package name */
    private final ff0 f15669d;

    /* renamed from: e, reason: collision with root package name */
    private final hn2 f15670e;

    /* renamed from: f, reason: collision with root package name */
    private final ab3 f15671f;

    /* renamed from: g, reason: collision with root package name */
    private final nk0 f15672g;

    /* renamed from: h, reason: collision with root package name */
    private final iy f15673h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f15674i;

    t32(Context context, dk1 dk1Var, do2 do2Var, ff0 ff0Var, hn2 hn2Var, ab3 ab3Var, nk0 nk0Var, iy iyVar, boolean z10) {
        this.f15666a = context;
        this.f15667b = dk1Var;
        this.f15668c = do2Var;
        this.f15669d = ff0Var;
        this.f15670e = hn2Var;
        this.f15671f = ab3Var;
        this.f15672g = nk0Var;
        this.f15673h = iyVar;
        this.f15674i = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.jb1
    public final void a(boolean z10, Context context, y11 y11Var) throws NumberFormatException {
        nk0 nk0Var;
        hj1 hj1Var = (hj1) qa3.p(this.f15671f);
        try {
            hn2 hn2Var = this.f15670e;
            if (this.f15672g.T0()) {
                if (((Boolean) k3.w.c().b(ir.I0)).booleanValue()) {
                    final nk0 nk0VarA = this.f15667b.a(this.f15668c.f7446e, null, null);
                    wy.b(nk0VarA, hj1Var.i());
                    final hk1 hk1Var = new hk1();
                    hk1Var.a(this.f15666a, (View) nk0VarA);
                    hj1Var.l().i(nk0VarA, true, this.f15674i ? this.f15673h : null);
                    nk0VarA.G().c0(new am0() { // from class: com.google.android.gms.internal.ads.q32
                        @Override // com.google.android.gms.internal.ads.am0
                        public final void a(boolean z11) {
                            hk1 hk1Var2 = hk1Var;
                            nk0 nk0Var2 = nk0VarA;
                            hk1Var2.b();
                            nk0Var2.D0();
                            nk0Var2.G().q();
                        }
                    });
                    nk0VarA.G().i0(new bm0() { // from class: com.google.android.gms.internal.ads.s32
                        @Override // com.google.android.gms.internal.ads.bm0
                        public final void a() {
                            nk0VarA.t0();
                        }
                    });
                    nn2 nn2Var = hn2Var.f9272t;
                    nk0VarA.Y0(nn2Var.f12719b, nn2Var.f12718a, null);
                    nk0Var = nk0VarA;
                } else {
                    nk0Var = this.f15672g;
                }
            } else {
                nk0Var = this.f15672g;
            }
            nk0Var.b1(true);
            boolean zE = this.f15674i ? this.f15673h.e(false) : false;
            j3.t.r();
            boolean zD = m3.b2.d(this.f15666a);
            boolean z11 = this.f15674i;
            boolean zD2 = z11 ? this.f15673h.d() : false;
            float fA = z11 ? this.f15673h.a() : 0.0f;
            hn2 hn2Var2 = this.f15670e;
            j3.j jVar = new j3.j(zE, zD, zD2, fA, -1, z10, hn2Var2.P, hn2Var2.Q);
            if (y11Var != null) {
                y11Var.e();
            }
            j3.t.k();
            ya1 ya1VarJ = hj1Var.j();
            hn2 hn2Var3 = this.f15670e;
            int i10 = hn2Var3.R;
            ff0 ff0Var = this.f15669d;
            String str = hn2Var3.C;
            nn2 nn2Var2 = hn2Var3.f9272t;
            l3.s.a(context, new AdOverlayInfoParcel((k3.a) null, ya1VarJ, (l3.e0) null, nk0Var, i10, ff0Var, str, jVar, nn2Var2.f12719b, nn2Var2.f12718a, this.f15668c.f7447f, y11Var), true);
        } catch (zk0 e5) {
            ze0.e("", e5);
        }
    }
}
