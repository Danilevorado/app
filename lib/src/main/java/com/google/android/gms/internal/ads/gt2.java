package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class gt2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8882a = (String) ws.f17254b.e();

    public final String a(Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f8882a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
