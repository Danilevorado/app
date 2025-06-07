package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class es1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f7956a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f7957b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f7958c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f7959d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f7960e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f7961f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f7962g;

    public es1(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5, q44 q44Var6, q44 q44Var7) {
        this.f7956a = q44Var;
        this.f7957b = q44Var2;
        this.f7958c = q44Var3;
        this.f7959d = q44Var4;
        this.f7960e = q44Var5;
        this.f7961f = q44Var6;
        this.f7962g = q44Var7;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Context contextA = ((qm0) this.f7956a).a();
        do2 do2VarA = ((b11) this.f7957b).a();
        cr1 cr1VarB = ((dr1) this.f7958c).b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new ds1(contextA, do2VarA, cr1VarB, bb3Var, (ScheduledExecutorService) this.f7960e.b(), (ex1) this.f7961f.b(), (au2) this.f7962g.b());
    }
}
