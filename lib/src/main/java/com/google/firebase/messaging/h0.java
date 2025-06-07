package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21490a;

    /* renamed from: b, reason: collision with root package name */
    private String f21491b;

    /* renamed from: c, reason: collision with root package name */
    private String f21492c;

    /* renamed from: d, reason: collision with root package name */
    private int f21493d;

    /* renamed from: e, reason: collision with root package name */
    private int f21494e = 0;

    h0(Context context) {
        this.f21490a = context;
    }

    static String c(v5.d dVar) {
        String strC = dVar.m().c();
        if (strC != null) {
            return strC;
        }
        String strB = dVar.m().b();
        if (!strB.startsWith("1:")) {
            return strB;
        }
        String[] strArrSplit = strB.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private PackageInfo f(String str) {
        try {
            return this.f21490a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e5) {
            Log.w("FirebaseMessaging", "Failed to find package " + e5);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo packageInfoF = f(this.f21490a.getPackageName());
        if (packageInfoF != null) {
            this.f21491b = Integer.toString(packageInfoF.versionCode);
            this.f21492c = packageInfoF.versionName;
        }
    }

    synchronized String a() {
        if (this.f21491b == null) {
            h();
        }
        return this.f21491b;
    }

    synchronized String b() {
        if (this.f21492c == null) {
            h();
        }
        return this.f21492c;
    }

    synchronized int d() {
        PackageInfo packageInfoF;
        if (this.f21493d == 0 && (packageInfoF = f("com.google.android.gms")) != null) {
            this.f21493d = packageInfoF.versionCode;
        }
        return this.f21493d;
    }

    synchronized int e() {
        int i10 = this.f21494e;
        if (i10 != 0) {
            return i10;
        }
        PackageManager packageManager = this.f21490a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!i4.m.i()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f21494e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f21494e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (i4.m.i()) {
            this.f21494e = 2;
        } else {
            this.f21494e = 1;
        }
        return this.f21494e;
    }

    boolean g() {
        return e() != 0;
    }
}
