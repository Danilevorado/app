package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class ct2 implements ws2 {

    /* renamed from: a, reason: collision with root package name */
    private final gt2 f7064a;

    /* renamed from: b, reason: collision with root package name */
    private final et2 f7065b;

    /* renamed from: c, reason: collision with root package name */
    private final ts2 f7066c;

    public ct2(ts2 ts2Var, gt2 gt2Var, et2 et2Var) {
        this.f7066c = ts2Var;
        this.f7064a = gt2Var;
        this.f7065b = et2Var;
    }

    @Override // com.google.android.gms.internal.ads.ws2
    public final void a(vs2 vs2Var) {
        this.f7066c.b(b(vs2Var));
    }

    @Override // com.google.android.gms.internal.ads.ws2
    public final String b(vs2 vs2Var) {
        gt2 gt2Var = this.f7064a;
        Map mapJ = vs2Var.j();
        this.f7065b.a(mapJ);
        return gt2Var.a(mapJ);
    }
}
