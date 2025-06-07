package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class nx implements gy {
    nx() {
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        JSONObject jSONObjectB;
        nk0 nk0Var = (nk0) obj;
        du duVarS = nk0Var.s();
        if (duVarS == null || (jSONObjectB = duVarS.b()) == null) {
            nk0Var.a("nativeClickMetaReady", new JSONObject());
        } else {
            nk0Var.a("nativeClickMetaReady", jSONObjectB);
        }
    }
}
