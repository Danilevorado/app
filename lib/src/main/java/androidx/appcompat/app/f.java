package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.n;
import androidx.appcompat.widget.Toolbar;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: m, reason: collision with root package name */
    static n.a f483m = new n.a(new n.b());

    /* renamed from: n, reason: collision with root package name */
    private static int f484n = -100;

    /* renamed from: o, reason: collision with root package name */
    private static androidx.core.os.i f485o = null;

    /* renamed from: p, reason: collision with root package name */
    private static androidx.core.os.i f486p = null;

    /* renamed from: q, reason: collision with root package name */
    private static Boolean f487q = null;

    /* renamed from: r, reason: collision with root package name */
    private static boolean f488r = false;

    /* renamed from: s, reason: collision with root package name */
    private static final q.b f489s = new q.b();

    /* renamed from: t, reason: collision with root package name */
    private static final Object f490t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private static final Object f491u = new Object();

    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    f() {
    }

    static void E(f fVar) {
        synchronized (f490t) {
            F(fVar);
        }
    }

    private static void F(f fVar) {
        synchronized (f490t) {
            Iterator it = f489s.iterator();
            while (it.hasNext()) {
                f fVar2 = (f) ((WeakReference) it.next()).get();
                if (fVar2 == fVar || fVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    static void O(final Context context) {
        if (u(context)) {
            if (androidx.core.os.a.c()) {
                if (f488r) {
                    return;
                }
                f483m.execute(new Runnable() { // from class: androidx.appcompat.app.e
                    @Override // java.lang.Runnable
                    public final void run() throws IOException {
                        f.v(context);
                    }
                });
                return;
            }
            synchronized (f491u) {
                androidx.core.os.i iVar = f485o;
                if (iVar == null) {
                    if (f486p == null) {
                        f486p = androidx.core.os.i.c(n.b(context));
                    }
                    if (f486p.f()) {
                    } else {
                        f485o = f486p;
                    }
                } else if (!iVar.equals(f486p)) {
                    androidx.core.os.i iVar2 = f485o;
                    f486p = iVar2;
                    n.a(context, iVar2.h());
                }
            }
        }
    }

    static void d(f fVar) {
        synchronized (f490t) {
            F(fVar);
            f489s.add(new WeakReference(fVar));
        }
    }

    public static f h(Activity activity, d dVar) {
        return new g(activity, dVar);
    }

    public static f i(Dialog dialog, d dVar) {
        return new g(dialog, dVar);
    }

    public static androidx.core.os.i k() {
        if (androidx.core.os.a.c()) {
            Object objO = o();
            if (objO != null) {
                return androidx.core.os.i.i(b.a(objO));
            }
        } else {
            androidx.core.os.i iVar = f485o;
            if (iVar != null) {
                return iVar;
            }
        }
        return androidx.core.os.i.e();
    }

    public static int m() {
        return f484n;
    }

    static Object o() {
        Context contextL;
        Iterator it = f489s.iterator();
        while (it.hasNext()) {
            f fVar = (f) ((WeakReference) it.next()).get();
            if (fVar != null && (contextL = fVar.l()) != null) {
                return contextL.getSystemService("locale");
            }
        }
        return null;
    }

    static androidx.core.os.i q() {
        return f485o;
    }

    static boolean u(Context context) {
        if (f487q == null) {
            try {
                Bundle bundle = l.a(context).metaData;
                if (bundle != null) {
                    f487q = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f487q = Boolean.FALSE;
            }
        }
        return f487q.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v(Context context) throws IOException {
        n.c(context);
        f488r = true;
    }

    public abstract void A();

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D();

    public abstract boolean G(int i10);

    public abstract void H(int i10);

    public abstract void I(View view);

    public abstract void J(View view, ViewGroup.LayoutParams layoutParams);

    public void K(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void L(Toolbar toolbar);

    public abstract void M(int i10);

    public abstract void N(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public void f(Context context) {
    }

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract View j(int i10);

    public abstract Context l();

    public abstract int n();

    public abstract MenuInflater p();

    public abstract androidx.appcompat.app.a r();

    public abstract void s();

    public abstract void t();

    public abstract void w(Configuration configuration);

    public abstract void x(Bundle bundle);

    public abstract void y();

    public abstract void z(Bundle bundle);
}
