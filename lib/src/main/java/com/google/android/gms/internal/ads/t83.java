package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class t83 {

    /* renamed from: d, reason: collision with root package name */
    static final t83 f15741d = new t83();

    /* renamed from: a, reason: collision with root package name */
    final Runnable f15742a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f15743b;

    /* renamed from: c, reason: collision with root package name */
    t83 f15744c;

    t83() {
        this.f15742a = null;
        this.f15743b = null;
    }

    t83(Runnable runnable, Executor executor) {
        this.f15742a = runnable;
        this.f15743b = executor;
    }
}
