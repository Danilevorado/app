package m3;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.google.android.gms.internal.ads.nn2;
import com.google.android.gms.internal.ads.ze0;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f25335a = new u0();

    public static Bundle a(JSONObject jSONObject) {
        String strValueOf;
        String str;
        String strConcat;
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof Double) {
                    bundle.putDouble(next, ((Double) objOpt).doubleValue());
                } else if (objOpt instanceof Integer) {
                    bundle.putInt(next, ((Integer) objOpt).intValue());
                } else if (objOpt instanceof Long) {
                    bundle.putLong(next, ((Long) objOpt).longValue());
                } else if (objOpt instanceof String) {
                    bundle.putString(next, (String) objOpt);
                } else {
                    if (objOpt instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (jSONArray.length() != 0) {
                            int length = jSONArray.length();
                            int i10 = 0;
                            Object objOpt2 = null;
                            for (int i11 = 0; objOpt2 == null && i11 < length; i11++) {
                                objOpt2 = !jSONArray.isNull(i11) ? jSONArray.opt(i11) : null;
                            }
                            if (objOpt2 == null) {
                                strValueOf = String.valueOf(next);
                                str = "Expected JSONArray with at least 1 non-null element for key:";
                                strConcat = str.concat(strValueOf);
                            } else if (objOpt2 instanceof JSONObject) {
                                Bundle[] bundleArr = new Bundle[length];
                                while (i10 < length) {
                                    bundleArr[i10] = !jSONArray.isNull(i10) ? a(jSONArray.optJSONObject(i10)) : null;
                                    i10++;
                                }
                                bundle.putParcelableArray(next, bundleArr);
                            } else if (objOpt2 instanceof Number) {
                                double[] dArr = new double[jSONArray.length()];
                                while (i10 < length) {
                                    dArr[i10] = jSONArray.optDouble(i10);
                                    i10++;
                                }
                                bundle.putDoubleArray(next, dArr);
                            } else if (objOpt2 instanceof CharSequence) {
                                String[] strArr = new String[length];
                                while (i10 < length) {
                                    strArr[i10] = !jSONArray.isNull(i10) ? jSONArray.optString(i10) : null;
                                    i10++;
                                }
                                bundle.putStringArray(next, strArr);
                            } else if (objOpt2 instanceof Boolean) {
                                boolean[] zArr = new boolean[length];
                                while (i10 < length) {
                                    zArr[i10] = jSONArray.optBoolean(i10);
                                    i10++;
                                }
                                bundle.putBooleanArray(next, zArr);
                            } else {
                                strConcat = String.format("JSONArray with unsupported type %s for key:%s", objOpt2.getClass().getCanonicalName(), next);
                            }
                        }
                    } else if (objOpt instanceof JSONObject) {
                        bundle.putBundle(next, a((JSONObject) objOpt));
                    } else {
                        strValueOf = String.valueOf(next);
                        str = "Unsupported type for key:";
                        strConcat = str.concat(strValueOf);
                    }
                    ze0.g(strConcat);
                }
            }
        }
        return bundle;
    }

    public static String b(String str, JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectM = m(jSONObject, strArr);
        return jSONObjectM == null ? "" : jSONObjectM.optString(strArr[0], "");
    }

    public static List c(JSONArray jSONArray, List list) {
        if (list == null) {
            list = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                list.add(jSONArray.getString(i10));
            }
        }
        return list;
    }

    public static List d(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static JSONArray e(JsonReader jsonReader) throws JSONException, IOException {
        Object objE;
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                objE = e(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                objE = h(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                objE = jsonReader.nextString();
            }
            jSONArray.put(objE);
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static JSONObject f(JSONObject jSONObject, String str) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static JSONObject g(JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectM = m(jSONObject, strArr);
        if (jSONObjectM == null) {
            return null;
        }
        return jSONObjectM.optJSONObject(strArr[1]);
    }

    public static JSONObject h(JsonReader jsonReader) {
        Object objE;
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                objE = e(jsonReader);
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                objE = h(jsonReader);
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                objE = jsonReader.nextString();
            }
            jSONObject.put(strNextName, objE);
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static void i(JsonWriter jsonWriter, JSONArray jSONArray) throws JSONException, IOException {
        try {
            jsonWriter.beginArray();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object obj = jSONArray.get(i10);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    j(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    i(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e5) {
            throw new IOException(e5);
        }
    }

    public static void j(JsonWriter jsonWriter, JSONObject jSONObject) throws JSONException, IOException {
        try {
            jsonWriter.beginObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    j(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + String.valueOf(obj));
                    }
                    i(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e5) {
            throw new IOException(e5);
        }
    }

    public static boolean k(boolean z10, JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectM = m(jSONObject, strArr);
        if (jSONObjectM == null) {
            return false;
        }
        return jSONObjectM.optBoolean(strArr[strArr.length - 1], false);
    }

    public static String l(nn2 nn2Var) throws JSONException, IOException {
        if (nn2Var == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            n(jsonWriter, nn2Var);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e5) {
            ze0.e("Error when writing JSON.", e5);
            return null;
        }
    }

    private static JSONObject m(JSONObject jSONObject, String[] strArr) {
        for (int i10 = 0; i10 < strArr.length - 1; i10++) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[i10]);
        }
        return jSONObject;
    }

    private static void n(JsonWriter jsonWriter, Object obj) throws JSONException, IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof nn2) {
            j(jsonWriter, ((nn2) obj).f12721d);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                n(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                n(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }
}
