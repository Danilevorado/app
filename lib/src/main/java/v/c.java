package v;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: k, reason: collision with root package name */
    ArrayList f27700k;

    /* renamed from: l, reason: collision with root package name */
    private int f27701l;

    public c(u.e eVar, int i10) {
        super(eVar);
        this.f27700k = new ArrayList();
        this.f27769f = i10;
        q();
    }

    private void q() {
        u.e eVar;
        u.e eVarJ = this.f27765b;
        do {
            eVar = eVarJ;
            eVarJ = eVarJ.J(this.f27769f);
        } while (eVarJ != null);
        this.f27765b = eVar;
        this.f27700k.add(eVar.L(this.f27769f));
        u.e eVarH = eVar.H(this.f27769f);
        while (eVarH != null) {
            this.f27700k.add(eVarH.L(this.f27769f));
            eVarH = eVarH.H(this.f27769f);
        }
        Iterator it = this.f27700k.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            int i10 = this.f27769f;
            if (i10 == 0) {
                pVar.f27765b.f27452c = this;
            } else if (i10 == 1) {
                pVar.f27765b.f27454d = this;
            }
        }
        if ((this.f27769f == 0 && ((u.f) this.f27765b.I()).K1()) && this.f27700k.size() > 1) {
            ArrayList arrayList = this.f27700k;
            this.f27765b = ((p) arrayList.get(arrayList.size() - 1)).f27765b;
        }
        this.f27701l = this.f27769f == 0 ? this.f27765b.x() : this.f27765b.Q();
    }

    private u.e r() {
        for (int i10 = 0; i10 < this.f27700k.size(); i10++) {
            p pVar = (p) this.f27700k.get(i10);
            if (pVar.f27765b.T() != 8) {
                return pVar.f27765b;
            }
        }
        return null;
    }

    private u.e s() {
        for (int size = this.f27700k.size() - 1; size >= 0; size--) {
            p pVar = (p) this.f27700k.get(size);
            if (pVar.f27765b.T() != 8) {
                return pVar.f27765b;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    @Override // v.p, v.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(v.d r27) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.c.a(v.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[PHI: r0 r1
  0x00a5: PHI (r0v13 int) = (r0v10 int), (r0v19 int) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r1v3 v.f) = (r1v2 v.f), (r1v7 v.f) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // v.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void d() {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f27700k
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            v.p r1 = (v.p) r1
            r1.d()
            goto L6
        L16:
            java.util.ArrayList r0 = r5.f27700k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList r2 = r5.f27700k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            v.p r2 = (v.p) r2
            u.e r2 = r2.f27765b
            java.util.ArrayList r4 = r5.f27700k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            v.p r0 = (v.p) r0
            u.e r0 = r0.f27765b
            int r4 = r5.f27769f
            if (r4 != 0) goto L70
            u.d r1 = r2.O
            u.d r0 = r0.Q
            v.f r2 = r5.i(r1, r3)
            int r1 = r1.e()
            u.e r4 = r5.r()
            if (r4 == 0) goto L52
            u.d r1 = r4.O
            int r1 = r1.e()
        L52:
            if (r2 == 0) goto L59
            v.f r4 = r5.f27771h
            r5.b(r4, r2, r1)
        L59:
            v.f r1 = r5.i(r0, r3)
            int r0 = r0.e()
            u.e r2 = r5.s()
            if (r2 == 0) goto L6d
            u.d r0 = r2.Q
            int r0 = r0.e()
        L6d:
            if (r1 == 0) goto Lab
            goto La5
        L70:
            u.d r2 = r2.P
            u.d r0 = r0.R
            v.f r3 = r5.i(r2, r1)
            int r2 = r2.e()
            u.e r4 = r5.r()
            if (r4 == 0) goto L88
            u.d r2 = r4.P
            int r2 = r2.e()
        L88:
            if (r3 == 0) goto L8f
            v.f r4 = r5.f27771h
            r5.b(r4, r3, r2)
        L8f:
            v.f r1 = r5.i(r0, r1)
            int r0 = r0.e()
            u.e r2 = r5.s()
            if (r2 == 0) goto La3
            u.d r0 = r2.R
            int r0 = r0.e()
        La3:
            if (r1 == 0) goto Lab
        La5:
            v.f r2 = r5.f27772i
            int r0 = -r0
            r5.b(r2, r1, r0)
        Lab:
            v.f r0 = r5.f27771h
            r0.f27711a = r5
            v.f r0 = r5.f27772i
            r0.f27711a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.c.d():void");
    }

    @Override // v.p
    public void e() {
        for (int i10 = 0; i10 < this.f27700k.size(); i10++) {
            ((p) this.f27700k.get(i10)).e();
        }
    }

    @Override // v.p
    void f() {
        this.f27766c = null;
        Iterator it = this.f27700k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
    }

    @Override // v.p
    public long j() {
        int size = this.f27700k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = j10 + r4.f27771h.f27716f + ((p) this.f27700k.get(i10)).j() + r4.f27772i.f27716f;
        }
        return j10;
    }

    @Override // v.p
    boolean m() {
        int size = this.f27700k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((p) this.f27700k.get(i10)).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f27769f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f27700k.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            sb2.append("<");
            sb2.append(pVar);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
