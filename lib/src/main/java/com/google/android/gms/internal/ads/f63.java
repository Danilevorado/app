package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class f63 implements Map, Serializable {

    /* renamed from: m, reason: collision with root package name */
    private transient h63 f8138m;

    /* renamed from: n, reason: collision with root package name */
    private transient h63 f8139n;

    /* renamed from: o, reason: collision with root package name */
    private transient x53 f8140o;

    f63() {
    }

    public static f63 c(Map map) {
        Set setEntrySet = map.entrySet();
        e63 e63Var = new e63(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        e63Var.b(setEntrySet);
        return e63Var.c();
    }

    public static f63 d() {
        return q73.f14178s;
    }

    abstract x53 a();

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final x53 values() {
        x53 x53Var = this.f8140o;
        if (x53Var != null) {
            return x53Var;
        }
        x53 x53VarA = a();
        this.f8140o = x53VarA;
        return x53VarA;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract h63 e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return x63.b(this, obj);
    }

    abstract h63 f();

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final h63 entrySet() {
        h63 h63Var = this.f8138m;
        if (h63Var != null) {
            return h63Var;
        }
        h63 h63VarE = e();
        this.f8138m = h63VarE;
        return h63VarE;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final h63 keySet() {
        h63 h63Var = this.f8139n;
        if (h63Var != null) {
            return h63Var;
        }
        h63 h63VarF = f();
        this.f8139n = h63VarF;
        return h63VarF;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return y73.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        y43.a(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }
}
