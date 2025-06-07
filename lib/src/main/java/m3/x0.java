package m3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.b03;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    private HandlerThread f25346a = null;

    /* renamed from: b, reason: collision with root package name */
    private Handler f25347b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f25348c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final Object f25349d = new Object();

    public final Handler a() {
        return this.f25347b;
    }

    public final Looper b() {
        Looper looper;
        synchronized (this.f25349d) {
            if (this.f25348c != 0) {
                e4.p.m(this.f25346a, "Invalid state: handlerThread should already been initialized.");
            } else if (this.f25346a == null) {
                n1.k("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f25346a = handlerThread;
                handlerThread.start();
                this.f25347b = new b03(this.f25346a.getLooper());
                n1.k("Looper thread started.");
            } else {
                n1.k("Resuming the looper thread");
                this.f25349d.notifyAll();
            }
            this.f25348c++;
            looper = this.f25346a.getLooper();
        }
        return looper;
    }
}
