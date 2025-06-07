package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class o2 extends LinkedHashMap {

    /* renamed from: n, reason: collision with root package name */
    private static final o2 f19613n;

    /* renamed from: m, reason: collision with root package name */
    private boolean f19614m;

    static {
        o2 o2Var = new o2();
        f19613n = o2Var;
        o2Var.f19614m = false;
    }

    private o2() {
        this.f19614m = true;
    }

    private o2(Map map) {
        super(map);
        this.f19614m = true;
    }

    public static o2 a() {
        return f19613n;
    }

    private static int g(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof p1) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = v1.f19661d;
        int length = bArr.length;
        int iB = v1.b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    private final void j() {
        if (!this.f19614m) {
            throw new UnsupportedOperationException();
        }
    }

    public final o2 b() {
        return isEmpty() ? new o2() : new o2(this);
    }

    public final void c() {
        this.f19614m = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        j();
        super.clear();
    }

    public final void d(o2 o2Var) {
        j();
        if (o2Var.isEmpty()) {
            return;
        }
        putAll(o2Var);
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
        return this.f19614m;
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
        byte[] bArr = v1.f19661d;
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        j();
        for (Object obj : map.keySet()) {
            byte[] bArr = v1.f19661d;
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
