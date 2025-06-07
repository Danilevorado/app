package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class hf0 extends ScheduledThreadPoolExecutor {
    hf0(int i10, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
