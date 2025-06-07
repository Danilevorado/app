package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yg1 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f18033a;

    /* renamed from: b, reason: collision with root package name */
    private final sg1 f18034b;

    public yg1(Executor executor, sg1 sg1Var) {
        this.f18033a = executor;
        this.f18034b = sg1Var;
    }

    public final ab3 a(JSONObject jSONObject, String str) {
        final String strOptString;
        ab3 ab3VarL;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return qa3.h(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            xg1 xg1Var = null;
            if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("name")) == null) {
                ab3VarL = qa3.h(xg1Var);
            } else {
                String strOptString2 = jSONObjectOptJSONObject.optString("type");
                if ("string".equals(strOptString2)) {
                    xg1Var = new xg1(strOptString, jSONObjectOptJSONObject.optString("string_value"));
                } else if ("image".equals(strOptString2)) {
                    ab3VarL = qa3.l(this.f18034b.e(jSONObjectOptJSONObject, "image_value"), new w23() { // from class: com.google.android.gms.internal.ads.vg1
                        @Override // com.google.android.gms.internal.ads.w23
                        public final Object a(Object obj) {
                            return new xg1(strOptString, (cu) obj);
                        }
                    }, this.f18033a);
                }
                ab3VarL = qa3.h(xg1Var);
            }
            arrayList.add(ab3VarL);
        }
        return qa3.l(qa3.d(arrayList), new w23() { // from class: com.google.android.gms.internal.ads.wg1
            @Override // com.google.android.gms.internal.ads.w23
            public final Object a(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (xg1 xg1Var2 : (List) obj) {
                    if (xg1Var2 != null) {
                        arrayList2.add(xg1Var2);
                    }
                }
                return arrayList2;
            }
        }, this.f18033a);
    }
}
