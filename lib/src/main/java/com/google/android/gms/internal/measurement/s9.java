package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class s9 extends LinkedHashMap {

    /* renamed from: n, reason: collision with root package name */
    private static final s9 f19279n;

    /* renamed from: m, reason: collision with root package name */
    private boolean f19280m;

    static {
        s9 s9Var = new s9();
        f19279n = s9Var;
        s9Var.f19280m = false;
    }

    private s9() {
        this.f19280m = true;
    }

    private s9(Map map) {
        super(map);
        this.f19280m = true;
    }

    public static s9 a() {
        return f19279n;
    }

    private static int g(Object obj) {
        return obj instanceof byte[] ? b9.b((byte[]) obj) : obj.hashCode();
    }

    private final void j() {
        if (!this.f19280m) {
            throw new UnsupportedOperationException();
        }
    }

    public final s9 b() {
        return isEmpty() ? new s9() : new s9(this);
    }

    public final void c() {
        this.f19280m = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        j();
        super.clear();
    }

    public final void d(s9 s9Var) {
        j();
        if (s9Var.isEmpty()) {
            return;
        }
        putAll(s9Var);
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
        return this.f19280m;
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
        b9.e(obj);
        b9.e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        j();
        for (Object obj : map.keySet()) {
            b9.e(obj);
            b9.e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        j();
        return super.remove(obj);
    }
}
