package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class i43 implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    Map.Entry f9541m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Iterator f9542n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ j43 f9543o;

    i43(j43 j43Var, Iterator it) {
        this.f9543o = j43Var;
        this.f9542n = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9542n.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f9542n.next();
        this.f9541m = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        i33.i(this.f9541m != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f9541m.getValue();
        this.f9542n.remove();
        this.f9543o.f10296n.f16167q -= collection.size();
        collection.clear();
        this.f9541m = null;
    }
}
