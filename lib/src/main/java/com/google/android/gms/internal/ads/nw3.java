package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
final class nw3 implements Comparator {
    nw3() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        ww3 ww3Var = (ww3) obj;
        ww3 ww3Var2 = (ww3) obj2;
        qw3 it = ww3Var.iterator();
        qw3 it2 = ww3Var2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo = Integer.valueOf(it.a() & 255).compareTo(Integer.valueOf(it2.a() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(ww3Var.n()).compareTo(Integer.valueOf(ww3Var2.n()));
    }
}
