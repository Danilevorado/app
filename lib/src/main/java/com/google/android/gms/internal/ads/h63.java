package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class h63 extends x53 implements Set {

    /* renamed from: n, reason: collision with root package name */
    private transient c63 f9035n;

    h63() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h63 D(int i10, Object... objArr) {
        if (i10 == 0) {
            return r73.f14656u;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new z73(obj);
        }
        int iP = p(i10);
        Object[] objArr2 = new Object[iP];
        int i11 = iP - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            j73.a(obj2, i14);
            int iHashCode = obj2.hashCode();
            int iA = u53.a(iHashCode);
            while (true) {
                int i15 = iA & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iA++;
                }
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new z73(obj4);
        }
        if (p(i13) < iP / 2) {
            return D(i13, objArr);
        }
        if (E(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new r73(objArr, i12, objArr2, i11, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean E(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    static int p(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            i33.f(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static g63 s(int i10) {
        return new g63(i10);
    }

    public static h63 u(Collection collection) {
        Object[] array = collection.toArray();
        return D(array.length, array);
    }

    public static h63 v() {
        return r73.f14656u;
    }

    public static h63 x(Object obj) {
        return new z73(obj);
    }

    public static h63 y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return D(5, obj, obj2, obj3, obj4, obj5);
    }

    public static h63 z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return D(12, objArr2);
    }

    boolean B() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof h63) && B() && ((h63) obj).B() && hashCode() != obj.hashCode()) {
            return false;
        }
        return y73.c(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return y73.a(this);
    }

    @Override // com.google.android.gms.internal.ads.x53
    public c63 k() {
        c63 c63Var = this.f9035n;
        if (c63Var != null) {
            return c63Var;
        }
        c63 c63VarQ = q();
        this.f9035n = c63VarQ;
        return c63VarQ;
    }

    @Override // com.google.android.gms.internal.ads.x53
    public abstract c83 l();

    c63 q() {
        Object[] array = toArray();
        int i10 = c63.f6792o;
        return c63.q(array, array.length);
    }
}
