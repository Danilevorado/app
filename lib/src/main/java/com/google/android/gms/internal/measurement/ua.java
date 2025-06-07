package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class ua extends AbstractList implements RandomAccess, g9 {

    /* renamed from: m, reason: collision with root package name */
    private final g9 f19358m;

    public ua(g9 g9Var) {
        this.f19358m = g9Var;
    }

    @Override // com.google.android.gms.internal.measurement.g9
    public final Object C(int i10) {
        return this.f19358m.C(i10);
    }

    @Override // com.google.android.gms.internal.measurement.g9
    public final g9 c() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.g9
    public final List g() {
        return this.f19358m.g();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((f9) this.f19358m).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ta(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new sa(this, i10);
    }

    @Override // com.google.android.gms.internal.measurement.g9
    public final void r(x7 x7Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19358m.size();
    }
}
