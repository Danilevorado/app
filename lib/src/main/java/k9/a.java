package k9;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public abstract class a {
    public static String[] a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        String[] strArr2 = new String[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr2[i10] = TextUtils.isEmpty(strArr[i10]) ? "'null'" : strArr[i10];
        }
        return strArr2;
    }
}
