package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes.dex */
final class d7 implements b7 {

    /* renamed from: m, reason: collision with root package name */
    volatile b7 f18901m;

    /* renamed from: n, reason: collision with root package name */
    volatile boolean f18902n;

    /* renamed from: o, reason: collision with root package name */
    Object f18903o;

    d7(b7 b7Var) {
        Objects.requireNonNull(b7Var);
        this.f18901m = b7Var;
    }

    @Override // com.google.android.gms.internal.measurement.b7
    public final Object a() {
        if (!this.f18902n) {
            synchronized (this) {
                if (!this.f18902n) {
                    b7 b7Var = this.f18901m;
                    b7Var.getClass();
                    Object objA = b7Var.a();
                    this.f18903o = objA;
                    this.f18902n = true;
                    this.f18901m = null;
                    return objA;
                }
            }
        }
        return this.f18903o;
    }

    public final String toString() {
        Object obj = this.f18901m;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.f18903o + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
