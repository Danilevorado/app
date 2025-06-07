package com.google.android.gms.measurement.internal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes.dex */
abstract class fa {

    /* renamed from: a, reason: collision with root package name */
    final String f19909a;

    /* renamed from: b, reason: collision with root package name */
    final int f19910b;

    /* renamed from: c, reason: collision with root package name */
    Boolean f19911c;

    /* renamed from: d, reason: collision with root package name */
    Boolean f19912d;

    /* renamed from: e, reason: collision with root package name */
    Long f19913e;

    /* renamed from: f, reason: collision with root package name */
    Long f19914f;

    fa(String str, int i10) {
        this.f19909a = str;
        this.f19910b = i10;
    }

    private static Boolean d(String str, int i10, boolean z10, String str2, List list, String str3, s3 s3Var) {
        boolean zStartsWith;
        if (i10 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && i10 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i10 - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z10 ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (s3Var != null) {
                        s3Var.u().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                zStartsWith = str.startsWith(str2);
                break;
            case 3:
                zStartsWith = str.endsWith(str2);
                break;
            case 4:
                zStartsWith = str.contains(str2);
                break;
            case 5:
                zStartsWith = str.equals(str2);
                break;
            case 6:
                if (list != null) {
                    zStartsWith = list.contains(str);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return Boolean.valueOf(zStartsWith);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Boolean e(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.g3 r9, double r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.fa.e(java.math.BigDecimal, com.google.android.gms.internal.measurement.g3, double):java.lang.Boolean");
    }

    static Boolean f(String str, com.google.android.gms.internal.measurement.n3 n3Var, s3 s3Var) {
        List list;
        e4.p.l(n3Var);
        if (str == null || !n3Var.D() || n3Var.E() == 1) {
            return null;
        }
        if (n3Var.E() == 7) {
            if (n3Var.v() == 0) {
                return null;
            }
        } else if (!n3Var.C()) {
            return null;
        }
        int iE = n3Var.E();
        boolean zA = n3Var.A();
        String strY = (zA || iE == 2 || iE == 7) ? n3Var.y() : n3Var.y().toUpperCase(Locale.ENGLISH);
        if (n3Var.v() == 0) {
            list = null;
        } else {
            List listZ = n3Var.z();
            if (!zA) {
                ArrayList arrayList = new ArrayList(listZ.size());
                Iterator it = listZ.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listZ = Collections.unmodifiableList(arrayList);
            }
            list = listZ;
        }
        return d(str, iE, zA, strY, list, iE == 2 ? strY : null, s3Var);
    }

    static Boolean g(double d10, com.google.android.gms.internal.measurement.g3 g3Var) {
        try {
            return e(new BigDecimal(d10), g3Var, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean h(long j10, com.google.android.gms.internal.measurement.g3 g3Var) {
        try {
            return e(new BigDecimal(j10), g3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean i(String str, com.google.android.gms.internal.measurement.g3 g3Var) {
        if (!p9.N(str)) {
            return null;
        }
        try {
            return e(new BigDecimal(str), g3Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean j(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    abstract int a();

    abstract boolean b();

    abstract boolean c();
}
