package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class oh2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ oh2 f13250a = new oh2();

    private /* synthetic */ oh2() {
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final /* synthetic */ int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return qa3.h(new je2() { // from class: com.google.android.gms.internal.ads.ph2
            @Override // com.google.android.gms.internal.ads.je2
            public final void c(Object obj) throws JSONException {
                try {
                    ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451000);
                } catch (JSONException unused) {
                }
            }
        });
    }
}
