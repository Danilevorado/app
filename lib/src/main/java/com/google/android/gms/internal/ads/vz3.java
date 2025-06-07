package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class vz3 extends ow3 {

    /* renamed from: m, reason: collision with root package name */
    final a04 f16917m;

    /* renamed from: n, reason: collision with root package name */
    qw3 f16918n = b();

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ c04 f16919o;

    vz3(c04 c04Var) {
        this.f16919o = c04Var;
        this.f16917m = new a04(c04Var, null);
    }

    private final qw3 b() {
        a04 a04Var = this.f16917m;
        if (a04Var.hasNext()) {
            return a04Var.next().iterator();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.qw3
    public final byte a() {
        qw3 qw3Var = this.f16918n;
        if (qw3Var == null) {
            throw new NoSuchElementException();
        }
        byte bA = qw3Var.a();
        if (!this.f16918n.hasNext()) {
            this.f16918n = b();
        }
        return bA;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16918n != null;
    }
}
