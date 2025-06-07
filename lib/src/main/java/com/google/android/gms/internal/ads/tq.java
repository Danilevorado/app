package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class tq extends zq {
    tq(int i10, String str, Boolean bool) {
        super(i10, str, bool, null);
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(n(), ((Boolean) m()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(n())) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(n()))) : (Boolean) m();
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(n(), ((Boolean) m()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(n(), ((Boolean) obj).booleanValue());
    }
}
