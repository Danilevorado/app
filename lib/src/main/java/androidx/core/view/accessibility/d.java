package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    private static int f2376d;

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f2377a;

    /* renamed from: b, reason: collision with root package name */
    public int f2378b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f2379c = -1;

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;

        /* renamed from: e, reason: collision with root package name */
        public static final a f2380e = new a(1, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f2381f = new a(2, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f2382g = new a(4, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f2383h = new a(8, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f2384i = new a(16, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f2385j = new a(32, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f2386k = new a(64, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f2387l = new a(128, null);

        /* renamed from: m, reason: collision with root package name */
        public static final a f2388m = new a(256, (CharSequence) null, g.b.class);

        /* renamed from: n, reason: collision with root package name */
        public static final a f2389n = new a(512, (CharSequence) null, g.b.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f2390o = new a(1024, (CharSequence) null, g.c.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f2391p = new a(2048, (CharSequence) null, g.c.class);

        /* renamed from: q, reason: collision with root package name */
        public static final a f2392q = new a(4096, null);

        /* renamed from: r, reason: collision with root package name */
        public static final a f2393r = new a(8192, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f2394s = new a(16384, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f2395t = new a(32768, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f2396u = new a(65536, null);

        /* renamed from: v, reason: collision with root package name */
        public static final a f2397v = new a(131072, (CharSequence) null, g.C0035g.class);

        /* renamed from: w, reason: collision with root package name */
        public static final a f2398w = new a(262144, null);

        /* renamed from: x, reason: collision with root package name */
        public static final a f2399x = new a(524288, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f2400y = new a(1048576, null);

        /* renamed from: z, reason: collision with root package name */
        public static final a f2401z = new a(2097152, (CharSequence) null, g.h.class);

        /* renamed from: a, reason: collision with root package name */
        final Object f2402a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2403b;

        /* renamed from: c, reason: collision with root package name */
        private final Class f2404c;

        /* renamed from: d, reason: collision with root package name */
        protected final g f2405d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, g.e.class);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            L = new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, g.f.class);
            M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, g.d.class);
            N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a(int i10, CharSequence charSequence, g gVar) {
            this(null, i10, charSequence, gVar, null);
        }

        private a(int i10, CharSequence charSequence, Class cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        a(Object obj, int i10, CharSequence charSequence, g gVar, Class cls) {
            this.f2403b = i10;
            this.f2405d = gVar;
            this.f2402a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence) : obj;
            this.f2404c = cls;
        }

        public a a(CharSequence charSequence, g gVar) {
            return new a(null, this.f2403b, charSequence, gVar, this.f2404c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2402a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f2402a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f2405d == null) {
                return false;
            }
            Class cls = this.f2404c;
            if (cls != null) {
                try {
                    a5.a.a(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    throw null;
                } catch (Exception e5) {
                    Class cls2 = this.f2404c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e5);
                }
            }
            return this.f2405d.a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f2402a;
            Object obj3 = ((a) obj).f2402a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f2402a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final Object f2406a;

        b(Object obj) {
            this.f2406a = obj;
        }

        public static b a(int i10, int i11, boolean z10, int i12) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final Object f2407a;

        c(Object obj) {
            this.f2407a = obj;
        }

        public static c a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    private d(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2377a = accessibilityNodeInfo;
    }

    public static d L() {
        return x0(AccessibilityNodeInfo.obtain());
    }

    public static d M(View view) {
        return x0(AccessibilityNodeInfo.obtain(view));
    }

    public static d N(d dVar) {
        return x0(AccessibilityNodeInfo.obtain(dVar.f2377a));
    }

    private void Q(View view) {
        SparseArray sparseArrayU = u(view);
        if (sparseArrayU != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < sparseArrayU.size(); i10++) {
                if (((WeakReference) sparseArrayU.valueAt(i10)).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                sparseArrayU.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private void S(int i10, boolean z10) {
        Bundle bundleR = r();
        if (bundleR != null) {
            int i11 = bundleR.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            bundleR.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    private void d(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    private void f() {
        this.f2377a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f2377a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f2377a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f2377a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List g(String str) {
        ArrayList<Integer> integerArrayList = this.f2377a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f2377a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private static String i(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean k(int i10) {
        Bundle bundleR = r();
        return bundleR != null && (bundleR.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public static ClickableSpan[] p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray s(View view) {
        SparseArray sparseArrayU = u(view);
        if (sparseArrayU != null) {
            return sparseArrayU;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(y.c.I, sparseArray);
        return sparseArray;
    }

    private SparseArray u(View view) {
        return (SparseArray) view.getTag(y.c.I);
    }

    public static d x0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new d(accessibilityNodeInfo);
    }

    private boolean y() {
        return !g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int z(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i10)).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f2376d;
        f2376d = i11 + 1;
        return i11;
    }

    public boolean A() {
        return this.f2377a.isCheckable();
    }

    public boolean B() {
        return this.f2377a.isChecked();
    }

    public boolean C() {
        return this.f2377a.isClickable();
    }

    public boolean D() {
        return this.f2377a.isEnabled();
    }

    public boolean E() {
        return this.f2377a.isFocusable();
    }

    public boolean F() {
        return this.f2377a.isFocused();
    }

    public boolean G() {
        return this.f2377a.isLongClickable();
    }

    public boolean H() {
        return this.f2377a.isPassword();
    }

    public boolean I() {
        return this.f2377a.isScrollable();
    }

    public boolean J() {
        return this.f2377a.isSelected();
    }

    public boolean K() {
        return Build.VERSION.SDK_INT >= 26 ? this.f2377a.isShowingHintText() : k(4);
    }

    public boolean O(int i10, Bundle bundle) {
        return this.f2377a.performAction(i10, bundle);
    }

    public void P() {
        this.f2377a.recycle();
    }

    public void R(boolean z10) {
        this.f2377a.setAccessibilityFocused(z10);
    }

    public void T(Rect rect) {
        this.f2377a.setBoundsInParent(rect);
    }

    public void U(Rect rect) {
        this.f2377a.setBoundsInScreen(rect);
    }

    public void V(boolean z10) {
        this.f2377a.setCheckable(z10);
    }

    public void W(boolean z10) {
        this.f2377a.setChecked(z10);
    }

    public void X(CharSequence charSequence) {
        this.f2377a.setClassName(charSequence);
    }

    public void Y(boolean z10) {
        this.f2377a.setClickable(z10);
    }

    public void Z(Object obj) {
        this.f2377a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f2406a);
    }

    public void a(int i10) {
        this.f2377a.addAction(i10);
    }

    public void a0(Object obj) {
        this.f2377a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f2407a);
    }

    public void b(a aVar) {
        this.f2377a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f2402a);
    }

    public void b0(CharSequence charSequence) {
        this.f2377a.setContentDescription(charSequence);
    }

    public void c(View view, int i10) {
        this.f2377a.addChild(view, i10);
    }

    public void c0(boolean z10) {
        this.f2377a.setEnabled(z10);
    }

    public void d0(CharSequence charSequence) {
        this.f2377a.setError(charSequence);
    }

    public void e(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            f();
            Q(view);
            ClickableSpan[] clickableSpanArrP = p(charSequence);
            if (clickableSpanArrP == null || clickableSpanArrP.length <= 0) {
                return;
            }
            r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", y.c.f28380a);
            SparseArray sparseArrayS = s(view);
            for (int i10 = 0; i10 < clickableSpanArrP.length; i10++) {
                int iZ = z(clickableSpanArrP[i10], sparseArrayS);
                sparseArrayS.put(iZ, new WeakReference(clickableSpanArrP[i10]));
                d(clickableSpanArrP[i10], (Spanned) charSequence, iZ);
            }
        }
    }

    public void e0(boolean z10) {
        this.f2377a.setFocusable(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2377a;
        if (accessibilityNodeInfo == null) {
            if (dVar.f2377a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(dVar.f2377a)) {
            return false;
        }
        return this.f2379c == dVar.f2379c && this.f2378b == dVar.f2378b;
    }

    public void f0(boolean z10) {
        this.f2377a.setFocused(z10);
    }

    public void g0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2377a.setHeading(z10);
        } else {
            S(2, z10);
        }
    }

    public List h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f2377a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public void h0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2377a.setHintText(charSequence);
        } else {
            this.f2377a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2377a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(View view) {
        this.f2377a.setLabelFor(view);
    }

    public int j() {
        return this.f2377a.getActions();
    }

    public void j0(int i10) {
        this.f2377a.setMaxTextLength(i10);
    }

    public void k0(CharSequence charSequence) {
        this.f2377a.setPackageName(charSequence);
    }

    public void l(Rect rect) {
        this.f2377a.getBoundsInParent(rect);
    }

    public void l0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2377a.setPaneTitle(charSequence);
        } else {
            this.f2377a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void m(Rect rect) {
        this.f2377a.getBoundsInScreen(rect);
    }

    public void m0(View view) {
        this.f2378b = -1;
        this.f2377a.setParent(view);
    }

    public int n() {
        return this.f2377a.getChildCount();
    }

    public void n0(View view, int i10) {
        this.f2378b = i10;
        this.f2377a.setParent(view, i10);
    }

    public CharSequence o() {
        return this.f2377a.getClassName();
    }

    public void o0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2377a.setScreenReaderFocusable(z10);
        } else {
            S(1, z10);
        }
    }

    public void p0(boolean z10) {
        this.f2377a.setScrollable(z10);
    }

    public CharSequence q() {
        return this.f2377a.getContentDescription();
    }

    public void q0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2377a.setShowingHintText(z10);
        } else {
            S(4, z10);
        }
    }

    public Bundle r() {
        return this.f2377a.getExtras();
    }

    public void r0(View view, int i10) {
        this.f2379c = i10;
        this.f2377a.setSource(view, i10);
    }

    public void s0(CharSequence charSequence) {
        if (androidx.core.os.a.b()) {
            this.f2377a.setStateDescription(charSequence);
        } else {
            this.f2377a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public CharSequence t() {
        return this.f2377a.getPackageName();
    }

    public void t0(CharSequence charSequence) {
        this.f2377a.setText(charSequence);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        sb2.append("; boundsInParent: " + rect);
        m(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(t());
        sb2.append("; className: ");
        sb2.append(o());
        sb2.append("; text: ");
        sb2.append(v());
        sb2.append("; contentDescription: ");
        sb2.append(q());
        sb2.append("; viewId: ");
        sb2.append(x());
        sb2.append("; uniqueId: ");
        sb2.append(w());
        sb2.append("; checkable: ");
        sb2.append(A());
        sb2.append("; checked: ");
        sb2.append(B());
        sb2.append("; focusable: ");
        sb2.append(E());
        sb2.append("; focused: ");
        sb2.append(F());
        sb2.append("; selected: ");
        sb2.append(J());
        sb2.append("; clickable: ");
        sb2.append(C());
        sb2.append("; longClickable: ");
        sb2.append(G());
        sb2.append("; enabled: ");
        sb2.append(D());
        sb2.append("; password: ");
        sb2.append(H());
        sb2.append("; scrollable: " + I());
        sb2.append("; [");
        List listH = h();
        for (int i10 = 0; i10 < listH.size(); i10++) {
            a aVar = (a) listH.get(i10);
            String strI = i(aVar.b());
            if (strI.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strI = aVar.c().toString();
            }
            sb2.append(strI);
            if (i10 != listH.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void u0(View view) {
        this.f2377a.setTraversalAfter(view);
    }

    public CharSequence v() {
        if (!y()) {
            return this.f2377a.getText();
        }
        List listG = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listG2 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listG3 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listG4 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2377a.getText(), 0, this.f2377a.getText().length()));
        for (int i10 = 0; i10 < listG.size(); i10++) {
            spannableString.setSpan(new androidx.core.view.accessibility.a(((Integer) listG4.get(i10)).intValue(), this, r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listG.get(i10)).intValue(), ((Integer) listG2.get(i10)).intValue(), ((Integer) listG3.get(i10)).intValue());
        }
        return spannableString;
    }

    public void v0(boolean z10) {
        this.f2377a.setVisibleToUser(z10);
    }

    public String w() {
        return androidx.core.os.a.c() ? this.f2377a.getUniqueId() : this.f2377a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public AccessibilityNodeInfo w0() {
        return this.f2377a;
    }

    public String x() {
        return this.f2377a.getViewIdResourceName();
    }
}
