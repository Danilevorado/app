package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import l7.a;

/* loaded from: classes.dex */
public class VivoHomeBadger implements a {
    @Override // l7.a
    public List a() {
        return Arrays.asList("com.vivo.launcher");
    }

    @Override // l7.a
    public void b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i10);
        context.sendBroadcast(intent);
    }
}
