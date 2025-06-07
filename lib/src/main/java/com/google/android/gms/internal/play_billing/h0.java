package com.google.android.gms.internal.play_billing;

import java.util.Comparator;

/* loaded from: classes.dex */
final class h0 implements Comparator {
    h0() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        q0 q0Var = (q0) obj;
        q0 q0Var2 = (q0) obj2;
        g0 g0Var = new g0(q0Var);
        g0 g0Var2 = new g0(q0Var2);
        while (g0Var.hasNext() && g0Var2.hasNext()) {
            int iCompareTo = Integer.valueOf(g0Var.a() & 255).compareTo(Integer.valueOf(g0Var2.a() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(q0Var.h()).compareTo(Integer.valueOf(q0Var2.h()));
    }
}
