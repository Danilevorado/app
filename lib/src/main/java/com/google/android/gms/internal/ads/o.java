package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public abstract class o {
    public static int a(l lVar, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int iD = lVar.D(bArr, i10 + i12, i11 - i12);
            if (iD == -1) {
                break;
            }
            i12 += iD;
        }
        return i12;
    }

    public static void b(boolean z10, String str) throws oh0 {
        if (!z10) {
            throw oh0.a(str, null);
        }
    }

    public static boolean c(l lVar, byte[] bArr, int i10, int i11, boolean z10) throws EOFException {
        try {
            return lVar.E(bArr, 0, i11, z10);
        } catch (EOFException e5) {
            if (z10) {
                return false;
            }
            throw e5;
        }
    }

    public static boolean d(l lVar, byte[] bArr, int i10, int i11) throws InterruptedIOException {
        try {
            ((bo4) lVar).C(bArr, i10, i11, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(l lVar, int i10) throws InterruptedIOException {
        try {
            ((bo4) lVar).h(i10, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
