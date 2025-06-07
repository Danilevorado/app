package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.onesignal.e3;
import com.onesignal.j0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ADMMessageHandler extends ADMMessageHandlerBase {
    private static final int JOB_ID = 123891;

    class a implements j0.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f21616a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f21617b;

        a(Bundle bundle, Context context) {
            this.f21616a = bundle;
            this.f21617b = context;
        }

        @Override // com.onesignal.j0.e
        public void a(j0.f fVar) throws JSONException {
            if (fVar.c()) {
                return;
            }
            JSONObject jSONObjectA = j0.a(this.f21616a);
            s1 s1Var = new s1(jSONObjectA);
            x1 x1Var = new x1(this.f21617b);
            x1Var.q(jSONObjectA);
            x1Var.o(this.f21617b);
            x1Var.r(s1Var);
            j0.m(x1Var, true);
        }
    }

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    protected void onMessage(Intent intent) throws JSONException {
        Context applicationContext = getApplicationContext();
        Bundle extras = intent.getExtras();
        j0.h(applicationContext, extras, new a(extras, applicationContext));
    }

    protected void onRegistered(String str) {
        e3.a(e3.z.INFO, "ADM registration ID: " + str);
        v3.c(str);
    }

    protected void onRegistrationError(String str) {
        e3.z zVar = e3.z.ERROR;
        e3.a(zVar, "ADM:onRegistrationError: " + str);
        if ("INVALID_SENDER".equals(str)) {
            e3.a(zVar, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        v3.c(null);
    }

    protected void onUnregistered(String str) {
        e3.a(e3.z.INFO, "ADM:onUnregistered: " + str);
    }
}
