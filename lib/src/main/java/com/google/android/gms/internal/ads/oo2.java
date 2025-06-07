package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class oo2 {

    /* renamed from: a, reason: collision with root package name */
    private final hn2 f13348a;

    /* renamed from: b, reason: collision with root package name */
    private final ln2 f13349b;

    /* renamed from: c, reason: collision with root package name */
    private final jy1 f13350c;

    /* renamed from: d, reason: collision with root package name */
    private final tu2 f13351d;

    /* renamed from: e, reason: collision with root package name */
    private final au2 f13352e;

    public oo2(jy1 jy1Var, tu2 tu2Var, hn2 hn2Var, ln2 ln2Var, au2 au2Var) {
        this.f13348a = hn2Var;
        this.f13349b = ln2Var;
        this.f13350c = jy1Var;
        this.f13351d = tu2Var;
        this.f13352e = au2Var;
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), 2);
        }
    }

    public final void b(String str, int i10) {
        if (!this.f13348a.f9255j0) {
            this.f13351d.c(str, this.f13352e);
        } else {
            this.f13350c.f(new ly1(j3.t.b().a(), this.f13349b.f11674b, str, i10));
        }
    }

    public final void c(List list, int i10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), i10);
        }
    }
}
