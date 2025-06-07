package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ev0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f7984a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f7985b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f7986c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f7987d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f7988e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f7989f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f7990g;

    /* renamed from: h, reason: collision with root package name */
    private final q44 f7991h;

    /* renamed from: i, reason: collision with root package name */
    private final q44 f7992i;

    /* renamed from: j, reason: collision with root package name */
    private final q44 f7993j;

    public ev0(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5, q44 q44Var6, q44 q44Var7, q44 q44Var8, q44 q44Var9, q44 q44Var10) {
        this.f7984a = q44Var;
        this.f7985b = q44Var2;
        this.f7986c = q44Var3;
        this.f7987d = q44Var4;
        this.f7988e = q44Var5;
        this.f7989f = q44Var6;
        this.f7990g = q44Var7;
        this.f7991h = q44Var8;
        this.f7992i = q44Var9;
        this.f7993j = q44Var10;
    }

    public static dv0 c(cx0 cx0Var, Context context, in2 in2Var, View view, nk0 nk0Var, bx0 bx0Var, ae1 ae1Var, h91 h91Var, w34 w34Var, Executor executor) {
        return new dv0(cx0Var, context, in2Var, view, nk0Var, bx0Var, ae1Var, h91Var, w34Var, executor);
    }

    @Override // com.google.android.gms.internal.ads.q44
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dv0 b() {
        return new dv0(((ez0) this.f7984a).b(), (Context) this.f7985b.b(), ((kv0) this.f7986c).a(), ((jv0) this.f7987d).a(), ((vv0) this.f7988e).a(), ((lv0) this.f7989f).a(), ((wb1) this.f7990g).a(), (h91) this.f7991h.b(), b44.a(this.f7992i), (Executor) this.f7993j.b());
    }
}
