package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class nb2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f12573a;

    /* renamed from: b, reason: collision with root package name */
    private final xp1 f12574b;

    nb2(bb3 bb3Var, xp1 xp1Var) {
        this.f12573a = bb3Var;
        this.f12574b = xp1Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f12573a.g(new Callable() { // from class: com.google.android.gms.internal.ads.mb2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12036a.c();
            }
        });
    }

    final /* synthetic */ ob2 c() {
        return new ob2(this.f12574b.c(), this.f12574b.p(), j3.t.u().l(), this.f12574b.n());
    }
}
