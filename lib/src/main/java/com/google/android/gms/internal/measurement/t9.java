package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class t9 {
    t9() {
    }

    public static final int a(int i10, Object obj, Object obj2) {
        s9 s9Var = (s9) obj;
        a5.a.a(obj2);
        if (s9Var.isEmpty()) {
            return 0;
        }
        Iterator it = s9Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object b(Object obj, Object obj2) {
        s9 s9VarB = (s9) obj;
        s9 s9Var = (s9) obj2;
        if (!s9Var.isEmpty()) {
            if (!s9VarB.f()) {
                s9VarB = s9VarB.b();
            }
            s9VarB.d(s9Var);
        }
        return s9VarB;
    }
}
