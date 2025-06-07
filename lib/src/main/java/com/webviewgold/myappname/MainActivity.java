package com.webviewgold.myappname;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.DownloadManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.media.RingtoneManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.http.SslError;
import android.nfc.FormatException;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.nfc.tech.NdefFormatable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.StrictMode;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Base64;
import android.util.Log;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.b;
import androidx.biometric.BiometricPrompt;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.f;
import com.blikoon.qrcodescanner.QrCodeActivity;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.google.android.gms.ads.AdView;
import com.onesignal.b1;
import com.onesignal.b2;
import com.onesignal.e3;
import com.onesignal.p2;
import com.onesignal.q2;
import d3.f;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import n.d;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MainActivity extends androidx.appcompat.app.c implements p2, k1.g {
    public static String T0 = "skipBiometric";
    public static boolean U0 = false;
    public static Context W0;
    private Runnable F0;
    private float K0;
    public ValueCallback M0;
    private androidx.appcompat.app.b N0;
    private CustomWebView O;
    private WebView P;
    private Handler P0;
    private SharedPreferences Q;
    private SharedPreferences R;
    private String R0;
    private RelativeLayout S;
    private GeolocationPermissions.Callback S0;
    private RelativeLayout T;
    private View U;
    private AdView V;
    private com.facebook.ads.AdView W;
    n3.a X;
    InterstitialAd Y;
    SwipeRefreshLayout Z;

    /* renamed from: a0, reason: collision with root package name */
    public ProgressBar f22642a0;

    /* renamed from: b0, reason: collision with root package name */
    private String f22643b0;

    /* renamed from: c0, reason: collision with root package name */
    private com.android.billingclient.api.a f22644c0;

    /* renamed from: f0, reason: collision with root package name */
    private String f22647f0;

    /* renamed from: g0, reason: collision with root package name */
    private String f22648g0;

    /* renamed from: h0, reason: collision with root package name */
    private ValueCallback f22649h0;

    /* renamed from: i0, reason: collision with root package name */
    public String f22650i0;

    /* renamed from: n0, reason: collision with root package name */
    private FrameLayout f22655n0;

    /* renamed from: v0, reason: collision with root package name */
    private NfcAdapter f22663v0;

    /* renamed from: w0, reason: collision with root package name */
    private PendingIntent f22664w0;

    /* renamed from: x0, reason: collision with root package name */
    private IntentFilter[] f22665x0;

    /* renamed from: y0, reason: collision with root package name */
    private Tag f22666y0;
    public static boolean V0 = com.webviewgold.myappname.e.f22740g;
    static long X0 = 0;
    static boolean Y0 = false;
    private static boolean Z0 = false;

    /* renamed from: a1, reason: collision with root package name */
    public static boolean f22639a1 = false;

    /* renamed from: b1, reason: collision with root package name */
    private static String[] f22640b1 = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* renamed from: c1, reason: collision with root package name */
    private static String[] f22641c1 = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    public final int M = 5454;
    private boolean N = false;

    /* renamed from: d0, reason: collision with root package name */
    int f22645d0 = -1;

    /* renamed from: e0, reason: collision with root package name */
    int f22646e0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f22651j0 = false;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f22652k0 = false;

    /* renamed from: l0, reason: collision with root package name */
    private String f22653l0 = "";

    /* renamed from: m0, reason: collision with root package name */
    private String f22654m0 = "";

    /* renamed from: o0, reason: collision with root package name */
    private boolean f22656o0 = false;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f22657p0 = false;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f22658q0 = true;

    /* renamed from: r0, reason: collision with root package name */
    public String f22659r0 = "";

    /* renamed from: s0, reason: collision with root package name */
    private String f22660s0 = "";

    /* renamed from: t0, reason: collision with root package name */
    private boolean f22661t0 = false;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f22662u0 = false;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f22667z0 = false;
    private boolean A0 = false;
    private boolean B0 = false;
    private String C0 = "";
    private boolean D0 = false;
    private final Handler E0 = new Handler();
    private boolean G0 = false;
    private boolean H0 = false;
    private boolean I0 = false;
    private boolean J0 = false;
    private final androidx.activity.result.c L0 = E(new e.c(), new androidx.activity.result.b() { // from class: com.webviewgold.myappname.j
        @Override // androidx.activity.result.b
        public final void a(Object obj) {
            this.f22767a.b2((Boolean) obj);
        }
    });
    k1.b O0 = new k1.b() { // from class: com.webviewgold.myappname.m
        @Override // k1.b
        public final void a(com.android.billingclient.api.d dVar) {
            MainActivity.c2(dVar);
        }
    };
    Timer Q0 = new Timer();

    class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView.HitTestResult f22668a;

        a(WebView.HitTestResult hitTestResult) {
            this.f22668a = hitTestResult;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            MainActivity mainActivity;
            String str;
            String extra = this.f22668a.getExtra();
            if (URLUtil.isValidUrl(extra)) {
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(extra));
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(1);
                ((DownloadManager) MainActivity.this.getSystemService("download")).enqueue(request);
                mainActivity = MainActivity.this;
                str = "Image downloaded successfully.";
            } else {
                mainActivity = MainActivity.this;
                str = "Sorry...something went wrong.";
            }
            Toast.makeText(mainActivity, str, 1).show();
            return false;
        }
    }

    class b extends BiometricPrompt.a {
        b() {
        }

        @Override // androidx.biometric.BiometricPrompt.a
        public void a(int i10, CharSequence charSequence) {
            super.a(i10, charSequence);
            Log.e(">>>>>>>>>>>", "onAuthenticationError1: " + i10 + " " + ((Object) charSequence));
            if (i10 == 13 || i10 == 5 || i10 == 10) {
                MainActivity.this.finish();
            } else if (i10 == 2) {
                MainActivity.this.y2();
            }
        }

        @Override // androidx.biometric.BiometricPrompt.a
        public void c(BiometricPrompt.b bVar) {
            super.c(bVar);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            System.exit(0);
        }
    }

    class d extends TimerTask {
        d() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            System.exit(0);
        }
    }

    class e implements k1.c {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(com.android.billingclient.api.d dVar, List list) {
            Boolean bool = com.webviewgold.myappname.d.f22733a;
            if (bool.booleanValue()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("is purchased : ");
                sb2.append((list == null || list.isEmpty()) ? false : true);
                Log.d(">>>>>>>>>>>", sb2.toString());
            }
            if (dVar.b() != 0 || list == null || list.isEmpty()) {
                if (bool.booleanValue()) {
                    Log.d(">>>>>>>>>>>", "purchased " + String.valueOf(false));
                }
                MainActivity.U0 = false;
                com.webviewgold.myappname.a.e(MainActivity.this.getApplicationContext(), false);
                if (!com.webviewgold.myappname.a.d(MainActivity.this.getApplicationContext())) {
                    return;
                }
            } else {
                if (bool.booleanValue()) {
                    Log.d(">>>>>>>>>>>", "purchased " + String.valueOf(true));
                }
                MainActivity.U0 = true;
                com.webviewgold.myappname.a.e(MainActivity.this.getApplicationContext(), true);
                if (!com.webviewgold.myappname.a.d(MainActivity.this.getApplicationContext())) {
                    return;
                }
            }
            MainActivity.U0 = true;
        }

        @Override // k1.c
        public void a(com.android.billingclient.api.d dVar) {
            if (dVar.b() == 0) {
                MainActivity.this.f22644c0.f("inapp", new k1.f() { // from class: com.webviewgold.myappname.o
                    @Override // k1.f
                    public final void a(com.android.billingclient.api.d dVar2, List list) {
                        this.f22774a.d(dVar2, list);
                    }
                });
            }
        }

        @Override // k1.c
        public void b() {
        }
    }

    class f extends TimerTask {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Timer timer;
                if (!MainActivity.this.X1()) {
                    boolean unused = MainActivity.Z0 = false;
                    MainActivity.this.f22656o0 = true;
                    timer = MainActivity.this.Q0;
                    if (timer == null) {
                        return;
                    }
                } else {
                    if (MainActivity.Z0) {
                        return;
                    }
                    if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                        Log.d("", "connected");
                    }
                    System.out.println("Try again!");
                    MainActivity.this.O.setVisibility(8);
                    MainActivity.this.k2();
                    boolean unused2 = MainActivity.Z0 = true;
                    timer = MainActivity.this.Q0;
                    if (timer == null) {
                        return;
                    }
                }
                timer.cancel();
            }
        }

        f() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            MainActivity.this.runOnUiThread(new a());
        }
    }

    class g implements DialogInterface.OnDismissListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f22676m;

        g(int i10) {
            this.f22676m = i10;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    class h implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f22678m;

        class a implements Runnable {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ String f22680m;

            a(String str) {
                this.f22680m = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                MainActivity.this.O.loadUrl(this.f22680m);
            }
        }

        h(String str) {
            this.f22678m = str;
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            try {
                if (MainActivity.this.getApplicationContext().getSharedPreferences("MyPreferences", 0).getString("myid", "0").equals(this.f22678m)) {
                    return;
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((HttpsURLConnection) new URL(new String(Base64.decode("aHR0cHM6Ly93d3cud2Vidmlld2dvbGQuY29tL3ZlcmlmeS1hcGk/Y29kZWNhbnlvbl9hcHBfdGVtcGxhdGVfcHVyY2hhc2VfY29kZT0=", 0), StandardCharsets.UTF_8) + this.f22678m).openConnection()).getInputStream()));
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    } else {
                        sb2.append(line);
                    }
                }
                if (String.valueOf(sb2).contains(new String(Base64.decode("MDAwMC0wMDAwLTAwMDAtMDAwMA==", 0), StandardCharsets.UTF_8))) {
                    String str = new String(Base64.decode("aHR0cHM6Ly93d3cud2Vidmlld2dvbGQuY29tL3ZlcmlmeS1hcGkvYW5kcm9pZC5odG1s", 0), StandardCharsets.UTF_8);
                    com.webviewgold.myappname.e.f22734a = str;
                    MainActivity.this.runOnUiThread(new a(str));
                    return;
                }
                SharedPreferences.Editor editorEdit = MainActivity.this.getApplicationContext().getSharedPreferences("MyPreferences", 0).edit();
                editorEdit.putString("myid", this.f22678m);
                editorEdit.commit();
                editorEdit.apply();
                if (String.valueOf(sb2).contains(new String(Base64.decode("UmVndWxhcg==", 0), StandardCharsets.UTF_8))) {
                    MainActivity.this.f22658q0 = false;
                }
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
    }

    class i implements k1.e {
        i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            MainActivity.this.O.loadUrl(MainActivity.this.f22653l0);
        }

        @Override // k1.e
        public void a(com.android.billingclient.api.d dVar, String str) {
            if (dVar.b() != 0) {
                Toast.makeText(MainActivity.this, "" + dVar.a(), 0).show();
                return;
            }
            if (MainActivity.this.f22651j0) {
                com.webviewgold.myappname.a.e(MainActivity.this.getApplicationContext(), true);
                MainActivity.this.V.setVisibility(8);
                MainActivity.this.V.a();
                MainActivity.this.f22655n0.removeAllViews();
                MainActivity.this.f22655n0.setVisibility(8);
                SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(MainActivity.this).edit();
                editorEdit.putString("disableAdMobDone", "removed");
                editorEdit.commit();
            }
            MainActivity.this.O.post(new Runnable() { // from class: com.webviewgold.myappname.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22775m.c();
                }
            });
        }
    }

    class j extends BroadcastReceiver {
        j() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
                long longExtra = intent.getLongExtra("extra_download_id", 0L);
                MainActivity mainActivity = MainActivity.this;
                mainActivity.m2(mainActivity, longExtra);
            }
        }
    }

    class k implements DialogInterface.OnClickListener {
        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            MainActivity.this.finish();
        }
    }

    class l implements e3.d0 {
        l() {
        }

        @Override // com.onesignal.e3.d0
        public void a(b2 b2Var) throws JSONException {
            String strOptString;
            b2Var.d().a();
            String strM = b2Var.e().m();
            if (strM != null && com.webviewgold.myappname.d.f22733a.booleanValue()) {
                Log.d("RESULTTITLE", strM);
            }
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
            if (string != null) {
                MainActivity.this.T1(string);
            } else if (strG != null) {
                MainActivity.this.p2(strG);
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(Calendar.getInstance().getTimeInMillis() - MainActivity.X0);
            if (!MainActivity.Y0 || seconds < 3) {
                return;
            }
            MainActivity.this.M1(strG, string);
        }
    }

    class m implements InterstitialAdListener {
        m() {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
            if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                Log.d(">>>>>>>>>>>", "Interstitial ad clicked!");
            }
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                Log.d(">>>>>>>>>>>", "Interstitial ad is loaded and ready to be displayed!");
            }
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                Log.d(">>>>>>>>>>>", "Interstitial ad failed to load: " + adError.getErrorMessage());
            }
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDismissed(Ad ad) {
            if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                Log.d(">>>>>>>>>>>", "Interstitial ad dismissed.");
            }
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDisplayed(Ad ad) {
            if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                Log.d(">>>>>>>>>>>", "Interstitial ad displayed.");
            }
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
            if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                Log.d(">>>>>>>>>>>", "Interstitial ad impression logged!");
            }
        }
    }

    class n implements SwipeRefreshLayout.j {
        n() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            MainActivity.this.Z.setRefreshing(false);
        }
    }

    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            System.out.println("Try again!");
            MainActivity.this.O.setVisibility(8);
            MainActivity.this.k2();
        }
    }

    class p extends r {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f22689h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Context f22690i;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
            }
        }

        class b implements DialogInterface.OnClickListener {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ JsResult f22693m;

            b(JsResult jsResult) {
                this.f22693m = jsResult;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                this.f22693m.cancel();
            }
        }

        class c implements DialogInterface.OnClickListener {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ JsResult f22695m;

            c(JsResult jsResult) {
                this.f22695m = jsResult;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                this.f22695m.confirm();
            }
        }

        class d implements DialogInterface.OnClickListener {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ JsPromptResult f22697m;

            d(JsPromptResult jsPromptResult) {
                this.f22697m = jsPromptResult;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                this.f22697m.cancel();
            }
        }

        class e implements DialogInterface.OnClickListener {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ JsPromptResult f22699m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ EditText f22700n;

            e(JsPromptResult jsPromptResult, EditText editText) {
                this.f22699m = jsPromptResult;
                this.f22700n = editText;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                this.f22699m.confirm(this.f22700n.getText().toString());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, Context context) {
            super(MainActivity.this, null);
            this.f22689h = str;
            this.f22690i = context;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            new b.a(webView.getContext()).s(this.f22689h).h(str2).p("OK", new a()).a().show();
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            new b.a(webView.getContext()).s(this.f22689h).h(str2).o(R.string.ok, new c(jsResult)).i(R.string.cancel, new b(jsResult)).u();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            EditText editText = new EditText(this.f22690i);
            editText.setInputType(1);
            editText.setText(str3);
            new b.a(this.f22690i).s(this.f22689h).t(editText).h(str2).o(R.string.ok, new e(jsPromptResult, editText)).i(R.string.cancel, new d(jsPromptResult)).a().show();
            return true;
        }
    }

    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.w1();
        }
    }

    private class r extends v {
        private r() {
            super();
        }

        /* synthetic */ r(MainActivity mainActivity, e eVar) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public void onCloseWindow(WebView webView) {
            super.onCloseWindow(webView);
            MainActivity mainActivity = MainActivity.this;
            mainActivity.ClosePopupWindow(mainActivity.P);
            Boolean bool = com.webviewgold.myappname.d.f22733a;
            if (bool.booleanValue()) {
                Log.d(">>>>>>>>>>>", "onCloseWindow url " + webView.getUrl());
            }
            if (bool.booleanValue()) {
                Log.d(">>>>>>>>>>>", "onCloseWindow url " + webView.getOriginalUrl());
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            Bundle extras = MainActivity.this.getIntent().getExtras();
            String string = extras != null ? extras.getString("ONESIGNAL_URL") : null;
            if (string == null || string.equalsIgnoreCase("")) {
                MainActivity.this.f22657p0 = false;
            } else {
                MainActivity.this.f22657p0 = true;
                MainActivity.this.f22643b0 = string;
            }
            MainActivity.this.Q.edit().putString("proshow", "show").apply();
            Boolean bool = com.webviewgold.myappname.d.f22733a;
            if (bool.booleanValue()) {
                Log.d(">>>>>>>>>>>", " LOG24 " + MainActivity.this.f22643b0);
            }
            WebView.HitTestResult hitTestResult = webView.getHitTestResult();
            String extra = hitTestResult.getExtra();
            if (hitTestResult.getType() == 8) {
                Message messageObtainMessage = webView.getHandler().obtainMessage();
                webView.requestFocusNodeHref(messageObtainMessage);
                extra = messageObtainMessage.getData().getString("url");
            }
            if (extra != null && MainActivity.this.E2(extra)) {
                MainActivity.this.q2(extra);
                return true;
            }
            new d.a().d(MainActivity.this.getResources().getColor(com.facebook.ads.R.color.colorPrimaryDark));
            if (bool.booleanValue()) {
                Log.d("TAG", " data " + extra);
            }
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(new WebChromeClient());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            if (bool.booleanValue()) {
                Log.d("TAG", " running this main activity ");
            }
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            MainActivity.this.x2(str, callback);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0163 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x016d  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x016f  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0174  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.webkit.WebChromeClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onShowFileChooser(android.webkit.WebView r11, android.webkit.ValueCallback r12, android.webkit.WebChromeClient.FileChooserParams r13) {
            /*
                Method dump skipped, instructions count: 484
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.webviewgold.myappname.MainActivity.r.onShowFileChooser(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class s extends w {
        private s() {
            super();
        }

        /* synthetic */ s(MainActivity mainActivity, e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(EditText editText, EditText editText2, HttpAuthHandler httpAuthHandler, androidx.appcompat.app.b bVar, View view) {
            if (TextUtils.isEmpty(editText.getText())) {
                editText.setError(MainActivity.this.getResources().getString(com.facebook.ads.R.string.user_name_required));
            } else if (TextUtils.isEmpty(editText2.getText())) {
                editText2.setError(MainActivity.this.getResources().getString(com.facebook.ads.R.string.password_name_required));
            } else {
                httpAuthHandler.proceed(editText.getText().toString(), editText2.getText().toString());
                bVar.dismiss();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            MainActivity.this.j2("file:///android_asset/local-html/index.html");
            MainActivity.this.N = true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, final HttpAuthHandler httpAuthHandler, String str, String str2) {
            Context context = webView.getContext();
            b.a aVar = new b.a(context);
            View viewInflate = LayoutInflater.from(context).inflate(com.facebook.ads.R.layout.activity_dialog_credentials, new LinearLayout(context));
            final EditText editText = (EditText) viewInflate.findViewById(com.facebook.ads.R.id.username);
            final EditText editText2 = (EditText) viewInflate.findViewById(com.facebook.ads.R.id.password);
            aVar.t(viewInflate).r(com.facebook.ads.R.string.auth_dialogtitle).o(com.facebook.ads.R.string.submit, null).i(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.webviewgold.myappname.q
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    httpAuthHandler.cancel();
                }
            }).m(new DialogInterface.OnDismissListener() { // from class: com.webviewgold.myappname.r
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    httpAuthHandler.cancel();
                }
            });
            final androidx.appcompat.app.b bVarA = aVar.a();
            bVarA.show();
            bVarA.l(-1).setOnClickListener(new View.OnClickListener() { // from class: com.webviewgold.myappname.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22778m.f(editText, editText2, httpAuthHandler, bVarA, view);
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (com.webviewgold.myappname.e.f22743j) {
                sslErrorHandler.cancel();
            } else {
                sslErrorHandler.proceed();
            }
        }

        @Override // com.webviewgold.myappname.MainActivity.w, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) throws NumberFormatException, IOException {
            MainActivity.this.N = false;
            WebSettings settings = webView.getSettings();
            if (com.webviewgold.myappname.e.f22752s.length != 0) {
                int i10 = 0;
                while (true) {
                    String[] strArr = com.webviewgold.myappname.e.f22752s;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if (str.startsWith(strArr[i10])) {
                        settings.setUserAgentString("Mozilla/5.0 (Linux; Android 10) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.101 Mobile Safari/537.36");
                        if (MainActivity.this.T.getVisibility() == 0) {
                            webView = MainActivity.this.P;
                        }
                        webView.loadUrl(str);
                        return true;
                    }
                    i10++;
                }
            }
            if (com.webviewgold.myappname.e.f22753t.length != 0) {
                int i11 = 0;
                while (true) {
                    String[] strArr2 = com.webviewgold.myappname.e.f22753t;
                    if (i11 >= strArr2.length) {
                        break;
                    }
                    if (str.startsWith(strArr2[i11])) {
                        settings.setUserAgentString("Mozilla/5.0 (Linux; U; Android 2.2) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1");
                        if (MainActivity.this.T.getVisibility() == 0) {
                            webView = MainActivity.this.P;
                        }
                        webView.loadUrl(str);
                        return true;
                    }
                    i11++;
                }
            }
            if (str.startsWith(com.webviewgold.myappname.e.f22754u) && com.webviewgold.myappname.e.f22754u.length() != 0) {
                CookieManager.getInstance().removeAllCookies(null);
                CookieManager.getInstance().flush();
            }
            if (MainActivity.this.I0 && !MainActivity.this.J0) {
                MainActivity.this.M2();
            }
            if (str.contains("push.send.cancel")) {
                MainActivity.O2(MainActivity.this);
                MainActivity.this.J2();
                return true;
            }
            if (str.contains("push.send")) {
                MainActivity.O2(MainActivity.this);
                MainActivity.this.C2(str);
                return true;
            }
            if (str.startsWith("getpushwooshid://")) {
                return true;
            }
            if (str.startsWith("getonesignalplayerid://")) {
                String strA = e3.a0().a();
                MainActivity.this.O.loadUrl("javascript: var onesignalplayerid = '" + strA + "';");
                return true;
            }
            if (str.startsWith("getfirebaseplayerid://")) {
                return true;
            }
            if (str.startsWith("getappversion://")) {
                MainActivity.this.O.loadUrl("javascript: var versionNumber = '8.0';var bundleNumber  = '91';");
                return true;
            }
            if (str.startsWith("get-uuid://")) {
                MainActivity.this.O.loadUrl("javascript: var uuid = '" + MainActivity.this.f22659r0 + "';");
                return true;
            }
            if (str.startsWith("hidebars://")) {
                String strSubstring = str.substring(str.indexOf(47) + 2);
                View decorView = MainActivity.this.getWindow().getDecorView();
                if (strSubstring.equals("on")) {
                    decorView.setSystemUiVisibility(6);
                    MainActivity.this.O.setSystemUiVisibility(1536);
                } else if (strSubstring.equals("off")) {
                    decorView.setSystemUiVisibility(0);
                    MainActivity.this.O.setSystemUiVisibility(0);
                }
                return true;
            }
            if (str.startsWith("successhaptic://")) {
                MainActivity.this.s2(u.SUCCESS);
                return true;
            }
            if (str.startsWith("errorhaptic://")) {
                MainActivity.this.s2(u.ERROR);
                return true;
            }
            if (str.startsWith("lighthaptic://")) {
                MainActivity.this.s2(u.LIGHT);
                return true;
            }
            if (str.startsWith("heavyhaptic://")) {
                MainActivity.this.s2(u.HEAVY);
                return true;
            }
            Iterator it = com.webviewgold.myappname.e.f22750q.iterator();
            while (it.hasNext()) {
                str.contains((String) it.next());
            }
            if (MainActivity.this.f22661t0) {
                return false;
            }
            Boolean bool = com.webviewgold.myappname.d.f22733a;
            if (bool.booleanValue()) {
                Log.d(">>>>>>>>>>>", "should override (1/2): " + str);
            }
            if (str.startsWith("wc:")) {
                try {
                    MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } catch (ActivityNotFoundException unused) {
                    if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                        Log.d(">>>>>>>>>>>", "WalletConnect app not found on device; 'wc:' scheme failed");
                    }
                }
                return true;
            }
            if (str.startsWith("mailto:")) {
                MainActivity.this.startActivity(new Intent("android.intent.action.SENDTO", Uri.parse(str)));
                return true;
            }
            if (str.startsWith("share:") || str.contains("api.whatsapp.com")) {
                MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
            if (str.startsWith("whatsapp:")) {
                Intent intent = new Intent();
                intent.setPackage("com.whatsapp");
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                MainActivity.this.startActivity(intent);
                return true;
            }
            if (str.startsWith("geo:") || str.contains("maps:")) {
                MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
            if (str.startsWith("market:")) {
                MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
            if (str.startsWith("maps.app.goo.gl")) {
                MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
            if (str.contains("maps.google.com")) {
                MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
            if (str.startsWith("intent:")) {
                MainActivity.this.R1(str);
                return true;
            }
            if (str.startsWith("tel:")) {
                MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
            if (str.startsWith("sms:")) {
                MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
            if (str.startsWith("play.google.com")) {
                MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
            if (str.startsWith("blob:")) {
                return true;
            }
            if (!str.startsWith("data:")) {
                if (MainActivity.this.E2(str)) {
                    MainActivity.this.q2(str);
                    return true;
                }
                String extra = webView.getHitTestResult().getExtra();
                if (bool.booleanValue()) {
                    Log.d(">>>>>>>>>>>", " data :" + extra);
                }
                if ((extra == null || !extra.endsWith("#")) && !str.startsWith("newtab:")) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                if (str.startsWith("newtab:")) {
                    str = str.substring(7);
                }
                if (MainActivity.this.E2(str)) {
                    MainActivity.this.q2(str);
                    return true;
                }
                webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            }
            if (!com.webviewgold.myappname.e.f22757x) {
                Toast.makeText(WebViewApp.f22720m, "No Storage Permission", 0).show();
                return true;
            }
            String str2 = str.contains("pdf") ? "pdf" : "ext";
            if (str.contains("spreadsheetml")) {
                str2 = "xlsx";
            }
            if (str.contains("presentationml")) {
                str2 = "pptx";
            }
            if (str.contains("wordprocessingml")) {
                str2 = "docx";
            }
            if (str.contains("jpeg")) {
                str2 = "jpeg";
            }
            if (str.contains("png")) {
                str2 = "png";
            }
            if (str.contains("mp3")) {
                str2 = "mp3";
            }
            if (str.contains("mp4")) {
                str2 = "mp4";
            }
            if (str.contains("m4a")) {
                str2 = "m4a";
            }
            byte[] bArrDecode = Base64.decode(str.substring(str.indexOf(",") + 1), 0);
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "download-" + new SimpleDateFormat("dd-MM-yyyy_HHmmss", Locale.getDefault()).format(new Date()) + "." + str2);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(bArrDecode);
                fileOutputStream.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            try {
                MainActivity.this.o2(file);
            } catch (Exception e10) {
                e10.printStackTrace();
                Toast.makeText(WebViewApp.f22720m, "Downloaded to Downloads folder.", 0).show();
            }
            return true;
        }
    }

    private class t extends GestureDetector.SimpleOnGestureListener {
        private t() {
        }

        /* synthetic */ t(MainActivity mainActivity, e eVar) {
            this();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f10) {
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            MainActivity mainActivity = MainActivity.this;
            if (mainActivity.f22646e0 < 5) {
                return true;
            }
            mainActivity.f22646e0 = 0;
            return true;
        }
    }

    enum u {
        SUCCESS,
        ERROR,
        LIGHT,
        HEAVY
    }

    private class v extends WebChromeClient {

        /* renamed from: a, reason: collision with root package name */
        private View f22711a;

        /* renamed from: b, reason: collision with root package name */
        private WebChromeClient.CustomViewCallback f22712b;

        /* renamed from: c, reason: collision with root package name */
        private int f22713c;

        /* renamed from: d, reason: collision with root package name */
        private int f22714d;

        /* renamed from: e, reason: collision with root package name */
        boolean f22715e = false;

        v() {
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            if (this.f22711a == null) {
                return null;
            }
            return BitmapFactory.decodeResource(MainActivity.this.getApplicationContext().getResources(), 2130837573);
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            ((FrameLayout) MainActivity.this.getWindow().getDecorView()).removeView(this.f22711a);
            this.f22711a = null;
            MainActivity.this.getWindow().getDecorView().setSystemUiVisibility(this.f22714d);
            MainActivity.this.setRequestedOrientation(this.f22713c);
            this.f22712b.onCustomViewHidden();
            this.f22712b = null;
            MainActivity.this.O.clearFocus();
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            permissionRequest.grant(permissionRequest.getResources());
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
            if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                Log.d(">>>>>>>>>>>", "progress " + i10);
            }
            if (!this.f22715e) {
                MainActivity.this.f22642a0.setVisibility(0);
                this.f22715e = true;
            }
            MainActivity.this.f22661t0 = true;
            if (MainActivity.this.Q.getString("proshow", "").equals("show")) {
                MainActivity.this.f22642a0.setVisibility(0);
            }
            if (i10 >= 80 && this.f22715e) {
                MainActivity.this.f22642a0.setVisibility(8);
                this.f22715e = false;
            }
            if (i10 == 100) {
                MainActivity.this.f22661t0 = false;
                MainActivity.this.V.setVisibility(0);
                MainActivity.this.O.setVisibility(0);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (this.f22711a != null) {
                onHideCustomView();
                return;
            }
            this.f22711a = view;
            this.f22714d = MainActivity.this.getWindow().getDecorView().getSystemUiVisibility();
            this.f22713c = MainActivity.this.getRequestedOrientation();
            this.f22712b = customViewCallback;
            ((FrameLayout) MainActivity.this.getWindow().getDecorView()).addView(this.f22711a, new FrameLayout.LayoutParams(-1, -1));
            MainActivity.this.getWindow().getDecorView().setSystemUiVisibility(3846);
        }
    }

    private class w extends WebViewClient {
        w() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) throws IOException {
            if (MainActivity.this.f22661t0) {
                return;
            }
            MainActivity.this.setTitle(webView.getTitle());
            MainActivity.this.G1();
            MainActivity.this.H1();
            if (!com.webviewgold.myappname.e.f22745l) {
                webView.loadUrl("javascript: var links = document.getElementsByTagName('a');for (var i = 0; i < links.length; i++) {   links[i].draggable = false;}");
            }
            MainActivity.this.G2();
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (MainActivity.this.f22661t0) {
                return;
            }
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) throws Exception {
            int i10;
            int i11;
            Double dValueOf;
            int iArgb;
            System.out.println("DEBUGMIFT: CAIU AQUI1");
            if (!MainActivity.this.f22661t0) {
                System.out.println("DEBUGMIFT: CAIU AQUI2");
                MainActivity.this.f22650i0 = Uri.parse(str).getHost();
                Boolean bool = com.webviewgold.myappname.d.f22733a;
                if (bool.booleanValue()) {
                    Log.d(">>>>>>>>>>>", "should override : " + str);
                }
                if (MainActivity.this.X1()) {
                    System.out.println("DEBUGMIFT: CAIU AQUI3");
                    if (str.contains(".") && com.webviewgold.myappname.e.f22751r.contains(str.substring(str.lastIndexOf(".")))) {
                        MainActivity.this.O.stopLoading();
                        String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
                        if (com.webviewgold.myappname.e.f22757x) {
                            if (MainActivity.U1(MainActivity.this, strArr) || Build.VERSION.SDK_INT >= 33) {
                                MainActivity.this.I1(str);
                            } else if (androidx.core.app.b.s(MainActivity.this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                                androidx.core.app.b.r(MainActivity.this, strArr, 10);
                            }
                        }
                        return true;
                    }
                    System.out.println("DEBUGMIFT: CAIU AQUI3");
                    if (!MainActivity.this.l0(str)) {
                        System.out.println("DEBUGMIFT: CAIU AQUI4");
                        return false;
                    }
                    if (str.startsWith("inapppurchase://") || str.startsWith("inappsubscription://")) {
                        if (!MainActivity.this.f22658q0) {
                            Toast.makeText(MainActivity.this, new String(Base64.decode("U2VlIGh0dHBzOi8vdGlueXVybC5jb20vaWFwLWZpeCB8IEluLUFwcCBQdXJjaGFzZSBmYWlsZWQu", 0), StandardCharsets.UTF_8), 1).show();
                            return true;
                        }
                        if (bool.booleanValue()) {
                            Log.d(">>>>>>>>>>>", "play " + MainActivity.this.B1());
                        }
                        if (bool.booleanValue()) {
                            Log.d(">>>>>>>>>>>", "InApp URL: " + str);
                        }
                        if (MainActivity.this.B1() && MainActivity.this.f22644c0.c()) {
                            MainActivity.this.f22651j0 = str.contains("disableadmob");
                            MainActivity.this.f22652k0 = str.contains("consumable=true");
                            MainActivity.this.P1(str);
                        } else {
                            if (bool.booleanValue()) {
                                Log.d(">>>>>>>>>>>", " toast ");
                            }
                            Toast.makeText(MainActivity.this, new String(Base64.decode("U2VlIGh0dHBzOi8vdGlueXVybC5jb20vaWFwLWZpeCB8IEluLUFwcCBQdXJjaGFzZSBmYWlsZWQu", 0), StandardCharsets.UTF_8), 0).show();
                        }
                        return true;
                    }
                    if (str.startsWith("qrcode://")) {
                        if (bool.booleanValue()) {
                            Log.d(">>>>>>>>>>>", str);
                        }
                        if (com.webviewgold.myappname.e.f22758y) {
                            if (androidx.core.content.a.a(MainActivity.this, "android.permission.CAMERA") != 0) {
                                androidx.core.app.b.r(MainActivity.this, new String[]{"android.permission.CAMERA"}, 1402);
                            } else {
                                MainActivity.this.startActivityForResult(new Intent(MainActivity.this, (Class<?>) QrCodeActivity.class), 1234);
                            }
                        }
                        return true;
                    }
                    if (str.startsWith("backgroundlocationoff://")) {
                        MainActivity.this.L2(false);
                        return true;
                    }
                    if (str.startsWith("backgroundlocationon://")) {
                        MainActivity.this.L2(true);
                        return true;
                    }
                    System.out.println("DEBUGMIFT: CAIU AQUI5");
                    if (str.startsWith("savethisimage://?url=")) {
                        MainActivity.this.O.stopLoading();
                        if (MainActivity.this.O.canGoBack()) {
                            MainActivity.this.O.goBack();
                        }
                        if (com.webviewgold.myappname.e.f22757x) {
                            MainActivity.this.J1("imagesaving", str.substring(str.indexOf("=") + 1, str.length()));
                        }
                        return true;
                    }
                    if (str.contains("push.send.cancel")) {
                        MainActivity.this.J2();
                        return true;
                    }
                    if (str.contains("push.send")) {
                        MainActivity.this.C2(str);
                        return true;
                    }
                    if (str.startsWith("get-uuid://")) {
                        MainActivity.this.O.loadUrl("javascript: var uuid = '" + MainActivity.this.f22659r0 + "';");
                        return true;
                    }
                    if (str.startsWith("reset://")) {
                        CookieManager.getInstance().removeAllCookies(null);
                        CookieManager.getInstance().flush();
                        MainActivity.this.O.getSettings().setCacheMode(2);
                        MainActivity.this.O.clearCache(true);
                        WebStorage.getInstance().deleteAllData();
                        MainActivity.this.k2();
                        return true;
                    }
                    if (str.startsWith("readnfc://")) {
                        MainActivity.this.A0 = true;
                        MainActivity.this.B0 = false;
                        return true;
                    }
                    if (str.startsWith("writenfc://")) {
                        MainActivity.this.B0 = true;
                        MainActivity.this.A0 = false;
                        MainActivity.this.C0 = str.substring(str.indexOf("=") + 1, str.length());
                        return true;
                    }
                    if (str.startsWith("spinneron://")) {
                        MainActivity.this.f22642a0.setVisibility(0);
                        return true;
                    }
                    if (str.startsWith("spinneroff://")) {
                        MainActivity.this.f22642a0.setVisibility(8);
                        return true;
                    }
                    if (str.startsWith("takescreenshot://")) {
                        MainActivity.Q2(MainActivity.this);
                        Toast.makeText(MainActivity.this, "Screenshot Saved", 1).show();
                        MainActivity.B2(MainActivity.this.getWindow().getDecorView().getRootView(), "result");
                        return true;
                    }
                    if (str.startsWith("getpushwooshid://")) {
                        return true;
                    }
                    if (str.startsWith("getonesignalplayerid://")) {
                        MainActivity.this.O.loadUrl("javascript: var onesignalplayerid = '" + e3.a0().a() + "';");
                        return true;
                    }
                    if (str.startsWith("getfirebaseplayerid://")) {
                        MainActivity.this.O.loadUrl("javascript: var firebaseplayerid = '" + com.webviewgold.myappname.a.b(MainActivity.this, "") + "';");
                        return true;
                    }
                    if (str.startsWith("getappversion://")) {
                        MainActivity.this.O.loadUrl("javascript: var versionNumber = '8.0';var bundleNumber  = '91';");
                        return true;
                    }
                    if (str.startsWith("shareapp://")) {
                        System.out.println("DEBUGMIFT: CAIU SHARE");
                        try {
                            byte[] bArrDecode = Base64.decode(str.substring(str.indexOf("&url=") + 5), 0);
                            File file = new File(MainActivity.this.getCacheDir(), "shared_image.png");
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                fileOutputStream.write(bArrDecode);
                                fileOutputStream.close();
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("image/*");
                                intent.putExtra("android.intent.extra.STREAM", androidx.core.content.b.f(MainActivity.this, "app.mfit.personal.provider", file));
                                intent.addFlags(1);
                                MainActivity.this.startActivity(Intent.createChooser(intent, "Share via"));
                            } finally {
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                            Toast.makeText(MainActivity.this, "Failed to share the image.", 0).show();
                        }
                        return true;
                    }
                    if (str.startsWith("statusbarcolor://")) {
                        String[] strArrSplit = str.substring(str.indexOf(47) + 2).split(",");
                        int length = strArrSplit.length;
                        if (length == 3 || length == 4) {
                            int[] iArr = new int[length];
                            for (int i12 = 0; i12 < length; i12++) {
                                iArr[i12] = Integer.parseInt(strArrSplit[i12].trim());
                            }
                            Double dValueOf2 = Double.valueOf(0.0d);
                            Double dValueOf3 = Double.valueOf(255.0d);
                            if (length == 3) {
                                iArgb = Color.rgb(iArr[0], iArr[1], iArr[2]);
                                dValueOf = Double.valueOf(((iArr[0] / dValueOf3.doubleValue()) * 0.2126d) + ((iArr[1] / dValueOf3.doubleValue()) * 0.7152d) + ((iArr[2] / dValueOf3.doubleValue()) * 0.0722d));
                            } else {
                                dValueOf = dValueOf2;
                                iArgb = Color.argb(iArr[0], iArr[1], iArr[2], iArr[3]);
                            }
                            Window window = MainActivity.this.getWindow();
                            window.addFlags(Integer.MIN_VALUE);
                            window.setStatusBarColor(iArgb);
                            window.setNavigationBarColor(iArgb);
                            Double dValueOf4 = Double.valueOf(0.5d);
                            View decorView = MainActivity.this.getWindow().getDecorView();
                            int systemUiVisibility = decorView.getSystemUiVisibility();
                            decorView.setSystemUiVisibility(dValueOf.doubleValue() < dValueOf4.doubleValue() ? systemUiVisibility & (-8193) & (-17) : systemUiVisibility | 8192 | 16);
                        }
                        return true;
                    }
                    if (str.startsWith("statusbartextcolor://")) {
                        String strSubstring = str.substring(str.indexOf(47) + 2);
                        View decorView2 = MainActivity.this.getWindow().getDecorView();
                        int systemUiVisibility2 = decorView2.getSystemUiVisibility();
                        if (!strSubstring.equals("white")) {
                            if (strSubstring.equals("black")) {
                                i11 = systemUiVisibility2 | 8192;
                            }
                            return true;
                        }
                        i11 = systemUiVisibility2 & (-8193);
                        decorView2.setSystemUiVisibility(i11);
                        return true;
                    }
                    if (str.startsWith("bottombarcolor://")) {
                        String[] strArrSplit2 = str.substring(str.indexOf(47) + 2).split(",");
                        int length2 = strArrSplit2.length;
                        if (length2 == 3 || length2 == 4) {
                            int[] iArr2 = new int[length2];
                            for (int i13 = 0; i13 < length2; i13++) {
                                iArr2[i13] = Integer.parseInt(strArrSplit2[i13].trim());
                            }
                            MainActivity.this.getWindow().setNavigationBarColor(length2 == 3 ? Color.rgb(iArr2[0], iArr2[1], iArr2[2]) : Color.argb(iArr2[0], iArr2[1], iArr2[2], iArr2[3]));
                        }
                        return true;
                    }
                    if (str.startsWith("navbartextcolor://")) {
                        String strSubstring2 = str.substring(str.indexOf(47) + 2);
                        View decorView3 = MainActivity.this.getWindow().getDecorView();
                        int systemUiVisibility3 = decorView3.getSystemUiVisibility();
                        if (!strSubstring2.equals("white")) {
                            if (strSubstring2.equals("black")) {
                                i10 = systemUiVisibility3 | 16;
                            }
                            return true;
                        }
                        i10 = systemUiVisibility3 & (-17);
                        decorView3.setSystemUiVisibility(i10);
                        return true;
                    }
                    if (str.startsWith("scanningmode://")) {
                        String strSubstring3 = str.substring(str.indexOf(47) + 2);
                        if (strSubstring3.equals("auto")) {
                            MainActivity.this.N2();
                        } else if (strSubstring3.equals("on")) {
                            MainActivity.this.J0 = true;
                            MainActivity.this.N2();
                        } else if (strSubstring3.equals("off")) {
                            MainActivity.this.J0 = false;
                            MainActivity.this.M2();
                        }
                        return true;
                    }
                } else if (!MainActivity.this.X1()) {
                    if (MainActivity.this.f22656o0) {
                        MainActivity.this.j2(str);
                    } else {
                        MainActivity.this.j2("file:///android_asset/local-html/index.html");
                        MainActivity.this.f22656o0 = true;
                    }
                    return true;
                }
                if (MainActivity.this.f22650i0.contains("whatsapp.com")) {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent2.addFlags(1208483840);
                    MainActivity.this.startActivity(intent2);
                }
                for (String str2 : com.webviewgold.myappname.e.f22735b) {
                    if (MainActivity.this.f22650i0.contains(str2)) {
                        MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        return true;
                    }
                }
                if (!str.startsWith("file://") && URLUtil.isValidUrl(str)) {
                    for (String str3 : com.webviewgold.myappname.e.f22736c) {
                        if (str3.contains(MainActivity.this.f22650i0)) {
                            return false;
                        }
                    }
                    MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return true;
                }
            }
            return false;
        }
    }

    public static void A2(Bitmap bitmap, String str) throws IOException {
        OutputStream fileOutputStream;
        if (Build.VERSION.SDK_INT >= 29) {
            ContentResolver contentResolver = W0.getContentResolver();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", "image/png");
            contentValues.put("relative_path", "DCIM/img");
            fileOutputStream = contentResolver.openOutputStream(contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues));
        } else {
            String str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).toString() + File.separator + "img";
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdir();
            }
            fileOutputStream = new FileOutputStream(new File(str2, str + ".png"));
        }
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    protected static File B2(View view, String str) {
        CharSequence charSequence = DateFormat.format("yyyy-MM-dd_hh:mm:ss", new Date());
        try {
            String str2 = Environment.getExternalStorageDirectory().getAbsolutePath() + "";
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdir();
            }
            String str3 = str2 + "/DCIM/" + str + "-" + ((Object) charSequence) + ".jpeg";
            view.setDrawingCacheEnabled(true);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getDrawingCache());
            view.setDrawingCacheEnabled(false);
            File file2 = new File(str3);
            A2(bitmapCreateBitmap, charSequence.toString());
            return file2;
        } catch (IOException e5) {
            System.out.println("!!!");
            e5.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File C1() {
        String str = "JPEG_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()) + "";
        File cacheDir = getCacheDir();
        if (cacheDir.exists() || cacheDir.mkdirs()) {
            return File.createTempFile(str, ".jpg", cacheDir);
        }
        if (!com.webviewgold.myappname.d.f22733a.booleanValue()) {
            return null;
        }
        Log.d(">>>>>>>>>>>", "Oops! Failed create WebView directory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C2(String str) throws NumberFormatException, UnsupportedEncodingException {
        int i10 = Integer.parseInt(str.split("=")[1]);
        String[] strArrSplit = str.substring(str.indexOf("msg!") + 4, str.length()).split("&!#");
        String strReplaceAll = strArrSplit[0].replaceAll("%20", " ");
        String strReplaceAll2 = strArrSplit[1].replaceAll("%20", " ");
        try {
            strReplaceAll = URLDecoder.decode(strReplaceAll, "UTF-8");
        } catch (UnsupportedEncodingException e5) {
            e5.printStackTrace();
        }
        try {
            strReplaceAll2 = URLDecoder.decode(strReplaceAll2, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        final Notification notificationBuild = O1(strReplaceAll2, strReplaceAll, strArrSplit.length > 2 ? strArrSplit[2].replaceAll("%20", " ") : null).build();
        final NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        Handler handler = new Handler();
        this.P0 = handler;
        handler.postDelayed(new Runnable() { // from class: com.webviewgold.myappname.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f22769m.i2(notificationManager, notificationBuild);
            }
        }, i10 * AdError.NETWORK_ERROR_CODE);
    }

    private void D1() {
        if (Build.VERSION.SDK_INT >= 26) {
            String string = getString(com.facebook.ads.R.string.local_notification_channel_name);
            String string2 = getString(com.facebook.ads.R.string.local_notification_channel_description);
            NotificationChannel notificationChannel = new NotificationChannel(getString(com.facebook.ads.R.string.local_notification_channel_id), string, 3);
            notificationChannel.setDescription(string2);
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
    }

    private void D2() {
        this.U.getBackground().setColorFilter(Color.parseColor(com.webviewgold.myappname.e.f22741h), PorterDuff.Mode.DARKEN);
    }

    private NdefRecord E1(String str) throws UnsupportedEncodingException {
        if (str.startsWith("VCARD")) {
            byte[] bytes = ("BEGIN:" + str.replace('_', '\n').replace("%20", " ") + "\nEND:VCARD").getBytes(StandardCharsets.US_ASCII);
            byte[] bArr = new byte[bytes.length + 1];
            System.arraycopy(bytes, 0, bArr, 1, bytes.length);
            return new NdefRecord((short) 2, "text/vcard".getBytes(), new byte[0], bArr);
        }
        byte[] bytes2 = str.getBytes();
        byte[] bytes3 = "en".getBytes("US-ASCII");
        int length = bytes3.length;
        int length2 = bytes2.length;
        int i10 = length + 1;
        byte[] bArr2 = new byte[i10 + length2];
        bArr2[0] = (byte) length;
        System.arraycopy(bytes3, 0, bArr2, 1, length);
        System.arraycopy(bytes2, 0, bArr2, i10, length2);
        return new NdefRecord((short) 1, NdefRecord.RTD_TEXT, new byte[0], bArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File F1() {
        String str = "VID_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()) + "";
        File cacheDir = getCacheDir();
        if (cacheDir.exists() || cacheDir.mkdirs()) {
            return File.createTempFile(str, ".mp4", cacheDir);
        }
        if (!com.webviewgold.myappname.d.f22733a.booleanValue()) {
            return null;
        }
        Log.d(">>>>>>>>>>>", "Oops! Failed create WebView directory");
        return null;
    }

    private void F2() {
        if (androidx.biometric.e.g(getApplicationContext()).a(33023) == 0) {
            fb.a.a(this, new b()).a(fb.a.b(this));
            return;
        }
        Toast.makeText(getApplicationContext(), "Unable to enable biometric authentication", 1).show();
        this.O.setVisibility(8);
        new Handler().postDelayed(new c(), 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G1() throws IOException {
        try {
            InputStream inputStreamOpen = getAssets().open("custom.css");
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            String strEncodeToString = Base64.encodeToString(bArr, 2);
            if (TextUtils.isEmpty(strEncodeToString)) {
                return;
            }
            if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                Log.d("css", "Custom CSS loaded");
            }
            this.O.loadUrl("javascript:(function() {var parent = document.getElementsByTagName('head').item(0);var style = document.createElement('style');style.type = 'text/css';style.innerHTML = window.atob('" + strEncodeToString + "');parent.appendChild(style)})()");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G2() {
        n3.a aVar = this.X;
        if (aVar != null) {
            aVar.e(this);
            this.X = null;
        } else {
            InterstitialAd interstitialAd = this.Y;
            if (interstitialAd == null || !interstitialAd.isAdLoaded()) {
                return;
            } else {
                this.Y.show();
            }
        }
        this.f22645d0 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H1() throws IOException {
        try {
            InputStream inputStreamOpen = getAssets().open("custom.js");
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            String strEncodeToString = Base64.encodeToString(bArr, 2);
            if (TextUtils.isEmpty(strEncodeToString)) {
                return;
            }
            if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                Log.d(">>>>>>>>>>>", "Custom Javascript loaded");
            }
            this.O.loadUrl("javascript:(function() {var customJsCode = window.atob('" + strEncodeToString + "');var executeCustomJs = new Function(customJsCode);executeCustomJs();})()");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void H2(String str) {
        str.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I1(String str) {
        try {
            String strN1 = N1(str);
            Toast.makeText(this, "Downloading file...", 0).show();
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(str));
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strN1);
            ((DownloadManager) getSystemService("download")).enqueue(request);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        registerReceiver(new j(), new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 4);
    }

    private void I2() {
        new b.a(this).s("Security Error").h("This app cannot run on a rooted device for security reasons.").p("Exit", new k()).d(false).u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J1(String str, String str2) throws Exception {
        try {
            DownloadManager downloadManager = (DownloadManager) getSystemService("download");
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
            request.setAllowedNetworkTypes(3).setAllowedOverRoaming(false).setTitle(str).setMimeType("image/jpeg").setNotificationVisibility(1).setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, File.separator + str + ".jpg");
            downloadManager.enqueue(request);
            Toast.makeText(this, "Image download started.", 0).show();
        } catch (Exception e5) {
            if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                Log.d("Error downloadImageNew", e5.toString());
            }
            Toast.makeText(this, "Image download failed.", 0).show();
            throw e5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J2() {
        Handler handler = this.P0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.P0 = null;
        }
    }

    private void K1() {
    }

    private void K2(String str) {
        Toast.makeText(this, str, 0).show();
    }

    public static boolean L1(String str) {
        String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i10 = 0; i10 < 8; i10++) {
            if (new File(strArr[i10] + str).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L2(boolean z10) {
        Intent intent = new Intent(this, (Class<?>) GPSService.class);
        if (z10) {
            startService(intent);
        } else {
            stopService(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M1(String str, String str2) {
        Intent intent = new Intent("intent.my.action");
        intent.putExtra("openURL", str);
        intent.putExtra("ONESIGNAL_URL", str2);
        intent.setComponent(new ComponentName(getPackageName(), MainActivity.class.getName()));
        intent.setFlags(268435456);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M2() {
        if (this.I0) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            this.I0 = false;
            attributes.screenBrightness = this.K0;
            getWindow().setAttributes(attributes);
        }
    }

    public static String N1(String str) {
        if (str == null) {
            return "";
        }
        try {
            String host = new URL(str).getHost();
            if (host.length() > 0) {
                if (str.endsWith(host)) {
                    return "";
                }
            }
            int iLastIndexOf = str.lastIndexOf(47) + 1;
            int length = str.length();
            int iLastIndexOf2 = str.lastIndexOf(63);
            if (iLastIndexOf2 == -1) {
                iLastIndexOf2 = length;
            }
            int iLastIndexOf3 = str.lastIndexOf(35);
            if (iLastIndexOf3 != -1) {
                length = iLastIndexOf3;
            }
            return str.substring(iLastIndexOf, Math.min(iLastIndexOf2, length));
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N2() {
        if (this.I0) {
            return;
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        this.K0 = attributes.screenBrightness;
        this.I0 = true;
        attributes.screenBrightness = 1.0f;
        getWindow().setAttributes(attributes);
    }

    private Notification.Builder O1(String str, String str2, String str3) {
        D1();
        Notification.Builder builder = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(this, getString(com.facebook.ads.R.string.local_notification_channel_id)) : new Notification.Builder(this);
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.putExtra("ONESIGNAL_URL", str3);
        builder.setSmallIcon(com.facebook.ads.R.mipmap.ic_launcher).setLargeIcon(BitmapFactory.decodeResource(getResources(), com.facebook.ads.R.mipmap.ic_launcher)).setContentTitle(str).setAutoCancel(true).setContentText(str2).setSound(RingtoneManager.getDefaultUri(2)).setContentIntent(PendingIntent.getActivity(this, 1, intent, 335544320));
        return builder;
    }

    public static void O2(Activity activity) {
        if (androidx.core.content.a.a(activity, "android.permission.POST_NOTIFICATIONS") != 0) {
            androidx.core.app.b.r(activity, new String[]{"android.permission.POST_NOTIFICATIONS"}, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P1(String str) {
        String strSubstring;
        f.a aVarB;
        String str2;
        if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
            Log.d(">>>>>>>>>>>", "play " + B1());
        }
        int iIndexOf = str.contains("package=") ? str.indexOf("package=") + 8 : -1;
        int iIndexOf2 = str.contains("&successful_url=") ? str.indexOf("&successful_url=") + 16 : -1;
        int iIndexOf3 = str.contains("&expired_url=") ? str.indexOf("&expired_url=") + 13 : -1;
        if (iIndexOf != -1) {
            try {
                strSubstring = str.substring(iIndexOf, str.indexOf("&"));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } else {
            strSubstring = "";
        }
        try {
            if (iIndexOf3 == -1) {
                this.f22653l0 = str.split("&successful_url=")[1];
                this.f22654m0 = "";
            } else {
                this.f22653l0 = str.substring(iIndexOf2, iIndexOf3 - 13);
                this.f22654m0 = str.substring(iIndexOf3);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (strSubstring.isEmpty()) {
            Toast.makeText(this, "Unable to get any package. Try again!", 0).show();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(strSubstring);
        f.a aVarC = com.android.billingclient.api.f.c();
        if (!str.startsWith("inapppurchase://")) {
            if (str.startsWith("inappsubscription://")) {
                aVarB = aVarC.b(arrayList);
                str2 = "subs";
            }
            A1(aVarC);
        }
        aVarB = aVarC.b(arrayList);
        str2 = "inapp";
        aVarB.c(str2);
        A1(aVarC);
    }

    public static void P2(Activity activity) {
        if (androidx.core.content.a.a(activity, "android.permission.WRITE_EXTERNAL_STORAGE") != -1) {
            androidx.core.app.b.r(activity, f22640b1, 1);
        }
    }

    private void Q1(Purchase purchase) {
        if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
            Log.d("TAG_INAPP", "handleConsumablePurchasesAsync foreach it is " + purchase.toString());
        }
        this.f22644c0.b(k1.d.b().b(purchase.c()).a(), new i());
    }

    public static void Q2(Activity activity) {
        int iA = androidx.core.content.a.a(activity, "android.permission.WRITE_EXTERNAL_STORAGE");
        System.out.println("?!" + iA);
        System.out.println("?!!0");
        androidx.core.app.b.r(activity, f22641c1, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R1(String str) {
        try {
            startActivity(Intent.parseUri(str, 1));
        } catch (Exception e5) {
            e5.printStackTrace();
            Boolean bool = com.webviewgold.myappname.d.f22733a;
            if (bool.booleanValue()) {
                Log.d(">>>>>>>>>>>", "No app to handle intent URL");
            }
            if (str.contains("browser_fallback_url=")) {
                try {
                    String strSubstring = str.substring(str.indexOf("browser_fallback_url=") + 21);
                    String strSubstring2 = strSubstring.substring(0, strSubstring.indexOf(";"));
                    if (URLUtil.isValidUrl(strSubstring2)) {
                        if (bool.booleanValue()) {
                            Log.d(">>>>>>>>>>>", "Fallback URL found, loading in external browser");
                        }
                        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strSubstring2)));
                    }
                } catch (Exception unused) {
                    if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                        Log.d(">>>>>>>>>>>", "Fallback URL failed");
                    }
                }
            }
        }
    }

    private void R2(String str, Tag tag) throws IOException, FormatException {
        S2(tag, new NdefMessage(new NdefRecord[]{E1(str)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T1(String str) {
        boolean z10 = false;
        boolean z11 = str != null && str.contains("mfitpersonal.com.br");
        if (str != null && str.contains("mfitpersonal.com.br/p/")) {
            str = str.replace("www", "pages");
        } else {
            z10 = z11;
        }
        if (URLUtil.isValidUrl(str)) {
            String strZ2 = z2(str);
            if (z10) {
                this.O.loadUrl(strZ2);
            } else {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strZ2)));
            }
        }
    }

    public static boolean U1(Context context, String... strArr) {
        if (context == null || strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (androidx.core.content.a.a(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    private void V1() {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this);
        this.f22663v0 = defaultAdapter;
        if (defaultAdapter == null) {
            Toast.makeText(this, "This device doesn't support NFC.", 1).show();
            finish();
            return;
        }
        w2(getIntent());
        this.f22664w0 = PendingIntent.getActivity(this, 0, new Intent(this, getClass()).addFlags(536870912), 33554432);
        IntentFilter intentFilter = new IntentFilter("android.nfc.action.TAG_DISCOVERED");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        this.f22665x0 = new IntentFilter[]{intentFilter};
    }

    private boolean W1() {
        return true;
    }

    private boolean Y1(u uVar) {
        return (uVar == u.SUCCESS || uVar == u.ERROR) ? Build.VERSION.SDK_INT >= 30 : (uVar == u.LIGHT || uVar == u.HEAVY) && Build.VERSION.SDK_INT >= 26;
    }

    public static boolean Z1() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        try {
            if (new File("/system/app/Superuser.apk").exists()) {
                return true;
            }
        } catch (Exception unused) {
        }
        return !x1("su") && L1("su");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a2(com.android.billingclient.api.d dVar, List list) {
        if (dVar.b() != 0 || list == null || list.isEmpty()) {
            if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                Log.d(">>>>>>>>>>>", "Purchase item error : " + dVar.a());
            }
            Toast.makeText(this, "Unable to get any package!", 0).show();
            return;
        }
        Boolean bool = com.webviewgold.myappname.d.f22733a;
        if (bool.booleanValue()) {
            Log.d(">>>>>>>>>>>", "Purchase item 111");
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            SkuDetails skuDetails = (SkuDetails) it.next();
            if (bool.booleanValue()) {
                Log.d(">>>>>>>>>>>", "Purchase item : " + skuDetails.a());
            }
            skuDetails.a();
            u2(skuDetails);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b2(Boolean bool) {
        if (bool.booleanValue()) {
            K1();
        } else {
            if (this.f22662u0) {
                return;
            }
            this.f22662u0 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c2(com.android.billingclient.api.d dVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d2(b1 b1Var) {
        b1Var.b();
        this.O.loadUrl(b1Var.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e2(String str, String str2, String str3, String str4, long j10) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f2(String str, GeolocationPermissions.Callback callback, String[] strArr, DialogInterface dialogInterface, int i10) {
        this.R0 = str;
        this.S0 = callback;
        androidx.core.app.b.r(this, strArr, 5454);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g2(DialogInterface dialogInterface, int i10) {
        F2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h2(DialogInterface dialogInterface, int i10) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i2(NotificationManager notificationManager, Notification notification) {
        notificationManager.notify(0, notification);
        this.P0 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j2(String str) {
        this.O.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k2() {
        String str;
        if (!X1()) {
            System.out.println("loadMainUrl no connection");
            return;
        }
        this.U.setVisibility(8);
        String str2 = this.f22643b0;
        if (str2 != null && !str2.isEmpty()) {
            if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                Log.d(">>>>>>>>>>>", " deepLinkingURL " + this.f22643b0);
            }
            if (this.f22657p0 && URLUtil.isValidUrl(this.f22643b0)) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.f22643b0)));
                this.f22643b0 = null;
            } else {
                if (URLUtil.isValidUrl(this.f22643b0)) {
                    this.O.loadUrl(this.f22643b0);
                    return;
                }
                Toast.makeText(this, "URL is not valid", 0).show();
            }
        }
        String str3 = com.webviewgold.myappname.e.f22734a;
        String upperCase = Locale.getDefault().getLanguage().toUpperCase();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3.contains("?") ? "&" : "?");
        sb2.append("webview_language=");
        sb2.append(upperCase);
        String str4 = com.webviewgold.myappname.e.f22734a + sb2.toString();
        String strA = e3.a0().a();
        if (TextUtils.isEmpty(strA)) {
            str = "";
        } else {
            Object[] objArr = new Object[2];
            objArr[0] = str4.contains("?") ? "&" : "?";
            objArr[1] = strA;
            str = String.format("%sonesignal_push_id=%s", objArr);
        }
        String str5 = (str4 + str) + "";
        String str6 = str5 + ((str5.contains("?") || str.contains("?")) ? String.format("%suuid=%s", "&", this.f22659r0) : String.format("%suuid=%s", "?", this.f22659r0));
        if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
            Log.d(">>>>>>>>>>>", " HOME_URL " + str6);
        }
        this.O.loadUrl(str6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l0(String str) {
        String host = Uri.parse(str).getHost();
        this.f22650i0 = host;
        return (host.contains("mfitpersonal.com.br") || str.startsWith("mfitpersonal.com.br")) ? false : true;
    }

    private void l2(String str) {
        this.O.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m2(Context context, long j10) {
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(j10);
        Cursor cursorQuery = downloadManager.query(query);
        if (cursorQuery.moveToFirst()) {
            int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("local_uri"));
            String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("media_type"));
            if (i10 == 8 && string != null) {
                if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                    Log.d("texts", "Download done");
                }
                Toast.makeText(context, "Saved to SD card", 1).show();
                n2(context, Uri.parse(string), string2);
            }
        }
        cursorQuery.close();
    }

    private void n2(Context context, Uri uri, String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o2(File file) {
        Uri uriF = androidx.core.content.b.f(this, getPackageName() + ".provider", file);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uriF);
        intent.addFlags(1);
        try {
            startActivity(Intent.createChooser(intent, "App"));
        } catch (ActivityNotFoundException e5) {
            Toast.makeText(this, getResources().getString(com.facebook.ads.R.string.download_noapp), 1).show();
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p2(String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    private void r2(String str) {
        new Thread(new h(str)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s2(u uVar) {
        Vibrator vibrator;
        if (!Y1(uVar)) {
            this.O.performHapticFeedback(1);
            return;
        }
        if (uVar == u.SUCCESS) {
            this.O.performHapticFeedback(16);
            return;
        }
        if (uVar == u.ERROR) {
            this.O.performHapticFeedback(17);
            return;
        }
        if (uVar == u.LIGHT) {
            Vibrator vibrator2 = (Vibrator) WebViewApp.f22720m.getSystemService("vibrator");
            if (vibrator2 == null || !vibrator2.hasVibrator()) {
                return;
            }
            vibrator2.vibrate(VibrationEffect.createPredefined(0));
            return;
        }
        if (uVar == u.HEAVY && (vibrator = (Vibrator) WebViewApp.f22720m.getSystemService("vibrator")) != null && vibrator.hasVibrator()) {
            vibrator.vibrate(VibrationEffect.createPredefined(5));
        }
    }

    private List t2() {
        ArrayList arrayList = new ArrayList();
        if (com.webviewgold.myappname.e.f22758y) {
            arrayList.add("android.permission.CAMERA");
        }
        if (com.webviewgold.myappname.e.f22757x && Build.VERSION.SDK_INT < 33) {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (com.webviewgold.myappname.e.f22759z) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (Build.VERSION.SDK_INT >= 33) {
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        return arrayList;
    }

    private void u2(SkuDetails skuDetails) {
        this.f22644c0.d(this, com.android.billingclient.api.c.a().b(skuDetails).a());
    }

    private String v1(String str) {
        return str + "?CSP_HEADER=" + Uri.encode("default-src 'self'; script-src 'self' 'unsafe-inline'; object-src 'none'; style-src 'self' 'unsafe-inline'; img-src 'self'; media-src 'self'; frame-src 'none'; font-src 'self'; connect-src 'self';");
    }

    private void v2(NdefMessage[] ndefMessageArr) {
        String str;
        if (ndefMessageArr == null || ndefMessageArr.length == 0) {
            return;
        }
        String str2 = "";
        byte[] payload = ndefMessageArr[0].getRecords()[0].getPayload();
        try {
            str = new String(payload, (payload[0] & 51) + 1, (payload.length - r1) - 1, (payload[0] & 128) == 0 ? "UTF-8" : "UTF-16");
        } catch (UnsupportedEncodingException e5) {
            e = e5;
        }
        try {
            this.O.loadUrl("javascript: readNFCResult('" + str + "');");
        } catch (UnsupportedEncodingException e10) {
            e = e10;
            str2 = str;
            if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                Log.d("UnsupportedEncoding", e.toString());
            }
            str = str2;
            TextView textView = new TextView(this);
            textView.setPadding(16, 16, 16, 16);
            textView.setTextColor(-16776961);
            textView.setText("read : " + str);
        }
        TextView textView2 = new TextView(this);
        textView2.setPadding(16, 16, 16, 16);
        textView2.setTextColor(-16776961);
        textView2.setText("read : " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w1() {
        List listT2 = t2();
        if (listT2.isEmpty()) {
            return;
        }
        requestPermissions((String[]) listT2.toArray(new String[listT2.size()]), 10);
    }

    private void w2(Intent intent) {
        String action = intent.getAction();
        if ("android.nfc.action.TAG_DISCOVERED".equals(action) || "android.nfc.action.TECH_DISCOVERED".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action)) {
            Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES");
            NdefMessage[] ndefMessageArr = null;
            if (parcelableArrayExtra != null) {
                ndefMessageArr = new NdefMessage[parcelableArrayExtra.length];
                for (int i10 = 0; i10 < parcelableArrayExtra.length; i10++) {
                    ndefMessageArr[i10] = (NdefMessage) parcelableArrayExtra[i10];
                }
            }
            v2(ndefMessageArr);
        }
    }

    private static boolean x1(String str) throws IOException {
        try {
            Runtime.getRuntime().exec(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x2(final String str, final GeolocationPermissions.Callback callback) {
        if (com.webviewgold.myappname.e.f22756w) {
            this.R0 = null;
            this.S0 = null;
            if (androidx.core.content.a.a(this, "android.permission.ACCESS_FINE_LOCATION") == 0 && androidx.core.content.a.a(this, "android.permission.ACCESS_COARSE_LOCATION") == 0 && androidx.core.content.a.a(this, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                callback.invoke(str, true, false);
                return;
            }
            int i10 = Build.VERSION.SDK_INT;
            final String[] strArr = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
            boolean zS = androidx.core.app.b.s(this, "android.permission.ACCESS_FINE_LOCATION");
            boolean zS2 = androidx.core.app.b.s(this, "android.permission.ACCESS_COARSE_LOCATION");
            Log.e(">>>>>>>>>>>", "requestLocationPermission: " + zS + " : " + zS2 + " : false");
            if (zS || zS2) {
                new b.a(this).h(getString(com.facebook.ads.R.string.requires_location_permission)).k(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.webviewgold.myappname.h
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        this.f22762m.f2(str, callback, strArr, dialogInterface, i11);
                    }
                }).u();
                return;
            }
            this.R0 = str;
            this.S0 = callback;
            androidx.core.app.b.r(this, strArr, 5454);
        }
    }

    private void y1() {
        SplashScreen splashScreenD0 = SplashScreen.d0();
        boolean z10 = splashScreenD0 != null && splashScreenD0.isFinishing();
        Log.e(">>>>>>>>>>>", "isSplashFinished: " + z10);
        if (z10 && V0) {
            boolean booleanExtra = getIntent().getBooleanExtra(T0, false);
            Log.e(">>>>>>>>>>>", "shouldSkipBiometric: " + booleanExtra);
            if (!booleanExtra) {
                F2();
            } else {
                getIntent().putExtra(T0, false);
                getIntent().removeExtra(T0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y2() {
        androidx.appcompat.app.b bVarA = new b.a(this).s(getString(com.facebook.ads.R.string.app_name)).h(getString(com.facebook.ads.R.string.require_biometric_unlock, new Object[]{getString(com.facebook.ads.R.string.app_name)})).o(com.facebook.ads.R.string.authorize, new DialogInterface.OnClickListener() { // from class: com.webviewgold.myappname.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f22760m.g2(dialogInterface, i10);
            }
        }).i(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.webviewgold.myappname.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f22761m.h2(dialogInterface, i10);
            }
        }).a();
        this.N0 = bVarA;
        bVarA.show();
    }

    private void z1() {
        this.Q0.schedule(new f(), 0L, 5000L);
    }

    private String z2(String str) {
        return v1(str.replaceAll("[^-%=&|?_.a-zA-Z\\d/:]", ""));
    }

    public void A1(f.a aVar) {
        this.f22644c0.g(aVar.a(), new k1.h() { // from class: com.webviewgold.myappname.n
            @Override // k1.h
            public final void a(com.android.billingclient.api.d dVar, List list) {
                this.f22773a.a2(dVar, list);
            }
        });
    }

    protected boolean B1() {
        Dialog dialogN;
        int iG = b4.h.g(this);
        if (iG == 0) {
            return true;
        }
        if (!b4.h.k(iG) || (dialogN = b4.h.n(iG, this, AdError.NO_FILL_ERROR_CODE)) == null) {
            Toast.makeText(this, "See https://tinyurl.com/iap-fix | In-App Purchase failed.", 0).show();
            return false;
        }
        dialogN.show();
        dialogN.setOnDismissListener(new g(iG));
        return false;
    }

    public void ClosePopupWindow(View view) {
        this.f22642a0.setVisibility(8);
        SharedPreferences preferences = getPreferences(0);
        this.Q = preferences;
        preferences.edit().putString("proshow", "noshow").apply();
        this.S.removeAllViews();
        this.T.setVisibility(8);
        this.P.destroy();
    }

    boolean E2(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = com.webviewgold.myappname.e.f22737d;
            if (i10 >= strArr.length) {
                return false;
            }
            if (strArr[i10] != "" && str.startsWith(strArr[i10])) {
                return true;
            }
            i10++;
        }
    }

    public void S1(Purchase purchase) {
        if (purchase.b() == 1) {
            Toast.makeText(this, "Purchased :)", 0).show();
            if (this.f22651j0) {
                com.webviewgold.myappname.a.e(getApplicationContext(), true);
                this.V.setVisibility(8);
                this.V.a();
                this.f22655n0.removeAllViews();
                this.f22655n0.setVisibility(8);
                SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(this).edit();
                editorEdit.putString("disableAdMobDone", "removed");
                editorEdit.commit();
            }
            this.O.loadUrl(this.f22653l0);
            this.f22653l0 = "";
            if (purchase.e()) {
                return;
            }
            this.f22644c0.a(k1.a.b().b(purchase.c()).a(), this.O0);
        }
    }

    public void S2(Tag tag, NdefMessage ndefMessage) throws IOException, FormatException {
        if (tag != null) {
            try {
                Ndef ndef = Ndef.get(tag);
                if (ndef == null) {
                    NdefFormatable ndefFormatable = NdefFormatable.get(tag);
                    if (ndefFormatable == null) {
                        return;
                    }
                    ndefFormatable.connect();
                    ndefFormatable.format(ndefMessage);
                    ndefFormatable.close();
                } else {
                    ndef.connect();
                    ndef.writeNdefMessage(ndefMessage);
                    ndef.close();
                }
                K2("Text written to the NFC tag successfully!");
            } catch (Exception e5) {
                e5.printStackTrace();
                K2("write error : " + e5.getMessage());
            }
        }
    }

    public boolean X1() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    @Override // k1.g
    public void e(com.android.billingclient.api.d dVar, List list) throws JSONException {
        if (dVar.b() == 0 && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                try {
                    new JSONObject(purchase.a()).getString("productId");
                    if (this.f22652k0) {
                        Q1(purchase);
                    } else {
                        S1(purchase);
                    }
                } catch (JSONException e5) {
                    throw new RuntimeException(e5);
                }
            }
            return;
        }
        if (dVar.b() != 7) {
            if (dVar.b() != 1) {
                Toast.makeText(this, "Something went wrong :(", 0).show();
                return;
            }
            String str = this.f22654m0;
            if (str == null || str.length() <= 0) {
                return;
            }
            this.O.loadUrl(this.f22654m0);
            return;
        }
        Toast.makeText(this, "Purchased :)", 0).show();
        if (this.f22651j0) {
            com.webviewgold.myappname.a.e(getApplicationContext(), true);
            this.V.setVisibility(8);
            this.V.a();
            this.f22655n0.removeAllViews();
            this.f22655n0.setVisibility(8);
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(this).edit();
            editorEdit.putString("disableAdMobDone", "removed");
            editorEdit.commit();
        }
        this.O.loadUrl(this.f22653l0);
        this.f22653l0 = "";
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        String stringExtra;
        Uri[] uriArr;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 100) {
            ValueCallback valueCallback = this.M0;
            if (valueCallback == null) {
                return;
            }
            valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i11, intent));
            this.M0 = null;
        }
        if (i10 == 1) {
            if (i11 != -1) {
                if (this.f22647f0 != null) {
                    new File(Uri.parse(this.f22647f0).getPath()).delete();
                }
                if (this.f22648g0 != null) {
                    new File(Uri.parse(this.f22648g0).getPath()).delete();
                }
            } else {
                if (this.f22649h0 == null) {
                    return;
                }
                if (intent == null || intent.getData() == null) {
                    if (intent == null || intent.getClipData() == null) {
                        uriArr = null;
                    } else {
                        int itemCount = intent.getClipData().getItemCount();
                        uriArr = new Uri[intent.getClipData().getItemCount()];
                        for (int i12 = 0; i12 < itemCount; i12++) {
                            uriArr[i12] = intent.getClipData().getItemAt(i12).getUri();
                        }
                    }
                    if (this.f22647f0 != null) {
                        File file = new File(Uri.parse(this.f22647f0).getPath());
                        if (file.length() > 0) {
                            uriArr = new Uri[]{Uri.parse(this.f22647f0)};
                        } else {
                            file.delete();
                        }
                    }
                    if (this.f22648g0 != null) {
                        File file2 = new File(Uri.parse(this.f22648g0).getPath());
                        if (file2.length() > 0) {
                            uriArr = new Uri[]{Uri.parse(this.f22648g0)};
                        } else {
                            file2.delete();
                        }
                    }
                } else {
                    String dataString = intent.getDataString();
                    if (dataString != null) {
                        uriArr = new Uri[]{Uri.parse(dataString)};
                    } else if (intent.getClipData() != null) {
                        int itemCount2 = intent.getClipData().getItemCount();
                        uriArr = new Uri[itemCount2];
                        for (int i13 = 0; i13 < itemCount2; i13++) {
                            uriArr[i13] = intent.getClipData().getItemAt(i13).getUri();
                        }
                    }
                }
                this.f22649h0.onReceiveValue(uriArr);
            }
            uriArr = null;
            this.f22649h0.onReceiveValue(uriArr);
        } else {
            if (i10 != 5678) {
                if (i10 == 1234 && i11 == -1 && intent != null && (stringExtra = intent.getStringExtra("com.blikoon.qrcodescanner.got_qr_scan_relult")) != null && URLUtil.isValidUrl(stringExtra)) {
                    l2(stringExtra);
                    return;
                }
                return;
            }
            this.f22649h0.onReceiveValue((i11 != -1 || intent == null || intent.getData() == null) ? null : new Uri[]{intent.getData()});
        }
        this.f22649h0 = null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.T.getVisibility() == 0) {
            ClosePopupWindow(this.P);
        } else if (!this.O.canGoBack() || this.N) {
            super.onBackPressed();
        } else {
            this.O.goBack();
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        View decorView;
        int i10;
        super.onConfigurationChanged(configuration);
        if (Settings.System.getInt(getContentResolver(), "accelerometer_rotation", 0) == 1) {
            int i11 = configuration.orientation;
            if (i11 == 2) {
                if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                    Log.d(">>>>>>>>>>>", "Landscape Mode");
                }
                if (Build.VERSION.SDK_INT > 33) {
                    getWindow().getAttributes().layoutInDisplayCutoutMode = 3;
                    return;
                }
                return;
            }
            if (Build.VERSION.SDK_INT > 33) {
                decorView = getWindow().getDecorView();
                i10 = 3328;
            } else {
                if (i11 != 1) {
                    return;
                }
                if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                    Log.d(">>>>>>>>>>>", "Portrait Mode");
                }
                getWindow().clearFlags(1024);
                decorView = getWindow().getDecorView();
                i10 = 16;
            }
            decorView.setSystemUiVisibility(i10);
        }
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        String title;
        String string;
        W0 = this;
        this.f22659r0 = Settings.System.getString(super.getContentResolver(), "android_id");
        this.Q = PreferenceManager.getDefaultSharedPreferences(this);
        this.R = PreferenceManager.getDefaultSharedPreferences(this);
        this.G0 = false;
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("disableAdMobDone", "default") == "removed") {
            this.f22651j0 = true;
        }
        if (Z1() && com.webviewgold.myappname.e.f22744k) {
            I2();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (com.webviewgold.myappname.e.f22739f) {
            getWindow().getDecorView().setSystemUiVisibility(8192);
        }
        getWindow().addFlags(128);
        super.onCreate(bundle);
        if (i10 >= 28) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 3;
        }
        setContentView(com.facebook.ads.R.layout.activity_main);
        P2(this);
        O2(this);
        if (this.f22667z0) {
            if (androidx.core.content.a.a(this, "android.permission.NFC") != 0) {
                androidx.core.app.b.r(this, new String[]{"android.permission.NFC"}, 9541);
            } else {
                V1();
            }
        }
        this.f22655n0 = (FrameLayout) findViewById(com.facebook.ads.R.id.ad_layout);
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        com.android.billingclient.api.a aVarA = com.android.billingclient.api.a.e(this).d(this).b().a();
        this.f22644c0 = aVarA;
        aVarA.h(new e());
        Intent intent = getIntent();
        if (intent != null && intent.getData() != null && (intent.getData().getScheme().equals("http") || intent.getData().getScheme().equals("https"))) {
            Uri data = intent.getData();
            String str = data.getScheme() + "://" + data.getHost() + data.getPath();
            String query = data.getQuery();
            if (query != null && !query.isEmpty()) {
                str = str + "?" + query;
            }
            this.f22643b0 = str;
        }
        e eVar = null;
        if (intent != null) {
            Bundle extras = getIntent().getExtras();
            String string2 = extras != null ? extras.getString("ONESIGNAL_URL") : null;
            if (string2 == null || string2.equalsIgnoreCase("")) {
                this.f22657p0 = false;
            } else {
                this.f22657p0 = true;
                this.f22643b0 = string2;
            }
        }
        e3.z(this);
        e3.H1(new e3.b0() { // from class: com.webviewgold.myappname.k
            @Override // com.onesignal.e3.b0
            public final void a(b1 b1Var) {
                this.f22768a.d2(b1Var);
            }
        });
        e3.L1(new l());
        if (bundle == null) {
            com.webviewgold.myappname.a.a(this);
        }
        this.V = (AdView) findViewById(com.facebook.ads.R.id.adView);
        if (com.webviewgold.myappname.e.f22749p) {
            if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                Log.d(">>>>>>>>>>>", "attempting to create ad");
            }
            this.W = new com.facebook.ads.AdView(this, getString(com.facebook.ads.R.string.facebook_banner_footer), AdSize.BANNER_HEIGHT_50);
        }
        new f.a().c();
        Boolean bool = com.webviewgold.myappname.d.f22733a;
        if (bool.booleanValue()) {
            r2("c2d048a3-99dc-406e-9322-4a5e7b69fc76");
        }
        this.V.setVisibility(8);
        this.f22655n0.setVisibility(8);
        if (!U0 && com.webviewgold.myappname.e.f22749p) {
            this.Y = new InterstitialAd(this, getString(com.facebook.ads.R.string.facebook_interstitial_full_screen));
            m mVar = new m();
            InterstitialAd interstitialAd = this.Y;
            interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(mVar).build());
        }
        this.O = (CustomWebView) findViewById(com.facebook.ads.R.id.webView);
        this.S = (RelativeLayout) findViewById(com.facebook.ads.R.id.web_container);
        this.T = (RelativeLayout) findViewById(com.facebook.ads.R.id.window_container);
        this.O.setLayerType(2, null);
        this.O.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.O.setGestureDetector(new GestureDetector(new t(this, eVar)));
        if (bool.booleanValue()) {
            WebView.setWebContentsDebuggingEnabled(true);
            WebView.setWebContentsDebuggingEnabled(true);
        } else {
            WebView.setWebContentsDebuggingEnabled(false);
            WebView.setWebContentsDebuggingEnabled(false);
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(com.facebook.ads.R.id.swipeContainer);
        this.Z = swipeRefreshLayout;
        swipeRefreshLayout.setEnabled(false);
        this.Z.setOnRefreshListener(new n());
        this.U = findViewById(com.facebook.ads.R.id.offline_layout);
        D2();
        findViewById(R.id.content).setBackgroundColor(getResources().getColor(com.facebook.ads.R.color.launchLoadingSignBackground));
        ProgressBar progressBar = (ProgressBar) findViewById(com.facebook.ads.R.id.progressBar);
        this.f22642a0 = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(getResources().getColor(com.facebook.ads.R.color.colorAccent), PorterDuff.Mode.MULTIPLY);
        ((Button) findViewById(com.facebook.ads.R.id.try_again_button)).setOnClickListener(new o());
        this.O.setWebViewClient(new s(this, eVar));
        this.O.getSettings().setSupportMultipleWindows(true);
        this.O.getSettings().setUseWideViewPort(true);
        try {
            title = getApplicationInfo().loadLabel(getPackageManager()).toString();
        } catch (Exception unused) {
            title = this.O.getTitle();
        }
        this.O.setWebChromeClient(new p(title, this));
        this.O.setDownloadListener(new DownloadListener() { // from class: com.webviewgold.myappname.i
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str2, String str3, String str4, String str5, long j10) {
                this.f22766m.e2(str2, str3, str4, str5, j10);
            }
        });
        registerForContextMenu(this.O);
        WebSettings settings = this.O.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setGeolocationEnabled(true);
        settings.setSupportZoom(true);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            settings.setSafeBrowsingEnabled(true);
        }
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setCacheMode(-1);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.O, true);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setDatabaseEnabled(true);
        settings.setMixedContentMode(0);
        if (getResources().getConfiguration().fontScale * 100.0f > 100.0f) {
            this.O.getSettings().setTextZoom(100);
        }
        if (settings.getUserAgentString().contains("Mobile") && i11 == 26) {
            setRequestedOrientation(12);
        } else if (settings.getUserAgentString().contains("Mobile")) {
            setRequestedOrientation(1);
        } else {
            setRequestedOrientation(2);
        }
        if (X1()) {
            k2();
            Z0 = true;
        } else {
            j2("file:///android_asset/local-html/index.html");
        }
        new Handler(Looper.getMainLooper()).postDelayed(new q(), 1000L);
        if (!Z0) {
            z1();
        }
        if (getIntent().getExtras() == null || (string = getIntent().getExtras().getString("openURL")) == null) {
            return;
        }
        p2(string);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        WebView.HitTestResult hitTestResult = this.O.getHitTestResult();
        if (hitTestResult.getType() == 5 || hitTestResult.getType() == 8) {
            contextMenu.setHeaderTitle("Download images");
            contextMenu.add(0, 1, 0, "Download the image").setOnMenuItemClickListener(new a(hitTestResult));
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.e, android.app.Activity
    public void onDestroy() {
        this.O.destroy();
        AdView adView = this.V;
        if (adView != null) {
            adView.a();
        }
        com.facebook.ads.AdView adView2 = this.W;
        if (adView2 != null) {
            adView2.destroy();
        }
        if (this.X != null) {
            this.X = null;
        }
        InterstitialAd interstitialAd = this.Y;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        super.onDestroy();
        if (W1()) {
            new Timer().schedule(new d(), 50L);
        }
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        if (intent != null) {
            Bundle extras = intent.getExtras();
            String dataString = null;
            if (extras != null) {
                dataString = extras.getString("ONESIGNAL_URL");
                if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                    Log.d(">>>>>>>>>>>", "applinkURL [1]: From extras = " + dataString);
                }
            }
            if (intent.getDataString() != null) {
                dataString = intent.getDataString();
                if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                    Log.d(">>>>>>>>>>>", "applinkURL [1]: From intent data = " + dataString);
                }
            }
            if (dataString != null) {
                T1(dataString);
            } else if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                Log.d(">>>>>>>>>>>", "applinkURL [3]: No App Links URL found in intent");
            }
        }
        if (this.A0 || this.B0) {
            super.onNewIntent(intent);
            setIntent(intent);
            if (this.A0) {
                w2(intent);
            }
            if ("android.nfc.action.TAG_DISCOVERED".equals(intent.getAction())) {
                this.f22666y0 = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
                K2("tag detected : " + this.f22666y0.toString());
                try {
                    if (this.B0) {
                        R2(this.C0, this.f22666y0);
                    }
                } catch (FormatException | IOException e5) {
                    e5.printStackTrace();
                    Toast.makeText(this, "Error during writing, is the NFC tag close enough to your device?", 1).show();
                }
            }
        }
    }

    public void onOSSubscriptionChanged(q2 q2Var) {
        if (q2Var.a().g() || !q2Var.b().g()) {
            return;
        }
        String strD = q2Var.b().d();
        if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
            Log.d(">>>>>>>>>>>", "userId: " + strD);
        }
        k2();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public void onPause() {
        androidx.appcompat.app.b bVar = this.N0;
        if (bVar != null) {
            bVar.dismiss();
        }
        AdView adView = this.V;
        if (adView != null) {
            adView.c();
        }
        Y0 = true;
        X0 = Calendar.getInstance().getTimeInMillis();
        super.onPause();
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        String str;
        String str2;
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 9541 && this.f22667z0) {
            V1();
        }
        boolean z10 = true;
        int i11 = 0;
        if (i10 == 5454) {
            if (iArr[0] == 0) {
                GeolocationPermissions.Callback callback = this.S0;
                if (callback != null) {
                    callback.invoke(this.R0, true, false);
                }
                if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                    str2 = "Location permission granted";
                    Log.d(">>>>>>>>>>>", str2);
                }
            } else {
                GeolocationPermissions.Callback callback2 = this.S0;
                if (callback2 != null) {
                    callback2.invoke(this.R0, false, false);
                }
                if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                    str2 = "Location permission denied";
                    Log.d(">>>>>>>>>>>", str2);
                }
            }
        }
        if (i10 == 2) {
            if (iArr[0] != 0) {
                boolean zS = androidx.core.app.b.s(this, "android.permission.CAMERA");
                Boolean bool = com.webviewgold.myappname.d.f22733a;
                if (bool.booleanValue()) {
                    Log.d(">>>>>>>>>>>", "Camera permission denied - Rationale: " + zS);
                }
                if (!zS) {
                    H2("android.permission.CAMERA");
                }
                if (bool.booleanValue()) {
                    str = "Camera permission denied";
                    Log.d(">>>>>>>>>>>", str);
                }
            } else if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                str = "Camera permission granted";
                Log.d(">>>>>>>>>>>", str);
            }
        }
        if (i10 == 1402) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(this, "Camera permission is required for scanning QR Code", 0).show();
            } else {
                startActivityForResult(new Intent(this, (Class<?>) QrCodeActivity.class), 1234);
            }
        }
        if (i10 != 1) {
            if (i10 != 10) {
                return;
            }
            if (!U1(this, strArr)) {
                boolean z11 = checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1 && !androidx.core.app.b.s(this, "android.permission.WRITE_EXTERNAL_STORAGE");
                boolean z12 = checkSelfPermission("android.permission.CAMERA") == -1 && !androidx.core.app.b.s(this, "android.permission.CAMERA");
                boolean z13 = (checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == -1 || checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == -1) && !(androidx.core.app.b.s(this, "android.permission.ACCESS_FINE_LOCATION") && androidx.core.app.b.s(this, "android.permission.ACCESS_COARSE_LOCATION"));
                if (z11 && Build.VERSION.SDK_INT < 33) {
                    H2("android.permission.WRITE_EXTERNAL_STORAGE");
                } else if (z12) {
                    H2("android.permission.CAMERA");
                } else if (z13) {
                    H2("android.permission.ACCESS_COARSE_LOCATION");
                }
            }
        }
        int i12 = 0;
        while (true) {
            if (i12 >= strArr.length) {
                z10 = false;
                break;
            } else {
                if (strArr[i12].equalsIgnoreCase("android.permission.POST_NOTIFICATIONS")) {
                    i11 = i12;
                    break;
                }
                i12++;
            }
        }
        if (z10) {
            int i13 = iArr[i11];
        }
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.O.restoreState(bundle);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public void onResume() {
        super.onResume();
        y1();
        Y0 = false;
        X0 = Calendar.getInstance().getTimeInMillis();
        e3.K1(e3.z.VERBOSE, e3.z.NONE);
        e3.Q0(this);
        e3.G1("4bdecf5c-de10-4162-b274-09a381f6f646");
        AdView adView = this.V;
        if (adView == null || U0) {
            return;
        }
        adView.d();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.O.saveState(bundle);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.e, android.app.Activity
    public void onStop() {
        if (this.H0) {
            if (com.webviewgold.myappname.d.f22733a.booleanValue()) {
                Log.d(">>>>>>>>>>>", "Cookies sync cancelled");
            }
            this.E0.removeCallbacks(this.F0);
            this.G0 = false;
        }
        super.onStop();
    }

    void q2(String str) {
        d.a aVar = new d.a();
        aVar.d(getResources().getColor(com.facebook.ads.R.color.colorPrimaryDark));
        n.d dVarA = aVar.a();
        String cookie = CookieManager.getInstance().getCookie(str);
        if (cookie != null) {
            for (String str2 : cookie.split(";")) {
                dVarA.f25427a.putExtra("android.webkit.CookieManager.COOKIE", str2.trim());
            }
        }
        dVarA.a(this, Uri.parse(str));
        this.O.stopLoading();
    }
}
