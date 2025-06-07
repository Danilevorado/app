package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class z93 extends o93 {
    private List B;

    z93(x53 x53Var, boolean z10) {
        super(x53Var, true, true);
        List listEmptyList = x53Var.isEmpty() ? Collections.emptyList() : q63.a(x53Var.size());
        for (int i10 = 0; i10 < x53Var.size(); i10++) {
            listEmptyList.add(null);
        }
        this.B = listEmptyList;
    }

    @Override // com.google.android.gms.internal.ads.o93
    final void Q(int i10, Object obj) {
        List list = this.B;
        if (list != null) {
            list.set(i10, new y93(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.o93
    final void R() {
        List list = this.B;
        if (list != null) {
            h(W(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.o93
    final void V(int i10) {
        super.V(i10);
        this.B = null;
    }

    abstract Object W(List list);
}
