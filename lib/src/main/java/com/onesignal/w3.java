package com.onesignal;

import android.content.Context;
import com.onesignal.e3;
import com.onesignal.u3;
import java.io.IOException;

/* loaded from: classes.dex */
abstract class w3 implements u3 {

    /* renamed from: d, reason: collision with root package name */
    private static int f22493d = 5;

    /* renamed from: e, reason: collision with root package name */
    private static int f22494e = 10000;

    /* renamed from: a, reason: collision with root package name */
    private u3.a f22495a;

    /* renamed from: b, reason: collision with root package name */
    private Thread f22496b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22497c;

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f22498m;

        a(String str) {
            this.f22498m = str;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            int i10 = 0;
            while (i10 < w3.f22493d && !w3.this.e(this.f22498m, i10)) {
                i10++;
                OSUtils.V(w3.f22494e * i10);
            }
        }
    }

    w3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str, int i10) {
        try {
            String strG = g(str);
            e3.a(e3.z.INFO, "Device registered, push token = " + strG);
            this.f22495a.a(strG, 1);
            return true;
        } catch (IOException e5) {
            int iJ = j(e5);
            String strL = OSUtils.l(e5);
            if (!("SERVICE_NOT_AVAILABLE".equals(strL) || "AUTHENTICATION_FAILED".equals(strL))) {
                Exception exc = new Exception(e5);
                e3.b(e3.z.ERROR, "Error Getting " + f() + " Token", exc);
                if (!this.f22497c) {
                    this.f22495a.a(null, iJ);
                }
                return true;
            }
            Exception exc2 = new Exception(e5);
            if (i10 >= f22493d - 1) {
                e3.b(e3.z.ERROR, "Retry count of " + f22493d + " exceed! Could not get a " + f() + " Token.", exc2);
            } else {
                e3.b(e3.z.INFO, "'Google Play services' returned " + strL + " error. Current retry count: " + i10, exc2);
                if (i10 == 2) {
                    this.f22495a.a(null, iJ);
                    this.f22497c = true;
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Exception exc3 = new Exception(th);
            int iJ2 = j(th);
            e3.b(e3.z.ERROR, "Unknown error getting " + f() + " Token", exc3);
            this.f22495a.a(null, iJ2);
            return true;
        }
    }

    private void h(String str) {
        try {
            if (OSUtils.D()) {
                k(str);
            } else {
                z.d();
                e3.a(e3.z.ERROR, "'Google Play services' app not installed or disabled on the device.");
                this.f22495a.a(null, -7);
            }
        } catch (Throwable th) {
            e3.b(e3.z.ERROR, "Could not register with " + f() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
            this.f22495a.a(null, -8);
        }
    }

    private boolean i(String str, u3.a aVar) {
        boolean z10;
        try {
            Float.parseFloat(str);
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        e3.a(e3.z.ERROR, "Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.");
        aVar.a(null, -6);
        return false;
    }

    private static int j(Throwable th) {
        String strL = OSUtils.l(th);
        if (!(th instanceof IOException)) {
            return -12;
        }
        if ("SERVICE_NOT_AVAILABLE".equals(strL)) {
            return -9;
        }
        return "AUTHENTICATION_FAILED".equals(strL) ? -29 : -11;
    }

    private synchronized void k(String str) {
        Thread thread = this.f22496b;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new a(str));
            this.f22496b = thread2;
            thread2.start();
        }
    }

    @Override // com.onesignal.u3
    public void a(Context context, String str, u3.a aVar) {
        this.f22495a = aVar;
        if (i(str, aVar)) {
            h(str);
        }
    }

    abstract String f();

    abstract String g(String str);
}
