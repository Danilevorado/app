package ca;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import n7.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sa.b;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final a f5099a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f5100b;

    /* renamed from: c, reason: collision with root package name */
    private final View f5101c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5102d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5103e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f5104f = new Handler(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    private String f5105g;

    /* renamed from: h, reason: collision with root package name */
    private String f5106h;

    public j(a aVar, WebView webView, View view, String str, String str2) {
        this.f5099a = aVar;
        this.f5100b = new WeakReference(webView);
        this.f5101c = view;
        this.f5102d = str;
        this.f5103e = str2;
    }

    private void g(String str) {
        final String str2 = String.format("javascript:_pwCallbackHelper.invokeCallback(\"%s\");", str);
        this.f5104f.post(new Runnable() { // from class: ca.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f5086m.k(str2);
            }
        });
    }

    private void h(String str, String str2) {
        final String str3 = String.format("javascript:_pwCallbackHelper.invokeCallback(\"%s\", \"%s\");", str, str2.replace("\"", "\\\""));
        this.f5104f.post(new Runnable() { // from class: ca.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f5084m.m(str3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(String str, String str2, o8.b bVar) {
        if (!bVar.f()) {
            h(str2, ((e8.a) bVar.e()).getMessage());
        } else {
            sa.b bVar2 = (sa.b) bVar.d();
            h(str, (bVar2 == null ? new JSONObject() : bVar2.b()).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(String str, o8.b bVar) {
        if (bVar.e() == null) {
            g(str);
        } else {
            h(str, ((e8.f) bVar.e()).getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(String str, String str2, o8.b bVar) {
        if (bVar.f()) {
            g(str);
        } else {
            h(str2, ((e8.b) bVar.e()).getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(String str, String str2, o8.b bVar) {
        if (bVar.f()) {
            g(str);
        } else {
            h(str2, ((s7.c) bVar.e()).getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m(String str) {
        WebView webView = (WebView) this.f5100b.get();
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    @JavascriptInterface
    public void closeInApp() {
        richMediaAction(this.f5106h, this.f5105g, 4, null, null, null);
        this.f5099a.close();
    }

    @JavascriptInterface
    public void getChannels(String str) {
        List listD = l.i().t().d();
        JSONArray jSONArray = new JSONArray();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            jSONArray.put(((la.a) it.next()).a());
        }
        h(str, jSONArray.toString());
    }

    @JavascriptInterface
    public String getCustomData() {
        return this.f5102d;
    }

    @JavascriptInterface
    public void getTags(final String str, final String str2) {
        n7.i.d().e(new o8.a() { // from class: ca.i
            @Override // o8.a
            public final void a(o8.b bVar) {
                this.f5096a.i(str, str2, bVar);
            }
        });
    }

    @JavascriptInterface
    public boolean isCommunicationEnabled() {
        return n7.h.v().x();
    }

    @JavascriptInterface
    public boolean isDeviceDataRemoved() {
        return n7.h.v().y();
    }

    @JavascriptInterface
    public void isRegisteredForPushNotifications(String str) {
        boolean zA;
        try {
            zA = l.i().j().l().a();
        } catch (Exception unused) {
            zA = false;
        }
        h(str, zA ? "true" : "false");
    }

    @JavascriptInterface
    public void log(String str) {
        k9.h.h("[InApp]PushwooshJSInterface", str);
    }

    @JavascriptInterface
    public void openAppSettings() {
        if (c9.a.d() == null) {
            return;
        }
        Context contextB = c9.a.b();
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", contextB.getPackageName());
        intent.putExtra("app_uid", contextB.getApplicationInfo().uid);
        intent.addFlags(268435456);
        intent.putExtra("android.provider.extra.APP_PACKAGE", contextB.getPackageName());
        contextB.startActivity(intent);
    }

    public void p(WebView webView, q9.b bVar) {
        Object[] objArr = new Object[8];
        objArr[0] = n7.i.d().c();
        objArr[1] = "6.7.10";
        objArr[2] = n7.i.d().b();
        objArr[3] = n7.i.d().f();
        objArr[4] = !bVar.t() ? bVar.l().substring(2) : "";
        objArr[5] = Integer.valueOf(j9.b.d().c());
        String str = this.f5103e;
        if (str == null) {
            str = "";
        }
        objArr[6] = str;
        objArr[7] = bVar.t() ? bVar.l() : "";
        webView.loadUrl(String.format("javascript:(function () {if (window.pushwoosh) return;window._pwCallbackHelper = {    __callbacks: {},    __cbCounter: 0,    invokeCallback: function(cbID) {        var args = Array.prototype.slice.call(arguments);        args.shift();        var cb = this.__callbacks[cbID];        this.__callbacks[cbID] = undefined;        return cb.apply(null, args);    },    registerCallback: function(func) {        var cbID = \"__cb\" + (+new Date) + this.__cbCounter;        this.__cbCounter++;        this.__callbacks[cbID] = func;        return cbID;    }};window.pushwoosh = {    _hwid: \"%s\",    _version: \"%s\",    _application: \"%s\",    _user_id: \"%s\",    _richmedia_code: \"%s\",    _device_type: \"%s\",    _message_hash: \"%s\",    _inapp_code: \"%s\",    postEvent: function(event, attributes, successCallback, errorCallback) {        if (!attributes) {            attributes = {};        }        if (!successCallback) {            successCallback = function() {};        }        if (!errorCallback) {            errorCallback = function(error) {};        }        var successCbId = _pwCallbackHelper.registerCallback(successCallback);        var errorCbId = _pwCallbackHelper.registerCallback(errorCallback);        pushwooshImpl.postEvent(event, JSON.stringify(attributes), successCbId, errorCbId);    },    richMediaAction: function(inAppCode, richMediaCode, actionType, actionAttributes, successCallback, errorCallback) {        if (!successCallback) {            successCallback = function() {};        }        if (!errorCallback) {            errorCallback = function(error) {};        }        var successCbId = _pwCallbackHelper.registerCallback(successCallback);        var errorCbId = _pwCallbackHelper.registerCallback(errorCallback);        pushwooshImpl.richMediaAction(inAppCode, richMediaCode, actionType, JSON.stringify(actionAttributes), successCbId, errorCbId);    },    sendTags: function(tags) {        pushwooshImpl.sendTags(JSON.stringify(tags));    },    getTags: function(successCallback, errorCallback) {        if (!errorCallback) {            errorCallback = function(error) {};        }        var successCbId = _pwCallbackHelper.registerCallback(function(tagsString) {            console.log(\"tags: \" + tagsString);            successCallback(JSON.parse(tagsString));        });        var errorCbId = _pwCallbackHelper.registerCallback(errorCallback);        pushwooshImpl.getTags(successCbId, errorCbId);    },    isCommunicationEnabled: function() {        return pushwooshImpl.isCommunicationEnabled();    },    setCommunicationEnabled: function(enabled) {        pushwooshImpl.setCommunicationEnabled(enabled);    },    removeAllDeviceData: function() {        pushwooshImpl.removeAllDeviceData();    },    log: function(str) {        pushwooshImpl.log(str);    },    closeInApp: function() {        pushwooshImpl.closeInApp();    },    getHwid: function() {        return this._hwid;    },    getVersion: function() {        return this._version;    },    getApplication: function() {        return this._application;    },    getUserId: function() {        return this._user_id;    },    getRichmediaCode: function() {        return this._richmedia_code;    },    getDeviceType: function() {        return this._device_type;    },    getMessageHash: function() {        return this._message_hash;    },    getInAppCode: function() {        return this._inapp_code;    },    getCustomData: function() {         var customData = pushwooshImpl.getCustomData();         if (customData) {             return JSON.parse(customData);         } else {             return null;         }    },    registerForPushNotifications: function() {        pushwooshImpl.registerForPushNotifications();    },    openAppSettings: function() {        pushwooshImpl.openAppSettings();    },    getChannels: function(callback) {        var clb = _pwCallbackHelper.registerCallback(function(channels) {             callback(JSON.parse(channels));        });        pushwooshImpl.getChannels(clb);    },    unregisterForPushNotifications: function(callback) {        var clb = _pwCallbackHelper.registerCallback(callback);        pushwooshImpl.unregisterForPushNotifications(clb);    },    isRegisteredForPushNotifications: function(callback) {        var clb = _pwCallbackHelper.registerCallback(function(state) {           if (state == 'true') {callback(true);} else if (state == 'false') {callback(false);}        });        pushwooshImpl.isRegisteredForPushNotifications(clb);    }};}());", objArr));
    }

    @JavascriptInterface
    public void postEvent(String str, String str2, final String str3, final String str4) {
        try {
            l.i().s().f(str, sa.a.b(new JSONObject(str2)), new o8.a() { // from class: ca.g
                @Override // o8.a
                public final void a(o8.b bVar) {
                    this.f5090a.l(str3, str4, bVar);
                }
            });
        } catch (Exception e5) {
            k9.h.n("postEvent method was failed", e5);
            h(str4, e5.getLocalizedMessage());
        }
    }

    public void q(WebView webView, q9.b bVar) {
        Object[] objArr = new Object[8];
        objArr[0] = n7.i.d().c();
        objArr[1] = "6.7.10";
        objArr[2] = n7.i.d().b();
        objArr[3] = n7.i.d().f();
        objArr[4] = !bVar.t() ? bVar.l().substring(2) : "";
        objArr[5] = Integer.valueOf(j9.b.d().c());
        String str = this.f5103e;
        if (str == null) {
            str = "";
        }
        objArr[6] = str;
        objArr[7] = bVar.t() ? bVar.l() : "";
        String str2 = String.format("javascript:(function () {if (window.pushwoosh) return;window._pwCallbackHelper = {    __callbacks: {},    __cbCounter: 0,    invokeCallback: function(cbID) {        var args = Array.prototype.slice.call(arguments);        args.shift();        var cb = this.__callbacks[cbID];        this.__callbacks[cbID] = undefined;        return cb.apply(null, args);    },    registerCallback: function(func) {        var cbID = \"__cb\" + (+new Date) + this.__cbCounter;        this.__cbCounter++;        this.__callbacks[cbID] = func;        return cbID;    }};window.pushwoosh = {    _hwid: \"%s\",    _version: \"%s\",    _application: \"%s\",    _user_id: \"%s\",    _richmedia_code: \"%s\",    _device_type: \"%s\",    _message_hash: \"%s\",    _inapp_code: \"%s\",    postEvent: function(event, attributes, successCallback, errorCallback) {        if (!attributes) {            attributes = {};        }        if (!successCallback) {            successCallback = function() {};        }        if (!errorCallback) {            errorCallback = function(error) {};        }        var successCbId = _pwCallbackHelper.registerCallback(successCallback);        var errorCbId = _pwCallbackHelper.registerCallback(errorCallback);        pushwooshImpl.postEvent(event, JSON.stringify(attributes), successCbId, errorCbId);    },    richMediaAction: function(inAppCode, richMediaCode, actionType, actionAttributes, successCallback, errorCallback) {        if (!successCallback) {            successCallback = function() {};        }        if (!errorCallback) {            errorCallback = function(error) {};        }        var successCbId = _pwCallbackHelper.registerCallback(successCallback);        var errorCbId = _pwCallbackHelper.registerCallback(errorCallback);        pushwooshImpl.richMediaAction(inAppCode, richMediaCode, actionType, JSON.stringify(actionAttributes), successCbId, errorCbId);    },    sendTags: function(tags) {        pushwooshImpl.sendTags(JSON.stringify(tags));    },    getTags: function(successCallback, errorCallback) {        if (!errorCallback) {            errorCallback = function(error) {};        }        var successCbId = _pwCallbackHelper.registerCallback(function(tagsString) {            console.log(\"tags: \" + tagsString);            successCallback(JSON.parse(tagsString));        });        var errorCbId = _pwCallbackHelper.registerCallback(errorCallback);        pushwooshImpl.getTags(successCbId, errorCbId);    },    isCommunicationEnabled: function() {        return pushwooshImpl.isCommunicationEnabled();    },    setCommunicationEnabled: function(enabled) {        pushwooshImpl.setCommunicationEnabled(enabled);    },    removeAllDeviceData: function() {        pushwooshImpl.removeAllDeviceData();    },    log: function(str) {        pushwooshImpl.log(str);    },    closeInApp: function() {        pushwooshImpl.closeInApp();    },    getHwid: function() {        return this._hwid;    },    getVersion: function() {        return this._version;    },    getApplication: function() {        return this._application;    },    getUserId: function() {        return this._user_id;    },    getRichmediaCode: function() {        return this._richmedia_code;    },    getDeviceType: function() {        return this._device_type;    },    getMessageHash: function() {        return this._message_hash;    },    getInAppCode: function() {        return this._inapp_code;    },    getCustomData: function() {         var customData = pushwooshImpl.getCustomData();         if (customData) {             return JSON.parse(customData);         } else {             return null;         }    },    registerForPushNotifications: function() {        pushwooshImpl.registerForPushNotifications();    },    openAppSettings: function() {        pushwooshImpl.openAppSettings();    },    getChannels: function(callback) {        var clb = _pwCallbackHelper.registerCallback(function(channels) {             callback(JSON.parse(channels));        });        pushwooshImpl.getChannels(clb);    },    unregisterForPushNotifications: function(callback) {        var clb = _pwCallbackHelper.registerCallback(callback);        pushwooshImpl.unregisterForPushNotifications(clb);    },    isRegisteredForPushNotifications: function(callback) {        var clb = _pwCallbackHelper.registerCallback(function(state) {           if (state == 'true') {callback(true);} else if (state == 'false') {callback(false);}        });        pushwooshImpl.isRegisteredForPushNotifications(clb);    }};}());", objArr);
        this.f5105g = !bVar.t() ? bVar.l().substring(2) : "";
        this.f5106h = bVar.t() ? bVar.l() : "";
        webView.loadUrl(str2);
    }

    @JavascriptInterface
    public void registerForPushNotifications() {
        n7.i.d().g();
    }

    @JavascriptInterface
    public void removeAllDeviceData() {
        n7.h.v().z(null);
    }

    @JavascriptInterface
    public void richMediaAction(String str, String str2, int i10, String str3, final String str4, final String str5) {
        try {
            l.i().s().d(str2, str, this.f5103e, str3, i10, new o8.a() { // from class: ca.h
                @Override // o8.a
                public final void a(o8.b bVar) {
                    this.f5093a.n(str4, str5, bVar);
                }
            });
        } catch (Exception e5) {
            k9.h.l("failed to send /richMediaAction request:", e5.getMessage());
            h(str5, e5.getLocalizedMessage());
        }
    }

    @JavascriptInterface
    public void sendTags(String str) {
        try {
            n7.i.d().i(new b.a().d(new JSONObject(str)).b());
        } catch (JSONException e5) {
            k9.h.n("Invalid tags format, expected object with string properties", e5);
        }
    }

    @JavascriptInterface
    public void setCommunicationEnabled(boolean z10) {
        n7.h.v().A(z10, null);
    }

    @JavascriptInterface
    public void unregisterForPushNotifications(final String str) {
        n7.i.d().l(new o8.a() { // from class: ca.f
            @Override // o8.a
            public final void a(o8.b bVar) {
                this.f5088a.j(str, bVar);
            }
        });
    }
}
