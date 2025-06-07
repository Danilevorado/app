package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ho2 {
    public static k3.h4 a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            in2 in2Var = (in2) it.next();
            if (in2Var.f9812c) {
                arrayList.add(d3.g.f22844p);
            } else {
                arrayList.add(new d3.g(in2Var.f9810a, in2Var.f9811b));
            }
        }
        return new k3.h4(context, (d3.g[]) arrayList.toArray(new d3.g[arrayList.size()]));
    }

    public static in2 b(k3.h4 h4Var) {
        return h4Var.f24659u ? new in2(-3, 0, true) : new in2(h4Var.f24655q, h4Var.f24652n, false);
    }
}
