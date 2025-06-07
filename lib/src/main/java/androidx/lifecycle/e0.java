package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.j;

/* loaded from: classes.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final o f3112a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f3113b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    private a f3114c;

    static class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private final o f3115m;

        /* renamed from: n, reason: collision with root package name */
        final j.b f3116n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f3117o = false;

        a(o oVar, j.b bVar) {
            this.f3115m = oVar;
            this.f3116n = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3117o) {
                return;
            }
            this.f3115m.h(this.f3116n);
            this.f3117o = true;
        }
    }

    public e0(n nVar) {
        this.f3112a = new o(nVar);
    }

    private void f(j.b bVar) {
        a aVar = this.f3114c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f3112a, bVar);
        this.f3114c = aVar2;
        this.f3113b.postAtFrontOfQueue(aVar2);
    }

    public j a() {
        return this.f3112a;
    }

    public void b() {
        f(j.b.ON_START);
    }

    public void c() {
        f(j.b.ON_CREATE);
    }

    public void d() {
        f(j.b.ON_STOP);
        f(j.b.ON_DESTROY);
    }

    public void e() {
        f(j.b.ON_START);
    }
}
