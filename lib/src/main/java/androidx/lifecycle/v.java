package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.j;
import androidx.lifecycle.w;

/* loaded from: classes.dex */
public class v implements n {

    /* renamed from: u, reason: collision with root package name */
    private static final v f3160u = new v();

    /* renamed from: q, reason: collision with root package name */
    private Handler f3165q;

    /* renamed from: m, reason: collision with root package name */
    private int f3161m = 0;

    /* renamed from: n, reason: collision with root package name */
    private int f3162n = 0;

    /* renamed from: o, reason: collision with root package name */
    private boolean f3163o = true;

    /* renamed from: p, reason: collision with root package name */
    private boolean f3164p = true;

    /* renamed from: r, reason: collision with root package name */
    private final o f3166r = new o(this);

    /* renamed from: s, reason: collision with root package name */
    private Runnable f3167s = new a();

    /* renamed from: t, reason: collision with root package name */
    w.a f3168t = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v.this.h();
            v.this.i();
        }
    }

    class b implements w.a {
        b() {
        }

        @Override // androidx.lifecycle.w.a
        public void onCreate() {
        }

        @Override // androidx.lifecycle.w.a
        public void onResume() {
            v.this.d();
        }

        @Override // androidx.lifecycle.w.a
        public void onStart() {
            v.this.e();
        }
    }

    class c extends e {

        class a extends e {
            a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                v.this.d();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                v.this.e();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                w.f(activity).h(v.this.f3168t);
            }
        }

        @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            v.this.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            v.this.f();
        }
    }

    private v() {
    }

    public static n j() {
        return f3160u;
    }

    static void k(Context context) {
        f3160u.g(context);
    }

    void a() {
        int i10 = this.f3162n - 1;
        this.f3162n = i10;
        if (i10 == 0) {
            this.f3165q.postDelayed(this.f3167s, 700L);
        }
    }

    void d() {
        int i10 = this.f3162n + 1;
        this.f3162n = i10;
        if (i10 == 1) {
            if (!this.f3163o) {
                this.f3165q.removeCallbacks(this.f3167s);
            } else {
                this.f3166r.h(j.b.ON_RESUME);
                this.f3163o = false;
            }
        }
    }

    void e() {
        int i10 = this.f3161m + 1;
        this.f3161m = i10;
        if (i10 == 1 && this.f3164p) {
            this.f3166r.h(j.b.ON_START);
            this.f3164p = false;
        }
    }

    void f() {
        this.f3161m--;
        i();
    }

    void g(Context context) {
        this.f3165q = new Handler();
        this.f3166r.h(j.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    void h() {
        if (this.f3162n == 0) {
            this.f3163o = true;
            this.f3166r.h(j.b.ON_PAUSE);
        }
    }

    void i() {
        if (this.f3161m == 0 && this.f3163o) {
            this.f3166r.h(j.b.ON_STOP);
            this.f3164p = true;
        }
    }

    @Override // androidx.lifecycle.n
    public j s() {
        return this.f3166r;
    }
}
