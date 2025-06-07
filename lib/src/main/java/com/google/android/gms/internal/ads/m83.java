package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class m83 extends o83 {
    m83(ab3 ab3Var, Class cls, w93 w93Var) {
        super(ab3Var, cls, w93Var);
    }

    @Override // com.google.android.gms.internal.ads.o83
    final /* bridge */ /* synthetic */ Object E(Object obj, Throwable th) {
        w93 w93Var = (w93) obj;
        ab3 ab3VarA = w93Var.a(th);
        i33.d(ab3VarA, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", w93Var);
        return ab3VarA;
    }

    @Override // com.google.android.gms.internal.ads.o83
    final /* synthetic */ void F(Object obj) {
        w((ab3) obj);
    }
}
