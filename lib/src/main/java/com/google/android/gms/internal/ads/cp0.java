package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class cp0 implements tj2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7011a;

    /* renamed from: b, reason: collision with root package name */
    private final k3.h4 f7012b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7013c;

    /* renamed from: d, reason: collision with root package name */
    private final ho0 f7014d;

    /* renamed from: e, reason: collision with root package name */
    private final cp0 f7015e = this;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f7016f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f7017g;

    /* renamed from: h, reason: collision with root package name */
    private final q44 f7018h;

    /* renamed from: i, reason: collision with root package name */
    private final q44 f7019i;

    /* renamed from: j, reason: collision with root package name */
    private final q44 f7020j;

    /* renamed from: k, reason: collision with root package name */
    private final q44 f7021k;

    /* synthetic */ cp0(ho0 ho0Var, Context context, String str, k3.h4 h4Var, bp0 bp0Var) {
        this.f7014d = ho0Var;
        this.f7011a = context;
        this.f7012b = h4Var;
        this.f7013c = str;
        c44 c44VarA = d44.a(context);
        this.f7016f = c44VarA;
        c44 c44VarA2 = d44.a(h4Var);
        this.f7017g = c44VarA2;
        q44 q44VarC = b44.c(new r62(ho0Var.f9309p));
        this.f7018h = q44VarC;
        q44 q44VarC2 = b44.c(x62.a());
        this.f7019i = q44VarC2;
        q44 q44VarC3 = b44.c(n61.a());
        this.f7020j = q44VarC3;
        this.f7021k = b44.c(new rj2(c44VarA, ho0Var.f9311q, c44VarA2, ho0Var.V, q44VarC, q44VarC2, fo2.a(), q44VarC3));
    }

    @Override // com.google.android.gms.internal.ads.tj2
    public final w52 a() {
        Context context = this.f7011a;
        k3.h4 h4Var = this.f7012b;
        String str = this.f7013c;
        qj2 qj2Var = (qj2) this.f7021k.b();
        q62 q62Var = (q62) this.f7018h.b();
        ff0 ff0VarD = this.f7014d.f9281b.d();
        k44.b(ff0VarD);
        return new w52(context, h4Var, str, qj2Var, q62Var, ff0VarD);
    }
}
