package com.onesignal;

import com.onesignal.f0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class h4 {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f22054d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f22055e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f22056f;

    /* renamed from: a, reason: collision with root package name */
    private String f22057a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f22058b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f22059c;

    static {
        String[] strArr = {"lat", "long", "loc_acc", "loc_type", "loc_bg", "loc_time_stamp"};
        f22055e = strArr;
        f22056f = new HashSet(Arrays.asList(strArr));
    }

    h4(String str, boolean z10) throws JSONException {
        this.f22057a = str;
        if (z10) {
            n();
        } else {
            this.f22058b = new JSONObject();
            this.f22059c = new JSONObject();
        }
    }

    private static JSONObject e(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set set) {
        JSONObject jSONObjectB;
        synchronized (f22054d) {
            jSONObjectB = e0.b(jSONObject, jSONObject2, jSONObject3, set);
        }
        return jSONObjectB;
    }

    private Set k(h4 h4Var) {
        try {
            if (this.f22058b.optLong("loc_time_stamp") == h4Var.f22058b.getLong("loc_time_stamp")) {
                return null;
            }
            HashMap map = new HashMap();
            map.put("loc_bg", h4Var.f22058b.opt("loc_bg"));
            map.put("loc_time_stamp", h4Var.f22058b.opt("loc_time_stamp"));
            u(h4Var.f22059c, map);
            return f22056f;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void n() throws JSONException {
        boolean z10;
        String str = n3.f22119a;
        String strF = n3.f(str, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.f22057a, null);
        if (strF == null) {
            x(new JSONObject());
            try {
                int i10 = 1;
                int iC = n3.c(str, this.f22057a.equals("CURRENT_STATE") ? "ONESIGNAL_SUBSCRIPTION" : "ONESIGNAL_SYNCED_SUBSCRIPTION", 1);
                if (iC == -2) {
                    z10 = false;
                } else {
                    i10 = iC;
                    z10 = true;
                }
                HashMap map = new HashMap();
                map.put("subscribableStatus", Integer.valueOf(i10));
                map.put("userSubscribePref", Boolean.valueOf(z10));
                u(this.f22058b, map);
            } catch (JSONException unused) {
            }
        } else {
            try {
                x(new JSONObject(strF));
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
        String str2 = n3.f22119a;
        String strF2 = n3.f(str2, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.f22057a, null);
        JSONObject jSONObject = new JSONObject();
        try {
            if (strF2 == null) {
                jSONObject.put("identifier", n3.f(str2, "GT_REGISTRATION_ID", null));
            } else {
                jSONObject = new JSONObject(strF2);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        z(jSONObject);
    }

    private void u(JSONObject jSONObject, HashMap map) {
        synchronized (f22054d) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    protected abstract void a();

    void b() {
        try {
            HashMap map = new HashMap();
            map.put("lat", null);
            map.put("long", null);
            map.put("loc_acc", null);
            map.put("loc_type", null);
            map.put("loc_bg", null);
            map.put("loc_time_stamp", null);
            u(this.f22059c, map);
            HashMap map2 = new HashMap();
            map2.put("loc_bg", null);
            map2.put("loc_time_stamp", null);
            u(this.f22058b, map2);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    h4 c(String str) {
        h4 h4VarP = p(str);
        try {
            h4VarP.f22058b = j();
            h4VarP.f22059c = m();
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return h4VarP;
    }

    JSONObject d(h4 h4Var, boolean z10) throws JSONException {
        a();
        h4Var.a();
        JSONObject jSONObjectE = e(this.f22059c, h4Var.f22059c, null, k(h4Var));
        if (!z10 && jSONObjectE.toString().equals("{}")) {
            return null;
        }
        try {
            if (!jSONObjectE.has("app_id")) {
                jSONObjectE.put("app_id", this.f22059c.optString("app_id"));
            }
            if (this.f22059c.has("email_auth_hash")) {
                jSONObjectE.put("email_auth_hash", this.f22059c.optString("email_auth_hash"));
            }
            if (this.f22059c.has("sms_auth_hash")) {
                jSONObjectE.put("sms_auth_hash", this.f22059c.optString("sms_auth_hash"));
            }
            if (this.f22059c.has("external_user_id_auth_hash") && !jSONObjectE.has("external_user_id_auth_hash")) {
                jSONObjectE.put("external_user_id_auth_hash", this.f22059c.optString("external_user_id_auth_hash"));
            }
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObjectE;
    }

    JSONObject f(h4 h4Var, Set set) {
        JSONObject jSONObjectB;
        synchronized (f22054d) {
            jSONObjectB = e0.b(this.f22058b, h4Var.f22058b, null, set);
        }
        return jSONObjectB;
    }

    JSONObject g(JSONObject jSONObject, Set set) {
        JSONObject jSONObjectB;
        synchronized (f22054d) {
            JSONObject jSONObject2 = this.f22058b;
            jSONObjectB = e0.b(jSONObject2, jSONObject, jSONObject2, set);
        }
        return jSONObjectB;
    }

    JSONObject h(JSONObject jSONObject, Set set) {
        JSONObject jSONObjectB;
        synchronized (f22054d) {
            JSONObject jSONObject2 = this.f22059c;
            jSONObjectB = e0.b(jSONObject2, jSONObject, jSONObject2, set);
        }
        return jSONObjectB;
    }

    public b0 i() {
        try {
            return new b0(j());
        } catch (JSONException e5) {
            e5.printStackTrace();
            return new b0();
        }
    }

    JSONObject j() {
        JSONObject jSONObject;
        synchronized (f22054d) {
            jSONObject = new JSONObject(this.f22058b.toString());
        }
        return jSONObject;
    }

    public b0 l() {
        try {
            return new b0(m());
        } catch (JSONException e5) {
            e5.printStackTrace();
            return new b0();
        }
    }

    public JSONObject m() {
        JSONObject jSONObject;
        synchronized (f22054d) {
            jSONObject = new JSONObject(this.f22059c.toString());
        }
        return jSONObject;
    }

    void o(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3;
        if (jSONObject.has("tags")) {
            try {
                JSONObject jSONObjectM = m();
                if (jSONObjectM.has("tags")) {
                    try {
                        jSONObject3 = new JSONObject(jSONObjectM.optString("tags"));
                    } catch (JSONException unused) {
                        jSONObject3 = new JSONObject();
                    }
                } else {
                    jSONObject3 = new JSONObject();
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tags");
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if ("".equals(jSONObjectOptJSONObject.optString(next))) {
                        jSONObject3.remove(next);
                    } else if (jSONObject2 == null || !jSONObject2.has(next)) {
                        jSONObject3.put(next, jSONObjectOptJSONObject.optString(next));
                    }
                }
                synchronized (f22054d) {
                    if (jSONObject3.toString().equals("{}")) {
                        this.f22059c.remove("tags");
                    } else {
                        this.f22059c.put("tags", jSONObject3);
                    }
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
    }

    abstract h4 p(String str);

    void q() {
        synchronized (f22054d) {
            try {
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            if (!this.f22059c.has("external_user_id_auth_hash") || (!(this.f22059c.has("external_user_id") && this.f22059c.get("external_user_id").toString() == "") && this.f22059c.has("external_user_id"))) {
                String str = n3.f22119a;
                n3.m(str, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.f22057a, this.f22059c.toString());
                n3.m(str, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.f22057a, this.f22058b.toString());
            } else {
                this.f22059c.remove("external_user_id_auth_hash");
                String str2 = n3.f22119a;
                n3.m(str2, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.f22057a, this.f22059c.toString());
                n3.m(str2, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.f22057a, this.f22058b.toString());
            }
        }
    }

    void r(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject != null) {
            JSONObject jSONObject3 = this.f22058b;
            e(jSONObject3, jSONObject, jSONObject3, null);
        }
        if (jSONObject2 != null) {
            JSONObject jSONObject4 = this.f22059c;
            e(jSONObject4, jSONObject2, jSONObject4, null);
            o(jSONObject2, null);
        }
        if (jSONObject == null && jSONObject2 == null) {
            return;
        }
        q();
    }

    void s(String str, Object obj) {
        synchronized (f22054d) {
            this.f22058b.put(str, obj);
        }
    }

    void t(String str, Object obj) {
        synchronized (f22054d) {
            this.f22059c.put(str, obj);
        }
    }

    public String toString() {
        return "UserState{persistKey='" + this.f22057a + "', dependValues=" + this.f22058b + ", syncValues=" + this.f22059c + '}';
    }

    void v(String str) {
        synchronized (f22054d) {
            this.f22058b.remove(str);
        }
    }

    void w(String str) {
        synchronized (f22054d) {
            this.f22059c.remove(str);
        }
    }

    public void x(JSONObject jSONObject) {
        synchronized (f22054d) {
            this.f22058b = jSONObject;
        }
    }

    void y(f0.d dVar) {
        try {
            HashMap map = new HashMap();
            map.put("lat", dVar.f21985a);
            map.put("long", dVar.f21986b);
            map.put("loc_acc", dVar.f21987c);
            map.put("loc_type", dVar.f21988d);
            u(this.f22059c, map);
            HashMap map2 = new HashMap();
            map2.put("loc_bg", dVar.f21989e);
            map2.put("loc_time_stamp", dVar.f21990f);
            u(this.f22058b, map2);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    public void z(JSONObject jSONObject) {
        synchronized (f22054d) {
            this.f22059c = jSONObject;
        }
    }
}
