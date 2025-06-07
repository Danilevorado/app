package n9;

import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class p extends a {

    /* renamed from: a, reason: collision with root package name */
    private final String f25653a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25654b;

    p(String str, String str2) {
        this.f25653a = str;
        this.f25654b = str2;
    }

    @Override // n9.a, b9.d
    protected void d(JSONObject jSONObject) throws JSONException, SecurityException, IOException {
        super.d(jSONObject);
        jSONObject.put("push_token", this.f25653a);
        if (!TextUtils.isEmpty(this.f25654b)) {
            jSONObject.put("tags", new JSONObject(this.f25654b));
        }
        ArrayList arrayListE = g9.a.e();
        if (arrayListE != null) {
            jSONObject.put("sounds", new JSONArray((Collection) arrayListE));
        }
    }

    @Override // n9.a, b9.d
    public String g() {
        return "registerDevice";
    }

    @Override // n9.a, b9.d
    public boolean j() {
        return false;
    }
}
