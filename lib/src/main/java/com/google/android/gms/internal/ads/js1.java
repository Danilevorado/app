package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class js1 {

    /* renamed from: a, reason: collision with root package name */
    private final km0 f10683a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f10684b;

    /* renamed from: c, reason: collision with root package name */
    private final ff0 f10685c;

    /* renamed from: d, reason: collision with root package name */
    private final do2 f10686d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f10687e;

    /* renamed from: f, reason: collision with root package name */
    private final String f10688f;

    /* renamed from: g, reason: collision with root package name */
    private final au2 f10689g;

    /* renamed from: h, reason: collision with root package name */
    private final ro2 f10690h;

    /* renamed from: i, reason: collision with root package name */
    private final sm1 f10691i;

    public js1(km0 km0Var, Context context, ff0 ff0Var, do2 do2Var, Executor executor, String str, au2 au2Var, sm1 sm1Var) {
        this.f10683a = km0Var;
        this.f10684b = context;
        this.f10685c = ff0Var;
        this.f10686d = do2Var;
        this.f10687e = executor;
        this.f10688f = str;
        this.f10689g = au2Var;
        this.f10690h = km0Var.y();
        this.f10691i = sm1Var;
    }

    private final ab3 c(final String str, final String str2) {
        ot2 ot2VarA = nt2.a(this.f10684b, 11);
        ot2VarA.g();
        n20 n20VarA = j3.t.h().a(this.f10684b, this.f10685c, this.f10683a.B());
        h20 h20Var = k20.f10786b;
        final d20 d20VarA = n20VarA.a("google.afma.response.normalize", h20Var, h20Var);
        ab3 ab3VarM = qa3.m(qa3.m(qa3.m(qa3.h(""), new w93() { // from class: com.google.android.gms.internal.ads.gs1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) throws JSONException {
                String str3 = str;
                String str4 = str2;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return qa3.h(jSONObject);
                } catch (JSONException e5) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e5.getCause())));
                }
            }
        }, this.f10687e), new w93() { // from class: com.google.android.gms.internal.ads.hs1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return d20VarA.b((JSONObject) obj);
            }
        }, this.f10687e), new w93() { // from class: com.google.android.gms.internal.ads.is1
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj) {
                return this.f10171a.b((JSONObject) obj);
            }
        }, this.f10687e);
        zt2.a(ab3VarM, this.f10689g, ot2VarA);
        return ab3VarM;
    }

    private final String d(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f10688f));
            }
            return jSONObject.toString();
        } catch (JSONException e5) {
            ze0.g("Failed to update the ad types for rendering. ".concat(e5.toString()));
            return str;
        }
    }

    private static final String e(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final ab3 a() throws JSONException, UnsupportedEncodingException {
        String strB = this.f10686d.f7445d.J;
        if (!TextUtils.isEmpty(strB)) {
            if (((Boolean) k3.w.c().b(ir.E6)).booleanValue()) {
                String strE = e(strB);
                zq zqVar = ir.Q6;
                if (((Boolean) k3.w.c().b(zqVar)).booleanValue() && strE.isEmpty()) {
                    int iLastIndexOf = strB.lastIndexOf("&request_id=");
                    strE = iLastIndexOf != -1 ? strB.substring(iLastIndexOf + 12) : "";
                }
                if (TextUtils.isEmpty(strE)) {
                    return qa3.g(new w22(15, "Invalid ad string."));
                }
                String strB2 = this.f10683a.q().b(strE, this.f10691i);
                if (((Boolean) k3.w.c().b(zqVar)).booleanValue()) {
                    sm1 sm1Var = this.f10691i;
                    if (!TextUtils.isEmpty(strB2)) {
                        Boolean bool = new JSONObject(strB2).optString("is_gbid").equals("true") ? Boolean.TRUE : Boolean.FALSE;
                        if (bool.booleanValue()) {
                            int iLastIndexOf2 = strB.lastIndexOf("&");
                            String string = null;
                            String strSubstring = iLastIndexOf2 != -1 ? strB.substring(0, iLastIndexOf2) : null;
                            if (!TextUtils.isEmpty(strSubstring)) {
                                try {
                                    byte[] bArrDecode = Base64.decode(strSubstring, 11);
                                    byte[] bytes = strE.getBytes("UTF-8");
                                    try {
                                        string = new JSONObject(strB2).getString("arek");
                                    } catch (JSONException e5) {
                                        m3.n1.k("Failed to get key from QueryJSONMap".concat(e5.toString()));
                                        j3.t.q().u(e5, "CryptoUtils.getKeyFromQueryJsonMap");
                                    }
                                    strB = ro2.b(bArrDecode, bytes, string, sm1Var);
                                } catch (UnsupportedEncodingException e10) {
                                    m3.n1.k("Failed to decode the adResponse. ".concat(e10.toString()));
                                    j3.t.q().u(e10, "PreloadedLoader.decryptAdResponseIfNecessary");
                                }
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strB2)) {
                    return c(strB, d(strB2));
                }
            }
        }
        k3.w0 w0Var = this.f10686d.f7445d.E;
        if (w0Var != null) {
            if (((Boolean) k3.w.c().b(ir.C6)).booleanValue()) {
                String strE2 = e(w0Var.f24786m);
                String strE3 = e(w0Var.f24787n);
                if (TextUtils.isEmpty(strE3) || !strE2.equals(strE3)) {
                    this.f10691i.a().put("ridmm", "true");
                } else {
                    this.f10683a.q().f(strE2);
                    this.f10691i.a().put("rid", strE2);
                }
            }
            return c(w0Var.f24786m, d(w0Var.f24787n));
        }
        return qa3.g(new w22(14, "Mismatch request IDs."));
    }

    final /* synthetic */ ab3 b(JSONObject jSONObject) {
        return qa3.h(new un2(new rn2(this.f10686d), tn2.a(new StringReader(jSONObject.toString()))));
    }
}
