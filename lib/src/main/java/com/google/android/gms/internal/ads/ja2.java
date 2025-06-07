package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ja2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f10411a;

    /* renamed from: b, reason: collision with root package name */
    private final vk1 f10412b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10413c;

    /* renamed from: d, reason: collision with root package name */
    private final do2 f10414d;

    public ja2(bb3 bb3Var, vk1 vk1Var, do2 do2Var, String str) {
        this.f10411a = bb3Var;
        this.f10412b = vk1Var;
        this.f10414d = do2Var;
        this.f10413c = str;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f10411a.g(new Callable() { // from class: com.google.android.gms.internal.ads.ia2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9656a.c();
            }
        });
    }

    final /* synthetic */ ka2 c() {
        return new ka2(this.f10412b.b(this.f10414d.f7447f, this.f10413c), this.f10412b.a());
    }
}
