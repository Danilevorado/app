package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class se0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f15201b = new b03(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private static final String f15202c = AdView.class.getName();

    /* renamed from: d, reason: collision with root package name */
    private static final String f15203d = n3.a.class.getName();

    /* renamed from: e, reason: collision with root package name */
    private static final String f15204e = e3.a.class.getName();

    /* renamed from: f, reason: collision with root package name */
    private static final String f15205f = e3.b.class.getName();

    /* renamed from: g, reason: collision with root package name */
    private static final String f15206g = w3.b.class.getName();

    /* renamed from: h, reason: collision with root package name */
    private static final String f15207h = d3.e.class.getName();

    /* renamed from: a, reason: collision with root package name */
    private float f15208a = -1.0f;

    public static final String A(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || t()) {
            string = "emulator";
        }
        return B(string, "MD5");
    }

    private static String B(String str, String str2) throws NoSuchAlgorithmException {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    private final JSONArray a(Collection collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b(jSONArray, it.next());
        }
        return jSONArray;
    }

    private final void b(JSONArray jSONArray, Object obj) throws JSONException {
        Object objI;
        if (obj instanceof Bundle) {
            objI = j((Bundle) obj);
        } else if (obj instanceof Map) {
            objI = k((Map) obj);
        } else if (obj instanceof Collection) {
            objI = a((Collection) obj);
        } else {
            if (!(obj instanceof Object[])) {
                jSONArray.put(obj);
                return;
            }
            objI = i((Object[]) obj);
        }
        jSONArray.put(objI);
    }

    private final void c(JSONObject jSONObject, String str, Object obj) throws JSONException {
        Boolean[] boolArr;
        Object objI;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        Collection collectionAsList;
        if (((Boolean) k3.w.c().b(ir.f10087t)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            objI = j((Bundle) obj);
        } else if (obj instanceof Map) {
            objI = k((Map) obj);
        } else {
            if (obj instanceof Collection) {
                str = String.valueOf(str);
                collectionAsList = (Collection) obj;
            } else if (obj instanceof Object[]) {
                collectionAsList = Arrays.asList((Object[]) obj);
            } else {
                int i10 = 0;
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    if (iArr == null) {
                        numArr = new Integer[0];
                    } else {
                        int length = iArr.length;
                        Integer[] numArr2 = new Integer[length];
                        while (i10 < length) {
                            numArr2[i10] = Integer.valueOf(iArr[i10]);
                            i10++;
                        }
                        numArr = numArr2;
                    }
                    objI = i(numArr);
                } else if (obj instanceof double[]) {
                    double[] dArr2 = (double[]) obj;
                    if (dArr2 == null) {
                        dArr = new Double[0];
                    } else {
                        int length2 = dArr2.length;
                        Double[] dArr3 = new Double[length2];
                        while (i10 < length2) {
                            dArr3[i10] = Double.valueOf(dArr2[i10]);
                            i10++;
                        }
                        dArr = dArr3;
                    }
                    objI = i(dArr);
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    if (jArr == null) {
                        lArr = new Long[0];
                    } else {
                        int length3 = jArr.length;
                        Long[] lArr2 = new Long[length3];
                        while (i10 < length3) {
                            lArr2[i10] = Long.valueOf(jArr[i10]);
                            i10++;
                        }
                        lArr = lArr2;
                    }
                    objI = i(lArr);
                } else {
                    if (!(obj instanceof boolean[])) {
                        jSONObject.put(str, obj);
                        return;
                    }
                    boolean[] zArr = (boolean[]) obj;
                    if (zArr == null) {
                        boolArr = new Boolean[0];
                    } else {
                        int length4 = zArr.length;
                        Boolean[] boolArr2 = new Boolean[length4];
                        while (i10 < length4) {
                            boolArr2[i10] = Boolean.valueOf(zArr[i10]);
                            i10++;
                        }
                        boolArr = boolArr2;
                    }
                    objI = i(boolArr);
                }
            }
            objI = a(collectionAsList);
        }
        jSONObject.put(str, objI);
    }

    private static final void d(ViewGroup viewGroup, k3.h4 h4Var, String str, int i10, int i11) {
        if (viewGroup.getChildCount() != 0) {
            return;
        }
        Context context = viewGroup.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i10);
        textView.setBackgroundColor(i11);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i10);
        int iZ = z(context, 3);
        frameLayout.addView(textView, new FrameLayout.LayoutParams(h4Var.f24656r - iZ, h4Var.f24653o - iZ, 17));
        viewGroup.addView(frameLayout, h4Var.f24656r, h4Var.f24653o);
    }

    public static String f() throws NoSuchAlgorithmException {
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return string;
    }

    public static String g(String str) {
        return B(str, "MD5");
    }

    public static String h(String str) {
        return B(str, "SHA-256");
    }

    public static boolean q(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) mt.f12247d.e());
    }

    public static final int r(DisplayMetrics displayMetrics, int i10) {
        return (int) TypedValue.applyDimension(1, i10, displayMetrics);
    }

    public static final String s(StackTraceElement[] stackTraceElementArr, String str) {
        int i10;
        String className;
        int i11 = 0;
        while (true) {
            i10 = i11 + 1;
            if (i10 >= stackTraceElementArr.length) {
                className = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f15202c.equalsIgnoreCase(className2) || f15203d.equalsIgnoreCase(className2) || f15204e.equalsIgnoreCase(className2) || f15205f.equalsIgnoreCase(className2) || f15206g.equalsIgnoreCase(className2) || f15207h.equalsIgnoreCase(className2))) {
                break;
            }
            i11 = i10;
        }
        className = stackTraceElementArr[i10].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb2 = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb2.append(stringTokenizer.nextToken());
                for (int i12 = 2; i12 > 0 && stringTokenizer.hasMoreElements(); i12--) {
                    sb2.append(".");
                    sb2.append(stringTokenizer.nextToken());
                }
                str = sb2.toString();
            }
            if (className != null && !className.contains(str)) {
                return className;
            }
        }
        return null;
    }

    public static final boolean t() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator");
    }

    public static final boolean u(Context context, int i10) {
        return b4.f.h().j(context, i10) == 0;
    }

    public static final boolean v(Context context) {
        int iJ = b4.f.h().j(context, 12451000);
        return iJ == 0 || iJ == 2;
    }

    public static final boolean w() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final int x(DisplayMetrics displayMetrics, int i10) {
        return Math.round(i10 / displayMetrics.density);
    }

    public static final void y(Context context, String str, String str2, Bundle bundle, boolean z10, re0 re0Var) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = b4.f.h().b(context) + ".231004000";
        }
        bundle.putString("js", str);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        re0Var.o(builderAppendQueryParameter.toString());
    }

    public static final int z(Context context, int i10) {
        return r(context.getResources().getDisplayMetrics(), i10);
    }

    public final int e(Context context, int i10) {
        if (this.f15208a < 0.0f) {
            synchronized (this) {
                if (this.f15208a < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f15208a = displayMetrics.density;
                }
            }
        }
        return Math.round(i10 / this.f15208a);
    }

    final JSONArray i(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            b(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject j(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            c(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject k(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                c(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e5) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e5.getMessage())));
        }
    }

    public final JSONObject l(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return j(bundle);
        } catch (JSONException e5) {
            ze0.e("Error converting Bundle to JSON", e5);
            return null;
        }
    }

    public final void m(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject2.get(next);
            try {
                Object obj2 = jSONObject.get(next);
                if (JSONObject.class.isInstance(obj2) && JSONObject.class.isInstance(obj)) {
                    m((JSONObject) obj2, (JSONObject) obj);
                }
            } catch (JSONException unused) {
                jSONObject.put(next, obj);
            }
        }
    }

    public final void n(ViewGroup viewGroup, k3.h4 h4Var, String str, String str2) {
        if (str2 != null) {
            ze0.g(str2);
        }
        d(viewGroup, h4Var, str, -65536, -16777216);
    }

    public final void o(ViewGroup viewGroup, k3.h4 h4Var, String str) {
        d(viewGroup, h4Var, "Ads by Google", -16777216, -1);
    }

    public final void p(Context context, String str, String str2, Bundle bundle, boolean z10) {
        y(context, str, "gmob-apps", bundle, true, new re0() { // from class: com.google.android.gms.internal.ads.pe0
            @Override // com.google.android.gms.internal.ads.re0
            public final boolean o(String str3) {
                new qe0(this.f13717a, str3).start();
                return true;
            }
        });
    }
}
