package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class vg {

    /* renamed from: a, reason: collision with root package name */
    private List f16682a = Collections.emptyList();

    public final List a() {
        List list = this.f16682a;
        this.f16682a = Collections.emptyList();
        return list;
    }

    public final void b(List list) {
        this.f16682a = new ArrayList(list);
    }
}
