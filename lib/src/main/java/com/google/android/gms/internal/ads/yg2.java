package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yg2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final List f18035a;

    public yg2(List list) {
        this.f18035a = list;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.f18035a));
        } catch (JSONException unused) {
            m3.n1.k("Failed putting experiment ids.");
        }
    }
}
