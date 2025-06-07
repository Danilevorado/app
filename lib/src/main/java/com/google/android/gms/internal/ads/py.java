package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class py {
    public static final Intent a(Uri uri, Context context, bg bgVar, View view) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static final Intent b(Intent intent, ResolveInfo resolveInfo, Context context, bg bgVar, View view) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static final ResolveInfo c(Intent intent, Context context, bg bgVar, View view) {
        return d(intent, new ArrayList(), context, bgVar, view);
    }

    public static final ResolveInfo d(Intent intent, ArrayList arrayList, Context context, bg bgVar, View view) {
        PackageManager packageManager;
        ResolveInfo resolveInfo = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable th) {
            j3.t.q().u(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        if (packageManager == null) {
            return null;
        }
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= listQueryIntentActivities.size()) {
                    break;
                }
                if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                    resolveInfo = resolveInfoResolveActivity;
                    break;
                }
                i10++;
            }
        }
        arrayList.addAll(listQueryIntentActivities);
        return resolveInfo;
    }
}
