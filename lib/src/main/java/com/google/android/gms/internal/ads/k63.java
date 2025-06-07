package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class k63 extends c83 {

    /* renamed from: m, reason: collision with root package name */
    boolean f10856m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ Object f10857n;

    k63(Object obj) {
        this.f10857n = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f10856m;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f10856m) {
            throw new NoSuchElementException();
        }
        this.f10856m = true;
        return this.f10857n;
    }
}
