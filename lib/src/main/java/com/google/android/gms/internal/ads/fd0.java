package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class fd0 {

    /* renamed from: a, reason: collision with root package name */
    static fd0 f8226a;

    public static synchronized fd0 d(Context context) {
        fd0 fd0Var = f8226a;
        if (fd0Var != null) {
            return fd0Var;
        }
        Context applicationContext = context.getApplicationContext();
        ir.a(applicationContext);
        m3.p1 p1VarH = j3.t.q().h();
        p1VarH.M(applicationContext);
        ic0 ic0Var = new ic0(null);
        ic0Var.b(applicationContext);
        ic0Var.c(j3.t.b());
        ic0Var.a(p1VarH);
        ic0Var.d(j3.t.p());
        fd0 fd0VarE = ic0Var.e();
        f8226a = fd0VarE;
        fd0VarE.a().a();
        f8226a.b().c();
        jd0 jd0VarC = f8226a.c();
        if (((Boolean) k3.w.c().b(ir.f10055q0)).booleanValue()) {
            HashMap map = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject((String) k3.w.c().b(ir.f10077s0));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    HashSet hashSet = new HashSet();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                    if (jSONArrayOptJSONArray != null) {
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            String strOptString = jSONArrayOptJSONArray.optString(i10);
                            if (strOptString != null) {
                                hashSet.add(strOptString);
                            }
                        }
                        map.put(next, hashSet);
                    }
                }
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    jd0VarC.c((String) it.next());
                }
                jd0VarC.d(new hd0(jd0VarC, map));
            } catch (JSONException e5) {
                ze0.c("Failed to parse listening list", e5);
            }
        }
        return f8226a;
    }

    abstract bc0 a();

    abstract fc0 b();

    abstract jd0 c();
}
