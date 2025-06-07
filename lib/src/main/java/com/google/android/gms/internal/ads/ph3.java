package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class ph3 extends r53 {

    /* renamed from: m, reason: collision with root package name */
    private final Map f13893m;

    public ph3(Map map) {
        this.f13893m = map;
    }

    @Override // com.google.android.gms.internal.ads.r53, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return super.l(obj);
    }

    @Override // com.google.android.gms.internal.ads.r53, java.util.Map
    public final Set entrySet() {
        return y73.b(this.f13893m.entrySet(), new j33() { // from class: com.google.android.gms.internal.ads.nf3
            @Override // com.google.android.gms.internal.ads.j33
            public final boolean a(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && super.m(obj);
    }

    @Override // com.google.android.gms.internal.ads.s53
    protected final /* synthetic */ Object g() {
        return this.f13893m;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f13893m.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return super.k();
    }

    @Override // com.google.android.gms.internal.ads.r53
    protected final Map i() {
        return this.f13893m;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f13893m.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return y73.b(this.f13893m.keySet(), new j33() { // from class: com.google.android.gms.internal.ads.og3
            @Override // com.google.android.gms.internal.ads.j33
            public final boolean a(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.r53, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
