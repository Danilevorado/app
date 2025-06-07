package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class ak2 implements nq2 {

    /* renamed from: a, reason: collision with root package name */
    public final vk2 f6128a;

    /* renamed from: b, reason: collision with root package name */
    public final xk2 f6129b;

    /* renamed from: c, reason: collision with root package name */
    public final k3.c4 f6130c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6131d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f6132e;

    /* renamed from: f, reason: collision with root package name */
    public final k3.n4 f6133f;

    /* renamed from: g, reason: collision with root package name */
    public final cq2 f6134g;

    public ak2(vk2 vk2Var, xk2 xk2Var, k3.c4 c4Var, String str, Executor executor, k3.n4 n4Var, cq2 cq2Var) {
        this.f6128a = vk2Var;
        this.f6129b = xk2Var;
        this.f6130c = c4Var;
        this.f6131d = str;
        this.f6132e = executor;
        this.f6133f = n4Var;
        this.f6134g = cq2Var;
    }

    @Override // com.google.android.gms.internal.ads.nq2
    public final cq2 a() {
        return this.f6134g;
    }

    @Override // com.google.android.gms.internal.ads.nq2
    public final Executor b() {
        return this.f6132e;
    }
}
