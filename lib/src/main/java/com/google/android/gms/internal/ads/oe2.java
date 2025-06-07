package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class oe2 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f13176a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f13177b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f13178c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f13179d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f13180e;

    public oe2(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5) {
        this.f13176a = q44Var;
        this.f13177b = q44Var2;
        this.f13178c = q44Var3;
        this.f13179d = q44Var4;
        this.f13180e = q44Var5;
    }

    @Override // com.google.android.gms.internal.ads.q44
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ne2 b() {
        Context contextA = ((qm0) this.f13176a).a();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new ne2(contextA, bb3Var, ((o44) this.f13178c).b(), (au2) this.f13179d.b(), (xm1) this.f13180e.b());
    }
}
