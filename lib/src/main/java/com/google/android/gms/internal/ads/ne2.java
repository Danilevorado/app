package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ne2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12595a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f12596b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f12597c;

    /* renamed from: d, reason: collision with root package name */
    private final au2 f12598d;

    /* renamed from: e, reason: collision with root package name */
    private final xm1 f12599e;

    public ne2(Context context, Executor executor, Set set, au2 au2Var, xm1 xm1Var) {
        this.f12595a = context;
        this.f12597c = executor;
        this.f12596b = set;
        this.f12598d = au2Var;
        this.f12599e = xm1Var;
    }

    public final ab3 a(final Object obj) {
        ot2 ot2VarA = nt2.a(this.f12595a, 8);
        ot2VarA.g();
        final ArrayList arrayList = new ArrayList(this.f12596b.size());
        for (final ke2 ke2Var : this.f12596b) {
            ab3 ab3VarB = ke2Var.b();
            final long jB = j3.t.b().b();
            ab3VarB.b(new Runnable() { // from class: com.google.android.gms.internal.ads.le2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11538m.b(jB, ke2Var);
                }
            }, of0.f13191f);
            arrayList.add(ab3VarB);
        }
        ab3 ab3VarA = qa3.b(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.me2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list = arrayList;
                Object obj2 = obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    je2 je2Var = (je2) ((ab3) it.next()).get();
                    if (je2Var != null) {
                        je2Var.c(obj2);
                    }
                }
                return obj2;
            }
        }, this.f12597c);
        if (cu2.a()) {
            zt2.a(ab3VarA, this.f12598d, ot2VarA);
        }
        return ab3VarA;
    }

    public final void b(long j10, ke2 ke2Var) {
        long jB = j3.t.b().b() - j10;
        if (((Boolean) ht.f9410a.e()).booleanValue()) {
            m3.n1.k("Signal runtime (ms) : " + y33.c(ke2Var.getClass().getCanonicalName()) + " = " + jB);
        }
        if (((Boolean) k3.w.c().b(ir.S1)).booleanValue()) {
            wm1 wm1VarA = this.f12599e.a();
            wm1VarA.b("action", "lat_ms");
            wm1VarA.b("lat_grp", "sig_lat_grp");
            wm1VarA.b("lat_id", String.valueOf(ke2Var.a()));
            wm1VarA.b("clat_ms", String.valueOf(jB));
            if (((Boolean) k3.w.c().b(ir.T1)).booleanValue()) {
                wm1VarA.b("seq_num", j3.t.q().g().c());
            }
            wm1VarA.h();
        }
    }
}
