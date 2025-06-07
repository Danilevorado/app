package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ed0 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f7714a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    private final Object f7715b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private String f7716c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f7717d = null;

    /* renamed from: e, reason: collision with root package name */
    final AtomicBoolean f7718e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f7719f = new AtomicInteger(-1);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f7720g = new AtomicReference(null);

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference f7721h = new AtomicReference(null);

    /* renamed from: i, reason: collision with root package name */
    private final ConcurrentMap f7722i = new ConcurrentHashMap(9);

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference f7723j = new AtomicReference(null);

    /* renamed from: k, reason: collision with root package name */
    private final BlockingQueue f7724k = new ArrayBlockingQueue(20);

    /* renamed from: l, reason: collision with root package name */
    private final Object f7725l = new Object();

    static final boolean A(Context context) throws ClassNotFoundException {
        if (!((Boolean) k3.w.c().b(ir.f9957h0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) k3.w.c().b(ir.f9968i0)).intValue()) {
            return false;
        }
        if (((Boolean) k3.w.c().b(ir.f9979j0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Object B(String str, Object obj, cd0 cd0Var) {
        synchronized (this.f7723j) {
            if (((gm0) this.f7723j.get()) != null) {
                try {
                    return cd0Var.a((gm0) this.f7723j.get());
                } catch (Exception unused) {
                    c(str, false);
                }
            }
            return obj;
        }
    }

    private final Object C(String str, Context context) throws NoSuchMethodException, SecurityException {
        if (!e(context, "com.google.android.gms.measurement.AppMeasurement", this.f7720g, true)) {
            return null;
        }
        try {
            return D(context, str).invoke(this.f7720g.get(), new Object[0]);
        } catch (Exception unused) {
            c(str, true);
            return null;
        }
    }

    private final Method D(Context context, String str) throws NoSuchMethodException, SecurityException {
        Method method = (Method) this.f7722i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f7722i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            c(str, false);
            return null;
        }
    }

    private final ExecutorService E() {
        ExecutorService threadPoolExecutor;
        if (this.f7714a.get() == null) {
            if (i4.d.a()) {
                threadPoolExecutor = a03.a().c(((Integer) k3.w.c().b(ir.f9946g0)).intValue(), new bd0(this), 2);
            } else {
                zq zqVar = ir.f9946g0;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) k3.w.c().b(zqVar)).intValue(), ((Integer) k3.w.c().b(zqVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new bd0(this));
            }
            nc0.a(this.f7714a, null, threadPoolExecutor);
        }
        return (ExecutorService) this.f7714a.get();
    }

    private final void a(Context context, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (e(context, "com.google.android.gms.measurement.AppMeasurement", this.f7720g, true)) {
            Method declaredMethod = (Method) this.f7722i.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.f7722i.put(str2, declaredMethod);
                } catch (Exception unused) {
                    c(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.f7720g.get(), str);
                m3.n1.k("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                c(str2, false);
            }
        }
    }

    private final void b(Context context, final String str, String str2, Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (z(context)) {
            final Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e5) {
                ze0.e("Invalid event ID: ".concat(String.valueOf(str2)), e5);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (A(context)) {
                d("logEventInternal", new dd0() { // from class: com.google.android.gms.internal.ads.qc0
                    @Override // com.google.android.gms.internal.ads.dd0
                    public final void a(gm0 gm0Var) {
                        gm0Var.I2("am", str, bundle2);
                    }
                });
                return;
            }
            if (e(context, "com.google.android.gms.measurement.AppMeasurement", this.f7720g, true)) {
                Method declaredMethod = (Method) this.f7722i.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.f7722i.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        c("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.f7720g.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    c("logEventInternal", true);
                }
            }
        }
    }

    private final void c(String str, boolean z10) {
        if (this.f7718e.get()) {
            return;
        }
        ze0.g("Invoke Firebase method " + str + " error.");
        if (z10) {
            ze0.g("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.f7718e.set(true);
        }
    }

    private final void d(final String str, final dd0 dd0Var) {
        synchronized (this.f7723j) {
            FutureTask futureTask = new FutureTask(new Runnable() { // from class: com.google.android.gms.internal.ads.rc0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14738m.o(dd0Var, str);
                }
            }, null);
            if (this.f7723j.get() != null) {
                futureTask.run();
            } else {
                this.f7724k.offer(futureTask);
            }
        }
    }

    private final boolean e(Context context, String str, AtomicReference atomicReference, boolean z10) {
        if (atomicReference.get() == null) {
            try {
                nc0.a(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                c("getInstance", z10);
                return false;
            }
        }
        return true;
    }

    public final String f(Context context) throws NoSuchMethodException, SecurityException {
        if (!z(context)) {
            return null;
        }
        if (A(context)) {
            Long l10 = (Long) B("getAdEventId", null, new cd0() { // from class: com.google.android.gms.internal.ads.sc0
                @Override // com.google.android.gms.internal.ads.cd0
                public final Object a(gm0 gm0Var) {
                    return Long.valueOf(gm0Var.d());
                }
            });
            if (l10 != null) {
                return Long.toString(l10.longValue());
            }
            return null;
        }
        Object objC = C("generateEventId", context);
        if (objC != null) {
            return objC.toString();
        }
        return null;
    }

    public final String g(Context context) {
        if (!z(context)) {
            return null;
        }
        synchronized (this.f7715b) {
            String str = this.f7717d;
            if (str != null) {
                return str;
            }
            this.f7717d = A(context) ? (String) B("getAppIdOrigin", this.f7717d, new cd0() { // from class: com.google.android.gms.internal.ads.wc0
                @Override // com.google.android.gms.internal.ads.cd0
                public final Object a(gm0 gm0Var) {
                    return gm0Var.c();
                }
            }) : "fa";
            return this.f7717d;
        }
    }

    public final String h(final Context context) {
        if (!z(context)) {
            return null;
        }
        long jLongValue = ((Long) k3.w.c().b(ir.f9936f0)).longValue();
        if (A(context)) {
            try {
                return jLongValue < 0 ? (String) B("getAppInstanceId", null, xc0.f17504a) : (String) E().submit(new Callable() { // from class: com.google.android.gms.internal.ads.yc0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f17962a.k();
                    }
                }).get(jLongValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        }
        if (jLongValue < 0) {
            return (String) C("getAppInstanceId", context);
        }
        try {
            return (String) E().submit(new Callable() { // from class: com.google.android.gms.internal.ads.zc0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f18515a.l(context);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused3) {
            return "TIME_OUT";
        } catch (Exception unused4) {
            return null;
        }
    }

    public final String i(Context context) {
        if (!z(context)) {
            return "";
        }
        if (A(context)) {
            return (String) B("getCurrentScreenNameOrScreenClass", "", new cd0() { // from class: com.google.android.gms.internal.ads.tc0
                @Override // com.google.android.gms.internal.ads.cd0
                public final Object a(gm0 gm0Var) {
                    String strG = gm0Var.g();
                    return (strG == null && (strG = gm0Var.h()) == null) ? "" : strG;
                }
            });
        }
        if (!e(context, "com.google.android.gms.measurement.AppMeasurement", this.f7720g, true)) {
            return "";
        }
        try {
            String str = (String) D(context, "getCurrentScreenName").invoke(this.f7720g.get(), new Object[0]);
            if (str == null) {
                str = (String) D(context, "getCurrentScreenClass").invoke(this.f7720g.get(), new Object[0]);
            }
            return str == null ? "" : str;
        } catch (Exception unused) {
            c("getCurrentScreenName", false);
            return "";
        }
    }

    public final String j(Context context) {
        if (!z(context)) {
            return null;
        }
        synchronized (this.f7715b) {
            String str = this.f7716c;
            if (str != null) {
                return str;
            }
            this.f7716c = A(context) ? (String) B("getGmpAppId", this.f7716c, new cd0() { // from class: com.google.android.gms.internal.ads.pc0
                @Override // com.google.android.gms.internal.ads.cd0
                public final Object a(gm0 gm0Var) {
                    return gm0Var.i();
                }
            }) : (String) C("getGmpAppId", context);
            return this.f7716c;
        }
    }

    final /* synthetic */ String k() {
        return (String) B("getAppInstanceId", null, xc0.f17504a);
    }

    final /* synthetic */ String l(Context context) {
        return (String) C("getAppInstanceId", context);
    }

    public final void m(Context context, final String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (z(context)) {
            if (A(context)) {
                d("beginAdUnitExposure", new dd0() { // from class: com.google.android.gms.internal.ads.oc0
                    @Override // com.google.android.gms.internal.ads.dd0
                    public final void a(gm0 gm0Var) {
                        gm0Var.b0(str);
                    }
                });
            } else {
                a(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void n(Context context, final String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (z(context)) {
            if (A(context)) {
                d("endAdUnitExposure", new dd0() { // from class: com.google.android.gms.internal.ads.vc0
                    @Override // com.google.android.gms.internal.ads.dd0
                    public final void a(gm0 gm0Var) {
                        gm0Var.U(str);
                    }
                });
            } else {
                a(context, str, "endAdUnitExposure");
            }
        }
    }

    final /* synthetic */ void o(dd0 dd0Var, String str) {
        if (((gm0) this.f7723j.get()) != null) {
            try {
                dd0Var.a((gm0) this.f7723j.get());
            } catch (Exception unused) {
                c(str, false);
            }
        }
    }

    public final void p(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b(context, "_aa", str, null);
    }

    public final void q(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b(context, "_aq", str, null);
    }

    public final void r(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b(context, "_ac", str, null);
    }

    public final void s(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        b(context, "_ai", str, null);
    }

    public final void t(Context context, String str, String str2, String str3, int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (z(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i10);
            b(context, "_ar", str, bundle);
            m3.n1.k("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i10);
        }
    }

    public final void u(Context context, k3.c4 c4Var) {
        if (((Boolean) k3.w.c().b(ir.f10012m0)).booleanValue() && z(context) && A(context)) {
            synchronized (this.f7725l) {
            }
        }
    }

    public final void v(Context context, k3.q3 q3Var) {
        fd0.d(context).b().d(q3Var);
        if (((Boolean) k3.w.c().b(ir.f10012m0)).booleanValue() && z(context) && A(context)) {
            synchronized (this.f7725l) {
            }
        }
    }

    public final void w(final Bundle bundle) {
        d("setConsent", new dd0() { // from class: com.google.android.gms.internal.ads.ad0
            @Override // com.google.android.gms.internal.ads.dd0
            public final void a(gm0 gm0Var) {
                gm0Var.f0(bundle);
            }
        });
    }

    public final void x(final Context context, final String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (z(context) && (context instanceof Activity)) {
            if (A(context)) {
                d("setScreenName", new dd0() { // from class: com.google.android.gms.internal.ads.uc0
                    @Override // com.google.android.gms.internal.ads.dd0
                    public final void a(gm0 gm0Var) {
                        Context context2 = context;
                        gm0Var.g4(l4.b.p1(context2), str, context2.getPackageName());
                    }
                });
                return;
            }
            if (e(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f7721h, false)) {
                Method declaredMethod = (Method) this.f7722i.get("setCurrentScreen");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                        this.f7722i.put("setCurrentScreen", declaredMethod);
                    } catch (Exception unused) {
                        c("setCurrentScreen", false);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.f7721h.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception unused2) {
                    c("setCurrentScreen", false);
                }
            }
        }
    }

    public final boolean y() {
        synchronized (this.f7725l) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z(android.content.Context r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zq r0 = com.google.android.gms.internal.ads.ir.f9882a0
            com.google.android.gms.internal.ads.gr r1 = k3.w.c()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L67
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f7718e
            boolean r0 = r0.get()
            if (r0 == 0) goto L1c
            goto L67
        L1c:
            com.google.android.gms.internal.ads.zq r0 = com.google.android.gms.internal.ads.ir.f9990k0
            com.google.android.gms.internal.ads.gr r2 = k3.w.c()
            java.lang.Object r0 = r2.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L30
            return r2
        L30:
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f7719f
            int r0 = r0.get()
            r3 = -1
            if (r0 != r3) goto L5e
            k3.t.b()
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r0 = com.google.android.gms.internal.ads.se0.u(r5, r0)
            if (r0 != 0) goto L59
            k3.t.b()
            boolean r5 = com.google.android.gms.internal.ads.se0.v(r5)
            if (r5 == 0) goto L59
            java.lang.String r5 = "Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service."
            com.google.android.gms.internal.ads.ze0.g(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f7719f
            r5.set(r1)
            goto L5e
        L59:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f7719f
            r5.set(r2)
        L5e:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f7719f
            int r5 = r5.get()
            if (r5 != r2) goto L67
            return r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ed0.z(android.content.Context):boolean");
    }
}
