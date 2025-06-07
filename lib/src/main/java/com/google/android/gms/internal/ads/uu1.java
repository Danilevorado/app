package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class uu1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f16471a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f16472b;

    public uu1(q44 q44Var, q44 q44Var2) {
        this.f16471a = q44Var;
        this.f16472b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tu1 b() {
        return new tu1(((qm0) this.f16471a).a(), (ScheduledExecutorService) this.f16472b.b());
    }
}
