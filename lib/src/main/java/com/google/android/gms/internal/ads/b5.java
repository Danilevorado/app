package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class b5 extends d5 {

    /* renamed from: b, reason: collision with root package name */
    public final long f6338b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6339c;

    /* renamed from: d, reason: collision with root package name */
    public final List f6340d;

    public b5(int i10, long j10) {
        super(i10);
        this.f6338b = j10;
        this.f6339c = new ArrayList();
        this.f6340d = new ArrayList();
    }

    public final b5 c(int i10) {
        int size = this.f6340d.size();
        for (int i11 = 0; i11 < size; i11++) {
            b5 b5Var = (b5) this.f6340d.get(i11);
            if (b5Var.f7184a == i10) {
                return b5Var;
            }
        }
        return null;
    }

    public final c5 d(int i10) {
        int size = this.f6339c.size();
        for (int i11 = 0; i11 < size; i11++) {
            c5 c5Var = (c5) this.f6339c.get(i11);
            if (c5Var.f7184a == i10) {
                return c5Var;
            }
        }
        return null;
    }

    public final void e(b5 b5Var) {
        this.f6340d.add(b5Var);
    }

    public final void f(c5 c5Var) {
        this.f6339c.add(c5Var);
    }

    @Override // com.google.android.gms.internal.ads.d5
    public final String toString() {
        return d5.b(this.f7184a) + " leaves: " + Arrays.toString(this.f6339c.toArray()) + " containers: " + Arrays.toString(this.f6340d.toArray());
    }
}
