package v;

import u.d;
import u.e;

/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f27764a;

    /* renamed from: b, reason: collision with root package name */
    u.e f27765b;

    /* renamed from: c, reason: collision with root package name */
    m f27766c;

    /* renamed from: d, reason: collision with root package name */
    protected e.b f27767d;

    /* renamed from: e, reason: collision with root package name */
    g f27768e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f27769f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f27770g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f27771h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f27772i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f27773j = b.NONE;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27774a;

        static {
            int[] iArr = new int[d.b.values().length];
            f27774a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27774a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27774a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27774a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27774a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(u.e eVar) {
        this.f27765b = eVar;
    }

    private void l(int i10, int i11) {
        g gVar;
        int iG;
        int i12 = this.f27764a;
        if (i12 == 0) {
            gVar = this.f27768e;
            iG = g(i11, i10);
        } else if (i12 == 1) {
            int iG2 = g(this.f27768e.f27732m, i10);
            gVar = this.f27768e;
            iG = Math.min(iG2, i11);
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    return;
                }
                u.e eVar = this.f27765b;
                p pVar = eVar.f27456e;
                e.b bVar = pVar.f27767d;
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && pVar.f27764a == 3) {
                    n nVar = eVar.f27458f;
                    if (nVar.f27767d == bVar2 && nVar.f27764a == 3) {
                        return;
                    }
                }
                if (i10 == 0) {
                    pVar = eVar.f27458f;
                }
                if (pVar.f27768e.f27720j) {
                    float fT = eVar.t();
                    this.f27768e.d(i10 == 1 ? (int) ((pVar.f27768e.f27717g / fT) + 0.5f) : (int) ((fT * pVar.f27768e.f27717g) + 0.5f));
                    return;
                }
                return;
            }
            u.e eVarI = this.f27765b.I();
            if (eVarI == null) {
                return;
            }
            if (!(i10 == 0 ? eVarI.f27456e : eVarI.f27458f).f27768e.f27720j) {
                return;
            }
            u.e eVar2 = this.f27765b;
            i11 = (int) ((r9.f27717g * (i10 == 0 ? eVar2.B : eVar2.E)) + 0.5f);
            gVar = this.f27768e;
            iG = g(i11, i10);
        }
        gVar.d(iG);
    }

    @Override // v.d
    public abstract void a(d dVar);

    protected final void b(f fVar, f fVar2, int i10) {
        fVar.f27722l.add(fVar2);
        fVar.f27716f = i10;
        fVar2.f27721k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f27722l.add(fVar2);
        fVar.f27722l.add(this.f27768e);
        fVar.f27718h = i10;
        fVar.f27719i = gVar;
        fVar2.f27721k.add(fVar);
        gVar.f27721k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i10, int i11) {
        int iMax;
        if (i11 == 0) {
            u.e eVar = this.f27765b;
            int i12 = eVar.A;
            iMax = Math.max(eVar.f27498z, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        } else {
            u.e eVar2 = this.f27765b;
            int i13 = eVar2.D;
            iMax = Math.max(eVar2.C, i10);
            if (i13 > 0) {
                iMax = Math.min(i13, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        }
        return iMax;
    }

    protected final f h(u.d dVar) {
        p pVar;
        p pVar2;
        u.d dVar2 = dVar.f27433f;
        if (dVar2 == null) {
            return null;
        }
        u.e eVar = dVar2.f27431d;
        int i10 = a.f27774a[dVar2.f27432e.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                pVar2 = eVar.f27456e;
            } else if (i10 == 3) {
                pVar = eVar.f27458f;
            } else {
                if (i10 == 4) {
                    return eVar.f27458f.f27746k;
                }
                if (i10 != 5) {
                    return null;
                }
                pVar2 = eVar.f27458f;
            }
            return pVar2.f27772i;
        }
        pVar = eVar.f27456e;
        return pVar.f27771h;
    }

    protected final f i(u.d dVar, int i10) {
        u.d dVar2 = dVar.f27433f;
        if (dVar2 == null) {
            return null;
        }
        u.e eVar = dVar2.f27431d;
        p pVar = i10 == 0 ? eVar.f27456e : eVar.f27458f;
        int i11 = a.f27774a[dVar2.f27432e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f27772i;
        }
        return pVar.f27771h;
    }

    public long j() {
        if (this.f27768e.f27720j) {
            return r0.f27717g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f27770g;
    }

    abstract boolean m();

    protected void n(d dVar, u.d dVar2, u.d dVar3, int i10) {
        f fVar;
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f27720j && fVarH2.f27720j) {
            int iE = fVarH.f27717g + dVar2.e();
            int iE2 = fVarH2.f27717g - dVar3.e();
            int i11 = iE2 - iE;
            if (!this.f27768e.f27720j && this.f27767d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f27768e;
            if (gVar.f27720j) {
                if (gVar.f27717g == i11) {
                    this.f27771h.d(iE);
                    fVar = this.f27772i;
                } else {
                    u.e eVar = this.f27765b;
                    float fW = i10 == 0 ? eVar.w() : eVar.P();
                    if (fVarH == fVarH2) {
                        iE = fVarH.f27717g;
                        iE2 = fVarH2.f27717g;
                        fW = 0.5f;
                    }
                    this.f27771h.d((int) (iE + 0.5f + (((iE2 - iE) - this.f27768e.f27717g) * fW)));
                    fVar = this.f27772i;
                    iE2 = this.f27771h.f27717g + this.f27768e.f27717g;
                }
                fVar.d(iE2);
            }
        }
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}
