package w6;

import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final u6.c f27961a = new u6.c(u6.a.f27627l);

    private void a(byte[] bArr, int i10) throws r6.d {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f27961a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (u6.d unused) {
            throw r6.d.a();
        }
    }

    private s6.d c(a aVar, Map map) throws r6.f, r6.d {
        j jVarE = aVar.e();
        f fVarD = aVar.d().d();
        b[] bVarArrB = b.b(aVar.c(), jVarE, fVarD);
        int iC = 0;
        for (b bVar : bVarArrB) {
            iC += bVar.c();
        }
        byte[] bArr = new byte[iC];
        int i10 = 0;
        for (b bVar2 : bVarArrB) {
            byte[] bArrA = bVar2.a();
            int iC2 = bVar2.c();
            a(bArrA, iC2);
            int i11 = 0;
            while (i11 < iC2) {
                bArr[i10] = bArrA[i11];
                i11++;
                i10++;
            }
        }
        return d.a(bArr, jVarE, fVarD, map);
    }

    public s6.d b(s6.a aVar, Map map) {
        r6.d e5;
        a aVar2 = new a(aVar);
        r6.f fVar = null;
        try {
            return c(aVar2, map);
        } catch (r6.d e10) {
            e5 = e10;
            try {
                aVar2.f();
                aVar2.g(true);
                aVar2.e();
                aVar2.d();
                aVar2.b();
                s6.d dVarC = c(aVar2, map);
                dVarC.i(new i(true));
                return dVarC;
            } catch (r6.d | r6.f e11) {
                if (fVar != null) {
                    throw fVar;
                }
                if (e5 != null) {
                    throw e5;
                }
                throw e11;
            }
        } catch (r6.f e12) {
            e5 = null;
            fVar = e12;
            aVar2.f();
            aVar2.g(true);
            aVar2.e();
            aVar2.d();
            aVar2.b();
            s6.d dVarC2 = c(aVar2, map);
            dVarC2.i(new i(true));
            return dVarC2;
        }
    }
}
