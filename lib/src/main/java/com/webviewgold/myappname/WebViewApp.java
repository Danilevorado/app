package com.webviewgold.myappname;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.onesignal.b2;
import com.onesignal.e3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class WebViewApp extends o0.b {

    /* renamed from: m, reason: collision with root package name */
    static Context f22720m;

    class a implements e3.d0 {
        a() {
        }

        @Override // com.onesignal.e3.d0
        public void a(b2 b2Var) throws JSONException {
            String strOptString;
            JSONObject jSONObjectD = b2Var.e().d();
            String string = null;
            if (jSONObjectD != null && (strOptString = jSONObjectD.optString("trigger", null)) != null) {
                e3.A("trigger", strOptString);
            }
            String strG = b2Var.e().g();
            if (jSONObjectD != null && jSONObjectD.has("url")) {
                try {
                    string = jSONObjectD.getString("url");
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
            }
            Intent intent = new Intent(WebViewApp.f22720m, (Class<?>) MainActivity.class);
            intent.setFlags(268566528);
            intent.putExtra("openURL", strG);
            intent.putExtra("ONESIGNAL_URL", string);
            if (d.f22733a.booleanValue()) {
                Log.d("OneSignalExample", "openURL = " + strG);
            }
            WebViewApp.this.startActivity(intent);
        }
    }

    private class b implements Application.ActivityLifecycleCallbacks {
        private b() {
        }

        /* synthetic */ b(WebViewApp webViewApp, a aVar) {
            this();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (e.f22742i) {
                activity.getWindow().setFlags(8192, 8192);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    private void a() {
    }

    private void b() {
    }

    private void c() {
        e3.K1(e3.z.VERBOSE, e3.z.NONE);
        e3.Q0(this);
        e3.G1("4bdecf5c-de10-4162-b274-09a381f6f646");
        e3.L1(new a());
    }

    private void d() {
    }

    private void e() {
        registerActivityLifecycleCallbacks(new b(this, null));
        androidx.lifecycle.v.j().s().a(new androidx.lifecycle.d() { // from class: com.webviewgold.myappname.WebViewApp.2
            @Override // androidx.lifecycle.f
            public /* synthetic */ void a(androidx.lifecycle.n nVar) {
                androidx.lifecycle.c.d(this, nVar);
            }

            @Override // androidx.lifecycle.f
            public /* synthetic */ void b(androidx.lifecycle.n nVar) {
                androidx.lifecycle.c.b(this, nVar);
            }

            @Override // androidx.lifecycle.f
            public /* synthetic */ void c(androidx.lifecycle.n nVar) {
                androidx.lifecycle.c.a(this, nVar);
            }

            @Override // androidx.lifecycle.f
            public /* synthetic */ void e(androidx.lifecycle.n nVar) {
                androidx.lifecycle.c.c(this, nVar);
            }

            @Override // androidx.lifecycle.f
            public void f(androidx.lifecycle.n nVar) {
                androidx.lifecycle.c.e(this, nVar);
            }

            @Override // androidx.lifecycle.f
            public void g(androidx.lifecycle.n nVar) {
                androidx.lifecycle.c.f(this, nVar);
            }
        });
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        f22720m = this;
        e();
        b();
        c();
        a();
        d();
    }
}
