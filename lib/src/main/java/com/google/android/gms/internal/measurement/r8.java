package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class r8 extends j {

    /* renamed from: o, reason: collision with root package name */
    private final c f19259o;

    public r8(c cVar) {
        super("internal.eventLogger");
        this.f19259o = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(r4 r4Var, List list) {
        s5.h(this.f19019m, 3, list);
        String strI = r4Var.b((q) list.get(0)).i();
        long jA = (long) s5.a(r4Var.b((q) list.get(1)).g().doubleValue());
        q qVarB = r4Var.b((q) list.get(2));
        this.f19259o.e(strI, jA, qVarB instanceof n ? s5.g((n) qVarB) : new HashMap());
        return q.f19193b;
    }
}
