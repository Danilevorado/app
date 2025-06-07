package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class ru1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f14971a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f14972b;

    public ru1(q44 q44Var, q44 q44Var2) {
        this.f14971a = q44Var;
        this.f14972b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qu1 b() {
        return new qu1(((qm0) this.f14971a).a(), (ScheduledExecutorService) this.f14972b.b());
    }
}
