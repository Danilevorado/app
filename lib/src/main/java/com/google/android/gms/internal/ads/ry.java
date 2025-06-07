package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class ry implements gy {

    /* renamed from: a, reason: collision with root package name */
    private final sq1 f15004a;

    public ry(sq1 sq1Var) {
        this.f15004a = sq1Var;
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final void a(Object obj, Map map) {
        if (((Boolean) k3.w.c().b(ir.H8)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            String str4 = (String) map.get("format");
            if (str.equals("load") && !TextUtils.isEmpty(str4)) {
                this.f15004a.Q5(str2, str4, str3);
            } else if (str.equals("show")) {
                this.f15004a.R5(str2, str3);
            }
        }
    }
}
