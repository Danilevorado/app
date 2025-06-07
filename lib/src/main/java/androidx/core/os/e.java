package androidx.core.os;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2255a;

    /* renamed from: b, reason: collision with root package name */
    private b f2256b;

    /* renamed from: c, reason: collision with root package name */
    private Object f2257c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2258d;

    static class a {
        static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    public interface b {
        void a();
    }

    private void e() throws InterruptedException {
        while (this.f2258d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.f2255a) {
                return;
            }
            this.f2255a = true;
            this.f2258d = true;
            b bVar = this.f2256b;
            Object obj = this.f2257c;
            if (bVar != null) {
                try {
                    bVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f2258d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                a.a(obj);
            }
            synchronized (this) {
                this.f2258d = false;
                notifyAll();
            }
        }
    }

    public Object b() {
        Object obj;
        synchronized (this) {
            if (this.f2257c == null) {
                CancellationSignal cancellationSignalB = a.b();
                this.f2257c = cancellationSignalB;
                if (this.f2255a) {
                    a.a(cancellationSignalB);
                }
            }
            obj = this.f2257c;
        }
        return obj;
    }

    public boolean c() {
        boolean z10;
        synchronized (this) {
            z10 = this.f2255a;
        }
        return z10;
    }

    public void d(b bVar) {
        synchronized (this) {
            e();
            if (this.f2256b == bVar) {
                return;
            }
            this.f2256b = bVar;
            if (this.f2255a && bVar != null) {
                bVar.a();
            }
        }
    }
}
