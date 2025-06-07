package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class vb2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f16646a;

    /* renamed from: b, reason: collision with root package name */
    private final gn2 f16647b;

    public vb2(bb3 bb3Var, gn2 gn2Var) {
        this.f16646a = bb3Var;
        this.f16647b = gn2Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 25;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f16646a.g(new Callable() { // from class: com.google.android.gms.internal.ads.ub2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f16274a.c();
            }
        });
    }

    final /* synthetic */ wb2 c() {
        return new wb2(this.f16647b);
    }
}
