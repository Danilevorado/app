package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n60 {

    /* renamed from: a, reason: collision with root package name */
    private final nk0 f12437a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12438b;

    public n60(nk0 nk0Var, String str) {
        this.f12437a = nk0Var;
        this.f12438b = str;
    }

    public final void b(int i10, int i11, int i12, int i13) throws JSONException {
        try {
            this.f12437a.a("onDefaultPositionReceived", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e5) {
            ze0.e("Error occurred while dispatching default position.", e5);
        }
    }

    public final void c(String str) throws JSONException {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.f12438b);
            nk0 nk0Var = this.f12437a;
            if (nk0Var != null) {
                nk0Var.a("onError", jSONObjectPut);
            }
        } catch (JSONException e5) {
            ze0.e("Error occurred while dispatching error event.", e5);
        }
    }

    public final void d(String str) throws JSONException {
        try {
            this.f12437a.a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e5) {
            ze0.e("Error occurred while dispatching ready Event.", e5);
        }
    }

    public final void e(int i10, int i11, int i12, int i13, float f5, int i14) throws JSONException {
        try {
            this.f12437a.a("onScreenInfoChanged", new JSONObject().put("width", i10).put("height", i11).put("maxSizeWidth", i12).put("maxSizeHeight", i13).put("density", f5).put("rotation", i14));
        } catch (JSONException e5) {
            ze0.e("Error occurred while obtaining screen information.", e5);
        }
    }

    public final void f(int i10, int i11, int i12, int i13) throws JSONException {
        try {
            this.f12437a.a("onSizeChanged", new JSONObject().put("x", i10).put("y", i11).put("width", i12).put("height", i13));
        } catch (JSONException e5) {
            ze0.e("Error occurred while dispatching size change.", e5);
        }
    }

    public final void g(String str) throws JSONException {
        try {
            this.f12437a.a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e5) {
            ze0.e("Error occurred while dispatching state change.", e5);
        }
    }
}
