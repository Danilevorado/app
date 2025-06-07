package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ww implements gy {

    /* renamed from: a, reason: collision with root package name */
    private final xw f17282a;

    public ww(xw xwVar) {
        this.f17282a = xwVar;
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final void a(Object obj, Map map) {
        if (this.f17282a == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            ze0.f("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleA = null;
        if (map.containsKey("info")) {
            try {
                bundleA = m3.w0.a(new JSONObject((String) map.get("info")));
            } catch (JSONException e5) {
                ze0.e("Failed to convert ad metadata to JSON.", e5);
            }
        }
        if (bundleA == null) {
            ze0.d("Failed to convert ad metadata to Bundle.");
        } else {
            this.f17282a.D(str, bundleA);
        }
    }
}
