package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class k53 extends AbstractMap implements Serializable {

    /* renamed from: v, reason: collision with root package name */
    private static final Object f10823v = new Object();

    /* renamed from: m, reason: collision with root package name */
    private transient Object f10824m;

    /* renamed from: n, reason: collision with root package name */
    transient int[] f10825n;

    /* renamed from: o, reason: collision with root package name */
    transient Object[] f10826o;

    /* renamed from: p, reason: collision with root package name */
    transient Object[] f10827p;

    /* renamed from: q, reason: collision with root package name */
    private transient int f10828q;

    /* renamed from: r, reason: collision with root package name */
    private transient int f10829r;

    /* renamed from: s, reason: collision with root package name */
    private transient Set f10830s;

    /* renamed from: t, reason: collision with root package name */
    private transient Set f10831t;

    /* renamed from: u, reason: collision with root package name */
    private transient Collection f10832u;

    k53(int i10) {
        n(8);
    }

    static /* synthetic */ Object h(k53 k53Var) {
        Object obj = k53Var.f10824m;
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int q() {
        return (1 << (this.f10828q & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r(Object obj) {
        if (p()) {
            return -1;
        }
        int iB = u53.b(obj);
        int iQ = q();
        Object obj2 = this.f10824m;
        obj2.getClass();
        int iC = l53.c(obj2, iB & iQ);
        if (iC != 0) {
            int i10 = ~iQ;
            int i11 = iB & i10;
            do {
                int i12 = iC - 1;
                int[] iArr = this.f10825n;
                iArr.getClass();
                int i13 = iArr[i12];
                if ((i13 & i10) == i11) {
                    Object[] objArr = this.f10826o;
                    objArr.getClass();
                    if (d33.a(obj, objArr[i12])) {
                        return i12;
                    }
                }
                iC = i13 & iQ;
            } while (iC != 0);
        }
        return -1;
    }

    private final int s(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object objD = l53.d(i11);
        if (i13 != 0) {
            l53.e(objD, i12 & i14, i13 + 1);
        }
        Object obj = this.f10824m;
        obj.getClass();
        int[] iArr = this.f10825n;
        iArr.getClass();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iC = l53.c(obj, i15);
            while (iC != 0) {
                int i16 = iC - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iC2 = l53.c(objD, i19);
                l53.e(objD, i19, iC);
                iArr[i16] = ((~i14) & i18) | (iC2 & i14);
                iC = i17 & i10;
            }
        }
        this.f10824m = objD;
        u(i14);
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(Object obj) {
        if (p()) {
            return f10823v;
        }
        int iQ = q();
        Object obj2 = this.f10824m;
        obj2.getClass();
        int[] iArr = this.f10825n;
        iArr.getClass();
        Object[] objArr = this.f10826o;
        objArr.getClass();
        int iB = l53.b(obj, null, iQ, obj2, iArr, objArr, null);
        if (iB == -1) {
            return f10823v;
        }
        Object[] objArr2 = this.f10827p;
        objArr2.getClass();
        Object obj3 = objArr2[iB];
        o(iB, iQ);
        this.f10829r--;
        m();
        return obj3;
    }

    private final void u(int i10) {
        this.f10828q = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.f10828q & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (p()) {
            return;
        }
        m();
        Map mapK = k();
        if (mapK == null) {
            Object[] objArr = this.f10826o;
            objArr.getClass();
            Arrays.fill(objArr, 0, this.f10829r, (Object) null);
            Object[] objArr2 = this.f10827p;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, this.f10829r, (Object) null);
            Object obj = this.f10824m;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            int[] iArr = this.f10825n;
            iArr.getClass();
            Arrays.fill(iArr, 0, this.f10829r, 0);
        } else {
            this.f10828q = k83.b(size(), 3, 1073741823);
            mapK.clear();
            this.f10824m = null;
        }
        this.f10829r = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapK = k();
        return mapK != null ? mapK.containsKey(obj) : r(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapK = k();
        if (mapK != null) {
            return mapK.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f10829r; i10++) {
            Object[] objArr = this.f10827p;
            objArr.getClass();
            if (d33.a(obj, objArr[i10])) {
                return true;
            }
        }
        return false;
    }

    final int e() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f10831t;
        if (set != null) {
            return set;
        }
        e53 e53Var = new e53(this);
        this.f10831t = e53Var;
        return e53Var;
    }

    final int f(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f10829r) {
            return i11;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapK = k();
        if (mapK != null) {
            return mapK.get(obj);
        }
        int iR = r(obj);
        if (iR == -1) {
            return null;
        }
        Object[] objArr = this.f10827p;
        objArr.getClass();
        return objArr[iR];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    final Map k() {
        Object obj = this.f10824m;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f10830s;
        if (set != null) {
            return set;
        }
        h53 h53Var = new h53(this);
        this.f10830s = h53Var;
        return h53Var;
    }

    final void m() {
        this.f10828q += 32;
    }

    final void n(int i10) {
        this.f10828q = k83.b(8, 1, 1073741823);
    }

    final void o(int i10, int i11) {
        Object obj = this.f10824m;
        obj.getClass();
        int[] iArr = this.f10825n;
        iArr.getClass();
        Object[] objArr = this.f10826o;
        objArr.getClass();
        Object[] objArr2 = this.f10827p;
        objArr2.getClass();
        int size = size() - 1;
        if (i10 >= size) {
            objArr[i10] = null;
            objArr2[i10] = null;
            iArr[i10] = 0;
            return;
        }
        Object obj2 = objArr[size];
        objArr[i10] = obj2;
        objArr2[i10] = objArr2[size];
        objArr[size] = null;
        objArr2[size] = null;
        iArr[i10] = iArr[size];
        iArr[size] = 0;
        int iB = u53.b(obj2) & i11;
        int iC = l53.c(obj, iB);
        int i12 = size + 1;
        if (iC == i12) {
            l53.e(obj, iB, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iC - 1;
            int i14 = iArr[i13];
            int i15 = i14 & i11;
            if (i15 == i12) {
                iArr[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                return;
            }
            iC = i15;
        }
    }

    final boolean p() {
        return this.f10824m == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        if (p()) {
            i33.i(p(), "Arrays already allocated");
            int i10 = this.f10828q;
            int iMax = Math.max(i10 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f10824m = l53.d(iMax2);
            u(iMax2 - 1);
            this.f10825n = new int[i10];
            this.f10826o = new Object[i10];
            this.f10827p = new Object[i10];
        }
        Map mapK = k();
        if (mapK != null) {
            return mapK.put(obj, obj2);
        }
        int[] iArr = this.f10825n;
        iArr.getClass();
        Object[] objArr = this.f10826o;
        objArr.getClass();
        Object[] objArr2 = this.f10827p;
        objArr2.getClass();
        int i11 = this.f10829r;
        int i12 = i11 + 1;
        int iB = u53.b(obj);
        int iQ = q();
        int i13 = iB & iQ;
        Object obj3 = this.f10824m;
        obj3.getClass();
        int iC = l53.c(obj3, i13);
        if (iC != 0) {
            int i14 = ~iQ;
            int i15 = iB & i14;
            int i16 = 0;
            while (true) {
                int i17 = iC - 1;
                int i18 = iArr[i17];
                int i19 = i18 & i14;
                if (i19 == i15 && d33.a(obj, objArr[i17])) {
                    Object obj4 = objArr2[i17];
                    objArr2[i17] = obj2;
                    return obj4;
                }
                int i20 = i18 & iQ;
                i16++;
                if (i20 != 0) {
                    iC = i20;
                } else {
                    if (i16 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q() + 1, 1.0f);
                        int iE = e();
                        while (iE >= 0) {
                            Object[] objArr3 = this.f10826o;
                            objArr3.getClass();
                            Object obj5 = objArr3[iE];
                            Object[] objArr4 = this.f10827p;
                            objArr4.getClass();
                            linkedHashMap.put(obj5, objArr4[iE]);
                            iE = f(iE);
                        }
                        this.f10824m = linkedHashMap;
                        this.f10825n = null;
                        this.f10826o = null;
                        this.f10827p = null;
                        m();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i12 <= iQ) {
                        iArr[i17] = (i12 & iQ) | i19;
                    }
                }
            }
        } else if (i12 > iQ) {
            iQ = s(iQ, l53.a(iQ), iB, i11);
        } else {
            Object obj6 = this.f10824m;
            obj6.getClass();
            l53.e(obj6, i13, i12);
        }
        int[] iArr2 = this.f10825n;
        iArr2.getClass();
        int length = iArr2.length;
        if (i12 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr3 = this.f10825n;
            iArr3.getClass();
            this.f10825n = Arrays.copyOf(iArr3, iMin);
            Object[] objArr5 = this.f10826o;
            objArr5.getClass();
            this.f10826o = Arrays.copyOf(objArr5, iMin);
            Object[] objArr6 = this.f10827p;
            objArr6.getClass();
            this.f10827p = Arrays.copyOf(objArr6, iMin);
        }
        int i21 = (~iQ) & iB;
        int[] iArr4 = this.f10825n;
        iArr4.getClass();
        iArr4[i11] = i21;
        Object[] objArr7 = this.f10826o;
        objArr7.getClass();
        objArr7[i11] = obj;
        Object[] objArr8 = this.f10827p;
        objArr8.getClass();
        objArr8[i11] = obj2;
        this.f10829r = i12;
        m();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapK = k();
        if (mapK != null) {
            return mapK.remove(obj);
        }
        Object objT = t(obj);
        if (objT == f10823v) {
            return null;
        }
        return objT;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapK = k();
        return mapK != null ? mapK.size() : this.f10829r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f10832u;
        if (collection != null) {
            return collection;
        }
        j53 j53Var = new j53(this);
        this.f10832u = j53Var;
        return j53Var;
    }
}
