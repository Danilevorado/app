package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.z0;
import androidx.core.content.res.h;
import androidx.core.view.c0;
import androidx.core.view.e0;
import androidx.core.view.f;
import androidx.core.view.h0;
import androidx.core.view.w;
import androidx.lifecycle.j;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
class g extends androidx.appcompat.app.f implements g.a, LayoutInflater.Factory2 {

    /* renamed from: v0, reason: collision with root package name */
    private static final q.g f492v0 = new q.g();

    /* renamed from: w0, reason: collision with root package name */
    private static final boolean f493w0 = false;

    /* renamed from: x0, reason: collision with root package name */
    private static final int[] f494x0 = {R.attr.windowBackground};

    /* renamed from: y0, reason: collision with root package name */
    private static final boolean f495y0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: z0, reason: collision with root package name */
    private static final boolean f496z0 = true;
    androidx.appcompat.app.a A;
    MenuInflater B;
    private CharSequence C;
    private g0 D;
    private C0008g E;
    private u F;
    androidx.appcompat.view.b G;
    ActionBarContextView H;
    PopupWindow I;
    Runnable J;
    c0 K;
    private boolean L;
    private boolean M;
    ViewGroup N;
    private TextView O;
    private View P;
    private boolean Q;
    private boolean R;
    boolean S;
    boolean T;
    boolean U;
    boolean V;
    boolean W;
    private boolean X;
    private t[] Y;
    private t Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f497a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f498b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f499c0;

    /* renamed from: d0, reason: collision with root package name */
    boolean f500d0;

    /* renamed from: e0, reason: collision with root package name */
    private Configuration f501e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f502f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f503g0;

    /* renamed from: h0, reason: collision with root package name */
    private int f504h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f505i0;

    /* renamed from: j0, reason: collision with root package name */
    private p f506j0;

    /* renamed from: k0, reason: collision with root package name */
    private p f507k0;

    /* renamed from: l0, reason: collision with root package name */
    boolean f508l0;

    /* renamed from: m0, reason: collision with root package name */
    int f509m0;

    /* renamed from: n0, reason: collision with root package name */
    private final Runnable f510n0;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f511o0;

    /* renamed from: p0, reason: collision with root package name */
    private Rect f512p0;

    /* renamed from: q0, reason: collision with root package name */
    private Rect f513q0;

    /* renamed from: r0, reason: collision with root package name */
    private androidx.appcompat.app.k f514r0;

    /* renamed from: s0, reason: collision with root package name */
    private androidx.appcompat.app.o f515s0;

    /* renamed from: t0, reason: collision with root package name */
    private OnBackInvokedDispatcher f516t0;

    /* renamed from: u0, reason: collision with root package name */
    private OnBackInvokedCallback f517u0;

    /* renamed from: v, reason: collision with root package name */
    final Object f518v;

    /* renamed from: w, reason: collision with root package name */
    final Context f519w;

    /* renamed from: x, reason: collision with root package name */
    Window f520x;

    /* renamed from: y, reason: collision with root package name */
    private n f521y;

