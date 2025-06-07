package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class v32 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f16561a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f16562b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f16563c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f16564d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f16565e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f16566f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f16567g;

    public v32(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5, q44 q44Var6, q44 q44Var7) {
        this.f16561a = q44Var;
        this.f16562b = q44Var2;
        this.f16563c = q44Var3;
        this.f16564d = q44Var4;
        this.f16565e = q44Var5;
        this.f16566f = q44Var6;
        this.f16567g = q44Var7;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return new u32((Context) this.f16561a.b(), ((cn0) this.f16562b).a(), ((b11) this.f16563c).a(), (Executor) this.f16564d.b(), (lj1) this.f16565e.b(), (dk1) this.f16566f.b(), new iy());
    }
}
