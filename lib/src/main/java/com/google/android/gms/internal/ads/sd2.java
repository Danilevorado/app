package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class sd2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f15193a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f15194b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f15195c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f15196d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f15197e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f15198f;

    public sd2(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5, q44 q44Var6) {
        this.f15193a = q44Var;
        this.f15194b = q44Var2;
        this.f15195c = q44Var3;
        this.f15196d = q44Var4;
        this.f15197e = q44Var5;
        this.f15198f = q44Var6;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new qd2(bb3Var, (ScheduledExecutorService) this.f15194b.b(), (String) this.f15195c.b(), (Context) this.f15196d.b(), ((b11) this.f15197e).a(), (km0) this.f15198f.b());
    }
}
