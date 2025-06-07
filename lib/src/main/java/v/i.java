package v;

import java.util.ArrayList;
import u.e;

/* loaded from: classes.dex */
public abstract class i {
    public static o a(u.e eVar, int i10, ArrayList arrayList, o oVar) {
        u.d dVar;
        int iO1;
        int i11 = i10 == 0 ? eVar.I0 : eVar.J0;
        if (i11 != -1 && (oVar == null || i11 != oVar.f27751b)) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                o oVar2 = (o) arrayList.get(i12);
                if (oVar2.c() == i11) {
                    if (oVar != null) {
                        oVar.g(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i12++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof u.i) && (iO1 = ((u.i) eVar).o1(i10)) != -1) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = (o) arrayList.get(i13);
                    if (oVar3.c() == iO1) {
                        oVar = oVar3;
                        break;
                    }
                    i13++;
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof u.g) {
                u.g gVar = (u.g) eVar;
                gVar.n1().b(gVar.o1() == 0 ? 1 : 0, arrayList, oVar);
            }
            int iC = oVar.c();
            if (i10 == 0) {
                eVar.I0 = iC;
                eVar.O.b(i10, arrayList, oVar);
                dVar = eVar.Q;
            } else {
                eVar.J0 = iC;
                eVar.P.b(i10, arrayList, oVar);
                eVar.S.b(i10, arrayList, oVar);
                dVar = eVar.R;
            }
            dVar.b(i10, arrayList, oVar);
            eVar.V.b(i10, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            if (i10 == oVar.f27751b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0343  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(u.f r16, v.b.InterfaceC0195b r17) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.i.c(u.f, v.b$b):boolean");
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
