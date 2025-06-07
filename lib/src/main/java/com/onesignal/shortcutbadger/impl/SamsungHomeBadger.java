package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import l7.a;
import l7.b;

/* loaded from: classes.dex */
public class SamsungHomeBadger implements a {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f22417b = {"_id", "class"};

    /* renamed from: a, reason: collision with root package name */
    private DefaultBadger f22418a = new DefaultBadger();

    private ContentValues c(ComponentName componentName, int i10, boolean z10) {
        ContentValues contentValues = new ContentValues();
        if (z10) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i10));
        return contentValues;
    }

    @Override // l7.a
    public List a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override // l7.a
    public void b(Context context, ComponentName componentName, int i10) throws b {
        DefaultBadger defaultBadger = this.f22418a;
        if (defaultBadger != null && defaultBadger.c(context)) {
            this.f22418a.b(context, componentName, i10);
            return;
        }
        Uri uri = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, f22417b, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursorQuery != null) {
                String className = componentName.getClassName();
                boolean z10 = false;
                while (cursorQuery.moveToNext()) {
                    contentResolver.update(uri, c(componentName, i10, false), "_id=?", new String[]{String.valueOf(cursorQuery.getInt(0))});
                    if (className.equals(cursorQuery.getString(cursorQuery.getColumnIndex("class")))) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    contentResolver.insert(uri, c(componentName, i10, true));
                }
            }
        } finally {
            m7.b.a(cursorQuery);
        }
    }
}
