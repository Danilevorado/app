package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class j93 extends l93 {
    j93(ab3 ab3Var, w93 w93Var) {
        super(ab3Var, w93Var);
    }

    @Override // com.google.android.gms.internal.ads.l93
    final /* bridge */ /* synthetic */ Object E(Object obj, Object obj2) {
        w93 w93Var = (w93) obj;
        ab3 ab3VarA = w93Var.a(obj2);
        i33.d(ab3VarA, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", w93Var);
        return ab3VarA;
    }

    @Override // com.google.android.gms.internal.ads.l93
    final /* synthetic */ void F(Object obj) {
        w((ab3) obj);
    }
}
