package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import x4.s;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f21345a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b, reason: collision with root package name */
    private static final List f21346b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c, reason: collision with root package name */
    private static final List f21347c = Arrays.asList("auto", "app", "am");

    /* renamed from: d, reason: collision with root package name */
    private static final List f21348d = Arrays.asList("_r", "_dbg");

    /* renamed from: e, reason: collision with root package name */
    private static final List f21349e = Arrays.asList((String[]) i4.b.a(s.f28274a, s.f28275b));

    /* renamed from: f, reason: collision with root package name */
    private static final List f21350f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static void a(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r5 = r0.equals(r5)
            r0 = 1
            if (r5 != 0) goto La
            return r0
        La:
            boolean r5 = d(r4)
            r1 = 0
            if (r5 != 0) goto L12
            return r1
        L12:
            if (r6 != 0) goto L15
            return r1
        L15:
            java.util.List r5 = com.google.firebase.analytics.connector.internal.b.f21348d
            java.util.Iterator r5 = r5.iterator()
        L1b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto L1b
            return r1
        L2e:
            int r5 = r4.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r5 == r2) goto L57
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r5 == r2) goto L4d
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r5 == r2) goto L43
            goto L61
        L43:
            java.lang.String r5 = "fiam"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L61
            r4 = r3
            goto L62
        L4d:
            java.lang.String r5 = "fdl"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L61
            r4 = r0
            goto L62
        L57:
            java.lang.String r5 = "fcm"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L61
            r4 = r1
            goto L62
        L61:
            r4 = -1
        L62:
            java.lang.String r5 = "_cis"
            if (r4 == 0) goto L74
            if (r4 == r0) goto L71
            if (r4 == r3) goto L6b
            return r1
        L6b:
            java.lang.String r4 = "fiam_integration"
        L6d:
            r6.putString(r5, r4)
            return r0
        L71:
            java.lang.String r4 = "fdl_integration"
            goto L6d
        L74:
            java.lang.String r4 = "fcm_integration"
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.analytics.connector.internal.b.b(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }

    public static boolean c(String str, Bundle bundle) {
        if (f21346b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        Iterator it = f21348d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(String str) {
        return !f21347c.contains(str);
    }

    public static boolean e(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f21349e.contains(str2)) {
            return false;
        }
        Iterator it = f21350f.iterator();
        while (it.hasNext()) {
            if (str2.matches((String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
