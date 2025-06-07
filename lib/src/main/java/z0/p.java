package z0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import z0.l;

/* loaded from: classes.dex */
public class p extends l {
    int X;
    private ArrayList V = new ArrayList();
    private boolean W = true;
    boolean Y = false;
    private int Z = 0;

    class a extends m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f28732a;

        a(l lVar) {
            this.f28732a = lVar;
        }

        @Override // z0.l.f
        public void c(l lVar) {
            this.f28732a.a0();
            lVar.W(this);
        }
    }

    static class b extends m {

        /* renamed from: a, reason: collision with root package name */
        p f28734a;

        b(p pVar) {
            this.f28734a = pVar;
        }

        @Override // z0.m, z0.l.f
        public void b(l lVar) {
            p pVar = this.f28734a;
            if (pVar.Y) {
                return;
            }
            pVar.h0();
            this.f28734a.Y = true;
        }

        @Override // z0.l.f
        public void c(l lVar) {
            p pVar = this.f28734a;
            int i10 = pVar.X - 1;
            pVar.X = i10;
            if (i10 == 0) {
                pVar.Y = false;
                pVar.w();
            }
            lVar.W(this);
        }
    }

    private void m0(l lVar) {
        this.V.add(lVar);
        lVar.D = this;
    }

    private void v0() {
        b bVar = new b(this);
        Iterator it = this.V.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a(bVar);
        }
        this.X = this.V.size();
    }

    @Override // z0.l
    public void U(View view) {
        super.U(view);
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l) this.V.get(i10)).U(view);
        }
    }

    @Override // z0.l
    public void Y(View view) {
        super.Y(view);
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l) this.V.get(i10)).Y(view);
        }
    }

    @Override // z0.l
    protected void a0() {
        if (this.V.isEmpty()) {
            h0();
            w();
            return;
        }
        v0();
        if (this.W) {
            Iterator it = this.V.iterator();
            while (it.hasNext()) {
                ((l) it.next()).a0();
            }
            return;
        }
        for (int i10 = 1; i10 < this.V.size(); i10++) {
            ((l) this.V.get(i10 - 1)).a(new a((l) this.V.get(i10)));
        }
        l lVar = (l) this.V.get(0);
        if (lVar != null) {
            lVar.a0();
        }
    }

    @Override // z0.l
    public void c0(l.e eVar) {
        super.c0(eVar);
        this.Z |= 8;
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l) this.V.get(i10)).c0(eVar);
        }
    }

    @Override // z0.l
    public void e0(g gVar) {
        super.e0(gVar);
        this.Z |= 4;
        if (this.V != null) {
            for (int i10 = 0; i10 < this.V.size(); i10++) {
                ((l) this.V.get(i10)).e0(gVar);
            }
        }
    }

    @Override // z0.l
    public void f0(o oVar) {
        super.f0(oVar);
        this.Z |= 2;
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l) this.V.get(i10)).f0(oVar);
        }
    }

    @Override // z0.l
    public void i(r rVar) {
        if (N(rVar.f28739b)) {
            Iterator it = this.V.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                if (lVar.N(rVar.f28739b)) {
                    lVar.i(rVar);
                    rVar.f28740c.add(lVar);
                }
            }
        }
    }

    @Override // z0.l
    String i0(String str) {
        String strI0 = super.i0(str);
        for (int i10 = 0; i10 < this.V.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strI0);
            sb2.append("\n");
            sb2.append(((l) this.V.get(i10)).i0(str + "  "));
            strI0 = sb2.toString();
        }
        return strI0;
    }

    @Override // z0.l
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public p a(l.f fVar) {
        return (p) super.a(fVar);
    }

    @Override // z0.l
    void k(r rVar) {
        super.k(rVar);
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l) this.V.get(i10)).k(rVar);
        }
    }

    @Override // z0.l
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public p b(View view) {
        for (int i10 = 0; i10 < this.V.size(); i10++) {
            ((l) this.V.get(i10)).b(view);
        }
        return (p) super.b(view);
    }

    public p l0(l lVar) {
        m0(lVar);
        long j10 = this.f28705o;
        if (j10 >= 0) {
            lVar.b0(j10);
        }
        if ((this.Z & 1) != 0) {
            lVar.d0(z());
        }
        if ((this.Z & 2) != 0) {
            D();
            lVar.f0(null);
        }
        if ((this.Z & 4) != 0) {
            lVar.e0(C());
        }
        if ((this.Z & 8) != 0) {
            lVar.c0(y());
        }
        return this;
    }

    @Override // z0.l
    public void m(r rVar) {
        if (N(rVar.f28739b)) {
            Iterator it = this.V.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                if (lVar.N(rVar.f28739b)) {
                    lVar.m(rVar);
                    rVar.f28740c.add(lVar);
                }
            }
        }
    }

    public l n0(int i10) {
        if (i10 < 0 || i10 >= this.V.size()) {
            return null;
        }
        return (l) this.V.get(i10);
    }

    public int o0() {
        return this.V.size();
    }

    @Override // z0.l
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public p W(l.f fVar) {
        return (p) super.W(fVar);
    }

    @Override // z0.l
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public p X(View view) {
        for (int i10 = 0; i10 < this.V.size(); i10++) {
            ((l) this.V.get(i10)).X(view);
        }
        return (p) super.X(view);
    }

    @Override // z0.l
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public p b0(long j10) {
        ArrayList arrayList;
        super.b0(j10);
        if (this.f28705o >= 0 && (arrayList = this.V) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((l) this.V.get(i10)).b0(j10);
            }
        }
        return this;
    }

    @Override // z0.l
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public p d0(TimeInterpolator timeInterpolator) {
        this.Z |= 1;
        ArrayList arrayList = this.V;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((l) this.V.get(i10)).d0(timeInterpolator);
            }
        }
        return (p) super.d0(timeInterpolator);
    }

    @Override // z0.l
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public l clone() {
        p pVar = (p) super.clone();
        pVar.V = new ArrayList();
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.m0(((l) this.V.get(i10)).clone());
        }
        return pVar;
    }

    public p t0(int i10) {
        if (i10 == 0) {
            this.W = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
            }
            this.W = false;
        }
        return this;
    }

    @Override // z0.l
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public p g0(long j10) {
        return (p) super.g0(j10);
    }

    @Override // z0.l
    protected void v(ViewGroup viewGroup, s sVar, s sVar2, ArrayList arrayList, ArrayList arrayList2) {
        long jF = F();
        int size = this.V.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = (l) this.V.get(i10);
            if (jF > 0 && (this.W || i10 == 0)) {
                long jF2 = lVar.F();
                if (jF2 > 0) {
                    lVar.g0(jF2 + jF);
                } else {
                    lVar.g0(jF);
                }
            }
            lVar.v(viewGroup, sVar, sVar2, arrayList, arrayList2);
        }
    }
}
