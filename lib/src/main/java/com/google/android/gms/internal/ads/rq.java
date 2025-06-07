package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class rq {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14882a;

    public rq(Context context) {
        e4.p.m(context, "Context can not be null");
        this.f14882a = context;
    }

    public final boolean a(Intent intent) {
        e4.p.m(intent, "Intent can not be null");
        return !this.f14882a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean b() {
        return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean c() {
        return ((Boolean) m3.e1.a(this.f14882a, new Callable() { // from class: com.google.android.gms.internal.ads.qq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            }
        })).booleanValue() && k4.c.a(this.f14882a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
