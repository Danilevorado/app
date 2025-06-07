package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class x93 extends z93 {
    x93(x53 x53Var, boolean z10) {
        super(x53Var, true);
        S();
    }

    @Override // com.google.android.gms.internal.ads.z93
    public final /* bridge */ /* synthetic */ Object W(List list) {
        ArrayList arrayListA = q63.a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y93 y93Var = (y93) it.next();
            arrayListA.add(y93Var != null ? y93Var.f17941a : null);
        }
        return Collections.unmodifiableList(arrayListA);
    }
}
