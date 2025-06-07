package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class wj2 implements wk2 {

    /* renamed from: a, reason: collision with root package name */
    private r01 f17177a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f17178b = hb3.b();

    @Override // com.google.android.gms.internal.ads.wk2
    public final /* bridge */ /* synthetic */ ab3 a(xk2 xk2Var, vk2 vk2Var, Object obj) {
        return c(xk2Var, vk2Var, null);
    }

    public final r01 b() {
        return this.f17177a;
    }

    public final ab3 c(xk2 xk2Var, vk2 vk2Var, r01 r01Var) {
        q01 q01VarA = vk2Var.a(xk2Var.f17615b);
        q01VarA.q(new al2(true));
        r01 r01Var2 = (r01) q01VarA.g();
        this.f17177a = r01Var2;
        final my0 my0VarB = r01Var2.b();
        final bq2 bq2Var = new bq2();
        return qa3.l(qa3.m(ga3.D(my0VarB.j()), new w93() { // from class: com.google.android.gms.internal.ads.uj2
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                bq2 bq2Var2 = bq2Var;
                my0 my0Var = my0VarB;
                un2 un2Var = (un2) obj;
                bq2Var2.f6643b = un2Var;
                Iterator it = un2Var.f16413b.f15923a.iterator();
                boolean z10 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((hn2) it.next()).f9236a.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z10 = true;
                        }
                    } else if (z10) {
                        return my0Var.i(qa3.h(un2Var));
                    }
                }
                return qa3.h(null);
            }
        }, this.f17178b), new w23() { // from class: com.google.android.gms.internal.ads.vj2
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                bq2 bq2Var2 = bq2Var;
                bq2Var2.f6644c = (ex0) obj;
                return bq2Var2;
            }
        }, this.f17178b);
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final /* synthetic */ Object f() {
        return this.f17177a;
    }
}
