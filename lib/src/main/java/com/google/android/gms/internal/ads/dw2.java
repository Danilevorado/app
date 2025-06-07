package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class dw2 {

    /* renamed from: a, reason: collision with root package name */
    private static WindowManager f7529a;

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f7530b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    static float f7531c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i10, int i11, int i12, int i13) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i10 / f7531c);
            jSONObject.put("y", i11 / f7531c);
            jSONObject.put("width", i12 / f7531c);
            jSONObject.put("height", i13 / f7531c);
        } catch (JSONException e5) {
            ew2.a("Error with creating viewStateObject", e5);
        }
        return jSONObject;
    }

    public static void b(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e5) {
            ew2.a("Error with setting ad session id", e5);
        }
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    public static void d(Context context) {
        if (context != null) {
            f7531c = context.getResources().getDisplayMetrics().density;
            f7529a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void e(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e5) {
            ew2.a("JSONException during JSONObject.put for name [" + str + "]", e5);
        }
    }

    public static void f(JSONObject jSONObject) throws JSONException {
        float f5;
        float f10 = 0.0f;
        if (f7529a != null) {
            Point point = new Point(0, 0);
            f7529a.getDefaultDisplay().getRealSize(point);
            float f11 = point.x;
            float f12 = f7531c;
            f10 = f11 / f12;
            f5 = point.y / f12;
        } else {
            f5 = 0.0f;
        }
        try {
            jSONObject.put("width", f10);
            jSONObject.put("height", f5);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(org.json.JSONObject r9, org.json.JSONObject r10) {
        /*
            r0 = 1
            if (r9 != 0) goto L7
            if (r10 == 0) goto L6
            goto L7
        L6:
            return r0
        L7:
            r1 = 0
            if (r9 == 0) goto Lab
            if (r10 != 0) goto Le
            goto Lab
        Le:
            java.lang.String[] r2 = com.google.android.gms.internal.ads.dw2.f7530b
            r3 = r1
        L11:
            r4 = 4
            if (r3 >= r4) goto L27
            r4 = r2[r3]
            double r5 = r9.optDouble(r4)
            double r7 = r10.optDouble(r4)
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 == 0) goto L24
            goto Lab
        L24:
            int r3 = r3 + 1
            goto L11
        L27:
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r4 = r9.optString(r2, r3)
            java.lang.String r2 = r10.optString(r2, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lab
            java.lang.String r2 = "hasWindowFocus"
            boolean r4 = r9.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r10.optBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lab
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r9.optJSONArray(r2)
            org.json.JSONArray r2 = r10.optJSONArray(r2)
            if (r4 != 0) goto L60
            if (r2 != 0) goto L60
            goto L7e
        L60:
            boolean r5 = h(r4, r2)
            if (r5 == 0) goto Lab
            r5 = r1
        L67:
            int r6 = r4.length()
            if (r5 >= r6) goto L7e
            java.lang.String r6 = r4.optString(r5, r3)
            java.lang.String r7 = r2.optString(r5, r3)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto Lab
            int r5 = r5 + 1
            goto L67
        L7e:
            java.lang.String r2 = "childViews"
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            org.json.JSONArray r10 = r10.optJSONArray(r2)
            if (r9 != 0) goto L8c
            if (r10 == 0) goto Laa
        L8c:
            boolean r2 = h(r9, r10)
            if (r2 == 0) goto Lab
            r2 = r1
        L93:
            int r3 = r9.length()
            if (r2 >= r3) goto Laa
            org.json.JSONObject r3 = r9.optJSONObject(r2)
            org.json.JSONObject r4 = r10.optJSONObject(r2)
            boolean r3 = g(r3, r4)
            if (r3 == 0) goto Lab
            int r2 = r2 + 1
            goto L93
        Laa:
            return r0
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dw2.g(org.json.JSONObject, org.json.JSONObject):boolean");
    }

    private static boolean h(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
