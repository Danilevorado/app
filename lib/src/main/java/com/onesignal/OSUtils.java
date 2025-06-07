package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadSystemException;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.location.LocationCallback;
import com.onesignal.e3;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class OSUtils {

    /* renamed from: a, reason: collision with root package name */
    public static int f21657a = 3;

    /* renamed from: b, reason: collision with root package name */
    static final int[] f21658b = {401, 402, 403, 404, 410};

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21659a;

        static {
            int[] iArr = new int[b.values().length];
            f21659a = iArr;
            try {
                iArr[b.DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21659a[b.HTTPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21659a[b.HTTP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        DATA("data"),
        HTTPS("https"),
        HTTP("http");


        /* renamed from: m, reason: collision with root package name */
        private final String f21664m;

        b(String str) {
            this.f21664m = str;
        }

        public static b b(String str) {
            for (b bVar : values()) {
                if (bVar.f21664m.equalsIgnoreCase(str)) {
                    return bVar;
                }
            }
            return null;
        }
    }

    OSUtils() {
    }

    static boolean B() {
        return new OSUtils().e() == 1;
    }

    static boolean C() {
        return new OSUtils().e() == 2;
    }

    static boolean D() {
        return P("com.google.android.gms");
    }

    private static boolean E() {
        try {
            return HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(e3.f21882e) == 0;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof DeadSystemException) {
                return false;
            }
            throw e5;
        }
    }

    private static boolean F() {
        return P("com.huawei.hwid");
    }

    static boolean G() {
        return new OSUtils().e() == 13;
    }

    static boolean H() {
        return Thread.currentThread().equals(Looper.getMainLooper().getThread());
    }

    static boolean I(String str) {
        return !TextUtils.isEmpty(str);
    }

    static boolean J(String str) {
        return (str == null || str.matches("^[0-9]")) ? false : true;
    }

    static Set K() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    static Set L(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            hashSet.add(jSONArray.getString(i10));
        }
        return hashSet;
    }

    private static void M(Uri uri) {
        e3.f21882e.startActivity(O(uri));
    }

    static void N(String str) {
        M(Uri.parse(str.trim()));
    }

    static Intent O(Uri uri) {
        Intent intentMakeMainSelectorActivity;
        b bVarB = uri.getScheme() != null ? b.b(uri.getScheme()) : null;
        if (bVarB == null) {
            bVarB = b.HTTP;
            if (!uri.toString().contains("://")) {
                uri = Uri.parse("http://" + uri.toString());
            }
        }
        if (a.f21659a[bVarB.ordinal()] != 1) {
            intentMakeMainSelectorActivity = new Intent("android.intent.action.VIEW", uri);
        } else {
            intentMakeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            intentMakeMainSelectorActivity.setData(uri);
        }
        intentMakeMainSelectorActivity.addFlags(268435456);
        return intentMakeMainSelectorActivity;
    }

    private static boolean P(String str) {
        PackageInfo packageInfoA;
        x xVarA = t3.f22451a.a(e3.f21882e, str, 128);
        if (xVarA.b() && (packageInfoA = xVarA.a()) != null) {
            return packageInfoA.applicationInfo.enabled;
        }
        return false;
    }

    static long[] Q(JSONObject jSONObject) {
        try {
            Object objOpt = jSONObject.opt("vib_pt");
            JSONArray jSONArray = objOpt instanceof String ? new JSONArray((String) objOpt) : (JSONArray) objOpt;
            long[] jArr = new long[jSONArray.length()];
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                jArr[i10] = jSONArray.optLong(i10);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    static void R(Runnable runnable, int i10) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, i10);
    }

    static void S(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static boolean T(String str) {
        if (str != null) {
            return false;
        }
        e3.a(e3.z.INFO, "OneSignal was not initialized, ensure to always initialize OneSignal from the onCreate of your Application class.");
        return true;
    }

    public static boolean U(int i10) {
        for (int i11 : f21658b) {
            if (i10 == i11) {
                return false;
            }
        }
        return true;
    }

    static void V(int i10) throws InterruptedException {
        try {
            Thread.sleep(i10);
        } catch (InterruptedException e5) {
            e5.printStackTrace();
        }
    }

    static void W(Thread thread) throws InterruptedException {
        boolean z10 = false;
        while (!z10) {
            try {
                thread.start();
                z10 = true;
            } catch (OutOfMemoryError unused) {
                try {
                    Thread.sleep(250L);
                } catch (InterruptedException unused2) {
                }
            }
        }
    }

    private boolean X() throws ClassNotFoundException {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private boolean Y() {
        if (r()) {
            return D();
        }
        return false;
    }

    private boolean Z() {
        if (u() && p()) {
            return E();
        }
        return false;
    }

    static boolean a(Context context) {
        try {
            return androidx.core.app.o.e(e3.f21882e).a();
        } catch (Throwable unused) {
            return true;
        }
    }

    private Integer b(Context context) {
        boolean z10 = z();
        boolean zY = y();
        if (!z10 && !zY) {
            e3.a(e3.z.FATAL, "Could not find the Android Support Library. Please make sure it has been correctly added to your project.");
            return -3;
        }
        if (!z10 || !zY) {
            e3.a(e3.z.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
            return -5;
        }
        if (Build.VERSION.SDK_INT < 26 || o(context) < 26 || x()) {
            return null;
        }
        e3.a(e3.z.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
        return -5;
    }

    static String f(Context context, String str) {
        Bundle bundleH = h(context);
        if (bundleH != null) {
            return bundleH.getString(str);
        }
        return null;
    }

    static boolean g(Context context, String str) {
        Bundle bundleH = h(context);
        if (bundleH != null) {
            return bundleH.getBoolean(str);
        }
        return false;
    }

    static Bundle h(Context context) {
        ApplicationInfo applicationInfoA = i.f22060a.a(context);
        if (applicationInfoA == null) {
            return null;
        }
        return applicationInfoA.metaData;
    }

    static int j(int i10, int i11) {
        return new Random().nextInt((i11 + 1) - i10) + i10;
    }

    static String k(Context context, String str, String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : str2;
    }

    static String l(Throwable th) {
        return m(th).getMessage();
    }

    static Throwable m(Throwable th) {
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        return th;
    }

    static Uri n(Context context, String str) {
        int identifier;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if ((!J(str) || (identifier = resources.getIdentifier(str, "raw", packageName)) == 0) && (identifier = resources.getIdentifier("onesignal_default_sound", "raw", packageName)) == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("android.resource://");
        sb2.append(packageName);
        sb2.append("/");
        sb2.append(identifier);
        return Uri.parse(sb2.toString());
    }

    static int o(Context context) {
        ApplicationInfo applicationInfoA = i.f22060a.a(context);
        if (applicationInfoA == null) {
            return 15;
        }
        return applicationInfoA.targetSdkVersion;
    }

    @Keep
    private static boolean opaqueHasClass(Class<?> cls) {
        return true;
    }

    static boolean p() {
        return t() && w();
    }

    static boolean q(Activity activity, int i10) {
        try {
            return (activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).configChanges & i10) != 0;
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    static boolean r() {
        try {
            return opaqueHasClass(FirebaseMessaging.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    static boolean s() {
        try {
            return opaqueHasClass(v4.c.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    private static boolean t() {
        try {
            return opaqueHasClass(AGConnectServicesConfig.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    private static boolean u() {
        try {
            return opaqueHasClass(HuaweiApiAvailability.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    static boolean v() {
        try {
            return opaqueHasClass(LocationCallback.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    private static boolean w() {
        try {
            return opaqueHasClass(HmsInstanceId.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    private static boolean x() {
        return true;
    }

    private static boolean y() {
        return true;
    }

    private static boolean z() {
        return true;
    }

    int A(Context context, String str) {
        Integer numC;
        int iE = e();
        try {
            UUID.fromString(str);
            if ("b2f7f966-d8cc-11e4-bed1-df8f05be55ba".equals(str) || "5eb5a37e-b458-11e3-ac11-000c2940e62c".equals(str)) {
                e3.a(e3.z.ERROR, "OneSignal Example AppID detected, please update to your app's id found on OneSignal.com");
            }
            int iIntValue = 1;
            if (iE == 1 && (numC = c()) != null) {
                iIntValue = numC.intValue();
            }
            Integer numB = b(context);
            return numB != null ? numB.intValue() : iIntValue;
        } catch (Throwable th) {
            e3.b(e3.z.FATAL, "OneSignal AppId format is invalid.\nExample: 'b2f7f966-d8cc-11e4-bed1-df8f05be55ba'\n", th);
            return -999;
        }
    }

    Integer c() {
        if (r()) {
            return null;
        }
        e3.a(e3.z.FATAL, "The Firebase FCM library is missing! Please make sure to include it in your project.");
        return -4;
    }

    String d() {
        try {
            String networkOperatorName = ((TelephonyManager) e3.f21882e.getSystemService("phone")).getNetworkOperatorName();
            if ("".equals(networkOperatorName)) {
                return null;
            }
            return networkOperatorName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    int e() {
        if (X()) {
            return 2;
        }
        boolean Z = Z();
        boolean zY = Y();
        if (zY && Z) {
            Context context = e3.f21882e;
            return context != null && g(context, "com.onesignal.preferHMS") ? 13 : 1;
        }
        if (zY) {
            return 1;
        }
        if (Z) {
            return 13;
        }
        return (!D() && F()) ? 13 : 1;
    }

    Integer i() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) e3.f21882e.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        return (type == 1 || type == 9) ? 0 : 1;
    }
}
