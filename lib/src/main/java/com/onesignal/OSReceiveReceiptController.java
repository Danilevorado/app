package com.onesignal;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import b1.b;
import b1.l;
import com.onesignal.e3;
import com.onesignal.p3;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* loaded from: classes.dex */
class OSReceiveReceiptController {

    /* renamed from: d, reason: collision with root package name */
    private static OSReceiveReceiptController f21646d;

    /* renamed from: a, reason: collision with root package name */
    private int f21647a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f21648b = 25;

    /* renamed from: c, reason: collision with root package name */
    private final j2 f21649c = e3.p0();

    public static class ReceiveReceiptWorker extends Worker {

        class a extends p3.g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f21650a;

            a(String str) {
                this.f21650a = str;
            }

            @Override // com.onesignal.p3.g
            void a(int i10, String str, Throwable th) {
                e3.a(e3.z.ERROR, "Receive receipt failed with statusCode: " + i10 + " response: " + str);
            }

            @Override // com.onesignal.p3.g
            void b(String str) {
                e3.a(e3.z.DEBUG, "Receive receipt sent for notificationID: " + this.f21650a);
            }
        }

        public ReceiveReceiptWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        void a(String str) throws JSONException, InterruptedException {
            String str2 = e3.f21886g;
            String strT0 = (str2 == null || str2.isEmpty()) ? e3.t0() : e3.f21886g;
            String strE0 = e3.E0();
            Integer numValueOf = null;
            i2 i2Var = new i2();
            try {
                numValueOf = Integer.valueOf(new OSUtils().e());
            } catch (NullPointerException e5) {
                e5.printStackTrace();
            }
            Integer num = numValueOf;
            e3.a(e3.z.DEBUG, "ReceiveReceiptWorker: Device Type is: " + num);
            i2Var.a(strT0, strE0, num, str, new a(str));
        }

        @Override // androidx.work.Worker
        public c.a doWork() throws JSONException, InterruptedException {
            a(getInputData().l("os_notification_id"));
            return c.a.c();
        }
    }

    private OSReceiveReceiptController() {
    }

    public static synchronized OSReceiveReceiptController c() {
        if (f21646d == null) {
            f21646d = new OSReceiveReceiptController();
        }
        return f21646d;
    }

    void a(Context context, String str) {
        if (!this.f21649c.j()) {
            e3.a(e3.z.DEBUG, "sendReceiveReceipt disabled");
            return;
        }
        int iJ = OSUtils.j(this.f21647a, this.f21648b);
        b1.l lVar = (b1.l) ((l.a) ((l.a) ((l.a) new l.a(ReceiveReceiptWorker.class).j(b())).l(iJ, TimeUnit.SECONDS)).m(new b.a().h("os_notification_id", str).a())).b();
        e3.a(e3.z.DEBUG, "OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + str + " and delay: " + iJ + " seconds");
        b1.u uVarA = d3.a(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_receive_receipt");
        uVarA.d(sb2.toString(), b1.d.KEEP, lVar);
    }

    b1.b b() {
        return new b.a().b(b1.k.CONNECTED).a();
    }
}
