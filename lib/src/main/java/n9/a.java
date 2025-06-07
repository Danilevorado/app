package n9;

import android.os.Build;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class a extends b9.d {
    a() {
    }

    @Override // b9.d
    protected void d(JSONObject jSONObject) throws JSONException {
        jSONObject.put("language", ka.e.f().m().a());
        jSONObject.put("timezone", TimeUnit.SECONDS.convert(TimeZone.getDefault().getOffset(new Date().getTime()), TimeUnit.MILLISECONDS));
        jSONObject.put("android_package", c9.a.a().d());
        if (ka.e.d().f().a()) {
            jSONObject.put("device_model", w7.a.a());
            jSONObject.put("device_name", w7.a.h() ? "Tablet" : "Phone");
        }
        if (ka.e.d().g().a()) {
            jSONObject.put("os_version", Build.VERSION.RELEASE);
        }
        String strF = c9.a.a().f();
        if (strF != null) {
            jSONObject.put("app_version", strF);
        }
        o7.a aVarF = c9.a.d().f();
        if (aVarF != null) {
            jSONObject.put("notificationTypes", aVarF.b());
        }
    }

    @Override // b9.d
    public String g() {
        return "applicationOpen";
    }

    @Override // b9.d
    public boolean j() {
        return false;
    }

    @Override // b9.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Void i(JSONObject jSONObject) {
        b8.n.h(jSONObject.optJSONObject("required_inapps"));
        return (Void) super.i(jSONObject);
    }
}
