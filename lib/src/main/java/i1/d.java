package i1;

import android.os.Handler;
import android.os.Looper;
import h1.o;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final o f24264a;

    /* renamed from: b, reason: collision with root package name */
    final Handler f24265b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final Executor f24266c = new a();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            d.this.f24265b.post(runnable);
        }
    }

    public d(Executor executor) {
        this.f24264a = new o(executor);
    }

    @Override // i1.c
    public Executor a() {
        return this.f24266c;
    }

    @Override // i1.c
    public /* synthetic */ void c(Runnable runnable) {
        b.a(this, runnable);
    }

    @Override // i1.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public o b() {
        return this.f24264a;
    }
}
