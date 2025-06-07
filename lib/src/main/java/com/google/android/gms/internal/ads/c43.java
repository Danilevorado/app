package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
abstract class c43 extends u43 implements n63 {
    protected c43(Map map) {
        super(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.u43
    final Collection j(Collection collection) {
        return Collections.unmodifiableList(collection);
    }

    @Override // com.google.android.gms.internal.ads.u43
    final Collection k(Object obj, Collection collection) {
        return m(obj, (List) collection, null);
    }
}
