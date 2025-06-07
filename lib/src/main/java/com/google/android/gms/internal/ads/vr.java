package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class vr extends wr {
    vr() {
    }

    private static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < str.length() && str.charAt(i11) == ',') {
            i11++;
        }
        while (length > 0) {
            int i12 = length - 1;
            if (str.charAt(i12) != ',') {
                break;
            }
            length = i12;
        }
        if (length < i11) {
            return null;
        }
        if (i11 != 0) {
            i10 = i11;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i10, length);
    }

    @Override // com.google.android.gms.internal.ads.wr
    public final String a(String str, String str2) {
        String strB = b(str);
        String strB2 = b(str2);
        if (TextUtils.isEmpty(strB)) {
            return strB2;
        }
        if (TextUtils.isEmpty(strB2)) {
            return strB;
        }
        return strB + "," + strB2;
    }
}
