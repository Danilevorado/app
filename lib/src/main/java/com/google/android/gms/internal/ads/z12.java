package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class z12 implements gz1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18365a;

    /* renamed from: b, reason: collision with root package name */
    private final yb1 f18366b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f18367c;

    public z12(Context context, yb1 yb1Var, Executor executor) {
        this.f18365a = context;
        this.f18366b = yb1Var;
        this.f18367c = executor;
    }

    private static final boolean c(un2 un2Var, int i10) {
        return un2Var.f16412a.f14851a.f7448g.contains(Integer.toString(i10));
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final void a(un2 un2Var, hn2 hn2Var, dz1 dz1Var) throws JSONException, IOException, io2 {
        ap2 ap2Var = (ap2) dz1Var.f7558b;
        Context context = this.f18365a;
        k3.c4 c4Var = un2Var.f16412a.f14851a.f7445d;
        String string = hn2Var.f9275w.toString();
        String strL = m3.w0.l(hn2Var.f9272t);
        u30 u30Var = (u30) dz1Var.f7559c;
        do2 do2Var = un2Var.f16412a.f14851a;
        ap2Var.u(context, c4Var, string, strL, u30Var, do2Var.f7450i, do2Var.f7448g);
    }

    @Override // com.google.android.gms.internal.ads.gz1
    public final /* bridge */ /* synthetic */ Object b(un2 un2Var, hn2 hn2Var, dz1 dz1Var) throws w22, io2 {
        pd1 pd1VarG;
        z30 z30VarD = ((ap2) dz1Var.f7558b).d();
        a40 a40VarE = ((ap2) dz1Var.f7558b).e();
        d40 d40VarI = ((ap2) dz1Var.f7558b).i();
        if (d40VarI != null && c(un2Var, 6)) {
            pd1VarG = pd1.d0(d40VarI);
        } else if (z30VarD != null && c(un2Var, 6)) {
            pd1VarG = pd1.H(z30VarD);
        } else if (z30VarD != null && c(un2Var, 2)) {
            pd1VarG = pd1.F(z30VarD);
        } else if (a40VarE != null && c(un2Var, 6)) {
            pd1VarG = pd1.I(a40VarE);
        } else {
            if (a40VarE == null || !c(un2Var, 1)) {
                throw new w22(1, "No native ad mappers");
            }
            pd1VarG = pd1.G(a40VarE);
        }
        if (!un2Var.f16412a.f14851a.f7448g.contains(Integer.toString(pd1VarG.N()))) {
            throw new w22(1, "No corresponding native ad listener");
        }
        rd1 rd1VarD = this.f18366b.d(new tx0(un2Var, hn2Var, dz1Var.f7557a), new be1(pd1VarG), new rf1(a40VarE, z30VarD, d40VarI));
        ((y02) dz1Var.f7559c).M5(rd1VarD.g());
        rd1VarD.c().o0(new at0((ap2) dz1Var.f7558b), this.f18367c);
        return rd1VarD.h();
    }
}
