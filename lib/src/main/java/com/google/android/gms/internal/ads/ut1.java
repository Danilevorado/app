package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class ut1 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f16453a;

    /* renamed from: b, reason: collision with root package name */
    private final bb3 f16454b;

    /* renamed from: c, reason: collision with root package name */
    private final qu1 f16455c;

    /* renamed from: d, reason: collision with root package name */
    private final w34 f16456d;

    ut1(bb3 bb3Var, bb3 bb3Var2, qu1 qu1Var, w34 w34Var) {
        this.f16453a = bb3Var;
        this.f16454b = bb3Var2;
        this.f16455c = qu1Var;
        this.f16456d = w34Var;
    }

    final /* synthetic */ ab3 a(s80 s80Var) {
        return this.f16455c.c(s80Var, ((Long) k3.w.c().b(ir.M9)).longValue());
    }

    final /* synthetic */ ab3 b(s80 s80Var, int i10, dt1 dt1Var) {
        return ((xv1) this.f16456d.b()).L5(s80Var, i10);
    }

    public final ab3 c(final s80 s80Var) {
        String str = s80Var.f15150r;
        j3.t.r();
        ab3 ab3VarG = m3.b2.U(str) ? qa3.g(new dt1(1, "Ads service proxy force local")) : qa3.f(qa3.k(new v93() { // from class: com.google.android.gms.internal.ads.rt1
            @Override // com.google.android.gms.internal.ads.v93
            public final ab3 a() {
                return this.f14959a.a(s80Var);
            }
        }, this.f16453a), ExecutionException.class, new w93() { // from class: com.google.android.gms.internal.ads.st1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                ExecutionException executionException = (ExecutionException) obj;
                Throwable cause = executionException.getCause();
                Throwable cause2 = executionException;
                if (cause != null) {
                    cause2 = executionException.getCause();
                }
                return qa3.g(cause2);
            }
        }, this.f16454b);
        final int callingUid = Binder.getCallingUid();
        return qa3.f(ab3VarG, dt1.class, new w93() { // from class: com.google.android.gms.internal.ads.tt1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f16029a.b(s80Var, callingUid, (dt1) obj);
            }
        }, this.f16454b);
    }
}
