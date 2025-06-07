package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class z22 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f18377a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f18378b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f18379c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f18380d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f18381e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f18382f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f18383g;

    /* renamed from: h, reason: collision with root package name */
    private final q44 f18384h;

    /* renamed from: i, reason: collision with root package name */
    private final q44 f18385i;

    /* renamed from: j, reason: collision with root package name */
    private final q44 f18386j;

    /* renamed from: k, reason: collision with root package name */
    private final q44 f18387k;

    public z22(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5, q44 q44Var6, q44 q44Var7, q44 q44Var8, q44 q44Var9, q44 q44Var10, q44 q44Var11) {
        this.f18377a = q44Var;
        this.f18378b = q44Var2;
        this.f18379c = q44Var3;
        this.f18380d = q44Var4;
        this.f18381e = q44Var5;
        this.f18382f = q44Var6;
        this.f18383g = q44Var7;
        this.f18384h = q44Var8;
        this.f18385i = q44Var9;
        this.f18386j = q44Var10;
        this.f18387k = q44Var11;
    }

    @Override // com.google.android.gms.internal.ads.q44
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y22 b() {
        Context contextA = ((qm0) this.f18377a).a();
        ls2 ls2Var = (ls2) this.f18378b.b();
        t22 t22Var = (t22) this.f18379c.b();
        n11 n11Var = (n11) this.f18380d.b();
        ou2 ou2Var = (ou2) this.f18381e.b();
        tu2 tu2Var = (tu2) this.f18382f.b();
        hx0 hx0Var = (hx0) this.f18383g.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new y22(contextA, ls2Var, t22Var, n11Var, ou2Var, tu2Var, hx0Var, bb3Var, (ScheduledExecutorService) this.f18385i.b(), (fz1) this.f18386j.b(), (au2) this.f18387k.b());
    }
}
