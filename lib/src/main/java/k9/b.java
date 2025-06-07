package k9;

import android.os.Bundle;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class b {
    private static Bundle a(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle.putString(str, (String) value);
            } else if (value instanceof Integer) {
                bundle.putInt(str, ((Integer) value).intValue());
            } else if (value instanceof Float) {
                bundle.putFloat(str, ((Float) value).floatValue());
            } else if (value instanceof Double) {
                bundle.putDouble(str, ((Double) value).doubleValue());
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Byte) {
                bundle.putByte(str, ((Byte) value).byteValue());
            } else if (value instanceof Long) {
                bundle.putLong(str, ((Long) value).longValue());
            } else if (value instanceof Character) {
                bundle.putChar(str, ((Character) value).charValue());
            } else if (value instanceof char[]) {
                bundle.putCharArray(str, (char[]) value);
            } else if (value instanceof float[]) {
                bundle.putFloatArray(str, (float[]) value);
            } else if (value instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) value);
            } else if (value instanceof int[]) {
                bundle.putIntArray(str, (int[]) value);
            } else if (value instanceof long[]) {
                bundle.putLongArray(str, (long[]) value);
            } else if (value instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) value);
            } else {
                if (!(value instanceof Map)) {
                    throw new IllegalArgumentException("cant parse value by key:" + str + " value:" + value);
                }
                bundle.putBundle(str, a((Map) value));
            }
        }
        return bundle;
    }

    private static Object b(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject)) {
            return obj;
        }
        try {
        } catch (Exception e5) {
            h.o(e5);
        }
        if (obj instanceof Collection) {
            return h((Collection) obj);
        }
        if (obj.getClass().isArray()) {
            return d((Object[]) obj);
        }
        if (obj instanceof Map) {
            return n((Map) obj);
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Short) && !(obj instanceof String)) {
            if (obj.getClass().getPackage().getName().startsWith("java.")) {
                return obj.toString();
            }
            return JSONObject.NULL;
        }
        return obj;
    }

    private static boolean c(String str) {
        return str.trim().startsWith("[");
    }

    public static JSONArray d(Object[] objArr) {
        int length = Array.getLength(objArr);
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < length; i10++) {
            jSONArray.put(b(Array.get(objArr, i10)));
        }
        return jSONArray;
    }

    private static boolean e(String str) {
        return str.trim().startsWith("{");
    }

    public static JSONObject f(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bundle == null) {
            return jSONObject;
        }
        for (String str : bundle.keySet()) {
            try {
                Object objDeepToString = bundle.get(str);
                if (objDeepToString instanceof char[]) {
                    objDeepToString = Arrays.toString((char[]) objDeepToString);
                } else if (objDeepToString instanceof float[]) {
                    objDeepToString = Arrays.toString((float[]) objDeepToString);
                } else if (objDeepToString instanceof double[]) {
                    objDeepToString = Arrays.toString((double[]) objDeepToString);
                } else if (objDeepToString instanceof int[]) {
                    objDeepToString = Arrays.toString((int[]) objDeepToString);
                } else if (objDeepToString instanceof long[]) {
                    objDeepToString = Arrays.toString((long[]) objDeepToString);
                } else if (objDeepToString instanceof byte[]) {
                    objDeepToString = Arrays.toString((byte[]) objDeepToString);
                } else if (objDeepToString instanceof Object[]) {
                    objDeepToString = Arrays.deepToString((Object[]) objDeepToString);
                }
                jSONObject.put(str, objDeepToString);
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject g(Bundle bundle) throws JSONException {
        String string;
        Object jSONArray;
        JSONObject jSONObject = new JSONObject();
        if (bundle == null) {
            return jSONObject;
        }
        for (String str : bundle.keySet()) {
            if (str.equals("u")) {
                try {
                    string = bundle.getString("u");
                } catch (JSONException unused) {
                }
                if (string != null) {
                    try {
                        if (e(string)) {
                            jSONArray = new JSONObject(string);
                        } else {
                            if (c(string)) {
                                jSONArray = new JSONArray(string);
                            }
                            jSONObject.put(str, bundle.get(str));
                        }
                        jSONObject.put(str, bundle.get(str));
                    } catch (JSONException unused2) {
                    }
                    jSONObject.put("userdata", jSONArray);
                }
            } else {
                jSONObject.put(str, bundle.get(str));
            }
        }
        return jSONObject;
    }

    public static JSONArray h(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                jSONArray.put(b(it.next()));
            }
        }
        return jSONArray;
    }

    public static Bundle i(String str) {
        return j(str, false);
    }

    public static Bundle j(String str, boolean z10) {
        try {
            return a(m(new JSONObject(str), z10));
        } catch (JSONException e5) {
            e5.printStackTrace();
            return new Bundle();
        }
    }

    public static List k(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object objL = jSONArray.get(i10);
            if (objL instanceof JSONArray) {
                objL = k((JSONArray) objL);
            } else if (objL instanceof JSONObject) {
                objL = l((JSONObject) objL);
            } else if (JSONObject.NULL.equals(objL)) {
                objL = null;
            }
            arrayList.add(objL);
        }
        return arrayList;
    }

    public static Map l(JSONObject jSONObject) {
        return m(jSONObject, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map m(org.json.JSONObject r5, boolean r6) throws org.json.JSONException {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r5 != 0) goto L8
            return r0
        L8:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L53
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L53
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L53
            java.util.Iterator r5 = r1.keys()
        L15:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r1.get(r2)
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L33
            if (r6 == 0) goto L2c
            goto L39
        L2c:
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            java.util.List r3 = k(r3)
            goto L4f
        L33:
            boolean r4 = r3 instanceof org.json.JSONObject
            if (r4 == 0) goto L46
            if (r6 == 0) goto L3e
        L39:
            java.lang.String r3 = r3.toString()
            goto L4f
        L3e:
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            r4 = 0
            java.util.Map r3 = m(r3, r4)
            goto L4f
        L46:
            java.lang.Object r4 = org.json.JSONObject.NULL
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L4f
            r3 = 0
        L4f:
            r0.put(r2, r3)
            goto L15
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.b.m(org.json.JSONObject, boolean):java.util.Map");
    }

    public static JSONObject n(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map == null) {
            return new JSONObject();
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new IllegalArgumentException("key == null");
            }
            try {
                jSONObject.put(str, b(entry.getValue()));
            } catch (JSONException e5) {
                h.o(e5);
            }
        }
        return jSONObject;
    }

    public static void o(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> itKeys = jSONObject.keys();
        synchronized (itKeys) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    jSONObject2.put(next, jSONObject.opt(next));
                } catch (JSONException e5) {
                    h.o(e5);
                }
            }
        }
    }
}
