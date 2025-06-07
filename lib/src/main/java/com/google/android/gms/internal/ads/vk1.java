package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vk1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f16761a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f16762b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f16763c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16764d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f16765e;

    public vk1(Executor executor) {
        this.f16763c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void f() {
        Map map;
        this.f16764d = true;
        de0 de0VarG = j3.t.q().h().g();
        if (de0VarG == null) {
            return;
        }
        JSONObject jSONObjectF = de0VarG.f();
        if (jSONObjectF == null) {
            return;
        }
        this.f16762b = ((Boolean) k3.w.c().b(ir.F3)).booleanValue() ? jSONObjectF.optJSONObject("common_settings") : null;
        this.f16765e = jSONObjectF.optJSONObject("ad_unit_patterns");
        JSONArray jSONArrayOptJSONArray = jSONObjectF.optJSONArray("ad_unit_id_settings");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                    String strOptString2 = jSONObjectOptJSONObject.optString("format");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                    if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                        if (this.f16761a.containsKey(strOptString2)) {
                            map = (Map) this.f16761a.get(strOptString2);
                        } else {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            this.f16761a.put(strOptString2, concurrentHashMap);
                            map = concurrentHashMap;
                        }
                        map.put(strOptString, jSONObjectOptJSONObject2);
                    }
                }
            }
        }
    }

    public final JSONObject a() {
        if (((Boolean) k3.w.c().b(ir.F3)).booleanValue()) {
            return this.f16762b;
        }
        return null;
    }

    public final JSONObject b(String str, String str2) {
        if (!((Boolean) k3.w.c().b(ir.E3)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f16764d) {
            f();
        }
        Map map = (Map) this.f16761a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String strA = xk1.a(this.f16765e, str, str2);
        if (strA == null) {
            return null;
        }
        return (JSONObject) map.get(strA);
    }

    public final void c() {
        j3.t.q().h().r(new Runnable() { // from class: com.google.android.gms.internal.ads.sk1
            @Override // java.lang.Runnable
            public final void run() {
                this.f15303m.e();
            }
        });
        this.f16763c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.tk1
            @Override // java.lang.Runnable
            public final void run() {
                this.f15881m.f();
            }
        });
    }

    final /* synthetic */ void e() {
        this.f16763c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.uk1
            @Override // java.lang.Runnable
            public final void run() {
                this.f16374m.d();
            }
        });
    }
}
