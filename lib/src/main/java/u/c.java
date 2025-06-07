package u;

import java.util.ArrayList;
import u.e;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected e f27406a;

    /* renamed from: b, reason: collision with root package name */
    protected e f27407b;

    /* renamed from: c, reason: collision with root package name */
    protected e f27408c;

    /* renamed from: d, reason: collision with root package name */
    protected e f27409d;

    /* renamed from: e, reason: collision with root package name */
    protected e f27410e;

    /* renamed from: f, reason: collision with root package name */
    protected e f27411f;

    /* renamed from: g, reason: collision with root package name */
    protected e f27412g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList f27413h;

    /* renamed from: i, reason: collision with root package name */
    protected int f27414i;

    /* renamed from: j, reason: collision with root package name */
    protected int f27415j;

    /* renamed from: k, reason: collision with root package name */
    protected float f27416k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f27417l;

    /* renamed from: m, reason: collision with root package name */
    int f27418m;

    /* renamed from: n, reason: collision with root package name */
    int f27419n;

    /* renamed from: o, reason: collision with root package name */
    boolean f27420o;

    /* renamed from: p, reason: collision with root package name */
    private int f27421p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f27422q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f27423r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f27424s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f27425t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f27426u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f27427v;

    public c(e eVar, int i10, boolean z10) {
        this.f27406a = eVar;
        this.f27421p = i10;
        this.f27422q = z10;
    }

    private void b() {
        int i10 = this.f27421p * 2;
        e eVar = this.f27406a;
        this.f27420o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f27414i++;
            e[] eVarArr = eVar.F0;
            int i11 = this.f27421p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.E0[i11] = null;
            if (eVar.T() != 8) {
                this.f27417l++;
                e.b bVarS = eVar.s(this.f27421p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar) {
                    this.f27418m += eVar.C(this.f27421p);
                }
                int iE = this.f27418m + eVar.W[i10].e();
                this.f27418m = iE;
                int i12 = i10 + 1;
                this.f27418m = iE + eVar.W[i12].e();
                int iE2 = this.f27419n + eVar.W[i10].e();
                this.f27419n = iE2;
                this.f27419n = iE2 + eVar.W[i12].e();
                if (this.f27407b == null) {
                    this.f27407b = eVar;
                }
                this.f27409d = eVar;
                e.b[] bVarArr = eVar.Z;
                int i13 = this.f27421p;
                if (bVarArr[i13] == bVar) {
                    int[] iArr = eVar.f27496y;
                    if (iArr[i13] == 0 || iArr[i13] == 3 || iArr[i13] == 2) {
                        this.f27415j++;
                        float[] fArr = eVar.D0;
                        float f5 = fArr[i13];
                        if (f5 > 0.0f) {
                            this.f27416k += fArr[i13];
                        }
                        if (c(eVar, i13)) {
                            if (f5 < 0.0f) {
                                this.f27423r = true;
                            } else {
                                this.f27424s = true;
                            }
                            if (this.f27413h == null) {
                                this.f27413h = new ArrayList();
                            }
                            this.f27413h.add(eVar);
                        }
                        if (this.f27411f == null) {
                            this.f27411f = eVar;
                        }
                        e eVar4 = this.f27412g;
                        if (eVar4 != null) {
                            eVar4.E0[this.f27421p] = eVar;
                        }
                        this.f27412g = eVar;
                    }
                    if (this.f27421p != 0 ? !(eVar.f27494x == 0 && eVar.C == 0 && eVar.D == 0) : !(eVar.f27492w == 0 && eVar.f27498z == 0 && eVar.A == 0)) {
                        this.f27420o = false;
                    }
                    if (eVar.f27455d0 != 0.0f) {
                        this.f27420o = false;
                        this.f27426u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.F0[this.f27421p] = eVar;
            }
            d dVar = eVar.W[i10 + 1].f27433f;
            if (dVar != null) {
                e eVar5 = dVar.f27431d;
                d[] dVarArr = eVar5.W;
                if (dVarArr[i10].f27433f != null && dVarArr[i10].f27433f.f27431d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z10 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f27407b;
        if (eVar6 != null) {
            this.f27418m -= eVar6.W[i10].e();
        }
        e eVar7 = this.f27409d;
        if (eVar7 != null) {
            this.f27418m -= eVar7.W[i10 + 1].e();
        }
        this.f27408c = eVar;
        if (this.f27421p == 0 && this.f27422q) {
            this.f27410e = eVar;
        } else {
            this.f27410e = this.f27406a;
        }
        this.f27425t = this.f27424s && this.f27423r;
    }

    private static boolean c(e eVar, int i10) {
        if (eVar.T() != 8 && eVar.Z[i10] == e.b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f27496y;
            if (iArr[i10] == 0 || iArr[i10] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.f27427v) {
            b();
        }
        this.f27427v = true;
    }
}
