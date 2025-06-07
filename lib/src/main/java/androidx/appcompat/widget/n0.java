package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.facebook.ads.AdError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class n0 implements androidx.appcompat.view.menu.p {
    private static Method S;
    private static Method T;
    private static Method U;
    int A;
    private View B;
    private int C;
    private DataSetObserver D;
    private View E;
    private Drawable F;
    private AdapterView.OnItemClickListener G;
    private AdapterView.OnItemSelectedListener H;
    final i I;
    private final h J;
    private final g K;
    private final e L;
    private Runnable M;
    final Handler N;
    private final Rect O;
    private Rect P;
    private boolean Q;
    PopupWindow R;

    /* renamed from: m, reason: collision with root package name */
    private Context f1312m;

    /* renamed from: n, reason: collision with root package name */
    private ListAdapter f1313n;

    /* renamed from: o, reason: collision with root package name */
    j0 f1314o;

    /* renamed from: p, reason: collision with root package name */
    private int f1315p;

    /* renamed from: q, reason: collision with root package name */
    private int f1316q;

    /* renamed from: r, reason: collision with root package name */
    private int f1317r;

    /* renamed from: s, reason: collision with root package name */
    private int f1318s;

    /* renamed from: t, reason: collision with root package name */
    private int f1319t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f1320u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f1321v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f1322w;

    /* renamed from: x, reason: collision with root package name */
    private int f1323x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f1324y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f1325z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            View viewS = n0.this.s();
            if (viewS == null || viewS.getWindowToken() == null) {
                return;
            }
            n0.this.show();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            j0 j0Var;
            if (i10 == -1 || (j0Var = n0.this.f1314o) == null) {
                return;
            }
            j0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n0.this.q();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (n0.this.b()) {
                n0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            n0.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (i10 != 1 || n0.this.z() || n0.this.R.getContentView() == null) {
                return;
            }
            n0 n0Var = n0.this;
            n0Var.N.removeCallbacks(n0Var.I);
            n0.this.I.run();
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = n0.this.R) != null && popupWindow.isShowing() && x10 >= 0 && x10 < n0.this.R.getWidth() && y10 >= 0 && y10 < n0.this.R.getHeight()) {
                n0 n0Var = n0.this;
                n0Var.N.postDelayed(n0Var.I, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            n0 n0Var2 = n0.this;
            n0Var2.N.removeCallbacks(n0Var2.I);
            return false;
        }
    }

    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            j0 j0Var = n0.this.f1314o;
            if (j0Var == null || !androidx.core.view.w.R(j0Var) || n0.this.f1314o.getCount() <= n0.this.f1314o.getChildCount()) {
                return;
            }
            int childCount = n0.this.f1314o.getChildCount();
            n0 n0Var = n0.this;
            if (childCount <= n0Var.A) {
                n0Var.R.setInputMethodMode(2);
                n0.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                S = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                U = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                T = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public n0(Context context) {
        this(context, null, f.a.B);
    }

    public n0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public n0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1315p = -2;
        this.f1316q = -2;
        this.f1319t = AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE;
        this.f1323x = 0;
        this.f1324y = false;
        this.f1325z = false;
        this.A = Integer.MAX_VALUE;
        this.C = 0;
        this.I = new i();
        this.J = new h();
        this.K = new g();
        this.L = new e();
        this.O = new Rect();
        this.f1312m = context;
        this.N = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f23481l1, i10, i11);
        this.f1317r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(f.j.f23486m1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(f.j.f23491n1, 0);
        this.f1318s = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1320u = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        t tVar = new t(context, attributeSet, i10, i11);
        this.R = tVar;
        tVar.setInputMethodMode(1);
    }

    private void B() {
        View view = this.B;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.B);
            }
        }
    }

    private void M(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.R, z10);
            return;
        }
        Method method = S;
        if (method != null) {
            try {
                method.invoke(this.R, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x012a A[PHI: r1
  0x012a: PHI (r1v1 int) = (r1v0 int), (r1v6 int) binds: [B:45:0x011f, B:47:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int p() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.n0.p():int");
    }

    private int t(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT > 23) {
            return c.a(this.R, view, i10, z10);
        }
        Method method = T;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.R, view, Integer.valueOf(i10), Boolean.valueOf(z10))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.R.getMaxAvailableHeight(view, i10);
    }

    public boolean A() {
        return this.Q;
    }

    public void C(View view) {
        this.E = view;
    }

    public void D(int i10) {
        this.R.setAnimationStyle(i10);
    }

    public void E(int i10) {
        Drawable background = this.R.getBackground();
        if (background == null) {
            P(i10);
            return;
        }
        background.getPadding(this.O);
        Rect rect = this.O;
        this.f1316q = rect.left + rect.right + i10;
    }

    public void F(int i10) {
        this.f1323x = i10;
    }

    public void G(Rect rect) {
        this.P = rect != null ? new Rect(rect) : null;
    }

    public void H(int i10) {
        this.R.setInputMethodMode(i10);
    }

    public void I(boolean z10) {
        this.Q = z10;
        this.R.setFocusable(z10);
    }

    public void J(PopupWindow.OnDismissListener onDismissListener) {
        this.R.setOnDismissListener(onDismissListener);
    }

    public void K(AdapterView.OnItemClickListener onItemClickListener) {
        this.G = onItemClickListener;
    }

    public void L(boolean z10) {
        this.f1322w = true;
        this.f1321v = z10;
    }

    public void N(int i10) {
        this.C = i10;
    }

    public void O(int i10) {
        j0 j0Var = this.f1314o;
        if (!b() || j0Var == null) {
            return;
        }
        j0Var.setListSelectionHidden(false);
        j0Var.setSelection(i10);
        if (j0Var.getChoiceMode() != 0) {
            j0Var.setItemChecked(i10, true);
        }
    }

    public void P(int i10) {
        this.f1316q = i10;
    }

    public int a() {
        return this.f1317r;
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.R.isShowing();
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.R.dismiss();
        B();
        this.R.setContentView(null);
        this.f1314o = null;
        this.N.removeCallbacks(this.I);
    }

    public Drawable e() {
        return this.R.getBackground();
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView f() {
        return this.f1314o;
    }

    public void h(Drawable drawable) {
        this.R.setBackgroundDrawable(drawable);
    }

    public void i(int i10) {
        this.f1318s = i10;
        this.f1320u = true;
    }

    public void k(int i10) {
        this.f1317r = i10;
    }

    public int m() {
        if (this.f1320u) {
            return this.f1318s;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.D;
        if (dataSetObserver == null) {
            this.D = new f();
        } else {
            ListAdapter listAdapter2 = this.f1313n;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1313n = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.D);
        }
        j0 j0Var = this.f1314o;
        if (j0Var != null) {
            j0Var.setAdapter(this.f1313n);
        }
    }

    public void q() {
        j0 j0Var = this.f1314o;
        if (j0Var != null) {
            j0Var.setListSelectionHidden(true);
            j0Var.requestLayout();
        }
    }

    j0 r(Context context, boolean z10) {
        return new j0(context, z10);
    }

    public View s() {
        return this.E;
    }

    @Override // androidx.appcompat.view.menu.p
    public void show() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iP = p();
        boolean z10 = z();
        androidx.core.widget.h.b(this.R, this.f1319t);
        if (this.R.isShowing()) {
            if (androidx.core.view.w.R(s())) {
                int width = this.f1316q;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = s().getWidth();
                }
                int i10 = this.f1315p;
                if (i10 == -1) {
                    if (!z10) {
                        iP = -1;
                    }
                    if (z10) {
                        this.R.setWidth(this.f1316q == -1 ? -1 : 0);
                        this.R.setHeight(0);
                    } else {
                        this.R.setWidth(this.f1316q == -1 ? -1 : 0);
                        this.R.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    iP = i10;
                }
                this.R.setOutsideTouchable((this.f1325z || this.f1324y) ? false : true);
                this.R.update(s(), this.f1317r, this.f1318s, width < 0 ? -1 : width, iP < 0 ? -1 : iP);
                return;
            }
            return;
        }
        int width2 = this.f1316q;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = s().getWidth();
        }
        int i11 = this.f1315p;
        if (i11 == -1) {
            iP = -1;
        } else if (i11 != -2) {
            iP = i11;
        }
        this.R.setWidth(width2);
        this.R.setHeight(iP);
        M(true);
        this.R.setOutsideTouchable((this.f1325z || this.f1324y) ? false : true);
        this.R.setTouchInterceptor(this.J);
        if (this.f1322w) {
            androidx.core.widget.h.a(this.R, this.f1321v);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = U;
            if (method != null) {
                try {
                    method.invoke(this.R, this.P);
                } catch (Exception e5) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e5);
                }
            }
        } else {
            d.a(this.R, this.P);
        }
        androidx.core.widget.h.c(this.R, s(), this.f1317r, this.f1318s, this.f1323x);
        this.f1314o.setSelection(-1);
        if (!this.Q || this.f1314o.isInTouchMode()) {
            q();
        }
        if (this.Q) {
            return;
        }
        this.N.post(this.L);
    }

    public Object u() {
        if (b()) {
            return this.f1314o.getSelectedItem();
        }
        return null;
    }

    public long v() {
        if (b()) {
            return this.f1314o.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int w() {
        if (b()) {
            return this.f1314o.getSelectedItemPosition();
        }
        return -1;
    }

    public View x() {
        if (b()) {
            return this.f1314o.getSelectedView();
        }
        return null;
    }

    public int y() {
        return this.f1316q;
    }

    public boolean z() {
        return this.R.getInputMethodMode() == 2;
    }
}
