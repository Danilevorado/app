package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class ez3 {
    ez3() {
    }

    public static final int a(int i10, Object obj, Object obj2) {
        dz3 dz3Var = (dz3) obj;
        a5.a.a(obj2);
        if (dz3Var.isEmpty()) {
            return 0;
        }
        Iterator it = dz3Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean b(Object obj) {
        return !((dz3) obj).f();
    }

    public static final Object c(Object obj, Object obj2) {
        dz3 dz3VarB = (dz3) obj;
        dz3 dz3Var = (dz3) obj2;
        if (!dz3Var.isEmpty()) {
            if (!dz3VarB.f()) {
                dz3VarB = dz3VarB.b();
            }
            dz3VarB.d(dz3Var);
        }
        return dz3VarB;
    }
}
