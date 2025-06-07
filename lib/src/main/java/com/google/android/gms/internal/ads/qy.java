package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
public final class qy implements gy {

    /* renamed from: a, reason: collision with root package name */
    private final j3.b f14534a;

    /* renamed from: b, reason: collision with root package name */
    private final xm1 f14535b;

    /* renamed from: c, reason: collision with root package name */
    private final ws2 f14536c;

    /* renamed from: e, reason: collision with root package name */
    private final h60 f14538e;

    /* renamed from: f, reason: collision with root package name */
    private final jy1 f14539f;

    /* renamed from: g, reason: collision with root package name */
    private l3.c0 f14540g = null;

    /* renamed from: d, reason: collision with root package name */
    private final ef0 f14537d = new ef0(null);

    public qy(j3.b bVar, h60 h60Var, jy1 jy1Var, xm1 xm1Var, ws2 ws2Var) {
        this.f14534a = bVar;
        this.f14538e = h60Var;
        this.f14539f = jy1Var;
        this.f14535b = xm1Var;
        this.f14536c = ws2Var;
    }

    public static int b(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri c(Context context, bg bgVar, Uri uri, View view, Activity activity) {
        if (bgVar == null) {
            return uri;
        }
        try {
            return bgVar.e(uri) ? bgVar.a(uri, context, view, activity) : uri;
        } catch (cg unused) {
            return uri;
        } catch (Exception e5) {
            j3.t.q().u(e5, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e5) {
            ze0.e("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e5);
        }
        return uri;
    }

    public static boolean f(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x011f, code lost:
    
        r11 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void h(k3.a r18, java.util.Map r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qy.h(k3.a, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    private final void i(boolean z10) {
        h60 h60Var = this.f14538e;
        if (h60Var != null) {
            h60Var.h(z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean j(k3.a r19, android.content.Context r20, java.lang.String r21, java.lang.String r22) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qy.j(k3.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(int i10) {
        if (this.f14535b == null) {
            return;
        }
        if (!((Boolean) k3.w.c().b(ir.Y7)).booleanValue()) {
            wm1 wm1VarA = this.f14535b.a();
            wm1VarA.b("action", "cct_action");
            wm1VarA.b("cct_open_status", js.a(i10));
            wm1VarA.g();
            return;
        }
        ws2 ws2Var = this.f14536c;
        String strA = js.a(i10);
        vs2 vs2VarB = vs2.b("cct_action");
        vs2VarB.a("cct_open_status", strA);
        ws2Var.a(vs2VarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0307  */
    @Override // com.google.android.gms.internal.ads.gy
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(k3.a r30, java.util.Map r31) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.net.URISyntaxException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1071
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qy.a(k3.a, java.util.Map):void");
    }
}
