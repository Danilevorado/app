package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class s implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    private int f19268m = 0;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ u f19269n;

    s(u uVar) {
        this.f19269n = uVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19268m < this.f19269n.f19324m.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i10 = this.f19268m;
        if (i10 >= this.f19269n.f19324m.length()) {
            throw new NoSuchElementException();
        }
        this.f19268m = i10 + 1;
        return new u(String.valueOf(i10));
    }
}
