package com.onesignal;

import com.onesignal.o3;

/* loaded from: classes.dex */
class j2 {

    /* renamed from: a, reason: collision with root package name */
    private o3.f f22088a = null;

    j2() {
    }

    private void p(boolean z10) {
        n3.j(n3.f22119a, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", z10);
    }

    private void r(boolean z10) {
        n3.j(n3.f22119a, "OS_RESTORE_TTL_FILTER", this.f22088a.f22185g);
    }

    void a() {
        this.f22088a = null;
    }

    boolean b() {
        return n3.b(n3.f22119a, "OS_CLEAR_GROUP_SUMMARY_CLICK", true);
    }

    boolean c() {
        return n3.b(n3.f22119a, "GT_FIREBASE_TRACKING_ENABLED", false);
    }

    o3.f d() {
        return this.f22088a;
    }

    boolean e() {
        return n3.b(n3.f22119a, "ONESIGNAL_USER_PROVIDED_CONSENT", false);
    }

    boolean f() {
        o3.f fVar = this.f22088a;
        return (fVar == null || fVar.f22191m == null) ? false : true;
    }

    boolean g() {
        return n3.b(n3.f22119a, "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", false);
    }

    boolean h() {
        return n3.b(n3.f22119a, "PREFS_OS_LOCATION_SHARED", true);
    }

    boolean i() {
        return n3.b(n3.f22119a, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", false);
    }

    boolean j() {
        return n3.b(n3.f22119a, "PREFS_OS_RECEIVE_RECEIPTS_ENABLED", false);
    }

    boolean k() {
        return this.f22088a != null;
    }

    boolean l() {
        return n3.b(n3.f22119a, "OS_RESTORE_TTL_FILTER", true);
    }

    void m(boolean z10) {
        n3.j(n3.f22119a, "PREFS_OS_DISABLE_GMS_MISSING_PROMPT", z10);
    }

    void n(boolean z10) {
        n3.j(n3.f22119a, "PREFS_OS_LOCATION_SHARED", z10);
    }

    void o(boolean z10) {
        n3.j(n3.f22119a, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", z10);
    }

    void q(o3.f fVar, g7.e eVar, n2 n2Var, r1 r1Var) {
        this.f22088a = fVar;
        String str = n3.f22119a;
        n3.j(str, "GT_FIREBASE_TRACKING_ENABLED", fVar.f22184f);
        r(fVar.f22185g);
        n3.j(str, "OS_CLEAR_GROUP_SUMMARY_CLICK", fVar.f22186h);
        n3.j(str, n2Var.j(), fVar.f22192n.f22178h);
        p(fVar.f22187i);
        r1Var.f("OneSignal saveInfluenceParams: " + fVar.f22192n.toString());
        eVar.j(fVar.f22192n);
        Boolean bool = fVar.f22188j;
        if (bool != null) {
            m(bool.booleanValue());
        }
        Boolean bool2 = fVar.f22189k;
        if (bool2 != null) {
            s(bool2.booleanValue());
        }
        Boolean bool3 = fVar.f22190l;
        if (bool3 != null) {
            e3.T1(bool3.booleanValue());
        }
        Boolean bool4 = fVar.f22191m;
        if (bool4 != null) {
            o(bool4.booleanValue());
        }
    }

    void s(boolean z10) {
        n3.j(n3.f22119a, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", z10);
    }

    boolean t() {
        return n3.b(n3.f22119a, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", true);
    }
}
