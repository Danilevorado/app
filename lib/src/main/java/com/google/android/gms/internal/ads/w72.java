package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class w72 implements je2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17013a;

    /* renamed from: b, reason: collision with root package name */
    public final k3.h4 f17014b;

    /* renamed from: c, reason: collision with root package name */
    public final List f17015c;

    public w72(Context context, k3.h4 h4Var, List list) {
        this.f17013a = context;
        this.f17014b = h4Var;
        this.f17015c = list;
    }

    @Override // com.google.android.gms.internal.ads.je2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        Bundle bundle = (Bundle) obj;
        if (((Boolean) it.f10173a.e()).booleanValue()) {
            Bundle bundle2 = new Bundle();
            j3.t.r();
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f17013a.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && (componentName = runningTaskInfo.topActivity) != null) {
                    className = componentName.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle2.putString("activity", className);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("width", this.f17014b.f24655q);
            bundle3.putInt("height", this.f17014b.f24652n);
            bundle2.putBundle("size", bundle3);
            if (!this.f17015c.isEmpty()) {
                List list = this.f17015c;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
