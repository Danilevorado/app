package com.onesignal;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    private String f21706a;

    /* renamed from: b, reason: collision with root package name */
    private String f21707b;

    /* renamed from: c, reason: collision with root package name */
    private a f21708c;

    /* renamed from: d, reason: collision with root package name */
    private String f21709d;

    /* renamed from: e, reason: collision with root package name */
    private String f21710e;

    /* renamed from: f, reason: collision with root package name */
    private List f21711f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private List f21712g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private p1 f21713h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21714i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f21715j;

    public enum a {
        IN_APP_WEBVIEW("webview"),
        BROWSER("browser"),
        REPLACE_CONTENT("replacement");


        /* renamed from: m, reason: collision with root package name */
        private String f21720m;

        a(String str) {
            this.f21720m = str;
        }

        public static a b(String str) {
            for (a aVar : values()) {
                if (aVar.f21720m.equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
            return null;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f21720m;
        }
    }

    b1(JSONObject jSONObject) throws JSONException {
        this.f21706a = jSONObject.optString("id", null);
        this.f21707b = jSONObject.optString("name", null);
        this.f21709d = jSONObject.optString("url", null);
        this.f21710e = jSONObject.optString("pageId", null);
        a aVarB = a.b(jSONObject.optString("url_target", null));
        this.f21708c = aVarB;
        if (aVarB == null) {
            this.f21708c = a.IN_APP_WEBVIEW;
        }
        this.f21715j = jSONObject.optBoolean("close", true);
        if (jSONObject.has("outcomes")) {
            h(jSONObject);
        }
        if (jSONObject.has("tags")) {
            this.f21713h = new p1(jSONObject.getJSONObject("tags"));
        }
        if (jSONObject.has("prompts")) {
            i(jSONObject);
        }
    }

    private void h(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("outcomes");
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            this.f21711f.add(new h1((JSONObject) jSONArray.get(i10)));
        }
    }

    private void i(JSONObject jSONObject) throws JSONException {
        List list;
        k1 m1Var;
        JSONArray jSONArray = jSONObject.getJSONArray("prompts");
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            string.hashCode();
            if (string.equals("push")) {
                list = this.f21712g;
                m1Var = new m1();
            } else if (string.equals("location")) {
                list = this.f21712g;
                m1Var = new g1();
            }
            list.add(m1Var);
        }
    }

    String a() {
        return this.f21706a;
    }

    public String b() {
        return this.f21709d;
    }

    public List c() {
        return this.f21711f;
    }

    public List d() {
        return this.f21712g;
    }

    public p1 e() {
        return this.f21713h;
    }

    public a f() {
        return this.f21708c;
    }

    public boolean g() {
        return this.f21714i;
    }

    void j(boolean z10) {
        this.f21714i = z10;
    }
}
