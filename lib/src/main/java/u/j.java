package u;

import u.e;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    static boolean[] f27524a = new boolean[3];

    static void a(f fVar, r.d dVar, e eVar) {
        eVar.f27486t = -1;
        eVar.f27488u = -1;
        e.b bVar = fVar.Z[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.Z[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.O.f27434g;
            int iU = fVar.U() - eVar.Q.f27434g;
            d dVar2 = eVar.O;
            dVar2.f27436i = dVar.q(dVar2);
            d dVar3 = eVar.Q;
            dVar3.f27436i = dVar.q(dVar3);
            dVar.f(eVar.O.f27436i, i10);
            dVar.f(eVar.Q.f27436i, iU);
            eVar.f27486t = 2;
            eVar.L0(i10, iU);
        }
        if (fVar.Z[1] == bVar2 || eVar.Z[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.P.f27434g;
        int iV = fVar.v() - eVar.R.f27434g;
        d dVar4 = eVar.P;
        dVar4.f27436i = dVar.q(dVar4);
        d dVar5 = eVar.R;
        dVar5.f27436i = dVar.q(dVar5);
        dVar.f(eVar.P.f27436i, i11);
        dVar.f(eVar.R.f27436i, iV);
        if (eVar.f27471l0 > 0 || eVar.T() == 8) {
            d dVar6 = eVar.S;
            dVar6.f27436i = dVar.q(dVar6);
            dVar.f(eVar.S.f27436i, eVar.f27471l0 + i11);
        }
        eVar.f27488u = 2;
        eVar.b1(i11, iV);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
