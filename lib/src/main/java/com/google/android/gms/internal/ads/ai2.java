package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ai2 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f6103a;

    public ai2(Map map) {
        this.f6103a = map;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("video_decoders", k3.t.b().k(this.f6103a));
        } catch (JSONException e5) {
            m3.n1.k("Could not encode video decoder properties: ".concat(String.valueOf(e5.getMessage())));
        }
    }
}
