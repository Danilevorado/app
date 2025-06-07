package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class hw0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f9428m;

    public /* synthetic */ hw0(AtomicReference atomicReference) {
        this.f9428m = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jw0.o(this.f9428m);
    }
}
