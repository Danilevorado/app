package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g44 extends y34 {

    /* renamed from: b, reason: collision with root package name */
    private static final q44 f8606b = d44.a(Collections.emptyMap());

    /* synthetic */ g44(Map map, e44 e44Var) {
        super(map);
    }

    public static f44 c(int i10) {
        return new f44(i10, null);
    }

    @Override // com.google.android.gms.internal.ads.q44
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Map b() {
        LinkedHashMap linkedHashMapB = z34.b(a().size());
        for (Map.Entry entry : a().entrySet()) {
            linkedHashMapB.put(entry.getKey(), ((q44) entry.getValue()).b());
        }
        return Collections.unmodifiableMap(linkedHashMapB);
    }
}