    /* renamed from: z, reason: collision with root package name */
    final androidx.appcompat.app.d f522z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            if ((gVar.f509m0 & 1) != 0) {
                gVar.g0(0);
            }
            g gVar2 = g.this;
            if ((gVar2.f509m0 & 4096) != 0) {
                gVar2.g0(108);
            }
            g gVar3 = g.this;
            gVar3.f508l0 = false;
            gVar3.f509m0 = 0;
        }
    }

    class b implements androidx.core.view.r {
        b() {
        }

        @Override // androidx.core.view.r
        public h0 a(View view, h0 h0Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            int iK = h0Var.k();
            int iD1 = g.this.d1(h0Var, null);
            if (iK != iD1) {
                h0Var = h0Var.o(h0Var.i(), iD1, h0Var.j(), h0Var.h());
            }
            return w.a0(view, h0Var);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            g.this.e0();
        }
    }

    class d implements Runnable {

        class a extends e0 {
            a() {
            }

            @Override // androidx.core.view.d0
            public void b(View view) {
                g.this.H.setAlpha(1.0f);
                g.this.K.h(null);
                g.this.K = null;
            }

            @Override // androidx.core.view.e0, androidx.core.view.d0
            public void c(View view) {
                g.this.H.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.I.showAtLocation(gVar.H, 55, 0, 0);
            g.this.h0();
            if (!g.this.S0()) {
                g.this.H.setAlpha(1.0f);
                g.this.H.setVisibility(0);
            } else {
                g.this.H.setAlpha(0.0f);
                g gVar2 = g.this;
                gVar2.K = w.e(gVar2.H).b(1.0f);
                g.this.K.h(new a());
            }
        }
    }

    class e extends e0 {
        e() {
        }

        @Override // androidx.core.view.d0
        public void b(View view) {
            g.this.H.setAlpha(1.0f);
            g.this.K.h(null);
            g.this.K = null;
        }

        @Override // androidx.core.view.e0, androidx.core.view.d0
        public void c(View view) {
            g.this.H.setVisibility(0);
            if (g.this.H.getParent() instanceof View) {
                w.l0((View) g.this.H.getParent());
            }
        }
    }

    interface f {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    /* renamed from: androidx.appcompat.app.g$g, reason: collision with other inner class name */
    private final class C0008g implements m.a {
        C0008g() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
            g.this.X(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackT0 = g.this.t0();
            if (callbackT0 == null) {
                return true;
            }
            callbackT0.onMenuOpened(108, gVar);
            return true;
        }
    }

    class h implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private b.a f530a;

        class a extends e0 {
            a() {
            }

            @Override // androidx.core.view.d0
            public void b(View view) {
                g.this.H.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.I;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.H.getParent() instanceof View) {
                    w.l0((View) g.this.H.getParent());
                }
                g.this.H.k();
                g.this.K.h(null);
                g gVar2 = g.this;
                gVar2.K = null;
                w.l0(gVar2.N);
            }
        }

        public h(b.a aVar) {
            this.f530a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public boolean a(androidx.appcompat.view.b bVar, Menu menu) {
            w.l0(g.this.N);
            return this.f530a.a(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public void b(androidx.appcompat.view.b bVar) {
            this.f530a.b(bVar);
            g gVar = g.this;
            if (gVar.I != null) {
                gVar.f520x.getDecorView().removeCallbacks(g.this.J);
            }
            g gVar2 = g.this;
            if (gVar2.H != null) {
                gVar2.h0();
                g gVar3 = g.this;
                gVar3.K = w.e(gVar3.H).b(0.0f);
                g.this.K.h(new a());
            }
            g gVar4 = g.this;
            androidx.appcompat.app.d dVar = gVar4.f522z;
            if (dVar != null) {
                dVar.j(gVar4.G);
            }
            g gVar5 = g.this;
            gVar5.G = null;
            w.l0(gVar5.N);
            g.this.b1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f530a.c(bVar, menuItem);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f530a.d(bVar, menu);
        }
    }

    static class i {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }

        static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    static class j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static androidx.core.os.i b(Configuration configuration) {
            return androidx.core.os.i.c(configuration.getLocales().toLanguageTags());
        }

        public static void c(androidx.core.os.i iVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(iVar.h()));
        }

        static void d(Configuration configuration, androidx.core.os.i iVar) {
            configuration.setLocales(LocaleList.forLanguageTags(iVar.h()));
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    static class m {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, final g gVar) {
            Objects.requireNonNull(gVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.h
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    gVar.B0();
                }
            };
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    class n extends androidx.appcompat.view.i {

        /* renamed from: n, reason: collision with root package name */
        private f f533n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f534o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f535p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f536q;

        n(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f535p = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f535p = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f534o = true;
                callback.onContentChanged();
            } finally {
                this.f534o = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f536q = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f536q = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f535p ? a().dispatchKeyEvent(keyEvent) : g.this.f0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || g.this.E0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(f fVar) {
            this.f533n = fVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(g.this.f519w, callback);
            androidx.appcompat.view.b bVarV0 = g.this.V0(aVar);
            if (bVarV0 != null) {
                return aVar.e(bVarV0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f534o) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View viewOnCreatePanelView;
            f fVar = this.f533n;
            return (fVar == null || (viewOnCreatePanelView = fVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            g.this.H0(i10);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f536q) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                g.this.I0(i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i10 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.a0(true);
            }
            f fVar = this.f533n;
            boolean zOnPreparePanel = fVar != null && fVar.a(i10);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            }
            if (gVar != null) {
                gVar.a0(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
            androidx.appcompat.view.menu.g gVar;
            t tVarR0 = g.this.r0(0, true);
            if (tVarR0 == null || (gVar = tVarR0.f555j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i10);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (g.this.z0() && i10 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    private class o extends p {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f538c;

        o(Context context) {
            super();
            this.f538c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.g.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.g.p
        public int c() {
            return j.a(this.f538c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.g.p
        public void d() {
            g.this.R();
        }
    }

    abstract class p {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f540a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        p() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f540a;
            if (broadcastReceiver != null) {
                try {
                    g.this.f519w.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f540a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f540a == null) {
                this.f540a = new a();
            }
            g.this.f519w.registerReceiver(this.f540a, intentFilterB);
        }
    }

    private class q extends p {

        /* renamed from: c, reason: collision with root package name */
        private final androidx.appcompat.app.t f543c;

        q(androidx.appcompat.app.t tVar) {
            super();
            this.f543c = tVar;
        }

        @Override // androidx.appcompat.app.g.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.g.p
        public int c() {
            return this.f543c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.g.p
        public void d() {
            g.this.R();
        }
    }

    private static class r {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    private class s extends ContentFrameLayout {
        public s(Context context) {
            super(context);
        }

        private boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.f0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            g.this.Z(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(g.a.b(getContext(), i10));
        }
    }

    protected static final class t {

        /* renamed from: a, reason: collision with root package name */
        int f546a;

        /* renamed from: b, reason: collision with root package name */
        int f547b;

        /* renamed from: c, reason: collision with root package name */
        int f548c;

        /* renamed from: d, reason: collision with root package name */
        int f549d;

        /* renamed from: e, reason: collision with root package name */
        int f550e;

        /* renamed from: f, reason: collision with root package name */
        int f551f;

        /* renamed from: g, reason: collision with root package name */
        ViewGroup f552g;

        /* renamed from: h, reason: collision with root package name */
        View f553h;

        /* renamed from: i, reason: collision with root package name */
        View f554i;

        /* renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.g f555j;

        /* renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.e f556k;

        /* renamed from: l, reason: collision with root package name */
        Context f557l;

        /* renamed from: m, reason: collision with root package name */
        boolean f558m;

        /* renamed from: n, reason: collision with root package name */
        boolean f559n;

        /* renamed from: o, reason: collision with root package name */
        boolean f560o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f561p;

        /* renamed from: q, reason: collision with root package name */
        boolean f562q = false;

        /* renamed from: r, reason: collision with root package name */
        boolean f563r;

        /* renamed from: s, reason: collision with root package name */
        Bundle f564s;

        t(int i10) {
            this.f546a = i10;
        }

        androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.f555j == null) {
                return null;
            }
            if (this.f556k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f557l, f.g.f23397j);
                this.f556k = eVar;
                eVar.j(aVar);
                this.f555j.b(this.f556k);
            }
            return this.f556k.f(this.f552g);
        }

        public boolean b() {
            if (this.f553h == null) {
                return false;
            }
            return this.f554i != null || this.f556k.b().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f555j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.O(this.f556k);
            }
            this.f555j = gVar;
            if (gVar == null || (eVar = this.f556k) == null) {
                return;
            }
            gVar.b(eVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(f.a.f23288a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                themeNewTheme.applyStyle(i10, true);
            }
            themeNewTheme.resolveAttribute(f.a.C, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 == 0) {
                i11 = f.i.f23421b;
            }
            themeNewTheme.applyStyle(i11, true);
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f557l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(f.j.f23545y0);
            this.f547b = typedArrayObtainStyledAttributes.getResourceId(f.j.B0, 0);
            this.f551f = typedArrayObtainStyledAttributes.getResourceId(f.j.A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final class u implements m.a {
        u() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
            androidx.appcompat.view.menu.g gVarD = gVar.D();
            boolean z11 = gVarD != gVar;
            g gVar2 = g.this;
            if (z11) {
                gVar = gVarD;
            }
            t tVarK0 = gVar2.k0(gVar);
            if (tVarK0 != null) {
                if (!z11) {
                    g.this.a0(tVarK0, z10);
                } else {
                    g.this.W(tVarK0.f546a, tVarK0, gVarD);
                    g.this.a0(tVarK0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackT0;
            if (gVar != gVar.D()) {
                return true;
            }
            g gVar2 = g.this;
            if (!gVar2.S || (callbackT0 = gVar2.t0()) == null || g.this.f500d0) {
                return true;
            }
            callbackT0.onMenuOpened(108, gVar);
            return true;
        }
    }

    g(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    g(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    private g(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        androidx.appcompat.app.c cVarY0;
        this.K = null;
        this.L = true;
        this.f502f0 = -100;
        this.f510n0 = new a();
        this.f519w = context;
        this.f522z = dVar;
        this.f518v = obj;
        if (this.f502f0 == -100 && (obj instanceof Dialog) && (cVarY0 = Y0()) != null) {
            this.f502f0 = cVarY0.P().n();
        }
        if (this.f502f0 == -100) {
            q.g gVar = f492v0;
            Integer num = (Integer) gVar.get(obj.getClass().getName());
            if (num != null) {
                this.f502f0 = num.intValue();
                gVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            T(window);
        }
        androidx.appcompat.widget.k.h();
    }

    private boolean D0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        t tVarR0 = r0(i10, true);
        if (tVarR0.f560o) {
            return false;
        }
        return N0(tVarR0, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean G0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.G
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.g$t r2 = r4.r0(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.g0 r5 = r4.D
            if (r5 == 0) goto L43
            boolean r5 = r5.g()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f519w
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.g0 r5 = r4.D
            boolean r5 = r5.b()
            if (r5 != 0) goto L3c
            boolean r5 = r4.f500d0
            if (r5 != 0) goto L62
            boolean r5 = r4.N0(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.g0 r5 = r4.D
            boolean r0 = r5.f()
            goto L68
        L3c:
            androidx.appcompat.widget.g0 r5 = r4.D
            boolean r0 = r5.e()
            goto L68
        L43:
            boolean r5 = r2.f560o
            if (r5 != 0) goto L64
            boolean r3 = r2.f559n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f558m
            if (r5 == 0) goto L62
            boolean r5 = r2.f563r
            if (r5 == 0) goto L5b
            r2.f558m = r1
            boolean r5 = r4.N0(r2, r6)
            goto L5c
        L5b:
            r5 = r0
        L5c:
            if (r5 == 0) goto L62
            r4.K0(r2, r6)
            goto L68
        L62:
            r0 = r1
            goto L68
        L64:
            r4.a0(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f519w
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            goto L85
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.G0(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void K0(androidx.appcompat.app.g.t r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.K0(androidx.appcompat.app.g$t, android.view.KeyEvent):void");
    }

    private boolean M0(t tVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.g gVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tVar.f558m || N0(tVar, keyEvent)) && (gVar = tVar.f555j) != null) {
            zPerformShortcut = gVar.performShortcut(i10, keyEvent, i11);
        }
        if (zPerformShortcut && (i11 & 1) == 0 && this.D == null) {
            a0(tVar, true);
        }
        return zPerformShortcut;
    }

    private boolean N0(t tVar, KeyEvent keyEvent) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        if (this.f500d0) {
            return false;
        }
        if (tVar.f558m) {
            return true;
        }
        t tVar2 = this.Z;
        if (tVar2 != null && tVar2 != tVar) {
            a0(tVar2, false);
        }
        Window.Callback callbackT0 = t0();
        if (callbackT0 != null) {
            tVar.f554i = callbackT0.onCreatePanelView(tVar.f546a);
        }
        int i10 = tVar.f546a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (g0Var3 = this.D) != null) {
            g0Var3.c();
        }
        if (tVar.f554i == null && (!z10 || !(L0() instanceof androidx.appcompat.app.r))) {
            androidx.appcompat.view.menu.g gVar = tVar.f555j;
            if (gVar == null || tVar.f563r) {
                if (gVar == null && (!x0(tVar) || tVar.f555j == null)) {
                    return false;
                }
                if (z10 && this.D != null) {
                    if (this.E == null) {
                        this.E = new C0008g();
                    }
                    this.D.a(tVar.f555j, this.E);
                }
                tVar.f555j.d0();
                if (!callbackT0.onCreatePanelMenu(tVar.f546a, tVar.f555j)) {
                    tVar.c(null);
                    if (z10 && (g0Var = this.D) != null) {
                        g0Var.a(null, this.E);
                    }
                    return false;
                }
                tVar.f563r = false;
            }
            tVar.f555j.d0();
            Bundle bundle = tVar.f564s;
            if (bundle != null) {
                tVar.f555j.P(bundle);
                tVar.f564s = null;
            }
            if (!callbackT0.onPreparePanel(0, tVar.f554i, tVar.f555j)) {
                if (z10 && (g0Var2 = this.D) != null) {
                    g0Var2.a(null, this.E);
                }
                tVar.f555j.c0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            tVar.f561p = z11;
            tVar.f555j.setQwertyMode(z11);
            tVar.f555j.c0();
        }
        tVar.f558m = true;
        tVar.f559n = false;
        this.Z = tVar;
        return true;
    }

    private void O0(boolean z10) {
        g0 g0Var = this.D;
        if (g0Var == null || !g0Var.g() || (ViewConfiguration.get(this.f519w).hasPermanentMenuKey() && !this.D.d())) {
            t tVarR0 = r0(0, true);
            tVarR0.f562q = true;
            a0(tVarR0, false);
            K0(tVarR0, null);
            return;
        }
        Window.Callback callbackT0 = t0();
        if (this.D.b() && z10) {
            this.D.e();
            if (this.f500d0) {
                return;
            }
            callbackT0.onPanelClosed(108, r0(0, true).f555j);
            return;
        }
        if (callbackT0 == null || this.f500d0) {
            return;
        }
        if (this.f508l0 && (this.f509m0 & 1) != 0) {
            this.f520x.getDecorView().removeCallbacks(this.f510n0);
            this.f510n0.run();
        }
        t tVarR02 = r0(0, true);
        androidx.appcompat.view.menu.g gVar = tVarR02.f555j;
        if (gVar == null || tVarR02.f563r || !callbackT0.onPreparePanel(0, tVarR02.f554i, gVar)) {
            return;
        }
        callbackT0.onMenuOpened(108, tVarR02.f555j);
        this.D.f();
    }

    private boolean P(boolean z10) {
        return Q(z10, true);
    }

    private int P0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean Q(boolean z10, boolean z11) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        if (this.f500d0) {
            return false;
        }
        int iV = V();
        int iA0 = A0(this.f519w, iV);
        androidx.core.os.i iVarU = Build.VERSION.SDK_INT < 33 ? U(this.f519w) : null;
        if (!z11 && iVarU != null) {
            iVarU = q0(this.f519w.getResources().getConfiguration());
        }
        boolean zA1 = a1(iA0, iVarU, z10);
        if (iV == 0) {
            p0(this.f519w).e();
        } else {
            p pVar = this.f506j0;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (iV == 3) {
            o0(this.f519w).e();
        } else {
            p pVar2 = this.f507k0;
            if (pVar2 != null) {
                pVar2.a();
            }
        }
        return zA1;
    }

    private void S() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.N.findViewById(R.id.content);
        View decorView = this.f520x.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f519w.obtainStyledAttributes(f.j.f23545y0);
        typedArrayObtainStyledAttributes.getValue(f.j.K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(f.j.L0, contentFrameLayout.getMinWidthMinor());
        int i10 = f.j.I0;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = f.j.J0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            typedArrayObtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = f.j.G0;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            typedArrayObtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = f.j.H0;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            typedArrayObtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void T(Window window) {
        if (this.f520x != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(callback);
        this.f521y = nVar;
        window.setCallback(nVar);
        z0 z0VarU = z0.u(this.f519w, null, f494x0);
        Drawable drawableH = z0VarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        z0VarU.w();
        this.f520x = window;
        if (Build.VERSION.SDK_INT < 33 || this.f516t0 != null) {
            return;
        }
        K(null);
    }

    private boolean T0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f520x.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || w.R((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int V() {
        int i10 = this.f502f0;
        return i10 != -100 ? i10 : androidx.appcompat.app.f.m();
    }

    private void X0() {
        if (this.M) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void Y() {
        p pVar = this.f506j0;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.f507k0;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    private androidx.appcompat.app.c Y0() {
        for (Context baseContext = this.f519w; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Z0(Configuration configuration) {
        Activity activity = (Activity) this.f518v;
        if (activity instanceof androidx.lifecycle.n) {
            if (!((androidx.lifecycle.n) activity).s().b().b(j.c.CREATED)) {
                return;
            }
        } else if (!this.f499c0 || this.f500d0) {
            return;
        }
        activity.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a1(int r9, androidx.core.os.i r10, boolean r11) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.IllegalArgumentException {
        /*
            r8 = this;
            android.content.Context r1 = r8.f519w
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.b0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f519w
            int r1 = r8.n0(r1)
            android.content.res.Configuration r2 = r8.f501e0
            if (r2 != 0) goto L1f
            android.content.Context r2 = r8.f519w
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.i r2 = r8.q0(r2)
            r5 = 0
            if (r10 != 0) goto L30
            r0 = r5
            goto L34
        L30:
            androidx.core.os.i r0 = r8.q0(r0)
        L34:
            r6 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.17E-43)
            goto L3b
        L3a:
            r3 = r6
        L3b:
            if (r0 == 0) goto L47
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L47
            r2 = r3 | 4
            r3 = r2 | 8192(0x2000, float:1.148E-41)
        L47:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L71
            if (r11 == 0) goto L71
            boolean r11 = r8.f498b0
            if (r11 == 0) goto L71
            boolean r11 = androidx.appcompat.app.g.f495y0
            if (r11 != 0) goto L5a
            boolean r11 = r8.f499c0
            if (r11 == 0) goto L71
        L5a:
            java.lang.Object r11 = r8.f518v
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L71
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L71
            java.lang.Object r11 = r8.f518v
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.b.q(r11)
            r11 = r7
            goto L72
        L71:
            r11 = r6
        L72:
            if (r11 != 0) goto L7f
            if (r3 == 0) goto L7f
            r11 = r3 & r1
            if (r11 != r3) goto L7b
            r6 = r7
        L7b:
            r8.c1(r4, r0, r6, r5)
            goto L80
        L7f:
            r7 = r11
        L80:
            if (r7 == 0) goto L9c
            java.lang.Object r11 = r8.f518v
            boolean r1 = r11 instanceof androidx.appcompat.app.c
            if (r1 == 0) goto L9c
            r1 = r3 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L91
            androidx.appcompat.app.c r11 = (androidx.appcompat.app.c) r11
            r11.U(r9)
        L91:
            r9 = r3 & 4
            if (r9 == 0) goto L9c
            java.lang.Object r9 = r8.f518v
            androidx.appcompat.app.c r9 = (androidx.appcompat.app.c) r9
            r9.T(r10)
        L9c:
            if (r7 == 0) goto Lb1
            if (r0 == 0) goto Lb1
            android.content.Context r9 = r8.f519w
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.i r9 = r8.q0(r9)
            r8.R0(r9)
        Lb1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.a1(int, androidx.core.os.i, boolean):boolean");
    }

    private Configuration b0(Context context, int i10, androidx.core.os.i iVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            Q0(configuration2, iVar);
        }
        return configuration2;
    }

    private ViewGroup c0() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f519w.obtainStyledAttributes(f.j.f23545y0);
        int i10 = f.j.D0;
        if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(f.j.M0, false)) {
            G(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i10, false)) {
            G(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(f.j.E0, false)) {
            G(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(f.j.F0, false)) {
            G(10);
        }
        this.V = typedArrayObtainStyledAttributes.getBoolean(f.j.f23550z0, false);
        typedArrayObtainStyledAttributes.recycle();
        j0();
        this.f520x.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f519w);
        if (this.W) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(this.U ? f.g.f23402o : f.g.f23401n, (ViewGroup) null);
        } else if (this.V) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(f.g.f23393f, (ViewGroup) null);
            this.T = false;
            this.S = false;
        } else if (this.S) {
            TypedValue typedValue = new TypedValue();
            this.f519w.getTheme().resolveAttribute(f.a.f23291d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f519w, typedValue.resourceId) : this.f519w).inflate(f.g.f23403p, (ViewGroup) null);
            g0 g0Var = (g0) viewGroup.findViewById(f.f.f23377p);
            this.D = g0Var;
            g0Var.setWindowCallback(t0());
            if (this.T) {
                this.D.k(109);
            }
            if (this.Q) {
                this.D.k(2);
            }
            if (this.R) {
                this.D.k(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.S + ", windowActionBarOverlay: " + this.T + ", android:windowIsFloating: " + this.V + ", windowActionModeOverlay: " + this.U + ", windowNoTitle: " + this.W + " }");
        }
        w.A0(viewGroup, new b());
        if (this.D == null) {
            this.O = (TextView) viewGroup.findViewById(f.f.M);
        }
        j1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(f.f.f23363b);
        ViewGroup viewGroup2 = (ViewGroup) this.f520x.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f520x.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void c1(int i10, androidx.core.os.i iVar, boolean z10, Configuration configuration) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Resources resources = this.f519w.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (iVar != null) {
            Q0(configuration2, iVar);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            androidx.appcompat.app.q.a(resources);
        }
        int i11 = this.f503g0;
        if (i11 != 0) {
            this.f519w.setTheme(i11);
            this.f519w.getTheme().applyStyle(this.f503g0, true);
        }
        if (z10 && (this.f518v instanceof Activity)) {
            Z0(configuration2);
        }
    }

    private void e1(View view) {
        Context context;
        int i10;
        if ((w.K(view) & 8192) != 0) {
            context = this.f519w;
            i10 = f.c.f23316b;
        } else {
            context = this.f519w;
            i10 = f.c.f23315a;
        }
        view.setBackgroundColor(androidx.core.content.a.c(context, i10));
    }

    private void i0() {
        if (this.M) {
            return;
        }
        this.N = c0();
        CharSequence charSequenceS0 = s0();
        if (!TextUtils.isEmpty(charSequenceS0)) {
            g0 g0Var = this.D;
            if (g0Var != null) {
                g0Var.setWindowTitle(charSequenceS0);
            } else if (L0() != null) {
                L0().s(charSequenceS0);
            } else {
                TextView textView = this.O;
                if (textView != null) {
                    textView.setText(charSequenceS0);
                }
            }
        }
        S();
        J0(this.N);
        this.M = true;
        t tVarR0 = r0(0, false);
        if (this.f500d0) {
            return;
        }
        if (tVarR0 == null || tVarR0.f555j == null) {
            y0(108);
        }
    }

    private void j0() {
        if (this.f520x == null) {
            Object obj = this.f518v;
            if (obj instanceof Activity) {
                T(((Activity) obj).getWindow());
            }
        }
        if (this.f520x == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration l0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f5 = configuration.fontScale;
            float f10 = configuration2.fontScale;
            if (f5 != f10) {
                configuration3.fontScale = f10;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                k.a(configuration, configuration2, configuration3);
            } else if (!androidx.core.util.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            i.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private int n0(Context context) throws PackageManager.NameNotFoundException {
        if (!this.f505i0 && (this.f518v instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f518v.getClass()), i10 >= 29 ? 269221888 : i10 >= 24 ? 786432 : 0);
                if (activityInfo != null) {
                    this.f504h0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e5) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e5);
                this.f504h0 = 0;
            }
        }
        this.f505i0 = true;
        return this.f504h0;
    }

    private p o0(Context context) {
        if (this.f507k0 == null) {
            this.f507k0 = new o(context);
        }
        return this.f507k0;
    }

    private p p0(Context context) {
        if (this.f506j0 == null) {
            this.f506j0 = new q(androidx.appcompat.app.t.a(context));
        }
        return this.f506j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void u0() {
        /*
            r3 = this;
            r3.i0()
            boolean r0 = r3.S
            if (r0 == 0) goto L37
            androidx.appcompat.app.a r0 = r3.A
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f518v
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            androidx.appcompat.app.u r0 = new androidx.appcompat.app.u
            java.lang.Object r1 = r3.f518v
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.T
            r0.<init>(r1, r2)
        L1d:
            r3.A = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            androidx.appcompat.app.u r0 = new androidx.appcompat.app.u
            java.lang.Object r1 = r3.f518v
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            androidx.appcompat.app.a r0 = r3.A
            if (r0 == 0) goto L37
            boolean r1 = r3.f511o0
            r0.q(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.u0():void");
    }

    private boolean v0(t tVar) {
        View view = tVar.f554i;
        if (view != null) {
            tVar.f553h = view;
            return true;
        }
        if (tVar.f555j == null) {
            return false;
        }
        if (this.F == null) {
            this.F = new u();
        }
        View view2 = (View) tVar.a(this.F);
        tVar.f553h = view2;
        return view2 != null;
    }

    private boolean w0(t tVar) {
        tVar.d(m0());
        tVar.f552g = new s(tVar.f557l);
        tVar.f548c = 81;
        return true;
    }

    private boolean x0(t tVar) {
        Context context = this.f519w;
        int i10 = tVar.f546a;
        if ((i10 == 0 || i10 == 108) && this.D != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(f.a.f23291d, typedValue, true);
            Resources.Theme themeNewTheme = null;
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(f.a.f23292e, typedValue, true);
            } else {
                theme.resolveAttribute(f.a.f23292e, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.R(this);
        tVar.c(gVar);
        return true;
    }

    private void y0(int i10) {
        this.f509m0 = (1 << i10) | this.f509m0;
        if (this.f508l0) {
            return;
        }
        w.g0(this.f520x.getDecorView(), this.f510n0);
        this.f508l0 = true;
    }

    @Override // androidx.appcompat.app.f
    public void A() {
        androidx.appcompat.app.a aVarR = r();
        if (aVarR != null) {
            aVarR.r(true);
        }
    }

    int A0(Context context, int i10) {
        p pVarP0;
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    pVarP0 = o0(context);
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                pVarP0 = p0(context);
            }
            return pVarP0.c();
        }
        return i10;
    }

    @Override // androidx.appcompat.app.f
    public void B(Bundle bundle) {
    }

    boolean B0() {
        boolean z10 = this.f497a0;
        this.f497a0 = false;
        t tVarR0 = r0(0, false);
        if (tVarR0 != null && tVarR0.f560o) {
            if (!z10) {
                a0(tVarR0, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.G;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a aVarR = r();
        return aVarR != null && aVarR.g();
    }

    @Override // androidx.appcompat.app.f
    public void C() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        Q(true, false);
    }

    boolean C0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.f497a0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            D0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public void D() {
        androidx.appcompat.app.a aVarR = r();
        if (aVarR != null) {
            aVarR.r(false);
        }
    }

    boolean E0(int i10, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarR = r();
        if (aVarR != null && aVarR.n(i10, keyEvent)) {
            return true;
        }
        t tVar = this.Z;
        if (tVar != null && M0(tVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            t tVar2 = this.Z;
            if (tVar2 != null) {
                tVar2.f559n = true;
            }
            return true;
        }
        if (this.Z == null) {
            t tVarR0 = r0(0, true);
            N0(tVarR0, keyEvent);
            boolean zM0 = M0(tVarR0, keyEvent.getKeyCode(), keyEvent, 1);
            tVarR0.f558m = false;
            if (zM0) {
                return true;
            }
        }
        return false;
    }

    boolean F0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                G0(0, keyEvent);
                return true;
            }
        } else if (B0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public boolean G(int i10) {
        int iP0 = P0(i10);
        if (this.W && iP0 == 108) {
            return false;
        }
        if (this.S && iP0 == 1) {
            this.S = false;
        }
        if (iP0 == 1) {
            X0();
            this.W = true;
            return true;
        }
        if (iP0 == 2) {
            X0();
            this.Q = true;
            return true;
        }
        if (iP0 == 5) {
            X0();
            this.R = true;
            return true;
        }
        if (iP0 == 10) {
            X0();
            this.U = true;
            return true;
        }
        if (iP0 == 108) {
            X0();
            this.S = true;
            return true;
        }
        if (iP0 != 109) {
            return this.f520x.requestFeature(iP0);
        }
        X0();
        this.T = true;
        return true;
    }

    @Override // androidx.appcompat.app.f
    public void H(int i10) {
        i0();
        ViewGroup viewGroup = (ViewGroup) this.N.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f519w).inflate(i10, viewGroup);
        this.f521y.c(this.f520x.getCallback());
    }

    void H0(int i10) {
        androidx.appcompat.app.a aVarR;
        if (i10 != 108 || (aVarR = r()) == null) {
            return;
        }
        aVarR.h(true);
    }

    @Override // androidx.appcompat.app.f
    public void I(View view) {
        i0();
        ViewGroup viewGroup = (ViewGroup) this.N.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f521y.c(this.f520x.getCallback());
    }

    void I0(int i10) {
        if (i10 == 108) {
            androidx.appcompat.app.a aVarR = r();
            if (aVarR != null) {
                aVarR.h(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            t tVarR0 = r0(i10, true);
            if (tVarR0.f560o) {
                a0(tVarR0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.f
    public void J(View view, ViewGroup.LayoutParams layoutParams) {
        i0();
        ViewGroup viewGroup = (ViewGroup) this.N.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f521y.c(this.f520x.getCallback());
    }

    void J0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.f
    public void K(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.K(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f516t0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f517u0) != null) {
            m.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f517u0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f518v;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                onBackInvokedDispatcher = m.a((Activity) this.f518v);
            }
        }
        this.f516t0 = onBackInvokedDispatcher;
        b1();
    }

    @Override // androidx.appcompat.app.f
    public void L(Toolbar toolbar) {
        if (this.f518v instanceof Activity) {
            androidx.appcompat.app.a aVarR = r();
            if (aVarR instanceof androidx.appcompat.app.u) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.B = null;
            if (aVarR != null) {
                aVarR.m();
            }
            this.A = null;
            if (toolbar != null) {
                androidx.appcompat.app.r rVar = new androidx.appcompat.app.r(toolbar, s0(), this.f521y);
                this.A = rVar;
                this.f521y.e(rVar.f599c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f521y.e(null);
            }
            t();
        }
    }

    final androidx.appcompat.app.a L0() {
        return this.A;
    }

    @Override // androidx.appcompat.app.f
    public void M(int i10) {
        this.f503g0 = i10;
    }

    @Override // androidx.appcompat.app.f
    public final void N(CharSequence charSequence) {
        this.C = charSequence;
        g0 g0Var = this.D;
        if (g0Var != null) {
            g0Var.setWindowTitle(charSequence);
            return;
        }
        if (L0() != null) {
            L0().s(charSequence);
            return;
        }
        TextView textView = this.O;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    void Q0(Configuration configuration, androidx.core.os.i iVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            k.d(configuration, iVar);
        } else {
            i.d(configuration, iVar.d(0));
            i.c(configuration, iVar.d(0));
        }
    }

    public boolean R() {
        return P(true);
    }

    void R0(androidx.core.os.i iVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            k.c(iVar);
        } else {
            Locale.setDefault(iVar.d(0));
        }
    }

    final boolean S0() {
        ViewGroup viewGroup;
        return this.M && (viewGroup = this.N) != null && w.S(viewGroup);
    }

    androidx.core.os.i U(Context context) {
        androidx.core.os.i iVarQ;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (iVarQ = androidx.appcompat.app.f.q()) == null) {
            return null;
        }
        androidx.core.os.i iVarQ0 = q0(context.getApplicationContext().getResources().getConfiguration());
        androidx.core.os.i iVarB = i10 >= 24 ? androidx.appcompat.app.p.b(iVarQ, iVarQ0) : iVarQ.f() ? androidx.core.os.i.e() : androidx.core.os.i.c(iVarQ.d(0).toString());
        return iVarB.f() ? iVarQ0 : iVarB;
    }

    boolean U0() {
        if (this.f516t0 == null) {
            return false;
        }
        t tVarR0 = r0(0, false);
        return (tVarR0 != null && tVarR0.f560o) || this.G != null;
    }

    public androidx.appcompat.view.b V0(b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.G;
        if (bVar != null) {
            bVar.c();
        }
        h hVar = new h(aVar);
        androidx.appcompat.app.a aVarR = r();
        if (aVarR != null) {
            androidx.appcompat.view.b bVarT = aVarR.t(hVar);
            this.G = bVarT;
            if (bVarT != null && (dVar = this.f522z) != null) {
                dVar.g(bVarT);
            }
        }
        if (this.G == null) {
            this.G = W0(hVar);
        }
        b1();
        return this.G;
    }

    void W(int i10, t tVar, Menu menu) {
        if (menu == null) {
            if (tVar == null && i10 >= 0) {
                t[] tVarArr = this.Y;
                if (i10 < tVarArr.length) {
                    tVar = tVarArr[i10];
                }
            }
            if (tVar != null) {
                menu = tVar.f555j;
            }
        }
        if ((tVar == null || tVar.f560o) && !this.f500d0) {
            this.f521y.d(this.f520x.getCallback(), i10, menu);
        }
    }

    androidx.appcompat.view.b W0(b.a aVar) {
        androidx.appcompat.view.b bVarT;
        Context dVar;
        androidx.appcompat.app.d dVar2;
        h0();
        androidx.appcompat.view.b bVar = this.G;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof h)) {
            aVar = new h(aVar);
        }
        androidx.appcompat.app.d dVar3 = this.f522z;
        if (dVar3 == null || this.f500d0) {
            bVarT = null;
        } else {
            try {
                bVarT = dVar3.t(aVar);
            } catch (AbstractMethodError unused) {
            }
        }
        if (bVarT != null) {
            this.G = bVarT;
        } else {
            if (this.H == null) {
                if (this.V) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f519w.getTheme();
                    theme.resolveAttribute(f.a.f23291d, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f519w.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new androidx.appcompat.view.d(this.f519w, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f519w;
                    }
                    this.H = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, f.a.f23293f);
                    this.I = popupWindow;
                    androidx.core.widget.h.b(popupWindow, 2);
                    this.I.setContentView(this.H);
                    this.I.setWidth(-1);
                    dVar.getTheme().resolveAttribute(f.a.f23289b, typedValue, true);
                    this.H.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.I.setHeight(-2);
                    this.J = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.N.findViewById(f.f.f23369h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m0()));
                        this.H = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.H != null) {
                h0();
                this.H.k();
                androidx.appcompat.view.e eVar = new androidx.appcompat.view.e(this.H.getContext(), this.H, aVar, this.I == null);
                if (aVar.d(eVar, eVar.e())) {
                    eVar.k();
                    this.H.h(eVar);
                    this.G = eVar;
                    if (S0()) {
                        this.H.setAlpha(0.0f);
                        c0 c0VarB = w.e(this.H).b(1.0f);
                        this.K = c0VarB;
                        c0VarB.h(new e());
                    } else {
                        this.H.setAlpha(1.0f);
                        this.H.setVisibility(0);
                        if (this.H.getParent() instanceof View) {
                            w.l0((View) this.H.getParent());
                        }
                    }
                    if (this.I != null) {
                        this.f520x.getDecorView().post(this.J);
                    }
                } else {
                    this.G = null;
                }
            }
        }
        androidx.appcompat.view.b bVar2 = this.G;
        if (bVar2 != null && (dVar2 = this.f522z) != null) {
            dVar2.g(bVar2);
        }
        b1();
        return this.G;
    }

    void X(androidx.appcompat.view.menu.g gVar) {
        if (this.X) {
            return;
        }
        this.X = true;
        this.D.l();
        Window.Callback callbackT0 = t0();
        if (callbackT0 != null && !this.f500d0) {
            callbackT0.onPanelClosed(108, gVar);
        }
        this.X = false;
    }

    void Z(int i10) {
        a0(r0(i10, true), true);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        t tVarK0;
        Window.Callback callbackT0 = t0();
        if (callbackT0 == null || this.f500d0 || (tVarK0 = k0(gVar.D())) == null) {
            return false;
        }
        return callbackT0.onMenuItemSelected(tVarK0.f546a, menuItem);
    }

    void a0(t tVar, boolean z10) {
        ViewGroup viewGroup;
        g0 g0Var;
        if (z10 && tVar.f546a == 0 && (g0Var = this.D) != null && g0Var.b()) {
            X(tVar.f555j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f519w.getSystemService("window");
        if (windowManager != null && tVar.f560o && (viewGroup = tVar.f552g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                W(tVar.f546a, tVar, null);
            }
        }
        tVar.f558m = false;
        tVar.f559n = false;
        tVar.f560o = false;
        tVar.f553h = null;
        tVar.f562q = true;
        if (this.Z == tVar) {
            this.Z = null;
        }
        if (tVar.f546a == 0) {
            b1();
        }
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        O0(true);
    }

    void b1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zU0 = U0();
            if (zU0 && this.f517u0 == null) {
                this.f517u0 = m.b(this.f516t0, this);
            } else {
                if (zU0 || (onBackInvokedCallback = this.f517u0) == null) {
                    return;
                }
                m.c(this.f516t0, onBackInvokedCallback);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View d0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        androidx.appcompat.app.k kVar;
        boolean z11 = false;
        if (this.f514r0 == null) {
            String string = this.f519w.obtainStyledAttributes(f.j.f23545y0).getString(f.j.C0);
            if (string == null) {
                kVar = new androidx.appcompat.app.k();
            } else {
                try {
                    this.f514r0 = (androidx.appcompat.app.k) this.f519w.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    kVar = new androidx.appcompat.app.k();
                }
            }
            this.f514r0 = kVar;
        }
        boolean z12 = f493w0;
        boolean zT0 = true;
        if (z12) {
            if (this.f515s0 == null) {
                this.f515s0 = new androidx.appcompat.app.o();
            }
            if (this.f515s0.a(attributeSet)) {
                z10 = true;
            } else {
                if (attributeSet instanceof XmlPullParser) {
                    if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    }
                    z10 = z11;
                } else {
                    zT0 = T0((ViewParent) view);
                }
                z11 = zT0;
                z10 = z11;
            }
        } else {
            z10 = z11;
        }
        return this.f514r0.r(view, str, context, attributeSet, z10, z12, true, i1.c());
    }

    final int d1(h0 h0Var, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z10;
        boolean z11;
        int iK = h0Var != null ? h0Var.k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.H;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.H.getLayoutParams();
            if (this.H.isShown()) {
                if (this.f512p0 == null) {
                    this.f512p0 = new Rect();
                    this.f513q0 = new Rect();
                }
                Rect rect2 = this.f512p0;
                Rect rect3 = this.f513q0;
                if (h0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(h0Var.i(), h0Var.k(), h0Var.j(), h0Var.h());
                }
                j1.a(this.N, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                h0 h0VarH = w.H(this.N);
                int i13 = h0VarH == null ? 0 : h0VarH.i();
                int iJ = h0VarH == null ? 0 : h0VarH.j();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.P != null) {
                    View view = this.P;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != i13 || marginLayoutParams2.rightMargin != iJ) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = i13;
                            marginLayoutParams2.rightMargin = iJ;
                            this.P.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f519w);
                    this.P = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i13;
                    layoutParams.rightMargin = iJ;
                    this.N.addView(this.P, -1, layoutParams);
                }
                View view3 = this.P;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    e1(this.P);
                }
                if (!this.U && z) {
                    iK = 0;
                }
                z10 = z;
                z = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z = false;
            }
            if (z) {
                this.H.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.P;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return iK;
    }

    @Override // androidx.appcompat.app.f
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        i0();
        ((ViewGroup) this.N.findViewById(R.id.content)).addView(view, layoutParams);
        this.f521y.c(this.f520x.getCallback());
    }

    void e0() {
        androidx.appcompat.view.menu.g gVar;
        g0 g0Var = this.D;
        if (g0Var != null) {
            g0Var.l();
        }
        if (this.I != null) {
            this.f520x.getDecorView().removeCallbacks(this.J);
            if (this.I.isShowing()) {
                try {
                    this.I.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.I = null;
        }
        h0();
        t tVarR0 = r0(0, false);
        if (tVarR0 == null || (gVar = tVarR0.f555j) == null) {
            return;
        }
        gVar.close();
    }

    boolean f0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f518v;
        if (((obj instanceof f.a) || (obj instanceof androidx.appcompat.app.j)) && (decorView = this.f520x.getDecorView()) != null && androidx.core.view.f.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f521y.b(this.f520x.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? C0(keyCode, keyEvent) : F0(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.app.f
    public Context g(Context context) {
        this.f498b0 = true;
        int iA0 = A0(context, V());
        if (androidx.appcompat.app.f.u(context)) {
            androidx.appcompat.app.f.O(context);
        }
        androidx.core.os.i iVarU = U(context);
        if (f496z0 && (context instanceof ContextThemeWrapper)) {
            try {
                r.a((ContextThemeWrapper) context, b0(context, iA0, iVarU, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(b0(context, iA0, iVarU, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f495y0) {
            return super.g(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = i.a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationB0 = b0(context, iA0, iVarU, configuration2.equals(configuration3) ? null : l0(configuration2, configuration3), true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, f.i.f23422c);
        dVar.a(configurationB0);
        boolean z10 = false;
        try {
            z10 = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z10) {
            h.f.a(dVar.getTheme());
        }
        return super.g(dVar);
    }

    void g0(int i10) {
        t tVarR0;
        t tVarR02 = r0(i10, true);
        if (tVarR02.f555j != null) {
            Bundle bundle = new Bundle();
            tVarR02.f555j.Q(bundle);
            if (bundle.size() > 0) {
                tVarR02.f564s = bundle;
            }
            tVarR02.f555j.d0();
            tVarR02.f555j.clear();
        }
        tVarR02.f563r = true;
        tVarR02.f562q = true;
        if ((i10 != 108 && i10 != 0) || this.D == null || (tVarR0 = r0(0, false)) == null) {
            return;
        }
        tVarR0.f558m = false;
        N0(tVarR0, null);
    }

    void h0() {
        c0 c0Var = this.K;
        if (c0Var != null) {
            c0Var.c();
        }
    }

    @Override // androidx.appcompat.app.f
    public View j(int i10) {
        i0();
        return this.f520x.findViewById(i10);
    }

    t k0(Menu menu) {
        t[] tVarArr = this.Y;
        int length = tVarArr != null ? tVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            t tVar = tVarArr[i10];
            if (tVar != null && tVar.f555j == menu) {
                return tVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.f
    public Context l() {
        return this.f519w;
    }

    final Context m0() {
        androidx.appcompat.app.a aVarR = r();
        Context contextJ = aVarR != null ? aVarR.j() : null;
        return contextJ == null ? this.f519w : contextJ;
    }

    @Override // androidx.appcompat.app.f
    public int n() {
        return this.f502f0;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return d0(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    public MenuInflater p() {
        if (this.B == null) {
            u0();
            androidx.appcompat.app.a aVar = this.A;
            this.B = new androidx.appcompat.view.g(aVar != null ? aVar.j() : this.f519w);
        }
        return this.B;
    }

    androidx.core.os.i q0(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? k.b(configuration) : androidx.core.os.i.c(j.b(configuration.locale));
    }

    @Override // androidx.appcompat.app.f
    public androidx.appcompat.app.a r() {
        u0();
        return this.A;
    }

    protected t r0(int i10, boolean z10) {
        t[] tVarArr = this.Y;
        if (tVarArr == null || tVarArr.length <= i10) {
            t[] tVarArr2 = new t[i10 + 1];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.Y = tVarArr2;
            tVarArr = tVarArr2;
        }
        t tVar = tVarArr[i10];
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(i10);
        tVarArr[i10] = tVar2;
        return tVar2;
    }

    @Override // androidx.appcompat.app.f
    public void s() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f519w);
        if (layoutInflaterFrom.getFactory() == null) {
            androidx.core.view.g.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof g) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    final CharSequence s0() {
        Object obj = this.f518v;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.C;
    }

    @Override // androidx.appcompat.app.f
    public void t() {
        if (L0() == null || r().k()) {
            return;
        }
        y0(0);
    }

    final Window.Callback t0() {
        return this.f520x.getCallback();
    }

    @Override // androidx.appcompat.app.f
    public void w(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        androidx.appcompat.app.a aVarR;
        if (this.S && this.M && (aVarR = r()) != null) {
            aVarR.l(configuration);
        }
        androidx.appcompat.widget.k.b().g(this.f519w);
        this.f501e0 = new Configuration(this.f519w.getResources().getConfiguration());
        Q(false, false);
    }

    @Override // androidx.appcompat.app.f
    public void x(Bundle bundle) {
        this.f498b0 = true;
        P(false);
        j0();
        Object obj = this.f518v;
        if (obj instanceof Activity) {
            String strC = null;
            try {
                strC = androidx.core.app.j.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (strC != null) {
                androidx.appcompat.app.a aVarL0 = L0();
                if (aVarL0 == null) {
                    this.f511o0 = true;
                } else {
                    aVarL0.q(true);
                }
            }
            androidx.appcompat.app.f.d(this);
        }
        this.f501e0 = new Configuration(this.f519w.getResources().getConfiguration());
        this.f499c0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // androidx.appcompat.app.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f518v
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.f.E(r3)
        L9:
            boolean r0 = r3.f508l0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f520x
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f510n0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f500d0 = r0
            int r0 = r3.f502f0
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f518v
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            q.g r0 = androidx.appcompat.app.g.f492v0
            java.lang.Object r1 = r3.f518v
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f502f0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            q.g r0 = androidx.appcompat.app.g.f492v0
            java.lang.Object r1 = r3.f518v
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.A
            if (r0 == 0) goto L5b
            r0.m()
        L5b:
            r3.Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.y():void");
    }

    @Override // androidx.appcompat.app.f
    public void z(Bundle bundle) {
        i0();
    }

    public boolean z0() {
        return this.L;
    }
}
