package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes.dex */
public abstract class lb {
    public static long a(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e5) {
            if ("0".equals(str) || "-1".equals(str)) {
                ab.d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            ab.c(e5, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static w9 b(ja jaVar) throws NumberFormatException {
        boolean z10;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = jaVar.f10398c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jA = str != null ? a(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            int i11 = 0;
            j10 = 0;
            j11 = 0;
            while (i10 < strArrSplit.length) {
                String strTrim = strArrSplit[i10].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j11 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j10 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    i11 = 1;
                }
                i10++;
            }
            i10 = i11;
            z10 = true;
        } else {
            z10 = false;
            j10 = 0;
            j11 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jA2 = str3 != null ? a(str3) : 0L;
        String str4 = (String) map.get("Last-Modified");
        long jA3 = str4 != null ? a(str4) : 0L;
        String str5 = (String) map.get("ETag");
        if (z10) {
            j13 = jCurrentTimeMillis + (j11 * 1000);
            if (i10 != 0) {
                j14 = j13;
            } else {
                Long.signum(j10);
                j14 = (j10 * 1000) + j13;
            }
            j12 = j14;
        } else {
            j12 = 0;
            if (jA <= 0 || jA2 < jA) {
                j13 = 0;
            } else {
                j13 = jCurrentTimeMillis + (jA2 - jA);
                j12 = j13;
            }
        }
        w9 w9Var = new w9();
        w9Var.f17022a = jaVar.f10397b;
        w9Var.f17023b = str5;
        w9Var.f17027f = j13;
        w9Var.f17026e = j12;
        w9Var.f17024c = jA;
        w9Var.f17025d = jA3;
        w9Var.f17028g = map;
        w9Var.f17029h = jaVar.f10399d;
        return w9Var;
    }

    static String c(long j10) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j10));
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
