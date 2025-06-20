package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import l7.a;

/* loaded from: classes.dex */
public class HuaweiHomeBadger implements a {
    @Override // l7.a
    public List a() {
        return Arrays.asList("com.huawei.android.launcher");
    }

    @Override // l7.a
    public void b(Context context, ComponentName componentName, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString("class", componentName.getClassName());
        bundle.putInt("badgenumber", i10);
        context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
    }
}
