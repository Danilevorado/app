package q0;

import androidx.room.i0;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f26091a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final i0 f26092b;

    /* renamed from: c, reason: collision with root package name */
    private volatile u0.k f26093c;

    public m(i0 i0Var) {
        this.f26092b = i0Var;
    }

    private u0.k c() {
        return this.f26092b.f(d());
    }

    private u0.k e(boolean z10) {
        if (!z10) {
            return c();
        }
        if (this.f26093c == null) {
            this.f26093c = c();
        }
        return this.f26093c;
    }

    public u0.k a() {
        b();
        return e(this.f26091a.compareAndSet(false, true));
    }

    protected void b() {
        this.f26092b.c();
    }

    protected abstract String d();

    public void f(u0.k kVar) {
        if (kVar == this.f26093c) {
            this.f26091a.set(false);
        }
    }
}
