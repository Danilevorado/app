package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class uk4 extends xk4 {

    /* renamed from: c, reason: collision with root package name */
    private tk4 f16376c;

    @Override // com.google.android.gms.internal.ads.xk4
    public final yk4 d(u84[] u84VarArr, fj4 fj4Var, hh4 hh4Var, h11 h11Var) {
        boolean z10;
        int[] iArr;
        int[] iArr2 = new int[3];
        j31[][] j31VarArr = new j31[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = fj4Var.f8303a;
            j31VarArr[i10] = new j31[i11];
            iArr3[i10] = new int[i11][];
        }
        int i12 = 2;
        int[] iArr4 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            iArr4[i13] = u84VarArr[i13].c();
        }
        int i14 = 0;
        while (i14 < fj4Var.f8303a) {
            j31 j31VarB = fj4Var.b(i14);
            int i15 = j31VarB.f10283c;
            int i16 = i12;
            int i17 = 0;
            int i18 = 0;
            boolean z11 = true;
            while (i17 < i12) {
                u84 u84Var = u84VarArr[i17];
                int iMax = 0;
                for (int i19 = 0; i19 <= 0; i19++) {
                    iMax = Math.max(iMax, u84Var.o(j31VarB.b(i19)) & 7);
                }
                boolean z12 = iArr2[i17] == 0;
                if (iMax > i18) {
                    z11 = z12;
                    i16 = i17;
                    i18 = iMax;
                } else if (iMax == i18 && i15 == 5 && !z11 && z12) {
                    i16 = i17;
                    i18 = iMax;
                    z11 = true;
                }
                i17++;
                i12 = 2;
            }
            if (i16 == i12) {
                iArr = new int[1];
            } else {
                u84 u84Var2 = u84VarArr[i16];
                int[] iArr5 = new int[1];
                for (int i20 = 0; i20 <= 0; i20++) {
                    iArr5[i20] = u84Var2.o(j31VarB.b(i20));
                }
                iArr = iArr5;
            }
            int i21 = iArr2[i16];
            j31VarArr[i16][i21] = j31VarB;
            iArr3[i16][i21] = iArr;
            iArr2[i16] = i21 + 1;
            i14++;
            i12 = 2;
        }
        fj4[] fj4VarArr = new fj4[i12];
        String[] strArr = new String[i12];
        int[] iArr6 = new int[i12];
        int i22 = 0;
        while (i22 < i12) {
            int i23 = iArr2[i22];
            fj4VarArr[i22] = new fj4((j31[]) sv2.f(j31VarArr[i22], i23));
            iArr3[i22] = (int[][]) sv2.f(iArr3[i22], i23);
            strArr[i22] = u84VarArr[i22].s();
            iArr6[i22] = u84VarArr[i22].b();
            i22++;
            i12 = 2;
        }
        int i24 = i12;
        tk4 tk4Var = new tk4(strArr, iArr6, fj4VarArr, iArr4, iArr3, new fj4((j31[]) sv2.f(j31VarArr[i24], iArr2[i24])));
        Pair pairI = i(tk4Var, iArr3, iArr4, hh4Var, h11Var);
        vk4[] vk4VarArr = (vk4[]) pairI.second;
        List[] listArr = new List[vk4VarArr.length];
        for (int i25 = 0; i25 < vk4VarArr.length; i25++) {
            vk4 vk4Var = vk4VarArr[i25];
            listArr[i25] = vk4Var != null ? c63.v(vk4Var) : c63.u();
        }
        z53 z53Var = new z53();
        for (int i26 = 0; i26 < 2; i26++) {
            fj4 fj4VarD = tk4Var.d(i26);
            List list = listArr[i26];
            for (int i27 = 0; i27 < fj4VarD.f8303a; i27++) {
                j31 j31VarB2 = fj4VarD.b(i27);
                boolean z13 = tk4Var.a(i26, i27, false) != 0;
                int i28 = j31VarB2.f10281a;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i29 = 0; i29 <= 0; i29++) {
                    iArr7[i29] = tk4Var.b(i26, i27, i29) & 7;
                    int i30 = 0;
                    while (true) {
                        if (i30 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        vk4 vk4Var2 = (vk4) list.get(i30);
                        if (vk4Var2.c().equals(j31VarB2) && vk4Var2.K(i29) != -1) {
                            z10 = true;
                            break;
                        }
                        i30++;
                    }
                    zArr[i29] = z10;
                }
                z53Var.g(new qb1(j31VarB2, z13, iArr7, zArr));
            }
        }
        fj4 fj4VarE = tk4Var.e();
        for (int i31 = 0; i31 < fj4VarE.f8303a; i31++) {
            j31 j31VarB3 = fj4VarE.b(i31);
            int i32 = j31VarB3.f10281a;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            z53Var.g(new qb1(j31VarB3, false, iArr8, new boolean[1]));
        }
        return new yk4((w84[]) pairI.first, (rk4[]) pairI.second, new rc1(z53Var.j()), tk4Var);
    }

    @Override // com.google.android.gms.internal.ads.xk4
    public final void e(Object obj) {
        this.f16376c = (tk4) obj;
    }

    protected abstract Pair i(tk4 tk4Var, int[][][] iArr, int[] iArr2, hh4 hh4Var, h11 h11Var);
}
