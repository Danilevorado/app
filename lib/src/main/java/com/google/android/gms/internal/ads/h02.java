package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h02 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f8934a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f8935b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f8936c;

    public h02(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f8934a = q44Var;
        this.f8935b = q44Var2;
        this.f8936c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return new g02((Context) this.f8934a.b(), (xv0) this.f8935b.b(), (Executor) this.f8936c.b());
    }
}
