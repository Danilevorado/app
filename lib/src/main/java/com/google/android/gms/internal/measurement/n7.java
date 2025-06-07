package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class n7 extends p7 {

    /* renamed from: m, reason: collision with root package name */
    private int f19131m = 0;

    /* renamed from: n, reason: collision with root package name */
    private final int f19132n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ x7 f19133o;

    n7(x7 x7Var) {
        this.f19133o = x7Var;
        this.f19132n = x7Var.h();
    }

    @Override // com.google.android.gms.internal.measurement.r7
    public final byte a() {
        int i10 = this.f19131m;
        if (i10 >= this.f19132n) {
            throw new NoSuchElementException();
        }
        this.f19131m = i10 + 1;
        return this.f19133o.f(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19131m < this.f19132n;
    }
}
