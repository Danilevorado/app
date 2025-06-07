package com.onesignal.shortcutbadger.impl;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import l7.a;
import l7.b;

@Deprecated
/* loaded from: classes.dex */
public class XiaomiHomeBadger implements a {

    /* renamed from: a, reason: collision with root package name */
    private ResolveInfo f22422a;

    private void c(Context context, int i10) throws IllegalAccessException, IllegalArgumentException, b, InvocationTargetException {
        if (this.f22422a == null) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            this.f22422a = context.getPackageManager().resolveActivity(intent, 65536);
        }
        if (this.f22422a != null) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            Notification notificationBuild = new Notification.Builder(context).setContentTitle("").setContentText("").setSmallIcon(this.f22422a.getIconResource()).build();
            try {
                Object obj = notificationBuild.getClass().getDeclaredField("extraNotification").get(notificationBuild);
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i10));
                notificationManager.notify(0, notificationBuild);
            } catch (Exception e5) {
                throw new b("not able to set badge", e5);
            }
        }
    }

    @Override // l7.a
    public List a() {
        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher");
    }

    @Override // l7.a
    public void b(Context context, ComponentName componentName, int i10) throws IllegalAccessException, NoSuchFieldException, InstantiationException, IllegalArgumentException, b, InvocationTargetException {
        Object objValueOf;
        try {
            Object objNewInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = objNewInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            if (i10 == 0) {
                objValueOf = "";
            } else {
                try {
                    objValueOf = Integer.valueOf(i10);
                } catch (Exception unused) {
                    declaredField.set(objNewInstance, Integer.valueOf(i10));
                }
            }
            declaredField.set(objNewInstance, String.valueOf(objValueOf));
        } catch (Exception unused2) {
            Intent intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            intent.putExtra("android.intent.extra.update_application_component_name", componentName.getPackageName() + "/" + componentName.getClassName());
            intent.putExtra("android.intent.extra.update_application_message_text", String.valueOf(i10 != 0 ? Integer.valueOf(i10) : ""));
            if (m7.a.a(context, intent)) {
                context.sendBroadcast(intent);
            }
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            c(context, i10);
        }
    }
}
