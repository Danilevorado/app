package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* loaded from: classes.dex */
public final class fg {

    /* renamed from: a, reason: collision with root package name */
    private NetworkCapabilities f8273a;

    fg(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new eg(this));
        } catch (RuntimeException unused) {
            synchronized (fg.class) {
                this.f8273a = null;
            }
        }
    }

    public static fg c(Context context) {
        if (context != null) {
            return new fg((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long a() {
        synchronized (fg.class) {
            NetworkCapabilities networkCapabilities = this.f8273a;
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(4)) {
                    return 2L;
                }
                if (this.f8273a.hasTransport(1)) {
                    return 1L;
                }
                if (this.f8273a.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }

    public final NetworkCapabilities b() {
        return this.f8273a;
    }
}
