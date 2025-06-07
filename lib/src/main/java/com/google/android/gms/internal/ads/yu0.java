package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class yu0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f18273a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f18274b;

    public yu0(q44 q44Var, q44 q44Var2) {
        this.f18273a = q44Var;
        this.f18274b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c41 b() {
        return new c41((ScheduledExecutorService) this.f18273a.b(), (i4.e) this.f18274b.b());
    }
}
