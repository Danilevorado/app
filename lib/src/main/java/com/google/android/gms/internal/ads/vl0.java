package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class vl0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f16767a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f16768b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(String str, String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        Matcher matcher = f16767a.matcher(str);
        int i10 = 0;
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb2.append(str.substring(0, iEnd));
            while (i10 <= 0) {
                String str2 = strArr[i10];
                if (str2 != null) {
                    sb2.append(str2);
                }
                i10++;
            }
            str = str.substring(iEnd);
        } else if (!f16768b.matcher(str).find()) {
            while (i10 <= 0) {
                String str3 = strArr[i10];
                if (str3 != null) {
                    sb2.append(str3);
                }
                i10++;
            }
        }
        sb2.append(str);
        return sb2.toString();
    }
}
