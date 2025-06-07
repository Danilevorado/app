package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class nh {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f12620e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    private long f12621a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f12622b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f12623c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12624d = false;

    nh(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new mh(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static nh d(Context context, Executor executor) {
        return new nh(context, executor, f12620e);
    }

    public final long b() {
        long j10 = this.f12623c;
        this.f12623c = -1L;
        return j10;
    }

    public final long c() {
        if (this.f12624d) {
            return this.f12622b - this.f12621a;
        }
        return -1L;
    }

    public final void h() {
        if (this.f12624d) {
            this.f12622b = System.currentTimeMillis();
        }
    }
}
