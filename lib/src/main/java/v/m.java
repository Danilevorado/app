package v;

import java.util.ArrayList;

/* loaded from: classes.dex */
class m {

    /* renamed from: h, reason: collision with root package name */
    public static int f27738h;

    /* renamed from: c, reason: collision with root package name */
    p f27741c;

    /* renamed from: d, reason: collision with root package name */
    p f27742d;

    /* renamed from: f, reason: collision with root package name */
    int f27744f;

    /* renamed from: g, reason: collision with root package name */
    int f27745g;

    /* renamed from: a, reason: collision with root package name */
    public int f27739a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f27740b = false;

    /* renamed from: e, reason: collision with root package name */
    ArrayList f27743e = new ArrayList();

    public m(p pVar, int i10) {
        this.f27741c = null;
        this.f27742d = null;
        int i11 = f27738h;
        this.f27744f = i11;
        f27738h = i11 + 1;
        this.f27741c = pVar;
        this.f27742d = pVar;
        this.f27745g = i10;
    }

    private long c(f fVar, long j10) {
        p pVar = fVar.f27714d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f27721k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f27721k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f27714d != pVar) {
                    jMin = Math.min(jMin, c(fVar2, fVar2.f27716f + j10));
                }
            }
        }
        if (fVar != pVar.f27772i) {
            return jMin;
        }
        long j11 = j10 - pVar.j();
        return Math.min(Math.min(jMin, c(pVar.f27771h, j11)), j11 - pVar.f27771h.f27716f);
    }

    private long d(f fVar, long j10) {
        p pVar = fVar.f27714d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f27721k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f27721k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f27714d != pVar) {
                    jMax = Math.max(jMax, d(fVar2, fVar2.f27716f + j10));
                }
            }
        }
        if (fVar != pVar.f27771h) {
            return jMax;
        }
        long j11 = j10 + pVar.j();
        return Math.max(Math.max(jMax, d(pVar.f27772i, j11)), j11 - pVar.f27772i.f27716f);
    }

    public void a(p pVar) {
        this.f27743e.add(pVar);
        this.f27742d = pVar;
    }

    public long b(u.f fVar, int i10) {
        long j10;
        p pVar;
        long j11;
        long jD;
        p pVar2 = this.f27741c;
        if (pVar2 instanceof c) {
            if (((c) pVar2).f27769f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar2 instanceof l)) {
                return 0L;
            }
        } else if (!(pVar2 instanceof n)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f27456e : fVar.f27458f).f27771h;
        f fVar3 = (i10 == 0 ? fVar.f27456e : fVar.f27458f).f27772i;
        boolean zContains = pVar2.f27771h.f27722l.contains(fVar2);
        boolean zContains2 = this.f27741c.f27772i.f27722l.contains(fVar3);
        long j12 = this.f27741c.j();
        if (!zContains || !zContains2) {
            if (zContains) {
                jD = d(this.f27741c.f27771h, r12.f27716f);
                j11 = this.f27741c.f27771h.f27716f + j12;
            } else if (zContains2) {
                j11 = (-this.f27741c.f27772i.f27716f) + j12;
                jD = -c(this.f27741c.f27772i, r12.f27716f);
            } else {
                j10 = r12.f27771h.f27716f + this.f27741c.j();
                pVar = this.f27741c;
            }
            return Math.max(jD, j11);
        }
        long jD2 = d(this.f27741c.f27771h, 0L);
        long jC = c(this.f27741c.f27772i, 0L);
        long j13 = jD2 - j12;
        p pVar3 = this.f27741c;
        int i11 = pVar3.f27772i.f27716f;
        if (j13 >= (-i11)) {
            j13 += i11;
        }
        int i12 = pVar3.f27771h.f27716f;
        long j14 = ((-jC) - j12) - i12;
        if (j14 >= i12) {
            j14 -= i12;
        }
        float fO = pVar3.f27765b.o(i10);
        float f5 = fO > 0.0f ? (long) ((j14 / fO) + (j13 / (1.0f - fO))) : 0L;
        long j15 = ((long) ((f5 * fO) + 0.5f)) + j12 + ((long) ((f5 * (1.0f - fO)) + 0.5f));
        pVar = this.f27741c;
        j10 = pVar.f27771h.f27716f + j15;
        return j10 - pVar.f27772i.f27716f;
    }
}
