package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vz0 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f16913a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f16914b;

    public vz0(q44 q44Var, q44 q44Var2) {
        this.f16913a = q44Var;
        this.f16914b = q44Var2;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return new x81((u51) this.f16913a.b(), (Executor) this.f16914b.b());
    }
}
