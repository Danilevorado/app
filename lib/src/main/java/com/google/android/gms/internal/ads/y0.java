package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class y0 {
    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    public static ld0 b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = sv2.f15560a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                ad2.e("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(n2.a(new jm2(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e5) {
                    ad2.f("VorbisUtil", "Failed to parse vorbis picture", e5);
                }
            } else {
                arrayList.add(new e4(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ld0(arrayList);
    }

    public static v0 c(jm2 jm2Var, boolean z10, boolean z11) throws oh0 {
        if (z10) {
            d(3, jm2Var, false);
        }
        String strF = jm2Var.F((int) jm2Var.y(), u23.f16142c);
        int length = strF.length();
        long jY = jm2Var.y();
        String[] strArr = new String[(int) jY];
        int length2 = length + 15;
        for (int i10 = 0; i10 < jY; i10++) {
            String strF2 = jm2Var.F((int) jm2Var.y(), u23.f16142c);
            strArr[i10] = strF2;
            length2 = length2 + 4 + strF2.length();
        }
        if (z11 && (jm2Var.s() & 1) == 0) {
            throw oh0.a("framing bit expected to be set", null);
        }
        return new v0(strF, strArr, length2 + 1);
    }

    public static boolean d(int i10, jm2 jm2Var, boolean z10) throws oh0 {
        if (jm2Var.i() < 7) {
            if (z10) {
                return false;
            }
            throw oh0.a("too short header: " + jm2Var.i(), null);
        }
        if (jm2Var.s() != i10) {
            if (z10) {
                return false;
            }
            throw oh0.a("expected header type ".concat(String.valueOf(Integer.toHexString(i10))), null);
        }
        if (jm2Var.s() == 118 && jm2Var.s() == 111 && jm2Var.s() == 114 && jm2Var.s() == 98 && jm2Var.s() == 105 && jm2Var.s() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw oh0.a("expected characters 'vorbis'", null);
    }
}
