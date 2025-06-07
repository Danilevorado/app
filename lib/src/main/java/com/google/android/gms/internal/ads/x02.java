package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class x02 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f17331a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f17332b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f17333c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f17334d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f17335e;

    public x02(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5) {
        this.f17331a = q44Var;
        this.f17332b = q44Var2;
        this.f17333c = q44Var3;
        this.f17334d = q44Var4;
        this.f17335e = q44Var5;
    }

    @Override // com.google.android.gms.internal.ads.q44
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w02 b() {
        xv0 xv0Var = (xv0) this.f17331a.b();
        c02 c02VarB = ((d02) this.f17332b).b();
        n11 n11Var = (n11) this.f17333c.b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f17334d.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new w02(xv0Var, c02VarB, n11Var, scheduledExecutorService, bb3Var);
    }
}
