package x6;

import java.util.Map;
import r6.h;
import r6.m;
import r6.n;
import s6.j;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final s6.a f28355a;

    /* renamed from: b, reason: collision with root package name */
    private n f28356b;

    public c(s6.a aVar) {
        this.f28355a = aVar;
    }

    private float b(m mVar, m mVar2) {
        float fJ = j((int) mVar.c(), (int) mVar.d(), (int) mVar2.c(), (int) mVar2.d());
        float fJ2 = j((int) mVar2.c(), (int) mVar2.d(), (int) mVar.c(), (int) mVar.d());
        return Float.isNaN(fJ) ? fJ2 / 7.0f : Float.isNaN(fJ2) ? fJ / 7.0f : (fJ + fJ2) / 14.0f;
    }

    private static int c(m mVar, m mVar2, m mVar3, float f5) throws h {
        int iC = ((t6.a.c(m.b(mVar, mVar2) / f5) + t6.a.c(m.b(mVar, mVar3) / f5)) / 2) + 7;
        int i10 = iC & 3;
        if (i10 == 0) {
            return iC + 1;
        }
        if (i10 == 2) {
            return iC - 1;
        }
        if (i10 != 3) {
            return iC;
        }
        throw h.a();
    }

    private static j d(m mVar, m mVar2, m mVar3, m mVar4, int i10) {
        float fC;
        float fD;
        float f5;
        float f10 = i10 - 3.5f;
        if (mVar4 != null) {
            fC = mVar4.c();
            fD = mVar4.d();
            f5 = f10 - 3.0f;
        } else {
            fC = (mVar2.c() - mVar.c()) + mVar3.c();
            fD = (mVar2.d() - mVar.d()) + mVar3.d();
            f5 = f10;
        }
        return j.b(3.5f, 3.5f, f10, 3.5f, f5, f5, 3.5f, f10, mVar.c(), mVar.d(), mVar2.c(), mVar2.d(), fC, fD, mVar3.c(), mVar3.d());
    }

    private static s6.a h(s6.a aVar, j jVar, int i10) {
        return s6.h.b().c(aVar, i10, i10, jVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
    
        if (r15 != r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
    
        return t6.a.b(r19, r6, r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        return Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float i(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            int r0 = r21 - r19
            int r0 = java.lang.Math.abs(r0)
            int r1 = r20 - r18
            int r1 = java.lang.Math.abs(r1)
            r3 = 1
            if (r0 <= r1) goto L11
            r0 = r3
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L1d
            r4 = r18
            r1 = r19
            r6 = r20
            r5 = r21
            goto L25
        L1d:
            r1 = r18
            r4 = r19
            r5 = r20
            r6 = r21
        L25:
            int r7 = r5 - r1
            int r7 = java.lang.Math.abs(r7)
            int r8 = r6 - r4
            int r8 = java.lang.Math.abs(r8)
            int r9 = -r7
            r10 = 2
            int r9 = r9 / r10
            r11 = -1
            if (r1 >= r5) goto L39
            r12 = r3
            goto L3a
        L39:
            r12 = r11
        L3a:
            if (r4 >= r6) goto L3d
            r11 = r3
        L3d:
            int r5 = r5 + r12
            r13 = r1
            r14 = r4
            r15 = 0
        L41:
            if (r13 == r5) goto L82
            if (r0 == 0) goto L47
            r2 = r14
            goto L48
        L47:
            r2 = r13
        L48:
            if (r0 == 0) goto L4c
            r10 = r13
            goto L4d
        L4c:
            r10 = r14
        L4d:
            if (r15 != r3) goto L57
            r16 = r0
            r0 = r3
            r19 = r5
            r3 = r17
            goto L5e
        L57:
            r3 = r17
            r16 = r0
            r19 = r5
            r0 = 0
        L5e:
            s6.a r5 = r3.f28355a
            boolean r2 = r5.d(r2, r10)
            if (r0 != r2) goto L70
            r0 = 2
            if (r15 != r0) goto L6e
            float r0 = t6.a.b(r13, r14, r1, r4)
            return r0
        L6e:
            int r15 = r15 + 1
        L70:
            int r9 = r9 + r8
            if (r9 <= 0) goto L7a
            if (r14 == r6) goto L78
            int r14 = r14 + r11
            int r9 = r9 - r7
            goto L7a
        L78:
            r0 = 2
            goto L87
        L7a:
            int r13 = r13 + r12
            r5 = r19
            r0 = r16
            r3 = 1
            r10 = 2
            goto L41
        L82:
            r3 = r17
            r19 = r5
            r0 = r10
        L87:
            if (r15 != r0) goto L90
            r5 = r19
            float r0 = t6.a.b(r5, r6, r1, r4)
            return r0
        L90:
            r0 = 2143289344(0x7fc00000, float:NaN)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.c.i(int, int, int, int):float");
    }

    private float j(int i10, int i11, int i12, int i13) {
        float fJ;
        float fG;
        float fI = i(i10, i11, i12, i13);
        int iJ = i10 - (i12 - i10);
        int iG = 0;
        if (iJ < 0) {
            fJ = i10 / (i10 - iJ);
            iJ = 0;
        } else if (iJ >= this.f28355a.j()) {
            fJ = ((this.f28355a.j() - 1) - i10) / (iJ - i10);
            iJ = this.f28355a.j() - 1;
        } else {
            fJ = 1.0f;
        }
        float f5 = i11;
        int i14 = (int) (f5 - ((i13 - i11) * fJ));
        if (i14 < 0) {
            fG = f5 / (i11 - i14);
        } else if (i14 >= this.f28355a.g()) {
            fG = ((this.f28355a.g() - 1) - i11) / (i14 - i11);
            iG = this.f28355a.g() - 1;
        } else {
            iG = i14;
            fG = 1.0f;
        }
        return (fI + i(i10, i11, (int) (i10 + ((iJ - i10) * fG)), iG)) - 1.0f;
    }

    protected final float a(m mVar, m mVar2, m mVar3) {
        return (b(mVar, mVar2) + b(mVar, mVar3)) / 2.0f;
    }

    public final s6.f e(Map map) {
        n nVar = map == null ? null : (n) map.get(r6.e.NEED_RESULT_POINT_CALLBACK);
        this.f28356b = nVar;
        return g(new e(this.f28355a, nVar).e(map));
    }

    protected final a f(float f5, int i10, int i11, float f10) throws h {
        int i12 = (int) (f10 * f5);
        int iMax = Math.max(0, i10 - i12);
        int iMin = Math.min(this.f28355a.j() - 1, i10 + i12) - iMax;
        float f11 = 3.0f * f5;
        if (iMin < f11) {
            throw h.a();
        }
        int iMax2 = Math.max(0, i11 - i12);
        int iMin2 = Math.min(this.f28355a.g() - 1, i11 + i12) - iMax2;
        if (iMin2 >= f11) {
            return new b(this.f28355a, iMax, iMax2, iMin, iMin2, f5, this.f28356b).c();
        }
        throw h.a();
    }

    protected final s6.f g(f fVar) throws r6.f, h {
        d dVarB = fVar.b();
        d dVarC = fVar.c();
        d dVarA = fVar.a();
        float fA = a(dVarB, dVarC, dVarA);
        if (fA < 1.0f) {
            throw h.a();
        }
        int iC = c(dVarB, dVarC, dVarA, fA);
        w6.j jVarG = w6.j.g(iC);
        int iE = jVarG.e() - 7;
        a aVarF = null;
        if (jVarG.d().length > 0) {
            float fC = (dVarC.c() - dVarB.c()) + dVarA.c();
            float fD = (dVarC.d() - dVarB.d()) + dVarA.d();
            float f5 = 1.0f - (3.0f / iE);
            int iC2 = (int) (dVarB.c() + ((fC - dVarB.c()) * f5));
            int iD = (int) (dVarB.d() + (f5 * (fD - dVarB.d())));
            for (int i10 = 4; i10 <= 16; i10 <<= 1) {
                try {
                    aVarF = f(fA, iC2, iD, i10);
                    break;
                } catch (h unused) {
                }
            }
        }
        return new s6.f(h(this.f28355a, d(dVarB, dVarC, dVarA, aVarF, iC), iC), aVarF == null ? new m[]{dVarA, dVarB, dVarC} : new m[]{dVarA, dVarB, dVarC, aVarF});
    }
}
