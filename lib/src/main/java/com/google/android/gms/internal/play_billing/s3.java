package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
abstract class s3 extends AbstractMap {

    /* renamed from: m, reason: collision with root package name */
    private final int f19641m;

    /* renamed from: p, reason: collision with root package name */
    private boolean f19644p;

    /* renamed from: q, reason: collision with root package name */
    private volatile q3 f19645q;

    /* renamed from: n, reason: collision with root package name */
    private List f19642n = Collections.emptyList();

    /* renamed from: o, reason: collision with root package name */
    private Map f19643o = Collections.emptyMap();

    /* renamed from: r, reason: collision with root package name */
    private Map f19646r = Collections.emptyMap();

    private final int k(Comparable comparable) {
        int size = this.f19642n.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int iCompareTo = comparable.compareTo(((m3) this.f19642n.get(size)).b());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int iCompareTo2 = comparable.compareTo(((m3) this.f19642n.get(i11)).b());
            if (iCompareTo2 < 0) {
                size = i11 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i11;
                }
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object l(int i10) {
        n();
        Object value = ((m3) this.f19642n.remove(i10)).getValue();
        if (!this.f19643o.isEmpty()) {
            Iterator it = m().entrySet().iterator();
            List list = this.f19642n;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new m3(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap m() {
        n();
        if (this.f19643o.isEmpty() && !(this.f19643o instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f19643o = treeMap;
            this.f19646r = treeMap.descendingMap();
        }
        return (SortedMap) this.f19643o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        if (this.f19644p) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f19644p) {
            return;
        }
        this.f19643o = this.f19643o.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f19643o);
        this.f19646r = this.f19646r.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f19646r);
        this.f19644p = true;
    }

    public final int b() {
        return this.f19642n.size();
    }

    public final Iterable c() {
        return this.f19643o.isEmpty() ? l3.a() : this.f19643o.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        n();
        if (!this.f19642n.isEmpty()) {
            this.f19642n.clear();
        }
        if (this.f19643o.isEmpty()) {
            return;
        }
        this.f19643o.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return k(comparable) >= 0 || this.f19643o.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        n();
        int iK = k(comparable);
        if (iK >= 0) {
            return ((m3) this.f19642n.get(iK)).setValue(obj);
        }
        n();
        if (this.f19642n.isEmpty() && !(this.f19642n instanceof ArrayList)) {
            this.f19642n = new ArrayList(this.f19641m);
        }
        int i10 = -(iK + 1);
        if (i10 >= this.f19641m) {
            return m().put(comparable, obj);
        }
        int size = this.f19642n.size();
        int i11 = this.f19641m;
        if (size == i11) {
            m3 m3Var = (m3) this.f19642n.remove(i11 - 1);
            m().put(m3Var.b(), m3Var.getValue());
        }
        this.f19642n.add(i10, new m3(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f19645q == null) {
            this.f19645q = new q3(this, null);
        }
        return this.f19645q;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object objEntrySet;
        Object objEntrySet2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return super.equals(obj);
        }
        s3 s3Var = (s3) obj;
        int size = size();
        if (size != s3Var.size()) {
            return false;
        }
        int iB = b();
        if (iB == s3Var.b()) {
            for (int i10 = 0; i10 < iB; i10++) {
                if (!g(i10).equals(s3Var.g(i10))) {
                    return false;
                }
            }
            if (iB == size) {
                return true;
            }
            objEntrySet = this.f19643o;
            objEntrySet2 = s3Var.f19643o;
        } else {
            objEntrySet = entrySet();
            objEntrySet2 = s3Var.entrySet();
        }
        return objEntrySet.equals(objEntrySet2);
    }

    public final Map.Entry g(int i10) {
        return (Map.Entry) this.f19642n.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iK = k(comparable);
        return iK >= 0 ? ((m3) this.f19642n.get(iK)).getValue() : this.f19643o.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iB = b();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            iHashCode += ((m3) this.f19642n.get(i10)).hashCode();
        }
        return this.f19643o.size() > 0 ? iHashCode + this.f19643o.hashCode() : iHashCode;
    }

    public final boolean j() {
        return this.f19644p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        n();
        Comparable comparable = (Comparable) obj;
        int iK = k(comparable);
        if (iK >= 0) {
            return l(iK);
        }
        if (this.f19643o.isEmpty()) {
            return null;
        }
        return this.f19643o.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f19642n.size() + this.f19643o.size();
    }
}
