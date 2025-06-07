package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class fb3 extends y83 implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    private final Runnable f8213t;

    public fb3(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.f8213t = runnable;
    }

    @Override // com.google.android.gms.internal.ads.b93
    protected final String f() {
        return "task=[" + this.f8213t.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f8213t.run();
        } catch (Error | RuntimeException e5) {
            i(e5);
            throw e5;
        }
    }
}
