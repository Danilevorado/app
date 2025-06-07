package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class gh2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f8735a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f8736b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f8737c;

    public gh2(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f8735a = q44Var;
        this.f8736b = q44Var2;
        this.f8737c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return new dh2(new h70(), (ScheduledExecutorService) this.f8736b.b(), ((qm0) this.f8737c).a());
    }
}
