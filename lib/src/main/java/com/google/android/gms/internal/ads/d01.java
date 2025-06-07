package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class d01 implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f7134a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f7135b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f7136c;

    public d01(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f7134a = q44Var;
        this.f7135b = q44Var2;
        this.f7136c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        final Context context = (Context) this.f7134a.b();
        final ff0 ff0VarA = ((cn0) this.f7135b).a();
        final do2 do2VarA = ((b11) this.f7136c).a();
        return new w23() { // from class: com.google.android.gms.internal.ads.c01
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                Context context2 = context;
                ff0 ff0Var = ff0VarA;
                do2 do2Var = do2VarA;
                hn2 hn2Var = (hn2) obj;
                m3.t tVar = new m3.t(context2);
                tVar.p(hn2Var.C);
                tVar.q(hn2Var.D.toString());
                tVar.o(ff0Var.f8252m);
                tVar.n(do2Var.f7447f);
                return tVar;
            }
        };
    }
}
