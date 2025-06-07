package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l52 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f11335a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f11336b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f11337c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Executor f11338d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f11339e;

    l52(Executor executor) {
        this.f11338d = executor;
    }

    private final synchronized List g(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Bundle bundleL = l(jSONObject.optJSONObject("data"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
        if (jSONArrayOptJSONArray == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            String strOptString = jSONArrayOptJSONArray.optString(i10, "");
            if (!TextUtils.isEmpty(strOptString)) {
                arrayList2.add(strOptString);
            }
        }
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            String str2 = (String) arrayList2.get(i11);
            f(str2);
            if (((n52) this.f11335a.get(str2)) != null) {
                arrayList.add(new n52(str2, str, bundleL));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void h() {
        this.f11336b.clear();
        this.f11335a.clear();
        j();
        k();
    }

    private final synchronized void i(String str, String str2, List list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        Map map = (Map) this.f11337c.get(str);
        if (map == null) {
            map = new HashMap();
        }
        this.f11337c.put(str, map);
        List arrayList = (List) map.get(str2);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.addAll(list);
        map.put(str2, arrayList);
    }

    private final synchronized void j() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectF = j3.t.q().h().g().f();
        if (jSONObjectF != null) {
            try {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectF.optJSONArray("ad_unit_id_settings");
                this.f11339e = jSONObjectF.optJSONObject("ad_unit_patterns");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                        JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i10);
                        String lowerCase = ((Boolean) k3.w.c().b(ir.f10021m9)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                        String strOptString = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                arrayList.addAll(g(jSONArrayOptJSONArray.getJSONObject(i11), strOptString));
                            }
                        }
                        i(strOptString, lowerCase, arrayList);
                    }
                }
            } catch (JSONException e5) {
                m3.n1.l("Malformed config loading JSON.", e5);
            }
        }
    }

    private final synchronized void k() {
        if (!((Boolean) jt.f10698f.e()).booleanValue()) {
            if (((Boolean) k3.w.c().b(ir.E1)).booleanValue()) {
                JSONObject jSONObjectF = j3.t.q().h().g().f();
                if (jSONObjectF == null) {
                    return;
                }
                try {
                    JSONArray jSONArray = jSONObjectF.getJSONArray("signal_adapters");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        Bundle bundleL = l(jSONObject.optJSONObject("data"));
                        String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.f11336b.put(strOptString, new p52(strOptString, zOptBoolean2, zOptBoolean, bundleL));
                        }
                    }
                } catch (JSONException e5) {
                    m3.n1.l("Malformed config loading JSON.", e5);
                }
            }
        }
    }

    private static final Bundle l(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized Map a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map map = (Map) this.f11337c.get(str);
            if (map == null) {
                return f63.d();
            }
            List<n52> list = (List) map.get(str2);
            if (list == null) {
                String strA = xk1.a(this.f11339e, str2, str);
                if (((Boolean) k3.w.c().b(ir.f10021m9)).booleanValue()) {
                    strA = strA.toLowerCase(Locale.ROOT);
                }
                list = (List) map.get(strA);
            }
            if (list == null) {
                return f63.d();
            }
            HashMap map2 = new HashMap();
            for (n52 n52Var : list) {
                String str3 = n52Var.f12428a;
                if (!map2.containsKey(str3)) {
                    map2.put(str3, new ArrayList());
                }
                ((List) map2.get(str3)).add(n52Var.f12430c);
            }
            return f63.c(map2);
        }
        return f63.d();
    }

    public final synchronized Map b() {
        return f63.c(this.f11336b);
    }

    public final void d() {
        j3.t.q().h().r(new Runnable() { // from class: com.google.android.gms.internal.ads.j52
            @Override // java.lang.Runnable
            public final void run() {
                this.f10301m.e();
            }
        });
        this.f11338d.execute(new k52(this));
    }

    final /* synthetic */ void e() {
        this.f11338d.execute(new k52(this));
    }

    public final synchronized void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f11335a.containsKey(str)) {
            return;
        }
        this.f11335a.put(str, new n52(str, "", new Bundle()));
    }
}
