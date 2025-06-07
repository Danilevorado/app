package androidx.core.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.a;
import androidx.core.view.accessibility.d;
import androidx.core.view.h0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: c, reason: collision with root package name */
    private static Field f2497c;

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f2495a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    private static WeakHashMap f2496b = null;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f2498d = false;

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f2499e = {y.c.f28381b, y.c.f28382c, y.c.f28393n, y.c.f28404y, y.c.B, y.c.C, y.c.D, y.c.E, y.c.F, y.c.G, y.c.f28383d, y.c.f28384e, y.c.f28385f, y.c.f28386g, y.c.f28387h, y.c.f28388i, y.c.f28389j, y.c.f28390k, y.c.f28391l, y.c.f28392m, y.c.f28394o, y.c.f28395p, y.c.f28396q, y.c.f28397r, y.c.f28398s, y.c.f28399t, y.c.f28400u, y.c.f28401v, y.c.f28402w, y.c.f28403x, y.c.f28405z, y.c.A};

    /* renamed from: f, reason: collision with root package name */
    private static final androidx.core.view.t f2500f = new androidx.core.view.t() { // from class: androidx.core.view.v
        @Override // androidx.core.view.t
        public final c a(c cVar) {
            return w.W(cVar);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final e f2501g = new e();

    class a extends f {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.w.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(p.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.w.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            p.i(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.w.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.w.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return p.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.w.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            p.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.w.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.w.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return r.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.w.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            r.b(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.w.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.w.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(p.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.w.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            p.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.w.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: m, reason: collision with root package name */
        private final WeakHashMap f2502m = new WeakHashMap();

        e() {
        }

        private void b(View view, boolean z10) {
            boolean z11 = view.isShown() && view.getWindowVisibility() == 0;
            if (z10 != z11) {
                w.X(view, z11 ? 16 : 32);
                this.f2502m.put(view, Boolean.valueOf(z11));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        void a(View view) {
            this.f2502m.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        void d(View view) {
            this.f2502m.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry entry : this.f2502m.entrySet()) {
                    b((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f2503a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f2504b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2505c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2506d;

        f(int i10, Class cls, int i11) {
            this(i10, cls, 0, i11);
        }

        f(int i10, Class cls, int i11, int i12) {
            this.f2503a = i10;
            this.f2504b = cls;
            this.f2506d = i11;
            this.f2505c = i12;
        }

        private boolean b() {
            return true;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.f2505c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract Object d(View view);

        abstract void e(View view, Object obj);

        Object f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            Object tag = view.getTag(this.f2503a);
            if (this.f2504b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void g(View view, Object obj) {
            if (c()) {
                e(view, obj);
            } else if (b() && h(f(view), obj)) {
                w.j(view);
                view.setTag(this.f2503a, obj);
                w.X(view, this.f2506d);
            }
        }

        abstract boolean h(Object obj, Object obj2);
    }

    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    static class j {
        static Rect a(View view) {
            return view.getClipBounds();
        }

        static boolean b(View view) {
            return view.isInLayout();
        }

        static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static class k {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    static class l {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class m {

        class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            h0 f2507a = null;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f2508b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.core.view.r f2509c;

            a(View view, androidx.core.view.r rVar) {
                this.f2508b = view;
                this.f2509c = rVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                h0 h0VarV = h0.v(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    m.a(windowInsets, this.f2508b);
                    if (h0VarV.equals(this.f2507a)) {
                        return this.f2509c.a(view, h0VarV).t();
                    }
                }
                this.f2507a = h0VarV;
                h0 h0VarA = this.f2509c.a(view, h0VarV);
                if (i10 >= 30) {
                    return h0VarA.t();
                }
                w.l0(view);
                return h0VarA.t();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(y.c.S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static h0 b(View view, h0 h0Var, Rect rect) {
            WindowInsets windowInsetsT = h0Var.t();
            if (windowInsetsT != null) {
                return h0.v(view.computeSystemWindowInsets(windowInsetsT, rect), view);
            }
            rect.setEmpty();
            return h0Var;
        }

        static boolean c(View view, float f5, float f10, boolean z10) {
            return view.dispatchNestedFling(f5, f10, z10);
        }

        static boolean d(View view, float f5, float f10) {
            return view.dispatchNestedPreFling(f5, f10);
        }

        static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static h0 j(View view) {
            return h0.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f5) {
            view.setElevation(f5);
        }

        static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void u(View view, androidx.core.view.r rVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(y.c.L, rVar);
            }
            if (rVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(y.c.S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, rVar));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f5) {
            view.setTranslationZ(f5);
        }

        static void x(View view, float f5) {
            view.setZ(f5);
        }

        static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    private static class n {
        public static h0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            h0 h0VarU = h0.u(rootWindowInsets);
            h0VarU.r(h0VarU);
            h0VarU.d(view.getRootView());
            return h0VarU;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    static class o {
        static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        static int b(View view) {
            return view.getImportantForAutofill();
        }

        static int c(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View h(View view, View view2, int i10) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }

        static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void k(View view, boolean z10) {
            view.setFocusedByDefault(z10);
        }

        static void l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        static void m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        static void n(View view, int i10) {
            view.setNextClusterForwardId(i10);
        }

        static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    static class p {
        static void a(View view, final u uVar) {
            int i10 = y.c.R;
            q.g gVar = (q.g) view.getTag(i10);
            if (gVar == null) {
                gVar = new q.g();
                view.setTag(i10, gVar);
            }
            Objects.requireNonNull(uVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.x
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return uVar.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            gVar.put(uVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, u uVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            q.g gVar = (q.g) view.getTag(y.c.R);
            if (gVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(uVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    private static class q {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    private static class r {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class s {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static androidx.core.view.c b(View view, androidx.core.view.c cVar) {
            ContentInfo contentInfoF = cVar.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? cVar : androidx.core.view.c.g(contentInfoPerformReceiveContent);
        }

        public static void c(View view, String[] strArr, androidx.core.view.s sVar) {
            if (sVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new t(sVar));
            }
        }
    }

    private static final class t implements OnReceiveContentListener {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.core.view.s f2510a;

        t(androidx.core.view.s sVar) {
            this.f2510a = sVar;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            androidx.core.view.c cVarG = androidx.core.view.c.g(contentInfo);
            androidx.core.view.c cVarA = this.f2510a.a(view, cVarG);
            if (cVarA == null) {
                return null;
            }
            return cVarA == cVarG ? contentInfo : cVarA.f();
        }
    }

    public interface u {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    static class v {

        /* renamed from: d, reason: collision with root package name */
        private static final ArrayList f2511d = new ArrayList();

        /* renamed from: a, reason: collision with root package name */
        private WeakHashMap f2512a = null;

        /* renamed from: b, reason: collision with root package name */
        private SparseArray f2513b = null;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference f2514c = null;

        v() {
        }

        static v a(View view) {
            int i10 = y.c.Q;
            v vVar = (v) view.getTag(i10);
            if (vVar != null) {
                return vVar;
            }
            v vVar2 = new v();
            view.setTag(i10, vVar2);
            return vVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f2512a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f2513b == null) {
                this.f2513b = new SparseArray();
            }
            return this.f2513b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(y.c.R);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((u) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f2512a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f2511d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f2512a == null) {
                    this.f2512a = new WeakHashMap();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList arrayList2 = f2511d;
                    View view = (View) ((WeakReference) arrayList2.get(size)).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f2512a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f2512a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            int iIndexOfKey;
            WeakReference weakReference = this.f2514c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f2514c = new WeakReference(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray sparseArrayD = d();
            if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = (WeakReference) sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = (WeakReference) sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && w.R(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static int A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.b(view);
        }
        return 0;
    }

    public static void A0(View view, androidx.core.view.r rVar) {
        m.u(view, rVar);
    }

    public static int B(View view) {
        return i.d(view);
    }

    public static void B0(View view, int i10, int i11, int i12, int i13) {
        i.k(view, i10, i11, i12, i13);
    }

    public static int C(View view) {
        return h.d(view);
    }

    public static void C0(View view, boolean z10) {
        n0().g(view, Boolean.valueOf(z10));
    }

    public static int D(View view) {
        return h.e(view);
    }

    public static void D0(View view, int i10, int i11) {
        n.d(view, i10, i11);
    }

    public static String[] E(View view) {
        return Build.VERSION.SDK_INT >= 31 ? s.a(view) : (String[]) view.getTag(y.c.N);
    }

    public static void E0(View view, String str) {
        m.v(view, str);
    }

    public static int F(View view) {
        return i.e(view);
    }

    private static void F0(View view) {
        if (z(view) == 0) {
            y0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (z((View) parent) == 4) {
                y0(view, 2);
                return;
            }
        }
    }

    public static int G(View view) {
        return i.f(view);
    }

    private static f G0() {
        return new c(y.c.P, CharSequence.class, 64, 30);
    }

    public static h0 H(View view) {
        return n.a(view);
    }

    public static void H0(View view) {
        m.z(view);
    }

    public static CharSequence I(View view) {
        return (CharSequence) G0().f(view);
    }

    public static String J(View view) {
        return m.k(view);
    }

    public static int K(View view) {
        return h.g(view);
    }

    public static float L(View view) {
        return m.m(view);
    }

    public static boolean M(View view) {
        return m(view) != null;
    }

    public static boolean N(View view) {
        return g.a(view);
    }

    public static boolean O(View view) {
        return h.h(view);
    }

    public static boolean P(View view) {
        return h.i(view);
    }

    public static boolean Q(View view) {
        Boolean bool = (Boolean) b().f(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean R(View view) {
        return k.b(view);
    }

    public static boolean S(View view) {
        return k.c(view);
    }

    public static boolean T(View view) {
        return m.p(view);
    }

    public static boolean U(View view) {
        return i.g(view);
    }

    public static boolean V(View view) {
        Boolean bool = (Boolean) n0().f(view);
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.core.view.c W(androidx.core.view.c cVar) {
        return cVar;
    }

    static void X(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = p(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (o(view) != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                k.g(accessibilityEventObtain, i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(p(view));
                    F0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                k.g(accessibilityEventObtain2, i10);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(p(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e5);
                }
            }
        }
    }

    public static void Y(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void Z(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static h0 a0(View view, h0 h0Var) {
        WindowInsets windowInsetsT = h0Var.t();
        if (windowInsetsT != null) {
            WindowInsets windowInsetsB = l.b(view, windowInsetsT);
            if (!windowInsetsB.equals(windowInsetsT)) {
                return h0.v(windowInsetsB, view);
            }
        }
        return h0Var;
    }

    private static f b() {
        return new d(y.c.J, Boolean.class, 28);
    }

    public static void b0(View view, androidx.core.view.accessibility.d dVar) {
        view.onInitializeAccessibilityNodeInfo(dVar.w0());
    }

    public static int c(View view, CharSequence charSequence, androidx.core.view.accessibility.g gVar) {
        int iR = r(view, charSequence);
        if (iR != -1) {
            d(view, new d.a(iR, charSequence, gVar));
        }
        return iR;
    }

    private static f c0() {
        return new b(y.c.K, CharSequence.class, 8, 28);
    }

    private static void d(View view, d.a aVar) {
        j(view);
        j0(aVar.b(), view);
        q(view).add(aVar);
        X(view, 0);
    }

    public static boolean d0(View view, int i10, Bundle bundle) {
        return h.j(view, i10, bundle);
    }

    public static c0 e(View view) {
        if (f2496b == null) {
            f2496b = new WeakHashMap();
        }
        c0 c0Var = (c0) f2496b.get(view);
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0(view);
        f2496b.put(view, c0Var2);
        return c0Var2;
    }

    public static androidx.core.view.c e0(View view, androidx.core.view.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return s.b(view, cVar);
        }
        androidx.core.view.s sVar = (androidx.core.view.s) view.getTag(y.c.M);
        if (sVar == null) {
            return x(view).a(cVar);
        }
        androidx.core.view.c cVarA = sVar.a(view, cVar);
        if (cVarA == null) {
            return null;
        }
        return x(view).a(cVarA);
    }

    public static h0 f(View view, h0 h0Var, Rect rect) {
        return m.b(view, h0Var, rect);
    }

    public static void f0(View view) {
        h.k(view);
    }

    public static h0 g(View view, h0 h0Var) {
        WindowInsets windowInsetsT = h0Var.t();
        if (windowInsetsT != null) {
            WindowInsets windowInsetsA = l.a(view, windowInsetsT);
            if (!windowInsetsA.equals(windowInsetsT)) {
                return h0.v(windowInsetsA, view);
            }
        }
        return h0Var;
    }

    public static void g0(View view, Runnable runnable) {
        h.m(view, runnable);
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).b(view, keyEvent);
    }

    public static void h0(View view, Runnable runnable, long j10) {
        h.n(view, runnable, j10);
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).f(keyEvent);
    }

    public static void i0(View view, int i10) {
        j0(i10, view);
        X(view, 0);
    }

    static void j(View view) {
        androidx.core.view.a aVarL = l(view);
        if (aVarL == null) {
            aVarL = new androidx.core.view.a();
        }
        o0(view, aVarL);
    }

    private static void j0(int i10, View view) {
        List listQ = q(view);
        for (int i11 = 0; i11 < listQ.size(); i11++) {
            if (((d.a) listQ.get(i11)).b() == i10) {
                listQ.remove(i11);
                return;
            }
        }
    }

    public static int k() {
        return i.a();
    }

    public static void k0(View view, d.a aVar, CharSequence charSequence, androidx.core.view.accessibility.g gVar) {
        if (gVar == null && charSequence == null) {
            i0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, gVar));
        }
    }

    public static androidx.core.view.a l(View view) {
        View.AccessibilityDelegate accessibilityDelegateM = m(view);
        if (accessibilityDelegateM == null) {
            return null;
        }
        return accessibilityDelegateM instanceof a.C0033a ? ((a.C0033a) accessibilityDelegateM).f2371a : new androidx.core.view.a(accessibilityDelegateM);
    }

    public static void l0(View view) {
        l.c(view);
    }

    private static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? q.a(view) : n(view);
    }

    public static void m0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            q.c(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static View.AccessibilityDelegate n(View view) {
        if (f2498d) {
            return null;
        }
        if (f2497c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2497c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2498d = true;
                return null;
            }
        }
        try {
            Object obj = f2497c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2498d = true;
            return null;
        }
    }

    private static f n0() {
        return new a(y.c.O, Boolean.class, 28);
    }

    public static int o(View view) {
        return k.a(view);
    }

    public static void o0(View view, androidx.core.view.a aVar) {
        if (aVar == null && (m(view) instanceof a.C0033a)) {
            aVar = new androidx.core.view.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static CharSequence p(View view) {
        return (CharSequence) c0().f(view);
    }

    public static void p0(View view, boolean z10) {
        b().g(view, Boolean.valueOf(z10));
    }

    private static List q(View view) {
        int i10 = y.c.H;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i10, arrayList2);
        return arrayList2;
    }

    public static void q0(View view, int i10) {
        k.f(view, i10);
    }

    private static int r(View view, CharSequence charSequence) {
        List listQ = q(view);
        for (int i10 = 0; i10 < listQ.size(); i10++) {
            if (TextUtils.equals(charSequence, ((d.a) listQ.get(i10)).c())) {
                return ((d.a) listQ.get(i10)).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f2499e;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < listQ.size(); i14++) {
                z10 &= ((d.a) listQ.get(i14)).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static void r0(View view, CharSequence charSequence) {
        c0().g(view, charSequence);
        if (charSequence != null) {
            f2501g.a(view);
        } else {
            f2501g.d(view);
        }
    }

    public static ColorStateList s(View view) {
        return m.g(view);
    }

    public static void s0(View view, Drawable drawable) {
        h.q(view, drawable);
    }

    public static PorterDuff.Mode t(View view) {
        return m.h(view);
    }

    public static void t0(View view, ColorStateList colorStateList) {
        m.q(view, colorStateList);
    }

    public static Rect u(View view) {
        return j.a(view);
    }

    public static void u0(View view, PorterDuff.Mode mode) {
        m.r(view, mode);
    }

    public static Display v(View view) {
        return i.b(view);
    }

    public static void v0(View view, Rect rect) {
        j.c(view, rect);
    }

    public static float w(View view) {
        return m.i(view);
    }

    public static void w0(View view, float f5) {
        m.s(view, f5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static androidx.core.view.t x(View view) {
        return view instanceof androidx.core.view.t ? (androidx.core.view.t) view : f2500f;
    }

    public static void x0(View view, boolean z10) {
        h.r(view, z10);
    }

    public static boolean y(View view) {
        return h.b(view);
    }

    public static void y0(View view, int i10) {
        h.s(view, i10);
    }

    public static int z(View view) {
        return h.c(view);
    }

    public static void z0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.l(view, i10);
        }
    }
}
