package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class j0 extends ListView {

    /* renamed from: m, reason: collision with root package name */
    private final Rect f1245m;

    /* renamed from: n, reason: collision with root package name */
    private int f1246n;

    /* renamed from: o, reason: collision with root package name */
    private int f1247o;

    /* renamed from: p, reason: collision with root package name */
    private int f1248p;

    /* renamed from: q, reason: collision with root package name */
    private int f1249q;

    /* renamed from: r, reason: collision with root package name */
    private int f1250r;

    /* renamed from: s, reason: collision with root package name */
    private d f1251s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f1252t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f1253u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f1254v;

    /* renamed from: w, reason: collision with root package name */
    private androidx.core.view.c0 f1255w;

    /* renamed from: x, reason: collision with root package name */
    private androidx.core.widget.f f1256x;

    /* renamed from: y, reason: collision with root package name */
    f f1257y;

    static class a {
        static void a(View view, float f5, float f10) {
            view.drawableHotspotChanged(f5, f10);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        private static Method f1258a;

        /* renamed from: b, reason: collision with root package name */
        private static Method f1259b;

        /* renamed from: c, reason: collision with root package name */
        private static Method f1260c;

        /* renamed from: d, reason: collision with root package name */
        private static boolean f1261d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f1258a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f1259b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f1260c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1261d = true;
            } catch (NoSuchMethodException e5) {
                e5.printStackTrace();
            }
        }

        static boolean a() {
            return f1261d;
        }

        static void b(j0 j0Var, int i10, View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                f1258a.invoke(j0Var, Integer.valueOf(i10), view, Boolean.FALSE, -1, -1);
                f1259b.invoke(j0Var, Integer.valueOf(i10));
                f1260c.invoke(j0Var, Integer.valueOf(i10));
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e10) {
                e10.printStackTrace();
            }
        }
    }

    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    private static class d extends h.c {

        /* renamed from: n, reason: collision with root package name */
        private boolean f1262n;

        d(Drawable drawable) {
            super(drawable);
            this.f1262n = true;
        }

        void b(boolean z10) {
            this.f1262n = z10;
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1262n) {
                super.draw(canvas);
            }
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public void setHotspot(float f5, float f10) {
            if (this.f1262n) {
                super.setHotspot(f5, f10);
            }
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f1262n) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1262n) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // h.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f1262n) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        private static final Field f1263a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                e5.printStackTrace();
            }
            f1263a = declaredField;
        }

        static boolean a(AbsListView absListView) {
            Field field = f1263a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z10) throws IllegalAccessException, IllegalArgumentException {
            Field field = f1263a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z10));
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    private class f implements Runnable {
        f() {
        }

        public void a() {
            j0 j0Var = j0.this;
            j0Var.f1257y = null;
            j0Var.removeCallbacks(this);
        }

        public void b() {
            j0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            j0 j0Var = j0.this;
            j0Var.f1257y = null;
            j0Var.drawableStateChanged();
        }
    }

    j0(Context context, boolean z10) {
        super(context, null, f.a.f23311x);
        this.f1245m = new Rect();
        this.f1246n = 0;
        this.f1247o = 0;
        this.f1248p = 0;
        this.f1249q = 0;
        this.f1253u = z10;
        setCacheColorHint(0);
    }

    private void a() {
        this.f1254v = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1250r - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        androidx.core.view.c0 c0Var = this.f1255w;
        if (c0Var != null) {
            c0Var.c();
            this.f1255w = null;
        }
    }

    private void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f1245m.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1245m);
        selector.draw(canvas);
    }

    private void f(int i10, View view) throws IllegalAccessException, IllegalArgumentException {
        Rect rect = this.f1245m;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1246n;
        rect.top -= this.f1247o;
        rect.right += this.f1248p;
        rect.bottom += this.f1249q;
        boolean zK = k();
        if (view.isEnabled() != zK) {
            l(!zK);
            if (i10 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void g(int i10, View view) throws IllegalAccessException, IllegalArgumentException {
        Drawable selector = getSelector();
        boolean z10 = (selector == null || i10 == -1) ? false : true;
        if (z10) {
            selector.setVisible(false, false);
        }
        f(i10, view);
        if (z10) {
            Rect rect = this.f1245m;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.a.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void h(int i10, View view, float f5, float f10) throws IllegalAccessException, IllegalArgumentException {
        g(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        androidx.core.graphics.drawable.a.k(selector, f5, f10);
    }

    private void i(View view, int i10, float f5, float f10) throws IllegalAccessException, IllegalArgumentException {
        View childAt;
        this.f1254v = true;
        a.a(this, f5, f10);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f1250r;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1250r = i10;
        a.a(view, f5 - view.getLeft(), f10 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i10, view, f5, f10);
        j(false);
        refreshDrawableState();
    }

    private void j(boolean z10) {
        d dVar = this.f1251s;
        if (dVar != null) {
            dVar.b(z10);
        }
    }

    private boolean k() {
        return androidx.core.os.a.c() ? c.a(this) : e.a(this);
    }

    private void l(boolean z10) throws IllegalAccessException, IllegalArgumentException {
        if (androidx.core.os.a.c()) {
            c.b(this, z10);
        } else {
            e.b(this, z10);
        }
    }

    private boolean m() {
        return this.f1254v;
    }

    private void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        View view = null;
        while (i15 < count) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            view.measure(i10, i18 > 0 ? View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i15 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i13) {
                return (i14 < 0 || i15 <= i14 || i17 <= 0 || measuredHeight == i13) ? i13 : i17;
            }
            if (i14 >= 0 && i15 >= i14) {
                i17 = measuredHeight;
            }
            i15++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1257y != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        n();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(android.view.MotionEvent r8, int r9) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = r1
            r3 = r2
            goto L46
        L11:
            r9 = r1
            r3 = r9
            goto L46
        L14:
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r2
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.f r9 = r7.f1256x
            if (r9 != 0) goto L5a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f1256x = r9
        L5a:
            androidx.core.widget.f r9 = r7.f1256x
            r9.w(r2)
            androidx.core.widget.f r9 = r7.f1256x
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.f r8 = r7.f1256x
            if (r8 == 0) goto L6c
            r8.w(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1253u || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1253u || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1253u || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1253u && this.f1252t) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1257y = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1257y == null) {
            f fVar = new f();
            this.f1257y = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !b.a()) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.b(this, iPointToPosition, childAt);
                    }
                }
                n();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1250r = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f1257y;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z10) {
        this.f1252t = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f1251s = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1246n = rect.left;
        this.f1247o = rect.top;
        this.f1248p = rect.right;
        this.f1249q = rect.bottom;
    }
}
