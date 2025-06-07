package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class bf2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f6451a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f6452b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f6453c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f6454d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f6455e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f6456f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f6457g;

    public bf2(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5, q44 q44Var6, q44 q44Var7) {
        this.f6451a = q44Var;
        this.f6452b = q44Var2;
        this.f6453c = q44Var3;
        this.f6454d = q44Var4;
        this.f6455e = q44Var5;
        this.f6456f = q44Var6;
        this.f6457g = q44Var7;
    }

    public static ze2 a(ae0 ae0Var, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z10, boolean z11) {
        return new ze2(ae0Var, context, scheduledExecutorService, executor, i10, z10, z11);
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        ae0 ae0Var = new ae0();
        Context contextA = ((qm0) this.f6452b).a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f6453c.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new ze2(ae0Var, contextA, scheduledExecutorService, bb3Var, ((jh2) this.f6455e).b().intValue(), ((kh2) this.f6456f).b().booleanValue(), ((mh2) this.f6457g).b().booleanValue());
    }
}
