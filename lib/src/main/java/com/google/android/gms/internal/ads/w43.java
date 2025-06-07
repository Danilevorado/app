package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
final class w43 extends AbstractCollection {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ x43 f16973m;

    w43(x43 x43Var) {
        this.f16973m = x43Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f16973m.o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = this.f16973m.t().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f16973m.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f16973m.c();
    }
}
