package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class iy {

    /* renamed from: a, reason: collision with root package name */
    private boolean f10211a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f10212b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f10213c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f10214d = new AtomicBoolean(false);

    public final synchronized float a() {
        return this.f10213c;
    }

    public final synchronized void b(boolean z10, float f5) {
        this.f10212b = z10;
        this.f10213c = f5;
    }

    public final synchronized void c(boolean z10) {
        this.f10211a = z10;
        this.f10214d.set(true);
    }

    public final synchronized boolean d() {
        return this.f10212b;
    }

    public final synchronized boolean e(boolean z10) {
        if (!this.f10214d.get()) {
            return z10;
        }
        return this.f10211a;
    }
}
