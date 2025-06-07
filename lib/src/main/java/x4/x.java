package x4;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class x {
    public static String a(String str, String[] strArr, String[] strArr2) {
        e4.p.l(strArr);
        e4.p.l(strArr2);
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i10];
            }
        }
        return null;
    }

    public static String b(Context context, String str, String str2) {
        e4.p.l(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = m.a(context);
        }
        return m.b("google_app_id", resources, str2);
    }
}
