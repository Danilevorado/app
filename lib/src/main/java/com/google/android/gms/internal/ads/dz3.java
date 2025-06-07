package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class dz3 extends LinkedHashMap {

    /* renamed from: n, reason: collision with root package name */
    private static final dz3 f7567n;

    /* renamed from: m, reason: collision with root package name */
    private boolean f7568m;

    static {
        dz3 dz3Var = new dz3();
        f7567n = dz3Var;
        dz3Var.f7568m = false;
    }

    private dz3() {
        this.f7568m = true;
    }

    private dz3(Map map) {
        super(map);
        this.f7568m = true;
    }

    public static dz3 a() {
        return f7567n;
    }

    private static int g(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof dy3) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = ly3.f11871d;
        int length = bArr.length;
        int iB = ly3.b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    private final void j() {
        if (!this.f7568m) {
            throw new UnsupportedOperationException();
        }
    }

    public final dz3 b() {
        return isEmpty() ? new dz3() : new dz3(this);
    }

    public final void c() {
        this.f7568m = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        j();
        super.clear();
    }

    public final void d(dz3 dz3Var) {
        j();
        if (dz3Var.isEmpty()) {
            return;
        }
        putAll(dz3Var);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return this.f7568m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iG = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iG += g(entry.getValue()) ^ g(entry.getKey());
        }
        return iG;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        j();
        byte[] bArr = ly3.f11871d;
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        j();
        for (Object obj : map.keySet()) {
            byte[] bArr = ly3.f11871d;
            Objects.requireNonNull(obj);
            Objects.requireNonNull(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        j();
        return super.remove(obj);
    }
}
