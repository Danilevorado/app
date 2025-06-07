package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
abstract class i0 implements k0 {
    i0() {
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
