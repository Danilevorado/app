package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hf2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f9124a;

    public hf2(String str) {
        this.f9124a = str;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("ms", this.f9124a);
        } catch (JSONException e5) {
            m3.n1.l("Failed putting Ad ID.", e5);
        }
    }
}
