package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e63 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f7654a;

    /* renamed from: b, reason: collision with root package name */
    int f7655b;

    /* renamed from: c, reason: collision with root package name */
    d63 f7656c;

    public e63() {
        this(4);
    }

    e63(int i10) {
        this.f7654a = new Object[i10 + i10];
        this.f7655b = 0;
    }

    private final void d(int i10) {
        Object[] objArr = this.f7654a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f7654a = Arrays.copyOf(objArr, w53.b(length, i11));
        }
    }

    public final e63 a(Object obj, Object obj2) {
        d(this.f7655b + 1);
        y43.b(obj, obj2);
        Object[] objArr = this.f7654a;
        int i10 = this.f7655b;
        int i11 = i10 + i10;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.f7655b = i10 + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e63 b(Iterable iterable) {
        if (iterable instanceof Collection) {
            d(this.f7655b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final f63 c() {
        d63 d63Var = this.f7656c;
        if (d63Var != null) {
            throw d63Var.a();
        }
        q73 q73VarJ = q73.j(this.f7655b, this.f7654a, this);
        d63 d63Var2 = this.f7656c;
        if (d63Var2 == null) {
            return q73VarJ;
        }
        throw d63Var2.a();
    }
}
