package k7;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rb.f;
import rb.h;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private JSONArray f24861a;

    /* renamed from: b, reason: collision with root package name */
    private JSONArray f24862b;

    public e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public e(JSONArray jSONArray, JSONArray jSONArray2) {
        this.f24861a = jSONArray;
        this.f24862b = jSONArray2;
    }

    public /* synthetic */ e(JSONArray jSONArray, JSONArray jSONArray2, int i10, f fVar) {
        this((i10 & 1) != 0 ? new JSONArray() : jSONArray, (i10 & 2) != 0 ? new JSONArray() : jSONArray2);
    }

    public final JSONArray a() {
        return this.f24862b;
    }

    public final JSONArray b() {
        return this.f24861a;
    }

    public final void c(JSONArray jSONArray) {
        this.f24862b = jSONArray;
    }

    public final void d(JSONArray jSONArray) {
        this.f24861a = jSONArray;
    }

    public final JSONObject e() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("notification_ids", this.f24861a).put("in_app_message_ids", this.f24862b);
        h.d(jSONObjectPut, "JSONObject()\n        .pu…AM_IDS, inAppMessagesIds)");
        return jSONObjectPut;
    }

    public String toString() {
        return "OSOutcomeSourceBody{notificationIds=" + this.f24861a + ", inAppMessagesIds=" + this.f24862b + '}';
    }
}
