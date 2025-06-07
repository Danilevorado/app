package com.meta.analytics.dsp.uinode;

import android.content.Context;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public abstract class LW {
    public static byte[] A00;
    public static final Pattern A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{89, 45, 2, 90, 16, 5, 45, 2, 90, 42, 16, 92, 11, 95, 44, 90, 88, 42, 48, 92, 43, 44, 95, 91, 120, 78, 73, 73, 94, 85, 79, 27, 72, 79, 90, 88, 80, 27, 79, 73, 90, 88, 94, 33, 45, 47, 108, 36, 35, 33, 39, 32, 45, 45, 41, 108, 35, 38, 49};
    }

    static {
        A07();
        A01 = Pattern.compile(A02(0, 24, 13));
    }

    public static String A00() {
        return A06(new Exception(A02(24, 19, 71)), -1, -1, false);
    }

    public static String A01(int i10) {
        if (i10 <= 0) {
            return null;
        }
        float rate = new Random().nextFloat();
        if (rate >= 1.0f / i10) {
            return null;
        }
        return A00();
    }

    public static String A03(Context context, Throwable th) {
        int iA0I = C0662Ih.A0I(context);
        int maxStacktraceLines = C0662Ih.A02(context);
        return A06(th, iA0I, maxStacktraceLines, C0662Ih.A1G(context));
    }

    public static String A04(String str) {
        Matcher matcher = A01.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static String A06(Throwable th, int i10, int i11, boolean z10) {
        String strA02 = A02(0, 0, 122);
        if (th == null) {
            return strA02;
        }
        try {
            C0967Uh c0967Uh = new C0967Uh();
            LU c0966Ug = c0967Uh;
            if (i11 >= 0) {
                c0966Ug = new C0965Uf(c0966Ug, i11);
            }
            if (i10 >= 0) {
                c0966Ug = new C0964Ue(c0966Ug, i10, i10);
            }
            if (z10) {
                c0966Ug = new C0966Ug(c0966Ug);
            }
            C0968Ui c0968Ui = new C0968Ui(c0967Uh, 1, c0966Ug);
            th.printStackTrace(new PrintWriter(new LV(c0968Ui)));
            c0968Ui.flush();
            return c0967Uh.toString();
        } catch (Exception unused) {
            return strA02;
        }
    }

    public static boolean A08(LT lt) {
        String middle = lt.A02();
        if (middle == null) {
            return false;
        }
        if (A0A(middle)) {
            return true;
        }
        Iterator<String> it = lt.A01().iterator();
        while (it.hasNext()) {
            if (A0A(it.next())) {
                return true;
            }
        }
        Iterator<String> it2 = lt.A00().iterator();
        while (it2.hasNext()) {
            if (A0A(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 62));
    }
}
