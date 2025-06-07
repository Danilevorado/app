package q;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class g {

    /* renamed from: p, reason: collision with root package name */
    static Object[] f26060p;

    /* renamed from: q, reason: collision with root package name */
    static int f26061q;

    /* renamed from: r, reason: collision with root package name */
    static Object[] f26062r;

    /* renamed from: s, reason: collision with root package name */
    static int f26063s;

    /* renamed from: m, reason: collision with root package name */
    int[] f26064m;

    /* renamed from: n, reason: collision with root package name */
    Object[] f26065n;

    /* renamed from: o, reason: collision with root package name */
    int f26066o;

    public g() {
        this.f26064m = c.f26029a;
        this.f26065n = c.f26031c;
        this.f26066o = 0;
    }

    public g(int i10) {
        if (i10 == 0) {
            this.f26064m = c.f26029a;
            this.f26065n = c.f26031c;
        } else {
            a(i10);
        }
        this.f26066o = 0;
    }

    public g(g gVar) {
        this();
        if (gVar != null) {
            j(gVar);
        }
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (g.class) {
                Object[] objArr = f26062r;
                if (objArr != null) {
                    this.f26065n = objArr;
                    f26062r = (Object[]) objArr[0];
                    this.f26064m = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f26063s--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (g.class) {
                Object[] objArr2 = f26060p;
                if (objArr2 != null) {
                    this.f26065n = objArr2;
                    f26060p = (Object[]) objArr2[0];
                    this.f26064m = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f26061q--;
                    return;
                }
            }
        }
        this.f26064m = new int[i10];
        this.f26065n = new Object[i10 << 1];
    }

    private static int b(int[] iArr, int i10, int i11) {
        try {
            return c.a(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                if (f26063s < 10) {
                    objArr[0] = f26062r;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f26062r = objArr;
                    f26063s++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (g.class) {
                if (f26061q < 10) {
                    objArr[0] = f26060p;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f26060p = objArr;
                    f26061q++;
                }
            }
        }
    }

    public void c(int i10) {
        int i11 = this.f26066o;
        int[] iArr = this.f26064m;
        if (iArr.length < i10) {
            Object[] objArr = this.f26065n;
            a(i10);
            if (this.f26066o > 0) {
                System.arraycopy(iArr, 0, this.f26064m, 0, i11);
                System.arraycopy(objArr, 0, this.f26065n, 0, i11 << 1);
            }
            d(iArr, objArr, i11);
        }
        if (this.f26066o != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f26066o;
        if (i10 > 0) {
            int[] iArr = this.f26064m;
            Object[] objArr = this.f26065n;
            this.f26064m = c.f26029a;
            this.f26065n = c.f26031c;
            this.f26066o = 0;
            d(iArr, objArr, i10);
        }
        if (this.f26066o > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    int e(Object obj, int i10) {
        int i11 = this.f26066o;
        if (i11 == 0) {
            return -1;
        }
        int iB = b(this.f26064m, i11, i10);
        if (iB < 0 || obj.equals(this.f26065n[iB << 1])) {
            return iB;
        }
        int i12 = iB + 1;
        while (i12 < i11 && this.f26064m[i12] == i10) {
            if (obj.equals(this.f26065n[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iB - 1; i13 >= 0 && this.f26064m[i13] == i10; i13--) {
            if (obj.equals(this.f26065n[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f26066o; i10++) {
                try {
                    Object objI = i(i10);
                    Object objM = m(i10);
                    Object obj2 = gVar.get(objI);
                    if (objM == null) {
                        if (obj2 != null || !gVar.containsKey(objI)) {
                            return false;
                        }
                    } else if (!objM.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f26066o; i11++) {
                try {
                    Object objI2 = i(i11);
                    Object objM2 = m(i11);
                    Object obj3 = map.get(objI2);
                    if (objM2 == null) {
                        if (obj3 != null || !map.containsKey(objI2)) {
                            return false;
                        }
                    } else if (!objM2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    int g() {
        int i10 = this.f26066o;
        if (i10 == 0) {
            return -1;
        }
        int iB = b(this.f26064m, i10, 0);
        if (iB < 0 || this.f26065n[iB << 1] == null) {
            return iB;
        }
        int i11 = iB + 1;
        while (i11 < i10 && this.f26064m[i11] == 0) {
            if (this.f26065n[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iB - 1; i12 >= 0 && this.f26064m[i12] == 0; i12--) {
            if (this.f26065n[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iF = f(obj);
        return iF >= 0 ? this.f26065n[(iF << 1) + 1] : obj2;
    }

    int h(Object obj) {
        int i10 = this.f26066o * 2;
        Object[] objArr = this.f26065n;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f26064m;
        Object[] objArr = this.f26065n;
        int i10 = this.f26066o;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public Object i(int i10) {
        return this.f26065n[i10 << 1];
    }

    public boolean isEmpty() {
        return this.f26066o <= 0;
    }

    public void j(g gVar) {
        int i10 = gVar.f26066o;
        c(this.f26066o + i10);
        if (this.f26066o != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(gVar.i(i11), gVar.m(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(gVar.f26064m, 0, this.f26064m, 0, i10);
            System.arraycopy(gVar.f26065n, 0, this.f26065n, 0, i10 << 1);
            this.f26066o = i10;
        }
    }

    public Object k(int i10) {
        Object[] objArr = this.f26065n;
        int i11 = i10 << 1;
        Object obj = objArr[i11 + 1];
        int i12 = this.f26066o;
        int i13 = 0;
        if (i12 <= 1) {
            d(this.f26064m, objArr, i12);
            this.f26064m = c.f26029a;
            this.f26065n = c.f26031c;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f26064m;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    int i16 = i14 - i10;
                    System.arraycopy(iArr, i15, iArr, i10, i16);
                    Object[] objArr2 = this.f26065n;
                    System.arraycopy(objArr2, i15 << 1, objArr2, i11, i16 << 1);
                }
                Object[] objArr3 = this.f26065n;
                int i17 = i14 << 1;
                objArr3[i17] = null;
                objArr3[i17 + 1] = null;
            } else {
                a(i12 > 8 ? i12 + (i12 >> 1) : 8);
                if (i12 != this.f26066o) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f26064m, 0, i10);
                    System.arraycopy(objArr, 0, this.f26065n, 0, i11);
                }
                if (i10 < i14) {
                    int i18 = i10 + 1;
                    int i19 = i14 - i10;
                    System.arraycopy(iArr, i18, this.f26064m, i10, i19);
                    System.arraycopy(objArr, i18 << 1, this.f26065n, i11, i19 << 1);
                }
            }
            i13 = i14;
        }
        if (i12 != this.f26066o) {
            throw new ConcurrentModificationException();
        }
        this.f26066o = i13;
        return obj;
    }

    public Object l(int i10, Object obj) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f26065n;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public Object m(int i10) {
        return this.f26065n[(i10 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i10;
        int iE;
        int i11 = this.f26066o;
        if (obj == null) {
            iE = g();
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iE = e(obj, iHashCode);
        }
        if (iE >= 0) {
            int i12 = (iE << 1) + 1;
            Object[] objArr = this.f26065n;
            Object obj3 = objArr[i12];
            objArr[i12] = obj2;
            return obj3;
        }
        int i13 = ~iE;
        int[] iArr = this.f26064m;
        if (i11 >= iArr.length) {
            int i14 = 4;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 >= 4) {
                i14 = 8;
            }
            Object[] objArr2 = this.f26065n;
            a(i14);
            if (i11 != this.f26066o) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f26064m;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f26065n, 0, objArr2.length);
            }
            d(iArr, objArr2, i11);
        }
        if (i13 < i11) {
            int[] iArr3 = this.f26064m;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f26065n;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f26066o - i13) << 1);
        }
        int i16 = this.f26066o;
        if (i11 == i16) {
            int[] iArr4 = this.f26064m;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f26065n;
                int i17 = i13 << 1;
                objArr4[i17] = obj;
                objArr4[i17 + 1] = obj2;
                this.f26066o = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iF = f(obj);
        if (iF >= 0) {
            return k(iF);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            return false;
        }
        Object objM = m(iF);
        if (obj2 != objM && (obj2 == null || !obj2.equals(objM))) {
            return false;
        }
        k(iF);
        return true;
    }

    public Object replace(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF >= 0) {
            return l(iF, obj2);
        }
        return null;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iF = f(obj);
        if (iF < 0) {
            return false;
        }
        Object objM = m(iF);
        if (objM != obj2 && (obj2 == null || !obj2.equals(objM))) {
            return false;
        }
        l(iF, obj3);
        return true;
    }

    public int size() {
        return this.f26066o;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f26066o * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f26066o; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object objI = i(i10);
            if (objI != this) {
                sb2.append(objI);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objM = m(i10);
            if (objM != this) {
                sb2.append(objM);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
