package com.onesignal;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.onesignal.b1;
import com.onesignal.e3;
import com.onesignal.o1;
import com.onesignal.s2;
import com.onesignal.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class d1 extends r0 implements u0.c, s2.c {

    /* renamed from: u, reason: collision with root package name */
    private static final Object f21804u = new Object();

    /* renamed from: v, reason: collision with root package name */
    private static ArrayList f21805v = new h();

    /* renamed from: a, reason: collision with root package name */
    private final r1 f21806a;

    /* renamed from: b, reason: collision with root package name */
    private final t2 f21807b;

    /* renamed from: c, reason: collision with root package name */
    private final i7.a f21808c;

    /* renamed from: d, reason: collision with root package name */
    private s2 f21809d;

    /* renamed from: e, reason: collision with root package name */
    private o1 f21810e;

    /* renamed from: f, reason: collision with root package name */
    a3 f21811f;

    /* renamed from: h, reason: collision with root package name */
    private final Set f21813h;

    /* renamed from: i, reason: collision with root package name */
    private final Set f21814i;

    /* renamed from: j, reason: collision with root package name */
    private final Set f21815j;

    /* renamed from: k, reason: collision with root package name */
    private final Set f21816k;

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList f21817l;

    /* renamed from: t, reason: collision with root package name */
    Date f21825t;

    /* renamed from: m, reason: collision with root package name */
    private List f21818m = null;

    /* renamed from: n, reason: collision with root package name */
    private k1 f21819n = null;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21820o = true;

    /* renamed from: p, reason: collision with root package name */
    private boolean f21821p = false;

    /* renamed from: q, reason: collision with root package name */
    private String f21822q = "";

    /* renamed from: r, reason: collision with root package name */
    private c1 f21823r = null;

    /* renamed from: s, reason: collision with root package name */
    private boolean f21824s = false;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f21812g = new ArrayList();

    class a implements o1.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21826a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f1 f21827b;

        a(String str, f1 f1Var) {
            this.f21826a = str;
            this.f21827b = f1Var;
        }

        @Override // com.onesignal.o1.i
        public void a(String str) {
        }

        @Override // com.onesignal.o1.i
        public void b(String str) {
            d1.this.f21816k.remove(this.f21826a);
            this.f21827b.m(this.f21826a);
        }
    }

    class b extends com.onesignal.j {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ f1 f21829m;

        b(f1 f1Var) {
            this.f21829m = f1Var;
        }

        @Override // com.onesignal.j, java.lang.Runnable
        public void run() {
            super.run();
            d1.this.f21810e.A(this.f21829m);
            d1.this.f21810e.B(d1.this.f21825t);
        }
    }

    class c implements e3.a0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f21831a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f1 f21832b;

        c(boolean z10, f1 f1Var) {
            this.f21831a = z10;
            this.f21832b = f1Var;
        }

        @Override // com.onesignal.e3.a0
        public void a(JSONObject jSONObject) {
            d1.this.f21824s = false;
            if (jSONObject != null) {
                d1.this.f21822q = jSONObject.toString();
            }
            if (d1.this.f21823r != null) {
                if (!this.f21831a) {
                    e3.x0().k(this.f21832b.f21691a);
                }
                c1 c1Var = d1.this.f21823r;
                d1 d1Var = d1.this;
                c1Var.h(d1Var.w0(d1Var.f21823r.a()));
                q4.I(this.f21832b, d1.this.f21823r);
                d1.this.f21823r = null;
            }
        }
    }

    class d implements o1.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1 f21834a;

        d(f1 f1Var) {
            this.f21834a = f1Var;
        }

        @Override // com.onesignal.o1.i
        public void a(String str) {
            try {
                c1 c1VarK0 = d1.this.k0(new JSONObject(str), this.f21834a);
                if (c1VarK0.a() == null) {
                    d1.this.f21806a.f("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                    return;
                }
                if (d1.this.f21824s) {
                    d1.this.f21823r = c1VarK0;
                    return;
                }
                e3.x0().k(this.f21834a.f21691a);
                d1.this.i0(this.f21834a);
                c1VarK0.h(d1.this.w0(c1VarK0.a()));
                q4.I(this.f21834a, c1VarK0);
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }

        @Override // com.onesignal.o1.i
        public void b(String str) {
            d1.this.f21821p = false;
            try {
                if (new JSONObject(str).getBoolean("retry")) {
                    d1.this.n0(this.f21834a);
                } else {
                    d1.this.b0(this.f21834a, true);
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
    }

    class e implements o1.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1 f21836a;

        e(f1 f1Var) {
            this.f21836a = f1Var;
        }

        @Override // com.onesignal.o1.i
        public void a(String str) {
            try {
                c1 c1VarK0 = d1.this.k0(new JSONObject(str), this.f21836a);
                if (c1VarK0.a() == null) {
                    d1.this.f21806a.f("displayPreviewMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                } else {
                    if (d1.this.f21824s) {
                        d1.this.f21823r = c1VarK0;
                        return;
                    }
                    d1.this.i0(this.f21836a);
                    c1VarK0.h(d1.this.w0(c1VarK0.a()));
                    q4.I(this.f21836a, c1VarK0);
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }

        @Override // com.onesignal.o1.i
        public void b(String str) {
            d1.this.H(null);
        }
    }

    class f extends com.onesignal.j {
        f() {
        }

        @Override // com.onesignal.j, java.lang.Runnable
        public void run() {
            super.run();
            d1.this.f21810e.h();
        }
    }

    class g implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Map f21839m;

        g(Map map) {
            this.f21839m = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            d1.this.f21806a.f("Delaying addTriggers due to redisplay data not retrieved yet");
            d1.this.F(this.f21839m.keySet());
        }
    }

    class h extends ArrayList {
        h() {
            add("android");
            add("app");
            add("all");
        }
    }

    class i extends com.onesignal.j {
        i() {
        }

        @Override // com.onesignal.j, java.lang.Runnable
        public void run() {
            super.run();
            synchronized (d1.f21804u) {
                d1 d1Var = d1.this;
                d1Var.f21818m = d1Var.f21810e.k();
                d1.this.f21806a.f("Retrieved IAMs from DB redisplayedInAppMessages: " + d1.this.f21818m.toString());
            }
        }
    }

    class j implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ JSONArray f21842m;

        j(JSONArray jSONArray) {
            this.f21842m = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            d1.this.p0();
            try {
                d1.this.m0(this.f21842m);
            } catch (JSONException e5) {
                d1.this.f21806a.d("ERROR processing InAppMessageJson JSON Response.", e5);
            }
        }
    }

    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d1.this.f21806a.f("Delaying evaluateInAppMessages due to redisplay data not retrieved yet");
            d1.this.K();
        }
    }

    class l implements o1.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1 f21845a;

        l(f1 f1Var) {
            this.f21845a = f1Var;
        }

        @Override // com.onesignal.o1.i
        public void a(String str) {
        }

        @Override // com.onesignal.o1.i
        public void b(String str) {
            d1.this.f21814i.remove(this.f21845a.f21691a);
        }
    }

    class m implements e3.f0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f1 f21847a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f21848b;

        m(f1 f1Var, List list) {
            this.f21847a = f1Var;
            this.f21848b = list;
        }

        @Override // com.onesignal.e3.f0
        public void a(e3.k0 k0Var) {
            d1.this.f21819n = null;
            d1.this.f21806a.f("IAM prompt to handle finished with result: " + k0Var);
            f1 f1Var = this.f21847a;
            if (f1Var.f22004k && k0Var == e3.k0.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                d1.this.u0(f1Var, this.f21848b);
            } else {
                d1.this.v0(f1Var, this.f21848b);
            }
        }
    }

    class n implements DialogInterface.OnClickListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ f1 f21850m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f21851n;

        n(f1 f1Var, List list) {
            this.f21850m = f1Var;
            this.f21851n = list;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            d1.this.v0(this.f21850m, this.f21851n);
        }
    }

    class o implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f21853m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ b1 f21854n;

        o(String str, b1 b1Var) {
            this.f21853m = str;
            this.f21854n = b1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            e3.x0().h(this.f21853m);
            e3.f21908s.a(this.f21854n);
        }
    }

    class p implements o1.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21856a;

        p(String str) {
            this.f21856a = str;
        }

        @Override // com.onesignal.o1.i
        public void a(String str) {
        }

        @Override // com.onesignal.o1.i
        public void b(String str) {
            d1.this.f21815j.remove(this.f21856a);
        }
    }

    protected d1(l3 l3Var, t2 t2Var, r1 r1Var, n2 n2Var, i7.a aVar) {
        this.f21825t = null;
        this.f21807b = t2Var;
        Set setK = OSUtils.K();
        this.f21813h = setK;
        this.f21817l = new ArrayList();
        Set setK2 = OSUtils.K();
        this.f21814i = setK2;
        Set setK3 = OSUtils.K();
        this.f21815j = setK3;
        Set setK4 = OSUtils.K();
        this.f21816k = setK4;
        this.f21811f = new a3(this);
        this.f21809d = new s2(this);
        this.f21808c = aVar;
        this.f21806a = r1Var;
        o1 o1VarS = S(l3Var, r1Var, n2Var);
        this.f21810e = o1VarS;
        Set setM = o1VarS.m();
        if (setM != null) {
            setK.addAll(setM);
        }
        Set setP = this.f21810e.p();
        if (setP != null) {
            setK2.addAll(setP);
        }
        Set setS = this.f21810e.s();
        if (setS != null) {
            setK3.addAll(setS);
        }
        Set setL = this.f21810e.l();
        if (setL != null) {
            setK4.addAll(setL);
        }
        Date dateQ = this.f21810e.q();
        if (dateQ != null) {
            this.f21825t = dateQ;
        }
        V();
    }

    private void D() {
        synchronized (this.f21817l) {
            if (!this.f21809d.c()) {
                this.f21806a.b("In app message not showing due to system condition not correct");
                return;
            }
            this.f21806a.f("displayFirstIAMOnQueue: " + this.f21817l);
            if (this.f21817l.size() > 0 && !X()) {
                this.f21806a.f("No IAM showing currently, showing first item in the queue!");
                I((f1) this.f21817l.get(0));
                return;
            }
            this.f21806a.f("In app message is currently showing or there are no IAMs left in the queue! isInAppMessageShowing: " + X());
        }
    }

    private void E(f1 f1Var, List list) {
        if (list.size() > 0) {
            this.f21806a.f("IAM showing prompts from IAM: " + f1Var.toString());
            q4.x();
            v0(f1Var, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(Collection collection) {
        Z(collection);
        K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(f1 f1Var) {
        e3.x0().i();
        if (t0()) {
            this.f21806a.f("Stop evaluateMessageDisplayQueue because prompt is currently displayed");
            return;
        }
        this.f21821p = false;
        synchronized (this.f21817l) {
            if (f1Var != null) {
                if (!f1Var.f22004k && this.f21817l.size() > 0) {
                    if (!this.f21817l.contains(f1Var)) {
                        this.f21806a.f("Message already removed from the queue!");
                        return;
                    }
                    String str = ((f1) this.f21817l.remove(0)).f21691a;
                    this.f21806a.f("In app message with id: " + str + ", dismissed (removed) from the queue!");
                }
            }
            if (this.f21817l.size() > 0) {
                this.f21806a.f("In app message on queue available: " + ((f1) this.f21817l.get(0)).f21691a);
                I((f1) this.f21817l.get(0));
            } else {
                this.f21806a.f("In app message dismissed evaluating messages");
                K();
            }
        }
    }

    private void I(f1 f1Var) {
        if (!this.f21820o) {
            this.f21806a.c("In app messaging is currently paused, in app messages will not be shown!");
            return;
        }
        this.f21821p = true;
        T(f1Var, false);
        this.f21810e.n(e3.f21886g, f1Var.f21691a, x0(f1Var), new d(f1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        this.f21806a.f("Starting evaluateInAppMessages");
        if (s0()) {
            this.f21807b.c(new k());
            return;
        }
        Iterator it = this.f21812g.iterator();
        while (it.hasNext()) {
            f1 f1Var = (f1) it.next();
            if (this.f21811f.c(f1Var)) {
                r0(f1Var);
                if (!this.f21813h.contains(f1Var.f21691a) && !f1Var.h()) {
                    n0(f1Var);
                }
            }
        }
    }

    private void M(b1 b1Var) {
        if (b1Var.b() == null || b1Var.b().isEmpty()) {
            return;
        }
        if (b1Var.f() == b1.a.BROWSER) {
            OSUtils.N(b1Var.b());
        } else if (b1Var.f() == b1.a.IN_APP_WEBVIEW) {
            j3.b(b1Var.b(), true);
        }
    }

    private void N(String str, List list) {
        e3.x0().h(str);
        e3.C1(list);
    }

    private void O(String str, b1 b1Var) {
        if (e3.f21908s == null) {
            return;
        }
        com.onesignal.p.f22194a.b(new o(str, b1Var));
    }

    private void P(f1 f1Var, b1 b1Var) {
        String strX0 = x0(f1Var);
        if (strX0 == null) {
            return;
        }
        String strA = b1Var.a();
        if ((f1Var.e().e() && f1Var.f(strA)) || !this.f21816k.contains(strA)) {
            this.f21816k.add(strA);
            f1Var.a(strA);
            this.f21810e.D(e3.f21886g, e3.E0(), strX0, new OSUtils().e(), f1Var.f21691a, strA, b1Var.g(), this.f21816k, new a(strA, f1Var));
        }
    }

    private void Q(f1 f1Var, i1 i1Var) {
        String strX0 = x0(f1Var);
        if (strX0 == null) {
            return;
        }
        String strA = i1Var.a();
        String str = f1Var.f21691a + strA;
        if (!this.f21815j.contains(str)) {
            this.f21815j.add(str);
            this.f21810e.F(e3.f21886g, e3.E0(), strX0, new OSUtils().e(), f1Var.f21691a, strA, this.f21815j, new p(str));
            return;
        }
        this.f21806a.c("Already sent page impression for id: " + strA);
    }

    private void R(b1 b1Var) {
        if (b1Var.e() != null) {
            p1 p1VarE = b1Var.e();
            if (p1VarE.a() != null) {
                e3.E1(p1VarE.a());
            }
            if (p1VarE.b() != null) {
                e3.G(p1VarE.b(), null);
            }
        }
    }

    private void T(f1 f1Var, boolean z10) {
        this.f21824s = false;
        if (z10 || f1Var.d()) {
            this.f21824s = true;
            e3.A0(new c(z10, f1Var));
        }
    }

    private boolean U(f1 f1Var) {
        if (this.f21811f.f(f1Var)) {
            return !f1Var.g();
        }
        return f1Var.i() || (!f1Var.g() && f1Var.f21996c.isEmpty());
    }

    private void Y(b1 b1Var) {
        if (b1Var.e() != null) {
            this.f21806a.f("Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + b1Var.e().toString());
        }
        if (b1Var.c().size() > 0) {
            this.f21806a.f("Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + b1Var.c().toString());
        }
    }

    private void Z(Collection collection) {
        Iterator it = this.f21812g.iterator();
        while (it.hasNext()) {
            f1 f1Var = (f1) it.next();
            if (!f1Var.i() && this.f21818m.contains(f1Var) && this.f21811f.e(f1Var, collection)) {
                this.f21806a.f("Trigger changed for message: " + f1Var.toString());
                f1Var.p(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c1 k0(JSONObject jSONObject, f1 f1Var) {
        c1 c1Var = new c1(jSONObject);
        f1Var.n(c1Var.b().doubleValue());
        return c1Var;
    }

    private void l0(f1 f1Var) {
        f1Var.e().h(e3.B0().b() / 1000);
        f1Var.e().c();
        f1Var.p(false);
        f1Var.o(true);
        d(new b(f1Var), "OS_IAM_DB_ACCESS");
        int iIndexOf = this.f21818m.indexOf(f1Var);
        if (iIndexOf != -1) {
            this.f21818m.set(iIndexOf, f1Var);
        } else {
            this.f21818m.add(f1Var);
        }
        this.f21806a.f("persistInAppMessageForRedisplay: " + f1Var.toString() + " with msg array data: " + this.f21818m.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(JSONArray jSONArray) {
        synchronized (f21804u) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                f1 f1Var = new f1(jSONArray.getJSONObject(i10));
                if (f1Var.f21691a != null) {
                    arrayList.add(f1Var);
                }
            }
            this.f21812g = arrayList;
        }
        K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(f1 f1Var) {
        synchronized (this.f21817l) {
            if (!this.f21817l.contains(f1Var)) {
                this.f21817l.add(f1Var);
                this.f21806a.f("In app message with id: " + f1Var.f21691a + ", added to the queue");
            }
            D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0() {
        Iterator it = this.f21818m.iterator();
        while (it.hasNext()) {
            ((f1) it.next()).o(false);
        }
    }

    private void r0(f1 f1Var) {
        boolean zContains = this.f21813h.contains(f1Var.f21691a);
        int iIndexOf = this.f21818m.indexOf(f1Var);
        if (!zContains || iIndexOf == -1) {
            return;
        }
        f1 f1Var2 = (f1) this.f21818m.get(iIndexOf);
        f1Var.e().g(f1Var2.e());
        f1Var.o(f1Var2.g());
        boolean zU = U(f1Var);
        this.f21806a.f("setDataForRedisplay: " + f1Var.toString() + " triggerHasChanged: " + zU);
        if (zU && f1Var.e().d() && f1Var.e().i()) {
            this.f21806a.f("setDataForRedisplay message available for redisplay: " + f1Var.f21691a);
            this.f21813h.remove(f1Var.f21691a);
            this.f21814i.remove(f1Var.f21691a);
            this.f21815j.clear();
            this.f21810e.C(this.f21815j);
            f1Var.b();
        }
    }

    private boolean t0() {
        return this.f21819n != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(f1 f1Var, List list) {
        String string = e3.f21882e.getString(c4.f21792b);
        new AlertDialog.Builder(e3.T()).setTitle(string).setMessage(e3.f21882e.getString(c4.f21791a)).setPositiveButton(R.string.ok, new n(f1Var, list)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0(f1 f1Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            k1 k1Var = (k1) it.next();
            if (!k1Var.c()) {
                this.f21819n = k1Var;
                break;
            }
        }
        if (this.f21819n == null) {
            this.f21806a.f("No IAM prompt to handle, dismiss message: " + f1Var.f21691a);
            a0(f1Var);
            return;
        }
        this.f21806a.f("IAM prompt to handle: " + this.f21819n.toString());
        this.f21819n.d(true);
        this.f21819n.b(new m(f1Var, list));
    }

    private String x0(f1 f1Var) {
        String strB = this.f21808c.b();
        Iterator it = f21805v.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (f1Var.f21995b.containsKey(str)) {
                HashMap map = (HashMap) f1Var.f21995b.get(str);
                if (!map.containsKey(strB)) {
                    strB = "default";
                }
                return (String) map.get(strB);
            }
        }
        return null;
    }

    void C(Map map) {
        this.f21806a.f("Triggers added: " + map.toString());
        this.f21811f.a(map);
        if (s0()) {
            this.f21807b.c(new g(map));
        } else {
            F(map.keySet());
        }
    }

    void G() {
        d(new f(), "OS_IAM_DB_ACCESS");
    }

    void J(String str) {
        this.f21821p = true;
        f1 f1Var = new f1(true);
        T(f1Var, true);
        this.f21810e.o(e3.f21886g, str, new e(f1Var));
    }

    void L(Runnable runnable) {
        synchronized (f21804u) {
            if (s0()) {
                this.f21806a.f("Delaying task due to redisplay data not retrieved yet");
                this.f21807b.c(runnable);
            } else {
                runnable.run();
            }
        }
    }

    o1 S(l3 l3Var, r1 r1Var, n2 n2Var) {
        if (this.f21810e == null) {
            this.f21810e = new o1(l3Var, r1Var, n2Var);
        }
        return this.f21810e;
    }

    protected void V() {
        this.f21807b.c(new i());
        this.f21807b.f();
    }

    void W() {
        if (!this.f21812g.isEmpty()) {
            this.f21806a.f("initWithCachedInAppMessages with already in memory messages: " + this.f21812g);
            return;
        }
        String strR = this.f21810e.r();
        this.f21806a.f("initWithCachedInAppMessages: " + strR);
        if (strR == null || strR.isEmpty()) {
            return;
        }
        synchronized (f21804u) {
            try {
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            if (this.f21812g.isEmpty()) {
                m0(new JSONArray(strR));
            }
        }
    }

    boolean X() {
        return this.f21821p;
    }

    @Override // com.onesignal.u0.c
    public void a() {
        this.f21806a.f("messageTriggerConditionChanged called");
        K();
    }

    void a0(f1 f1Var) {
        b0(f1Var, false);
    }

    @Override // com.onesignal.u0.c
    public void b(String str) {
        this.f21806a.f("messageDynamicTriggerCompleted called with triggerId: " + str);
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        Z(hashSet);
    }

    void b0(f1 f1Var, boolean z10) {
        if (!f1Var.f22004k) {
            this.f21813h.add(f1Var.f21691a);
            if (!z10) {
                this.f21810e.x(this.f21813h);
                this.f21825t = new Date();
                l0(f1Var);
            }
            this.f21806a.f("OSInAppMessageController messageWasDismissed dismissedMessages: " + this.f21813h.toString());
        }
        if (!t0()) {
            e0(f1Var);
        }
        H(f1Var);
    }

    @Override // com.onesignal.s2.c
    public void c() {
        D();
    }

    void c0(f1 f1Var, JSONObject jSONObject) {
        b1 b1Var = new b1(jSONObject);
        b1Var.j(f1Var.q());
        O(f1Var.f21691a, b1Var);
        E(f1Var, b1Var.d());
        M(b1Var);
        P(f1Var, b1Var);
        R(b1Var);
        N(f1Var.f21691a, b1Var.c());
    }

    void d0(f1 f1Var, JSONObject jSONObject) {
        b1 b1Var = new b1(jSONObject);
        b1Var.j(f1Var.q());
        O(f1Var.f21691a, b1Var);
        E(f1Var, b1Var.d());
        M(b1Var);
        Y(b1Var);
    }

    void e0(f1 f1Var) {
        this.f21806a.c("OSInAppMessageController onMessageDidDismiss: inAppMessageLifecycleHandler is null");
    }

    void f0(f1 f1Var) {
        this.f21806a.c("OSInAppMessageController onMessageDidDisplay: inAppMessageLifecycleHandler is null");
    }

    void g0(f1 f1Var) {
        f0(f1Var);
        if (f1Var.f22004k || this.f21814i.contains(f1Var.f21691a)) {
            return;
        }
        this.f21814i.add(f1Var.f21691a);
        String strX0 = x0(f1Var);
        if (strX0 == null) {
            return;
        }
        this.f21810e.E(e3.f21886g, e3.E0(), strX0, new OSUtils().e(), f1Var.f21691a, this.f21814i, new l(f1Var));
    }

    void h0(f1 f1Var) {
        this.f21806a.c("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
    }

    void i0(f1 f1Var) {
        this.f21806a.c("OSInAppMessageController onMessageWillDisplay: inAppMessageLifecycleHandler is null");
    }

    void j0(f1 f1Var, JSONObject jSONObject) {
        i1 i1Var = new i1(jSONObject);
        if (f1Var.f22004k) {
            return;
        }
        Q(f1Var, i1Var);
    }

    void o0(JSONArray jSONArray) {
        this.f21810e.y(jSONArray.toString());
        L(new j(jSONArray));
    }

    void q0() {
        u0.e();
    }

    boolean s0() {
        boolean z10;
        synchronized (f21804u) {
            z10 = this.f21818m == null && this.f21807b.e();
        }
        return z10;
    }

    String w0(String str) {
        return str + String.format("\n\n<script>\n    setPlayerTags(%s);\n</script>", this.f21822q);
    }
}
