package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class sc2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f15191a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f15192b;

    public sc2(bb3 bb3Var, Bundle bundle) {
        this.f15191a = bb3Var;
        this.f15192b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 30;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f15191a.g(new Callable() { // from class: com.google.android.gms.internal.ads.rc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f14745a.c();
            }
        });
    }

    final /* synthetic */ tc2 c() {
        return new tc2(this.f15192b);
    }
}
