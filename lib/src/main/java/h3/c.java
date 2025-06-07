package h3;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class c extends Thread {

    /* renamed from: m, reason: collision with root package name */
    private final WeakReference f24072m;

    /* renamed from: n, reason: collision with root package name */
    private final long f24073n;

    /* renamed from: o, reason: collision with root package name */
    final CountDownLatch f24074o = new CountDownLatch(1);

    /* renamed from: p, reason: collision with root package name */
    boolean f24075p = false;

    public c(a aVar, long j10) {
        this.f24072m = new WeakReference(aVar);
        this.f24073n = j10;
        start();
    }

    private final void a() {
        a aVar = (a) this.f24072m.get();
        if (aVar != null) {
            aVar.f();
            this.f24075p = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f24074o.await(this.f24073n, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
