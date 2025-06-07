package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class he2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f9119a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f9120b;

    he2(bb3 bb3Var, Context context) {
        this.f9119a = bb3Var;
        this.f9120b = context;
    }

    public static Bundle c(Context context, JSONArray jSONArray) {
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            int i11 = iOptInt != 0 ? iOptInt != 1 ? iOptInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i11 != 0) {
                String[] strArrSplit = strOptString2.split("/");
                int length = strArrSplit.length;
                Object obj = null;
                if (length <= 2 && length != 0) {
                    if (length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = strArrSplit[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(strArrSplit[0], 0);
                        str = strArrSplit[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i12 = i11 - 1;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f9119a.g(new Callable() { // from class: com.google.android.gms.internal.ads.fe2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f8248a.d();
            }
        });
    }

    final /* synthetic */ je2 d() {
        String str = (String) k3.w.c().b(ir.M5);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            final Bundle bundleC = c(this.f9120b, new JSONArray(str));
            return new je2() { // from class: com.google.android.gms.internal.ads.ge2
                @Override // com.google.android.gms.internal.ads.je2
                public final void c(Object obj) {
                    ((Bundle) obj).putBundle("shared_pref", bundleC);
                }
            };
        } catch (JSONException e5) {
            ze0.c("JSON parsing error", e5);
            return null;
        }
    }
}
