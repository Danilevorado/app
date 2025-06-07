package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class yj4 implements Comparable {

    /* renamed from: m, reason: collision with root package name */
    private final boolean f18078m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f18079n;

    public yj4(k9 k9Var, int i10) {
        this.f18078m = 1 == (k9Var.f10890d & 1);
        this.f18079n = pk4.r(i10, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(yj4 yj4Var) {
        return q53.i().d(this.f18079n, yj4Var.f18079n).d(this.f18078m, yj4Var.f18078m).a();
    }
}
