package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class dp1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f7460a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f7461b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f7462c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f7463d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f7464e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f7465f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f7466g;

    /* renamed from: h, reason: collision with root package name */
    private final q44 f7467h;

    /* renamed from: i, reason: collision with root package name */
    private final q44 f7468i;

    /* renamed from: j, reason: collision with root package name */
    private final q44 f7469j;

    public dp1(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5, q44 q44Var6, q44 q44Var7, q44 q44Var8, q44 q44Var9, q44 q44Var10) {
        this.f7460a = q44Var;
        this.f7461b = q44Var2;
        this.f7462c = q44Var3;
        this.f7463d = q44Var4;
        this.f7464e = q44Var5;
        this.f7465f = q44Var6;
        this.f7466g = q44Var7;
        this.f7467h = q44Var8;
        this.f7468i = q44Var9;
        this.f7469j = q44Var10;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Executor executor = (Executor) this.f7460a.b();
        Context contextA = ((qm0) this.f7461b).a();
        WeakReference weakReferenceA = ((rm0) this.f7462c).a();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new bp1(executor, contextA, weakReferenceA, bb3Var, (qk1) this.f7464e.b(), (ScheduledExecutorService) this.f7465f.b(), (hn1) this.f7466g.b(), ((cn0) this.f7467h).a(), ((i81) this.f7468i).b(), (cu2) this.f7469j.b());
    }
}
