package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class qi extends ui {

    /* renamed from: i, reason: collision with root package name */
    private final View f14328i;

    public qi(dh dhVar, String str, String str2, xc xcVar, int i10, int i11, View view) {
        super(dhVar, "W/9c3Hd1yf7t5yHhoE/TlmEcdgBJrlLUo34Voj/Idw5FIbJ80EX+SS3nO2jLEMGu", "gqK1fJWMt2lYn7O2X7ompi2Bw14HxMMjzTnJdiQom2Q=", xcVar, i10, 57);
        this.f14328i = view;
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        if (this.f14328i != null) {
            Boolean bool = (Boolean) k3.w.c().b(ir.Y2);
            Boolean bool2 = (Boolean) k3.w.c().b(ir.f10053p9);
            ih ihVar = new ih((String) this.f16346f.invoke(null, this.f14328i, this.f16342b.b().getResources().getDisplayMetrics(), bool, bool2));
            td tdVarK = ud.K();
            tdVarK.v(ihVar.f9741b.longValue());
            tdVarK.y(ihVar.f9742c.longValue());
            tdVarK.z(ihVar.f9743d.longValue());
            if (bool2.booleanValue()) {
                tdVarK.w(ihVar.f9745f.longValue());
            }
            if (bool.booleanValue()) {
                tdVarK.u(ihVar.f9744e.longValue());
            }
            this.f16345e.T((ud) tdVarK.m());
        }
    }
}
