package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static q a(m mVar, q qVar, r4 r4Var, List list) {
        if (mVar.m0(qVar.i())) {
            q qVarJ = mVar.J(qVar.i());
            if (qVarJ instanceof j) {
                return ((j) qVarJ).a(r4Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", qVar.i()));
        }
        if (!"hasOwnProperty".equals(qVar.i())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", qVar.i()));
        }
        s5.h("hasOwnProperty", 1, list);
        return mVar.m0(r4Var.b((q) list.get(0)).i()) ? q.f19198g : q.f19199h;
    }

    public static Iterator b(Map map) {
        return new l(map.keySet().iterator());
    }
}
