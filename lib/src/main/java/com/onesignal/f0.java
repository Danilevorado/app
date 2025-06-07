package com.onesignal;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.e3;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
abstract class f0 {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f21977c;

    /* renamed from: e, reason: collision with root package name */
    private static c f21979e;

    /* renamed from: f, reason: collision with root package name */
    static Thread f21980f;

    /* renamed from: g, reason: collision with root package name */
    static Context f21981g;

    /* renamed from: h, reason: collision with root package name */
    static Location f21982h;

    /* renamed from: i, reason: collision with root package name */
    static String f21983i;

    /* renamed from: a, reason: collision with root package name */
    private static final List f21975a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap f21976b = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    static final Object f21978d = new a();

    class a {
        a() {
        }
    }

    interface b {
        f a();

        void b(d dVar);
    }

    protected static class c extends HandlerThread {

        /* renamed from: m, reason: collision with root package name */
        Handler f21984m;

        c() {
            super("OSH_LocationHandlerThread");
            start();
            this.f21984m = new Handler(getLooper());
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        Double f21985a;

        /* renamed from: b, reason: collision with root package name */
        Double f21986b;

        /* renamed from: c, reason: collision with root package name */
        Float f21987c;

        /* renamed from: d, reason: collision with root package name */
        Integer f21988d;

        /* renamed from: e, reason: collision with root package name */
        Boolean f21989e;

        /* renamed from: f, reason: collision with root package name */
        Long f21990f;

        d() {
        }

        public String toString() {
            return "LocationPoint{lat=" + this.f21985a + ", log=" + this.f21986b + ", accuracy=" + this.f21987c + ", type=" + this.f21988d + ", bg=" + this.f21989e + ", timeStamp=" + this.f21990f + '}';
        }
    }

    static abstract class e implements b {
        e() {
        }

        void c(e3.k0 k0Var) {
        }
    }

    enum f {
        STARTUP,
        PROMPT_LOCATION,
        SYNC_SERVICE
    }

    private static void a(b bVar) {
        if (bVar instanceof e) {
            List list = f21975a;
            synchronized (list) {
                list.add((e) bVar);
            }
        }
    }

    private static void b(Context context, boolean z10, boolean z11) {
        x xVarA = t3.f22451a.a(context, context.getPackageName(), 4096);
        if (!xVarA.b() || xVarA.a() == null) {
            n(z10, e3.k0.ERROR);
            return;
        }
        if (Arrays.asList(xVarA.a().requestedPermissions).contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
            f21983i = "android.permission.ACCESS_BACKGROUND_LOCATION";
        }
        if (f21983i != null && z10) {
            g0.f22029a.d(z11, f21983i);
        } else {
            n(z10, e3.k0.PERMISSION_GRANTED);
            p();
        }
    }

    private static void c(d dVar) {
        Thread thread;
        HashMap map = new HashMap();
        synchronized (f0.class) {
            map.putAll(f21976b);
            f21976b.clear();
            thread = f21980f;
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            ((b) map.get((f) it.next())).b(dVar);
        }
        if (thread != null && !Thread.currentThread().equals(thread)) {
            thread.interrupt();
        }
        if (thread == f21980f) {
            synchronized (f0.class) {
                if (thread == f21980f) {
                    f21980f = null;
                }
            }
        }
        o(e3.B0().b());
    }

    protected static void d(Location location) {
        double longitude;
        e3.a(e3.z.DEBUG, "LocationController fireCompleteForLocation with location: " + location);
        d dVar = new d();
        dVar.f21987c = Float.valueOf(location.getAccuracy());
        dVar.f21989e = Boolean.valueOf(e3.T0() ^ true);
        dVar.f21988d = Integer.valueOf(!f21977c ? 1 : 0);
        dVar.f21990f = Long.valueOf(location.getTime());
        if (f21977c) {
            dVar.f21985a = Double.valueOf(new BigDecimal(location.getLatitude()).setScale(7, RoundingMode.HALF_UP).doubleValue());
            longitude = new BigDecimal(location.getLongitude()).setScale(7, RoundingMode.HALF_UP).doubleValue();
        } else {
            dVar.f21985a = Double.valueOf(location.getLatitude());
            longitude = location.getLongitude();
        }
        dVar.f21986b = Double.valueOf(longitude);
        c(dVar);
        m(f21981g);
    }

    static void e() {
        synchronized (f21978d) {
            if (j()) {
                t.e();
            } else if (k()) {
                a0.e();
            }
        }
        c(null);
    }

    private static long f() {
        return n3.d(n3.f22119a, "OS_LAST_LOCATION_TIME", -600000L);
    }

