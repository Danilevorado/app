package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.AdError;
import com.onesignal.f0;
import com.onesignal.m2;
import com.onesignal.o3;
import com.onesignal.p3;
import com.onesignal.p4;
import com.onesignal.t1;
import com.onesignal.u3;
import com.onesignal.v1;
import com.onesignal.x3;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class e3 {
    private static com.onesignal.s A;
    private static n2 I;
    private static g7.e J;
    private static m2 K;
    private static f2 L;
    private static j7.c M;
    private static v1 N;
    private static final Object O;
    public static String P;
    private static String Q;
    private static OSUtils R;
    private static boolean S;
    private static boolean T;
    private static boolean U;
    private static boolean V;
    private static boolean W;
    private static f0.d X;
    private static Collection Y;
    private static HashSet Z;

    /* renamed from: a, reason: collision with root package name */
    private static i0 f21874a;

    /* renamed from: a0, reason: collision with root package name */
    private static final ArrayList f21875a0;

    /* renamed from: b, reason: collision with root package name */
    private static w f21876b;

    /* renamed from: b0, reason: collision with root package name */
    private static com.onesignal.q f21877b0;

    /* renamed from: c, reason: collision with root package name */
    private static w f21878c;

    /* renamed from: c0, reason: collision with root package name */
    private static g2 f21879c0;

    /* renamed from: d0, reason: collision with root package name */
    static g2 f21881d0;

    /* renamed from: e, reason: collision with root package name */
    static Context f21882e;

    /* renamed from: e0, reason: collision with root package name */
    private static d2 f21883e0;

    /* renamed from: f, reason: collision with root package name */
    static WeakReference f21884f;

    /* renamed from: f0, reason: collision with root package name */
    private static OSSubscriptionState f21885f0;

    /* renamed from: g, reason: collision with root package name */
    static String f21886g;

    /* renamed from: g0, reason: collision with root package name */
    static OSSubscriptionState f21887g0;

    /* renamed from: h, reason: collision with root package name */
    static String f21888h;

    /* renamed from: h0, reason: collision with root package name */
    private static d2 f21889h0;

    /* renamed from: i0, reason: collision with root package name */
    private static w0 f21891i0;

    /* renamed from: j0, reason: collision with root package name */
    static w0 f21893j0;

    /* renamed from: k0, reason: collision with root package name */
    private static d2 f21895k0;

    /* renamed from: l0, reason: collision with root package name */
    private static k2 f21897l0;

    /* renamed from: m0, reason: collision with root package name */
    static k2 f21899m0;

    /* renamed from: n0, reason: collision with root package name */
    private static d2 f21901n0;

    /* renamed from: o0, reason: collision with root package name */
    private static y f21903o0;

    /* renamed from: p, reason: collision with root package name */
    static g0 f21904p;

    /* renamed from: p0, reason: collision with root package name */
    private static u3 f21905p0;

    /* renamed from: q, reason: collision with root package name */
    static e0 f21906q;

    /* renamed from: r, reason: collision with root package name */
    static d0 f21907r;

    /* renamed from: s, reason: collision with root package name */
    static b0 f21908s;

    /* renamed from: t, reason: collision with root package name */
    private static boolean f21909t;

    /* renamed from: u, reason: collision with root package name */
    private static boolean f21910u;

    /* renamed from: w, reason: collision with root package name */
    private static g4 f21912w;

    /* renamed from: x, reason: collision with root package name */
    private static e4 f21913x;

    /* renamed from: y, reason: collision with root package name */
    private static f4 f21914y;

    /* renamed from: d, reason: collision with root package name */
    private static List f21880d = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private static z f21890i = z.NONE;

    /* renamed from: j, reason: collision with root package name */
    private static z f21892j = z.WARN;

    /* renamed from: k, reason: collision with root package name */
    private static String f21894k = null;

    /* renamed from: l, reason: collision with root package name */
    private static String f21896l = null;

    /* renamed from: m, reason: collision with root package name */
    private static String f21898m = null;

    /* renamed from: n, reason: collision with root package name */
    private static int f21900n = Integer.MAX_VALUE;

    /* renamed from: o, reason: collision with root package name */
    static i7.a f21902o = null;

    /* renamed from: v, reason: collision with root package name */
    private static s f21911v = s.APP_CLOSE;

    /* renamed from: z, reason: collision with root package name */
    private static r1 f21915z = new q1();
    private static m2.b B = new c();
    private static e1 C = new e1();
    private static w2 D = new x2();
    private static j2 E = new j2();
    private static t2 F = new t2(f21915z);
    private static u2 G = new u2(E, f21915z);
    private static f3 H = new q3();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e3.r1();
            } catch (JSONException e5) {
                e3.b(z.FATAL, "FATAL Error registering device!", e5);
            }
        }
    }

    public interface a0 {
        void a(JSONObject jSONObject);
    }

    class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ JSONObject f21916m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ t f21917n;

        b(JSONObject jSONObject, t tVar) {
            this.f21916m = jSONObject;
            this.f21917n = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e3.f21915z.f("Running sendTags() operation from pending task queue.");
            e3.F1(this.f21916m, this.f21917n);
        }
    }

    public interface b0 {
        void a(b1 b1Var);
    }

    class c implements m2.b {
        c() {
        }

        @Override // com.onesignal.m2.b
        public void a(List list) {
            if (e3.L == null) {
                e3.a(z.WARN, "OneSignal onSessionEnding called before init!");
            }
            if (e3.L != null) {
                e3.L.e();
            }
            e3.f0().g(list);
        }
    }

    interface c0 {
        void a(String str, boolean z10);
    }

    class d implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ JSONObject f21918m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ t f21919n;

        d(JSONObject jSONObject, t tVar) {
            this.f21918m = jSONObject;
            this.f21919n = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f21918m == null) {
                e3.f21915z.a("Attempted to send null tags");
                t tVar = this.f21919n;
                if (tVar != null) {
                    tVar.b(new n0(-1, "Attempted to send null tags"));
                    return;
                }
                return;
            }
            JSONObject jSONObject = s3.h(false).f22253b;
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> itKeys = this.f21918m.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    Object objOpt = this.f21918m.opt(next);
                    if ((objOpt instanceof JSONArray) || (objOpt instanceof JSONObject)) {
                        e3.a(z.ERROR, "Omitting key '" + next + "'! sendTags DO NOT supported nested values!");
                    } else if (!this.f21918m.isNull(next) && !"".equals(objOpt)) {
                        jSONObject2.put(next, objOpt.toString());
                    } else if (jSONObject != null && jSONObject.has(next)) {
                        jSONObject2.put(next, "");
                    }
                } catch (Throwable unused) {
                }
            }
            if (jSONObject2.toString().equals("{}")) {
                e3.f21915z.f("Send tags ended successfully");
                t tVar2 = this.f21919n;
                if (tVar2 != null) {
                    tVar2.a(jSONObject);
                    return;
                }
                return;
            }
            e3.f21915z.f("Available tags to send: " + jSONObject2.toString());
            s3.q(jSONObject2, this.f21919n);
        }
    }

    public interface d0 {
        void a(b2 b2Var);
    }

    class e implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ a0 f21920m;

        e(a0 a0Var) {
            this.f21920m = a0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            e3.f21915z.f("Running getTags() operation from pending queue.");
            e3.A0(this.f21920m);
        }
    }

    public interface e0 {
        void a(c2 c2Var);
    }

    class f implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ a0 f21921m;

        f(a0 a0Var) {
            this.f21921m = a0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (e3.f21875a0) {
                e3.f21875a0.add(this.f21921m);
                if (e3.f21875a0.size() > 1) {
                    return;
                }
                e3.v1();
            }
        }
    }

    interface f0 {
        void a(k0 k0Var);
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p4.e eVarH = s3.h(!e3.U);
            if (eVarH.f22252a) {
                boolean unused = e3.U = true;
            }
            synchronized (e3.f21875a0) {
                Iterator it = e3.f21875a0.iterator();
                while (it.hasNext()) {
                    ((a0) it.next()).a((eVarH.f22253b == null || eVarH.toString().equals("{}")) ? null : eVarH.f22253b);
                }
                e3.f21875a0.clear();
            }
        }
    }

    public interface g0 {
        void a(Context context, c2 c2Var);
    }

    class h implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ b2 f21922m;

        h(b2 b2Var) {
            this.f21922m = b2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            e3.f21907r.a(this.f21922m);
        }
    }

    public static class h0 {

        /* renamed from: a, reason: collision with root package name */
        private m0 f21923a;

        /* renamed from: b, reason: collision with root package name */
        private String f21924b;

        h0(m0 m0Var, String str) {
            this.f21923a = m0Var;
            this.f21924b = str;
        }
    }

    class i extends p3.g {
        i() {
        }

        @Override // com.onesignal.p3.g
        void a(int i10, String str, Throwable th) {
            e3.Z0("sending Notification Opened Failed", i10, th, str);
        }
    }

    public interface i0 {
        void a(JSONObject jSONObject);

        void b(h0 h0Var);
    }

    class j implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ f0 f21925m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f21926n;

        j(f0 f0Var, boolean z10) {
            this.f21925m = f0Var;
            this.f21926n = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e3.f21915z.f("Running promptLocation() operation from pending queue.");
            e3.l1(this.f21925m, this.f21926n);
        }
    }

    public interface j0 {
        void a(e2 e2Var);
    }

    class k {
        k() {
        }
    }

    enum k0 {
        PERMISSION_GRANTED,
        PERMISSION_DENIED,
        LOCATION_PERMISSIONS_MISSING_MANIFEST,
        ERROR
    }

    class l extends f0.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f0 f21932a;

        l(f0 f0Var) {
            this.f21932a = f0Var;
        }

        @Override // com.onesignal.f0.b
        public f0.f a() {
            return f0.f.PROMPT_LOCATION;
        }

        @Override // com.onesignal.f0.b
        public void b(f0.d dVar) {
            if (e3.R1("promptLocation()") || dVar == null) {
                return;
            }
            s3.w(dVar);
        }

        @Override // com.onesignal.f0.e
        void c(k0 k0Var) {
            super.c(k0Var);
            f0 f0Var = this.f21932a;
            if (f0Var != null) {
                f0Var.a(k0Var);
            }
        }
    }

    public interface l0 {
        void a(boolean z10);
    }

    class m implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f21933m;

        m(int i10) {
            this.f21933m = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e3.f21915z.f("Running removeNotification() operation from pending queue.");
            e3.t1(this.f21933m);
        }
    }

    public enum m0 {
        VALIDATION,
        REQUIRES_SMS_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    class n implements f0.b {
        n() {
        }

        @Override // com.onesignal.f0.b
        public f0.f a() {
            return f0.f.STARTUP;
        }

        @Override // com.onesignal.f0.b
        public void b(f0.d dVar) throws InterruptedException {
            f0.d unused = e3.X = dVar;
            boolean unused2 = e3.T = true;
            e3.q1();
        }
    }

    public static class n0 {

        /* renamed from: a, reason: collision with root package name */
        private String f21939a;

        /* renamed from: b, reason: collision with root package name */
        private int f21940b;

        n0(int i10, String str) {
            this.f21939a = str;
            this.f21940b = i10;
        }
    }

    class o implements u3.a {
        o() {
        }

        @Override // com.onesignal.u3.a
        public void a(String str, int i10) throws InterruptedException {
            e3.f21915z.f("registerForPushToken completed with id: " + str + " status: " + i10);
            if (i10 >= 1 ? e3.m1(e3.f21900n) : !(s3.e() != null || (e3.f21900n != 1 && !e3.m1(e3.f21900n)))) {
                int unused = e3.f21900n = i10;
            }
            String unused2 = e3.Q = str;
            boolean unused3 = e3.S = true;
            e3.X(e3.f21882e).k(str);
            e3.q1();
        }
    }

    class p implements o3.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f21941a;

        p(boolean z10) {
            this.f21941a = z10;
        }

        @Override // com.onesignal.o3.c
        public void a(o3.f fVar) {
            boolean unused = e3.W = false;
            String str = fVar.f22179a;
            if (str != null) {
                e3.f21888h = str;
            }
            e3.E.q(fVar, e3.J, e3.I, e3.f21915z);
            e3.h1();
            com.onesignal.k0.g(e3.f21882e, fVar.f22183e);
            if (this.f21941a) {
                e3.p1();
            }
        }
    }

    class q implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ z f21942m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f21943n;

        q(z zVar, String str) {
            this.f21942m = zVar;
            this.f21943n = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e3.T() != null) {
                new AlertDialog.Builder(e3.T()).setTitle(this.f21942m.toString()).setMessage(this.f21943n).show();
            }
        }
    }

    class r implements Runnable {
        r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e3.f21915z.f("Running onAppLostFocus() operation from a pending task queue.");
            e3.E();
        }
    }

    public enum s {
        NOTIFICATION_CLICK,
        APP_OPEN,
        APP_CLOSE;

        public boolean b() {
            return equals(APP_CLOSE);
        }

        public boolean d() {
            return equals(APP_OPEN);
        }

        public boolean g() {
            return equals(NOTIFICATION_CLICK);
        }
    }

    public interface t {
        void a(JSONObject jSONObject);

        void b(n0 n0Var);
    }

    public enum u {
        VALIDATION,
        REQUIRES_EMAIL_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    public static class v {

        /* renamed from: a, reason: collision with root package name */
        private u f21953a;

        /* renamed from: b, reason: collision with root package name */
        private String f21954b;

        v(u uVar, String str) {
            this.f21953a = uVar;
            this.f21954b = str;
        }
    }

    public interface w {
        void a(v vVar);

        void b();
    }

    interface x {
        void a(s sVar);
    }

    private static class y {

        /* renamed from: a, reason: collision with root package name */
        JSONArray f21955a;

        /* renamed from: b, reason: collision with root package name */
        boolean f21956b;

        /* renamed from: c, reason: collision with root package name */
        p3.g f21957c;

        y(JSONArray jSONArray) {
            this.f21955a = jSONArray;
        }
    }

    public enum z {
        NONE,
        FATAL,
        ERROR,
        WARN,
        INFO,
        DEBUG,
        VERBOSE
    }

    static {
        o2 o2Var = new o2();
        I = o2Var;
        g7.e eVar = new g7.e(o2Var, f21915z, D);
        J = eVar;
        K = new m2(B, eVar, f21915z);
        O = new k();
        P = "native";
        R = new OSUtils();
        Y = new ArrayList();
        Z = new HashSet();
        f21875a0 = new ArrayList();
    }

    public static void A(String str, Object obj) {
        HashMap map = new HashMap();
        map.put(str, obj);
        g0().C(map);
    }

    public static void A0(a0 a0Var) {
        if (G.g("getTags()")) {
            f21915z.a("Waiting for remote params. Moving getTags() operation to a pending queue.");
            G.c(new e(a0Var));
        } else {
            if (R1("getTags()")) {
                return;
            }
            if (a0Var == null) {
                f21915z.a("getTags called with null GetTagsHandler!");
            } else {
                new Thread(new f(a0Var), "OS_GETTAGS").start();
            }
        }
    }

    static void A1(String str) {
        f21894k = str;
        if (f21882e == null) {
            return;
        }
        n3.m(n3.f22119a, "GT_PLAYER_ID", f21894k);
    }

    static void B(String str) {
        s sVar = s.NOTIFICATION_CLICK;
        f21911v = sVar;
        K.j(sVar, str);
    }

    static w2 B0() {
        return D;
    }

    private static boolean B1() {
        boolean zL = s3.l();
        f21915z.f("OneSignal scheduleSyncService unsyncedChanges: " + zL);
        if (zL) {
            r2.q().s(f21882e);
        }
        boolean zM = com.onesignal.f0.m(f21882e);
        f21915z.f("OneSignal scheduleSyncService locationScheduled: " + zM);
        return zM || zL;
    }

    static boolean C() {
        if (E.t()) {
            return OSUtils.a(f21882e);
        }
        return true;
    }

    private static String C0() {
        return Build.VERSION.SDK_INT >= 26 ? ZoneId.systemDefault().getId() : TimeZone.getDefault().getID();
    }

    static void C1(List list) {
        f2 f2Var = L;
        if (f2Var == null || f21886g == null) {
            a(z.ERROR, "Make sure OneSignal.init is called first");
        } else {
            f2Var.m(list);
        }
    }

    static boolean D(z zVar) {
        return zVar.compareTo(f21890i) < 1 || zVar.compareTo(f21892j) < 1;
    }

    private static int D0() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return rawOffset / AdError.NETWORK_ERROR_CODE;
    }

    static void D1(JSONArray jSONArray, boolean z10, p3.g gVar) {
        if (R1("sendPurchases()")) {
            return;
        }
        if (E0() == null) {
            y yVar = new y(jSONArray);
            f21903o0 = yVar;
            yVar.f21956b = z10;
            yVar.f21957c = gVar;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", t0());
            if (z10) {
                jSONObject.put("existing", true);
            }
            jSONObject.put("purchases", jSONArray);
            s3.p(jSONObject, gVar);
        } catch (Throwable th) {
            b(z.ERROR, "Failed to generate JSON for sendPurchases.", th);
        }
    }

    static void E() {
        if (f21910u) {
            return;
        }
        e4 e4Var = f21913x;
        if (e4Var != null) {
            e4Var.c();
        }
        f0().a();
        B1();
    }

    static String E0() {
        Context context;
        if (f21894k == null && (context = f21882e) != null) {
            f21894k = v0(context);
        }
        return f21894k;
    }

    public static void E1(JSONObject jSONObject) {
        F1(jSONObject, null);
    }

    static void F(s sVar) {
        Iterator it = new ArrayList(f21880d).iterator();
        while (it.hasNext()) {
            ((x) it.next()).a(sVar);
        }
    }

    private static void F0(Context context) {
        com.onesignal.a aVarB = com.onesignal.b.b();
        boolean z10 = context instanceof Activity;
        boolean z11 = T() == null;
        I1(!z11 || z10);
        f21915z.f("OneSignal handleActivityLifecycleHandler inForeground: " + f21910u);
        if (!f21910u) {
            if (aVarB != null) {
                aVarB.t(true);
                return;
            }
            return;
        }
        if (z11 && z10 && aVarB != null) {
            aVarB.s((Activity) context);
            aVarB.t(true);
        }
        OSNotificationRestoreWorkManager.c(context, false);
        f0().b();
    }

    public static void F1(JSONObject jSONObject, t tVar) {
        if (G.g("sendTags()")) {
            f21915z.a("Waiting for remote params. Moving sendTags() operation to a pending task queue.");
            G.c(new b(jSONObject, tVar));
        } else {
            if (R1("sendTags()")) {
                return;
            }
            d dVar = new d(jSONObject, tVar);
            if (!G.e()) {
                dVar.run();
            } else {
                f21915z.f("Sending sendTags() operation to pending task queue.");
                G.c(dVar);
            }
        }
    }

    public static void G(JSONArray jSONArray, t tVar) {
        if (R1("deleteTags()")) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                jSONObject.put(jSONArray.getString(i10), "");
            }
            F1(jSONObject, tVar);
        } catch (Throwable th) {
            b(z.ERROR, "Failed to generate JSON for deleteTags.", th);
        }
    }

    private static void G0() throws ClassNotFoundException {
        try {
            Class.forName("com.amazon.device.iap.PurchasingListener");
            f21913x = new e4(f21882e);
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void G1(String str) {
        if (str == null || str.isEmpty()) {
            f21915z.b("setAppId called with id: " + str + ", ignoring!");
            return;
        }
        if (!str.equals(f21886g)) {
            f21909t = false;
            f21915z.c("setAppId called with id: " + str + " changing id from: " + f21886g);
        }
        f21886g = str;
        if (f21882e == null) {
            f21915z.b("appId set, but please call initWithContext(appContext) with Application context to complete OneSignal init!");
        } else {
            WeakReference weakReference = f21884f;
            P0((weakReference == null || weakReference.get() == null) ? f21882e : (Context) f21884f.get());
        }
    }

    private static void H() {
        if (S1()) {
            f21915z.f("Starting new session with appEntryState: " + Q());
            s3.r();
            l0().e();
            K.m(Q());
            g0().q0();
            J1(D.b());
        } else if (T0()) {
            f21915z.f("Continue on same session with appEntryState: " + Q());
            K.c(Q());
        }
        g0().W();
        if (!f21910u && O0()) {
            f21915z.f("doSessionInit on background with already registered user");
        }
        V1();
    }

    private static void H0() {
        String strT0 = t0();
        if (strT0 == null) {
            a(z.DEBUG, "App id set for first time:  " + f21886g);
            com.onesignal.k.d(0, f21882e);
            x1(f21886g);
            return;
        }
        if (strT0.equals(f21886g)) {
            return;
        }
        a(z.DEBUG, "App id has changed:\nFrom: " + strT0 + "\n To: " + f21886g + "\nClearing the user id, app state, and remoteParams as they are no longer valid");
        x1(f21886g);
        s3.o();
        E.a();
    }

    public static void H1(b0 b0Var) {
        f21908s = b0Var;
    }

    private static void I() {
        Iterator it = Y.iterator();
        while (it.hasNext()) {
            w1((JSONArray) it.next());
        }
        Y.clear();
    }

    static void I0() {
        w wVar = f21878c;
        if (wVar != null) {
            wVar.a(new v(u.NETWORK, "Failed due to network failure. Will retry on next sync."));
            f21878c = null;
        }
    }

    static void I1(boolean z10) {
        f21910u = z10;
    }

    static void J() {
        w wVar = f21876b;
        if (wVar != null) {
            wVar.a(new v(u.NETWORK, "Failed due to network failure. Will retry on next sync."));
            f21876b = null;
        }
    }

    static void J0(Activity activity, JSONArray jSONArray, String str) {
        if (R1(null)) {
            return;
        }
        c1(activity, jSONArray);
        if (f21914y != null && e0()) {
            f21914y.g(P(jSONArray));
        }
        if (Q1(activity, jSONArray)) {
            B(str);
        }
        j1(activity, jSONArray);
        w1(jSONArray);
    }

    static void J1(long j10) {
        f21915z.f("Last session time set to: " + j10);
        n3.l(n3.f22119a, "OS_LAST_SESSION_TIME", j10);
    }

    static void K() {
        w wVar = f21876b;
        if (wVar != null) {
            wVar.b();
            f21876b = null;
        }
    }

    static void K0(x1 x1Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(x1Var.e().toString());
            jSONObject.put("androidNotificationId", x1Var.a());
            b2 b2VarP = P(com.onesignal.j0.g(jSONObject));
            if (f21914y == null || !e0()) {
                return;
            }
            f21914y.h(b2VarP);
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    public static void K1(z zVar, z zVar2) {
        f21892j = zVar;
        f21890i = zVar2;
    }

    static void L(u1 u1Var) {
        i1(z.INFO, "Fire notificationWillShowInForegroundHandler");
        c2 c2VarC = u1Var.c();
        try {
            f21906q.a(c2VarC);
        } catch (Throwable th) {
            i1(z.ERROR, "Exception thrown while notification was being processed for display by notificationWillShowInForegroundHandler, showing notification in foreground!");
            c2VarC.b(c2VarC.c());
            throw th;
        }
    }

    static void L0() {
        w wVar = f21878c;
        if (wVar != null) {
            wVar.b();
            f21878c = null;
        }
    }

    public static void L1(d0 d0Var) {
        f21907r = d0Var;
        if (!f21909t || d0Var == null) {
            return;
        }
        I();
    }

    private static void M(b2 b2Var) {
        com.onesignal.p.f22194a.b(new h(b2Var));
    }

    static boolean M0() {
        return !TextUtils.isEmpty(f21896l);
    }

    public static void M1(boolean z10) {
        if (p0().f()) {
            f21915z.b("setRequiresUserPrivacyConsent already called by remote params!, ignoring user set");
        } else if (!u1() || z10) {
            p0().o(z10);
        } else {
            a(z.ERROR, "Cannot change requiresUserPrivacyConsent() from TRUE to FALSE");
        }
    }

    static void N() {
        i0 i0Var = f21874a;
        if (i0Var != null) {
            i0Var.b(new h0(m0.NETWORK, "Failed due to network failure. Will retry on next sync."));
            f21874a = null;
        }
    }

    static boolean N0() {
        return !TextUtils.isEmpty(f21898m);
    }

    private static void N1(boolean z10) {
        com.onesignal.b.c((Application) f21882e);
        if (z10) {
            f21902o = new i7.a(I);
            n3.o();
            l3 l3VarY = Y();
            v1 v1Var = new v1(l3VarY, f21915z);
            N = v1Var;
            v1Var.h();
            g0().G();
            if (M == null) {
                M = new j7.c(f21915z, H, l3VarY, I);
            }
            K.g();
            l0().d();
        }
    }

    static void O(JSONObject jSONObject) {
        i0 i0Var = f21874a;
        if (i0Var != null) {
            i0Var.a(jSONObject);
            f21874a = null;
        }
    }

    static boolean O0() {
        return E0() != null;
    }

    private static void O1(Context context) {
        String string;
        ApplicationInfo applicationInfoA = com.onesignal.i.f22060a.a(context);
        if (applicationInfoA == null || (string = applicationInfoA.metaData.getString("com.onesignal.PrivacyConsent")) == null) {
            return;
        }
        M1("ENABLE".equalsIgnoreCase(string));
    }

    private static b2 P(JSONArray jSONArray) {
        int length = jSONArray.length();
        int iOptInt = jSONArray.optJSONObject(0).optInt("androidNotificationId");
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        String strOptString = null;
        JSONObject jSONObject = null;
        for (int i10 = 0; i10 < length; i10++) {
            try {
                jSONObject = jSONArray.getJSONObject(i10);
                if (strOptString == null && jSONObject.has("actionId")) {
                    strOptString = jSONObject.optString("actionId", null);
                }
                if (z10) {
                    z10 = false;
                } else {
                    arrayList.add(new s1(jSONObject));
                }
            } catch (Throwable th) {
                b(z.ERROR, "Error parsing JSON item " + i10 + "/" + length + " for callback.", th);
            }
        }
        return new b2(new s1(arrayList, jSONObject, iOptInt), new t1(strOptString != null ? t1.a.ActionTaken : t1.a.Opened, strOptString));
    }

    private static synchronized void P0(Context context) {
        r1 r1Var;
        String str;
        f21915z.c("Starting OneSignal initialization!");
        u1.h(f21882e);
        if (!u1() && E.k()) {
            int iA = f21900n;
            if (iA == Integer.MAX_VALUE) {
                iA = R.A(f21882e, f21886g);
            }
            f21900n = iA;
            if (X0()) {
                return;
            }
            if (f21909t) {
                if (f21907r != null) {
                    I();
                }
                f21915z.f("OneSignal SDK initialization already completed.");
                return;
            }
            F0(context);
            f21884f = null;
            s3.k();
            H0();
            G0();
            OSPermissionChangedInternalObserver.b(V(f21882e));
            H();
            if (f21907r != null) {
                I();
            }
            if (g4.a(f21882e)) {
                f21912w = new g4(f21882e);
            }
            if (f4.a()) {
                f21914y = new f4(f21882e);
            }
            f21909t = true;
            a(z.VERBOSE, "OneSignal SDK initialization done.");
            l0().q();
            G.f();
            return;
        }
        if (E.k()) {
            r1Var = f21915z;
            str = "OneSignal SDK initialization delayed, waiting for privacy consent to be set.";
        } else {
            r1Var = f21915z;
            str = "OneSignal SDK initialization delayed, waiting for remote params.";
        }
        r1Var.c(str);
        f21877b0 = new com.onesignal.q(f21882e, f21886g);
        String str2 = f21886g;
        f21886g = null;
        if (str2 != null && context != null) {
            a1(str2, E0(), false);
        }
    }

    static boolean P1(x1 x1Var) {
        z zVar;
        String str;
        if (!T0()) {
            zVar = z.INFO;
            str = "App is in background, show notification";
        } else if (f21906q == null) {
            zVar = z.INFO;
            str = "No NotificationWillShowInForegroundHandler setup, show notification";
        } else {
            if (!x1Var.n()) {
                return true;
            }
            zVar = z.INFO;
            str = "Not firing notificationWillShowInForegroundHandler for restored notifications";
        }
        i1(zVar, str);
        return false;
    }

    static s Q() {
        return f21911v;
    }

    public static void Q0(Context context) {
        if (context == null) {
            f21915z.b("initWithContext called with null context, ignoring!");
            return;
        }
        if (context instanceof Activity) {
            f21884f = new WeakReference((Activity) context);
        }
        boolean z10 = f21882e == null;
        f21882e = context.getApplicationContext();
        N1(z10);
        O1(f21882e);
        if (f21886g != null) {
            f21915z.c("initWithContext called with: " + context);
            P0(context);
            return;
        }
        String strT0 = t0();
        if (strT0 == null) {
            f21915z.b("appContext set, but please call setAppId(appId) with a valid appId to complete OneSignal init!");
            return;
        }
        f21915z.c("appContext set and cached app id found, calling setAppId with: " + strT0);
        G1(strT0);
    }

    private static boolean Q1(Activity activity, JSONArray jSONArray) {
        if (f21910u) {
            return false;
        }
        try {
            return new a2(activity, jSONArray.getJSONObject(0)).a();
        } catch (JSONException e5) {
            e5.printStackTrace();
            return true;
        }
    }

    private static Integer R() {
        com.onesignal.x xVarA = t3.f22451a.a(f21882e, f21882e.getPackageName(), 0);
        if (!xVarA.b() || xVarA.a() == null) {
            return null;
        }
        return Integer.valueOf(xVarA.a().versionCode);
    }

    private static void R0() {
        ArrayList arrayList = f21875a0;
        synchronized (arrayList) {
            if (arrayList.size() == 0) {
                return;
            }
            new Thread(new g(), "OS_GETTAGS_CALLBACK").start();
        }
    }

    static boolean R1(String str) {
        if (!u1()) {
            return false;
        }
        if (str == null) {
            return true;
        }
        a(z.WARN, "Method " + str + " was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.userProvidedPrivacyConsent()");
        return true;
    }

    static boolean S() {
        return E.b();
    }

    static boolean S0() {
        return f21909t && T0();
    }

    private static boolean S1() {
        return T0() && W0();
    }

    static Activity T() {
        com.onesignal.a aVarB = com.onesignal.b.b();
        if (aVarB != null) {
            return aVarB.e();
        }
        return null;
    }

    static boolean T0() {
        return f21910u;
    }

    static void T1(boolean z10) {
        f21915z.f("OneSignal startLocationShared: " + z10);
        p0().n(z10);
        if (z10) {
            return;
        }
        f21915z.f("OneSignal is shareLocation set false, clearing last location!");
        s3.a();
    }

    private static w0 U(Context context) {
        if (context == null) {
            return null;
        }
        if (f21891i0 == null) {
            w0 w0Var = new w0(false);
            f21891i0 = w0Var;
            w0Var.c().b(new OSEmailSubscriptionChangedInternalObserver());
        }
        return f21891i0;
    }

    static boolean U0() {
        return f21909t;
    }

    private static void U1() {
        com.onesignal.f0.g(f21882e, false, false, new n());
    }

    private static g2 V(Context context) {
        if (context == null) {
            return null;
        }
        if (f21879c0 == null) {
            g2 g2Var = new g2(false);
            f21879c0 = g2Var;
            g2Var.b().b(new OSPermissionChangedInternalObserver());
        }
        return f21879c0;
    }

    public static boolean V0() {
        return E.h();
    }

    private static void V1() {
        if (V) {
            return;
        }
        V = true;
        if (f21910u && s3.g()) {
            T = false;
        }
        U1();
        S = false;
        if (q0() != null) {
            p1();
        } else {
            a1(f21886g, E0(), true);
        }
    }

    private static k2 W(Context context) {
        if (context == null) {
            return null;
        }
        if (f21897l0 == null) {
            k2 k2Var = new k2(false);
            f21897l0 = k2Var;
            k2Var.a().b(new OSSMSSubscriptionChangedInternalObserver());
        }
        return f21897l0;
    }

    private static boolean W0() {
        long jB = B0().b();
        long jH0 = h0();
        long j10 = jB - jH0;
        f21915z.f("isPastOnSessionTime currentTimeMillis: " + jB + " lastSessionTime: " + jH0 + " difference: " + j10);
        return j10 >= 30000;
    }

    static void W1(String str) {
        y1(str);
        U(f21882e).g(str);
        try {
            s3.x(new JSONObject().put("parent_player_id", str));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OSSubscriptionState X(Context context) {
        if (context == null) {
            return null;
        }
        if (f21885f0 == null) {
            f21885f0 = new OSSubscriptionState(false, V(context).a());
            V(context).b().a(f21885f0);
            f21885f0.b().b(new OSSubscriptionChangedInternalObserver());
        }
        return f21885f0;
    }

    private static boolean X0() {
        return f21900n == -999;
    }

    static void X1(String str) {
        z1(str);
        W(f21882e).g(str);
    }

    static l3 Y() {
        return l3.x(f21882e);
    }

    static boolean Y0() {
        return E.i();
    }

    static void Y1(String str) {
        A1(str);
        R0();
        X(f21882e).m(str);
        y yVar = f21903o0;
        if (yVar != null) {
            D1(yVar.f21955a, yVar.f21956b, yVar.f21957c);
            f21903o0 = null;
        }
        s3.n();
    }

    static l3 Z(Context context) {
        return l3.x(context);
    }

    static void Z0(String str, int i10, Throwable th, String str2) {
        String str3;
        if (str2 == null || !D(z.INFO)) {
            str3 = "";
        } else {
            str3 = "\n" + str2 + "\n";
        }
        b(z.WARN, "HTTP code: " + i10 + " " + str + str3, th);
    }

    public static boolean Z1() {
        return E.e();
    }

    static void a(z zVar, String str) {
        b(zVar, str, null);
    }

    public static t0 a0() {
        Context context = f21882e;
        if (context != null) {
            return new t0(X(context), V(f21882e), U(f21882e), W(f21882e));
        }
        f21915z.a("OneSignal.initWithContext has not been called. Could not get OSDeviceState");
        return null;
    }

    private static void a1(String str, String str2, boolean z10) {
        if (q0() != null || W) {
            return;
        }
        W = true;
        o3.e(str, str2, new p(z10));
    }

    static void b(z zVar, String str, Throwable th) {
        if (zVar.compareTo(f21892j) < 1) {
            if (zVar == z.VERBOSE) {
                Log.v("OneSignal", str, th);
            } else if (zVar == z.DEBUG) {
                Log.d("OneSignal", str, th);
            } else if (zVar == z.INFO) {
                Log.i("OneSignal", str, th);
            } else if (zVar == z.WARN) {
                Log.w("OneSignal", str, th);
            } else if (zVar == z.ERROR || zVar == z.FATAL) {
                Log.e("OneSignal", str, th);
            }
        }
        if (zVar.compareTo(f21890i) >= 1 || T() == null) {
            return;
        }
        try {
            String str2 = str + "\n";
            if (th != null) {
                String str3 = str2 + th.getMessage();
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                str2 = str3 + stringWriter.toString();
            }
            OSUtils.S(new q(zVar, str2));
        } catch (Throwable th2) {
            Log.e("OneSignal", "Error showing logging message.", th2);
        }
    }

    static boolean b0() {
        return E.g();
    }

    static void b1(Context context, JSONObject jSONObject, v1.d dVar) {
        if (N == null) {
            N = new v1(Z(context), f21915z);
        }
        N.j(jSONObject, dVar);
    }

    static String c0() {
        if (f21896l == null && f21882e != null) {
            f21896l = n3.f(n3.f22119a, "OS_EMAIL_ID", null);
        }
        if (TextUtils.isEmpty(f21896l)) {
            return null;
        }
        return f21896l;
    }

    private static void c1(Context context, JSONArray jSONArray) {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                String strOptString = new JSONObject(jSONArray.getJSONObject(i10).optString("custom", null)).optString("i", null);
                if (!Z.contains(strOptString)) {
                    Z.add(strOptString);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_id", u0(context));
                    jSONObject.put("player_id", v0(context));
                    jSONObject.put("opened", true);
                    jSONObject.put("device_type", R.e());
                    p3.l("notifications/" + strOptString, jSONObject, new i());
                }
            } catch (Throwable th) {
                b(z.ERROR, "Failed to generate JSON to send notification opened.", th);
            }
        }
    }

    static d2 d0() {
        if (f21895k0 == null) {
            f21895k0 = new d2("onOSEmailSubscriptionChanged", true);
        }
        return f21895k0;
    }

    static void d1() {
        z zVar = z.DEBUG;
        a(zVar, "Application on focus");
        I1(true);
        s sVar = f21911v;
        s sVar2 = s.NOTIFICATION_CLICK;
        if (!sVar.equals(sVar2)) {
            F(f21911v);
            if (!f21911v.equals(sVar2)) {
                f21911v = s.APP_OPEN;
            }
        }
        com.onesignal.f0.l();
        p0.f22201a.h();
        if (OSUtils.T(f21886g)) {
            return;
        }
        if (E.k()) {
            e1();
        } else {
            a(zVar, "Delay onAppFocus logic due to missing remote params");
            a1(f21886g, E0(), false);
        }
    }

    static boolean e0() {
        return E.c();
    }

    private static void e1() {
        if (R1("onAppFocus")) {
            return;
        }
        f0().b();
        H();
        g4 g4Var = f21912w;
        if (g4Var != null) {
            g4Var.u();
        }
        OSNotificationRestoreWorkManager.c(f21882e, false);
        o1();
        if (f21914y != null && e0()) {
            f21914y.f();
        }
        r2.q().p(f21882e);
    }

    static com.onesignal.s f0() {
        if (A == null) {
            A = new com.onesignal.s(new z0(), f21915z);
        }
        return A;
    }

    static void f1() {
        a(z.DEBUG, "Application lost focus initDone: " + f21909t);
        I1(false);
        f21911v = s.APP_CLOSE;
        J1(B0().b());
        com.onesignal.f0.l();
        if (f21909t) {
            E();
        } else if (G.g("onAppLostFocus()")) {
            f21915z.a("Waiting for remote params. Moving onAppLostFocus() operation to a pending task queue.");
            G.c(new r());
        }
    }

    static d1 g0() {
        return C.a(Y(), F, j0(), y0(), f21902o);
    }

    static void g1() {
        o1();
    }

    private static long h0() {
        return n3.d(n3.f22119a, "OS_LAST_SESSION_TIME", -31000L);
    }

    static void h1() {
        if (n1() || !f21910u) {
            return;
        }
        e1();
    }

    private static OSSubscriptionState i0(Context context) {
        if (context == null) {
            return null;
        }
        if (f21887g0 == null) {
            f21887g0 = new OSSubscriptionState(true, false);
        }
        return f21887g0;
    }

    public static void i1(z zVar, String str) {
        a(zVar, str);
    }

    static r1 j0() {
        return f21915z;
    }

    static void j1(Activity activity, JSONArray jSONArray) throws JSONException {
        try {
            Intent intentB = com.onesignal.w.f22489a.a(activity, jSONArray.getJSONObject(0)).b();
            if (intentB != null) {
                f21915z.e("SDK running startActivity with Intent: " + intentB);
                activity.startActivity(intentB);
            } else {
                f21915z.e("SDK not showing an Activity automatically due to it's settings.");
            }
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    static String k0(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject2 = new JSONObject(jSONObject.getString("custom"));
        } catch (JSONException unused) {
            f21915z.f("Not a OneSignal formatted FCM message. No 'custom' field in the JSONObject.");
        }
        if (jSONObject2.has("i")) {
            return jSONObject2.optString("i", null);
        }
        f21915z.f("Not a OneSignal formatted FCM message. No 'i' field in custom.");
        return null;
    }

    public static void k1(boolean z10, l0 l0Var) {
        p0.f22201a.i(z10, l0Var);
    }

    static f2 l0() {
        if (L == null) {
            synchronized (O) {
                if (L == null) {
                    if (M == null) {
                        M = new j7.c(f21915z, H, Y(), I);
                    }
                    L = new f2(K, M);
                }
            }
        }
        return L;
    }

    static void l1(f0 f0Var, boolean z10) {
        if (G.g("promptLocation()")) {
            f21915z.a("Waiting for remote params. Moving promptLocation() operation to a pending queue.");
            G.c(new j(f0Var, z10));
        } else {
            if (R1("promptLocation()")) {
                return;
            }
            com.onesignal.f0.g(f21882e, true, z10, new l(f0Var));
        }
    }

    static d2 m0() {
        if (f21883e0 == null) {
            f21883e0 = new d2("onOSPermissionChanged", true);
        }
        return f21883e0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m1(int i10) {
        return i10 < -6;
    }

    private static u3 n0() {
        u3 y3Var;
        u3 u3Var = f21905p0;
        if (u3Var != null) {
            return u3Var;
        }
        if (OSUtils.C()) {
            y3Var = new v3();
        } else {
            if (OSUtils.B()) {
                if (OSUtils.r()) {
                    y3Var = o0();
                }
                return f21905p0;
            }
            y3Var = new y3();
        }
        f21905p0 = y3Var;
        return f21905p0;
    }

    private static boolean n1() {
        String strA;
        Context contextB;
        if (f21909t) {
            return false;
        }
        com.onesignal.q qVar = f21877b0;
        if (qVar == null) {
            strA = t0();
            contextB = f21882e;
            f21915z.a("Trying to continue OneSignal with null delayed params");
        } else {
            strA = qVar.a();
            contextB = f21877b0.b();
        }
        f21915z.f("reassignDelayedInitParams with appContext: " + f21882e);
        f21877b0 = null;
        G1(strA);
        if (f21909t) {
            return true;
        }
        if (contextB == null) {
            f21915z.a("Trying to continue OneSignal with null delayed params context");
            return false;
        }
        Q0(contextB);
        return true;
    }

    private static x3 o0() {
        o3.d dVar = E.d().f22193o;
        return new x3(f21882e, dVar != null ? new x3.a(dVar.f22168a, dVar.f22169b, dVar.f22170c) : null);
    }

    static void o1() {
        V(f21882e).d();
    }

    static j2 p0() {
        return E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p1() {
        n0().a(f21882e, f21888h, new o());
    }

    static o3.f q0() {
        return E.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q1() throws InterruptedException {
        f21915z.f("registerUser:registerForPushFired:" + S + ", locationFired: " + T + ", remoteParams: " + q0() + ", appId: " + f21886g);
        if (!S || !T || q0() == null || f21886g == null) {
            f21915z.f("registerUser not possible");
        } else {
            OSUtils.W(new Thread(new a(), "OS_REG_USER"));
        }
    }

    static String r0() {
        if (f21898m == null && f21882e != null) {
            f21898m = n3.f(n3.f22119a, "PREFS_OS_SMS_ID", null);
        }
        if (TextUtils.isEmpty(f21898m)) {
            return null;
        }
        return f21898m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r1() throws JSONException {
        f0.d dVar;
        String packageName = f21882e.getPackageName();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", t0());
        jSONObject.put("device_os", Build.VERSION.RELEASE);
        jSONObject.put("timezone", D0());
        jSONObject.put("timezone_id", C0());
        jSONObject.put("language", f21902o.b());
        jSONObject.put("sdk", "040810");
        jSONObject.put("sdk_type", P);
        jSONObject.put("android_package", packageName);
        jSONObject.put("device_model", Build.MODEL);
        Integer numR = R();
        if (numR != null) {
            jSONObject.put("game_version", numR);
        }
        jSONObject.put("net_type", R.i());
        jSONObject.put("carrier", R.d());
        jSONObject.put("rooted", d4.a());
        s3.v(jSONObject, null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("identifier", Q);
        jSONObject2.put("subscribableStatus", f21900n);
        jSONObject2.put("androidPermission", C());
        jSONObject2.put("device_type", R.e());
        s3.x(jSONObject2);
        if (V0() && (dVar = X) != null) {
            s3.w(dVar);
        }
        f21915z.f("registerUserTask calling readyToUpdate");
        s3.m(true);
        V = false;
    }

    static d2 s0() {
        if (f21901n0 == null) {
            f21901n0 = new d2("onSMSSubscriptionChanged", true);
        }
        return f21901n0;
    }

    static void s1(x xVar) {
        f21880d.remove(xVar);
    }

    static String t0() {
        return u0(f21882e);
    }

    public static void t1(int i10) {
        if (G.g("removeNotification()") || N == null) {
            f21915z.a("Waiting for remote params. Moving removeNotification() operation to a pending queue.");
            G.c(new m(i10));
        } else {
            if (R1("removeNotification()")) {
                return;
            }
            N.k(i10, new WeakReference(f21882e));
        }
    }

    private static String u0(Context context) {
        if (context == null) {
            return null;
        }
        return n3.f(n3.f22119a, "GT_APP_ID", null);
    }

    public static boolean u1() {
        return f21882e == null || (Y0() && !Z1());
    }

    private static String v0(Context context) {
        if (context == null) {
            return null;
        }
        return n3.f(n3.f22119a, "GT_PLAYER_ID", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v1() {
        if (E0() == null) {
            f21915z.b("getTags called under a null user!");
        } else {
            R0();
        }
    }

    public static String w0() {
        return "040810";
    }

    private static void w1(JSONArray jSONArray) {
        if (f21907r == null) {
            Y.add(jSONArray);
            return;
        }
        b2 b2VarP = P(jSONArray);
        x(b2VarP, f21911v);
        M(b2VarP);
    }

    static void x(x xVar, s sVar) {
        if (sVar.equals(s.NOTIFICATION_CLICK)) {
            return;
        }
        f21880d.add(xVar);
    }

    static m2 x0() {
        return K;
    }

    private static void x1(String str) {
        if (f21882e == null) {
            return;
        }
        n3.m(n3.f22119a, "GT_APP_ID", str);
    }

    static void y(JSONObject jSONObject) {
        try {
            jSONObject.put("net_type", R.i());
        } catch (Throwable unused) {
        }
    }

    static n2 y0() {
        return I;
    }

    static void y1(String str) {
        f21896l = str;
        if (f21882e == null) {
            return;
        }
        n3.m(n3.f22119a, "OS_EMAIL_ID", "".equals(f21896l) ? null : f21896l);
    }

    public static void z(p2 p2Var) {
        if (f21882e == null) {
            f21915z.a("OneSignal.initWithContext has not been called. Could not add subscription observer");
            return;
        }
        z0().a(p2Var);
        if (X(f21882e).a(i0(f21882e))) {
            OSSubscriptionChangedInternalObserver.a(X(f21882e));
        }
    }

    static d2 z0() {
        if (f21889h0 == null) {
            f21889h0 = new d2("onOSSubscriptionChanged", true);
        }
        return f21889h0;
    }

    static void z1(String str) {
        f21898m = str;
        if (f21882e == null) {
            return;
        }
        n3.m(n3.f22119a, "PREFS_OS_SMS_ID", "".equals(f21898m) ? null : f21898m);
    }
}
