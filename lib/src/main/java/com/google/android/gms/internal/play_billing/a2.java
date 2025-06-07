package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class a2 implements Iterator {

    /* renamed from: m, reason: collision with root package name */
    private final Iterator f19455m;

    public a2(Iterator it) {
        this.f19455m = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19455m.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f19455m.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f19455m.remove();
    }
}
