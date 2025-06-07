package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class g11 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final f11 f8563a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f8564b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f8565c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f8566d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f8567e;

    public g11(f11 f11Var, q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4) {
        this.f8563a = f11Var;
        this.f8564b = q44Var;
        this.f8565c = q44Var2;
        this.f8566d = q44Var3;
        this.f8567e = q44Var4;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* synthetic */ Object b() {
        Context context = (Context) this.f8564b.b();
        ff0 ff0VarA = ((cn0) this.f8565c).a();
        hn2 hn2VarA = ((ux0) this.f8566d).a();
        vb0 vb0Var = new vb0();
        if (hn2VarA.B == null) {
            return null;
        }
        nn2 nn2Var = hn2VarA.f9272t;
        return new ub0(context, ff0VarA, hn2VarA.B, nn2Var == null ? null : nn2Var.f12719b, vb0Var);
    }
}
