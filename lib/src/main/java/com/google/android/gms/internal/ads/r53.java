package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class r53 extends s53 implements Map {
    protected r53() {
    }

    @Override // java.util.Map
    public final void clear() {
        i().clear();
    }

    public boolean containsKey(Object obj) {
        return i().containsKey(obj);
    }

    public abstract Set entrySet();

    protected abstract Map i();

    protected final int k() {
        return y73.a(entrySet());
    }

    protected final boolean l(Object obj) {
        r63 r63Var = new r63(entrySet().iterator());
        if (obj == null) {
            while (r63Var.hasNext()) {
                if (r63Var.next() == null) {
                    return true;
                }
            }
        } else {
            while (r63Var.hasNext()) {
                if (obj.equals(r63Var.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    protected final boolean m(Object obj) {
        return x63.b(this, obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return i().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        i().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return i().remove(obj);
    }

    public int size() {
        return i().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return i().values();
    }
}
