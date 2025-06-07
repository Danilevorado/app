package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class ja {

    /* renamed from: a, reason: collision with root package name */
    public final int f10396a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10397b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f10398c;

    /* renamed from: d, reason: collision with root package name */
    public final List f10399d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10400e;

    private ja(int i10, byte[] bArr, Map map, List list, boolean z10, long j10) {
        this.f10396a = i10;
        this.f10397b = bArr;
        this.f10398c = map;
        this.f10399d = list == null ? null : Collections.unmodifiableList(list);
        this.f10400e = z10;
    }

    public ja(int i10, byte[] bArr, Map map, boolean z10, long j10) {
        this(i10, bArr, map, a(map), z10, j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ja(int i10, byte[] bArr, boolean z10, long j10, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fa faVar = (fa) it.next();
                treeMap.put(faVar.a(), faVar.b());
            }
        }
        this(i10, bArr, treeMap, list, z10, j10);
    }

    public ja(byte[] bArr, Map map) {
        this(200, bArr, map, a(map), false, 0L);
    }

    private static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new fa((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }
}
