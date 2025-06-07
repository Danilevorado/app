package com.onesignal;

import com.onesignal.e3;
import com.onesignal.p3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    private Long f22331a;

    /* renamed from: b, reason: collision with root package name */
    private Object f22332b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private z0 f22333c;

    /* renamed from: d, reason: collision with root package name */
    private r1 f22334d;

    private enum a {
        BACKGROUND,
        END_SESSION
    }

    static class b extends c {
        b() {
            this.f22338a = 1L;
            this.f22339b = "OS_UNSENT_ATTRIBUTED_ACTIVE_TIME";
        }

        @Override // com.onesignal.s.c
        protected void h(JSONObject jSONObject) {
            e3.x0().b(jSONObject, j());
        }

        @Override // com.onesignal.s.c
        protected List j() {
            ArrayList arrayList = new ArrayList();
            Iterator it = n3.g(n3.f22119a, "PREFS_OS_ATTRIBUTED_INFLUENCES", new HashSet()).iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(new h7.a((String) it.next()));
                } catch (JSONException e5) {
                    e3.a(e3.z.ERROR, getClass().getSimpleName() + ": error generation OSInfluence from json object: " + e5);
                }
            }
            return arrayList;
        }

        @Override // com.onesignal.s.c
        protected void m(List list) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(((h7.a) it.next()).g());
                } catch (JSONException e5) {
                    e3.a(e3.z.ERROR, getClass().getSimpleName() + ": error generation json object OSInfluence: " + e5);
                }
            }
            n3.n(n3.f22119a, "PREFS_OS_ATTRIBUTED_INFLUENCES", hashSet);
        }

        @Override // com.onesignal.s.c
        protected void r(a aVar) {
            e3.i1(e3.z.DEBUG, getClass().getSimpleName() + " sendTime with: " + aVar);
            if (aVar.equals(a.END_SESSION)) {
                u();
            } else {
                r2.q().s(e3.f21882e);
            }
        }
    }

    static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        protected long f22338a;

        /* renamed from: b, reason: collision with root package name */
        protected String f22339b;

        /* renamed from: c, reason: collision with root package name */
        private Long f22340c = null;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f22341d = new AtomicBoolean();

        class a extends p3.g {
            a() {
            }

            @Override // com.onesignal.p3.g
            void a(int i10, String str, Throwable th) {
                e3.Z0("sending on_focus Failed", i10, th, str);
            }

            @Override // com.onesignal.p3.g
            void b(String str) {
                c.this.o(0L);
            }
        }

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(long j10, List list, a aVar) {
            n(j10, list);
            t(aVar);
        }

        private JSONObject i(long j10) throws JSONException {
            JSONObject jSONObjectPut = new JSONObject().put("app_id", e3.t0()).put("type", 1).put("state", "ping").put("active_time", j10).put("device_type", new OSUtils().e());
            e3.y(jSONObjectPut);
            return jSONObjectPut;
        }

        private long k() {
            if (this.f22340c == null) {
                this.f22340c = Long.valueOf(n3.d(n3.f22119a, this.f22339b, 0L));
            }
            e3.a(e3.z.DEBUG, getClass().getSimpleName() + ":getUnsentActiveTime: " + this.f22340c);
            return this.f22340c.longValue();
        }

        private boolean l() {
            return k() >= this.f22338a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(long j10, List list) {
            e3.a(e3.z.DEBUG, getClass().getSimpleName() + ":saveUnsentActiveData with lastFocusTimeInfluences: " + list.toString());
            long jK = k() + j10;
            m(list);
            o(jK);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j10) {
            this.f22340c = Long.valueOf(j10);
            e3.a(e3.z.DEBUG, getClass().getSimpleName() + ":saveUnsentActiveTime: " + this.f22340c);
            n3.l(n3.f22119a, this.f22339b, j10);
        }

        private void p(long j10) {
            try {
                e3.a(e3.z.DEBUG, getClass().getSimpleName() + ":sendOnFocus with totalTimeActive: " + j10);
                JSONObject jSONObjectI = i(j10);
                h(jSONObjectI);
                q(e3.E0(), jSONObjectI);
                if (e3.M0()) {
                    q(e3.c0(), i(j10));
                }
                if (e3.N0()) {
                    q(e3.r0(), i(j10));
                }
                m(new ArrayList());
            } catch (JSONException e5) {
                e3.b(e3.z.ERROR, "Generating on_focus:JSON Failed.", e5);
            }
        }

        private void q(String str, JSONObject jSONObject) {
            p3.k("players/" + str + "/on_focus", jSONObject, new a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s() {
            List listJ = j();
            long jK = k();
            e3.a(e3.z.DEBUG, getClass().getSimpleName() + ":sendUnsentTimeNow with time: " + jK + " and influences: " + listJ.toString());
            t(a.BACKGROUND);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(a aVar) {
            if (e3.O0()) {
                r(aVar);
                return;
            }
            e3.a(e3.z.WARN, getClass().getSimpleName() + ":sendUnsentTimeNow not possible due to user id null");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v() {
            if (l()) {
                u();
            }
        }

        protected void h(JSONObject jSONObject) {
        }

        protected abstract List j();

        protected abstract void m(List list);

        protected abstract void r(a aVar);

        protected void u() {
            if (this.f22341d.get()) {
                return;
            }
            synchronized (this.f22341d) {
                this.f22341d.set(true);
                if (l()) {
                    p(k());
                }
                this.f22341d.set(false);
            }
        }

        protected void w() {
            if (l()) {
                r2.q().s(e3.f21882e);
            }
        }
    }

    static class d extends c {
        d() {
            this.f22338a = 60L;
            this.f22339b = "GT_UNSENT_ACTIVE_TIME";
        }

        @Override // com.onesignal.s.c
        protected List j() {
            return new ArrayList();
        }

        @Override // com.onesignal.s.c
        protected void m(List list) {
        }

        @Override // com.onesignal.s.c
        protected void r(a aVar) {
            e3.i1(e3.z.DEBUG, getClass().getSimpleName() + " sendTime with: " + aVar);
            if (aVar.equals(a.END_SESSION)) {
                return;
            }
            w();
        }
    }

    s(z0 z0Var, r1 r1Var) {
        this.f22333c = z0Var;
        this.f22334d = r1Var;
    }

    private Long e() {
        synchronized (this.f22332b) {
            if (this.f22331a == null) {
                return null;
            }
            long jA = (long) (((e3.B0().a() - this.f22331a.longValue()) / 1000.0d) + 0.5d);
            if (jA >= 1 && jA <= 86400) {
                return Long.valueOf(jA);
            }
            return null;
        }
    }

    private boolean f(List list, a aVar) {
        Long lE = e();
        if (lE == null) {
            return false;
        }
        this.f22333c.c(list).g(lE.longValue(), list, aVar);
        return true;
    }

    void a() {
        synchronized (this.f22332b) {
            this.f22334d.f("Application backgrounded focus time: " + this.f22331a);
            this.f22333c.b().s();
            this.f22331a = null;
        }
    }

    void b() {
        synchronized (this.f22332b) {
            this.f22331a = Long.valueOf(e3.B0().a());
            this.f22334d.f("Application foregrounded focus time: " + this.f22331a);
        }
    }

    void c() {
        Long lE = e();
        synchronized (this.f22332b) {
            this.f22334d.f("Application stopped focus time: " + this.f22331a + " timeElapsed: " + lE);
        }
        if (lE == null) {
            return;
        }
        List listF = e3.x0().f();
        this.f22333c.c(listF).n(lE.longValue(), listF);
    }

    void d() {
        if (e3.T0()) {
            return;
        }
        this.f22333c.b().v();
    }

    void g(List list) {
        a aVar = a.END_SESSION;
        if (f(list, aVar)) {
            return;
        }
        this.f22333c.c(list).t(aVar);
    }
}
