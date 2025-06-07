package b5;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f4481a = new CountDownLatch(1);

    /* synthetic */ n(m mVar) {
    }

    @Override // b5.c
    public final void a() {
        this.f4481a.countDown();
    }

    @Override // b5.f
    public final void b(Object obj) {
        this.f4481a.countDown();
    }

    public final void c() throws InterruptedException {
        this.f4481a.await();
    }

    @Override // b5.e
    public final void d(Exception exc) {
        this.f4481a.countDown();
    }

    public final boolean e(long j10, TimeUnit timeUnit) {
        return this.f4481a.await(j10, timeUnit);
    }
}
