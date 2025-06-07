package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class eg2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f7758a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f7759b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f7760c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f7761d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f7762e;

    public eg2(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5) {
        this.f7758a = q44Var;
        this.f7759b = q44Var2;
        this.f7760c = q44Var3;
        this.f7761d = q44Var4;
        this.f7762e = q44Var5;
    }

    public static bg2 a(String str, rl rlVar, je0 je0Var, ScheduledExecutorService scheduledExecutorService, bb3 bb3Var) {
        return new bg2(str, rlVar, je0Var, scheduledExecutorService, bb3Var);
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        String strA = ((ih2) this.f7758a).a();
        rl rlVar = new rl();
        je0 je0Var = (je0) this.f7760c.b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f7761d.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new bg2(strA, rlVar, je0Var, scheduledExecutorService, bb3Var);
    }
}
