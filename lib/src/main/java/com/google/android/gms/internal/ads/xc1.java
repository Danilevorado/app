package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class xc1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f17505a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f17506b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f17507c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f17508d;

    public xc1(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4) {
        this.f17505a = q44Var;
        this.f17506b = q44Var2;
        this.f17507c = q44Var3;
        this.f17508d = q44Var4;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        jj jjVar = (jj) this.f17505a.b();
        Executor executor = (Executor) this.f17506b.b();
        Context context = (Context) this.f17507c.b();
        return new fu0(executor, new qt0(context, jjVar), (i4.e) this.f17508d.b());
    }
}
