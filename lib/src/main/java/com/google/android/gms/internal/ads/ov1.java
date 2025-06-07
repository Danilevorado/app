package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class ov1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f13407a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f13408b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f13409c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f13410d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f13411e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f13412f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f13413g;

    /* renamed from: h, reason: collision with root package name */
    private final q44 f13414h;

    public ov1(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5, q44 q44Var6, q44 q44Var7, q44 q44Var8) {
        this.f13407a = q44Var;
        this.f13408b = q44Var2;
        this.f13409c = q44Var3;
        this.f13410d = q44Var4;
        this.f13411e = q44Var5;
        this.f13412f = q44Var6;
        this.f13413g = q44Var7;
        this.f13414h = q44Var8;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* synthetic */ Object b() {
        Context contextA = ((qm0) this.f13407a).a();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new nv1(contextA, bb3Var, new w90(), ((zm0) this.f13410d).b(), ((gw1) this.f13411e).b(), (ArrayDeque) this.f13412f.b(), new cw1(), (cu2) this.f13414h.b());
    }
}
