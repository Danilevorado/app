package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class vy3 extends yy3 {
    /* synthetic */ vy3(uy3 uy3Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.yy3
    final List a(Object obj, long j10) {
        ky3 ky3Var = (ky3) t04.p(obj, j10);
        if (ky3Var.d()) {
            return ky3Var;
        }
        int size = ky3Var.size();
        ky3 ky3VarJ = ky3Var.j(size == 0 ? 10 : size + size);
        t04.D(obj, j10, ky3VarJ);
        return ky3VarJ;
    }

    @Override // com.google.android.gms.internal.ads.yy3
    final void b(Object obj, long j10) {
        ((ky3) t04.p(obj, j10)).b();
    }

    @Override // com.google.android.gms.internal.ads.yy3
    final void c(Object obj, Object obj2, long j10) {
        ky3 ky3VarJ = (ky3) t04.p(obj, j10);
        ky3 ky3Var = (ky3) t04.p(obj2, j10);
        int size = ky3VarJ.size();
        int size2 = ky3Var.size();
        if (size > 0 && size2 > 0) {
            if (!ky3VarJ.d()) {
                ky3VarJ = ky3VarJ.j(size2 + size);
            }
            ky3VarJ.addAll(ky3Var);
        }
        if (size > 0) {
            ky3Var = ky3VarJ;
        }
        t04.D(obj, j10, ky3Var);
    }
}
