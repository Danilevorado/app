package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class jt2 implements ws2 {

    /* renamed from: a, reason: collision with root package name */
    private final gt2 f10714a;

    /* renamed from: b, reason: collision with root package name */
    private final et2 f10715b;

    public jt2(gt2 gt2Var, et2 et2Var) {
        this.f10714a = gt2Var;
        this.f10715b = et2Var;
    }

    @Override // com.google.android.gms.internal.ads.ws2
    public final void a(vs2 vs2Var) {
    }

    @Override // com.google.android.gms.internal.ads.ws2
    public final String b(vs2 vs2Var) {
        gt2 gt2Var = this.f10714a;
        Map mapJ = vs2Var.j();
        this.f10715b.a(mapJ);
        return gt2Var.a(mapJ);
    }
}
