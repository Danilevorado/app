package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private final g.c f2275a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f2276b;

    /* renamed from: androidx.core.provider.a$a, reason: collision with other inner class name */
    class RunnableC0027a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ g.c f2277m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Typeface f2278n;

        RunnableC0027a(g.c cVar, Typeface typeface) {
            this.f2277m = cVar;
            this.f2278n = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2277m.b(this.f2278n);
        }
    }

    class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ g.c f2280m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f2281n;

        b(g.c cVar, int i10) {
            this.f2280m = cVar;
            this.f2281n = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2280m.a(this.f2281n);
        }
    }

    a(g.c cVar, Handler handler) {
        this.f2275a = cVar;
        this.f2276b = handler;
    }

    private void a(int i10) {
        this.f2276b.post(new b(this.f2275a, i10));
    }

    private void c(Typeface typeface) {
        this.f2276b.post(new RunnableC0027a(this.f2275a, typeface));
    }

    void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f2305a);
        } else {
            a(eVar.f2306b);
        }
    }
}
