package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04178a {
    public static byte[] A00;
    public static String[] A01 = {"Zl9Gy", "71kQi3IibsstuH4HIc9NqplK3KKhyeB5", "mg3crekamZV3aPoxR2E4kv0bqU3kjrTA", "tDWcsuqYwEAdFujtzhVkOh2ka7NI4A0", "PNHzgcYnRnalJ1JX3eWvzB80MfZWvl", "qlQSSPcQAlkQmsVxSKI5q3x7hOoP3mTT", "zrCnzE5ZwKYUMsAQc774FEfNlTnoEqKy", "Bh9hDulTgnsRRUxUYqeR6BXC7"};
    public static final String A02;
    public static final AtomicBoolean A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 105);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{19, 39, 90, 78, 81, 73, 40, 84, 83, 75, 78, 76, 40, 85, 75, 89, 86, 80, 75, 7, 58, 43, 50, 7, 73, 92, 80, 83, 91, 7, 77, 86, 89, 7, 95, 31, 29, 14, 33, 21, 24, 16, 43, 32, 37, 28, 17, -34, 10, 16, 7, -1, -69, 9, 10, 15, -69, -4, -1, -1, -69, 11, -4, 13, -4, 8, 0, 15, 0, 13, -43, -82, -81, -84, -65, -79, 41, 81, 89, 80, 69, 88, 83, 86, -3, 27, 36, 47, 35, 37, 42, 31, 37, 36, 7, -24, -6, -2, 13, 8, -4, 16, 6, 23, 2, 59, 74, 74, 57, 77, 78, 59, 76, 78, 63, 62, 57, 76, 63, 59, 77, 73, 72, 43, 62, 50, 53, 45, 40, 61, 66, 57, 46, 10, 11, 8, 27, 13, 5, 28, 7, 18, 27, 11, 69, 67, 76, 67, 80, 71, 65, 52, 60, 60, 52, 57, 50, 44, 64, 49, 56, 65, 75, 55, 60, 61, 58, 77, 63, 63, 57, 58, 68, 61, 81, 91, 71, 77, 85, 93, 38, 27, 31, 23, 44, 33, 32, 23, 17, 33, 24, 24, 37, 23, 38, 59, 52, 49, 52, 53, 61, 52};
    }

    static {
        A06();
        A02 = C04178a.class.getSimpleName();
        A03 = new AtomicBoolean();
    }

    public static int A00() {
        return TimeZone.getDefault().getRawOffset();
    }

    public static long A01(C04017f c04017f, String str) {
        try {
            PackageManager packageManager = c04017f.getPackageManager();
            if (packageManager == null) {
                return -1L;
            }
            return new File(packageManager.getApplicationInfo(str, 0).publicSourceDir).length();
        } catch (Exception e5) {
            if (A01[3].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "oe4F4jbO0w2iVgNeZk473rpjN0tMfGSd";
            strArr[1] = "Wn3TxTRecHzs8MsCsRbpFUd8m0ZaHJcx";
            if (A03.compareAndSet(false, true)) {
                c04017f.A07().A9a(A02(144, 7, 117), C8A.A1E, new C8B(e5));
            }
            return -1L;
        }
    }

    public static String A03(Context context) throws NoSuchFieldException {
        try {
            Field buildType = Class.forName(context.getPackageName() + A02(0, 12, 124)).getDeclaredField(A02(37, 10, 99));
            return (String) buildType.get(null);
        } catch (Exception unused) {
            return A02(94, 3, 80);
        }
    }

    public static String A04(Context context) throws NoSuchFieldException {
        try {
            Field buildType = Class.forName(context.getPackageName() + A02(0, 12, 124)).getDeclaredField(A02(71, 5, 1));
            return String.valueOf(buildType.getBoolean(null));
        } catch (Exception unused) {
            return A02(94, 3, 80);
        }
    }

    public static String A05(C04017f c04017f, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        A07(c04017f, jSONObject, A02(174, 6, 127), String.valueOf(A08()));
        A07(c04017f, jSONObject, A02(97, 8, 52), String.valueOf(A01(c04017f, str)));
        A07(c04017f, jSONObject, A02(180, 15, 73), String.valueOf(A00()));
        A07(c04017f, jSONObject, A02(105, 18, 113), String.valueOf(AbstractC0706Ke.A01(c04017f)));
        A07(c04017f, jSONObject, A02(161, 13, 111), String.valueOf(A09(c04017f)));
        A07(c04017f, jSONObject, A02(133, 11, 61), A04(c04017f));
        A07(c04017f, jSONObject, A02(123, 10, 96), A03(c04017f));
        return jSONObject.toString();
    }

    public static void A07(C04017f c04017f, JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e5) {
            if (c04017f.A04().A8z()) {
                Log.e(A02, A02(47, 24, 50), e5);
            }
        }
    }

    public static boolean A08() {
        String str = Build.FINGERPRINT;
        String strA02 = A02(144, 7, 117);
        if (!str.contains(strA02) && !Build.FINGERPRINT.startsWith(A02(195, 7, 93))) {
            String str2 = Build.MODEL;
            String strA022 = A02(151, 10, 100);
            boolean zContains = str2.contains(strA022);
            String[] strArr = A01;
            if (strArr[2].charAt(18) != strArr[1].charAt(18)) {
                String[] strArr2 = A01;
                strArr2[2] = "pyp5tHHiNqtWEHhOUDcaxWXpzbT8klnO";
                strArr2[1] = "oLUMgMxReJrH8Y2AxnJ9tXY49GWGMSpB";
                if (!zContains) {
                    String str3 = Build.MODEL;
                    if (A01[3].length() == 31) {
                        A01[3] = "kPRAmUopJCVKL3kgnj9rN6E7NTwJXhY";
                        if (!str3.contains(A02(76, 8, 123)) && !Build.MODEL.contains(A02(12, 25, 126)) && !Build.MANUFACTURER.contains(A02(84, 10, 77)) && ((!Build.BRAND.startsWith(strA02) || !Build.DEVICE.startsWith(strA02)) && !strA022.equals(Build.PRODUCT))) {
                            return false;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return true;
    }

    public static boolean A09(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }
}
