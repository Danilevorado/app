package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import l7.a;
import l7.b;

/* loaded from: classes.dex */
public class DefaultBadger implements a {
    @Override // l7.a
    public List a() {
        return new ArrayList(0);
    }

    @Override // l7.a
    public void b(Context context, ComponentName componentName, int i10) throws b {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i10);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        if (m7.a.a(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        throw new b("unable to resolve intent: " + intent.toString());
    }

    boolean c(Context context) {
        return m7.a.a(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE"));
    }
}
