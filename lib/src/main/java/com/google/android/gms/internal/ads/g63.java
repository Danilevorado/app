package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g63 extends v53 {

    /* renamed from: d, reason: collision with root package name */
    Object[] f8632d;

    /* renamed from: e, reason: collision with root package name */
    private int f8633e;

    g63(int i10) {
        super(i10);
        this.f8632d = new Object[h63.p(i10)];
    }

    @Override // com.google.android.gms.internal.ads.w53
    public final /* bridge */ /* synthetic */ w53 a(Object obj) {
        g(obj);
        return this;
    }

    public final g63 g(Object obj) {
        Objects.requireNonNull(obj);
        if (this.f8632d != null) {
            int iP = h63.p(this.f16595b);
            int length = this.f8632d.length;
            if (iP <= length) {
                int iHashCode = obj.hashCode();
                int iA = u53.a(iHashCode);
                while (true) {
                    Object[] objArr = this.f8632d;
                    int i10 = iA & (length - 1);
                    Object obj2 = objArr[i10];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        iA = i10 + 1;
                    } else {
                        objArr[i10] = obj;
                        this.f8633e += iHashCode;
                        super.c(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.f8632d = null;
        super.c(obj);
        return this;
    }

    public final g63 h(Iterable iterable) {
        if (this.f8632d != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
        } else {
            super.d(iterable);
        }
        return this;
    }

    public final h63 i() {
        h63 h63VarD;
        int i10 = this.f16595b;
        if (i10 == 0) {
            return r73.f14656u;
        }
        if (i10 == 1) {
            Object obj = this.f16594a[0];
            obj.getClass();
            return new z73(obj);
        }
        if (this.f8632d == null || h63.p(i10) != this.f8632d.length) {
            h63VarD = h63.D(this.f16595b, this.f16594a);
            this.f16595b = h63VarD.size();
        } else {
            int i11 = this.f16595b;
            Object[] objArrCopyOf = this.f16594a;
            if (h63.E(i11, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
            }
            h63VarD = new r73(objArrCopyOf, this.f8633e, this.f8632d, r6.length - 1, this.f16595b);
        }
        this.f16596c = true;
        this.f8632d = null;
        return h63VarD;
    }
}
