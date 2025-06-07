package com.onesignal;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.onesignal.a;
import com.onesignal.c0;
import com.onesignal.e3;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class q4 extends a.b {

    /* renamed from: k, reason: collision with root package name */
    private static final String f22265k = "com.onesignal.q4";

    /* renamed from: l, reason: collision with root package name */
    private static final int f22266l = b3.b(24);

    /* renamed from: m, reason: collision with root package name */
    protected static q4 f22267m = null;

    /* renamed from: b, reason: collision with root package name */
    private c3 f22269b;

    /* renamed from: c, reason: collision with root package name */
    private c0 f22270c;

    /* renamed from: d, reason: collision with root package name */
    private Activity f22271d;

    /* renamed from: e, reason: collision with root package name */
    private f1 f22272e;

    /* renamed from: f, reason: collision with root package name */
    private c1 f22273f;

    /* renamed from: a, reason: collision with root package name */
    private final Object f22268a = new b();

    /* renamed from: g, reason: collision with root package name */
    private String f22274g = null;

    /* renamed from: h, reason: collision with root package name */
    private Integer f22275h = null;

    /* renamed from: i, reason: collision with root package name */
    private boolean f22276i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f22277j = false;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22278a;

        static {
            int[] iArr = new int[m.values().length];
            f22278a = iArr;
            try {
                iArr[m.TOP_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22278a[m.BOTTOM_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    class b {
        b() {
        }
    }

    class c implements l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f22280a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f1 f22281b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c1 f22282c;

        c(Activity activity, f1 f1Var, c1 c1Var) {
            this.f22280a = activity;
            this.f22281b = f1Var;
            this.f22282c = c1Var;
        }

        @Override // com.onesignal.q4.l
        public void a() {
            q4.f22267m = null;
            q4.B(this.f22280a, this.f22281b, this.f22282c);
        }
    }

    class d implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ f1 f22283m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ c1 f22284n;

        d(f1 f1Var, c1 c1Var) {
            this.f22283m = f1Var;
            this.f22284n = c1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            q4.I(this.f22283m, this.f22284n);
        }
    }

    class e implements Runnable {

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Activity f22286n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f22287o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ c1 f22288p;

        e(Activity activity, String str, c1 c1Var) {
            this.f22286n = activity;
            this.f22287o = str;
            this.f22288p = c1Var;
        }

        @Override // java.lang.Runnable
        public void run() throws Exception {
            try {
                q4.this.H(this.f22286n, this.f22287o, this.f22288p.g());
            } catch (Exception e5) {
                if (e5.getMessage() == null || !e5.getMessage().contains("No WebView installed")) {
                    throw e5;
                }
                e3.b(e3.z.ERROR, "Error setting up WebView: ", e5);
            }
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArrC = b3.c(q4.this.f22271d);
            q4.this.f22269b.evaluateJavascript(String.format("setSafeAreaInsets(%s)", String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", Integer.valueOf(iArrC[0]), Integer.valueOf(iArrC[1]), Integer.valueOf(iArrC[2]), Integer.valueOf(iArrC[3]))), null);
        }
    }

    class g implements Runnable {

        class a implements ValueCallback {
            a() {
            }

            @Override // android.webkit.ValueCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
                try {
                    q4 q4Var = q4.this;
                    q4.this.J(Integer.valueOf(q4Var.C(q4Var.f22271d, new JSONObject(str))));
                } catch (JSONException e5) {
                    e5.printStackTrace();
                }
            }
        }

        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q4 q4Var = q4.this;
            q4Var.G(q4Var.f22271d);
            if (q4.this.f22273f.g()) {
                q4.this.K();
            }
            q4.this.f22269b.evaluateJavascript("getPageMetaData()", new a());
        }
    }

    class h implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Activity f22292m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f22293n;

        h(Activity activity, String str) {
            this.f22292m = activity;
            this.f22293n = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            q4.this.G(this.f22292m);
            q4.this.f22269b.loadData(this.f22293n, "text/html; charset=utf-8", "base64");
        }
    }

    class i implements c0.j {
        i() {
        }

        @Override // com.onesignal.c0.j
        public void a() {
            e3.g0().a0(q4.this.f22272e);
            q4.this.D();
        }

        @Override // com.onesignal.c0.j
        public void b() {
            e3.g0().h0(q4.this.f22272e);
        }

        @Override // com.onesignal.c0.j
        public void c() {
            e3.g0().g0(q4.this.f22272e);
        }
    }

    class j implements l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f22296a;

        j(l lVar) {
            this.f22296a = lVar;
        }

        @Override // com.onesignal.q4.l
        public void a() {
            q4.this.f22276i = false;
            q4.this.F(null);
            l lVar = this.f22296a;
            if (lVar != null) {
                lVar.a();
            }
        }
    }

    class k {
        k() {
        }

        private m a(JSONObject jSONObject) {
            m mVar = m.FULL_SCREEN;
            try {
                return (!jSONObject.has("displayLocation") || jSONObject.get("displayLocation").equals("")) ? mVar : m.valueOf(jSONObject.optString("displayLocation", "FULL_SCREEN").toUpperCase());
            } catch (JSONException e5) {
                e5.printStackTrace();
                return mVar;
            }
        }

        private boolean b(JSONObject jSONObject) {
            try {
                return jSONObject.getBoolean("dragToDismissDisabled");
            } catch (JSONException unused) {
                return false;
            }
        }

        private int c(JSONObject jSONObject) {
            try {
                q4 q4Var = q4.this;
                return q4Var.C(q4Var.f22271d, jSONObject.getJSONObject("pageMetaData"));
            } catch (JSONException unused) {
                return -1;
            }
        }

        private void d(JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            String strOptString = jSONObject2.optString("id", null);
            q4.this.f22277j = jSONObject2.getBoolean("close");
            if (q4.this.f22272e.f22004k) {
                e3.g0().d0(q4.this.f22272e, jSONObject2);
            } else if (strOptString != null) {
                e3.g0().c0(q4.this.f22272e, jSONObject2);
            }
            if (q4.this.f22277j) {
                q4.this.w(null);
            }
        }

        private void e(JSONObject jSONObject) {
            e3.g0().j0(q4.this.f22272e, jSONObject);
        }

        private void f(JSONObject jSONObject) {
            m mVarA = a(jSONObject);
            int iC = mVarA == m.FULL_SCREEN ? -1 : c(jSONObject);
            boolean zB = b(jSONObject);
            q4.this.f22273f.i(mVarA);
            q4.this.f22273f.j(iC);
            q4.this.v(zB);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JavascriptInterface
        public void postMessage(String str) throws JSONException {
            try {
                e3.i1(e3.z.DEBUG, "OSJavaScriptInterface:postMessage: " + str);
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("type");
                char c10 = 65535;
                switch (string.hashCode()) {
                    case -1484226720:
                        if (string.equals("page_change")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case -934437708:
                        if (string.equals("resize")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 42998156:
                        if (string.equals("rendering_complete")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 1851145598:
                        if (string.equals("action_taken")) {
                            c10 = 1;
                            break;
                        }
                        break;
                }
                if (c10 == 0) {
                    f(jSONObject);
                    return;
                }
                if (c10 != 1) {
                    if (c10 != 3) {
                        return;
                    }
                    e(jSONObject);
                } else {
                    if (q4.this.f22270c.O()) {
                        return;
                    }
                    d(jSONObject);
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
    }

    interface l {
        void a();
    }

    enum m {
        TOP_BANNER,
        BOTTOM_BANNER,
        CENTER_MODAL,
        FULL_SCREEN;

        boolean b() {
            int i10 = a.f22278a[ordinal()];
            return i10 == 1 || i10 == 2;
        }
    }

    protected q4(f1 f1Var, Activity activity, c1 c1Var) {
        this.f22272e = f1Var;
        this.f22271d = activity;
        this.f22273f = c1Var;
    }

    private int A(Activity activity) {
        return b3.e(activity) - (this.f22273f.g() ? 0 : f22266l * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void B(Activity activity, f1 f1Var, c1 c1Var) {
        if (c1Var.g()) {
            E(c1Var, activity);
        }
        try {
            String strEncodeToString = Base64.encodeToString(c1Var.a().getBytes("UTF-8"), 2);
            q4 q4Var = new q4(f1Var, activity, c1Var);
            f22267m = q4Var;
            OSUtils.S(q4Var.new e(activity, strEncodeToString, c1Var));
        } catch (UnsupportedEncodingException e5) {
            e3.b(e3.z.ERROR, "Catch on initInAppMessage: ", e5);
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int C(Activity activity, JSONObject jSONObject) {
        try {
            int iB = b3.b(jSONObject.getJSONObject("rect").getInt("height"));
            e3.z zVar = e3.z.DEBUG;
            e3.i1(zVar, "getPageHeightData:pxHeight: " + iB);
            int iA = A(activity);
            if (iB <= iA) {
                return iB;
            }
            e3.a(zVar, "getPageHeightData:pxHeight is over screen max: " + iA);
            return iA;
        } catch (JSONException e5) {
            e3.b(e3.z.ERROR, "pageRectToViewHeight could not get page height", e5);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        com.onesignal.a aVarB = com.onesignal.b.b();
        if (aVarB != null) {
            aVarB.r(f22265k + this.f22272e.f21691a);
        }
    }

    private static void E(c1 c1Var, Activity activity) {
        String strA = c1Var.a();
        int[] iArrC = b3.c(activity);
        c1Var.h(strA + String.format("\n\n<script>\n    setSafeAreaInsets(%s);\n</script>", String.format("{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}", Integer.valueOf(iArrC[0]), Integer.valueOf(iArrC[1]), Integer.valueOf(iArrC[2]), Integer.valueOf(iArrC[3]))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(c0 c0Var) {
        synchronized (this.f22268a) {
            this.f22270c = c0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(Activity activity) {
        this.f22269b.layout(0, 0, z(activity), A(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(Activity activity, String str, boolean z10) {
        y();
        c3 c3Var = new c3(activity);
        this.f22269b = c3Var;
        c3Var.setOverScrollMode(2);
        this.f22269b.setVerticalScrollBarEnabled(false);
        this.f22269b.setHorizontalScrollBarEnabled(false);
        this.f22269b.getSettings().setJavaScriptEnabled(true);
        this.f22269b.addJavascriptInterface(new k(), "OSAndroid");
        if (z10) {
            this.f22269b.setSystemUiVisibility(3074);
            if (Build.VERSION.SDK_INT >= 30) {
                this.f22269b.setFitsSystemWindows(false);
            }
        }
        t(this.f22269b);
        b3.a(activity, new h(activity, str));
    }

    static void I(f1 f1Var, c1 c1Var) {
        Activity activityT = e3.T();
        e3.i1(e3.z.DEBUG, "in app message showMessageContent on currentActivity: " + activityT);
        if (activityT == null) {
            Looper.prepare();
            new Handler().postDelayed(new d(f1Var, c1Var), 200L);
            return;
        }
        q4 q4Var = f22267m;
        if (q4Var == null || !f1Var.f22004k) {
            B(activityT, f1Var, c1Var);
        } else {
            q4Var.w(new c(activityT, f1Var, c1Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(Integer num) {
        synchronized (this.f22268a) {
            if (this.f22270c == null) {
                e3.a(e3.z.WARN, "No messageView found to update a with a new height.");
                return;
            }
            e3.a(e3.z.DEBUG, "In app message, showing first one with height: " + num);
            this.f22270c.U(this.f22269b);
            if (num != null) {
                this.f22275h = num;
                this.f22270c.Z(num.intValue());
            }
            this.f22270c.X(this.f22271d);
            this.f22270c.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        OSUtils.S(new f());
    }

    private void t(WebView webView) {
    }

    private void u() {
        c0 c0Var = this.f22270c;
        if (c0Var == null) {
            return;
        }
        if (c0Var.M() == m.FULL_SCREEN && !this.f22273f.g()) {
            J(null);
        } else {
            e3.a(e3.z.DEBUG, "In app message new activity, calculate height and show ");
            b3.a(this.f22271d, new g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(boolean z10) {
        this.f22275h = Integer.valueOf(this.f22273f.d());
        F(new c0(this.f22269b, this.f22273f, z10));
        this.f22270c.R(new i());
        com.onesignal.a aVarB = com.onesignal.b.b();
        if (aVarB != null) {
            aVarB.c(f22265k + this.f22272e.f21691a, this);
        }
    }

    static void x() {
        e3.i1(e3.z.DEBUG, "WebViewManager IAM dismissAndAwaitNextMessage lastInstance: " + f22267m);
        q4 q4Var = f22267m;
        if (q4Var != null) {
            q4Var.w(null);
        }
    }

    private static void y() {
        if (e3.D(e3.z.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    private int z(Activity activity) {
        if (this.f22273f.g()) {
            return b3.d(activity);
        }
        return b3.h(activity) - (f22266l * 2);
    }

    @Override // com.onesignal.a.b
    void a(Activity activity) {
        Integer num;
        String str = this.f22274g;
        this.f22271d = activity;
        this.f22274g = activity.getLocalClassName();
        e3.a(e3.z.DEBUG, "In app message activity available currentActivityName: " + this.f22274g + " lastActivityName: " + str);
        if (str == null) {
            num = null;
        } else if (str.equals(this.f22274g)) {
            u();
            return;
        } else {
            if (this.f22277j) {
                return;
            }
            c0 c0Var = this.f22270c;
            if (c0Var != null) {
                c0Var.P();
            }
            num = this.f22275h;
        }
        J(num);
    }

    @Override // com.onesignal.a.b
    void b(Activity activity) {
        e3.a(e3.z.DEBUG, "In app message activity stopped, cleaning views, currentActivityName: " + this.f22274g + "\nactivity: " + this.f22271d + "\nmessageView: " + this.f22270c);
        if (this.f22270c == null || !activity.getLocalClassName().equals(this.f22274g)) {
            return;
        }
        this.f22270c.P();
    }

    protected void w(l lVar) {
        c0 c0Var = this.f22270c;
        if (c0Var == null || this.f22276i) {
            if (lVar != null) {
                lVar.a();
            }
        } else {
            if (this.f22272e != null && c0Var != null) {
                e3.g0().h0(this.f22272e);
            }
            this.f22270c.K(new j(lVar));
            this.f22276i = true;
        }
    }
}
