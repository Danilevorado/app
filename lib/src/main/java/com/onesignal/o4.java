package com.onesignal;

import com.onesignal.e3;
import com.onesignal.s3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class o4 extends p4 {
    o4(s3.c cVar) {
        super(cVar);
    }

    @Override // com.onesignal.p4
    protected abstract String B();

    @Override // com.onesignal.p4
    protected e3.z C() {
        return e3.z.INFO;
    }

    @Override // com.onesignal.p4
    protected void P(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("identifier")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(i0(), jSONObject.get("identifier"));
                if (jSONObject.has(h0())) {
                    jSONObject2.put(h0(), jSONObject.get(h0()));
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            g0(jSONObject2);
        }
    }

    @Override // com.onesignal.p4
    protected void U() {
        if ((B() == null && E() == null) || e3.E0() == null) {
            return;
        }
        D(0).c();
    }

    abstract void f0();

    abstract void g0(JSONObject jSONObject);

    protected abstract String h0();

    protected abstract String i0();

    protected abstract int j0();

    void k0() {
        U();
    }

    @Override // com.onesignal.p4
    protected void n(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("device_type", j0());
            jSONObject.putOpt("device_player_id", e3.E0());
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.onesignal.p4
    protected void w(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            f0();
        }
    }
}
