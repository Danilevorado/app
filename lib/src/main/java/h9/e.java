package h9;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f24111a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24112b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f24113c;

    public e(SharedPreferences sharedPreferences, String str) {
        this.f24112b = str;
        this.f24111a = sharedPreferences;
        String string = null;
        if (sharedPreferences != null) {
            try {
                string = sharedPreferences.getString(str, null);
            } catch (Exception e5) {
                k9.h.o(e5);
                return;
            }
        }
        if (string != null) {
            this.f24113c = new JSONObject(string);
        }
    }

    private JSONObject a(JSONObject jSONObject) {
        try {
            JSONArray jSONArrayNames = jSONObject.names();
            if (jSONArrayNames == null) {
                return new JSONObject();
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
                arrayList.add(jSONArrayNames.getString(i10));
            }
            return new JSONObject(jSONObject, (String[]) arrayList.toArray(new String[0]));
        } catch (JSONException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public JSONObject b() {
        return this.f24113c;
    }

    public void c(JSONObject jSONObject) {
        JSONObject jSONObject2 = this.f24113c;
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        k9.b.o(jSONObject, jSONObject2);
        d(jSONObject2);
    }

    public void d(JSONObject jSONObject) {
        JSONObject jSONObjectA;
        SharedPreferences sharedPreferences = this.f24111a;
        if (sharedPreferences == null) {
            k9.h.k("Incorrect state of the app preferences is null");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String string = null;
        if (jSONObject != null) {
            jSONObjectA = a(jSONObject);
            if (jSONObjectA != null) {
                string = jSONObjectA.toString();
            }
        } else {
            jSONObjectA = null;
        }
        editorEdit.putString(this.f24112b, string);
        editorEdit.apply();
        this.f24113c = jSONObjectA;
    }
}
