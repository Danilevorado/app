package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class t implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    private int f19312m = 0;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ u f19313n;

    t(u uVar) {
        this.f19313n = uVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19312m < this.f19313n.f19324m.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i10 = this.f19312m;
        u uVar = this.f19313n;
        if (i10 >= uVar.f19324m.length()) {
            throw new NoSuchElementException();
        }
        String str = uVar.f19324m;
        this.f19312m = i10 + 1;
        return new u(String.valueOf(str.charAt(i10)));
    }
}
