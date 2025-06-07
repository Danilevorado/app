package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
abstract class w63 extends AbstractMap {

    /* renamed from: m, reason: collision with root package name */
    private transient Set f17001m;

    /* renamed from: n, reason: collision with root package name */
    private transient Collection f17002n;

    w63() {
    }

    abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f17001m;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f17001m = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f17002n;
        if (collection != null) {
            return collection;
        }
        v63 v63Var = new v63(this);
        this.f17002n = v63Var;
        return v63Var;
    }
}
