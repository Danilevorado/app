package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public class s0 {

    /* renamed from: e, reason: collision with root package name */
    private static s0 f21568e;

    /* renamed from: a, reason: collision with root package name */
    private String f21569a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f21570b = null;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f21571c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Queue f21572d = new ArrayDeque();

    private s0() {
    }

    private int a(Context context, Intent intent) {
        ComponentName componentNameStartService;
        String strF = f(context, intent);
        if (strF != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + strF);
            }
            intent.setClassName(context.getPackageName(), strF);
        }
        try {
            if (e(context)) {
                componentNameStartService = d1.h(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e5) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e5);
            return 402;
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
            return 401;
        }
    }

    static synchronized s0 b() {
        if (f21568e == null) {
            f21568e = new s0();
        }
        return f21568e;
    }

    private synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2;
        String str3 = this.f21569a;
        if (str3 != null) {
            return str3;
        }
        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(".")) {
                    str2 = context.getPackageName() + serviceInfo.name;
                } else {
                    str2 = serviceInfo.name;
                }
                this.f21569a = str2;
                return this.f21569a;
            }
            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    Intent c() {
        return (Intent) this.f21572d.poll();
    }

    boolean d(Context context) {
        if (this.f21571c == null) {
            this.f21571c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f21570b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f21571c.booleanValue();
    }

    boolean e(Context context) {
        if (this.f21570b == null) {
            this.f21570b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f21570b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f21570b.booleanValue();
    }

    public int g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f21572d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
