package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class f43 implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    final Iterator f8109m;

    /* renamed from: n, reason: collision with root package name */
    Collection f8110n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ g43 f8111o;

    f43(g43 g43Var) {
        this.f8111o = g43Var;
        this.f8109m = g43Var.f8604o.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8109m.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f8109m.next();
        this.f8110n = (Collection) entry.getValue();
        return this.f8111o.b(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        i33.i(this.f8110n != null, "no calls to next() since the last call to remove()");
        this.f8109m.remove();
        this.f8111o.f8605p.f16167q -= this.f8110n.size();
        this.f8110n.clear();
        this.f8110n = null;
    }
}
