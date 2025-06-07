package com.google.android.gms.internal.measurement;

import com.facebook.ads.AdError;
import java.util.List;

/* loaded from: classes.dex */
public final class fe extends j {

    /* renamed from: o, reason: collision with root package name */
    private final je f18953o;

    public fe(je jeVar) {
        super("internal.registerCallback");
        this.f18953o = jeVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(r4 r4Var, List list) {
        s5.h(this.f19019m, 3, list);
        String strI = r4Var.b((q) list.get(0)).i();
        q qVarB = r4Var.b((q) list.get(1));
        if (!(qVarB instanceof p)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        q qVarB2 = r4Var.b((q) list.get(2));
        if (!(qVarB2 instanceof n)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        n nVar = (n) qVarB2;
        if (!nVar.m0("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f18953o.a(strI, nVar.m0("priority") ? s5.b(nVar.J("priority").g().doubleValue()) : AdError.NETWORK_ERROR_CODE, (p) qVarB, nVar.J("type").i());
        return q.f19193b;
    }
}
