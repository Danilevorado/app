package q;

/* loaded from: classes.dex */
public class h implements Cloneable {

    /* renamed from: q, reason: collision with root package name */
    private static final Object f26067q = new Object();

    /* renamed from: m, reason: collision with root package name */
    private boolean f26068m;

    /* renamed from: n, reason: collision with root package name */
    private int[] f26069n;

    /* renamed from: o, reason: collision with root package name */
    private Object[] f26070o;

    /* renamed from: p, reason: collision with root package name */
    private int f26071p;

    public h() {
        this(10);
    }

    public h(int i10) {
        this.f26068m = false;
        if (i10 == 0) {
            this.f26069n = c.f26029a;
            this.f26070o = c.f26031c;
        } else {
            int iE = c.e(i10);
            this.f26069n = new int[iE];
            this.f26070o = new Object[iE];
        }
    }

    private void d() {
        int i10 = this.f26071p;
        int[] iArr = this.f26069n;
        Object[] objArr = this.f26070o;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f26067q) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f26068m = false;
        this.f26071p = i11;
    }

    public void a(int i10, Object obj) {
        int i11 = this.f26071p;
        if (i11 != 0 && i10 <= this.f26069n[i11 - 1]) {
            k(i10, obj);
            return;
        }
        if (this.f26068m && i11 >= this.f26069n.length) {
            d();
        }
        int i12 = this.f26071p;
        if (i12 >= this.f26069n.length) {
            int iE = c.e(i12 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.f26069n;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f26070o;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f26069n = iArr;
            this.f26070o = objArr;
        }
        this.f26069n[i12] = i10;
        this.f26070o[i12] = obj;
        this.f26071p = i12 + 1;
    }

    public void b() {
        int i10 = this.f26071p;
        Object[] objArr = this.f26070o;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f26071p = 0;
        this.f26068m = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public h clone() {
        try {
            h hVar = (h) super.clone();
            hVar.f26069n = (int[]) this.f26069n.clone();
            hVar.f26070o = (Object[]) this.f26070o.clone();
            return hVar;
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    public Object f(int i10) {
        return g(i10, null);
    }

    public Object g(int i10, Object obj) {
        int iA = c.a(this.f26069n, this.f26071p, i10);
        if (iA >= 0) {
            Object[] objArr = this.f26070o;
            if (objArr[iA] != f26067q) {
                return objArr[iA];
            }
        }
        return obj;
    }

    public int i(Object obj) {
        if (this.f26068m) {
            d();
        }
        for (int i10 = 0; i10 < this.f26071p; i10++) {
            if (this.f26070o[i10] == obj) {
                return i10;
            }
        }
        return -1;
    }

    public int j(int i10) {
        if (this.f26068m) {
            d();
        }
        return this.f26069n[i10];
    }

    public void k(int i10, Object obj) {
        int iA = c.a(this.f26069n, this.f26071p, i10);
        if (iA >= 0) {
            this.f26070o[iA] = obj;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f26071p;
        if (i11 < i12) {
            Object[] objArr = this.f26070o;
            if (objArr[i11] == f26067q) {
                this.f26069n[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (this.f26068m && i12 >= this.f26069n.length) {
            d();
            i11 = ~c.a(this.f26069n, this.f26071p, i10);
        }
        int i13 = this.f26071p;
        if (i13 >= this.f26069n.length) {
            int iE = c.e(i13 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.f26069n;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f26070o;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f26069n = iArr;
            this.f26070o = objArr2;
        }
        int i14 = this.f26071p;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f26069n;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f26070o;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f26071p - i11);
        }
        this.f26069n[i11] = i10;
        this.f26070o[i11] = obj;
        this.f26071p++;
    }

    public int m() {
        if (this.f26068m) {
            d();
        }
        return this.f26071p;
    }

    public Object r(int i10) {
        if (this.f26068m) {
            d();
        }
        return this.f26070o[i10];
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f26071p * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f26071p; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(j(i10));
            sb2.append('=');
            Object objR = r(i10);
            if (objR != this) {
                sb2.append(objR);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
