package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class i01 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f9467a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f9468b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f9469c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f9470d;

    public i01(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4) {
        this.f9467a = q44Var;
        this.f9468b = q44Var2;
        this.f9469c = q44Var3;
        this.f9470d = q44Var4;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        d21 d21Var = (d21) this.f9467a.b();
        hn2 hn2VarA = ((ux0) this.f9468b).a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f9469c.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new h01(d21Var, hn2VarA, scheduledExecutorService, bb3Var);
    }
}
