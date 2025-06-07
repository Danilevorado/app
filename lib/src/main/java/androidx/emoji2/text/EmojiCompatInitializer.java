package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.e;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements x0.a {

    static class a extends e.c {
        protected a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    static class b implements e.g {

        /* renamed from: a, reason: collision with root package name */
        private final Context f2566a;

        class a extends e.h {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e.h f2567a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f2568b;

            a(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f2567a = hVar;
                this.f2568b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.e.h
            public void a(Throwable th) {
                try {
                    this.f2567a.a(th);
                } finally {
                    this.f2568b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.e.h
            public void b(m mVar) {
                try {
                    this.f2567a.b(mVar);
                } finally {
                    this.f2568b.shutdown();
                }
            }
        }

        b(Context context) {
            this.f2566a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.g
        public void a(final e.h hVar) {
            final ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2606m.d(hVar, threadPoolExecutorB);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                j jVarA = androidx.emoji2.text.c.a(this.f2566a);
                if (jVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                jVarA.c(threadPoolExecutor);
                jVarA.a().a(new a(hVar, threadPoolExecutor));
            } catch (Throwable th) {
                hVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.core.os.m.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.h()) {
                    e.b().k();
                }
            } finally {
                androidx.core.os.m.b();
            }
        }
    }

    @Override // x0.a
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // x0.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean create(Context context) {
        e.g(new a(context));
        c(context);
        return Boolean.TRUE;
    }

    void c(Context context) {
        final androidx.lifecycle.j jVarS = ((androidx.lifecycle.n) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).s();
        jVarS.a(new androidx.lifecycle.d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.f
            public void a(androidx.lifecycle.n nVar) {
                EmojiCompatInitializer.this.d();
                jVarS.c(this);
            }

            @Override // androidx.lifecycle.f
            public /* synthetic */ void b(androidx.lifecycle.n nVar) {
                androidx.lifecycle.c.b(this, nVar);
            }

            @Override // androidx.lifecycle.f
            public /* synthetic */ void c(androidx.lifecycle.n nVar) {
                androidx.lifecycle.c.a(this, nVar);
            }

            @Override // androidx.lifecycle.f
            public /* synthetic */ void e(androidx.lifecycle.n nVar) {
                androidx.lifecycle.c.c(this, nVar);
            }

            @Override // androidx.lifecycle.f
            public /* synthetic */ void f(androidx.lifecycle.n nVar) {
                androidx.lifecycle.c.e(this, nVar);
            }

            @Override // androidx.lifecycle.f
            public /* synthetic */ void g(androidx.lifecycle.n nVar) {
                androidx.lifecycle.c.f(this, nVar);
            }
        });
    }

    void d() {
        androidx.emoji2.text.b.d().postDelayed(new c(), 500L);
    }
}
