package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class a {

    /* renamed from: e, reason: collision with root package name */
    final long f3608e;

    /* renamed from: f, reason: collision with root package name */
    final Executor f3609f;

    /* renamed from: i, reason: collision with root package name */
    u0.g f3612i;

    /* renamed from: a, reason: collision with root package name */
    private u0.h f3604a = null;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f3605b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    Runnable f3606c = null;

    /* renamed from: d, reason: collision with root package name */
    final Object f3607d = new Object();

    /* renamed from: g, reason: collision with root package name */
    int f3610g = 0;

    /* renamed from: h, reason: collision with root package name */
    long f3611h = SystemClock.uptimeMillis();

    /* renamed from: j, reason: collision with root package name */
    private boolean f3613j = false;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f3614k = new RunnableC0056a();

    /* renamed from: l, reason: collision with root package name */
    final Runnable f3615l = new b();

    /* renamed from: androidx.room.a$a, reason: collision with other inner class name */
    class RunnableC0056a implements Runnable {
        RunnableC0056a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.f3609f.execute(aVar.f3615l);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (a.this.f3607d) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                a aVar = a.this;
                if (jUptimeMillis - aVar.f3611h < aVar.f3608e) {
                    return;
                }
                if (aVar.f3610g != 0) {
                    return;
                }
                Runnable runnable = aVar.f3606c;
                if (runnable == null) {
                    throw new IllegalStateException("mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                runnable.run();
                u0.g gVar = a.this.f3612i;
                if (gVar != null && gVar.m()) {
                    try {
                        a.this.f3612i.close();
                    } catch (IOException e5) {
                        s0.e.a(e5);
                    }
                    a.this.f3612i = null;
                }
            }
        }
    }

    a(long j10, TimeUnit timeUnit, Executor executor) {
        this.f3608e = timeUnit.toMillis(j10);
        this.f3609f = executor;
    }

    public void a() {
        synchronized (this.f3607d) {
            this.f3613j = true;
            u0.g gVar = this.f3612i;
            if (gVar != null) {
                gVar.close();
            }
            this.f3612i = null;
        }
    }

    public void b() {
        synchronized (this.f3607d) {
            int i10 = this.f3610g;
            if (i10 <= 0) {
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
            }
            int i11 = i10 - 1;
            this.f3610g = i11;
            if (i11 == 0) {
                if (this.f3612i == null) {
                } else {
                    this.f3605b.postDelayed(this.f3614k, this.f3608e);
                }
            }
        }
    }

    public Object c(l.a aVar) {
        try {
            return aVar.a(e());
        } finally {
            b();
        }
    }

    public u0.g d() {
        u0.g gVar;
        synchronized (this.f3607d) {
            gVar = this.f3612i;
        }
        return gVar;
    }

    public u0.g e() {
        synchronized (this.f3607d) {
            this.f3605b.removeCallbacks(this.f3614k);
            this.f3610g++;
            if (this.f3613j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            u0.g gVar = this.f3612i;
            if (gVar != null && gVar.m()) {
                return this.f3612i;
            }
            u0.h hVar = this.f3604a;
            if (hVar == null) {
                throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
            }
            u0.g gVarP = hVar.P();
            this.f3612i = gVarP;
            return gVarP;
        }
    }

    public void f(u0.h hVar) {
        if (this.f3604a != null) {
            Log.e("ROOM", "AutoCloser initialized multiple times. Please file a bug against room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        } else {
            this.f3604a = hVar;
        }
    }

    public boolean g() {
        return !this.f3613j;
    }

    public void h(Runnable runnable) {
        this.f3606c = runnable;
    }
}
