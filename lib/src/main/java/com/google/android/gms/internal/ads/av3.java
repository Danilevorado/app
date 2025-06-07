package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class av3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f6268a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f6269b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long a(String str, String str2) throws NumberFormatException {
        long j10 = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                ad2.b("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j10;
        }
        Matcher matcher = f6268a.matcher(str2);
        if (!matcher.matches()) {
            return j10;
        }
        try {
            String strGroup = matcher.group(2);
            Objects.requireNonNull(strGroup);
            long j11 = Long.parseLong(strGroup);
            String strGroup2 = matcher.group(1);
            Objects.requireNonNull(strGroup2);
            long j12 = (j11 - Long.parseLong(strGroup2)) + 1;
            if (j10 < 0) {
                return j12;
            }
            if (j10 == j12) {
                return j10;
            }
            ad2.e("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(j10, j12);
        } catch (NumberFormatException unused2) {
            ad2.b("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return j10;
        }
    }

    public static long b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f6269b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        Objects.requireNonNull(strGroup);
        return Long.parseLong(strGroup);
    }
}
