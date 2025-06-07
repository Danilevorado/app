package com.onesignal;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;
import com.onesignal.e3;
import com.onesignal.u3;

/* loaded from: classes.dex */
class y3 implements u3 {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f22531a;

    /* renamed from: b, reason: collision with root package name */
    private static u3.a f22532b;

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Context f22533m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ u3.a f22534n;

        a(Context context, u3.a aVar) {
            this.f22533m = context;
            this.f22534n = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                y3.this.d(this.f22533m, this.f22534n);
            } catch (ApiException e5) {
                e3.b(e3.z.ERROR, "HMS ApiException getting Huawei push token!", e5);
                this.f22534n.a(null, e5.getStatusCode() == 907135000 ? -26 : -27);
            }
        }
    }

    y3() {
    }

    private static void c() throws InterruptedException {
        try {
            Thread.sleep(30000L);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d(Context context, u3.a aVar) {
        if (!OSUtils.p()) {
            aVar.a(null, -28);
            return;
        }
        String token = HmsInstanceId.getInstance(context).getToken(AGConnectServicesConfig.fromContext(context).getString("client/app_id"), "HCM");
        if (TextUtils.isEmpty(token)) {
            e(aVar);
        } else {
            e3.a(e3.z.INFO, "Device registered for HMS, push token = " + token);
            aVar.a(token, 1);
        }
    }

    private void e(u3.a aVar) throws InterruptedException {
        c();
        if (f22531a) {
            return;
        }
        e3.a(e3.z.ERROR, "HmsMessageServiceOneSignal.onNewToken timed out.");
        aVar.a(null, -25);
    }

    @Override // com.onesignal.u3
    public void a(Context context, String str, u3.a aVar) {
        f22532b = aVar;
        new Thread(new a(context, aVar), "OS_HMS_GET_TOKEN").start();
    }
}
