package ib;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class w implements Iterator {
    public abstract int b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
