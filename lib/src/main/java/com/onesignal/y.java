package com.onesignal;

import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    private final GoogleApiClient f22522a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f22523b;

    y(GoogleApiClient googleApiClient) {
        this.f22522a = googleApiClient;
        this.f22523b = googleApiClient.getClass();
    }

    void a() {
        try {
            this.f22523b.getMethod("connect", new Class[0]).invoke(this.f22522a, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    void b() {
        try {
            this.f22523b.getMethod("disconnect", new Class[0]).invoke(this.f22522a, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    GoogleApiClient c() {
        return this.f22522a;
    }
}
