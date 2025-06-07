package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class kt0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f11218a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f11219b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f11220c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f11221d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f11222e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f11223f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f11224g;

    /* renamed from: h, reason: collision with root package name */
    private final q44 f11225h;

    /* renamed from: i, reason: collision with root package name */
    private final q44 f11226i;

    /* renamed from: j, reason: collision with root package name */
    private final q44 f11227j;

    /* renamed from: k, reason: collision with root package name */
    private final q44 f11228k;

    /* renamed from: l, reason: collision with root package name */
    private final q44 f11229l;

    /* renamed from: m, reason: collision with root package name */
    private final q44 f11230m;

    /* renamed from: n, reason: collision with root package name */
    private final q44 f11231n;

    /* renamed from: o, reason: collision with root package name */
    private final q44 f11232o;

    public kt0(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5, q44 q44Var6, q44 q44Var7, q44 q44Var8, q44 q44Var9, q44 q44Var10, q44 q44Var11, q44 q44Var12, q44 q44Var13, q44 q44Var14, q44 q44Var15) {
        this.f11218a = q44Var;
        this.f11219b = q44Var2;
        this.f11220c = q44Var3;
        this.f11221d = q44Var4;
        this.f11222e = q44Var5;
        this.f11223f = q44Var6;
        this.f11224g = q44Var7;
        this.f11225h = q44Var8;
        this.f11226i = q44Var9;
        this.f11227j = q44Var10;
        this.f11228k = q44Var11;
        this.f11229l = q44Var12;
        this.f11230m = q44Var13;
        this.f11231n = q44Var14;
        this.f11232o = q44Var15;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* synthetic */ Object b() {
        Context contextA = ((qm0) this.f11218a).a();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new jt0(contextA, bb3Var, (Executor) this.f11220c.b(), (ScheduledExecutorService) this.f11221d.b(), ((xx0) this.f11222e).a(), ((ux0) this.f11223f).a(), (ou2) this.f11224g.b(), (oo2) this.f11225h.b(), (View) this.f11226i.b(), (nk0) this.f11227j.b(), (bg) this.f11228k.b(), (ls) this.f11229l.b(), new ns(), (au2) this.f11231n.b(), ((y01) this.f11232o).a());
    }
}
