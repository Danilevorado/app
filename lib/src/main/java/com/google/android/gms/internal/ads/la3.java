package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class la3 extends ja3 implements ab3 {
    protected la3() {
    }

    @Override // com.google.android.gms.internal.ads.ab3
    public final void b(Runnable runnable, Executor executor) {
        k().b(runnable, executor);
    }

    protected abstract ab3 k();
}
