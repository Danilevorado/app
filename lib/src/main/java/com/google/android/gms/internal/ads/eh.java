package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class eh {

    /* renamed from: a, reason: collision with root package name */
    private long f7768a = -1;

    /* renamed from: b, reason: collision with root package name */
    private long f7769b = -1;

    /* renamed from: c, reason: collision with root package name */
    private long f7770c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f7771d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f7772e = -1;

    /* renamed from: f, reason: collision with root package name */
    private long f7773f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f7774g = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f7775h = -1;

    private static DisplayMetrics l(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    private static boolean m(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object objInvoke = view.getClass().getMethod("getAdConfiguration", new Class[0]).invoke(view, new Object[0]);
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, Integer.valueOf(((Integer) objInvoke.getClass().getField("adType").get(objInvoke)).intValue()));
            if (!str.contains("INTERSTITIAL") && !str.contains("APP_OPEN")) {
                if (!str.contains("REWARDED")) {
                    return false;
                }
            }
            return true;
        } catch (ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    public final long a() {
        return this.f7774g;
    }

    public final long b() {
        return this.f7772e;
    }

    public final long c() {
        return this.f7768a;
    }

    public final long d() {
        return this.f7770c;
    }

    public final long e() {
        return this.f7775h;
    }

    public final long f() {
        return this.f7773f;
    }

    public final long g() {
        return this.f7769b;
    }

    public final long h() {
        return this.f7771d;
    }

    public final void i() {
        this.f7775h = this.f7774g;
        this.f7774g = SystemClock.uptimeMillis();
    }

    public final void j() {
        this.f7769b = this.f7768a;
        this.f7768a = SystemClock.uptimeMillis();
    }

    public final void k(Context context, View view) {
        this.f7771d = this.f7770c;
        this.f7770c = SystemClock.uptimeMillis();
        long j10 = this.f7772e;
        if (j10 != -1) {
            this.f7773f = j10;
        }
        DisplayMetrics displayMetricsL = l(context);
        int i10 = displayMetricsL.widthPixels * displayMetricsL.heightPixels;
        if (view != null) {
            int iMin = Math.min(view.getWidth(), displayMetricsL.widthPixels) * Math.min(view.getHeight(), displayMetricsL.heightPixels);
            if (iMin + iMin >= i10 || (iMin == 0 && m(view))) {
                this.f7772e = this.f7770c;
                return;
            }
        }
        this.f7772e = -1L;
    }
}
