package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import l7.a;

/* loaded from: classes.dex */
public class ZukHomeBadger implements a {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f22423a = Uri.parse("content://com.android.badge/badge");

    @Override // l7.a
    public List a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // l7.a
    public void b(Context context, ComponentName componentName, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(this.f22423a, "setAppBadgeCount", (String) null, bundle);
    }
}
