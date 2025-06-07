package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z81 extends z61 implements nj {

    /* renamed from: n, reason: collision with root package name */
    private final Map f18472n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f18473o;

    /* renamed from: p, reason: collision with root package name */
    private final hn2 f18474p;

    public z81(Context context, Set set, hn2 hn2Var) {
        super(set);
        this.f18472n = new WeakHashMap(1);
        this.f18473o = context;
        this.f18474p = hn2Var;
    }

    @Override // com.google.android.gms.internal.ads.nj
    public final synchronized void U(final mj mjVar) {
        q0(new y61() { // from class: com.google.android.gms.internal.ads.y81
            @Override // com.google.android.gms.internal.ads.y61
            public final void a(Object obj) {
                ((nj) obj).U(mjVar);
            }
        });
    }

    public final synchronized void r0(View view) {
        oj ojVar = (oj) this.f18472n.get(view);
        if (ojVar == null) {
            ojVar = new oj(this.f18473o, view);
            ojVar.c(this);
            this.f18472n.put(view, ojVar);
        }
        if (this.f18474p.Y) {
            if (((Boolean) k3.w.c().b(ir.f9980j1)).booleanValue()) {
                ojVar.g(((Long) k3.w.c().b(ir.f9969i1)).longValue());
                return;
            }
        }
        ojVar.f();
    }

    public final synchronized void s0(View view) {
        if (this.f18472n.containsKey(view)) {
            ((oj) this.f18472n.get(view)).e(this);
            this.f18472n.remove(view);
        }
    }
}
