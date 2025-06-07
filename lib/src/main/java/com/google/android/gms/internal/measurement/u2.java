package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class u2 {

    /* renamed from: j, reason: collision with root package name */
    private static volatile u2 f19331j;

    /* renamed from: a, reason: collision with root package name */
    private final String f19332a;

    /* renamed from: b, reason: collision with root package name */
    protected final i4.e f19333b;

    /* renamed from: c, reason: collision with root package name */
    protected final ExecutorService f19334c;

    /* renamed from: d, reason: collision with root package name */
    private final w4.a f19335d;

    /* renamed from: e, reason: collision with root package name */
    private final List f19336e;

    /* renamed from: f, reason: collision with root package name */
    private int f19337f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19338g;

    /* renamed from: h, reason: collision with root package name */
    private final String f19339h;

    /* renamed from: i, reason: collision with root package name */
    private volatile f1 f19340i;

    protected u2(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f19332a = (str == null || !l(str2, str3)) ? "FA" : str;
        this.f19333b = i4.h.d();
        z0.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new g2(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f19334c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f19335d = new w4.a(this);
        this.f19336e = new ArrayList();
        try {
            if (x4.x.b(context, "google_app_id", x4.m.a(context)) != null && !h()) {
                this.f19339h = null;
                this.f19338g = true;
                Log.w(this.f19332a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (l(str2, str3)) {
            this.f19339h = str2;
        } else {
            this.f19339h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f19332a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f19332a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        k(new u1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f19332a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new t2(this));
        }
    }

    protected static final boolean h() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(Exception exc, boolean z10, boolean z11) {
        this.f19338g |= z10;
        if (z10) {
            Log.w(this.f19332a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            a(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f19332a, "Error with data collection. Data lost.", exc);
    }

    private final void j(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        k(new i2(this, l10, str, str2, bundle, z10, z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(k2 k2Var) {
        this.f19334c.execute(k2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(String str, String str2) {
        return (str2 == null || str == null || h()) ? false : true;
    }

    public static u2 s(Context context, String str, String str2, String str3, Bundle bundle) {
        e4.p.l(context);
        if (f19331j == null) {
            synchronized (u2.class) {
                if (f19331j == null) {
                    f19331j = new u2(context, str, str2, str3, bundle);
                }
            }
        }
        return f19331j;
    }

    public final Map A(String str, String str2, boolean z10) {
        b1 b1Var = new b1();
        k(new d2(this, str, str2, z10, b1Var));
        Bundle bundleW0 = b1Var.w0(5000L);
        if (bundleW0 == null || bundleW0.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleW0.size());
        for (String str3 : bundleW0.keySet()) {
            Object obj = bundleW0.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void E(String str) {
        k(new v1(this, str));
    }

    public final void F(String str, String str2, Bundle bundle) {
        k(new q1(this, str, str2, bundle));
    }

    public final void G(String str) {
        k(new w1(this, str));
    }

    public final void H(String str, String str2, Bundle bundle) {
        j(str, str2, bundle, true, true, null);
    }

    public final void a(int i10, String str, Object obj, Object obj2, Object obj3) {
        k(new e2(this, false, 5, str, obj, null, null));
    }

    public final void b(Bundle bundle) {
        k(new p1(this, bundle));
    }

    public final void c(Bundle bundle) {
        k(new t1(this, bundle));
    }

    public final void d(Activity activity, String str, String str2) {
        k(new s1(this, activity, str, str2));
    }

    public final void e(String str, String str2, Object obj, boolean z10) {
        k(new j2(this, str, str2, obj, z10));
    }

    public final int m(String str) {
        b1 b1Var = new b1();
        k(new h2(this, str, b1Var));
        Integer num = (Integer) b1.p1(b1Var.w0(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long n() {
        b1 b1Var = new b1();
        k(new a2(this, b1Var));
        Long l10 = (Long) b1.p1(b1Var.w0(500L), Long.class);
        if (l10 != null) {
            return l10.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f19333b.a()).nextLong();
        int i10 = this.f19337f + 1;
        this.f19337f = i10;
        return jNextLong + i10;
    }

    public final Bundle o(Bundle bundle, boolean z10) {
        b1 b1Var = new b1();
        k(new f2(this, bundle, b1Var));
        if (z10) {
            return b1Var.w0(5000L);
        }
        return null;
    }

    public final w4.a p() {
        return this.f19335d;
    }

    protected final f1 r(Context context, boolean z10) {
        try {
            return e1.asInterface(DynamiteModule.e(context, DynamiteModule.f5854e, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e5) {
            i(e5, true, false);
            return null;
        }
    }

    public final String u() {
        return this.f19339h;
    }

    public final String v() {
        b1 b1Var = new b1();
        k(new z1(this, b1Var));
        return b1Var.L0(50L);
    }

    public final String w() {
        b1 b1Var = new b1();
        k(new c2(this, b1Var));
        return b1Var.L0(500L);
    }

    public final String x() {
        b1 b1Var = new b1();
        k(new b2(this, b1Var));
        return b1Var.L0(500L);
    }

    public final String y() {
        b1 b1Var = new b1();
        k(new y1(this, b1Var));
        return b1Var.L0(500L);
    }

    public final List z(String str, String str2) {
        b1 b1Var = new b1();
        k(new r1(this, str, str2, b1Var));
        List list = (List) b1.p1(b1Var.w0(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }
}
