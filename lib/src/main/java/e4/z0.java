package e4;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    private Object f23236a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23237b = false;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f23238c;

    public z0(c cVar, Object obj) {
        this.f23238c = cVar;
        this.f23236a = obj;
    }

    protected abstract void a(Object obj);

    protected abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            obj = this.f23236a;
            if (this.f23237b) {
                Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                a(obj);
            } catch (RuntimeException e5) {
                throw e5;
            }
        }
        synchronized (this) {
            this.f23237b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f23236a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f23238c.f23095r) {
            this.f23238c.f23095r.remove(this);
        }
    }
}
