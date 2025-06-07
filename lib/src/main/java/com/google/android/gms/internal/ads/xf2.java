package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xf2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f17536a;

    public xf2(JSONObject jSONObject) {
        this.f17536a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectF = m3.w0.f((JSONObject) obj, "content_info");
            JSONObject jSONObject = this.f17536a;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectF.put(next, jSONObject.get(next));
            }
        } catch (JSONException unused) {
            m3.n1.k("Failed putting app indexing json.");
        }
    }
}
