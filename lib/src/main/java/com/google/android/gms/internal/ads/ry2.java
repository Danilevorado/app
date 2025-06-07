package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AdError;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class ry2 implements gx2 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f15010a;

    /* renamed from: b, reason: collision with root package name */
    private final sy2 f15011b;

    /* renamed from: c, reason: collision with root package name */
    private final ez2 f15012c;

    /* renamed from: d, reason: collision with root package name */
    private final dx2 f15013d;

    ry2(Object obj, sy2 sy2Var, ez2 ez2Var, dx2 dx2Var) {
        this.f15010a = obj;
        this.f15011b = sy2Var;
        this.f15012c = ez2Var;
        this.f15013d = dx2Var;
    }

    private static String i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        he heVarK = ie.K();
        heVarK.w(5);
        heVarK.u(ww3.I(bArr, 0, bArr.length));
        return Base64.encodeToString(((ie) heVarK.m()).x(), 11);
    }

    private final synchronized byte[] j(Map map, Map map2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e5) {
            this.f15013d.c(2007, System.currentTimeMillis() - jCurrentTimeMillis, e5);
            return null;
        }
        return (byte[]) this.f15010a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f15010a, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.gx2
    public final synchronized String a(Context context, String str) {
        Map mapB;
        mapB = this.f15012c.b();
        mapB.put("f", "q");
        mapB.put("ctx", context);
        mapB.put("aid", null);
        return i(j(null, mapB));
    }

    @Override // com.google.android.gms.internal.ads.gx2
    public final synchronized void b(String str, MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.f15010a.getClass().getDeclaredMethod("he", Map.class).invoke(this.f15010a, map);
            this.f15013d.d(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e5) {
            throw new cz2(2005, e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.gx2
    public final synchronized String c(Context context, String str, String str2, View view, Activity activity) {
        Map mapA;
        mapA = this.f15012c.a();
        mapA.put("f", "c");
        mapA.put("ctx", context);
        mapA.put("cs", str2);
        mapA.put("aid", null);
        mapA.put("view", view);
        mapA.put("act", activity);
        return i(j(null, mapA));
    }

    @Override // com.google.android.gms.internal.ads.gx2
    public final synchronized String d(Context context, String str, View view, Activity activity) {
        Map mapD;
        mapD = this.f15012c.d();
        mapD.put("f", "v");
        mapD.put("ctx", context);
        mapD.put("aid", null);
        mapD.put("view", view);
        mapD.put("act", activity);
        return i(j(null, mapD));
    }

    public final synchronized int e() {
        try {
        } catch (Exception e5) {
            throw new cz2(AdError.INTERNAL_ERROR_2006, e5);
        }
        return ((Integer) this.f15010a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f15010a, new Object[0])).intValue();
    }

    final sy2 f() {
        return this.f15011b;
    }

    public final synchronized void g() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f15010a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f15010a, new Object[0]);
            this.f15013d.d(AdError.MEDIATION_ERROR_CODE, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e5) {
            throw new cz2(AdError.INTERNAL_ERROR_2003, e5);
        }
    }

    final synchronized boolean h() {
        try {
        } catch (Exception e5) {
            throw new cz2(AdError.INTERNAL_ERROR_CODE, e5);
        }
        return ((Boolean) this.f15010a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f15010a, new Object[0])).booleanValue();
    }
}
