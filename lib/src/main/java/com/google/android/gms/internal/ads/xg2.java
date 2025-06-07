package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class xg2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    final bb3 f17550a;

    /* renamed from: b, reason: collision with root package name */
    final List f17551b;

    /* renamed from: c, reason: collision with root package name */
    final sq f17552c;

    public xg2(sq sqVar, bb3 bb3Var, List list) {
        this.f17552c = sqVar;
        this.f17550a = bb3Var;
        this.f17551b = list;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f17550a.g(new Callable() { // from class: com.google.android.gms.internal.ads.wg2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new yg2(this.f17120a.f17551b);
            }
        });
    }
}
