package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class rs0 implements fs0 {

    /* renamed from: a, reason: collision with root package name */
    private final gn2 f14947a;

    public rs0(gn2 gn2Var) {
        this.f14947a = gn2Var;
    }

    @Override // com.google.android.gms.internal.ads.fs0
    public final void a(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f14947a.b(Boolean.parseBoolean(str));
        } catch (Exception unused) {
            throw new IllegalStateException("Invalid render_in_browser state");
        }
    }
}
