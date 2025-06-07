package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import l7.a;

/* loaded from: classes.dex */
public class OPPOHomeBader implements a {

    /* renamed from: a, reason: collision with root package name */
    private int f22416a = -1;

    private void c(Context context, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
    }

    @Override // l7.a
    public List a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // l7.a
    public void b(Context context, ComponentName componentName, int i10) {
        if (this.f22416a == i10) {
            return;
        }
        this.f22416a = i10;
        c(context, i10);
    }
}
