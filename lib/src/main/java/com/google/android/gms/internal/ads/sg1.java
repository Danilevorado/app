package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class sg1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15220a;

    /* renamed from: b, reason: collision with root package name */
    private final bg1 f15221b;

    /* renamed from: c, reason: collision with root package name */
    private final bg f15222c;

    /* renamed from: d, reason: collision with root package name */
    private final ff0 f15223d;

    /* renamed from: e, reason: collision with root package name */
    private final j3.a f15224e;

    /* renamed from: f, reason: collision with root package name */
    private final pm f15225f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f15226g;

    /* renamed from: h, reason: collision with root package name */
    private final eu f15227h;

    /* renamed from: i, reason: collision with root package name */
    private final lh1 f15228i;

    /* renamed from: j, reason: collision with root package name */
    private final dk1 f15229j;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f15230k;

    /* renamed from: l, reason: collision with root package name */
    private final xi1 f15231l;

    /* renamed from: m, reason: collision with root package name */
    private final xm1 f15232m;

    /* renamed from: n, reason: collision with root package name */
    private final ws2 f15233n;

    /* renamed from: o, reason: collision with root package name */
    private final tu2 f15234o;

    /* renamed from: p, reason: collision with root package name */
    private final jy1 f15235p;

    public sg1(Context context, bg1 bg1Var, bg bgVar, ff0 ff0Var, j3.a aVar, pm pmVar, Executor executor, do2 do2Var, lh1 lh1Var, dk1 dk1Var, ScheduledExecutorService scheduledExecutorService, xm1 xm1Var, ws2 ws2Var, tu2 tu2Var, jy1 jy1Var, xi1 xi1Var) {
        this.f15220a = context;
        this.f15221b = bg1Var;
        this.f15222c = bgVar;
        this.f15223d = ff0Var;
        this.f15224e = aVar;
        this.f15225f = pmVar;
        this.f15226g = executor;
        this.f15227h = do2Var.f7450i;
        this.f15228i = lh1Var;
        this.f15229j = dk1Var;
        this.f15230k = scheduledExecutorService;
        this.f15232m = xm1Var;
        this.f15233n = ws2Var;
        this.f15234o = tu2Var;
        this.f15235p = jy1Var;
        this.f15231l = xi1Var;
    }

    public static final k3.a3 i(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return r(jSONObjectOptJSONObject);
    }

    public static final List j(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return c63.u();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return c63.u();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            k3.a3 a3VarR = r(jSONArrayOptJSONArray.optJSONObject(i10));
            if (a3VarR != null) {
                arrayList.add(a3VarR);
            }
        }
        return c63.s(arrayList);
    }

    private final k3.h4 k(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == 0) {
                return k3.h4.v();
            }
            i10 = 0;
        }
        return new k3.h4(this.f15220a, new d3.g(i10, i11));
    }

    private static ab3 l(ab3 ab3Var, Object obj) {
        final Object obj2 = null;
        return qa3.f(ab3Var, Exception.class, new w93(obj2) { // from class: com.google.android.gms.internal.ads.pg1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj3) {
                m3.n1.l("Error during loading assets.", (Exception) obj3);
                return qa3.h(null);
            }
        }, of0.f13191f);
    }

    private static ab3 m(boolean z10, final ab3 ab3Var, Object obj) {
        return z10 ? qa3.m(ab3Var, new w93() { // from class: com.google.android.gms.internal.ads.ng1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj2) {
                return obj2 != null ? ab3Var : qa3.g(new w22(1, "Retrieve required value in native ad response failed."));
            }
        }, of0.f13191f) : l(ab3Var, null);
    }

    private final ab3 n(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return qa3.h(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return qa3.h(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z10) {
            return qa3.h(new cu(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return m(jSONObject.optBoolean("require"), qa3.l(this.f15221b.b(strOptString, dOptDouble, zOptBoolean), new w23() { // from class: com.google.android.gms.internal.ads.qg1
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                String str = strOptString;
                return new cu(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.f15226g), null);
    }

    private final ab3 o(JSONArray jSONArray, boolean z10, boolean z11) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return qa3.h(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z11 ? jSONArray.length() : 1;
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(n(jSONArray.optJSONObject(i10), z10));
        }
        return qa3.l(qa3.d(arrayList), new w23() { // from class: com.google.android.gms.internal.ads.og1
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (cu cuVar : (List) obj) {
                    if (cuVar != null) {
                        arrayList2.add(cuVar);
                    }
                }
                return arrayList2;
            }
        }, this.f15226g);
    }

    private final ab3 p(JSONObject jSONObject, hn2 hn2Var, ln2 ln2Var) {
        final ab3 ab3VarB = this.f15228i.b(jSONObject.optString("base_url"), jSONObject.optString("html"), hn2Var, ln2Var, k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return qa3.m(ab3VarB, new w93() { // from class: com.google.android.gms.internal.ads.rg1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) throws w22 {
                ab3 ab3Var = ab3VarB;
                nk0 nk0Var = (nk0) obj;
                if (nk0Var == null || nk0Var.q() == null) {
                    throw new w22(1, "Retrieve video view in html5 ad response failed.");
                }
                return ab3Var;
            }
        }, of0.f13191f);
    }

    private static Integer q(JSONObject jSONObject, String str) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final k3.a3 r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new k3.a3(strOptString, strOptString2);
    }

    final /* synthetic */ zt a(JSONObject jSONObject, List list) throws JSONException {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numQ = q(jSONObject, "bg_color");
        Integer numQ2 = q(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", AdError.NETWORK_ERROR_CODE);
        return new zt(strOptString, list, numQ, numQ2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.f15227h.f7974q, zOptBoolean);
    }

    final /* synthetic */ ab3 b(k3.h4 h4Var, hn2 hn2Var, ln2 ln2Var, String str, String str2, Object obj) {
        nk0 nk0VarA = this.f15229j.a(h4Var, hn2Var, ln2Var);
        final sf0 sf0VarG = sf0.g(nk0VarA);
        ti1 ti1VarB = this.f15231l.b();
        nk0VarA.G().R(ti1VarB, ti1VarB, ti1VarB, ti1VarB, ti1VarB, false, null, new j3.b(this.f15220a, null, null), null, null, this.f15235p, this.f15234o, this.f15232m, this.f15233n, null, ti1VarB, null, null);
        if (((Boolean) k3.w.c().b(ir.f10080s3)).booleanValue()) {
            nk0VarA.O0("/getNativeAdViewSignals", fy.f8494s);
        }
        nk0VarA.O0("/getNativeClickMeta", fy.f8495t);
        nk0VarA.G().c0(new am0() { // from class: com.google.android.gms.internal.ads.mg1
            @Override // com.google.android.gms.internal.ads.am0
            public final void a(boolean z10) {
                sf0 sf0Var = sf0VarG;
                if (z10) {
                    sf0Var.h();
                } else {
                    sf0Var.f(new w22(1, "Image Web View failed to load."));
                }
            }
        });
        nk0VarA.Y0(str, str2, null);
        return sf0VarG;
    }

    final /* synthetic */ ab3 c(String str, Object obj) throws zk0 {
        j3.t.B();
        nk0 nk0VarA = al0.a(this.f15220a, em0.a(), "native-omid", false, false, this.f15222c, null, this.f15223d, null, null, this.f15224e, this.f15225f, null, null);
        final sf0 sf0VarG = sf0.g(nk0VarA);
        nk0VarA.G().c0(new am0() { // from class: com.google.android.gms.internal.ads.ig1
            @Override // com.google.android.gms.internal.ads.am0
            public final void a(boolean z10) {
                sf0VarG.h();
            }
        });
        if (((Boolean) k3.w.c().b(ir.J4)).booleanValue()) {
            nk0VarA.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            nk0VarA.loadData(str, "text/html", "UTF-8");
        }
        return sf0VarG;
    }

    public final ab3 d(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return qa3.h(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return m(jSONObjectOptJSONObject.optBoolean("require"), qa3.l(o(jSONArrayOptJSONArray, false, true), new w23() { // from class: com.google.android.gms.internal.ads.jg1
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                return this.f10473a.a(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.f15226g), null);
    }

    public final ab3 e(JSONObject jSONObject, String str) {
        return n(jSONObject.optJSONObject(str), this.f15227h.f7971n);
    }

    public final ab3 f(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        eu euVar = this.f15227h;
        return o(jSONArrayOptJSONArray, euVar.f7971n, euVar.f7973p);
    }

    public final ab3 g(JSONObject jSONObject, String str, final hn2 hn2Var, final ln2 ln2Var) {
        if (!((Boolean) k3.w.c().b(ir.X8)).booleanValue()) {
            return qa3.h(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return qa3.h(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return qa3.h(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final k3.h4 h4VarK = k(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return qa3.h(null);
        }
        final ab3 ab3VarM = qa3.m(qa3.h(null), new w93() { // from class: com.google.android.gms.internal.ads.kg1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f11026a.b(h4VarK, hn2Var, ln2Var, strOptString, strOptString2, obj);
            }
        }, of0.f13190e);
        return qa3.m(ab3VarM, new w93() { // from class: com.google.android.gms.internal.ads.lg1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) throws w22 {
                ab3 ab3Var = ab3VarM;
                if (((nk0) obj) != null) {
                    return ab3Var;
                }
                throw new w22(1, "Retrieve Web View from image ad response failed.");
            }
        }, of0.f13191f);
    }

    public final ab3 h(JSONObject jSONObject, hn2 hn2Var, ln2 ln2Var) {
        ab3 ab3VarA;
        JSONObject jSONObjectG = m3.w0.g(jSONObject, "html_containers", "instream");
        if (jSONObjectG != null) {
            return p(jSONObjectG, hn2Var, ln2Var);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject != null) {
            String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
            boolean z10 = false;
            if (((Boolean) k3.w.c().b(ir.W8)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
                z10 = true;
            }
            if (!TextUtils.isEmpty(strOptString)) {
                if (!z10) {
                    ab3VarA = this.f15228i.a(jSONObjectOptJSONObject);
                }
                return l(qa3.n(ab3VarA, ((Integer) k3.w.c().b(ir.f10091t3)).intValue(), TimeUnit.SECONDS, this.f15230k), null);
            }
            if (!z10) {
                ze0.g("Required field 'vast_xml' or 'html' is missing");
            }
            ab3VarA = p(jSONObjectOptJSONObject, hn2Var, ln2Var);
            return l(qa3.n(ab3VarA, ((Integer) k3.w.c().b(ir.f10091t3)).intValue(), TimeUnit.SECONDS, this.f15230k), null);
        }
        return qa3.h(null);
    }
}
