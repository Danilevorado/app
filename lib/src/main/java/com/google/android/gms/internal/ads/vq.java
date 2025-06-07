package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class vq extends zq {
    vq(int i10, String str, Long l10) {
        super(1, str, l10, null);
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(n(), ((Long) m()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(n())) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(n()))) : (Long) m();
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(n(), ((Long) m()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zq
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(n(), ((Long) obj).longValue());
    }
}
