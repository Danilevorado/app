package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes.dex */
final class c7 implements Serializable, b7 {

    /* renamed from: m, reason: collision with root package name */
    final b7 f18875m;

    /* renamed from: n, reason: collision with root package name */
    volatile transient boolean f18876n;

    /* renamed from: o, reason: collision with root package name */
    transient Object f18877o;

    c7(b7 b7Var) {
        Objects.requireNonNull(b7Var);
        this.f18875m = b7Var;
    }

    @Override // com.google.android.gms.internal.measurement.b7
    public final Object a() {
        if (!this.f18876n) {
            synchronized (this) {
                if (!this.f18876n) {
                    Object objA = this.f18875m.a();
                    this.f18877o = objA;
                    this.f18876n = true;
                    return objA;
                }
            }
        }
        return this.f18877o;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Suppliers.memoize(");
        if (this.f18876n) {
            obj = "<supplier that returned " + this.f18877o + ">";
        } else {
            obj = this.f18875m;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
