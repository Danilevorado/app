package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* loaded from: classes.dex */
final class o7 implements Comparator {
    o7() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        x7 x7Var = (x7) obj;
        x7 x7Var2 = (x7) obj2;
        n7 n7Var = new n7(x7Var);
        n7 n7Var2 = new n7(x7Var2);
        while (n7Var.hasNext() && n7Var2.hasNext()) {
            int iCompareTo = Integer.valueOf(n7Var.a() & 255).compareTo(Integer.valueOf(n7Var2.a() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(x7Var.h()).compareTo(Integer.valueOf(x7Var2.h()));
    }
}
