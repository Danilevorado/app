package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class oc2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final ke2 f13150a;

    /* renamed from: b, reason: collision with root package name */
    private final long f13151b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f13152c;

    public oc2(ke2 ke2Var, long j10, ScheduledExecutorService scheduledExecutorService) {
        this.f13150a = ke2Var;
        this.f13151b = j10;
        this.f13152c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return this.f13150a.a();
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        ab3 ab3VarB = this.f13150a.b();
        long j10 = this.f13151b;
        if (j10 > 0) {
            ab3VarB = qa3.n(ab3VarB, j10, TimeUnit.MILLISECONDS, this.f13152c);
        }
        return qa3.f(ab3VarB, Throwable.class, new w93() { // from class: com.google.android.gms.internal.ads.nc2
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return qa3.h(null);
            }
        }, of0.f13191f);
    }
}
