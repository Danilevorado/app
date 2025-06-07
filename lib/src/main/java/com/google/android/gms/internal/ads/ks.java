package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class ks {

    /* renamed from: a, reason: collision with root package name */
    private n.f f11200a;

    /* renamed from: b, reason: collision with root package name */
    private n.c f11201b;

    /* renamed from: c, reason: collision with root package name */
    private n.e f11202c;

    /* renamed from: d, reason: collision with root package name */
    private is f11203d;

    public static boolean g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
            for (int i10 = 0; i10 < listQueryIntentActivities.size(); i10++) {
                if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                    return resolveInfoResolveActivity.activityInfo.packageName.equals(r44.a(context));
                }
            }
        }
        return false;
    }

    public final n.f a() {
        n.c cVar = this.f11201b;
        if (cVar == null) {
            this.f11200a = null;
        } else if (this.f11200a == null) {
            this.f11200a = cVar.c(null);
        }
        return this.f11200a;
    }

    public final void b(Activity activity) {
        String strA;
        if (this.f11201b == null && (strA = r44.a(activity)) != null) {
            s44 s44Var = new s44(this);
            this.f11202c = s44Var;
            n.c.a(activity, strA, s44Var);
        }
    }

    public final void c(n.c cVar) {
        this.f11201b = cVar;
        cVar.e(0L);
        is isVar = this.f11203d;
        if (isVar != null) {
            isVar.a();
        }
    }

    public final void d() {
        this.f11201b = null;
        this.f11200a = null;
    }

    public final void e(is isVar) {
        this.f11203d = isVar;
    }

    public final void f(Activity activity) {
        n.e eVar = this.f11202c;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.f11201b = null;
        this.f11200a = null;
        this.f11202c = null;
    }
}
