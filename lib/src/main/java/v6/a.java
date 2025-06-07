package v6;

import java.util.List;
import java.util.Map;
import r6.c;
import r6.h;
import r6.k;
import r6.l;
import r6.m;
import s6.d;
import s6.f;
import w6.e;
import w6.i;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final m[] f27901b = new m[0];

    /* renamed from: a, reason: collision with root package name */
    private final e f27902a = new e();

    private static s6.a b(s6.a aVar) throws h {
        int[] iArrI = aVar.i();
        int[] iArrF = aVar.f();
        if (iArrI == null || iArrF == null) {
            throw h.a();
        }
        float fC = c(iArrI, aVar);
        int i10 = iArrI[1];
        int i11 = iArrF[1];
        int i12 = iArrI[0];
        int i13 = iArrF[0];
        if (i12 >= i13 || i10 >= i11) {
            throw h.a();
        }
        int i14 = i11 - i10;
        if (i14 != i13 - i12 && (i13 = i12 + i14) >= aVar.j()) {
            throw h.a();
        }
        int iRound = Math.round(((i13 - i12) + 1) / fC);
        int iRound2 = Math.round((i14 + 1) / fC);
        if (iRound <= 0 || iRound2 <= 0) {
            throw h.a();
        }
        if (iRound2 != iRound) {
            throw h.a();
        }
        int i15 = (int) (fC / 2.0f);
        int i16 = i10 + i15;
        int i17 = i12 + i15;
        int i18 = (((int) ((iRound - 1) * fC)) + i17) - i13;
        if (i18 > 0) {
            if (i18 > i15) {
                throw h.a();
            }
            i17 -= i18;
        }
        int i19 = (((int) ((iRound2 - 1) * fC)) + i16) - i11;
        if (i19 > 0) {
            if (i19 > i15) {
                throw h.a();
            }
            i16 -= i19;
        }
        s6.a aVar2 = new s6.a(iRound, iRound2);
        for (int i20 = 0; i20 < iRound2; i20++) {
            int i21 = ((int) (i20 * fC)) + i16;
            for (int i22 = 0; i22 < iRound; i22++) {
                if (aVar.d(((int) (i22 * fC)) + i17, i21)) {
                    aVar2.k(i22, i20);
                }
            }
        }
        return aVar2;
    }

    private static float c(int[] iArr, s6.a aVar) throws h {
        int iG = aVar.g();
        int iJ = aVar.j();
        int i10 = iArr[0];
        boolean z10 = true;
        int i11 = iArr[1];
        int i12 = 0;
        while (i10 < iJ && i11 < iG) {
            if (z10 != aVar.d(i10, i11)) {
                i12++;
                if (i12 == 5) {
                    break;
                }
                z10 = !z10;
            }
            i10++;
            i11++;
        }
        if (i10 == iJ || i11 == iG) {
            throw h.a();
        }
        return (i10 - iArr[0]) / 7.0f;
    }

    public final k a(c cVar, Map map) throws h {
        m[] mVarArrB;
        d dVarB;
        if (map == null || !map.containsKey(r6.e.PURE_BARCODE)) {
            f fVarE = new x6.c(cVar.a()).e(map);
            d dVarB2 = this.f27902a.b(fVarE.a(), map);
            mVarArrB = fVarE.b();
            dVarB = dVarB2;
        } else {
            dVarB = this.f27902a.b(b(cVar.a()), map);
            mVarArrB = f27901b;
        }
        if (dVarB.c() instanceof i) {
            ((i) dVarB.c()).a(mVarArrB);
        }
        k kVar = new k(dVarB.g(), dVarB.d(), mVarArrB, r6.a.QR_CODE);
        List listA = dVarB.a();
        if (listA != null) {
            kVar.b(l.BYTE_SEGMENTS, listA);
        }
        String strB = dVarB.b();
        if (strB != null) {
            kVar.b(l.ERROR_CORRECTION_LEVEL, strB);
        }
        if (dVarB.h()) {
            kVar.b(l.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(dVarB.f()));
            kVar.b(l.STRUCTURED_APPEND_PARITY, Integer.valueOf(dVarB.e()));
        }
        return kVar;
    }

    public void d() {
    }
}
