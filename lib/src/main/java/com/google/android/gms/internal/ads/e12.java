package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* loaded from: classes.dex */
final class e12 implements jb1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7593a;

    /* renamed from: b, reason: collision with root package name */
    private final ff0 f7594b;

    /* renamed from: c, reason: collision with root package name */
    private final ab3 f7595c;

    /* renamed from: d, reason: collision with root package name */
    private final hn2 f7596d;

    /* renamed from: e, reason: collision with root package name */
    private final nk0 f7597e;

    /* renamed from: f, reason: collision with root package name */
    private final do2 f7598f;

    /* renamed from: g, reason: collision with root package name */
    private final iy f7599g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f7600h;

    e12(Context context, ff0 ff0Var, ab3 ab3Var, hn2 hn2Var, nk0 nk0Var, do2 do2Var, boolean z10, iy iyVar) {
        this.f7593a = context;
        this.f7594b = ff0Var;
        this.f7595c = ab3Var;
        this.f7596d = hn2Var;
        this.f7597e = nk0Var;
        this.f7598f = do2Var;
        this.f7599g = iyVar;
        this.f7600h = z10;
    }

    @Override // com.google.android.gms.internal.ads.jb1
    public final void a(boolean z10, Context context, y11 y11Var) throws NumberFormatException {
        aa1 aa1Var = (aa1) qa3.p(this.f7595c);
        this.f7597e.b1(true);
        boolean zE = this.f7600h ? this.f7599g.e(false) : false;
        j3.t.r();
        boolean zD = m3.b2.d(this.f7593a);
        boolean z11 = this.f7600h;
        j3.j jVar = new j3.j(zE, zD, z11 ? this.f7599g.d() : false, z11 ? this.f7599g.a() : 0.0f, -1, z10, this.f7596d.P, false);
        if (y11Var != null) {
            y11Var.e();
        }
        j3.t.k();
        ya1 ya1VarJ = aa1Var.j();
        nk0 nk0Var = this.f7597e;
        hn2 hn2Var = this.f7596d;
        int i10 = hn2Var.R;
        ff0 ff0Var = this.f7594b;
        String str = hn2Var.C;
        nn2 nn2Var = hn2Var.f9272t;
        l3.s.a(context, new AdOverlayInfoParcel((k3.a) null, ya1VarJ, (l3.e0) null, nk0Var, i10, ff0Var, str, jVar, nn2Var.f12719b, nn2Var.f12718a, this.f7598f.f7447f, y11Var), true);
    }
}
