package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class li2 implements h72 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11612a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f11613b;

    /* renamed from: c, reason: collision with root package name */
    protected final km0 f11614c;

    /* renamed from: d, reason: collision with root package name */
    private final bj2 f11615d;

    /* renamed from: e, reason: collision with root package name */
    private final wk2 f11616e;

    /* renamed from: f, reason: collision with root package name */
    private final ff0 f11617f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f11618g;

    /* renamed from: h, reason: collision with root package name */
    private final cu2 f11619h;

    /* renamed from: i, reason: collision with root package name */
    private final bo2 f11620i;

    /* renamed from: j, reason: collision with root package name */
    private ab3 f11621j;

    protected li2(Context context, Executor executor, km0 km0Var, wk2 wk2Var, bj2 bj2Var, bo2 bo2Var, ff0 ff0Var) {
        this.f11612a = context;
        this.f11613b = executor;
        this.f11614c = km0Var;
        this.f11616e = wk2Var;
        this.f11615d = bj2Var;
        this.f11620i = bo2Var;
        this.f11617f = ff0Var;
        this.f11618g = new FrameLayout(context);
        this.f11619h = km0Var.B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized q01 m(uk2 uk2Var) {
        ki2 ki2Var = (ki2) uk2Var;
        if (((Boolean) k3.w.c().b(ir.E7)).booleanValue()) {
            wu0 wu0Var = new wu0(this.f11618g);
            s01 s01Var = new s01();
            s01Var.e(this.f11612a);
            s01Var.i(ki2Var.f11075a);
            u01 u01VarJ = s01Var.j();
            a71 a71Var = new a71();
            a71Var.f(this.f11615d, this.f11613b);
            a71Var.o(this.f11615d, this.f11613b);
            return e(wu0Var, u01VarJ, a71Var.q());
        }
        bj2 bj2VarA = bj2.a(this.f11615d);
        a71 a71Var2 = new a71();
        a71Var2.e(bj2VarA, this.f11613b);
        a71Var2.j(bj2VarA, this.f11613b);
        a71Var2.k(bj2VarA, this.f11613b);
        a71Var2.l(bj2VarA, this.f11613b);
        a71Var2.f(bj2VarA, this.f11613b);
        a71Var2.o(bj2VarA, this.f11613b);
        a71Var2.p(bj2VarA);
        wu0 wu0Var2 = new wu0(this.f11618g);
        s01 s01Var2 = new s01();
        s01Var2.e(this.f11612a);
        s01Var2.i(ki2Var.f11075a);
        return e(wu0Var2, s01Var2.j(), a71Var2.q());
    }

    @Override // com.google.android.gms.internal.ads.h72
    public final boolean a() {
        ab3 ab3Var = this.f11621j;
        return (ab3Var == null || ab3Var.isDone()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.google.android.gms.internal.ads.h72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean b(k3.c4 r8, java.lang.String r9, com.google.android.gms.internal.ads.f72 r10, com.google.android.gms.internal.ads.g72 r11) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.li2.b(k3.c4, java.lang.String, com.google.android.gms.internal.ads.f72, com.google.android.gms.internal.ads.g72):boolean");
    }

    protected abstract q01 e(wu0 wu0Var, u01 u01Var, c71 c71Var);

    final /* synthetic */ void k() {
        this.f11615d.u(fp2.d(6, null, null));
    }

    public final void l(k3.n4 n4Var) {
        this.f11620i.K(n4Var);
    }
}
