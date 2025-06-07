package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.g;
import androidx.emoji2.text.e;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class j extends e.c {

    /* renamed from: j, reason: collision with root package name */
    private static final a f2631j = new a();

    public static class a {
        public Typeface a(Context context, g.b bVar) {
            return androidx.core.provider.g.a(context, null, new g.b[]{bVar});
        }

        public g.a b(Context context, androidx.core.provider.e eVar) {
            return androidx.core.provider.g.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements e.g {

        /* renamed from: a, reason: collision with root package name */
        private final Context f2632a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.provider.e f2633b;

        /* renamed from: c, reason: collision with root package name */
        private final a f2634c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f2635d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private Handler f2636e;

        /* renamed from: f, reason: collision with root package name */
        private Executor f2637f;

        /* renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f2638g;

        /* renamed from: h, reason: collision with root package name */
        e.h f2639h;

        /* renamed from: i, reason: collision with root package name */
        private ContentObserver f2640i;

        /* renamed from: j, reason: collision with root package name */
        private Runnable f2641j;

        b(Context context, androidx.core.provider.e eVar, a aVar) {
            androidx.core.util.h.g(context, "Context cannot be null");
            androidx.core.util.h.g(eVar, "FontRequest cannot be null");
            this.f2632a = context.getApplicationContext();
            this.f2633b = eVar;
            this.f2634c = aVar;
        }

        private void b() {
            synchronized (this.f2635d) {
                this.f2639h = null;
                ContentObserver contentObserver = this.f2640i;
                if (contentObserver != null) {
                    this.f2634c.c(this.f2632a, contentObserver);
                    this.f2640i = null;
                }
                Handler handler = this.f2636e;
                if (handler != null) {
                    handler.removeCallbacks(this.f2641j);
                }
                this.f2636e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f2638g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f2637f = null;
                this.f2638g = null;
            }
        }

        private g.b e() {
            try {
                g.a aVarB = this.f2634c.b(this.f2632a, this.f2633b);
                if (aVarB.c() == 0) {
                    g.b[] bVarArrB = aVarB.b();
                    if (bVarArrB == null || bVarArrB.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrB[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.c() + ")");
            } catch (PackageManager.NameNotFoundException e5) {
                throw new RuntimeException("provider not found", e5);
            }
        }

        @Override // androidx.emoji2.text.e.g
        public void a(e.h hVar) {
            androidx.core.util.h.g(hVar, "LoaderCallback cannot be null");
            synchronized (this.f2635d) {
                this.f2639h = hVar;
            }
            d();
        }

        void c() {
            synchronized (this.f2635d) {
                if (this.f2639h == null) {
                    return;
                }
                try {
                    g.b bVarE = e();
                    int iB = bVarE.b();
                    if (iB == 2) {
                        synchronized (this.f2635d) {
                        }
                    }
                    if (iB != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                    }
                    try {
                        androidx.core.os.m.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Typeface typefaceA = this.f2634c.a(this.f2632a, bVarE);
                        ByteBuffer byteBufferF = androidx.core.graphics.l.f(this.f2632a, null, bVarE.d());
                        if (byteBufferF == null || typefaceA == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        m mVarB = m.b(typefaceA, byteBufferF);
                        androidx.core.os.m.b();
                        synchronized (this.f2635d) {
                            e.h hVar = this.f2639h;
                            if (hVar != null) {
                                hVar.b(mVarB);
                            }
                        }
                        b();
                    } catch (Throwable th) {
                        androidx.core.os.m.b();
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (this.f2635d) {
                        e.h hVar2 = this.f2639h;
                        if (hVar2 != null) {
                            hVar2.a(th2);
                        }
                        b();
                    }
                }
            }
        }

        void d() {
            synchronized (this.f2635d) {
                if (this.f2639h == null) {
                    return;
                }
                if (this.f2637f == null) {
                    ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("emojiCompat");
                    this.f2638g = threadPoolExecutorB;
                    this.f2637f = threadPoolExecutorB;
                }
                this.f2637f.execute(new Runnable() { // from class: androidx.emoji2.text.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2642m.c();
                    }
                });
            }
        }

        public void f(Executor executor) {
            synchronized (this.f2635d) {
                this.f2637f = executor;
            }
        }
    }

    public j(Context context, androidx.core.provider.e eVar) {
        super(new b(context, eVar, f2631j));
    }

    public j c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
