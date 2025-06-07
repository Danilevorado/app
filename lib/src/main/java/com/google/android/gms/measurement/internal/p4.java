package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.bc;
import java.util.Map;

/* loaded from: classes.dex */
final class p4 implements bc {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f20267a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q4 f20268b;

    p4(q4 q4Var, String str) {
        this.f20268b = q4Var;
        this.f20267a = str;
    }

    @Override // com.google.android.gms.internal.measurement.bc
    public final String o(String str) {
        Map map = (Map) this.f20268b.f20289d.get(this.f20267a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
