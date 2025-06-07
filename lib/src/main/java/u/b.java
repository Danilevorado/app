package u;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x035e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[PHI: r15 r16
  0x0044: PHI (r15v3 boolean) = (r15v1 boolean), (r15v32 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0044: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[PHI: r15 r16
  0x0046: PHI (r15v30 boolean) = (r15v1 boolean), (r15v32 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x03a7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v42, types: [u.e] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [u.e] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void a(u.f r38, r.d r39, int r40, int r41, u.c r42) {
        /*
            Method dump skipped, instructions count: 1345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.b.a(u.f, r.d, int, int, u.c):void");
    }

    public static void b(f fVar, r.d dVar, ArrayList arrayList, int i10) {
        c[] cVarArr;
        int i11;
        int i12;
        if (i10 == 0) {
            i12 = fVar.W0;
            cVarArr = fVar.Z0;
            i11 = 0;
        } else {
            int i13 = fVar.X0;
            cVarArr = fVar.Y0;
            i11 = 2;
            i12 = i13;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            c cVar = cVarArr[i14];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f27406a)) {
                a(fVar, dVar, i10, i11, cVar);
            }
        }
    }
}
