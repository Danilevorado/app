package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class oj implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    private static final long B = ((Long) k3.w.c().b(ir.f9958h1)).longValue();
    private final Rect A;

    /* renamed from: m, reason: collision with root package name */
    private final Context f13271m;

    /* renamed from: n, reason: collision with root package name */
    private Application f13272n;

    /* renamed from: o, reason: collision with root package name */
    private final WindowManager f13273o;

    /* renamed from: p, reason: collision with root package name */
    private final PowerManager f13274p;

    /* renamed from: q, reason: collision with root package name */
    private final KeyguardManager f13275q;

    /* renamed from: r, reason: collision with root package name */
    BroadcastReceiver f13276r;

    /* renamed from: s, reason: collision with root package name */
    private WeakReference f13277s;

    /* renamed from: t, reason: collision with root package name */
    final WeakReference f13278t;

    /* renamed from: u, reason: collision with root package name */
    private bk f13279u;

    /* renamed from: v, reason: collision with root package name */
    private final m3.b1 f13280v = new m3.b1(B);

    /* renamed from: w, reason: collision with root package name */
    private boolean f13281w = false;

    /* renamed from: x, reason: collision with root package name */
    private int f13282x = -1;

    /* renamed from: y, reason: collision with root package name */
    private final HashSet f13283y = new HashSet();

    /* renamed from: z, reason: collision with root package name */
    private final DisplayMetrics f13284z;

    public oj(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f13271m = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f13273o = windowManager;
        this.f13274p = (PowerManager) applicationContext.getSystemService("power");
        this.f13275q = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f13272n = application;
            this.f13279u = new bk(application, this);
        }
        this.f13284z = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.A = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f13278t;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m(view2);
        }
        this.f13278t = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final int h(int i10) {
        return (int) (i10 / this.f13284z.density);
    }

    private final void i(Activity activity, int i10) {
        Window window;
        if (this.f13278t == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) this.f13278t.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f13282x = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r33) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oj.j(int):void");
    }

    private final void k() {
        m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.kj
            @Override // java.lang.Runnable
            public final void run() {
                this.f11076m.d();
            }
        });
    }

    private final void l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f13277s = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f13276r == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f13276r = new lj(this);
            j3.t.x().c(this.f13271m, this.f13276r, intentFilter);
        }
        Application application = this.f13272n;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f13279u);
            } catch (Exception e5) {
                ze0.e("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    private final void m(View view) {
        try {
            WeakReference weakReference = this.f13277s;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f13277s = null;
            }
        } catch (Exception e5) {
            ze0.e("Error while unregistering listeners from the last ViewTreeObserver.", e5);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e10) {
            ze0.e("Error while unregistering listeners from the ViewTreeObserver.", e10);
        }
        if (this.f13276r != null) {
            try {
                j3.t.x().d(this.f13271m, this.f13276r);
            } catch (IllegalStateException e11) {
                ze0.e("Failed trying to unregister the receiver", e11);
            } catch (Exception e12) {
                j3.t.q().u(e12, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f13276r = null;
        }
        Application application = this.f13272n;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f13279u);
            } catch (Exception e13) {
                ze0.e("Error registering activity lifecycle callbacks.", e13);
            }
        }
    }

    final Rect a(Rect rect) {
        return new Rect(h(rect.left), h(rect.top), h(rect.right), h(rect.bottom));
    }

    public final void c(nj njVar) {
        this.f13283y.add(njVar);
        j(3);
    }

    final /* synthetic */ void d() {
        j(3);
    }

    public final void e(nj njVar) {
        this.f13283y.remove(njVar);
    }

    public final void f() {
        this.f13280v.a(B);
    }

    public final void g(long j10) {
        this.f13280v.a(j10);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        i(activity, 4);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        j(3);
        k();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        j(2);
        k();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        j(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f13282x = -1;
        l(view);
        j(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f13282x = -1;
        j(3);
        k();
        m(view);
    }
}
