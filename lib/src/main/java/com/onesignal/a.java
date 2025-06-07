package com.onesignal;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import com.onesignal.e3;
import com.onesignal.s2;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class a implements s2.b {

    /* renamed from: d, reason: collision with root package name */
    private static final Map f21678d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final Map f21679e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final Map f21680f = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final OSFocusHandler f21681a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f21682b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21683c = false;

    /* renamed from: com.onesignal.a$a, reason: collision with other inner class name */
    class C0108a extends Thread {
        C0108a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            e3.f0().c();
            a.this.f21681a.k("FOCUS_LOST_WORKER_TAG", 2000L, e3.f21882e);
        }
    }

    static abstract class b {
        b() {
        }

        abstract void a(Activity activity);

        void b(Activity activity) {
        }
    }

    static class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: m, reason: collision with root package name */
        private final s2.c f21685m;

        /* renamed from: n, reason: collision with root package name */
        private final s2.b f21686n;

        /* renamed from: o, reason: collision with root package name */
        private final String f21687o;

        private c(s2.b bVar, s2.c cVar, String str) {
            this.f21686n = bVar;
            this.f21685m = cVar;
            this.f21687o = str;
        }

        /* synthetic */ c(s2.b bVar, s2.c cVar, String str, C0108a c0108a) {
            this(bVar, cVar, str);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (b3.j(new WeakReference(e3.T()))) {
                return;
            }
            this.f21686n.a(this.f21687o, this);
            this.f21685m.c();
        }
    }

    public a(OSFocusHandler oSFocusHandler) {
        this.f21681a = oSFocusHandler;
    }

    private void f() {
        e3.z zVar = e3.z.DEBUG;
        e3.i1(zVar, "ActivityLifecycleHandler handleFocus, nextResumeIsFirstActivity: " + this.f21683c);
        if (!this.f21681a.f() && !this.f21683c) {
            e3.i1(zVar, "ActivityLifecycleHandler cancel background lost focus worker");
            this.f21681a.e("FOCUS_LOST_WORKER_TAG", e3.f21882e);
        } else {
            e3.i1(zVar, "ActivityLifecycleHandler reset background state, call app focus");
            this.f21683c = false;
            this.f21681a.j();
        }
    }

    private void g() {
        e3.i1(e3.z.DEBUG, "ActivityLifecycleHandler Handling lost focus");
        OSFocusHandler oSFocusHandler = this.f21681a;
        if (oSFocusHandler != null) {
            if (!oSFocusHandler.f() || this.f21681a.g()) {
                new C0108a().start();
            }
        }
    }

    private void h() {
        String str;
        e3.z zVar = e3.z.DEBUG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("curActivity is NOW: ");
        if (this.f21682b != null) {
            str = "" + this.f21682b.getClass().getName() + ":" + this.f21682b;
        } else {
            str = "null";
        }
        sb2.append(str);
        e3.a(zVar, sb2.toString());
    }

    private void i(int i10, Activity activity) {
        e3.z zVar;
        StringBuilder sb2;
        String str;
        if (i10 == 2) {
            zVar = e3.z.DEBUG;
            sb2 = new StringBuilder();
            str = "Configuration Orientation Change: LANDSCAPE (";
        } else {
            if (i10 != 1) {
                return;
            }
            zVar = e3.z.DEBUG;
            sb2 = new StringBuilder();
            str = "Configuration Orientation Change: PORTRAIT (";
        }
        sb2.append(str);
        sb2.append(i10);
        sb2.append(") on activity: ");
        sb2.append(activity);
        e3.i1(zVar, sb2.toString());
    }

    private void q(Activity activity) {
        g();
        Iterator it = f21678d.entrySet().iterator();
        while (it.hasNext()) {
            ((b) ((Map.Entry) it.next()).getValue()).b(activity);
        }
        Iterator it2 = f21678d.entrySet().iterator();
        while (it2.hasNext()) {
            ((b) ((Map.Entry) it2.next()).getValue()).a(this.f21682b);
        }
        ViewTreeObserver viewTreeObserver = this.f21682b.getWindow().getDecorView().getViewTreeObserver();
        for (Map.Entry entry : f21679e.entrySet()) {
            c cVar = new c(this, (s2.c) entry.getValue(), (String) entry.getKey(), null);
            viewTreeObserver.addOnGlobalLayoutListener(cVar);
            f21680f.put((String) entry.getKey(), cVar);
        }
        f();
    }

    @Override // com.onesignal.s2.b
    public void a(String str, c cVar) {
        Activity activity = this.f21682b;
        if (activity != null) {
            activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(cVar);
        }
        f21680f.remove(str);
        f21679e.remove(str);
    }

    void c(String str, b bVar) {
        f21678d.put(str, bVar);
        Activity activity = this.f21682b;
        if (activity != null) {
            bVar.a(activity);
        }
    }

    void d(String str, s2.c cVar) {
        Activity activity = this.f21682b;
        if (activity != null) {
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            c cVar2 = new c(this, cVar, str, null);
            viewTreeObserver.addOnGlobalLayoutListener(cVar2);
            f21680f.put(str, cVar2);
        }
        f21679e.put(str, cVar);
    }

    public Activity e() {
        return this.f21682b;
    }

    void j(Activity activity) {
    }

    void k(Activity activity) {
        e3.a(e3.z.DEBUG, "onActivityDestroyed: " + activity);
        f21680f.clear();
        if (activity == this.f21682b) {
            this.f21682b = null;
            g();
        }
        h();
    }

    void l(Activity activity) {
        e3.a(e3.z.DEBUG, "onActivityPaused: " + activity);
        if (activity == this.f21682b) {
            this.f21682b = null;
            g();
        }
        h();
    }

    void m(Activity activity) {
        e3.a(e3.z.DEBUG, "onActivityResumed: " + activity);
        s(activity);
        h();
        f();
    }

    void n(Activity activity) {
        this.f21681a.l();
    }

    void o(Activity activity) {
        e3.a(e3.z.DEBUG, "onActivityStopped: " + activity);
        if (activity == this.f21682b) {
            this.f21682b = null;
            g();
        }
        Iterator it = f21678d.entrySet().iterator();
        while (it.hasNext()) {
            ((b) ((Map.Entry) it.next()).getValue()).b(activity);
        }
        h();
        if (this.f21682b == null) {
            this.f21681a.m();
        }
    }

    void p(Configuration configuration, Activity activity) {
        Activity activity2 = this.f21682b;
        if (activity2 == null || !OSUtils.q(activity2, 128)) {
            return;
        }
        i(configuration.orientation, activity);
        q(activity);
    }

    void r(String str) {
        f21678d.remove(str);
    }

    public void s(Activity activity) {
        this.f21682b = activity;
        Iterator it = f21678d.entrySet().iterator();
        while (it.hasNext()) {
            ((b) ((Map.Entry) it.next()).getValue()).a(this.f21682b);
        }
        try {
            ViewTreeObserver viewTreeObserver = this.f21682b.getWindow().getDecorView().getViewTreeObserver();
            for (Map.Entry entry : f21679e.entrySet()) {
                c cVar = new c(this, (s2.c) entry.getValue(), (String) entry.getKey(), null);
                viewTreeObserver.addOnGlobalLayoutListener(cVar);
                f21680f.put((String) entry.getKey(), cVar);
            }
        } catch (RuntimeException e5) {
            e5.printStackTrace();
        }
    }

    void t(boolean z10) {
        this.f21683c = z10;
    }
}
