package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
abstract class p7 implements r7 {
    p7() {
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
