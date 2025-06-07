package com.onesignal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.onesignal.e3;

/* loaded from: classes.dex */
abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static int f22091a = -1;

    private static boolean a(Context context) {
        int i10 = f22091a;
        if (i10 != -1) {
            return i10 == 1;
        }
        ApplicationInfo applicationInfoA = i.f22060a.a(context);
        if (applicationInfoA == null) {
            f22091a = 0;
            e3.a(e3.z.ERROR, "Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.");
            return false;
        }
        Bundle bundle = applicationInfoA.metaData;
        if (bundle != null) {
            f22091a = !"DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 1 : 0;
        } else {
            f22091a = 1;
        }
        return f22091a == 1;
    }

    private static boolean b(Context context) {
        return a(context) && OSUtils.a(context);
    }

    static void c(k3 k3Var, Context context) {
        if (b(context)) {
            e(context);
        }
    }

    static void d(int i10, Context context) {
        if (a(context)) {
            try {
                l7.c.a(context, i10);
            } catch (l7.b unused) {
            }
        }
    }

    private static void e(Context context) {
        int i10 = 0;
        for (StatusBarNotification statusBarNotification : m3.d(context)) {
            if (!l0.f(statusBarNotification)) {
                i10++;
            }
        }
        d(i10, context);
    }
}
