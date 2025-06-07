package h1;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class y {

    /* renamed from: e, reason: collision with root package name */
    private static final String f24054e = b1.j.i("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    final b1.q f24055a;

    /* renamed from: b, reason: collision with root package name */
    final Map f24056b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map f24057c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    final Object f24058d = new Object();

    public interface a {
        void a(g1.m mVar);
    }

    public static class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private final y f24059m;

        /* renamed from: n, reason: collision with root package name */
        private final g1.m f24060n;

        b(y yVar, g1.m mVar) {
            this.f24059m = yVar;
            this.f24060n = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f24059m.f24058d) {
                if (((b) this.f24059m.f24056b.remove(this.f24060n)) != null) {
                    a aVar = (a) this.f24059m.f24057c.remove(this.f24060n);
                    if (aVar != null) {
                        aVar.a(this.f24060n);
                    }
                } else {
                    b1.j.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f24060n));
                }
            }
        }
    }

    public y(b1.q qVar) {
        this.f24055a = qVar;
    }

    public void a(g1.m mVar, long j10, a aVar) {
        synchronized (this.f24058d) {
            b1.j.e().a(f24054e, "Starting timer for " + mVar);
            b(mVar);
            b bVar = new b(this, mVar);
            this.f24056b.put(mVar, bVar);
            this.f24057c.put(mVar, aVar);
            this.f24055a.a(j10, bVar);
        }
    }

    public void b(g1.m mVar) {
        synchronized (this.f24058d) {
            if (((b) this.f24056b.remove(mVar)) != null) {
                b1.j.e().a(f24054e, "Stopping timer for " + mVar);
                this.f24057c.remove(mVar);
            }
        }
    }
}
