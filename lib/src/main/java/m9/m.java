package m9;

import com.facebook.ads.AdError;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class m extends b9.d {

    /* renamed from: a, reason: collision with root package name */
    private String f25389a;

    /* renamed from: b, reason: collision with root package name */
    private String f25390b;

    /* renamed from: c, reason: collision with root package name */
    private String f25391c;

    public m(String str, String str2, String str3) {
        this.f25389a = str;
        this.f25390b = str2;
        this.f25391c = str3;
    }

    @Override // b9.d
    protected void d(JSONObject jSONObject) throws JSONException {
        jSONObject.put("action", "show");
        jSONObject.put("code", this.f25389a.startsWith("r-") ? "" : this.f25389a);
        String str = this.f25390b;
        if (str != null) {
            jSONObject.put("messageHash", str);
        }
        if (this.f25391c.startsWith("r-")) {
            jSONObject.put("richMediaCode", this.f25391c.substring(2));
        }
        int rawOffset = Calendar.getInstance().getTimeZone().getRawOffset() / AdError.NETWORK_ERROR_CODE;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        jSONObject.put("timestampUTC", jCurrentTimeMillis);
        jSONObject.put("timestampCurrent", rawOffset + jCurrentTimeMillis);
    }

    @Override // b9.d
    public String g() {
        return "triggerInAppAction";
    }

    @Override // b9.d
    public boolean j() {
        return false;
    }
}
