package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class yr {

    /* renamed from: a, reason: collision with root package name */
    private final Map f18249a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final as f18250b;

    public yr(as asVar) {
        this.f18250b = asVar;
    }

    public final as a() {
        return this.f18250b;
    }

    public final void b(String str, xr xrVar) {
        this.f18249a.put(str, xrVar);
    }

    public final void c(String str, String str2, long j10) {
        as asVar = this.f18250b;
        xr xrVar = (xr) this.f18249a.get(str2);
        String[] strArr = {str};
        if (xrVar != null) {
            asVar.e(xrVar, j10, strArr);
        }
        this.f18249a.put(str, new xr(j10, null, null));
    }
}
