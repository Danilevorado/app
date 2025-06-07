package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class j53 extends AbstractCollection {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ k53 f10302m;

    j53(k53 k53Var) {
        this.f10302m = k53Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f10302m.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        k53 k53Var = this.f10302m;
        Map mapK = k53Var.k();
        return mapK != null ? mapK.values().iterator() : new d53(k53Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f10302m.size();
    }
}
