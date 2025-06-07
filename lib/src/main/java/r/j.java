package r;

import java.util.Arrays;
import r.b;

/* loaded from: classes.dex */
public class j implements b.a {

    /* renamed from: n, reason: collision with root package name */
    private static float f26413n = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    private final int f26414a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f26415b = 16;

    /* renamed from: c, reason: collision with root package name */
    private int f26416c = 16;

    /* renamed from: d, reason: collision with root package name */
    int[] f26417d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    int[] f26418e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f26419f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    float[] f26420g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    int[] f26421h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f26422i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int f26423j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f26424k = -1;

    /* renamed from: l, reason: collision with root package name */
    private final b f26425l;

    /* renamed from: m, reason: collision with root package name */
    protected final c f26426m;

    j(b bVar, c cVar) {
        this.f26425l = bVar;
        this.f26426m = cVar;
        clear();
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f26395o % this.f26416c;
        int[] iArr2 = this.f26417d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f26418e;
                if (iArr[i12] == -1) {
                    break;
                } else {
                    i12 = iArr[i12];
                }
            }
            iArr[i12] = i10;
        }
        this.f26418e[i10] = -1;
    }

    private void m(int i10, i iVar, float f5) {
        this.f26419f[i10] = iVar.f26395o;
        this.f26420g[i10] = f5;
        this.f26421h[i10] = -1;
        this.f26422i[i10] = -1;
        iVar.b(this.f26425l);
        iVar.f26405y++;
        this.f26423j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f26415b; i10++) {
            if (this.f26419f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f26415b * 2;
        this.f26419f = Arrays.copyOf(this.f26419f, i10);
        this.f26420g = Arrays.copyOf(this.f26420g, i10);
        this.f26421h = Arrays.copyOf(this.f26421h, i10);
        this.f26422i = Arrays.copyOf(this.f26422i, i10);
        this.f26418e = Arrays.copyOf(this.f26418e, i10);
        for (int i11 = this.f26415b; i11 < i10; i11++) {
            this.f26419f[i11] = -1;
            this.f26418e[i11] = -1;
        }
        this.f26415b = i10;
    }

    private void q(int i10, i iVar, float f5) {
        int iN = n();
        m(iN, iVar, f5);
        if (i10 != -1) {
            this.f26421h[iN] = i10;
            int[] iArr = this.f26422i;
            iArr[iN] = iArr[i10];
            iArr[i10] = iN;
        } else {
            this.f26421h[iN] = -1;
            if (this.f26423j > 0) {
                this.f26422i[iN] = this.f26424k;
                this.f26424k = iN;
            } else {
                this.f26422i[iN] = -1;
            }
        }
        int[] iArr2 = this.f26422i;
        if (iArr2[iN] != -1) {
            this.f26421h[iArr2[iN]] = iN;
        }
        l(iVar, iN);
    }

    private void r(i iVar) {
        int[] iArr;
        int i10 = iVar.f26395o;
        int i11 = i10 % this.f26416c;
        int[] iArr2 = this.f26417d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            return;
        }
        if (this.f26419f[i12] == i10) {
            int[] iArr3 = this.f26418e;
            iArr2[i11] = iArr3[i12];
            iArr3[i12] = -1;
            return;
        }
        while (true) {
            iArr = this.f26418e;
            if (iArr[i12] == -1 || this.f26419f[iArr[i12]] == i10) {
                break;
            } else {
                i12 = iArr[i12];
            }
        }
        int i13 = iArr[i12];
        if (i13 == -1 || this.f26419f[i13] != i10) {
            return;
        }
        iArr[i12] = iArr[i13];
        iArr[i13] = -1;
    }

    @Override // r.b.a
    public float a(int i10) {
        int i11 = this.f26423j;
        int i12 = this.f26424k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f26420g[i12];
            }
            i12 = this.f26422i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // r.b.a
    public boolean b(i iVar) {
        return p(iVar) != -1;
    }

    @Override // r.b.a
    public float c(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f26420g[iP];
        }
        return 0.0f;
    }

    @Override // r.b.a
    public void clear() {
        int i10 = this.f26423j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarH = h(i11);
            if (iVarH != null) {
                iVarH.i(this.f26425l);
            }
        }
        for (int i12 = 0; i12 < this.f26415b; i12++) {
            this.f26419f[i12] = -1;
            this.f26418e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f26416c; i13++) {
            this.f26417d[i13] = -1;
        }
        this.f26423j = 0;
        this.f26424k = -1;
    }

    @Override // r.b.a
    public void d(i iVar, float f5) {
        float f10 = f26413n;
        if (f5 > (-f10) && f5 < f10) {
            g(iVar, true);
            return;
        }
        if (this.f26423j == 0) {
            m(0, iVar, f5);
            l(iVar, 0);
            this.f26424k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f26420g[iP] = f5;
            return;
        }
        if (this.f26423j + 1 >= this.f26415b) {
            o();
        }
        int i10 = this.f26423j;
        int i11 = this.f26424k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int[] iArr = this.f26419f;
            int i14 = iArr[i11];
            int i15 = iVar.f26395o;
            if (i14 == i15) {
                this.f26420g[i11] = f5;
                return;
            }
            if (iArr[i11] < i15) {
                i12 = i11;
            }
            i11 = this.f26422i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f5);
    }

    @Override // r.b.a
    public float e(b bVar, boolean z10) {
        float fC = c(bVar.f26345a);
        g(bVar.f26345a, z10);
        j jVar = (j) bVar.f26349e;
        int iF = jVar.f();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iF) {
            int[] iArr = jVar.f26419f;
            if (iArr[i11] != -1) {
                i(this.f26426m.f26354d[iArr[i11]], jVar.f26420g[i11] * fC, z10);
                i10++;
            }
            i11++;
        }
        return fC;
    }

    @Override // r.b.a
    public int f() {
        return this.f26423j;
    }

    @Override // r.b.a
    public float g(i iVar, boolean z10) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f5 = this.f26420g[iP];
        if (this.f26424k == iP) {
            this.f26424k = this.f26422i[iP];
        }
        this.f26419f[iP] = -1;
        int[] iArr = this.f26421h;
        if (iArr[iP] != -1) {
            int[] iArr2 = this.f26422i;
            iArr2[iArr[iP]] = iArr2[iP];
        }
        int[] iArr3 = this.f26422i;
        if (iArr3[iP] != -1) {
            iArr[iArr3[iP]] = iArr[iP];
        }
        this.f26423j--;
        iVar.f26405y--;
        if (z10) {
            iVar.i(this.f26425l);
        }
        return f5;
    }

    @Override // r.b.a
    public i h(int i10) {
        int i11 = this.f26423j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f26424k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f26426m.f26354d[this.f26419f[i12]];
            }
            i12 = this.f26422i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // r.b.a
    public void i(i iVar, float f5, boolean z10) {
        float f10 = f26413n;
        if (f5 <= (-f10) || f5 >= f10) {
            int iP = p(iVar);
            if (iP == -1) {
                d(iVar, f5);
                return;
            }
            float[] fArr = this.f26420g;
            fArr[iP] = fArr[iP] + f5;
            float f11 = fArr[iP];
            float f12 = f26413n;
            if (f11 <= (-f12) || fArr[iP] >= f12) {
                return;
            }
            fArr[iP] = 0.0f;
            g(iVar, z10);
        }
    }

    @Override // r.b.a
    public void j(float f5) {
        int i10 = this.f26423j;
        int i11 = this.f26424k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f26420g;
            fArr[i11] = fArr[i11] / f5;
            i11 = this.f26422i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // r.b.a
    public void k() {
        int i10 = this.f26423j;
        int i11 = this.f26424k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f26420g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f26422i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public int p(i iVar) {
        int[] iArr;
        if (this.f26423j != 0 && iVar != null) {
            int i10 = iVar.f26395o;
            int i11 = this.f26417d[i10 % this.f26416c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f26419f[i11] == i10) {
                return i11;
            }
            while (true) {
                iArr = this.f26418e;
                if (iArr[i11] == -1 || this.f26419f[iArr[i11]] == i10) {
                    break;
                }
                i11 = iArr[i11];
            }
            if (iArr[i11] != -1 && this.f26419f[iArr[i11]] == i10) {
                return iArr[i11];
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb2;
        String str = hashCode() + " { ";
        int i10 = this.f26423j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarH = h(i11);
            if (iVarH != null) {
                String str2 = str + iVarH + " = " + a(i11) + " ";
                int iP = p(iVarH);
                String str3 = str2 + "[p: ";
                if (this.f26421h[iP] != -1) {
                    sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(this.f26426m.f26354d[this.f26419f[this.f26421h[iP]]]);
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append("none");
                }
                String str4 = sb2.toString() + ", n: ";
                str = (this.f26422i[iP] != -1 ? str4 + this.f26426m.f26354d[this.f26419f[this.f26422i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
