package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f22489a = new w();

    private w() {
    }

    private final Intent b(Uri uri) {
        if (uri == null) {
            return null;
        }
        return OSUtils.O(uri);
    }

    private final boolean c(boolean z10, JSONObject jSONObject) {
        return z10 | (j1.a(jSONObject) != null);
    }

    public final v a(Context context, JSONObject jSONObject) {
        rb.h.e(context, "context");
        rb.h.e(jSONObject, "fcmPayload");
        a2 a2Var = new a2(context, jSONObject);
        return new v(context, b(a2Var.b()), c(a2Var.a(), jSONObject));
    }
}
