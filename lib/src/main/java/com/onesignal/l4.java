package com.onesignal;

import com.onesignal.e3;
import com.onesignal.p3;
import com.onesignal.p4;
import com.onesignal.s3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class l4 extends p4 {

    /* renamed from: m, reason: collision with root package name */
    private static boolean f22106m;

    class a extends p3.g {
        a() {
        }

        @Override // com.onesignal.p3.g
        void b(String str) {
            boolean unused = l4.f22106m = true;
            if (str == null || str.isEmpty()) {
                str = "{}";
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("tags")) {
                    synchronized (l4.this.f22231a) {
                        l4 l4Var = l4.this;
                        JSONObject jSONObjectY = l4Var.y(l4Var.A().l().e("tags"), l4.this.G().l().e("tags"), null, null);
                        l4.this.A().t("tags", jSONObject.optJSONObject("tags"));
                        l4.this.A().q();
                        l4.this.G().o(jSONObject, jSONObjectY);
                        l4.this.G().q();
                    }
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
    }

    l4() {
        super(s3.c.PUSH);
    }

    @Override // com.onesignal.p4
    protected String B() {
        return e3.E0();
    }

    @Override // com.onesignal.p4
    protected e3.z C() {
        return e3.z.ERROR;
    }

    @Override // com.onesignal.p4
    protected h4 O(String str, boolean z10) {
        return new k4(str, z10);
    }

    @Override // com.onesignal.p4
    protected void P(JSONObject jSONObject) {
    }

    @Override // com.onesignal.p4
    protected void U() {
        D(0).c();
    }

    @Override // com.onesignal.p4
    void d0(String str) {
        e3.Y1(str);
    }

    public String g0() {
        return G().i().g("language", null);
    }

    p4.e h0(boolean z10) throws InterruptedException {
        p4.e eVar;
        if (z10) {
            p3.f("players/" + e3.E0() + "?app_id=" + e3.t0(), new a(), "CACHE_KEY_GET_TAGS");
        }
        synchronized (this.f22231a) {
            eVar = new p4.e(f22106m, e0.c(G().l(), "tags"));
        }
        return eVar;
    }

    public boolean i0() {
        return G().i().c("userSubscribePref", true);
    }

    void j0(String str) {
        e3.A1(str);
    }

    public void k0(boolean z10) {
        try {
            H().s("androidPermission", Boolean.valueOf(z10));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    void l0(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("identifier", jSONObject.optString("identifier", null));
            if (jSONObject.has("device_type")) {
                jSONObject2.put("device_type", jSONObject.optInt("device_type"));
            }
            jSONObject2.putOpt("parent_player_id", jSONObject.optString("parent_player_id", null));
            H().h(jSONObject2, null);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("subscribableStatus")) {
                jSONObject3.put("subscribableStatus", jSONObject.optInt("subscribableStatus"));
            }
            if (jSONObject.has("androidPermission")) {
                jSONObject3.put("androidPermission", jSONObject.optBoolean("androidPermission"));
            }
            H().g(jSONObject3, null);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.onesignal.p4
    protected void n(JSONObject jSONObject) {
    }

    @Override // com.onesignal.p4
    protected void w(JSONObject jSONObject) {
        if (jSONObject.has("email")) {
            e3.J();
        }
        if (jSONObject.has("sms_number")) {
            e3.N();
        }
    }
}
