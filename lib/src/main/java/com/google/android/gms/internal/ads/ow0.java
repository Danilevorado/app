package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ow0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f13423a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f13424b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f13425c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f13426d;

    public ow0(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4) {
        this.f13423a = q44Var;
        this.f13424b = q44Var2;
        this.f13425c = q44Var3;
        this.f13426d = q44Var4;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return new jw0(((ez0) this.f13423a).b(), ((nw0) this.f13424b).a(), ((mw0) this.f13425c).a(), (Executor) this.f13426d.b());
    }
}
