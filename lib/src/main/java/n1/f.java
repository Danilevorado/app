package n1;

import android.os.Handler;
import android.os.Looper;
import com.blikoon.qrcodescanner.QrCodeActivity;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
final class f extends Thread {

    /* renamed from: m, reason: collision with root package name */
    private final QrCodeActivity f25473m;

    /* renamed from: n, reason: collision with root package name */
    private Handler f25474n;

    /* renamed from: o, reason: collision with root package name */
    private final CountDownLatch f25475o = new CountDownLatch(1);

    f(QrCodeActivity qrCodeActivity) {
        this.f25473m = qrCodeActivity;
    }

    Handler a() throws InterruptedException {
        try {
            this.f25475o.await();
        } catch (InterruptedException unused) {
        }
        return this.f25474n;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f25474n = new b(this.f25473m);
        this.f25475o.countDown();
        Looper.loop();
    }
}
