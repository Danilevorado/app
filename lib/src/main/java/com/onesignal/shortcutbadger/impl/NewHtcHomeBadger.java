package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import l7.a;
import l7.b;

/* loaded from: classes.dex */
public class NewHtcHomeBadger implements a {
    @Override // l7.a
    public List a() {
        return Arrays.asList("com.htc.launcher");
    }

    @Override // l7.a
    public void b(Context context, ComponentName componentName, int i10) throws b {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i10);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i10);
        if (m7.a.a(context, intent) || m7.a.a(context, intent2)) {
            context.sendBroadcast(intent);
            context.sendBroadcast(intent2);
        } else {
            throw new b("unable to resolve intent: " + intent2.toString());
        }
    }
}
