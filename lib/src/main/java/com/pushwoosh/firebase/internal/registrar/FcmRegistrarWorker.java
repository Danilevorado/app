package com.pushwoosh.firebase.internal.registrar;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import k9.g;
import k9.h;
import ka.e;
import l8.a;

/* loaded from: classes2.dex */
public class FcmRegistrarWorker extends Worker {
    public FcmRegistrarWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static void a() {
        try {
            g.j(e.f().t().a());
        } catch (Exception e5) {
            h.m("FcmRegistrarWorker", "Fcm deregistration error", e5);
            g.h(e5.getMessage());
        }
    }

    private static void b(String str) {
        try {
            if (!TextUtils.isEmpty(e.f().t().a())) {
                a.a();
            }
            String strB = a.b();
            if (strB == null) {
                h.s("FcmRegistrarWorker", "FCM token is empty");
                return;
            }
            h.s("FcmRegistrarWorker", "FCM token is " + strB);
            g.i(strB, str);
        } catch (IllegalStateException unused) {
            h.l("FcmRegistrarWorker", "FCM registration error: Failed to retrieve token. Is firebase configured correctly?");
            g.g("");
        } catch (Exception e5) {
            h.l("FcmRegistrarWorker", "FCM registration error:" + e5.getMessage());
        }
    }

    @Override // androidx.work.Worker
    public c.a doWork() {
        boolean zH = getInputData().h("DATA_REGISTER", false);
        boolean zH2 = getInputData().h("DATA_UNREGISTER", false);
        String strL = getInputData().l("DATA_TAGS");
        if (zH) {
            b(strL);
        } else if (zH2) {
            a();
        }
        return c.a.c();
    }
}
