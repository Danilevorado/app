package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class yy implements gy {

    /* renamed from: a, reason: collision with root package name */
    private final xp1 f18316a;

    public yy(xp1 xp1Var) {
        e4.p.m(xp1Var, "The Inspector Manager must not be null");
        this.f18316a = xp1Var;
    }

    @Override // com.google.android.gms.internal.ads.gy
    public final void a(Object obj, Map map) throws NumberFormatException {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j10 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j10 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.f18316a.i((String) map.get("extras"), j10);
    }
}
