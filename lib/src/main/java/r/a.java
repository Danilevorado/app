package r;

import java.util.Arrays;
import r.b;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l, reason: collision with root package name */
    private static float f26333l = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final b f26335b;

    /* renamed from: c, reason: collision with root package name */
    protected final c f26336c;

    /* renamed from: a, reason: collision with root package name */
    int f26334a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f26337d = 8;

    /* renamed from: e, reason: collision with root package name */
    private i f26338e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f26339f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f26340g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f26341h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f26342i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f26343j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26344k = false;

    a(b bVar, c cVar) {
        this.f26335b = bVar;
        this.f26336c = cVar;
    }

    @Override // r.b.a
    public float a(int i10) {
        int i11 = this.f26342i;
        for (int i12 = 0; i11 != -1 && i12 < this.f26334a; i12++) {
            if (i12 == i10) {
                return this.f26341h[i11];
            }
            i11 = this.f26340g[i11];
        }
        return 0.0f;
    }

    @Override // r.b.a
    public boolean b(i iVar) {
        int i10 = this.f26342i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f26334a; i11++) {
            if (this.f26339f[i10] == iVar.f26395o) {
                return true;
            }
            i10 = this.f26340g[i10];
        }
        return false;
    }

    @Override // r.b.a
    public final float c(i iVar) {
        int i10 = this.f26342i;
        for (int i11 = 0; i10 != -1 && i11 < this.f26334a; i11++) {
            if (this.f26339f[i10] == iVar.f26395o) {
                return this.f26341h[i10];
            }
            i10 = this.f26340g[i10];
        }
        return 0.0f;
    }

    @Override // r.b.a
    public final void clear() {
        int i10 = this.f26342i;
        for (int i11 = 0; i10 != -1 && i11 < this.f26334a; i11++) {
            i iVar = this.f26336c.f26354d[this.f26339f[i10]];
            if (iVar != null) {
                iVar.i(this.f26335b);
            }
            i10 = this.f26340g[i10];
        }
        this.f26342i = -1;
        this.f26343j = -1;
        this.f26344k = false;
        this.f26334a = 0;
    }

    @Override // r.b.a
    public final void d(i iVar, float f5) {
        if (f5 == 0.0f) {
            g(iVar, true);
            return;
        }
        int i10 = this.f26342i;
        if (i10 == -1) {
            this.f26342i = 0;
            this.f26341h[0] = f5;
            this.f26339f[0] = iVar.f26395o;
            this.f26340g[0] = -1;
            iVar.f26405y++;
            iVar.b(this.f26335b);
            this.f26334a++;
            if (this.f26344k) {
                return;
            }
            int i11 = this.f26343j + 1;
            this.f26343j = i11;
            int[] iArr = this.f26339f;
            if (i11 >= iArr.length) {
                this.f26344k = true;
                this.f26343j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f26334a; i13++) {
            int[] iArr2 = this.f26339f;
            int i14 = iArr2[i10];
            int i15 = iVar.f26395o;
            if (i14 == i15) {
                this.f26341h[i10] = f5;
                return;
            }
            if (iArr2[i10] < i15) {
                i12 = i10;
            }
            i10 = this.f26340g[i10];
        }
        int length = this.f26343j;
        int i16 = length + 1;
        if (this.f26344k) {
            int[] iArr3 = this.f26339f;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i16;
        }
        int[] iArr4 = this.f26339f;
        if (length >= iArr4.length && this.f26334a < iArr4.length) {
            int i17 = 0;
            while (true) {
                int[] iArr5 = this.f26339f;
                if (i17 >= iArr5.length) {
                    break;
                }
                if (iArr5[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr6 = this.f26339f;
        if (length >= iArr6.length) {
            length = iArr6.length;
            int i18 = this.f26337d * 2;
            this.f26337d = i18;
            this.f26344k = false;
            this.f26343j = length - 1;
            this.f26341h = Arrays.copyOf(this.f26341h, i18);
            this.f26339f = Arrays.copyOf(this.f26339f, this.f26337d);
            this.f26340g = Arrays.copyOf(this.f26340g, this.f26337d);
        }
        this.f26339f[length] = iVar.f26395o;
        this.f26341h[length] = f5;
        int[] iArr7 = this.f26340g;
        if (i12 != -1) {
            iArr7[length] = iArr7[i12];
            iArr7[i12] = length;
        } else {
            iArr7[length] = this.f26342i;
            this.f26342i = length;
        }
        iVar.f26405y++;
        iVar.b(this.f26335b);
        int i19 = this.f26334a + 1;
        this.f26334a = i19;
        if (!this.f26344k) {
            this.f26343j++;
        }
        int[] iArr8 = this.f26339f;
        if (i19 >= iArr8.length) {
            this.f26344k = true;
        }
        if (this.f26343j >= iArr8.length) {
            this.f26344k = true;
            this.f26343j = iArr8.length - 1;
        }
    }

    @Override // r.b.a
    public float e(b bVar, boolean z10) {
        float fC = c(bVar.f26345a);
        g(bVar.f26345a, z10);
        b.a aVar = bVar.f26349e;
        int iF = aVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            i iVarH = aVar.h(i10);
            i(iVarH, aVar.c(iVarH) * fC, z10);
        }
        return fC;
    }

    @Override // r.b.a
    public int f() {
        return this.f26334a;
    }

    @Override // r.b.a
    public final float g(i iVar, boolean z10) {
        if (this.f26338e == iVar) {
            this.f26338e = null;
        }
        int i10 = this.f26342i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f26334a) {
            if (this.f26339f[i10] == iVar.f26395o) {
                if (i10 == this.f26342i) {
                    this.f26342i = this.f26340g[i10];
                } else {
                    int[] iArr = this.f26340g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.i(this.f26335b);
                }
                iVar.f26405y--;
                this.f26334a--;
                this.f26339f[i10] = -1;
                if (this.f26344k) {
                    this.f26343j = i10;
                }
                return this.f26341h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f26340g[i10];
        }
        return 0.0f;
    }

    @Override // r.b.a
    public i h(int i10) {
        int i11 = this.f26342i;
        for (int i12 = 0; i11 != -1 && i12 < this.f26334a; i12++) {
            if (i12 == i10) {
                return this.f26336c.f26354d[this.f26339f[i11]];
            }
            i11 = this.f26340g[i11];
        }
        return null;
    }

    @Override // r.b.a
    public void i(i iVar, float f5, boolean z10) {
        float f10 = f26333l;
        if (f5 <= (-f10) || f5 >= f10) {
            int i10 = this.f26342i;
            if (i10 == -1) {
                this.f26342i = 0;
                this.f26341h[0] = f5;
                this.f26339f[0] = iVar.f26395o;
                this.f26340g[0] = -1;
                iVar.f26405y++;
                iVar.b(this.f26335b);
                this.f26334a++;
                if (this.f26344k) {
                    return;
                }
                int i11 = this.f26343j + 1;
                this.f26343j = i11;
                int[] iArr = this.f26339f;
                if (i11 >= iArr.length) {
                    this.f26344k = true;
                    this.f26343j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f26334a; i13++) {
                int[] iArr2 = this.f26339f;
                int i14 = iArr2[i10];
                int i15 = iVar.f26395o;
                if (i14 == i15) {
                    float[] fArr = this.f26341h;
                    float f11 = fArr[i10] + f5;
                    float f12 = f26333l;
                    if (f11 > (-f12) && f11 < f12) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 == 0.0f) {
                        if (i10 == this.f26342i) {
                            this.f26342i = this.f26340g[i10];
                        } else {
                            int[] iArr3 = this.f26340g;
                            iArr3[i12] = iArr3[i10];
                        }
                        if (z10) {
                            iVar.i(this.f26335b);
                        }
                        if (this.f26344k) {
                            this.f26343j = i10;
                        }
                        iVar.f26405y--;
                        this.f26334a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i10] < i15) {
                    i12 = i10;
                }
                i10 = this.f26340g[i10];
            }
            int length = this.f26343j;
            int i16 = length + 1;
            if (this.f26344k) {
                int[] iArr4 = this.f26339f;
                if (iArr4[length] != -1) {
                    length = iArr4.length;
                }
            } else {
                length = i16;
            }
            int[] iArr5 = this.f26339f;
            if (length >= iArr5.length && this.f26334a < iArr5.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr6 = this.f26339f;
                    if (i17 >= iArr6.length) {
                        break;
                    }
                    if (iArr6[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr7 = this.f26339f;
            if (length >= iArr7.length) {
                length = iArr7.length;
                int i18 = this.f26337d * 2;
                this.f26337d = i18;
                this.f26344k = false;
                this.f26343j = length - 1;
                this.f26341h = Arrays.copyOf(this.f26341h, i18);
                this.f26339f = Arrays.copyOf(this.f26339f, this.f26337d);
                this.f26340g = Arrays.copyOf(this.f26340g, this.f26337d);
            }
            this.f26339f[length] = iVar.f26395o;
            this.f26341h[length] = f5;
            int[] iArr8 = this.f26340g;
            if (i12 != -1) {
                iArr8[length] = iArr8[i12];
                iArr8[i12] = length;
            } else {
                iArr8[length] = this.f26342i;
                this.f26342i = length;
            }
            iVar.f26405y++;
            iVar.b(this.f26335b);
            this.f26334a++;
            if (!this.f26344k) {
                this.f26343j++;
            }
            int i19 = this.f26343j;
            int[] iArr9 = this.f26339f;
            if (i19 >= iArr9.length) {
                this.f26344k = true;
                this.f26343j = iArr9.length - 1;
            }
        }
    }

    @Override // r.b.a
    public void j(float f5) {
        int i10 = this.f26342i;
        for (int i11 = 0; i10 != -1 && i11 < this.f26334a; i11++) {
            float[] fArr = this.f26341h;
            fArr[i10] = fArr[i10] / f5;
            i10 = this.f26340g[i10];
        }
    }

    @Override // r.b.a
    public void k() {
        int i10 = this.f26342i;
        for (int i11 = 0; i10 != -1 && i11 < this.f26334a; i11++) {
            float[] fArr = this.f26341h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f26340g[i10];
        }
    }

    public String toString() {
        int i10 = this.f26342i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f26334a; i11++) {
            str = ((str + " -> ") + this.f26341h[i10] + " : ") + this.f26336c.f26354d[this.f26339f[i10]];
            i10 = this.f26340g[i10];
        }
        return str;
    }
}
