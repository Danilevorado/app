package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class u82 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f16227a = new AtomicBoolean(false);

    public final void a(boolean z10) {
        this.f16227a.set(true);
    }

    public final boolean b() {
        return this.f16227a.get();
    }
}
