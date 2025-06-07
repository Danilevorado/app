package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class bb2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f6415a;

    public bb2(bb3 bb3Var) {
        this.f6415a = bb3Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f6415a.g(new Callable() { // from class: com.google.android.gms.internal.ads.ab2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new cb2(j3.t.u().b(), j3.t.u().m());
            }
        });
    }
}
