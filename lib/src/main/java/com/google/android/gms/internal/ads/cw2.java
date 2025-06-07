package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cw2 extends zv2 {

    /* renamed from: d, reason: collision with root package name */
    private WebView f7101d;

    /* renamed from: e, reason: collision with root package name */
    private Long f7102e = null;

    /* renamed from: f, reason: collision with root package name */
    private final Map f7103f;

    public cw2(Map map, String str) {
        this.f7103f = map;
    }

    @Override // com.google.android.gms.internal.ads.zv2
    public final void c() {
        super.c();
        new Handler().postDelayed(new bw2(this), Math.max(4000 - (this.f7102e == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f7102e.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f7101d = null;
    }

    @Override // com.google.android.gms.internal.ads.zv2
    public final void f(cv2 cv2Var, av2 av2Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map mapI = av2Var.i();
        for (String str : mapI.keySet()) {
            a5.a.a(mapI.get(str));
            dw2.e(jSONObject, str, null);
        }
        g(cv2Var, av2Var, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zv2
    public final void j() {
        WebView webView = new WebView(pv2.b().a());
        this.f7101d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        i(this.f7101d);
        WebView webView2 = this.f7101d;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator it = this.f7103f.keySet().iterator();
        if (!it.hasNext()) {
            this.f7102e = Long.valueOf(System.nanoTime());
        } else {
            a5.a.a(this.f7103f.get((String) it.next()));
            throw null;
        }
    }
}
