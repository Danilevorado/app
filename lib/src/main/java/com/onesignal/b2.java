package com.onesignal;

import com.onesignal.e3;

/* loaded from: classes.dex */
public class b2 implements e3.x {

    /* renamed from: a, reason: collision with root package name */
    private final y2 f21721a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f21722b;

    /* renamed from: c, reason: collision with root package name */
    private s1 f21723c;

    /* renamed from: d, reason: collision with root package name */
    private t1 f21724d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21725e = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e3.a(e3.z.DEBUG, "Running complete from OSNotificationOpenedResult timeout runnable!");
            b2.this.c(false);
        }
    }

    public b2(s1 s1Var, t1 t1Var) {
        this.f21723c = s1Var;
        this.f21724d = t1Var;
        y2 y2VarB = y2.b();
        this.f21721a = y2VarB;
        a aVar = new a();
        this.f21722b = aVar;
        y2VarB.c(5000L, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z10) {
        e3.z zVar = e3.z.DEBUG;
        e3.i1(zVar, "OSNotificationOpenedResult complete called with opened: " + z10);
        this.f21721a.a(this.f21722b);
        if (this.f21725e) {
            e3.i1(zVar, "OSNotificationOpenedResult already completed");
            return;
        }
        this.f21725e = true;
        if (z10) {
            e3.B(this.f21723c.i());
        }
        e3.s1(this);
    }

    @Override // com.onesignal.e3.x
    public void a(e3.s sVar) {
        e3.i1(e3.z.DEBUG, "OSNotificationOpenedResult onEntryStateChange called with appEntryState: " + sVar);
        c(e3.s.APP_CLOSE.equals(sVar));
    }

    public t1 d() {
        return this.f21724d;
    }

    public s1 e() {
        return this.f21723c;
    }

    public String toString() {
        return "OSNotificationOpenedResult{notification=" + this.f21723c + ", action=" + this.f21724d + ", isComplete=" + this.f21725e + '}';
    }
}
