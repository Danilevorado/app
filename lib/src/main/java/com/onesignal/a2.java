package com.onesignal;

import android.content.Context;
import android.net.Uri;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21692a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f21693b;

    public a2(Context context, JSONObject jSONObject) {
        rb.h.e(context, "context");
        rb.h.e(jSONObject, "fcmPayload");
        this.f21692a = context;
        this.f21693b = jSONObject;
    }

    public final boolean a() {
        return z1.f22540a.a(this.f21692a) && b() == null;
    }

    public final Uri b() {
        z1 z1Var = z1.f22540a;
        if (!z1Var.a(this.f21692a) || z1Var.b(this.f21692a)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(this.f21693b.optString("custom"));
        if (jSONObject.has("u")) {
            String strOptString = jSONObject.optString("u");
            if (!rb.h.a(strOptString, "")) {
                rb.h.d(strOptString, "url");
                int length = strOptString.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = rb.h.f(strOptString.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length--;
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                return Uri.parse(strOptString.subSequence(i10, length + 1).toString());
            }
        }
        return null;
    }
}
