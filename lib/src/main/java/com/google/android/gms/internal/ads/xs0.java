package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class xs0 implements fs0 {

    /* renamed from: a, reason: collision with root package name */
    private final xp1 f17799a;

    xs0(xp1 xp1Var) {
        this.f17799a = xp1Var;
    }

    @Override // com.google.android.gms.internal.ads.fs0
    public final void a(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f17799a.m(str.equals("true"));
    }
}
