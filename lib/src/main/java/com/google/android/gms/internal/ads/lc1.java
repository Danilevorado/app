package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lc1 implements xd1 {
    private k3.o1 A;

    /* renamed from: a, reason: collision with root package name */
    private final Context f11455a;

    /* renamed from: b, reason: collision with root package name */
    private final ae1 f11456b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f11457c;

    /* renamed from: d, reason: collision with root package name */
    private final qi1 f11458d;

    /* renamed from: e, reason: collision with root package name */
    private final pd1 f11459e;

    /* renamed from: f, reason: collision with root package name */
    private final bg f11460f;

    /* renamed from: g, reason: collision with root package name */
    private final d21 f11461g;

    /* renamed from: h, reason: collision with root package name */
    private final j11 f11462h;

    /* renamed from: i, reason: collision with root package name */
    private final d91 f11463i;

    /* renamed from: j, reason: collision with root package name */
    private final hn2 f11464j;

    /* renamed from: k, reason: collision with root package name */
    private final ff0 f11465k;

    /* renamed from: l, reason: collision with root package name */
    private final do2 f11466l;

    /* renamed from: m, reason: collision with root package name */
    private final ut0 f11467m;

    /* renamed from: n, reason: collision with root package name */
    private final ue1 f11468n;

    /* renamed from: o, reason: collision with root package name */
    private final i4.e f11469o;

    /* renamed from: p, reason: collision with root package name */
    private final z81 f11470p;

    /* renamed from: q, reason: collision with root package name */
    private final tu2 f11471q;

    /* renamed from: r, reason: collision with root package name */
    private final au2 f11472r;

    /* renamed from: t, reason: collision with root package name */
    private boolean f11474t;

    /* renamed from: s, reason: collision with root package name */
    private boolean f11473s = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f11475u = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f11476v = false;

    /* renamed from: w, reason: collision with root package name */
    private Point f11477w = new Point();

    /* renamed from: x, reason: collision with root package name */
    private Point f11478x = new Point();

    /* renamed from: y, reason: collision with root package name */
    private long f11479y = 0;

    /* renamed from: z, reason: collision with root package name */
    private long f11480z = 0;

    public lc1(Context context, ae1 ae1Var, JSONObject jSONObject, qi1 qi1Var, pd1 pd1Var, bg bgVar, d21 d21Var, j11 j11Var, d91 d91Var, hn2 hn2Var, ff0 ff0Var, do2 do2Var, ut0 ut0Var, ue1 ue1Var, i4.e eVar, z81 z81Var, tu2 tu2Var, au2 au2Var) {
        this.f11455a = context;
        this.f11456b = ae1Var;
        this.f11457c = jSONObject;
        this.f11458d = qi1Var;
        this.f11459e = pd1Var;
        this.f11460f = bgVar;
        this.f11461g = d21Var;
        this.f11462h = j11Var;
        this.f11463i = d91Var;
        this.f11464j = hn2Var;
        this.f11465k = ff0Var;
        this.f11466l = do2Var;
        this.f11467m = ut0Var;
        this.f11468n = ue1Var;
        this.f11469o = eVar;
        this.f11470p = z81Var;
        this.f11471q = tu2Var;
        this.f11472r = au2Var;
    }

    private final String w(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iN = this.f11459e.N();
        if (iN == 1) {
            return "1099";
        }
        if (iN == 2) {
            return "2099";
        }
        if (iN != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean x(String str) {
        JSONObject jSONObjectOptJSONObject = this.f11457c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    private final boolean y() {
        return this.f11457c.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean z(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z10) throws JSONException {
        qi1 qi1Var;
        String str2;
        gy gc1Var;
        e4.p.e("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f11457c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) k3.w.c().b(ir.f9918d3)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z10);
            Context context = this.f11455a;
            JSONObject jSONObject7 = new JSONObject();
            j3.t.r();
            DisplayMetrics displayMetricsM = m3.b2.M((WindowManager) context.getSystemService("window"));
            hc1 hc1Var = null;
            byte b10 = 0;
            byte b11 = 0;
            try {
                jSONObject7.put("width", k3.t.b().e(context, displayMetricsM.widthPixels));
                jSONObject7.put("height", k3.t.b().e(context, displayMetricsM.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) k3.w.c().b(ir.S7)).booleanValue()) {
                qi1Var = this.f11458d;
                str2 = "/clickRecorded";
                gc1Var = new ic1(this, hc1Var);
            } else {
                qi1Var = this.f11458d;
                str2 = "/logScionEvent";
                gc1Var = new gc1(this, b10 == true ? 1 : 0);
            }
            qi1Var.i(str2, gc1Var);
            this.f11458d.i("/nativeImpression", new kc1(this, b11 == true ? 1 : 0));
            rf0.a(this.f11458d.d("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f11473s) {
                return true;
            }
            this.f11473s = j3.t.u().n(this.f11455a, this.f11465k.f8252m, this.f11464j.D.toString(), this.f11466l.f7447f);
            return true;
        } catch (JSONException e5) {
            ze0.e("Unable to create impression JSON.", e5);
            return false;
        }
    }

    protected final void D(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z10, boolean z11) throws JSONException {
        String strG;
        e4.p.e("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f11457c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.f11456b.c(this.f11459e.k0()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f11459e.N());
            jSONObject8.put("view_aware_api_used", z10);
            eu euVar = this.f11466l.f7450i;
            jSONObject8.put("custom_mute_requested", euVar != null && euVar.f7976s);
            jSONObject8.put("custom_mute_enabled", (this.f11459e.g().isEmpty() || this.f11459e.V() == null) ? false : true);
            if (this.f11468n.a() != null && this.f11457c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f11469o.a());
            if (this.f11476v && y()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z11) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.f11456b.c(this.f11459e.k0()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = this.f11457c.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strG = this.f11460f.c().g(this.f11455a, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e5) {
                ze0.e("Exception obtaining click signals", e5);
                strG = null;
            }
            jSONObject8.put("click_signals", strG);
            if (((Boolean) k3.w.c().b(ir.f9994k4)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) k3.w.c().b(ir.W7)).booleanValue() && i4.m.l()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) k3.w.c().b(ir.X7)).booleanValue() && i4.m.l()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long jA = this.f11469o.a();
            jSONObject9.put("time_from_last_touch_down", jA - this.f11479y);
            jSONObject9.put("time_from_last_touch", jA - this.f11480z);
            jSONObject7.put("touch_signal", jSONObject9);
            rf0.a(this.f11458d.d("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e10) {
            ze0.e("Unable to create click JSON.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final boolean F() {
        if (a() == 0) {
            return true;
        }
        if (((Boolean) k3.w.c().b(ir.J9)).booleanValue()) {
            return this.f11466l.f7450i.f7979v;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final boolean O() {
        return y();
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final int a() {
        if (this.f11466l.f7450i == null) {
            return 0;
        }
        if (((Boolean) k3.w.c().b(ir.J9)).booleanValue()) {
            return this.f11466l.f7450i.f7978u;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void b(Bundle bundle) {
        if (bundle == null) {
            ze0.b("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!x("touch_reporting")) {
            ze0.d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f11460f.c().f((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void b0(String str) throws JSONException {
        D(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void c(View view, MotionEvent motionEvent, View view2) {
        this.f11477w = m3.z0.a(motionEvent, view2);
        long jA = this.f11469o.a();
        this.f11480z = jA;
        if (motionEvent.getAction() == 0) {
            this.f11479y = jA;
            this.f11478x = this.f11477w;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.f11477w;
        motionEventObtain.setLocation(point.x, point.y);
        this.f11460f.d(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final JSONObject d(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        JSONObject jSONObjectD = m3.z0.d(this.f11455a, map, map2, view, scaleType);
        JSONObject jSONObjectG = m3.z0.g(this.f11455a, view);
        JSONObject jSONObjectF = m3.z0.f(view);
        JSONObject jSONObjectE = m3.z0.e(this.f11455a, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectD);
            jSONObject.put("ad_view_signal", jSONObjectG);
            jSONObject.put("scroll_view_signal", jSONObjectF);
            jSONObject.put("lock_screen_signal", jSONObjectE);
            return jSONObject;
        } catch (JSONException e5) {
            ze0.e("Unable to create native ad view signals JSON.", e5);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void e(k3.o1 o1Var) {
        this.A = o1Var;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void f(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) throws JSONException {
        JSONObject jSONObject;
        boolean z11 = false;
        if (this.f11457c.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) k3.w.c().b(ir.J9)).booleanValue()) {
                z11 = true;
            }
        }
        if (!z11) {
            if (!this.f11476v) {
                ze0.b("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!y()) {
                ze0.b("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject jSONObjectD = m3.z0.d(this.f11455a, map, map2, view2, scaleType);
        JSONObject jSONObjectG = m3.z0.g(this.f11455a, view2);
        JSONObject jSONObjectF = m3.z0.f(view2);
        JSONObject jSONObjectE = m3.z0.e(this.f11455a, view2);
        String strW = w(view, map);
        JSONObject jSONObjectC = m3.z0.c(strW, this.f11455a, this.f11478x, this.f11477w);
        if (z11) {
            try {
                JSONObject jSONObject2 = this.f11457c;
                Point point = this.f11478x;
                Point point2 = this.f11477w;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i10);
                    } catch (Exception e5) {
                        e = e5;
                        ze0.e("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        D(view2, jSONObjectG, jSONObjectD, jSONObjectF, jSONObjectE, strW, jSONObjectC, null, z10, true);
                    }
                } catch (Exception e10) {
                    e = e10;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e11) {
                ze0.e("Error occurred while adding CustomClickGestureSignals to adJson.", e11);
                j3.t.q().u(e11, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        D(view2, jSONObjectG, jSONObjectD, jSONObjectF, jSONObjectE, strW, jSONObjectC, null, z10, true);
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void g() {
        if (this.f11457c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f11468n.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void h() {
        try {
            k3.o1 o1Var = this.A;
            if (o1Var != null) {
                o1Var.c();
            }
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void i() {
        this.f11458d.f();
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void j(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        String strD;
        JSONObject jSONObjectD = m3.z0.d(this.f11455a, map, map2, view, scaleType);
        JSONObject jSONObjectG = m3.z0.g(this.f11455a, view);
        JSONObject jSONObjectF = m3.z0.f(view);
        JSONObject jSONObjectE = m3.z0.e(this.f11455a, view);
        if (((Boolean) k3.w.c().b(ir.f9918d3)).booleanValue()) {
            try {
                strD = this.f11460f.c().d(this.f11455a, view, null);
            } catch (Exception unused) {
                ze0.d("Exception getting data.");
            }
        } else {
            strD = null;
        }
        z(jSONObjectG, jSONObjectD, jSONObjectF, jSONObjectE, strD, null, m3.z0.h(this.f11455a, this.f11464j));
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void k(jw jwVar) {
        if (this.f11457c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f11468n.c(jwVar);
        } else {
            ze0.g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void l(View view, Map map) {
        this.f11477w = new Point();
        this.f11478x = new Point();
        if (view != null) {
            this.f11470p.s0(view);
        }
        this.f11474t = false;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final boolean m(Bundle bundle) {
        if (x("impression_reporting")) {
            return z(null, null, null, null, null, k3.t.b().l(bundle, null), false);
        }
        ze0.d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void n(View view) {
        if (!this.f11457c.optBoolean("custom_one_point_five_click_enabled", false)) {
            ze0.g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        ue1 ue1Var = this.f11468n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(ue1Var);
        view.setClickable(true);
        ue1Var.f16304s = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void o() throws JSONException {
        e4.p.e("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f11457c);
            rf0.a(this.f11458d.d("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e5) {
            ze0.e("", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void p(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f11477w = new Point();
        this.f11478x = new Point();
        if (!this.f11474t) {
            this.f11470p.r0(view);
            this.f11474t = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f11467m.g(this);
        boolean zI = m3.z0.i(this.f11465k.f8254o);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zI) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zI) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void q(k3.r1 r1Var) {
        try {
            if (this.f11475u) {
                return;
            }
            if (r1Var == null) {
                pd1 pd1Var = this.f11459e;
                if (pd1Var.V() != null) {
                    this.f11475u = true;
                    this.f11471q.c(pd1Var.V().e(), this.f11472r);
                    h();
                    return;
                }
            }
            this.f11475u = true;
            this.f11471q.c(r1Var.e(), this.f11472r);
            h();
        } catch (RemoteException e5) {
            ze0.i("#007 Could not call remote method.", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void r() throws JSONException {
        z(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final JSONObject s(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        JSONObject jSONObjectD = d(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f11476v && y()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectD != null) {
                jSONObject.put("nas", jSONObjectD);
            }
        } catch (JSONException e5) {
            ze0.e("Unable to create native click meta data JSON.", e5);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void t(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) throws JSONException {
        JSONObject jSONObjectD = m3.z0.d(this.f11455a, map, map2, view2, scaleType);
        JSONObject jSONObjectG = m3.z0.g(this.f11455a, view2);
        JSONObject jSONObjectF = m3.z0.f(view2);
        JSONObject jSONObjectE = m3.z0.e(this.f11455a, view2);
        String strW = w(view, map);
        D(true == ((Boolean) k3.w.c().b(ir.f9982j3)).booleanValue() ? view2 : view, jSONObjectG, jSONObjectD, jSONObjectF, jSONObjectE, strW, m3.z0.c(strW, this.f11455a, this.f11478x, this.f11477w), null, z10, false);
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void u(Bundle bundle) throws JSONException {
        if (bundle == null) {
            ze0.b("Click data is null. No click is reported.");
        } else if (!x("click_reporting")) {
            ze0.d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            D(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, k3.t.b().l(bundle, null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.xd1
    public final void v() {
        this.f11476v = true;
    }
}
