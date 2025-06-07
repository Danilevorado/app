package q;

/* loaded from: classes.dex */
public class d implements Cloneable {

    /* renamed from: q, reason: collision with root package name */
    private static final Object f26032q = new Object();

    /* renamed from: m, reason: collision with root package name */
    private boolean f26033m;

    /* renamed from: n, reason: collision with root package name */
    private long[] f26034n;

    /* renamed from: o, reason: collision with root package name */
    private Object[] f26035o;

    /* renamed from: p, reason: collision with root package name */
    private int f26036p;

    public d() {
        this(10);
    }

    public d(int i10) {
        this.f26033m = false;
        if (i10 == 0) {
            this.f26034n = c.f26030b;
            this.f26035o = c.f26031c;
        } else {
            int iF = c.f(i10);
            this.f26034n = new long[iF];
            this.f26035o = new Object[iF];
        }
    }

    private void d() {
        int i10 = this.f26036p;
        long[] jArr = this.f26034n;
        Object[] objArr = this.f26035o;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f26032q) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f26033m = false;
        this.f26036p = i11;
    }

    public void a(long j10, Object obj) {
        int i10 = this.f26036p;
        if (i10 != 0 && j10 <= this.f26034n[i10 - 1]) {
            k(j10, obj);
            return;
        }
        if (this.f26033m && i10 >= this.f26034n.length) {
            d();
        }
        int i11 = this.f26036p;
        if (i11 >= this.f26034n.length) {
            int iF = c.f(i11 + 1);
            long[] jArr = new long[iF];
            Object[] objArr = new Object[iF];
            long[] jArr2 = this.f26034n;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f26035o;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f26034n = jArr;
            this.f26035o = objArr;
        }
        this.f26034n[i11] = j10;
        this.f26035o[i11] = obj;
        this.f26036p = i11 + 1;
    }

    public void b() {
        int i10 = this.f26036p;
        Object[] objArr = this.f26035o;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f26036p = 0;
        this.f26033m = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            d dVar = (d) super.clone();
            dVar.f26034n = (long[]) this.f26034n.clone();
            dVar.f26035o = (Object[]) this.f26035o.clone();
            return dVar;
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    public Object f(long j10) {
        return g(j10, null);
    }

    public Object g(long j10, Object obj) {
        int iB = c.b(this.f26034n, this.f26036p, j10);
        if (iB >= 0) {
            Object[] objArr = this.f26035o;
            if (objArr[iB] != f26032q) {
                return objArr[iB];
            }
        }
        return obj;
    }

    public int i(long j10) {
        if (this.f26033m) {
            d();
        }
        return c.b(this.f26034n, this.f26036p, j10);
    }

    public long j(int i10) {
        if (this.f26033m) {
            d();
        }
        return this.f26034n[i10];
    }

    public void k(long j10, Object obj) {
        int iB = c.b(this.f26034n, this.f26036p, j10);
        if (iB >= 0) {
            this.f26035o[iB] = obj;
            return;
        }
        int i10 = ~iB;
        int i11 = this.f26036p;
        if (i10 < i11) {
            Object[] objArr = this.f26035o;
            if (objArr[i10] == f26032q) {
                this.f26034n[i10] = j10;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f26033m && i11 >= this.f26034n.length) {
            d();
            i10 = ~c.b(this.f26034n, this.f26036p, j10);
        }
        int i12 = this.f26036p;
        if (i12 >= this.f26034n.length) {
            int iF = c.f(i12 + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.f26034n;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f26035o;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f26034n = jArr;
            this.f26035o = objArr2;
        }
        int i13 = this.f26036p;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f26034n;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f26035o;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f26036p - i10);
        }
        this.f26034n[i10] = j10;
        this.f26035o[i10] = obj;
        this.f26036p++;
    }

    public void m(long j10) {
        int iB = c.b(this.f26034n, this.f26036p, j10);
        if (iB >= 0) {
            Object[] objArr = this.f26035o;
            Object obj = objArr[iB];
            Object obj2 = f26032q;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f26033m = true;
            }
        }
    }

    public void r(int i10) {
        Object[] objArr = this.f26035o;
        Object obj = objArr[i10];
        Object obj2 = f26032q;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f26033m = true;
        }
    }

    public int s() {
        if (this.f26033m) {
            d();
        }
        return this.f26036p;
    }

    public Object t(int i10) {
        if (this.f26033m) {
            d();
        }
        return this.f26035o[i10];
    }

    public String toString() {
        if (s() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f26036p * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f26036p; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(j(i10));
            sb2.append('=');
            Object objT = t(i10);
            if (objT != this) {
                sb2.append(objT);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
