package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class p43 implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    final Iterator f13585m;

    /* renamed from: n, reason: collision with root package name */
    final Collection f13586n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ q43 f13587o;

    p43(q43 q43Var) {
        this.f13587o = q43Var;
        Collection collection = q43Var.f14138n;
        this.f13586n = collection;
        this.f13585m = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    p43(q43 q43Var, Iterator it) {
        this.f13587o = q43Var;
        this.f13586n = q43Var.f14138n;
        this.f13585m = it;
    }

    final void b() {
        this.f13587o.b();
        if (this.f13587o.f14138n != this.f13586n) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        b();
        return this.f13585m.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        return this.f13585m.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f13585m.remove();
        u43 u43Var = this.f13587o.f14141q;
        u43Var.f16167q--;
        this.f13587o.f();
    }
}
