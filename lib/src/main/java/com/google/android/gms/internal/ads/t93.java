package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
final class t93 extends q93 {
    /* synthetic */ t93(s93 s93Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.q93
    final int a(u93 u93Var) {
        int i10;
        synchronized (u93Var) {
            i10 = u93Var.f16242u - 1;
            u93Var.f16242u = i10;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.q93
    final void b(u93 u93Var, Set set, Set set2) {
        synchronized (u93Var) {
            if (u93Var.f16241t == null) {
                u93Var.f16241t = set2;
            }
        }
    }
}
