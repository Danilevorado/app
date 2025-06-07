package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class j63 extends b43 {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Iterator f10324o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ j33 f10325p;

    j63(Iterator it, j33 j33Var) {
        this.f10324o = it;
        this.f10325p = j33Var;
    }

    @Override // com.google.android.gms.internal.ads.b43
    protected final Object b() {
        while (this.f10324o.hasNext()) {
            Object next = this.f10324o.next();
            if (this.f10325p.a(next)) {
                return next;
            }
        }
        c();
        return null;
    }
}
