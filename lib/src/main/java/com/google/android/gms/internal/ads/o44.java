package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class o44 implements c44 {

    /* renamed from: c, reason: collision with root package name */
    private static final c44 f13001c = d44.a(Collections.emptySet());

    /* renamed from: a, reason: collision with root package name */
    private final List f13002a;

    /* renamed from: b, reason: collision with root package name */
    private final List f13003b;

    /* synthetic */ o44(List list, List list2, l44 l44Var) {
        this.f13002a = list;
        this.f13003b = list2;
    }

    public static m44 a(int i10, int i11) {
        return new m44(i10, i11, null);
    }

    @Override // com.google.android.gms.internal.ads.q44
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Set b() {
        int size = this.f13002a.size();
        ArrayList arrayList = new ArrayList(this.f13003b.size());
        int size2 = this.f13003b.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection collection = (Collection) ((q44) this.f13003b.get(i10)).b();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetA = z34.a(size);
        int size3 = this.f13002a.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object objB = ((q44) this.f13002a.get(i11)).b();
            Objects.requireNonNull(objB);
            hashSetA.add(objB);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object obj : (Collection) arrayList.get(i12)) {
                Objects.requireNonNull(obj);
                hashSetA.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSetA);
    }
}
