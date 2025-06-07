package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class k9 extends m9 {
    /* synthetic */ k9(j9 j9Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.m9
    final void a(Object obj, long j10) {
        ((a9) za.k(obj, j10)).b();
    }

    @Override // com.google.android.gms.internal.measurement.m9
    final void b(Object obj, Object obj2, long j10) {
        a9 a9VarJ = (a9) za.k(obj, j10);
        a9 a9Var = (a9) za.k(obj2, j10);
        int size = a9VarJ.size();
        int size2 = a9Var.size();
        if (size > 0 && size2 > 0) {
            if (!a9VarJ.d()) {
                a9VarJ = a9VarJ.j(size2 + size);
            }
            a9VarJ.addAll(a9Var);
        }
        if (size > 0) {
            a9Var = a9VarJ;
        }
        za.x(obj, j10, a9Var);
    }
}
