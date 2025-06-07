package com.onesignal;

import com.onesignal.e3;

/* loaded from: classes.dex */
public class c2 {

    /* renamed from: a, reason: collision with root package name */
    private final u1 f21783a;

    /* renamed from: b, reason: collision with root package name */
    private final y2 f21784b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f21785c;

    /* renamed from: d, reason: collision with root package name */
    private final s1 f21786d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21787e = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e3.a(e3.z.DEBUG, "Running complete from OSNotificationReceivedEvent timeout runnable!");
            c2 c2Var = c2.this;
            c2Var.b(c2Var.c());
        }
    }

    class b implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ s1 f21789m;

        b(s1 s1Var) {
            this.f21789m = s1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            c2.this.e(this.f21789m);
        }
    }

    c2(u1 u1Var, s1 s1Var) {
        this.f21786d = s1Var;
        this.f21783a = u1Var;
        y2 y2VarB = y2.b();
        this.f21784b = y2VarB;
        a aVar = new a();
        this.f21785c = aVar;
        y2VarB.c(25000L, aVar);
    }

    static boolean d() {
        return OSUtils.H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(s1 s1Var) {
        this.f21783a.f(this.f21786d.c(), s1Var != null ? s1Var.c() : null);
    }

    public synchronized void b(s1 s1Var) {
        this.f21784b.a(this.f21785c);
        if (this.f21787e) {
            e3.i1(e3.z.DEBUG, "OSNotificationReceivedEvent already completed");
            return;
        }
        this.f21787e = true;
        if (d()) {
            new Thread(new b(s1Var), "OS_COMPLETE_NOTIFICATION").start();
        } else {
            e(s1Var);
        }
    }

    public s1 c() {
        return this.f21786d;
    }

    public String toString() {
        return "OSNotificationReceivedEvent{isComplete=" + this.f21787e + ", notification=" + this.f21786d + '}';
    }
}
