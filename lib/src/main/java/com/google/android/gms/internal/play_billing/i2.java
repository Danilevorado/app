package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class i2 extends k2 {
    /* synthetic */ i2(h2 h2Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.k2
    final void a(Object obj, long j10) {
        ((u1) f4.k(obj, j10)).b();
    }

    @Override // com.google.android.gms.internal.play_billing.k2
    final void b(Object obj, Object obj2, long j10) {
        u1 u1VarJ = (u1) f4.k(obj, j10);
        u1 u1Var = (u1) f4.k(obj2, j10);
        int size = u1VarJ.size();
        int size2 = u1Var.size();
        if (size > 0 && size2 > 0) {
            if (!u1VarJ.d()) {
                u1VarJ = u1VarJ.j(size2 + size);
            }
            u1VarJ.addAll(u1Var);
        }
        if (size > 0) {
            u1Var = u1VarJ;
        }
        f4.x(obj, j10, u1Var);
    }
}
