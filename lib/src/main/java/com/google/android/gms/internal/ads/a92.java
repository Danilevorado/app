package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class a92 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f6009a;

    /* renamed from: b, reason: collision with root package name */
    private final do2 f6010b;

    /* renamed from: c, reason: collision with root package name */
    private final ff0 f6011c;

    /* renamed from: d, reason: collision with root package name */
    private final me0 f6012d;

    public a92(bb3 bb3Var, do2 do2Var, ff0 ff0Var, me0 me0Var) {
        this.f6009a = bb3Var;
        this.f6010b = do2Var;
        this.f6011c = ff0Var;
        this.f6012d = me0Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f6009a.g(new Callable() { // from class: com.google.android.gms.internal.ads.z82
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f18475a.c();
            }
        });
    }

    final /* synthetic */ b92 c() {
        return new b92(this.f6010b.f7451j, this.f6011c, this.f6012d.k());
    }
}