    static void g(Context context, boolean z10, boolean z11, b bVar) {
        int iA;
        a(bVar);
        f21981g = context;
        f21976b.put(bVar.a(), bVar);
        if (!e3.V0()) {
            n(z10, e3.k0.ERROR);
            e();
            return;
        }
        int iA2 = h.a(context, "android.permission.ACCESS_FINE_LOCATION");
        if (iA2 == -1) {
            iA = h.a(context, "android.permission.ACCESS_COARSE_LOCATION");
            f21977c = true;
        } else {
            iA = -1;
        }
        int i10 = Build.VERSION.SDK_INT;
        int iA3 = i10 >= 29 ? h.a(context, "android.permission.ACCESS_BACKGROUND_LOCATION") : -1;
        if (iA2 != 0) {
            x xVarA = t3.f22451a.a(context, context.getPackageName(), 4096);
            if (!xVarA.b() || xVarA.a() == null) {
                n(z10, e3.k0.ERROR);
                return;
            }
            List listAsList = Arrays.asList(xVarA.a().requestedPermissions);
            e3.k0 k0Var = e3.k0.PERMISSION_DENIED;
            if (listAsList.contains("android.permission.ACCESS_FINE_LOCATION")) {
                f21983i = "android.permission.ACCESS_FINE_LOCATION";
            } else if (!listAsList.contains("android.permission.ACCESS_COARSE_LOCATION")) {
                e3.i1(e3.z.INFO, "Location permissions not added on AndroidManifest file");
                k0Var = e3.k0.LOCATION_PERMISSIONS_MISSING_MANIFEST;
            } else if (iA != 0) {
                f21983i = "android.permission.ACCESS_COARSE_LOCATION";
            } else if (i10 >= 29 && listAsList.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                f21983i = "android.permission.ACCESS_BACKGROUND_LOCATION";
            }
            if (f21983i != null && z10) {
                g0.f22029a.d(z11, f21983i);
                return;
            } else if (iA != 0) {
                n(z10, k0Var);
                e();
                return;
            }
        } else if (i10 >= 29 && iA3 != 0) {
            b(context, z10, z11);
            return;
        }
        n(z10, e3.k0.PERMISSION_GRANTED);
        p();
    }

    static c h() {
        if (f21979e == null) {
            synchronized (f21978d) {
                if (f21979e == null) {
                    f21979e = new c();
                }
            }
        }
        return f21979e;
    }

    private static boolean i(Context context) {
        return h.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || h.a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    static boolean j() {
        return OSUtils.B() && OSUtils.s();
    }

    static boolean k() {
        return OSUtils.G() && OSUtils.v();
    }

    static void l() {
        synchronized (f21978d) {
            if (j()) {
                t.l();
            } else {
                if (k()) {
                    a0.l();
                }
            }
        }
    }

    static boolean m(Context context) {
        e3.z zVar;
        String str;
        if (!i(context)) {
            zVar = e3.z.DEBUG;
            str = "LocationController scheduleUpdate not possible, location permission not enabled";
        } else {
            if (e3.V0()) {
                long jB = e3.B0().b() - f();
                long j10 = (e3.T0() ? 300L : 600L) * 1000;
                e3.i1(e3.z.DEBUG, "LocationController scheduleUpdate lastTime: " + jB + " minTime: " + j10);
                r2.q().r(context, j10 - jB);
                return true;
            }
            zVar = e3.z.DEBUG;
            str = "LocationController scheduleUpdate not possible, location shared not enabled";
        }
        e3.i1(zVar, str);
        return false;
    }

    static void n(boolean z10, e3.k0 k0Var) {
        if (!z10) {
            e3.i1(e3.z.DEBUG, "LocationController sendAndClearPromptHandlers from non prompt flow");
            return;
        }
        List list = f21975a;
        synchronized (list) {
            e3.i1(e3.z.DEBUG, "LocationController calling prompt handlers");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e) it.next()).c(k0Var);
            }
            f21975a.clear();
        }
    }

    private static void o(long j10) {
        n3.l(n3.f22119a, "OS_LAST_LOCATION_TIME", j10);
    }

    static void p() {
        e3.a(e3.z.DEBUG, "LocationController startGetLocation with lastLocation: " + f21982h);
        try {
            if (j()) {
                t.p();
            } else if (k()) {
                a0.p();
            } else {
                e3.a(e3.z.WARN, "LocationController startGetLocation not possible, no location dependency found");
                e();
            }
        } catch (Throwable th) {
            e3.b(e3.z.WARN, "Location permission exists but there was an error initializing: ", th);
            e();
        }
    }
}
