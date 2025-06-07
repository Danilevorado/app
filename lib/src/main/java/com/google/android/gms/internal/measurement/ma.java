package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
final class ma extends j {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ bc f19075o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ma(cb cbVar, String str, bc bcVar) {
        super("getValue");
        this.f19075o = bcVar;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final q a(r4 r4Var, List list) {
        s5.h("getValue", 2, list);
        q qVarB = r4Var.b((q) list.get(0));
        q qVarB2 = r4Var.b((q) list.get(1));
        String strO = this.f19075o.o(qVarB.i());
        return strO != null ? new u(strO) : qVarB2;
    }
}
