package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.onesignal.e3;
import com.onesignal.j0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {

    public static final class a implements j0.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f21619a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f21620b;

        a(Bundle bundle, Context context) {
            this.f21619a = bundle;
            this.f21620b = context;
        }

        @Override // com.onesignal.j0.e
        public void a(j0.f fVar) throws JSONException {
            if (fVar != null && fVar.c()) {
                return;
            }
            JSONObject jSONObjectA = j0.a(this.f21619a);
            rb.h.d(jSONObjectA, "bundleAsJSONObject(bundle)");
            s1 s1Var = new s1(jSONObjectA);
            x1 x1Var = new x1(this.f21620b);
            Context context = this.f21620b;
            x1Var.q(jSONObjectA);
            x1Var.o(context);
            x1Var.r(s1Var);
            j0.m(x1Var, true);
        }
    }

    protected void onMessage(Context context, Intent intent) throws JSONException {
        Bundle extras = intent == null ? null : intent.getExtras();
        j0.h(context, extras, new a(extras, context));
    }

    protected void onRegistered(Context context, String str) {
        e3.a(e3.z.INFO, rb.h.j("ADM registration ID: ", str));
        v3.c(str);
    }

    protected void onRegistrationError(Context context, String str) {
        e3.z zVar = e3.z.ERROR;
        e3.a(zVar, rb.h.j("ADM:onRegistrationError: ", str));
        if (rb.h.a("INVALID_SENDER", str)) {
            e3.a(zVar, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        v3.c(null);
    }

    protected void onUnregistered(Context context, String str) {
        e3.a(e3.z.INFO, rb.h.j("ADM:onUnregistered: ", str));
    }
}
