package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class da2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f7235a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private final i4.e f7236b;

    /* renamed from: c, reason: collision with root package name */
    private final ke2 f7237c;

    /* renamed from: d, reason: collision with root package name */
    private final long f7238d;

    public da2(ke2 ke2Var, long j10, i4.e eVar) {
        this.f7236b = eVar;
        this.f7237c = ke2Var;
        this.f7238d = j10;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 16;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        ca2 ca2Var = (ca2) this.f7235a.get();
        if (ca2Var == null || ca2Var.a()) {
            ca2Var = new ca2(this.f7237c.b(), this.f7238d, this.f7236b);
            this.f7235a.set(ca2Var);
        }
        return ca2Var.f6857a;
    }
}
