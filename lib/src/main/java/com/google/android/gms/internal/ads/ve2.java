package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class ve2 implements ke2 {

    /* renamed from: a, reason: collision with root package name */
    private final bb3 f16671a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f16672b;

    public ve2(bb3 bb3Var, Context context) {
        this.f16671a = bb3Var;
        this.f16672b = context;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final int a() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.ke2
    public final ab3 b() {
        return this.f16671a.g(new Callable() { // from class: com.google.android.gms.internal.ads.ue2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f16305a.c();
            }
        });
    }

    final /* synthetic */ te2 c() {
        boolean zIsActiveNetworkMetered;
        int i10;
        TelephonyManager telephonyManager = (TelephonyManager) this.f16672b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        j3.t.r();
        int i11 = -1;
        if (m3.b2.S(this.f16672b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f16672b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                i10 = type;
                i11 = iOrdinal;
            } else {
                i10 = -1;
            }
            zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        } else {
            zIsActiveNetworkMetered = false;
            i10 = -2;
        }
        return new te2(networkOperator, i10, j3.t.s().k(this.f16672b), phoneType, zIsActiveNetworkMetered, i11);
    }
}
