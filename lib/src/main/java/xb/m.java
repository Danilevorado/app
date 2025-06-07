package xb;

import ib.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class m extends l {
    public static /* synthetic */ String A(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return y(str, str2, str3);
    }

    public static CharSequence B(CharSequence charSequence) {
        rb.h.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zC = a.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final int h(CharSequence charSequence) {
        rb.h.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int i(CharSequence charSequence, char c10, int i10, boolean z10) {
        rb.h.e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? o(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static final int j(CharSequence charSequence, String str, int i10, boolean z10) {
        rb.h.e(charSequence, "<this>");
        rb.h.e(str, "string");
        return (z10 || !(charSequence instanceof String)) ? l(charSequence, str, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(str, i10);
    }

    private static final int k(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        ub.a cVar = !z11 ? new ub.c(ub.f.a(i10, 0), ub.f.b(i11, charSequence.length())) : ub.f.e(ub.f.b(i10, h(charSequence)), ub.f.a(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iE = cVar.e();
            int iF = cVar.f();
            int iH = cVar.h();
            if ((iH <= 0 || iE > iF) && (iH >= 0 || iF > iE)) {
                return -1;
            }
            while (!l.e((String) charSequence2, 0, (String) charSequence, iE, charSequence2.length(), z10)) {
                if (iE == iF) {
                    return -1;
                }
                iE += iH;
            }
            return iE;
        }
        int iE2 = cVar.e();
        int iF2 = cVar.f();
        int iH2 = cVar.h();
        if ((iH2 <= 0 || iE2 > iF2) && (iH2 >= 0 || iF2 > iE2)) {
            return -1;
        }
        while (!s(charSequence2, 0, charSequence, iE2, charSequence2.length(), z10)) {
            if (iE2 == iF2) {
                return -1;
            }
            iE2 += iH2;
        }
        return iE2;
    }

    static /* synthetic */ int l(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return k(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static /* synthetic */ int m(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return i(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int n(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return j(charSequence, str, i10, z10);
    }

    public static final int o(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        boolean z11;
        rb.h.e(charSequence, "<this>");
        rb.h.e(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ib.f.f(cArr), i10);
        }
        w wVarI = new ub.c(ub.f.a(i10, 0), h(charSequence)).iterator();
        while (wVarI.hasNext()) {
            int iB = wVarI.b();
            char cCharAt = charSequence.charAt(iB);
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    break;
                }
                if (b.d(cArr[i11], cCharAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return iB;
            }
        }
        return -1;
    }

    public static final int p(CharSequence charSequence, char c10, int i10, boolean z10) {
        rb.h.e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? r(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static /* synthetic */ int q(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = h(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return p(charSequence, c10, i10, z10);
    }

    public static final int r(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        rb.h.e(charSequence, "<this>");
        rb.h.e(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(ib.f.f(cArr), i10);
        }
        for (int iB = ub.f.b(i10, h(charSequence)); -1 < iB; iB--) {
            char cCharAt = charSequence.charAt(iB);
            int length = cArr.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (b.d(cArr[i11], cCharAt, z10)) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            if (z11) {
                return iB;
            }
        }
        return -1;
    }

    public static final boolean s(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        rb.h.e(charSequence, "<this>");
        rb.h.e(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!b.d(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static final String t(String str, String str2, String str3) {
        rb.h.e(str, "<this>");
        rb.h.e(str2, "delimiter");
        rb.h.e(str3, "missingDelimiterValue");
        int iN = n(str, str2, 0, false, 6, null);
        if (iN == -1) {
            return str3;
        }
        String strSubstring = str.substring(iN + str2.length(), str.length());
        rb.h.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String u(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return t(str, str2, str3);
    }

    public static final String v(String str, char c10, String str2) {
        rb.h.e(str, "<this>");
        rb.h.e(str2, "missingDelimiterValue");
        int iQ = q(str, c10, 0, false, 6, null);
        if (iQ == -1) {
            return str2;
        }
        String strSubstring = str.substring(iQ + 1, str.length());
        rb.h.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String w(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return v(str, c10, str2);
    }

    public static final String x(String str, char c10, String str2) {
        rb.h.e(str, "<this>");
        rb.h.e(str2, "missingDelimiterValue");
        int iM = m(str, c10, 0, false, 6, null);
        if (iM == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iM);
        rb.h.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final String y(String str, String str2, String str3) {
        rb.h.e(str, "<this>");
        rb.h.e(str2, "delimiter");
        rb.h.e(str3, "missingDelimiterValue");
        int iN = n(str, str2, 0, false, 6, null);
        if (iN == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iN);
        rb.h.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String z(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return x(str, c10, str2);
    }
}
