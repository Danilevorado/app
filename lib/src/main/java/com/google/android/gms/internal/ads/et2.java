package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class et2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7967a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7968b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7969c;

    public et2(Context context, ff0 ff0Var) {
        this.f7967a = context;
        this.f7968b = context.getPackageName();
        this.f7969c = ff0Var.f8252m;
    }

    public final void a(Map map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        j3.t.r();
        map.put("device", m3.b2.L());
        map.put("app", this.f7968b);
        j3.t.r();
        map.put("is_lite_sdk", true != m3.b2.W(this.f7967a) ? "0" : "1");
        zq zqVar = ir.f9881a;
        List listB = k3.w.a().b();
        if (((Boolean) k3.w.c().b(ir.B6)).booleanValue()) {
            listB.addAll(j3.t.q().h().g().d());
        }
        map.put("e", TextUtils.join(",", listB));
        map.put("sdkVersion", this.f7969c);
        if (((Boolean) k3.w.c().b(ir.E9)).booleanValue()) {
            j3.t.r();
            map.put("is_bstar", true == m3.b2.T(this.f7967a) ? "1" : "0");
        }
    }
}
