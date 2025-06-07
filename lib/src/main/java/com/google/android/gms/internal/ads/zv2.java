package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class zv2 {

    /* renamed from: a, reason: collision with root package name */
    private xw2 f18780a;

    /* renamed from: b, reason: collision with root package name */
    private long f18781b;

    /* renamed from: c, reason: collision with root package name */
    private int f18782c;

    public zv2() {
        b();
        this.f18780a = new xw2(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView a() {
        return (WebView) this.f18780a.get();
    }

    public final void b() {
        this.f18781b = System.nanoTime();
        this.f18782c = 1;
    }

    public void c() {
        this.f18780a.clear();
    }

    public final void d(String str, long j10) {
        if (j10 < this.f18781b || this.f18782c == 3) {
            return;
        }
        this.f18782c = 3;
        rv2.a().f(a(), str);
    }

    public final void e(String str, long j10) {
        if (j10 >= this.f18781b) {
            this.f18782c = 2;
            rv2.a().f(a(), str);
        }
    }

    public void f(cv2 cv2Var, av2 av2Var) {
        g(cv2Var, av2Var, null);
    }

    protected final void g(cv2 cv2Var, av2 av2Var, JSONObject jSONObject) throws JSONException {
        String strH = cv2Var.h();
        JSONObject jSONObject2 = new JSONObject();
        dw2.e(jSONObject2, "environment", "app");
        dw2.e(jSONObject2, "adSessionType", av2Var.d());
        JSONObject jSONObject3 = new JSONObject();
        dw2.e(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        dw2.e(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        dw2.e(jSONObject3, "os", "Android");
        dw2.e(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        dw2.e(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        dw2.e(jSONObject4, "partnerName", av2Var.e().b());
        dw2.e(jSONObject4, "partnerVersion", av2Var.e().c());
        dw2.e(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        dw2.e(jSONObject5, "libraryVersion", "1.3.37-google_20220829");
        dw2.e(jSONObject5, "appId", pv2.b().a().getApplicationContext().getPackageName());
        dw2.e(jSONObject2, "app", jSONObject5);
        if (av2Var.f() != null) {
            dw2.e(jSONObject2, "contentUrl", av2Var.f());
        }
        dw2.e(jSONObject2, "customReferenceData", av2Var.g());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = av2Var.h().iterator();
        if (it.hasNext()) {
            a5.a.a(it.next());
            throw null;
        }
        rv2.a().g(a(), strH, jSONObject2, jSONObject6, jSONObject);
    }

    public final void h(float f5) {
        rv2.a().e(a(), f5);
    }

    final void i(WebView webView) {
        this.f18780a = new xw2(webView);
    }

    public void j() {
    }

    public final boolean k() {
        return this.f18780a.get() != 0;
    }
}
