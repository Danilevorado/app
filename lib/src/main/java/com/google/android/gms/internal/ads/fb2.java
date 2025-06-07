package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class fb2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f8211a;

    /* renamed from: b, reason: collision with root package name */
    private final do2 f8212b;

    fb2(bb3 bb3Var, do2 do2Var) {
        this.f8211a = bb3Var;
        this.f8212b = do2Var;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f8211a.g(new Callable() { // from class: com.google.android.gms.internal.ads.eb2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f7700a.c();
            }
        });
    }

    final /* synthetic */ gb2 c() {
        return new gb2("requester_type_2".equals(s3.y.b(this.f8212b.f7445d)));
    }
}
