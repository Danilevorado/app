package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class or {

    /* renamed from: a, reason: collision with root package name */
    private final String f13365a = (String) ws.f17254b.e();

    /* renamed from: b, reason: collision with root package name */
    private final Map f13366b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f13367c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13368d;

    public or(Context context, String str) {
        this.f13367c = context;
        this.f13368d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f13366b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        j3.t.r();
        linkedHashMap.put("device", m3.b2.L());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        j3.t.r();
        linkedHashMap.put("is_lite_sdk", true != m3.b2.W(context) ? "0" : "1");
        Future futureB = j3.t.o().b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((p90) futureB.get()).f13652k));
            linkedHashMap.put("network_fine", Integer.toString(((p90) futureB.get()).f13653l));
        } catch (Exception e5) {
            j3.t.q().u(e5, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) k3.w.c().b(ir.E9)).booleanValue()) {
            Map map = this.f13366b;
            j3.t.r();
            map.put("is_bstar", true == m3.b2.T(context) ? "1" : "0");
        }
    }

    final Context a() {
        return this.f13367c;
    }

    final String b() {
        return this.f13368d;
    }

    final String c() {
        return this.f13365a;
    }

    final Map d() {
        return this.f13366b;
    }
}
