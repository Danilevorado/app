package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ir1 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f10165a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f10166b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f10167c;

    public ir1(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f10165a = q44Var;
        this.f10166b = q44Var2;
        this.f10167c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        final bg bgVar = (bg) this.f10165a.b();
        final Context contextA = ((qm0) this.f10166b).a();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        ab3 ab3VarG = bb3Var.g(new Callable() { // from class: com.google.android.gms.internal.ads.fr1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                bg bgVar2 = bgVar;
                return bgVar2.c().e(contextA);
            }
        });
        k44.b(ab3VarG);
        return ab3VarG;
    }
}
