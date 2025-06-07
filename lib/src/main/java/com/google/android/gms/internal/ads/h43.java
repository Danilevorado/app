package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
abstract class h43 implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    final Iterator f9001m;

    /* renamed from: n, reason: collision with root package name */
    Object f9002n = null;

    /* renamed from: o, reason: collision with root package name */
    Collection f9003o = null;

    /* renamed from: p, reason: collision with root package name */
    Iterator f9004p = l63.INSTANCE;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ u43 f9005q;

    h43(u43 u43Var) {
        this.f9005q = u43Var;
        this.f9001m = u43Var.f16166p.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9001m.hasNext() || this.f9004p.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f9004p.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f9001m.next();
            this.f9002n = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f9003o = collection;
            this.f9004p = collection.iterator();
        }
        return this.f9004p.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f9004p.remove();
        Collection collection = this.f9003o;
        collection.getClass();
        if (collection.isEmpty()) {
            this.f9001m.remove();
        }
        u43 u43Var = this.f9005q;
        u43Var.f16167q--;
    }
}
