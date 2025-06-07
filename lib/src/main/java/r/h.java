package r;

import java.util.Arrays;
import java.util.Comparator;
import r.b;

/* loaded from: classes.dex */
public class h extends r.b {

    /* renamed from: g, reason: collision with root package name */
    private int f26383g;

    /* renamed from: h, reason: collision with root package name */
    private i[] f26384h;

    /* renamed from: i, reason: collision with root package name */
    private i[] f26385i;

    /* renamed from: j, reason: collision with root package name */
    private int f26386j;

    /* renamed from: k, reason: collision with root package name */
    b f26387k;

    /* renamed from: l, reason: collision with root package name */
    c f26388l;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f26395o - iVar2.f26395o;
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        i f26390a;

        /* renamed from: b, reason: collision with root package name */
        h f26391b;

        public b(h hVar) {
            this.f26391b = hVar;
        }

        public boolean a(i iVar, float f5) {
            boolean z10 = true;
            if (!this.f26390a.f26393m) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f10 = iVar.f26401u[i10];
                    if (f10 != 0.0f) {
                        float f11 = f10 * f5;
                        if (Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        this.f26390a.f26401u[i10] = f11;
                    } else {
                        this.f26390a.f26401u[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f26390a.f26401u;
                fArr[i11] = fArr[i11] + (iVar.f26401u[i11] * f5);
                if (Math.abs(fArr[i11]) < 1.0E-4f) {
                    this.f26390a.f26401u[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f26390a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f26390a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f5 = this.f26390a.f26401u[i10];
                if (f5 > 0.0f) {
                    return false;
                }
                if (f5 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f5 = iVar.f26401u[i10];
                float f10 = this.f26390a.f26401u[i10];
                if (f10 == f5) {
                    i10--;
                } else if (f10 < f5) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f26390a.f26401u, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f26390a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f26390a.f26401u[i10] + " ";
                }
            }
            return str + "] " + this.f26390a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f26383g = 128;
        this.f26384h = new i[128];
        this.f26385i = new i[128];
        this.f26386j = 0;
        this.f26387k = new b(this);
        this.f26388l = cVar;
    }

    private final void F(i iVar) {
        int i10;
        int i11 = this.f26386j + 1;
        i[] iVarArr = this.f26384h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f26384h = iVarArr2;
            this.f26385i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f26384h;
        int i12 = this.f26386j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f26386j = i13;
        if (i13 > 1 && iVarArr3[i13 - 1].f26395o > iVar.f26395o) {
            int i14 = 0;
            while (true) {
                i10 = this.f26386j;
                if (i14 >= i10) {
                    break;
                }
                this.f26385i[i14] = this.f26384h[i14];
                i14++;
            }
            Arrays.sort(this.f26385i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f26386j; i15++) {
                this.f26384h[i15] = this.f26385i[i15];
            }
        }
        iVar.f26393m = true;
        iVar.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f26386j) {
            if (this.f26384h[i10] == iVar) {
                while (true) {
                    int i11 = this.f26386j;
                    if (i10 >= i11 - 1) {
                        this.f26386j = i11 - 1;
                        iVar.f26393m = false;
                        return;
                    } else {
                        i[] iVarArr = this.f26384h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // r.b
    public void B(d dVar, r.b bVar, boolean z10) {
        i iVar = bVar.f26345a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f26349e;
        int iF = aVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            i iVarH = aVar.h(i10);
            float fA = aVar.a(i10);
            this.f26387k.b(iVarH);
            if (this.f26387k.a(iVar, fA)) {
                F(iVarH);
            }
            this.f26346b += bVar.f26346b * fA;
        }
        G(iVar);
    }

    @Override // r.b, r.d.a
    public void b(i iVar) {
        this.f26387k.b(iVar);
        this.f26387k.e();
        iVar.f26401u[iVar.f26397q] = 1.0f;
        F(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // r.b, r.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r.i c(r.d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.f26386j
            if (r0 >= r2) goto L30
            r.i[] r2 = r4.f26384h
            r2 = r2[r0]
            int r3 = r2.f26395o
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2d
        L12:
            r.h$b r3 = r4.f26387k
            r3.b(r2)
            r.h$b r2 = r4.f26387k
            if (r1 != r5) goto L22
            boolean r2 = r2.c()
            if (r2 == 0) goto L2d
            goto L2c
        L22:
            r.i[] r3 = r4.f26384h
            r3 = r3[r1]
            boolean r2 = r2.d(r3)
            if (r2 == 0) goto L2d
        L2c:
            r1 = r0
        L2d:
            int r0 = r0 + 1
            goto L3
        L30:
            if (r1 != r5) goto L34
            r5 = 0
            return r5
        L34:
            r.i[] r5 = r4.f26384h
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r.h.c(r.d, boolean[]):r.i");
    }

    @Override // r.b, r.d.a
    public void clear() {
        this.f26386j = 0;
        this.f26346b = 0.0f;
    }

    @Override // r.b, r.d.a
    public boolean isEmpty() {
        return this.f26386j == 0;
    }

    @Override // r.b
    public String toString() {
        String str = " goal -> (" + this.f26346b + ") : ";
        for (int i10 = 0; i10 < this.f26386j; i10++) {
            this.f26387k.b(this.f26384h[i10]);
            str = str + this.f26387k + " ";
        }
        return str;
    }
}
