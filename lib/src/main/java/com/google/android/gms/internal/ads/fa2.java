package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class fa2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f8203a;

    fa2(bb3 bb3Var) {
        this.f8203a = bb3Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f8203a.g(new Callable() { // from class: com.google.android.gms.internal.ads.ea2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ga2(Long.valueOf(j3.t.b().a() - j3.t.q().h().g().a()).longValue());
            }
        });
    }
}
