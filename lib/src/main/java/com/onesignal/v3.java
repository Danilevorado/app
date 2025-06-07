package com.onesignal;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.onesignal.e3;
import com.onesignal.u3;

/* loaded from: classes.dex */
public class v3 implements u3 {

    /* renamed from: a, reason: collision with root package name */
    private static u3.a f22484a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f22485b = false;

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Context f22486m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ u3.a f22487n;

        a(Context context, u3.a aVar) {
            this.f22486m = context;
            this.f22487n = aVar;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            ADM adm = new ADM(this.f22486m);
            String registrationId = adm.getRegistrationId();
            if (registrationId == null) {
                adm.startRegister();
            } else {
                e3.a(e3.z.DEBUG, "ADM Already registered with ID:" + registrationId);
                this.f22487n.a(registrationId, 1);
            }
            try {
                Thread.sleep(30000L);
            } catch (InterruptedException unused) {
            }
            if (v3.f22485b) {
                return;
            }
            e3.a(e3.z.ERROR, "com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.");
            v3.c(null);
        }
    }

    public static void c(String str) {
        u3.a aVar = f22484a;
        if (aVar == null) {
            return;
        }
        f22485b = true;
        aVar.a(str, 1);
    }

    @Override // com.onesignal.u3
    public void a(Context context, String str, u3.a aVar) {
        f22484a = aVar;
        new Thread(new a(context, aVar)).start();
    }
}
