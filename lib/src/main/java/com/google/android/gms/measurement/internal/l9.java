package com.google.android.gms.measurement.internal;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class l9 {

    /* renamed from: a, reason: collision with root package name */
    com.google.android.gms.internal.measurement.u4 f20164a;

    /* renamed from: b, reason: collision with root package name */
    List f20165b;

    /* renamed from: c, reason: collision with root package name */
    List f20166c;

    /* renamed from: d, reason: collision with root package name */
    long f20167d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ n9 f20168e;

    /* synthetic */ l9(n9 n9Var, x4.a0 a0Var) {
        this.f20168e = n9Var;
    }

    private static final long b(com.google.android.gms.internal.measurement.j4 j4Var) {
        return ((j4Var.y() / 1000) / 60) / 60;
    }

    public final boolean a(long j10, com.google.android.gms.internal.measurement.j4 j4Var) {
        e4.p.l(j4Var);
        if (this.f20166c == null) {
            this.f20166c = new ArrayList();
        }
        if (this.f20165b == null) {
            this.f20165b = new ArrayList();
        }
        if (!this.f20166c.isEmpty() && b((com.google.android.gms.internal.measurement.j4) this.f20166c.get(0)) != b(j4Var)) {
            return false;
        }
        long jX0 = this.f20167d + j4Var.x0();
        this.f20168e.U();
        if (jX0 >= Math.max(0, ((Integer) i3.f20021j.a(null)).intValue())) {
            return false;
        }
        this.f20167d = jX0;
        this.f20166c.add(j4Var);
        this.f20165b.add(Long.valueOf(j10));
        int size = this.f20166c.size();
        this.f20168e.U();
        return size < Math.max(1, ((Integer) i3.f20023k.a(null)).intValue());
    }
}
