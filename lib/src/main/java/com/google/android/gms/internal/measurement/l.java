package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes.dex */
final class l implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Iterator f19055m;

    l(Iterator it) {
        this.f19055m = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19055m.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new u((String) this.f19055m.next());
    }
}
