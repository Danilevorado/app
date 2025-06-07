package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
abstract class v53 extends w53 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f16594a;

    /* renamed from: b, reason: collision with root package name */
    int f16595b = 0;

    /* renamed from: c, reason: collision with root package name */
    boolean f16596c;

    v53(int i10) {
        this.f16594a = new Object[i10];
    }

    private final void f(int i10) {
        Object[] objArr = this.f16594a;
        int length = objArr.length;
        if (length < i10) {
            this.f16594a = Arrays.copyOf(objArr, w53.b(length, i10));
        } else if (!this.f16596c) {
            return;
        } else {
            this.f16594a = (Object[]) objArr.clone();
        }
        this.f16596c = false;
    }

    public final v53 c(Object obj) {
        Objects.requireNonNull(obj);
        f(this.f16595b + 1);
        Object[] objArr = this.f16594a;
        int i10 = this.f16595b;
        this.f16595b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    public final w53 d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(this.f16595b + collection.size());
            if (collection instanceof x53) {
                this.f16595b = ((x53) collection).e(this.f16594a, this.f16595b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    final void e(Object[] objArr, int i10) {
        j73.b(objArr, 2);
        f(this.f16595b + 2);
        System.arraycopy(objArr, 0, this.f16594a, this.f16595b, 2);
        this.f16595b += 2;
    }
}
