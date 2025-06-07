package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class yw implements gy {

    /* renamed from: a, reason: collision with root package name */
    private final zw f18290a;

    public yw(zw zwVar) {
        this.f18290a = zwVar;
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final void a(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            ze0.g("App event with no name parameter.");
        } else {
            this.f18290a.A(str, (String) map.get("info"));
        }
    }
}
