package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.onesignal.e3;
import com.onesignal.j0;
import org.json.JSONException;

/* loaded from: classes.dex */
public class FCMBroadcastReceiver extends l0.a {

    class a implements j0.e {
        a() {
        }

        @Override // com.onesignal.j0.e
        public void a(j0.f fVar) {
            if (fVar == null) {
                FCMBroadcastReceiver.this.j();
            } else if (fVar.a() || fVar.b()) {
                FCMBroadcastReceiver.this.h();
            } else {
                FCMBroadcastReceiver.this.j();
            }
        }
    }

    class b implements j0.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j0.e f21622a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f21623b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bundle f21624c;

        b(j0.e eVar, Context context, Bundle bundle) {
            this.f21622a = eVar;
            this.f21623b = context;
            this.f21624c = bundle;
        }

        @Override // com.onesignal.j0.e
        public void a(j0.f fVar) {
            if (fVar == null || !fVar.c()) {
                FCMBroadcastReceiver.k(this.f21623b, this.f21624c);
            }
            this.f21622a.a(fVar);
        }
    }

    private static boolean f(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return false;
        }
        String stringExtra = intent.getStringExtra("message_type");
        return stringExtra == null || "gcm".equals(stringExtra);
    }

    private static void g(Context context, Intent intent, Bundle bundle, j0.e eVar) throws JSONException {
        if (!f(intent)) {
            eVar.a(null);
        }
        j0.h(context, bundle, new b(eVar, context, bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (isOrderedBroadcast()) {
            abortBroadcast();
            setResultCode(-1);
        }
    }

    private static l i(Bundle bundle, l lVar) {
        lVar.putString("json_payload", j0.a(bundle).toString());
        lVar.b("timestamp", Long.valueOf(e3.B0().b() / 1000));
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    static void k(Context context, Bundle bundle) {
        e3.z zVar = e3.z.DEBUG;
        e3.a(zVar, "startFCMService from: " + context + " and bundle: " + bundle);
        if (!j0.c(bundle)) {
            e3.a(zVar, "startFCMService with no remote resources, no need for services");
            j0.j(context, i(bundle, n.a()));
            return;
        }
        if ((Integer.parseInt(bundle.getString("pri", "0")) > 9) || Build.VERSION.SDK_INT < 26) {
            try {
                m(context, bundle);
                return;
            } catch (IllegalStateException unused) {
            }
        }
        l(context, bundle);
    }

    private static void l(Context context, Bundle bundle) {
        l lVarI = i(bundle, n.a());
        Intent intent = new Intent(context, (Class<?>) FCMIntentJobService.class);
        intent.putExtra("Bundle:Parcelable:Extras", (Parcelable) lVarI.a());
        FCMIntentJobService.j(context, intent);
    }

    private static void m(Context context, Bundle bundle) {
        l0.a.c(context, new Intent().replaceExtras((Bundle) i(bundle, new m()).a()).setComponent(new ComponentName(context.getPackageName(), FCMIntentService.class.getName())));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws JSONException {
        Bundle extras = intent.getExtras();
        if (extras == null || "google.com/iid".equals(extras.getString("from"))) {
            return;
        }
        e3.Q0(context);
        g(context, intent, extras, new a());
    }
}
