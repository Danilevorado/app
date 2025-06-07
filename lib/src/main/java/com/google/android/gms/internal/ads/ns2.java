package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class ns2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f12842a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f12843b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f12844c;

    public ns2(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f12842a = q44Var;
        this.f12843b = q44Var2;
        this.f12844c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new ls2(bb3Var, (ScheduledExecutorService) this.f12843b.b(), ((os2) this.f12844c).b());
    }
}
