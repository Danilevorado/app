package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class n extends g implements Set {

    /* renamed from: n, reason: collision with root package name */
    private transient j f19606n;

    n() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return v.a(this);
    }

    @Override // com.google.android.gms.internal.play_billing.g
    public j k() {
        j jVar = this.f19606n;
        if (jVar != null) {
            return jVar;
        }
        j jVarO = o();
        this.f19606n = jVarO;
        return jVarO;
    }

    j o() {
        Object[] array = toArray();
        int i10 = j.f19556o;
        return j.p(array, array.length);
    }
}
