package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class e {

    /* renamed from: n, reason: collision with root package name */
    private static final Object f2574n = new Object();

    /* renamed from: o, reason: collision with root package name */
    private static final Object f2575o = new Object();

    /* renamed from: p, reason: collision with root package name */
    private static volatile e f2576p;

    /* renamed from: b, reason: collision with root package name */
    private final Set f2578b;

    /* renamed from: e, reason: collision with root package name */
    private final b f2581e;

    /* renamed from: f, reason: collision with root package name */
    final g f2582f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f2583g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f2584h;

    /* renamed from: i, reason: collision with root package name */
    final int[] f2585i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f2586j;

    /* renamed from: k, reason: collision with root package name */
    private final int f2587k;

    /* renamed from: l, reason: collision with root package name */
    private final int f2588l;

    /* renamed from: m, reason: collision with root package name */
    private final d f2589m;

    /* renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f2577a = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    private volatile int f2579c = 3;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f2580d = new Handler(Looper.getMainLooper());

    private static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.h f2590b;

        /* renamed from: c, reason: collision with root package name */
        private volatile m f2591c;

        /* renamed from: androidx.emoji2.text.e$a$a, reason: collision with other inner class name */
        class C0041a extends h {
            C0041a() {
            }

            @Override // androidx.emoji2.text.e.h
            public void a(Throwable th) {
                a.this.f2593a.m(th);
            }

            @Override // androidx.emoji2.text.e.h
            public void b(m mVar) {
                a.this.d(mVar);
            }
        }

        a(e eVar) {
            super(eVar);
        }

        @Override // androidx.emoji2.text.e.b
        void a() {
            try {
                this.f2593a.f2582f.a(new C0041a());
            } catch (Throwable th) {
                this.f2593a.m(th);
            }
        }

        @Override // androidx.emoji2.text.e.b
        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f2590b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.e.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f2591c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f2593a.f2583g);
        }

        void d(m mVar) {
            if (mVar == null) {
                this.f2593a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f2591c = mVar;
            m mVar2 = this.f2591c;
            i iVar = new i();
            d dVar = this.f2593a.f2589m;
            e eVar = this.f2593a;
            this.f2590b = new androidx.emoji2.text.h(mVar2, iVar, dVar, eVar.f2584h, eVar.f2585i);
            this.f2593a.n();
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        final e f2593a;

        b(e eVar) {
            this.f2593a = eVar;
        }

        abstract void a();

        abstract CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10);

        abstract void c(EditorInfo editorInfo);
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final g f2594a;

        /* renamed from: b, reason: collision with root package name */
        boolean f2595b;

        /* renamed from: c, reason: collision with root package name */
        boolean f2596c;

        /* renamed from: d, reason: collision with root package name */
        int[] f2597d;

        /* renamed from: e, reason: collision with root package name */
        Set f2598e;

        /* renamed from: f, reason: collision with root package name */
        boolean f2599f;

        /* renamed from: g, reason: collision with root package name */
        int f2600g = -16711936;

        /* renamed from: h, reason: collision with root package name */
        int f2601h = 0;

        /* renamed from: i, reason: collision with root package name */
        d f2602i = new androidx.emoji2.text.d();

        protected c(g gVar) {
            androidx.core.util.h.g(gVar, "metadataLoader cannot be null.");
            this.f2594a = gVar;
        }

        protected final g a() {
            return this.f2594a;
        }

        public c b(int i10) {
            this.f2601h = i10;
            return this;
        }
    }

    public interface d {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* renamed from: androidx.emoji2.text.e$e, reason: collision with other inner class name */
    public static abstract class AbstractC0042e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    private static class f implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        private final List f2603m;

        /* renamed from: n, reason: collision with root package name */
        private final Throwable f2604n;

        /* renamed from: o, reason: collision with root package name */
        private final int f2605o;

        f(AbstractC0042e abstractC0042e, int i10) {
            this(Arrays.asList((AbstractC0042e) androidx.core.util.h.g(abstractC0042e, "initCallback cannot be null")), i10, null);
        }

        f(Collection collection, int i10) {
            this(collection, i10, null);
        }

        f(Collection collection, int i10, Throwable th) {
            androidx.core.util.h.g(collection, "initCallbacks cannot be null");
            this.f2603m = new ArrayList(collection);
            this.f2605o = i10;
            this.f2604n = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2603m.size();
            int i10 = 0;
            if (this.f2605o != 1) {
                while (i10 < size) {
                    ((AbstractC0042e) this.f2603m.get(i10)).a(this.f2604n);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((AbstractC0042e) this.f2603m.get(i10)).b();
                    i10++;
                }
            }
        }
    }

    public interface g {
        void a(h hVar);
    }

    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(m mVar);
    }

    static class i {
        i() {
        }

        androidx.emoji2.text.i a(androidx.emoji2.text.g gVar) {
            return new o(gVar);
        }
    }

    private e(c cVar) {
        this.f2583g = cVar.f2595b;
        this.f2584h = cVar.f2596c;
        this.f2585i = cVar.f2597d;
        this.f2586j = cVar.f2599f;
        this.f2587k = cVar.f2600g;
        this.f2582f = cVar.f2594a;
        this.f2588l = cVar.f2601h;
        this.f2589m = cVar.f2602i;
        q.b bVar = new q.b();
        this.f2578b = bVar;
        Set set = cVar.f2598e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f2598e);
        }
        this.f2581e = new a(this);
        l();
    }

    public static e b() {
        e eVar;
        synchronized (f2574n) {
            eVar = f2576p;
            androidx.core.util.h.h(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return androidx.emoji2.text.h.c(inputConnection, editable, i10, i11, z10);
    }

    public static boolean f(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.h.d(editable, i10, keyEvent);
    }

    public static e g(c cVar) {
        e eVar = f2576p;
        if (eVar == null) {
            synchronized (f2574n) {
                eVar = f2576p;
                if (eVar == null) {
                    eVar = new e(cVar);
                    f2576p = eVar;
                }
            }
        }
        return eVar;
    }

    public static boolean h() {
        return f2576p != null;
    }

    private boolean j() {
        return d() == 1;
    }

    private void l() {
        this.f2577a.writeLock().lock();
        try {
            if (this.f2588l == 0) {
                this.f2579c = 0;
            }
            this.f2577a.writeLock().unlock();
            if (d() == 0) {
                this.f2581e.a();
            }
        } catch (Throwable th) {
            this.f2577a.writeLock().unlock();
            throw th;
        }
    }

    public int c() {
        return this.f2587k;
    }

    public int d() {
        this.f2577a.readLock().lock();
        try {
            return this.f2579c;
        } finally {
            this.f2577a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.f2586j;
    }

    public void k() {
        androidx.core.util.h.h(this.f2588l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (j()) {
            return;
        }
        this.f2577a.writeLock().lock();
        try {
            if (this.f2579c == 0) {
                return;
            }
            this.f2579c = 0;
            this.f2577a.writeLock().unlock();
            this.f2581e.a();
        } finally {
            this.f2577a.writeLock().unlock();
        }
    }

    void m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2577a.writeLock().lock();
        try {
            this.f2579c = 2;
            arrayList.addAll(this.f2578b);
            this.f2578b.clear();
            this.f2577a.writeLock().unlock();
            this.f2580d.post(new f(arrayList, this.f2579c, th));
        } catch (Throwable th2) {
            this.f2577a.writeLock().unlock();
            throw th2;
        }
    }

    void n() {
        ArrayList arrayList = new ArrayList();
        this.f2577a.writeLock().lock();
        try {
            this.f2579c = 1;
            arrayList.addAll(this.f2578b);
            this.f2578b.clear();
            this.f2577a.writeLock().unlock();
            this.f2580d.post(new f(arrayList, this.f2579c));
        } catch (Throwable th) {
            this.f2577a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence p(CharSequence charSequence, int i10, int i11) {
        return q(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11, int i12) {
        return r(charSequence, i10, i11, i12, 0);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        androidx.core.util.h.h(j(), "Not initialized yet");
        androidx.core.util.h.d(i10, "start cannot be negative");
        androidx.core.util.h.d(i11, "end cannot be negative");
        androidx.core.util.h.d(i12, "maxEmojiCount cannot be negative");
        androidx.core.util.h.a(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        androidx.core.util.h.a(i10 <= charSequence.length(), "start should be < than charSequence length");
        androidx.core.util.h.a(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f2583g : false;
        } else {
            z10 = true;
        }
        return this.f2581e.b(charSequence, i10, i11, i12, z10);
    }

    public void s(AbstractC0042e abstractC0042e) {
        androidx.core.util.h.g(abstractC0042e, "initCallback cannot be null");
        this.f2577a.writeLock().lock();
        try {
            if (this.f2579c == 1 || this.f2579c == 2) {
                this.f2580d.post(new f(abstractC0042e, this.f2579c));
            } else {
                this.f2578b.add(abstractC0042e);
            }
        } finally {
            this.f2577a.writeLock().unlock();
        }
    }

    public void t(AbstractC0042e abstractC0042e) {
        androidx.core.util.h.g(abstractC0042e, "initCallback cannot be null");
        this.f2577a.writeLock().lock();
        try {
            this.f2578b.remove(abstractC0042e);
        } finally {
            this.f2577a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (!j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f2581e.c(editorInfo);
    }
}
