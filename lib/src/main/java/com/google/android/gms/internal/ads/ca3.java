package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class ca3 extends o93 {
    private ba3 B;

    ca3(x53 x53Var, boolean z10, Executor executor, Callable callable) {
        super(x53Var, z10, false);
        this.B = new aa3(this, callable, executor);
        S();
    }

    @Override // com.google.android.gms.internal.ads.o93
    final void Q(int i10, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.o93
    final void R() {
        ba3 ba3Var = this.B;
        if (ba3Var != null) {
            ba3Var.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.o93
    final void V(int i10) {
        super.V(i10);
        if (i10 == 1) {
            this.B = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.b93
    protected final void u() {
        ba3 ba3Var = this.B;
        if (ba3Var != null) {
            ba3Var.g();
        }
    }
}
