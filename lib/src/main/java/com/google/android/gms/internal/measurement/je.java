package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class je {

    /* renamed from: a, reason: collision with root package name */
    final TreeMap f19041a = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    final TreeMap f19042b = new TreeMap();

    private static final int c(r4 r4Var, p pVar, q qVar) {
        q qVarA = pVar.a(r4Var, Collections.singletonList(qVar));
        if (qVarA instanceof i) {
            return s5.b(qVarA.g().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i10, p pVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f19042b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.f19041a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), pVar);
    }

    public final void b(r4 r4Var, c cVar) {
        n9 n9Var = new n9(cVar);
        for (Integer num : this.f19041a.keySet()) {
            b bVarClone = cVar.b().clone();
            int iC = c(r4Var, (p) this.f19041a.get(num), n9Var);
            if (iC == 2 || iC == -1) {
                cVar.f(bVarClone);
            }
        }
        Iterator it = this.f19042b.keySet().iterator();
        while (it.hasNext()) {
            c(r4Var, (p) this.f19042b.get((Integer) it.next()), n9Var);
        }
    }
}
