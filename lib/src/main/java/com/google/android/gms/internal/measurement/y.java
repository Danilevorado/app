package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    final Map f19409a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    final l0 f19410b = new l0();

    public y() {
        b(new w());
        b(new z());
        b(new a0());
        b(new e0());
        b(new j0());
        b(new k0());
        b(new m0());
    }

    public final q a(r4 r4Var, q qVar) {
        s5.c(r4Var);
        if (!(qVar instanceof r)) {
            return qVar;
        }
        r rVar = (r) qVar;
        ArrayList arrayListB = rVar.b();
        String strA = rVar.a();
        return (this.f19409a.containsKey(strA) ? (x) this.f19409a.get(strA) : this.f19410b).a(strA, r4Var, arrayListB);
    }

    final void b(x xVar) {
        Iterator it = xVar.f19387a.iterator();
        while (it.hasNext()) {
            this.f19409a.put(((n0) it.next()).d().toString(), xVar);
        }
    }
}
