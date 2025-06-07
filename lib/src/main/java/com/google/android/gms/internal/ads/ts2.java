package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ts2 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f16021a;

    /* renamed from: b, reason: collision with root package name */
    private final ef0 f16022b;

    public ts2(Executor executor, ef0 ef0Var) {
        this.f16021a = executor;
        this.f16022b = ef0Var;
    }

    final /* synthetic */ void a(String str) {
        this.f16022b.o(str);
    }

    public final void b(final String str) {
        this.f16021a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ss2
            @Override // java.lang.Runnable
            public final void run() {
                this.f15543m.a(str);
            }
        });
    }
}
