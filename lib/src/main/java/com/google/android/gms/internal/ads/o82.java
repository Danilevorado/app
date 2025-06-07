package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class o82 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final Set f13060a;

    o82(Set set) {
        this.f13060a = set;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        final ArrayList arrayList = new ArrayList();
        Iterator it = this.f13060a.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return qa3.h(new je2() { // from class: com.google.android.gms.internal.ads.n82
            @Override // com.google.android.gms.internal.ads.je2
            public final void c(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
