package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f351a;

    /* renamed from: c, reason: collision with root package name */
    private androidx.core.util.a f353c;

    /* renamed from: d, reason: collision with root package name */
    private OnBackInvokedCallback f354d;

    /* renamed from: e, reason: collision with root package name */
    private OnBackInvokedDispatcher f355e;

    /* renamed from: b, reason: collision with root package name */
    final ArrayDeque f352b = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    private boolean f356f = false;

    private class LifecycleOnBackPressedCancellable implements androidx.lifecycle.l, androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.lifecycle.j f357a;

        /* renamed from: b, reason: collision with root package name */
        private final g f358b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.activity.a f359c;

        LifecycleOnBackPressedCancellable(androidx.lifecycle.j jVar, g gVar) {
            this.f357a = jVar;
            this.f358b = gVar;
            jVar.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f357a.c(this);
            this.f358b.e(this);
            androidx.activity.a aVar = this.f359c;
            if (aVar != null) {
                aVar.cancel();
                this.f359c = null;
            }
        }

        @Override // androidx.lifecycle.l
        public void d(n nVar, j.b bVar) {
            if (bVar == j.b.ON_START) {
                this.f359c = OnBackPressedDispatcher.this.c(this.f358b);
                return;
            }
            if (bVar != j.b.ON_STOP) {
                if (bVar == j.b.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar = this.f359c;
                if (aVar != null) {
                    aVar.cancel();
                }
            }
        }
    }

    static class a {
        static OnBackInvokedCallback a(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new j(runnable);
        }

        static void b(Object obj, int i10, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class b implements androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final g f361a;

        b(g gVar) {
            this.f361a = gVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f352b.remove(this.f361a);
            this.f361a.e(this);
            if (androidx.core.os.a.c()) {
                this.f361a.g(null);
                OnBackPressedDispatcher.this.h();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f351a = runnable;
        if (androidx.core.os.a.c()) {
            this.f353c = new androidx.core.util.a() { // from class: androidx.activity.h
                @Override // androidx.core.util.a
                public final void a(Object obj) {
                    this.f372a.e((Boolean) obj);
                }
            };
            this.f354d = a.a(new Runnable() { // from class: androidx.activity.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f373m.f();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Boolean bool) {
        if (androidx.core.os.a.c()) {
            h();
        }
    }

    public void b(n nVar, g gVar) {
        androidx.lifecycle.j jVarS = nVar.s();
        if (jVarS.b() == j.c.DESTROYED) {
            return;
        }
        gVar.a(new LifecycleOnBackPressedCancellable(jVarS, gVar));
        if (androidx.core.os.a.c()) {
            h();
            gVar.g(this.f353c);
        }
    }

    androidx.activity.a c(g gVar) {
        this.f352b.add(gVar);
        b bVar = new b(gVar);
        gVar.a(bVar);
        if (androidx.core.os.a.c()) {
            h();
            gVar.g(this.f353c);
        }
        return bVar;
    }

    public boolean d() {
        Iterator itDescendingIterator = this.f352b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            if (((g) itDescendingIterator.next()).c()) {
                return true;
            }
        }
        return false;
    }

    public void f() {
        Iterator itDescendingIterator = this.f352b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            g gVar = (g) itDescendingIterator.next();
            if (gVar.c()) {
                gVar.b();
                return;
            }
        }
        Runnable runnable = this.f351a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void g(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.f355e = onBackInvokedDispatcher;
        h();
    }

    void h() {
        boolean zD = d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f355e;
        if (onBackInvokedDispatcher != null) {
            if (zD && !this.f356f) {
                a.b(onBackInvokedDispatcher, 0, this.f354d);
                this.f356f = true;
            } else {
                if (zD || !this.f356f) {
                    return;
                }
                a.c(onBackInvokedDispatcher, this.f354d);
                this.f356f = false;
            }
        }
    }
}
