package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes.dex */
final class z3 implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    final Iterator f19714m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ a4 f19715n;

    z3(a4 a4Var) {
        this.f19715n = a4Var;
        this.f19714m = a4Var.f19458m.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19714m.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f19714m.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
