package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class g0 extends i0 {

    /* renamed from: m, reason: collision with root package name */
    private int f19506m = 0;

    /* renamed from: n, reason: collision with root package name */
    private final int f19507n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ q0 f19508o;

    g0(q0 q0Var) {
        this.f19508o = q0Var;
        this.f19507n = q0Var.h();
    }

    @Override // com.google.android.gms.internal.play_billing.k0
    public final byte a() {
        int i10 = this.f19506m;
        if (i10 >= this.f19507n) {
            throw new NoSuchElementException();
        }
        this.f19506m = i10 + 1;
        return this.f19508o.f(i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19506m < this.f19507n;
    }
}
