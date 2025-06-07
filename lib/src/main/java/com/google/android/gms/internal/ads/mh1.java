package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class mh1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f12118a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f12119b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f12120c;

    public mh1(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f12118a = q44Var;
        this.f12119b = q44Var2;
        this.f12120c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return new kh1((Executor) this.f12118a.b(), (fu0) this.f12119b.b(), (z81) this.f12120c.b());
    }
}
