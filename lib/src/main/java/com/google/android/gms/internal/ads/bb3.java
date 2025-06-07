package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public interface bb3 extends ExecutorService {
    ab3 g(Callable callable);

    ab3 s(Runnable runnable);
}
