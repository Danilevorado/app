package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class at1 implements ct1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f6241a;

    /* renamed from: b, reason: collision with root package name */
    private final bb3 f6242b;

    /* renamed from: c, reason: collision with root package name */
    private final g41 f6243c;

    public at1(Map map, bb3 bb3Var, g41 g41Var) {
        this.f6241a = map;
        this.f6242b = bb3Var;
        this.f6243c = g41Var;
    }

    @Override // com.google.android.gms.internal.ads.ct1
    public final ab3 a(final k90 k90Var) {
        this.f6243c.g(k90Var);
        ab3 ab3VarG = qa3.g(new yq1(3));
        for (String str : ((String) k3.w.c().b(ir.G7)).split(",")) {
            final q44 q44Var = (q44) this.f6241a.get(str.trim());
            if (q44Var != null) {
                ab3VarG = qa3.f(ab3VarG, yq1.class, new w93() { // from class: com.google.android.gms.internal.ads.ys1
                    @Override // com.google.android.gms.internal.ads.w93
                    public final ab3 a(Object obj) {
                        q44 q44Var2 = q44Var;
                        return ((ct1) q44Var2.b()).a(k90Var);
                    }
                }, this.f6242b);
            }
        }
        qa3.q(ab3VarG, new zs1(this), of0.f13191f);
        return ab3VarG;
    }
}
