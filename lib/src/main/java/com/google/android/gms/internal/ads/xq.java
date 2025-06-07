package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class xq extends zq {
    xq(int i10, String str, String str2) {
        super(1, str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optString(n(), (String) m());
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(n())) ? bundle.getString("com.google.android.gms.ads.flag.".concat(n())) : (String) m();
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(n(), (String) m());
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putString(n(), (String) obj);
    }
}
