package v;

import u.e;
import v.f;
import v.p;

/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public f f27746k;

    /* renamed from: l, reason: collision with root package name */
    g f27747l;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27748a;

        static {
            int[] iArr = new int[p.b.values().length];
            f27748a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27748a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27748a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(u.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f27746k = fVar;
        this.f27747l = null;
        this.f27771h.f27715e = f.a.TOP;
        this.f27772i.f27715e = f.a.BOTTOM;
        fVar.f27715e = f.a.BASELINE;
        this.f27769f = 1;
    }

    @Override // v.p, v.d
    public void a(d dVar) {
        int i10;
        float fT;
        int i11 = a.f27748a[this.f27773j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            u.e eVar = this.f27765b;
            n(dVar, eVar.P, eVar.R, 1);
            return;
        }
        g gVar = this.f27768e;
        if (gVar.f27713c && !gVar.f27720j && this.f27767d == e.b.MATCH_CONSTRAINT) {
            u.e eVar2 = this.f27765b;
            int i12 = eVar2.f27494x;
            if (i12 == 2) {
                u.e eVarI = eVar2.I();
                if (eVarI != null) {
                    if (eVarI.f27458f.f27768e.f27720j) {
                        i10 = (int) ((r7.f27717g * this.f27765b.E) + 0.5f);
                        this.f27768e.d(i10);
                    }
                }
            } else if (i12 == 3 && eVar2.f27456e.f27768e.f27720j) {
                int iU = eVar2.u();
                if (iU == -1) {
                    fT = r7.f27456e.f27768e.f27717g / this.f27765b.t();
                    i10 = (int) (fT + 0.5f);
                    this.f27768e.d(i10);
                } else if (iU != 0) {
                    if (iU != 1) {
                        i10 = 0;
                        this.f27768e.d(i10);
                    }
                    fT = r7.f27456e.f27768e.f27717g / this.f27765b.t();
                    i10 = (int) (fT + 0.5f);
                    this.f27768e.d(i10);
                } else {
                    fT = r7.f27456e.f27768e.f27717g * this.f27765b.t();
                    i10 = (int) (fT + 0.5f);
                    this.f27768e.d(i10);
                }
            }
        }
        f fVar = this.f27771h;
        if (fVar.f27713c) {
            f fVar2 = this.f27772i;
            if (fVar2.f27713c) {
                if (fVar.f27720j && fVar2.f27720j && this.f27768e.f27720j) {
                    return;
                }
                if (!this.f27768e.f27720j && this.f27767d == e.b.MATCH_CONSTRAINT) {
                    u.e eVar3 = this.f27765b;
                    if (eVar3.f27492w == 0 && !eVar3.i0()) {
                        f fVar3 = (f) this.f27771h.f27722l.get(0);
                        f fVar4 = (f) this.f27772i.f27722l.get(0);
                        int i13 = fVar3.f27717g;
                        f fVar5 = this.f27771h;
                        int i14 = i13 + fVar5.f27716f;
                        int i15 = fVar4.f27717g + this.f27772i.f27716f;
                        fVar5.d(i14);
                        this.f27772i.d(i15);
                        this.f27768e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f27768e.f27720j && this.f27767d == e.b.MATCH_CONSTRAINT && this.f27764a == 1 && this.f27771h.f27722l.size() > 0 && this.f27772i.f27722l.size() > 0) {
                    f fVar6 = (f) this.f27771h.f27722l.get(0);
                    int i16 = (((f) this.f27772i.f27722l.get(0)).f27717g + this.f27772i.f27716f) - (fVar6.f27717g + this.f27771h.f27716f);
                    g gVar2 = this.f27768e;
                    int i17 = gVar2.f27732m;
                    if (i16 < i17) {
                        gVar2.d(i16);
                    } else {
                        gVar2.d(i17);
                    }
                }
                if (this.f27768e.f27720j && this.f27771h.f27722l.size() > 0 && this.f27772i.f27722l.size() > 0) {
                    f fVar7 = (f) this.f27771h.f27722l.get(0);
                    f fVar8 = (f) this.f27772i.f27722l.get(0);
                    int i18 = fVar7.f27717g + this.f27771h.f27716f;
                    int i19 = fVar8.f27717g + this.f27772i.f27716f;
                    float fP = this.f27765b.P();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f27717g;
                        i19 = fVar8.f27717g;
                        fP = 0.5f;
                    }
                    this.f27771h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f27768e.f27717g) * fP)));
                    this.f27772i.d(this.f27771h.f27717g + this.f27768e.f27717g);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x02e7, code lost:
    
        if (r9.f27765b.X() != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e9, code lost:
    
        r0 = r9.f27746k;
        r1 = r9.f27771h;
        r2 = r9.f27747l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0374, code lost:
    
        if (r9.f27765b.X() != false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03ed A[PHI: r0
  0x03ed: PHI (r0v34 v.l) = (r0v23 v.l), (r0v50 v.l) binds: [B:156:0x03eb, B:130:0x0342] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    @Override // v.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void d() {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.n.d():void");
    }

    @Override // v.p
    public void e() {
        f fVar = this.f27771h;
        if (fVar.f27720j) {
            this.f27765b.j1(fVar.f27717g);
        }
    }

    @Override // v.p
    void f() {
        this.f27766c = null;
        this.f27771h.c();
        this.f27772i.c();
        this.f27746k.c();
        this.f27768e.c();
        this.f27770g = false;
    }

    @Override // v.p
    boolean m() {
        return this.f27767d != e.b.MATCH_CONSTRAINT || this.f27765b.f27494x == 0;
    }

    void q() {
        this.f27770g = false;
        this.f27771h.c();
        this.f27771h.f27720j = false;
        this.f27772i.c();
        this.f27772i.f27720j = false;
        this.f27746k.c();
        this.f27746k.f27720j = false;
        this.f27768e.f27720j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f27765b.r();
    }
}
