package pl.droidsonroids.gif;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
final class d extends ScheduledThreadPoolExecutor {

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final d f26002a = new d();
    }

    private d() {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }

    static d a() {
        return b.f26002a;
    }
}
