package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class m92 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f12016a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f12017b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f12018c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f12019d;

    public m92(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4) {
        this.f12016a = q44Var;
        this.f12017b = q44Var2;
        this.f12018c = q44Var3;
        this.f12019d = q44Var4;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        Context contextA = ((qm0) this.f12016a).a();
        je0 je0Var = (je0) this.f12017b.b();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f12018c.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new k92(contextA, je0Var, scheduledExecutorService, bb3Var);
    }
}
