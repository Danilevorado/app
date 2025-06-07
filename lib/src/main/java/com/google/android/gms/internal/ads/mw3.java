package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class mw3 extends ow3 {

    /* renamed from: m, reason: collision with root package name */
    private int f12272m = 0;

    /* renamed from: n, reason: collision with root package name */
    private final int f12273n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ ww3 f12274o;

    mw3(ww3 ww3Var) {
        this.f12274o = ww3Var;
        this.f12273n = ww3Var.n();
    }

    @Override // com.google.android.gms.internal.ads.qw3
    public final byte a() {
        int i10 = this.f12272m;
        if (i10 >= this.f12273n) {
            throw new NoSuchElementException();
        }
        this.f12272m = i10 + 1;
        return this.f12274o.k(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12272m < this.f12273n;
    }
}
