package com.onesignal;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import b1.b;
import b1.l;
import com.onesignal.e3;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class OSFocusHandler {

    /* renamed from: b, reason: collision with root package name */
    public static final a f21637b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static boolean f21638c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f21639d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f21640e;

    /* renamed from: a, reason: collision with root package name */
    private Runnable f21641a;

    public static final class OnLostFocusWorker extends Worker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLostFocusWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            rb.h.e(context, "context");
            rb.h.e(workerParameters, "workerParams");
        }

        @Override // androidx.work.Worker
        public c.a doWork() {
            OSFocusHandler.f21637b.a();
            c.a aVarC = c.a.c();
            rb.h.d(aVarC, "success()");
            return aVarC;
        }
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(rb.f fVar) {
            this();
        }

        public final void a() {
            com.onesignal.a aVarB = b.b();
            if (aVarB == null || aVarB.e() == null) {
                e3.I1(false);
            }
            e3.i1(e3.z.DEBUG, "OSFocusHandler running onAppLostFocus");
            OSFocusHandler.f21639d = true;
            e3.f1();
            OSFocusHandler.f21640e = true;
        }
    }

    private final b1.b d() {
        b1.b bVarA = new b.a().b(b1.k.CONNECTED).a();
        rb.h.d(bVarA, "Builder()\n            .s…TED)\n            .build()");
        return bVarA;
    }

    private final void h() {
        i();
        f21639d = false;
    }

    private final void i() {
        f21638c = false;
        Runnable runnable = this.f21641a;
        if (runnable == null) {
            return;
        }
        y2.b().a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n() {
        f21638c = true;
        e3.i1(e3.z.DEBUG, "OSFocusHandler setting stop state: true");
    }

    public final void e(String str, Context context) {
        rb.h.e(str, "tag");
        rb.h.e(context, "context");
        d3.a(context).a(str);
    }

    public final boolean f() {
        return f21639d;
    }

    public final boolean g() {
        return f21640e;
    }

    public final void j() {
        h();
        e3.i1(e3.z.DEBUG, "OSFocusHandler running onAppFocus");
        e3.d1();
    }

    public final void k(String str, long j10, Context context) {
        rb.h.e(str, "tag");
        rb.h.e(context, "context");
        b1.v vVarB = ((l.a) ((l.a) ((l.a) new l.a(OnLostFocusWorker.class).j(d())).l(j10, TimeUnit.MILLISECONDS)).a(str)).b();
        rb.h.d(vVarB, "Builder(OnLostFocusWorke…tag)\n            .build()");
        d3.a(context).d(str, b1.d.KEEP, (b1.l) vVarB);
    }

    public final void l() {
        if (!f21638c) {
            i();
            return;
        }
        f21638c = false;
        this.f21641a = null;
        e3.i1(e3.z.DEBUG, "OSFocusHandler running onAppStartFocusLogic");
        e3.g1();
    }

    public final void m() {
        y0 y0Var = new Runnable() { // from class: com.onesignal.y0
            @Override // java.lang.Runnable
            public final void run() {
                OSFocusHandler.n();
            }
        };
        y2.b().c(1500L, y0Var);
        hb.q qVar = hb.q.f24177a;
        this.f21641a = y0Var;
    }
}
