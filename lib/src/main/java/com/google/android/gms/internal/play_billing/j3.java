package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class j3 implements Iterator {
    j3() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
