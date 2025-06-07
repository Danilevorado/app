package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g12 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f8568a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f8569b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f8570c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f8571d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f8572e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f8573f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f8574g;

    public g12(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5, q44 q44Var6, q44 q44Var7) {
        this.f8568a = q44Var;
        this.f8569b = q44Var2;
        this.f8570c = q44Var3;
        this.f8571d = q44Var4;
        this.f8572e = q44Var5;
        this.f8573f = q44Var6;
        this.f8574g = q44Var7;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return new f12((Context) this.f8568a.b(), ((cn0) this.f8569b).a(), ((b11) this.f8570c).a(), (Executor) this.f8571d.b(), (bb1) this.f8572e.b(), (dk1) this.f8573f.b(), new iy());
    }
}
