package com.pushwoosh.inapp.view;

import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import com.pushwoosh.inapp.view.e;
import java.lang.ref.WeakReference;
import k9.h;
import n7.i;
import n7.l;

/* loaded from: classes2.dex */
public class RichMediaWebActivity extends c implements e.b {
    private boolean B;

    /* renamed from: r, reason: collision with root package name */
    private boolean f22582r;

    /* renamed from: t, reason: collision with root package name */
    private boolean f22584t;

    /* renamed from: u, reason: collision with root package name */
    private g f22585u;

    /* renamed from: v, reason: collision with root package name */
    private String f22586v;

    /* renamed from: w, reason: collision with root package name */
    private int f22587w;

    /* renamed from: x, reason: collision with root package name */
    private t8.a f22588x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f22589y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f22590z;

    /* renamed from: s, reason: collision with root package name */
    final Handler f22583s = new Handler();
    private boolean A = false;

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            RichMediaWebActivity.super.close();
            RichMediaWebActivity.this.overridePendingTransition(0, 0);
            RichMediaWebActivity.this.f22585u.setVisibility(8);
            RichMediaWebActivity.this.w();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    private static class b extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference f22592a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f22593b;

        /* renamed from: c, reason: collision with root package name */
        private final o8.a f22594c;

        public b(Context context, Uri uri, o8.a aVar) {
            this.f22592a = new WeakReference(context);
            this.f22593b = uri;
            this.f22594c = aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Ringtone doInBackground(Void... voidArr) {
            if (this.f22592a.get() == null) {
                return null;
            }
            try {
                return RingtoneManager.getRingtone((Context) this.f22592a.get(), this.f22593b);
            } catch (Exception e5) {
                h.n("Failed parse ringtone with songUri: " + this.f22593b, e5);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Ringtone ringtone) {
            super.onPostExecute(ringtone);
            this.f22594c.a(o8.b.a(ringtone, null));
        }
    }

    private static Intent m(Context context) {
        return new Intent(context, (Class<?>) RichMediaWebActivity.class);
    }

    public static Intent n(Context context, q9.b bVar) {
        return c.b(m(context), bVar, "", 0);
    }

    public static Intent o(Context context, q9.b bVar, String str) {
        Intent intentB = c.b(m(context), bVar, str, 1);
        intentB.addFlags(343932928);
        return intentB;
    }

    private String p(String str) {
        String strA = ka.e.d().m().a();
        Object[] objArr = new Object[8];
        objArr[0] = i.d().c();
        objArr[1] = "6.7.10";
        objArr[2] = i.d().b();
        objArr[3] = i.d().f();
        objArr[4] = !this.f22598n.t() ? this.f22598n.l().substring(2) : "";
        objArr[5] = Integer.valueOf(j9.b.d().c());
        if (strA == null) {
            strA = "";
        }
        objArr[6] = strA;
        objArr[7] = this.f22598n.t() ? this.f22598n.l() : "";
        return str.replace("<head>", "<head>\n<script type=\"text/javascript\">" + String.format("(function () {if (window.pushwoosh) return;window._pwCallbackHelper = {    __callbacks: {},    __cbCounter: 0,    invokeCallback: function(cbID) {        var args = Array.prototype.slice.call(arguments);        args.shift();        var cb = this.__callbacks[cbID];        this.__callbacks[cbID] = undefined;        return cb.apply(null, args);    },    registerCallback: function(func) {        var cbID = \"__cb\" + (+new Date) + this.__cbCounter;        this.__cbCounter++;        this.__callbacks[cbID] = func;        return cbID;    }};window.pushwoosh = {    _hwid: \"%s\",    _version: \"%s\",    _application: \"%s\",    _user_id: \"%s\",    _richmedia_code: \"%s\",    _device_type: \"%s\",    _message_hash: \"%s\",    _inapp_code: \"%s\",    postEvent: function(event, attributes, successCallback, errorCallback) {        if (!attributes) {            attributes = {};        }        if (!successCallback) {            successCallback = function() {};        }        if (!errorCallback) {            errorCallback = function(error) {};        }        var successCbId = _pwCallbackHelper.registerCallback(successCallback);        var errorCbId = _pwCallbackHelper.registerCallback(errorCallback);        pushwooshImpl.postEvent(event, JSON.stringify(attributes), successCbId, errorCbId);    },    richMediaAction: function(inAppCode, richMediaCode, actionType, actionAttributes, successCallback, errorCallback) {        if (!successCallback) {            successCallback = function() {};        }        if (!errorCallback) {            errorCallback = function(error) {};        }        var successCbId = _pwCallbackHelper.registerCallback(successCallback);        var errorCbId = _pwCallbackHelper.registerCallback(errorCallback);        pushwooshImpl.richMediaAction(inAppCode, richMediaCode, actionType, JSON.stringify(actionAttributes), successCbId, errorCbId);    },    sendTags: function(tags) {        pushwooshImpl.sendTags(JSON.stringify(tags));    },    getTags: function(successCallback, errorCallback) {        if (!errorCallback) {            errorCallback = function(error) {};        }        var successCbId = _pwCallbackHelper.registerCallback(function(tagsString) {            console.log(\"tags: \" + tagsString);            successCallback(JSON.parse(tagsString));        });        var errorCbId = _pwCallbackHelper.registerCallback(errorCallback);        pushwooshImpl.getTags(successCbId, errorCbId);    },    isCommunicationEnabled: function() {        return pushwooshImpl.isCommunicationEnabled();    },    setCommunicationEnabled: function(enabled) {        pushwooshImpl.setCommunicationEnabled(enabled);    },    removeAllDeviceData: function() {        pushwooshImpl.removeAllDeviceData();    },    log: function(str) {        pushwooshImpl.log(str);    },    closeInApp: function() {        pushwooshImpl.closeInApp();    },    getHwid: function() {        return this._hwid;    },    getVersion: function() {        return this._version;    },    getApplication: function() {        return this._application;    },    getUserId: function() {        return this._user_id;    },    getRichmediaCode: function() {        return this._richmedia_code;    },    getDeviceType: function() {        return this._device_type;    },    getMessageHash: function() {        return this._message_hash;    },    getInAppCode: function() {        return this._inapp_code;    },    getCustomData: function() {         var customData = pushwooshImpl.getCustomData();         if (customData) {             return JSON.parse(customData);         } else {             return null;         }    },    registerForPushNotifications: function() {        pushwooshImpl.registerForPushNotifications();    },    openAppSettings: function() {        pushwooshImpl.openAppSettings();    },    getChannels: function(callback) {        var clb = _pwCallbackHelper.registerCallback(function(channels) {             callback(JSON.parse(channels));        });        pushwooshImpl.getChannels(clb);    },    unregisterForPushNotifications: function(callback) {        var clb = _pwCallbackHelper.registerCallback(callback);        pushwooshImpl.unregisterForPushNotifications(clb);    },    isRegisteredForPushNotifications: function(callback) {        var clb = _pwCallbackHelper.registerCallback(function(state) {           if (state == 'true') {callback(true);} else if (state == 'false') {callback(false);}        });        pushwooshImpl.isRegisteredForPushNotifications(clb);    }};}());", objArr) + "</script>");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(o8.b bVar) {
        Ringtone ringtone = (Ringtone) bVar.d();
        if (ringtone != null) {
            ringtone.play();
        }
    }

    public static Intent s(Context context, q9.b bVar) {
        return c.b(m(context), bVar, "", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        this.f22582r = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (this.A) {
            return;
        }
        this.A = true;
        a9.i.e(new f8.b(this.f22598n));
    }

    private void x() {
        long jD = l.i().l().d();
        if (jD == 0) {
            this.f22582r = true;
        } else {
            this.f22583s.postDelayed(new Runnable() { // from class: com.pushwoosh.inapp.view.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22595m.v();
                }
            }, jD);
        }
    }

    private void y() {
        if (this.f22585u == null) {
            return;
        }
        if ((this.f22587w & 1) != 0) {
            getWindow().addFlags(524288);
            if (ka.e.d().l().a()) {
                z7.f.l();
            }
        }
        Uri uriI = z7.f.i(this.f22586v);
        if (uriI != null && !this.B) {
            this.B = true;
            new b(this, uriI, new o8.a() { // from class: com.pushwoosh.inapp.view.b
                @Override // o8.a
                public final void a(o8.b bVar) {
                    RichMediaWebActivity.r(bVar);
                }
            }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
        if (this.f22590z) {
            return;
        }
        if (!this.f22589y) {
            this.f22589y = true;
            a9.i.e(new u9.b(this.f22598n));
        }
        this.f22585u.d();
        this.f22590z = true;
    }

    @Override // com.pushwoosh.inapp.view.e.b
    public void a() {
        g gVar = this.f22585u;
        if (gVar != null) {
            gVar.n();
        }
    }

    @Override // com.pushwoosh.inapp.view.c, u9.a
    public void c() {
        super.c();
        y();
    }

    @Override // com.pushwoosh.inapp.view.c, u9.a
    public void close() {
        e eVar = (e) getFragmentManager().findFragmentByTag("[InApp]RichMediaWebActpushwoosh.inAppFragment");
        if (eVar != null) {
            getFragmentManager().beginTransaction().remove(eVar).commitAllowingStateLoss();
        }
        if (this.f22584t) {
            return;
        }
        this.f22584t = true;
        g gVar = this.f22585u;
        if (gVar != null) {
            gVar.f(new a());
        }
    }

    @Override // com.pushwoosh.inapp.view.e.b
    public void e() {
        g gVar = this.f22585u;
        if (gVar != null) {
            gVar.k();
        }
    }

    @Override // com.pushwoosh.inapp.view.e.b
    public boolean g(t8.a aVar) {
        if (this.f22585u == null || aVar.equals(this.f22588x)) {
            return false;
        }
        this.f22588x = aVar;
        String strA = aVar.a();
        String strB = aVar.b();
        if (!strB.endsWith("/")) {
            strB = strB + "/";
        }
        this.f22585u.g(strB, p(strA), "text/html", "UTF-8", null);
        return true;
    }

    @Override // com.pushwoosh.inapp.view.e.b
    public void h(p8.a aVar) {
        h.m("[InApp]RichMediaWebAct", "Failed loading html data", aVar);
        if (this.f22598n.t()) {
            a9.i.e(new u9.c(this.f22598n));
        }
        close();
    }

    @Override // com.pushwoosh.inapp.view.c
    protected void i(g gVar) {
        this.f22585u = gVar;
        setContentView(gVar);
        e eVar = (e) getFragmentManager().findFragmentByTag("[InApp]RichMediaWebActpushwoosh.inAppFragment");
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // com.pushwoosh.inapp.view.c
    protected void j(q9.b bVar, String str, int i10) {
        this.f22586v = str;
        this.f22587w = i10;
        this.B = false;
        e eVar = (e) getFragmentManager().findFragmentByTag("[InApp]RichMediaWebActpushwoosh.inAppFragment");
        FragmentTransaction fragmentTransactionBeginTransaction = getFragmentManager().beginTransaction();
        if (eVar != null) {
            fragmentTransactionBeginTransaction.remove(eVar);
        }
        this.f22589y = false;
        fragmentTransactionBeginTransaction.add(e.c(bVar), "[InApp]RichMediaWebActpushwoosh.inAppFragment").commitAllowingStateLoss();
        this.f22589y = false;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f22582r) {
            close();
        }
    }

    @Override // com.pushwoosh.inapp.view.c, android.app.Activity
    protected void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
        } catch (Throwable unused) {
            finish();
        }
        if (bundle != null) {
            if (bundle.getBoolean("IS_CLOSED")) {
                finish();
                return;
            }
            this.f22590z = bundle.getBoolean("IS_ANIMATED");
            this.B = bundle.getBoolean("KEY_IS_SOUND_PLAYED");
            this.f22586v = bundle.getString("extraSound", "");
            this.f22587w = bundle.getInt("extraMode", this.f22587w);
        }
        x();
    }

    @Override // com.pushwoosh.inapp.view.c, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        w();
    }

    @Override // com.pushwoosh.inapp.view.c, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("IS_ANIMATED", this.f22590z);
        bundle.putBoolean("IS_CLOSED", this.f22584t);
        bundle.putBoolean("KEY_IS_SOUND_PLAYED", this.B);
        bundle.putString("extraSound", this.f22586v);
        bundle.putInt("extraMode", this.f22587w);
    }
}
