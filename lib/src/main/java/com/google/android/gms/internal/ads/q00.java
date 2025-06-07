package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract /* synthetic */ class q00 {
    public static void a(r00 r00Var, String str, Map map) {
        try {
            r00Var.a(str, k3.t.b().k(map));
        } catch (JSONException unused) {
            ze0.g("Could not convert parameters to JSON.");
        }
    }

    public static void b(r00 r00Var, String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("',");
        sb2.append(string);
        sb2.append(");");
        ze0.b("Dispatching AFMA event: ".concat(sb2.toString()));
        r00Var.o(sb2.toString());
    }

    public static void c(r00 r00Var, String str, String str2) {
        r00Var.o(str + "(" + str2 + ");");
    }

    public static void d(r00 r00Var, String str, JSONObject jSONObject) {
        r00Var.v(str, jSONObject.toString());
    }
}
