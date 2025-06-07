package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ds0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f7484a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f7485b;

    ds0(Map map, Map map2) {
        this.f7484a = map;
        this.f7485b = map2;
    }

    public final void a(un2 un2Var) {
        for (sn2 sn2Var : un2Var.f16413b.f15925c) {
            if (this.f7484a.containsKey(sn2Var.f15457a)) {
                ((gs0) this.f7484a.get(sn2Var.f15457a)).a(sn2Var.f15458b);
            } else if (this.f7485b.containsKey(sn2Var.f15457a)) {
                fs0 fs0Var = (fs0) this.f7485b.get(sn2Var.f15457a);
                JSONObject jSONObject = sn2Var.f15458b;
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                fs0Var.a(map);
            }
        }
    }
}
