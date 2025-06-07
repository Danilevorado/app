package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class wq extends zq {
    wq(int i10, String str, Float f5) {
        super(1, str, f5, null);
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(n(), ((Float) m()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(n())) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(n()))) : (Float) m();
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(n(), ((Float) m()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(n(), ((Float) obj).floatValue());
    }
}
