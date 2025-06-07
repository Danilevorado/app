package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
abstract class d {

    /* renamed from: a, reason: collision with root package name */
    protected static final Class f2029a;

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f2030b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f2031c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f2032d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f2033e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f2034f;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f2035g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ C0019d f2036m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Object f2037n;

        a(C0019d c0019d, Object obj) {
            this.f2036m = c0019d;
            this.f2037n = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2036m.f2042m = this.f2037n;
        }
    }

    class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Application f2038m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ C0019d f2039n;

        b(Application application, C0019d c0019d) {
            this.f2038m = application;
            this.f2039n = c0019d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2038m.unregisterActivityLifecycleCallbacks(this.f2039n);
        }
    }

    class c implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Object f2040m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Object f2041n;

        c(Object obj, Object obj2) {
            this.f2040m = obj;
            this.f2041n = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f2032d;
                if (method != null) {
                    method.invoke(this.f2040m, this.f2041n, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f2033e.invoke(this.f2040m, this.f2041n, Boolean.FALSE);
                }
            } catch (RuntimeException e5) {
                if (e5.getClass() == RuntimeException.class && e5.getMessage() != null && e5.getMessage().startsWith("Unable to stop")) {
                    throw e5;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    private static final class C0019d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: m, reason: collision with root package name */
        Object f2042m;

        /* renamed from: n, reason: collision with root package name */
        private Activity f2043n;

        /* renamed from: o, reason: collision with root package name */
        private final int f2044o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f2045p = false;

        /* renamed from: q, reason: collision with root package name */
        private boolean f2046q = false;

        /* renamed from: r, reason: collision with root package name */
        private boolean f2047r = false;

        C0019d(Activity activity) {
            this.f2043n = activity;
            this.f2044o = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f2043n == activity) {
                this.f2043n = null;
                this.f2046q = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f2046q || this.f2047r || this.f2045p || !d.h(this.f2042m, this.f2044o, activity)) {
                return;
            }
            this.f2047r = true;
            this.f2042m = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f2043n == activity) {
                this.f2045p = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class clsA = a();
        f2029a = clsA;
        f2030b = b();
        f2031c = f();
        f2032d = d(clsA);
        f2033e = c(clsA);
        f2034f = e(clsA);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f2031c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f2035g.postAtFrontOfQueue(new c(f2030b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f2034f == null) {
            return false;
        }
        if (f2033e == null && f2032d == null) {
            return false;
        }
        try {
            Object obj2 = f2031c.get(activity);
            if (obj2 == null || (obj = f2030b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0019d c0019d = new C0019d(activity);
            application.registerActivityLifecycleCallbacks(c0019d);
            Handler handler = f2035g;
            handler.post(new a(c0019d, obj2));
            try {
                if (g()) {
                    Method method = f2034f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0019d));
                return true;
            } catch (Throwable th) {
                f2035g.post(new b(application, c0019d));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
