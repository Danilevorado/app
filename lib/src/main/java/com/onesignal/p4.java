package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.e3;
import com.onesignal.f0;
import com.onesignal.p3;
import com.onesignal.s3;
import java.util.HashMap;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class p4 {

    /* renamed from: b, reason: collision with root package name */
    private s3.c f22232b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22233c;

    /* renamed from: k, reason: collision with root package name */
    private h4 f22241k;

    /* renamed from: l, reason: collision with root package name */
    private h4 f22242l;

    /* renamed from: a, reason: collision with root package name */
    protected final Object f22231a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private AtomicBoolean f22234d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private final Queue f22235e = new LinkedBlockingQueue();

    /* renamed from: f, reason: collision with root package name */
    private final Queue f22236f = new LinkedBlockingQueue();

    /* renamed from: g, reason: collision with root package name */
    private final Queue f22237g = new LinkedBlockingQueue();

    /* renamed from: h, reason: collision with root package name */
    HashMap f22238h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private final Object f22239i = new a();

    /* renamed from: j, reason: collision with root package name */
    protected boolean f22240j = false;

    class a {
        a() {
        }
    }

    class b extends p3.g {
        b() {
        }

        @Override // com.onesignal.p3.g
        void a(int i10, String str, Throwable th) throws JSONException {
            e3.a(e3.z.WARN, "Failed last request. statusCode: " + i10 + "\nresponse: " + str);
            if (p4.this.T(i10, str, "already logged out of email")) {
                p4.this.N();
            } else if (p4.this.T(i10, str, "not a valid device_type")) {
                p4.this.J();
            } else {
                p4.this.I(i10);
            }
        }

        @Override // com.onesignal.p3.g
        void b(String str) {
            p4.this.N();
        }
    }

    class c extends p3.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f22245a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f22246b;

        c(JSONObject jSONObject, JSONObject jSONObject2) {
            this.f22245a = jSONObject;
            this.f22246b = jSONObject2;
        }

        @Override // com.onesignal.p3.g
        void a(int i10, String str, Throwable th) {
            e3.z zVar = e3.z.ERROR;
            e3.a(zVar, "Failed PUT sync request with status code: " + i10 + " and response: " + str);
            synchronized (p4.this.f22231a) {
                if (p4.this.T(i10, str, "No user with this id found")) {
                    p4.this.J();
                } else {
                    p4.this.I(i10);
                }
            }
            if (this.f22245a.has("tags")) {
                p4.this.X(new e3.n0(i10, str));
            }
            if (this.f22245a.has("external_user_id")) {
                e3.i1(zVar, "Error setting external user id for push with status code: " + i10 + " and message: " + str);
                p4.this.u();
            }
            if (this.f22245a.has("language")) {
                p4.this.p(new s3.b(i10, str));
            }
        }

        @Override // com.onesignal.p3.g
        void b(String str) {
            synchronized (p4.this.f22231a) {
                p4.this.A().r(this.f22246b, this.f22245a);
                p4.this.P(this.f22245a);
            }
            if (this.f22245a.has("tags")) {
                p4.this.Y();
            }
            if (this.f22245a.has("external_user_id")) {
                p4.this.v();
            }
            if (this.f22245a.has("language")) {
                p4.this.q();
            }
        }
    }

    class d extends p3.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f22248a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f22249b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f22250c;

        d(JSONObject jSONObject, JSONObject jSONObject2, String str) {
            this.f22248a = jSONObject;
            this.f22249b = jSONObject2;
            this.f22250c = str;
        }

        @Override // com.onesignal.p3.g
        void a(int i10, String str, Throwable th) {
            synchronized (p4.this.f22231a) {
                p4.this.f22240j = false;
                e3.a(e3.z.WARN, "Failed last request. statusCode: " + i10 + "\nresponse: " + str);
                if (p4.this.T(i10, str, "not a valid device_type")) {
                    p4.this.J();
                } else {
                    p4.this.I(i10);
                }
            }
        }

        @Override // com.onesignal.p3.g
        void b(String str) {
            synchronized (p4.this.f22231a) {
                p4 p4Var = p4.this;
                p4Var.f22240j = false;
                p4Var.A().r(this.f22248a, this.f22249b);
                try {
                    e3.i1(e3.z.DEBUG, "doCreateOrNewSession:response: " + str);
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("id")) {
                        String strOptString = jSONObject.optString("id");
                        p4.this.d0(strOptString);
                        e3.a(e3.z.INFO, "Device registered, UserId = " + strOptString);
                    } else {
                        e3.a(e3.z.INFO, "session sent, UserId = " + this.f22250c);
                    }
                    p4.this.H().s("session", Boolean.FALSE);
                    p4.this.H().q();
                    if (jSONObject.has("in_app_messages")) {
                        e3.g0().o0(jSONObject.getJSONArray("in_app_messages"));
                    }
                    p4.this.P(this.f22249b);
                } catch (JSONException e5) {
                    e3.b(e3.z.ERROR, "ERROR parsing on_session or create JSON Response.", e5);
                }
            }
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        boolean f22252a;

        /* renamed from: b, reason: collision with root package name */
        JSONObject f22253b;

        e(boolean z10, JSONObject jSONObject) {
            this.f22252a = z10;
            this.f22253b = jSONObject;
        }
    }

    class f extends HandlerThread {

        /* renamed from: m, reason: collision with root package name */
        int f22254m;

        /* renamed from: n, reason: collision with root package name */
        Handler f22255n;

        /* renamed from: o, reason: collision with root package name */
        int f22256o;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!p4.this.f22234d.get()) {
                    p4.this.b0(false);
                }
            }
        }

        f(int i10) {
            super("OSH_NetworkHandlerThread_" + p4.this.f22232b);
            this.f22254m = i10;
            start();
            this.f22255n = new Handler(getLooper());
        }

        private Runnable b() {
            if (this.f22254m != 0) {
                return null;
            }
            return new a();
        }

        boolean a() {
            boolean zHasMessages;
            synchronized (this.f22255n) {
                boolean z10 = this.f22256o < 3;
                boolean zHasMessages2 = this.f22255n.hasMessages(0);
                if (z10 && !zHasMessages2) {
                    this.f22256o++;
                    this.f22255n.postDelayed(b(), this.f22256o * 15000);
                }
                zHasMessages = this.f22255n.hasMessages(0);
            }
            return zHasMessages;
        }

        void c() {
            if (p4.this.f22233c) {
                synchronized (this.f22255n) {
                    this.f22256o = 0;
                    this.f22255n.removeCallbacksAndMessages(null);
                    this.f22255n.postDelayed(b(), 5000L);
                }
            }
        }
    }

    p4(s3.c cVar) {
        this.f22232b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(int i10) throws JSONException {
        if (i10 == 403) {
            e3.a(e3.z.FATAL, "403 error updating player, omitting further retries!");
            x();
        } else {
            if (D(0).a()) {
                return;
            }
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        e3.a(e3.z.WARN, "Creating new player based on missing player_id noted above.");
        e3.L0();
        S();
        d0(null);
        U();
    }

    private void L(boolean z10) throws JSONException {
        String strB = B();
        if (a0() && strB != null) {
            s(strB);
            return;
        }
        if (this.f22241k == null) {
            K();
        }
        boolean z11 = !z10 && M();
        synchronized (this.f22231a) {
            JSONObject jSONObjectD = A().d(G(), z11);
            JSONObject jSONObjectF = A().f(G(), null);
            e3.i1(e3.z.DEBUG, "UserStateSynchronizer internalSyncUserState from session call: " + z11 + " jsonBody: " + jSONObjectD);
            if (jSONObjectD == null) {
                A().r(jSONObjectF, null);
                Y();
                v();
                q();
                return;
            }
            G().q();
            if (z11) {
                r(strB, jSONObjectD, jSONObjectF);
            } else {
                t(strB, jSONObjectD, jSONObjectF);
            }
        }
    }

    private boolean M() {
        return (G().i().b("session") || B() == null) && !this.f22240j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        G().v("logoutEmail");
        this.f22242l.v("email_auth_hash");
        this.f22242l.w("parent_player_id");
        this.f22242l.w("email");
        this.f22242l.q();
        A().v("email_auth_hash");
        A().w("parent_player_id");
        String strF = A().l().f("email");
        A().w("email");
        s3.s();
        e3.a(e3.z.INFO, "Device successfully logged out of email: " + strF);
        e3.L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean T(int i10, String str, String str2) {
        if (i10 == 400 && str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("errors")) {
                    return jSONObject.optString("errors").contains(str2);
                }
                return false;
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(e3.n0 n0Var) {
        while (true) {
            e3.t tVar = (e3.t) this.f22235e.poll();
            if (tVar == null) {
                return;
            } else {
                tVar.b(n0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        JSONObject jSONObject = s3.h(false).f22253b;
        while (true) {
            e3.t tVar = (e3.t) this.f22235e.poll();
            if (tVar == null) {
                return;
            } else {
                tVar.a(jSONObject);
            }
        }
    }

    private boolean a0() {
        return G().i().c("logoutEmail", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(s3.b bVar) {
        while (true) {
            s3.a aVar = (s3.a) this.f22237g.poll();
            if (aVar == null) {
                return;
            } else {
                aVar.b(bVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        String strC = s3.c();
        while (true) {
            s3.a aVar = (s3.a) this.f22237g.poll();
            if (aVar == null) {
                return;
            } else {
                aVar.a(strC);
            }
        }
    }

    private void r(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2;
        if (str == null) {
            str2 = "players";
        } else {
            str2 = "players/" + str + "/on_session";
        }
        this.f22240j = true;
        n(jSONObject);
        p3.k(str2, jSONObject, new d(jSONObject2, jSONObject, str));
    }

    private void s(String str) throws JSONException {
        String str2 = "players/" + str + "/email_logout";
        JSONObject jSONObject = new JSONObject();
        try {
            b0 b0VarI = A().i();
            if (b0VarI.a("email_auth_hash")) {
                jSONObject.put("email_auth_hash", b0VarI.f("email_auth_hash"));
            }
            b0 b0VarL = A().l();
            if (b0VarL.a("parent_player_id")) {
                jSONObject.put("parent_player_id", b0VarL.f("parent_player_id"));
            }
            jSONObject.put("app_id", b0VarL.f("app_id"));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        p3.k(str2, jSONObject, new b());
    }

    private void t(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (str == null) {
            e3.i1(C(), "Error updating the user record because of the null user id");
            X(new e3.n0(-1, "Unable to update tags: the current user is not registered with OneSignal"));
            u();
            p(new s3.b(-1, "Unable to set Language: the current user is not registered with OneSignal"));
            return;
        }
        p3.m("players/" + str, jSONObject, new c(jSONObject, jSONObject2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        while (true) {
            e3.c0 c0Var = (e3.c0) this.f22236f.poll();
            if (c0Var == null) {
                return;
            } else {
                c0Var.a(z(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        while (true) {
            e3.c0 c0Var = (e3.c0) this.f22236f.poll();
            if (c0Var == null) {
                return;
            } else {
                c0Var.a(z(), true);
            }
        }
    }

    private void x() throws JSONException {
        JSONObject jSONObjectD = A().d(this.f22242l, false);
        if (jSONObjectD != null) {
            w(jSONObjectD);
        }
        if (G().i().c("logoutEmail", false)) {
            e3.I0();
        }
    }

    protected h4 A() {
        if (this.f22241k == null) {
            synchronized (this.f22231a) {
                if (this.f22241k == null) {
                    this.f22241k = O("CURRENT_STATE", true);
                }
            }
        }
        return this.f22241k;
    }

    protected abstract String B();

    protected abstract e3.z C();

    protected f D(Integer num) {
        f fVar;
        synchronized (this.f22239i) {
            if (!this.f22238h.containsKey(num)) {
                this.f22238h.put(num, new f(num.intValue()));
            }
            fVar = (f) this.f22238h.get(num);
        }
        return fVar;
    }

    String E() {
        return G().l().g("identifier", null);
    }

    boolean F() {
        return H().i().b("session");
    }

    protected h4 G() {
        if (this.f22242l == null) {
            synchronized (this.f22231a) {
                if (this.f22242l == null) {
                    this.f22242l = O("TOSYNC_STATE", true);
                }
            }
        }
        return this.f22242l;
    }

    protected h4 H() {
        if (this.f22242l == null) {
            this.f22242l = A().c("TOSYNC_STATE");
        }
        U();
        return this.f22242l;
    }

    void K() {
        if (this.f22241k == null) {
            synchronized (this.f22231a) {
                if (this.f22241k == null) {
                    this.f22241k = O("CURRENT_STATE", true);
                }
            }
        }
        G();
    }

    protected abstract h4 O(String str, boolean z10);

    protected abstract void P(JSONObject jSONObject);

    boolean Q() {
        boolean z10;
        if (this.f22242l == null) {
            return false;
        }
        synchronized (this.f22231a) {
            z10 = A().d(this.f22242l, M()) != null;
            this.f22242l.q();
        }
        return z10;
    }

    void R(boolean z10) {
        boolean z11 = this.f22233c != z10;
        this.f22233c = z10;
        if (z11 && z10) {
            U();
        }
    }

    void S() {
        A().z(new JSONObject());
        A().q();
    }

    protected abstract void U();

    void V(JSONObject jSONObject, p3.g gVar) {
        p3.j("players/" + B() + "/on_purchase", jSONObject, gVar);
    }

    void W(JSONObject jSONObject, e3.t tVar) {
        if (tVar != null) {
            this.f22235e.add(tVar);
        }
        H().h(jSONObject, null);
    }

    void Z() {
        try {
            synchronized (this.f22231a) {
                H().s("session", Boolean.TRUE);
                H().q();
            }
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    void b0(boolean z10) {
        this.f22234d.set(true);
        L(z10);
        this.f22234d.set(false);
    }

    void c0(JSONObject jSONObject, s3.a aVar) {
        if (aVar != null) {
            this.f22237g.add(aVar);
        }
        H().h(jSONObject, null);
    }

    abstract void d0(String str);

    void e0(f0.d dVar) {
        H().y(dVar);
    }

    protected abstract void n(JSONObject jSONObject);

    void o() {
        G().b();
        G().q();
    }

    protected abstract void w(JSONObject jSONObject);

    protected JSONObject y(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set set) {
        JSONObject jSONObjectB;
        synchronized (this.f22231a) {
            jSONObjectB = e0.b(jSONObject, jSONObject2, jSONObject3, set);
        }
        return jSONObjectB;
    }

    String z() {
        return this.f22232b.name().toLowerCase();
    }
}
