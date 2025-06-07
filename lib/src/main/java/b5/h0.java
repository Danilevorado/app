package b5;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class h0 extends i {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4470a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final e0 f4471b = new e0();

    /* renamed from: c, reason: collision with root package name */
    private boolean f4472c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f4473d;

    /* renamed from: e, reason: collision with root package name */
    private Object f4474e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f4475f;

    h0() {
    }

    private final void u() {
        e4.p.p(this.f4472c, "Task is not yet complete");
    }

    private final void v() {
        if (this.f4473d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void w() {
        if (this.f4472c) {
            throw b.a(this);
        }
    }

    private final void x() {
        synchronized (this.f4470a) {
            if (this.f4472c) {
                this.f4471b.b(this);
            }
        }
    }

    @Override // b5.i
    public final i a(Executor executor, c cVar) {
        this.f4471b.a(new u(executor, cVar));
        x();
        return this;
    }

    @Override // b5.i
    public final i b(d dVar) {
        this.f4471b.a(new w(k.f4479a, dVar));
        x();
        return this;
    }

    @Override // b5.i
    public final i c(Executor executor, d dVar) {
        this.f4471b.a(new w(executor, dVar));
        x();
        return this;
    }

    @Override // b5.i
    public final i d(Executor executor, e eVar) {
        this.f4471b.a(new y(executor, eVar));
        x();
        return this;
    }

    @Override // b5.i
    public final i e(Executor executor, f fVar) {
        this.f4471b.a(new a0(executor, fVar));
        x();
        return this;
    }

    @Override // b5.i
    public final i f(Executor executor, a aVar) {
        h0 h0Var = new h0();
        this.f4471b.a(new q(executor, aVar, h0Var));
        x();
        return h0Var;
    }

    @Override // b5.i
    public final i g(a aVar) {
        return h(k.f4479a, aVar);
    }

    @Override // b5.i
    public final i h(Executor executor, a aVar) {
        h0 h0Var = new h0();
        this.f4471b.a(new s(executor, aVar, h0Var));
        x();
        return h0Var;
    }

    @Override // b5.i
    public final Exception i() {
        Exception exc;
        synchronized (this.f4470a) {
            exc = this.f4475f;
        }
        return exc;
    }

    @Override // b5.i
    public final Object j() {
        Object obj;
        synchronized (this.f4470a) {
            u();
            v();
            Exception exc = this.f4475f;
            if (exc != null) {
                throw new g(exc);
            }
            obj = this.f4474e;
        }
        return obj;
    }

    @Override // b5.i
    public final Object k(Class cls) {
        Object obj;
        synchronized (this.f4470a) {
            u();
            v();
            if (cls.isInstance(this.f4475f)) {
                throw ((Throwable) cls.cast(this.f4475f));
            }
            Exception exc = this.f4475f;
            if (exc != null) {
                throw new g(exc);
            }
            obj = this.f4474e;
        }
        return obj;
    }

    @Override // b5.i
    public final boolean l() {
        return this.f4473d;
    }

    @Override // b5.i
    public final boolean m() {
        boolean z10;
        synchronized (this.f4470a) {
            z10 = this.f4472c;
        }
        return z10;
    }

    @Override // b5.i
    public final boolean n() {
        boolean z10;
        synchronized (this.f4470a) {
            z10 = false;
            if (this.f4472c && !this.f4473d && this.f4475f == null) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // b5.i
    public final i o(Executor executor, h hVar) {
        h0 h0Var = new h0();
        this.f4471b.a(new c0(executor, hVar, h0Var));
        x();
        return h0Var;
    }

    public final void p(Exception exc) {
        e4.p.m(exc, "Exception must not be null");
        synchronized (this.f4470a) {
            w();
            this.f4472c = true;
            this.f4475f = exc;
        }
        this.f4471b.b(this);
    }

    public final void q(Object obj) {
        synchronized (this.f4470a) {
            w();
            this.f4472c = true;
            this.f4474e = obj;
        }
        this.f4471b.b(this);
    }

    public final boolean r() {
        synchronized (this.f4470a) {
            if (this.f4472c) {
                return false;
            }
            this.f4472c = true;
            this.f4473d = true;
            this.f4471b.b(this);
            return true;
        }
    }

    public final boolean s(Exception exc) {
        e4.p.m(exc, "Exception must not be null");
        synchronized (this.f4470a) {
            if (this.f4472c) {
                return false;
            }
            this.f4472c = true;
            this.f4475f = exc;
            this.f4471b.b(this);
            return true;
        }
    }

    public final boolean t(Object obj) {
        synchronized (this.f4470a) {
            if (this.f4472c) {
                return false;
            }
            this.f4472c = true;
            this.f4474e = obj;
            this.f4471b.b(this);
            return true;
        }
    }
}
