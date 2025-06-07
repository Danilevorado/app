package com.google.android.gms.internal.ads;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class mk0 extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    private final nk0 f12180a;

    public mk0(nk0 nk0Var) {
        this.f12180a = nk0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Context b(WebView webView) {
        if (!(webView instanceof nk0)) {
            return webView.getContext();
        }
        nk0 nk0Var = (nk0) webView;
        Activity activityI = nk0Var.i();
        return activityI != null ? activityI : nk0Var.getContext();
    }

    protected final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z10) {
        nk0 nk0Var;
        AlertDialog alertDialogCreate;
        j3.b bVarF;
        try {
            nk0Var = this.f12180a;
        } catch (WindowManager.BadTokenException e5) {
            ze0.h("Fail to display Dialog.", e5);
        }
        if (nk0Var != null && nk0Var.G() != null && this.f12180a.G().f() != null && (bVarF = this.f12180a.G().f()) != null && !bVarF.c()) {
            bVarF.b("window." + str + "('" + str3 + "')");
            return false;
        }
        j3.t.r();
        AlertDialog.Builder builderF = m3.b2.f(context);
        builderF.setTitle(str2);
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            alertDialogCreate = builderF.setView(linearLayout).setPositiveButton(R.string.ok, new kk0(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new jk0(jsPromptResult)).setOnCancelListener(new ik0(jsPromptResult)).create();
        } else {
            alertDialogCreate = builderF.setMessage(str3).setPositiveButton(R.string.ok, new hk0(jsResult)).setNegativeButton(R.string.cancel, new gk0(jsResult)).setOnCancelListener(new fk0(jsResult)).create();
        }
        alertDialogCreate.show();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        String str;
        if (webView instanceof nk0) {
            l3.r rVarG0 = ((nk0) webView).g0();
            if (rVarG0 != null) {
                rVarG0.b();
                return;
            }
            str = "Tried to close an AdWebView not associated with an overlay.";
        } else {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        }
        ze0.g(str);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i10 = lk0.f11644a[consoleMessage.messageLevel().ordinal()];
        if (i10 == 1) {
            ze0.d(str);
        } else if (i10 == 2) {
            ze0.g(str);
        } else if (i10 == 3 || i10 == 4 || i10 != 5) {
            ze0.f(str);
        } else {
            ze0.b(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f12180a.T() != null) {
            webView2.setWebViewClient(this.f12180a.T());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        long j13 = 5242880 - j12;
        if (j13 <= 0) {
            quotaUpdater.updateQuota(j10);
            return;
        }
        if (j10 == 0) {
            if (j11 > j13 || j11 > 1048576) {
                j11 = 0;
            }
        } else if (j11 == 0) {
            j11 = Math.min(j10 + Math.min(131072L, j13), 1048576L);
        } else {
            if (j11 <= Math.min(1048576 - j10, j13)) {
                j10 += j11;
            }
            j11 = j10;
        }
        quotaUpdater.updateQuota(j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r4, android.webkit.GeolocationPermissions.Callback r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L2c
            j3.t.r()
            com.google.android.gms.internal.ads.nk0 r0 = r3.f12180a
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = m3.b2.S(r0, r1)
            r1 = 1
            if (r0 != 0) goto L28
            j3.t.r()
            com.google.android.gms.internal.ads.nk0 r0 = r3.f12180a
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = m3.b2.S(r0, r2)
            if (r0 == 0) goto L26
            goto L28
        L26:
            r0 = 0
            goto L29
        L28:
            r0 = r1
        L29:
            r5.invoke(r4, r0, r1)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mk0.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        l3.r rVarG0 = this.f12180a.g0();
        if (rVarG0 == null) {
            ze0.g("Could not get ad overlay when hiding custom view.");
        } else {
            rVarG0.e();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        l3.r rVarG0 = this.f12180a.g0();
        if (rVarG0 == null) {
            ze0.g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            rVarG0.N5(view, customViewCallback);
            rVarG0.U5(i10);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
