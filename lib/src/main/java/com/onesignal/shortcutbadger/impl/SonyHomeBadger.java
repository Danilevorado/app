package com.onesignal.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class SonyHomeBadger implements l7.a {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f22419a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* renamed from: b, reason: collision with root package name */
    private AsyncQueryHandler f22420b;

    class a extends AsyncQueryHandler {
        a(ContentResolver contentResolver) {
            super(contentResolver);
        }
    }

    private ContentValues c(int i10, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i10));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        return contentValues;
    }

    private static void d(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i10));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i10 > 0);
        context.sendBroadcast(intent);
    }

    private void e(Context context, ComponentName componentName, int i10) {
        if (i10 < 0) {
            return;
        }
        ContentValues contentValuesC = c(i10, componentName);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            g(context, contentValuesC);
            return;
        }
        if (this.f22420b == null) {
            this.f22420b = new a(context.getApplicationContext().getContentResolver());
        }
        f(contentValuesC);
    }

    private void f(ContentValues contentValues) {
        this.f22420b.startInsert(0, null, this.f22419a, contentValues);
    }

    private void g(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.f22419a, contentValues);
    }

    private static boolean h(Context context) {
        return context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null;
    }

    @Override // l7.a
    public List a() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    @Override // l7.a
    public void b(Context context, ComponentName componentName, int i10) {
        if (h(context)) {
            e(context, componentName, i10);
        } else {
            d(context, componentName, i10);
        }
    }
}
