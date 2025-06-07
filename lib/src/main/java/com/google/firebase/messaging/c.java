package com.google.firebase.messaging;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.l;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f21457a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final l.e f21458a;

        /* renamed from: b, reason: collision with root package name */
        public final String f21459b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21460c;

        a(l.e eVar, String str, int i10) {
            this.f21458a = eVar;
            this.f21459b = str;
            this.f21460c = i10;
        }
    }

    private static PendingIntent a(Context context, i0 i0Var, String str, PackageManager packageManager) {
        Intent intentG = g(str, i0Var, packageManager);
        if (intentG == null) {
            return null;
        }
        intentG.addFlags(67108864);
        intentG.putExtras(i0Var.y());
        if (r(i0Var)) {
            intentG.putExtra("gcm.n.analytics_data", i0Var.x());
        }
        return PendingIntent.getActivity(context, h(), intentG, m(1073741824));
    }

    private static PendingIntent b(Context context, Context context2, i0 i0Var) {
        if (r(i0Var)) {
            return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(i0Var.x()));
        }
        return null;
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, h(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m(1073741824));
    }

    public static a d(Context context, Context context2, i0 i0Var, String str, Bundle bundle) {
        return e(context, context2, i0Var, str, bundle, context2.getPackageName(), context2.getResources(), context2.getPackageManager());
    }

    public static a e(Context context, Context context2, i0 i0Var, String str, Bundle bundle, String str2, Resources resources, PackageManager packageManager) throws JSONException {
        l.e eVar = new l.e(context2, str);
        String strN = i0Var.n(resources, str2, "gcm.n.title");
        if (!TextUtils.isEmpty(strN)) {
            eVar.p(strN);
        }
        String strN2 = i0Var.n(resources, str2, "gcm.n.body");
        if (!TextUtils.isEmpty(strN2)) {
            eVar.o(strN2);
            eVar.H(new l.c().h(strN2));
        }
        eVar.F(n(packageManager, resources, str2, i0Var.p("gcm.n.icon"), bundle));
        Uri uriO = o(str2, i0Var, resources);
        if (uriO != null) {
            eVar.G(uriO);
        }
        eVar.n(a(context, i0Var, str2, packageManager));
        PendingIntent pendingIntentB = b(context, context2, i0Var);
        if (pendingIntentB != null) {
            eVar.r(pendingIntentB);
        }
        Integer numI = i(context2, i0Var.p("gcm.n.color"), bundle);
        if (numI != null) {
            eVar.k(numI.intValue());
        }
        eVar.h(!i0Var.a("gcm.n.sticky"));
        eVar.z(i0Var.a("gcm.n.local_only"));
        String strP = i0Var.p("gcm.n.ticker");
        if (strP != null) {
            eVar.I(strP);
        }
        Integer numM = i0Var.m();
        if (numM != null) {
            eVar.D(numM.intValue());
        }
        Integer numR = i0Var.r();
        if (numR != null) {
            eVar.K(numR.intValue());
        }
        Integer numL = i0Var.l();
        if (numL != null) {
            eVar.A(numL.intValue());
        }
        Long lJ = i0Var.j("gcm.n.event_time");
        if (lJ != null) {
            eVar.E(true);
            eVar.L(lJ.longValue());
        }
        long[] jArrQ = i0Var.q();
        if (jArrQ != null) {
            eVar.J(jArrQ);
        }
        int[] iArrE = i0Var.e();
        if (iArrE != null) {
            eVar.y(iArrE[0], iArrE[1], iArrE[2]);
        }
        eVar.q(j(i0Var));
        return new a(eVar, p(i0Var), 0);
    }

    static a f(Context context, i0 i0Var) throws PackageManager.NameNotFoundException {
        Bundle bundleK = k(context.getPackageManager(), context.getPackageName());
        return d(context, context, i0Var, l(context, i0Var.k(), bundleK), bundleK);
    }

    private static Intent g(String str, i0 i0Var, PackageManager packageManager) {
        String strP = i0Var.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(strP)) {
            Intent intent = new Intent(strP);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri uriF = i0Var.f();
        if (uriF != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(uriF);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int h() {
        return f21457a.incrementAndGet();
    }

    private static Integer i(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(androidx.core.content.a.c(context, i10));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int j(i0 i0Var) {
        boolean zA = i0Var.a("gcm.n.default_sound");
        ?? r02 = zA;
        if (i0Var.a("gcm.n.default_vibrate_timings")) {
            r02 = (zA ? 1 : 0) | 2;
        }
        return i0Var.a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    private static Bundle k(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e5) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e5);
        }
        return Bundle.EMPTY;
    }

    public static String l(Context context, String str, Bundle bundle) {
        String str2;
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
            } else {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
            }
            Log.w("FirebaseMessaging", str2);
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int m(int i10) {
        return i10 | 67108864;
    }

    private static int n(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && q(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && q(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !q(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e5) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e5);
            }
        }
        return (i10 == 0 || !q(resources, i10)) ? R.drawable.sym_def_app_icon : i10;
    }

    private static Uri o(String str, i0 i0Var, Resources resources) {
        String strO = i0Var.o();
        if (TextUtils.isEmpty(strO)) {
            return null;
        }
        if ("default".equals(strO) || resources.getIdentifier(strO, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + strO);
    }

    private static String p(i0 i0Var) {
        String strP = i0Var.p("gcm.n.tag");
        if (!TextUtils.isEmpty(strP)) {
            return strP;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    private static boolean q(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean r(i0 i0Var) {
        return i0Var.a("google.c.a.e");
    }
}
