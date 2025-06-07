package androidx.biometric;

import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;

/* loaded from: classes.dex */
abstract class j {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.String a(android.content.Context r2, int r3) {
        /*
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            return r2
        L5:
            r0 = 1
            if (r3 == r0) goto L37
            r0 = 7
            if (r3 == r0) goto L34
            switch(r3) {
                case 9: goto L34;
                case 10: goto L31;
                case 11: goto L2e;
                case 12: goto L2b;
                default: goto Le;
            }
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown error code: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "BiometricUtils"
            android.util.Log.e(r0, r3)
            int r3 = androidx.biometric.t.f1520b
        L26:
            java.lang.String r2 = r2.getString(r3)
            return r2
        L2b:
            int r3 = androidx.biometric.t.f1523e
            goto L26
        L2e:
            int r3 = androidx.biometric.t.f1525g
            goto L26
        L31:
            int r3 = androidx.biometric.t.f1526h
            goto L26
        L34:
            int r3 = androidx.biometric.t.f1524f
            goto L26
        L37:
            int r3 = androidx.biometric.t.f1522d
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.j.a(android.content.Context, int):java.lang.String");
    }

    static boolean b(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
            case 8:
            case 9:
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 6:
            default:
                return false;
        }
    }

    static boolean c(int i10) {
        return i10 == 7 || i10 == 9;
    }
}
