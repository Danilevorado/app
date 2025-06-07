package com.onesignal;

import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class e0 {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean a(org.json.JSONArray r6, org.json.JSONArray r7) {
        /*
            r0 = 1
            if (r6 != 0) goto L6
            if (r7 != 0) goto L6
            return r0
        L6:
            r1 = 0
            if (r6 == 0) goto L47
            if (r7 != 0) goto Lc
            goto L47
        Lc:
            int r2 = r6.length()
            int r3 = r7.length()
            if (r2 == r3) goto L17
            return r1
        L17:
            r2 = r1
        L18:
            int r3 = r6.length()     // Catch: org.json.JSONException -> L43
            if (r2 >= r3) goto L42
            r3 = r1
        L1f:
            int r4 = r7.length()     // Catch: org.json.JSONException -> L43
            if (r3 >= r4) goto L41
            java.lang.Object r4 = r6.get(r2)     // Catch: org.json.JSONException -> L43
            java.lang.Object r4 = e(r4)     // Catch: org.json.JSONException -> L43
            java.lang.Object r5 = r7.get(r3)     // Catch: org.json.JSONException -> L43
            java.lang.Object r5 = e(r5)     // Catch: org.json.JSONException -> L43
            boolean r4 = r4.equals(r5)     // Catch: org.json.JSONException -> L43
            if (r4 == 0) goto L3e
            int r2 = r2 + 1
            goto L18
        L3e:
            int r3 = r3 + 1
            goto L1f
        L41:
            return r1
        L42:
            return r0
        L43:
            r6 = move-exception
            r6.printStackTrace()
        L47:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.e0.a(org.json.JSONArray, org.json.JSONArray):boolean");
    }

    static JSONObject b(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set set) throws JSONException {
        JSONObject jSONObject4;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject2 == null) {
            return jSONObject3;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        JSONObject jSONObject5 = jSONObject3 != null ? jSONObject3 : new JSONObject();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.has(next)) {
                    if (obj instanceof JSONObject) {
                        String string = b(jSONObject.getJSONObject(next), (JSONObject) obj, (jSONObject3 == null || !jSONObject3.has(next)) ? null : jSONObject3.getJSONObject(next), set).toString();
                        if (!string.equals("{}")) {
                            jSONObject4 = new JSONObject(string);
                            jSONObject5.put(next, jSONObject4);
                        }
                    } else if (obj instanceof JSONArray) {
                        d(next, (JSONArray) obj, jSONObject.getJSONArray(next), jSONObject5);
                    } else {
                        if (set == null || !set.contains(next)) {
                            Object obj2 = jSONObject.get(next);
                            if (obj.equals(obj2) || ((obj2 instanceof Number) && (obj instanceof Number) && ((Number) obj2).doubleValue() == ((Number) obj).doubleValue())) {
                            }
                        }
                        jSONObject5.put(next, obj);
                    }
                } else if (obj instanceof JSONObject) {
                    jSONObject4 = new JSONObject(obj.toString());
                    jSONObject5.put(next, jSONObject4);
                } else if (obj instanceof JSONArray) {
                    d(next, (JSONArray) obj, null, jSONObject5);
                } else {
                    jSONObject5.put(next, obj);
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
        return jSONObject5;
    }

    static JSONObject c(b0 b0Var, String str) throws JSONException {
        if (!b0Var.a(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectE = b0Var.e(str);
        Iterator<String> itKeys = jSONObjectE.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObjectE.get(next);
                if (!"".equals(obj)) {
                    jSONObject.put(next, obj);
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    private static void d(String str, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject) throws JSONException {
        if (str.endsWith("_a") || str.endsWith("_d")) {
            jSONObject.put(str, jSONArray);
            return;
        }
        String strF = f(jSONArray);
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        String strF2 = jSONArray2 == null ? null : f(jSONArray2);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String str2 = (String) jSONArray.get(i10);
            if (jSONArray2 == null || !strF2.contains(str2)) {
                jSONArray3.put(str2);
            }
        }
        if (jSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                String string = jSONArray2.getString(i11);
                if (!strF.contains(string)) {
                    jSONArray4.put(string);
                }
            }
        }
        if (!jSONArray3.toString().equals("[]")) {
            jSONObject.put(str + "_a", jSONArray3);
        }
        if (jSONArray4.toString().equals("[]")) {
            return;
        }
        jSONObject.put(str + "_d", jSONArray4);
    }

    public static Object e(Object obj) {
        Class<?> cls = obj.getClass();
        return cls.equals(Integer.class) ? Long.valueOf(((Integer) obj).intValue()) : cls.equals(Float.class) ? Double.valueOf(((Float) obj).floatValue()) : obj;
    }

    static String f(JSONArray jSONArray) {
        String str = "[";
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                str = str + "\"" + jSONArray.getString(i10) + "\"";
            } catch (JSONException unused) {
            }
        }
        return str + "]";
    }

    static String g(JSONObject jSONObject) {
        String strGroup;
        String string = jSONObject.toString();
        if (!jSONObject.has("external_user_id")) {
            return string;
        }
        Matcher matcher = Pattern.compile("(?<=\"external_user_id\":\").*?(?=\")").matcher(string);
        return (!matcher.find() || (strGroup = matcher.group(0)) == null) ? string : matcher.replaceAll(Matcher.quoteReplacement(strGroup.replace("\\/", "/")));
    }
}
