package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ge extends j {

    /* renamed from: o, reason: collision with root package name */
    private final t7 f18965o;

    /* renamed from: p, reason: collision with root package name */
    final Map f18966p;

    public ge(t7 t7Var) {
        super("require");
        this.f18966p = new HashMap();
        this.f18965o = t7Var;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(r4 r4Var, List list) {
        q qVar;
        s5.h("require", 1, list);
        String strI = r4Var.b((q) list.get(0)).i();
        if (this.f18966p.containsKey(strI)) {
            return (q) this.f18966p.get(strI);
        }
        t7 t7Var = this.f18965o;
        if (t7Var.f19318a.containsKey(strI)) {
            try {
                qVar = (q) ((Callable) t7Var.f19318a.get(strI)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strI)));
            }
        } else {
            qVar = q.f19193b;
        }
        if (qVar instanceof j) {
            this.f18966p.put(strI, (j) qVar);
        }
        return qVar;
    }
}
