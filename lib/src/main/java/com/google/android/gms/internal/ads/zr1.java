package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zr1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f18704a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f18705b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f18706c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f18707d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f18708e;

    public zr1(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5) {
        this.f18704a = q44Var;
        this.f18705b = q44Var2;
        this.f18706c = q44Var3;
        this.f18707d = q44Var4;
        this.f18708e = q44Var5;
    }

    @Override // com.google.android.gms.internal.ads.q44
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yr1 b() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f18704a.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        bb3 bb3Var2 = of0.f13187b;
        k44.b(bb3Var2);
        return new yr1(scheduledExecutorService, bb3Var, bb3Var2, ((rs1) this.f18707d).b(), b44.a(this.f18708e));
    }
}
