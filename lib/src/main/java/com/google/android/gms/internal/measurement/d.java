package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class d implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Iterator f18892m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Iterator f18893n;

    d(f fVar, Iterator it, Iterator it2) {
        this.f18892m = it;
        this.f18893n = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f18892m.hasNext()) {
            return true;
        }
        return this.f18893n.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f18892m.hasNext()) {
            return new u(((Integer) this.f18892m.next()).toString());
        }
        if (this.f18893n.hasNext()) {
            return new u((String) this.f18893n.next());
        }
        throw new NoSuchElementException();
    }
}
