package com.onesignal;

import com.onesignal.e3;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m2 {

    /* renamed from: a, reason: collision with root package name */
    protected g7.e f22109a;

    /* renamed from: b, reason: collision with root package name */
    private b f22110b;

    /* renamed from: c, reason: collision with root package name */
    private r1 f22111c;

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ List f22112m;

        a(List list) {
            this.f22112m = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setPriority(10);
            m2.this.f22110b.a(this.f22112m);
        }
    }

    public interface b {
        void a(List list);
    }

    public m2(b bVar, g7.e eVar, r1 r1Var) {
        this.f22110b = bVar;
        this.f22109a = eVar;
        this.f22111c = r1Var;
    }

    private void d(e3.s sVar, String str) {
        boolean zO;
        h7.a aVarE;
        this.f22111c.f("OneSignal SessionManager attemptSessionUpgrade with entryAction: " + sVar);
        g7.a aVarB = this.f22109a.b(sVar);
        List<g7.a> listD = this.f22109a.d(sVar);
        ArrayList arrayList = new ArrayList();
        if (aVarB != null) {
            aVarE = aVarB.e();
            h7.c cVar = h7.c.DIRECT;
            if (str == null) {
                str = aVarB.g();
            }
            zO = o(aVarB, cVar, str, null);
        } else {
            zO = false;
            aVarE = null;
        }
        if (zO) {
            this.f22111c.f("OneSignal SessionManager attemptSessionUpgrade channel updated, search for ending direct influences on channels: " + listD);
            arrayList.add(aVarE);
            for (g7.a aVar : listD) {
                if (aVar.k().g()) {
                    arrayList.add(aVar.e());
                    aVar.t();
                }
            }
        }
        this.f22111c.f("OneSignal SessionManager attemptSessionUpgrade try UNATTRIBUTED to INDIRECT upgrade");
        for (g7.a aVar2 : listD) {
            if (aVar2.k().m()) {
                JSONArray jSONArrayN = aVar2.n();
                if (jSONArrayN.length() > 0 && !sVar.b()) {
                    h7.a aVarE2 = aVar2.e();
                    if (o(aVar2, h7.c.INDIRECT, null, jSONArrayN)) {
                        arrayList.add(aVarE2);
                    }
                }
            }
        }
        e3.a(e3.z.DEBUG, "Trackers after update attempt: " + this.f22109a.c().toString());
        n(arrayList);
    }

    private void n(List list) {
        this.f22111c.f("OneSignal SessionManager sendSessionEndingWithInfluences with influences: " + list);
        if (list.size() > 0) {
            new Thread(new a(list), "OS_END_CURRENT_SESSION").start();
        }
    }

    private boolean o(g7.a aVar, h7.c cVar, String str, JSONArray jSONArray) {
        if (!p(aVar, cVar, str, jSONArray)) {
            return false;
        }
        e3.z zVar = e3.z.DEBUG;
        e3.a(zVar, "OSChannelTracker changed: " + aVar.h() + "\nfrom:\ninfluenceType: " + aVar.k() + ", directNotificationId: " + aVar.g() + ", indirectNotificationIds: " + aVar.j() + "\nto:\ninfluenceType: " + cVar + ", directNotificationId: " + str + ", indirectNotificationIds: " + jSONArray);
        aVar.y(cVar);
        aVar.w(str);
        aVar.x(jSONArray);
        aVar.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Trackers changed to: ");
        sb2.append(this.f22109a.c().toString());
        e3.a(zVar, sb2.toString());
        return true;
    }

    private boolean p(g7.a aVar, h7.c cVar, String str, JSONArray jSONArray) {
        if (!cVar.equals(aVar.k())) {
            return true;
        }
        h7.c cVarK = aVar.k();
        if (!cVarK.g() || aVar.g() == null || aVar.g().equals(str)) {
            return cVarK.l() && aVar.j() != null && aVar.j().length() > 0 && !e0.a(aVar.j(), jSONArray);
        }
        return true;
    }

    void b(JSONObject jSONObject, List list) {
        this.f22111c.f("OneSignal SessionManager addSessionData with influences: " + list.toString());
        this.f22109a.a(jSONObject, list);
        this.f22111c.f("OneSignal SessionManager addSessionIds on jsonObject: " + jSONObject);
    }

    void c(e3.s sVar) {
        d(sVar, null);
    }

    List e() {
        return this.f22109a.f();
    }

    List f() {
        return this.f22109a.h();
    }

    void g() {
        this.f22109a.i();
    }

    void h(String str) {
        this.f22111c.f("OneSignal SessionManager onDirectInfluenceFromIAMClick messageId: " + str);
        o(this.f22109a.e(), h7.c.DIRECT, str, null);
    }

    void i() {
        this.f22111c.f("OneSignal SessionManager onDirectInfluenceFromIAMClickFinished");
        this.f22109a.e().t();
    }

    void j(e3.s sVar, String str) {
        this.f22111c.f("OneSignal SessionManager onDirectInfluenceFromNotificationOpen notificationId: " + str);
        if (str == null || str.isEmpty()) {
            return;
        }
        d(sVar, str);
    }

    void k(String str) {
        this.f22111c.f("OneSignal SessionManager onInAppMessageReceived messageId: " + str);
        g7.a aVarE = this.f22109a.e();
        aVarE.v(str);
        aVarE.t();
    }

    void l(String str) {
        this.f22111c.f("OneSignal SessionManager onNotificationReceived notificationId: " + str);
        if (str == null || str.isEmpty()) {
            return;
        }
        this.f22109a.g().v(str);
    }

    void m(e3.s sVar) {
        List<g7.a> listD = this.f22109a.d(sVar);
        ArrayList arrayList = new ArrayList();
        this.f22111c.f("OneSignal SessionManager restartSessionIfNeeded with entryAction: " + sVar + "\n channelTrackers: " + listD.toString());
        for (g7.a aVar : listD) {
            JSONArray jSONArrayN = aVar.n();
            this.f22111c.f("OneSignal SessionManager restartSessionIfNeeded lastIds: " + jSONArrayN);
            h7.a aVarE = aVar.e();
            if (jSONArrayN.length() > 0 ? o(aVar, h7.c.INDIRECT, null, jSONArrayN) : o(aVar, h7.c.UNATTRIBUTED, null, null)) {
                arrayList.add(aVarE);
            }
        }
        n(arrayList);
    }
}
