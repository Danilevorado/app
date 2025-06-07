package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public final class bp2 {

    /* renamed from: a, reason: collision with root package name */
    private final Deque f6628a = new LinkedBlockingDeque();

    /* renamed from: b, reason: collision with root package name */
    private final Callable f6629b;

    /* renamed from: c, reason: collision with root package name */
    private final bb3 f6630c;

    public bp2(Callable callable, bb3 bb3Var) {
        this.f6629b = callable;
        this.f6630c = bb3Var;
    }

    public final synchronized ab3 a() {
        c(1);
        return (ab3) this.f6628a.poll();
    }

    public final synchronized void b(ab3 ab3Var) {
        this.f6628a.addFirst(ab3Var);
    }

    public final synchronized void c(int i10) {
        int size = i10 - this.f6628a.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f6628a.add(this.f6630c.g(this.f6629b));
        }
    }
}
