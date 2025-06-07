package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class uy implements gy {

    /* renamed from: a, reason: collision with root package name */
    private final Object f16492a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map f16493b = new HashMap();

    @Override // com.google.android.gms.internal.ads.gy
    public final void a(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.f16492a) {
            ty tyVar = (ty) this.f16493b.remove(str);
            if (tyVar == null) {
                ze0.g("Received result for unexpected method invocation: " + str);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                tyVar.o(str3 + strConcat);
                return;
            }
            if (str5 == null) {
                tyVar.a(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (m3.n1.m()) {
                    m3.n1.k("Result GMSG: " + jSONObject.toString(2));
                }
                tyVar.a(jSONObject);
            } catch (JSONException e5) {
                tyVar.o(e5.getMessage());
            }
        }
    }

    public final ab3 b(d10 d10Var, String str, JSONObject jSONObject) throws JSONException {
        tf0 tf0Var = new tf0();
        j3.t.r();
        String string = UUID.randomUUID().toString();
        c(string, new sy(this, tf0Var));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            d10Var.s0(str, jSONObject2);
        } catch (Exception e5) {
            tf0Var.f(e5);
        }
        return tf0Var;
    }

    public final void c(String str, ty tyVar) {
        synchronized (this.f16492a) {
            this.f16493b.put(str, tyVar);
        }
    }
}
