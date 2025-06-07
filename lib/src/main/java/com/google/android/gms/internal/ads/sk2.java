package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class sk2 {

    /* renamed from: a, reason: collision with root package name */
    private final sp2 f15304a;

    /* renamed from: b, reason: collision with root package name */
    private final r01 f15305b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f15306c;

    /* renamed from: d, reason: collision with root package name */
    private rk2 f15307d;

    public sk2(sp2 sp2Var, r01 r01Var, Executor executor) {
        this.f15304a = sp2Var;
        this.f15305b = r01Var;
        this.f15306c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cq2 e() {
        do2 do2VarH = this.f15305b.h();
        return this.f15304a.c(do2VarH.f7445d, do2VarH.f7447f, do2VarH.f7451j);
    }

    public final ab3 c() {
        ab3 ab3VarE;
        rk2 rk2Var = this.f15307d;
        if (rk2Var != null) {
            return qa3.h(rk2Var);
        }
        if (((Boolean) kt.f11213a.e()).booleanValue()) {
            ab3VarE = qa3.e(qa3.l(ga3.D(this.f15305b.b().e(this.f15304a.a())), new pk2(this), this.f15306c), dt1.class, new ok2(this), this.f15306c);
        } else {
            rk2 rk2Var2 = new rk2(null, e(), null);
            this.f15307d = rk2Var2;
            ab3VarE = qa3.h(rk2Var2);
        }
        return qa3.l(ab3VarE, new w23() { // from class: com.google.android.gms.internal.ads.nk2
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                return (rk2) obj;
            }
        }, this.f15306c);
    }
}
