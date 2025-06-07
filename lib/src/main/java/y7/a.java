package y7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k9.h;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private s9.c f28572a;

    public a(s9.c cVar) {
        this.f28572a = cVar;
    }

    private Map b(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        h.h("[InApp]InAppConfig", "Localization : {");
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string = jSONObject.getString(next);
            map.put(next, string);
            h.h("[InApp]InAppConfig", "  \"" + next + "\" : \"" + string + "\"");
        }
        h.h("[InApp]InAppConfig", "}");
        return map;
    }

    public Map a(String str) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject(z7.e.h(this.f28572a.c(str)));
        JSONObject jSONObject3 = jSONObject2.getJSONObject("localization");
        String string = jSONObject2.getString("default_language");
        h.h("[InApp]InAppConfig", "default language : " + string);
        try {
            jSONObject = jSONObject3.getJSONObject(ka.e.f().m().a());
        } catch (JSONException unused) {
            h.x("[InApp]InAppConfig", "Preferred language not found, fall back to default");
            jSONObject = jSONObject3.getJSONObject(string);
        }
        return b(jSONObject);
    }
}
