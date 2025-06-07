package l6;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class e {

    /* renamed from: d, reason: collision with root package name */
    private static final long f25139d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    private static final long f25140e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final i f25141a = i.c();

    /* renamed from: b, reason: collision with root package name */
    private long f25142b;

    /* renamed from: c, reason: collision with root package name */
    private int f25143c;

    e() {
    }

    private synchronized long a(int i10) {
        if (c(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f25143c) + this.f25141a.e(), f25140e);
        }
        return f25139d;
    }

    private static boolean c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void e() {
        this.f25143c = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f25143c     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L14
            com.google.firebase.installations.i r0 = r4.f25141a     // Catch: java.lang.Throwable -> L17
            long r0 = r0.a()     // Catch: java.lang.Throwable -> L17
            long r2 = r4.f25142b     // Catch: java.lang.Throwable -> L17
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            monitor-exit(r4)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.e.b():boolean");
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f25143c++;
        this.f25142b = this.f25141a.a() + a(i10);
    }
}
