package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class h12 implements jb1 {

    /* renamed from: a, reason: collision with root package name */
    private final hn2 f8951a;

    /* renamed from: b, reason: collision with root package name */
    private final l50 f8952b;

    /* renamed from: c, reason: collision with root package name */
    private final d3.b f8953c;

    /* renamed from: d, reason: collision with root package name */
    private d21 f8954d = null;

    h12(hn2 hn2Var, l50 l50Var, d3.b bVar) {
        this.f8951a = hn2Var;
        this.f8952b = l50Var;
        this.f8953c = bVar;
    }

    @Override // com.google.android.gms.internal.ads.jb1
    public final void a(boolean z10, Context context, y11 y11Var) throws ib1 {
        boolean zH0;
        try {
            d3.b bVar = d3.b.BANNER;
            int iOrdinal = this.f8953c.ordinal();
            if (iOrdinal == 1) {
                zH0 = this.f8952b.H0(l4.b.p1(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 6) {
                        zH0 = this.f8952b.k0(l4.b.p1(context));
                    }
                    throw new ib1("Adapter failed to show.");
                }
                zH0 = this.f8952b.q3(l4.b.p1(context));
            }
            if (zH0) {
                if (this.f8954d == null) {
                    return;
                }
                if (((Boolean) k3.w.c().b(ir.f10067r1)).booleanValue() || this.f8951a.Z != 2) {
                    return;
                }
                this.f8954d.a();
                return;
            }
            throw new ib1("Adapter failed to show.");
        } catch (Throwable th) {
            throw new ib1(th);
        }
    }

    public final void b(d21 d21Var) {
        this.f8954d = d21Var;
    }
}
