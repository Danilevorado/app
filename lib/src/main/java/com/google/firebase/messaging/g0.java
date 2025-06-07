package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import o6.a;

/* loaded from: classes.dex */
public abstract class g0 {
    public static boolean A(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return B(intent.getExtras());
    }

    public static boolean B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            v5.d.k();
            Context contextJ = v5.d.k().j();
            SharedPreferences sharedPreferences = contextJ.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = contextJ.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextJ.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    static o6.a b(a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        a.C0170a c0170aH = o6.a.p().m(p(extras)).e(bVar).f(f(extras)).i(m()).k(a.d.ANDROID).h(k(extras));
        String strH = h(extras);
        if (strH != null) {
            c0170aH.g(strH);
        }
        String strO = o(extras);
        if (strO != null) {
            c0170aH.l(strO);
        }
        String strC = c(extras);
        if (strC != null) {
            c0170aH.c(strC);
        }
        String strI = i(extras);
        if (strI != null) {
            c0170aH.b(strI);
        }
        String strE = e(extras);
        if (strE != null) {
            c0170aH.d(strE);
        }
        long jN = n(extras);
        if (jN > 0) {
            c0170aH.j(jN);
        }
        return c0170aH.a();
    }

    static String c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    static String d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    static String e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    static String f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) b5.l.a(com.google.firebase.installations.c.o(v5.d.k()).getId());
        } catch (InterruptedException | ExecutionException e5) {
            throw new RuntimeException(e5);
        }
    }

    static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    static String h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    static String j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    static a.c k(Bundle bundle) {
        return (bundle == null || !i0.t(bundle)) ? a.c.DATA_MESSAGE : a.c.DISPLAY_NOTIFICATION;
    }

    static String l(Bundle bundle) {
        return (bundle == null || !i0.t(bundle)) ? "data" : "display";
    }

    static String m() {
        return v5.d.k().j().getPackageName();
    }

    static long n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e5) {
                Log.w("FirebaseMessaging", "error parsing project number", e5);
            }
        }
        v5.d dVarK = v5.d.k();
        String strC = dVarK.m().c();
        if (strC != null) {
            try {
                return Long.parseLong(strC);
            } catch (NumberFormatException e10) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e10);
            }
        }
        String strB = dVarK.m().b();
        try {
            if (!strB.startsWith("1:")) {
                return Long.parseLong(strB);
            }
            String[] strArrSplit = strB.split(":");
            if (strArrSplit.length < 2) {
                return 0L;
            }
            String str = strArrSplit[1];
            if (str.isEmpty()) {
                return 0L;
            }
            return Long.parseLong(str);
        } catch (NumberFormatException e11) {
            Log.w("FirebaseMessaging", "error parsing app ID", e11);
            return 0L;
        }
    }

    static String o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    static int p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    static String q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    private static boolean r(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static void s(Intent intent) {
        x("_nd", intent.getExtras());
    }

    public static void t(Intent intent) {
        x("_nf", intent.getExtras());
    }

    public static void u(Bundle bundle) {
        y(bundle);
        x("_no", bundle);
    }

    public static void v(Intent intent) {
        if (A(intent)) {
            x("_nr", intent.getExtras());
        }
        if (z(intent)) {
            w(a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.t());
        }
    }

    private static void w(a.b bVar, Intent intent, p2.g gVar) {
        if (gVar == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        o6.a aVarB = b(bVar, intent);
        if (aVarB == null) {
            return;
        }
        try {
            gVar.a("FCM_CLIENT_EVENT_LOGGING", o6.b.class, p2.b.b("proto"), new p2.e() { // from class: com.google.firebase.messaging.f0
                @Override // p2.e
                public final Object a(Object obj) {
                    return ((o6.b) obj).c();
                }
            }).a(p2.c.d(o6.b.b().b(aVarB).a()));
        } catch (RuntimeException e5) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e5);
        }
    }

    static void x(String str, Bundle bundle) {
        try {
            v5.d.k();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String strD = d(bundle);
            if (strD != null) {
                bundle2.putString("_nmid", strD);
            }
            String strE = e(bundle);
            if (strE != null) {
                bundle2.putString("_nmn", strE);
            }
            String strI = i(bundle);
            if (!TextUtils.isEmpty(strI)) {
                bundle2.putString("label", strI);
            }
            String strG = g(bundle);
            if (!TextUtils.isEmpty(strG)) {
                bundle2.putString("message_channel", strG);
            }
            String strO = o(bundle);
            if (strO != null) {
                bundle2.putString("_nt", strO);
            }
            String strJ = j(bundle);
            if (strJ != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(strJ));
                } catch (NumberFormatException e5) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e5);
                }
            }
            String strQ = q(bundle);
            if (strQ != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(strQ));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e10);
                }
            }
            String strL = l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", strL);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            w5.a aVar = (w5.a) v5.d.k().i(w5.a.class);
            if (aVar != null) {
                aVar.b("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    private static void y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                return;
            }
            return;
        }
        w5.a aVar = (w5.a) v5.d.k().i(w5.a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (aVar == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String string = bundle.getString("google.c.a.c_id");
        aVar.a("fcm", "_ln", string);
        Bundle bundle2 = new Bundle();
        bundle2.putString("source", "Firebase");
        bundle2.putString("medium", "notification");
        bundle2.putString("campaign", string);
        aVar.b("fcm", "_cmp", bundle2);
    }

    public static boolean z(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return a();
    }
}
