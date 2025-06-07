package com.google.android.gms.internal.ads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class xy implements gy {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17837a;

    public xy(Context context) {
        this.f17837a = context;
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final void a(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        m3.n1.k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey("title")) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
        }
        try {
            j3.t.r();
            m3.b2.o(this.f17837a, intent);
        } catch (ActivityNotFoundException e5) {
            j3.t.q().u(e5, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
