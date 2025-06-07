package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class c82 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f6828a;

    /* renamed from: b, reason: collision with root package name */
    private final do2 f6829b;

    /* renamed from: c, reason: collision with root package name */
    private final ro2 f6830c;

    c82(bb3 bb3Var, do2 do2Var, ro2 ro2Var) {
        this.f6828a = bb3Var;
        this.f6829b = do2Var;
        this.f6830c = ro2Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f6828a.g(new Callable() { // from class: com.google.android.gms.internal.ads.b82
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f6390a.c();
            }
        });
    }

    final /* synthetic */ d82 c() {
        String strA = null;
        if (((Boolean) k3.w.c().b(ir.Q6)).booleanValue() && "requester_type_2".equals(s3.y.b(this.f6829b.f7445d))) {
            strA = ro2.a();
        }
        return new d82(strA);
    }
}
