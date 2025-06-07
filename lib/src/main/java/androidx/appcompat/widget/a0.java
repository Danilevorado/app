package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.b;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class a0 extends Spinner {

    /* renamed from: u, reason: collision with root package name */
    private static final int[] f1075u = {R.attr.spinnerMode};

    /* renamed from: m, reason: collision with root package name */
    private final androidx.appcompat.widget.e f1076m;

    /* renamed from: n, reason: collision with root package name */
    private final Context f1077n;

    /* renamed from: o, reason: collision with root package name */
    private l0 f1078o;

    /* renamed from: p, reason: collision with root package name */
    private SpinnerAdapter f1079p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f1080q;

    /* renamed from: r, reason: collision with root package name */
    private j f1081r;

    /* renamed from: s, reason: collision with root package name */
    int f1082s;

    /* renamed from: t, reason: collision with root package name */
    final Rect f1083t;

    class a extends l0 {

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ h f1084v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, h hVar) {
            super(view);
            this.f1084v = hVar;
        }

        @Override // androidx.appcompat.widget.l0
        public androidx.appcompat.view.menu.p b() {
            return this.f1084v;
        }

        @Override // androidx.appcompat.widget.l0
        public boolean c() {
            if (a0.this.getInternalPopup().b()) {
                return true;
            }
            a0.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!a0.this.getInternalPopup().b()) {
                a0.this.b();
            }
            ViewTreeObserver viewTreeObserver = a0.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.a(viewTreeObserver, this);
            }
        }
    }

    private static final class c {
        static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    private static final class d {
        static int a(View view) {
            return view.getTextAlignment();
        }

        static int b(View view) {
            return view.getTextDirection();
        }

        static void c(View view, int i10) {
            view.setTextAlignment(i10);
        }

        static void d(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    private static final class e {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (androidx.core.util.c.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    class f implements j, DialogInterface.OnClickListener {

        /* renamed from: m, reason: collision with root package name */
        androidx.appcompat.app.b f1087m;

        /* renamed from: n, reason: collision with root package name */
        private ListAdapter f1088n;

        /* renamed from: o, reason: collision with root package name */
        private CharSequence f1089o;

        f() {
        }

        @Override // androidx.appcompat.widget.a0.j
        public int a() {
            return 0;
        }

        @Override // androidx.appcompat.widget.a0.j
        public boolean b() {
            androidx.appcompat.app.b bVar = this.f1087m;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.a0.j
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f1087m;
            if (bVar != null) {
                bVar.dismiss();
                this.f1087m = null;
            }
        }

        @Override // androidx.appcompat.widget.a0.j
        public Drawable e() {
            return null;
        }

        @Override // androidx.appcompat.widget.a0.j
        public void g(CharSequence charSequence) {
            this.f1089o = charSequence;
        }

        @Override // androidx.appcompat.widget.a0.j
        public void h(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.a0.j
        public void i(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.a0.j
        public void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.a0.j
        public void k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.a0.j
        public void l(int i10, int i11) {
            if (this.f1088n == null) {
                return;
            }
            b.a aVar = new b.a(a0.this.getPopupContext());
            CharSequence charSequence = this.f1089o;
            if (charSequence != null) {
                aVar.s(charSequence);
            }
            androidx.appcompat.app.b bVarA = aVar.q(this.f1088n, a0.this.getSelectedItemPosition(), this).a();
            this.f1087m = bVarA;
            ListView listViewM = bVarA.m();
            d.d(listViewM, i10);
            d.c(listViewM, i11);
            this.f1087m.show();
        }

        @Override // androidx.appcompat.widget.a0.j
        public int m() {
            return 0;
        }

        @Override // androidx.appcompat.widget.a0.j
        public CharSequence n() {
            return this.f1089o;
        }

        @Override // androidx.appcompat.widget.a0.j
        public void o(ListAdapter listAdapter) {
            this.f1088n = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            a0.this.setSelection(i10);
            if (a0.this.getOnItemClickListener() != null) {
                a0.this.performItemClick(null, i10, this.f1088n.getItemId(i10));
            }
            dismiss();
        }
    }

    private static class g implements ListAdapter, SpinnerAdapter {

        /* renamed from: m, reason: collision with root package name */
        private SpinnerAdapter f1091m;

        /* renamed from: n, reason: collision with root package name */
        private ListAdapter f1092n;

        public g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1091m = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1092n = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            e.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1092n;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1091m;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1091m;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1091m;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f1091m;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1091m;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f1092n;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1091m;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1091m;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class h extends n0 implements j {
        private CharSequence V;
        ListAdapter W;
        private final Rect X;
        private int Y;

        class a implements AdapterView.OnItemClickListener {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ a0 f1093m;

            a(a0 a0Var) {
                this.f1093m = a0Var;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                a0.this.setSelection(i10);
                if (a0.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    a0.this.performItemClick(view, i10, hVar.W.getItemId(i10));
                }
                h.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                h hVar = h.this;
                if (!hVar.T(a0.this)) {
                    h.this.dismiss();
                } else {
                    h.this.R();
                    h.super.show();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1096m;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1096m = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = a0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1096m);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.X = new Rect();
            C(a0.this);
            I(true);
            N(0);
            K(new a(a0.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void R() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.e()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.a0 r1 = androidx.appcompat.widget.a0.this
                android.graphics.Rect r1 = r1.f1083t
                r0.getPadding(r1)
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.a0.this
                boolean r0 = androidx.appcompat.widget.j1.b(r0)
                if (r0 == 0) goto L1d
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.a0.this
                android.graphics.Rect r0 = r0.f1083t
                int r0 = r0.right
                goto L24
            L1d:
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.a0.this
                android.graphics.Rect r0 = r0.f1083t
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.a0.this
                android.graphics.Rect r0 = r0.f1083t
                r0.right = r1
                r0.left = r1
            L2e:
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.a0.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.a0 r2 = androidx.appcompat.widget.a0.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.a0 r3 = androidx.appcompat.widget.a0.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.a0 r4 = androidx.appcompat.widget.a0.this
                int r5 = r4.f1082s
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.W
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.e()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.a0 r5 = androidx.appcompat.widget.a0.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.a0 r6 = androidx.appcompat.widget.a0.this
                android.graphics.Rect r6 = r6.f1083t
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.E(r4)
                goto L85
            L82:
                r8.E(r5)
            L85:
                androidx.appcompat.widget.a0 r4 = androidx.appcompat.widget.a0.this
                boolean r4 = androidx.appcompat.widget.j1.b(r4)
                if (r4 == 0) goto L9a
                int r3 = r3 - r2
                int r0 = r8.y()
                int r3 = r3 - r0
                int r0 = r8.S()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto La0
            L9a:
                int r2 = r8.S()
                int r0 = r0 + r2
                int r1 = r1 + r0
            La0:
                r8.k(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a0.h.R():void");
        }

        public int S() {
            return this.Y;
        }

        boolean T(View view) {
            return androidx.core.view.w.R(view) && view.getGlobalVisibleRect(this.X);
        }

        @Override // androidx.appcompat.widget.a0.j
        public void g(CharSequence charSequence) {
            this.V = charSequence;
        }

        @Override // androidx.appcompat.widget.a0.j
        public void j(int i10) {
            this.Y = i10;
        }

        @Override // androidx.appcompat.widget.a0.j
        public void l(int i10, int i11) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ViewTreeObserver viewTreeObserver;
            boolean zB = b();
            R();
            H(2);
            super.show();
            ListView listViewF = f();
            listViewF.setChoiceMode(1);
            d.d(listViewF, i10);
            d.c(listViewF, i11);
            O(a0.this.getSelectedItemPosition());
            if (zB || (viewTreeObserver = a0.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            J(new c(bVar));
        }

        @Override // androidx.appcompat.widget.a0.j
        public CharSequence n() {
            return this.V;
        }

        @Override // androidx.appcompat.widget.n0, androidx.appcompat.widget.a0.j
        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.W = listAdapter;
        }
    }

    static class i extends View.BaseSavedState {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: m, reason: collision with root package name */
        boolean f1098m;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        i(Parcel parcel) {
            super(parcel);
            this.f1098m = parcel.readByte() != 0;
        }

        i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f1098m ? (byte) 1 : (byte) 0);
        }
    }

    interface j {
        int a();

        boolean b();

        void dismiss();

        Drawable e();

        void g(CharSequence charSequence);

        void h(Drawable drawable);

        void i(int i10);

        void j(int i10);

        void k(int i10);

        void l(int i10, int i11);

        int m();

        CharSequence n();

        void o(ListAdapter listAdapter);
    }

    public a0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.H);
    }

    public a0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public a0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, android.widget.Spinner, androidx.appcompat.widget.a0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a0(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1083t = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.v0.a(r6, r0)
            int[] r0 = f.j.f23542x2
            r1 = 0
            androidx.appcompat.widget.z0 r0 = androidx.appcompat.widget.z0.v(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r6)
            r6.f1076m = r2
            if (r11 == 0) goto L29
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>(r7, r11)
        L26:
            r6.f1077n = r2
            goto L39
        L29:
            int r11 = f.j.C2
            int r11 = r0.n(r11, r1)
            if (r11 == 0) goto L37
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>(r7, r11)
            goto L26
        L37:
            r6.f1077n = r7
        L39:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L69
            int[] r11 = androidx.appcompat.widget.a0.f1075u     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            boolean r3 = r11.hasValue(r1)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L61
            if (r3 == 0) goto L4d
            int r10 = r11.getInt(r1, r1)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L61
        L4d:
            r11.recycle()
            goto L69
        L51:
            r3 = move-exception
            goto L57
        L53:
            r7 = move-exception
            goto L63
        L55:
            r3 = move-exception
            r11 = r2
        L57:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L69
            goto L4d
        L61:
            r7 = move-exception
            r2 = r11
        L63:
            if (r2 == 0) goto L68
            r2.recycle()
        L68:
            throw r7
        L69:
            r11 = 1
            if (r10 == 0) goto La6
            if (r10 == r11) goto L6f
            goto Lb6
        L6f:
            androidx.appcompat.widget.a0$h r10 = new androidx.appcompat.widget.a0$h
            android.content.Context r3 = r6.f1077n
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1077n
            int[] r4 = f.j.f23542x2
            androidx.appcompat.widget.z0 r1 = androidx.appcompat.widget.z0.v(r3, r8, r4, r9, r1)
            int r3 = f.j.B2
            r4 = -2
            int r3 = r1.m(r3, r4)
            r6.f1082s = r3
            int r3 = f.j.f23552z2
            android.graphics.drawable.Drawable r3 = r1.g(r3)
            r10.h(r3)
            int r3 = f.j.A2
            java.lang.String r3 = r0.o(r3)
            r10.g(r3)
            r1.w()
            r6.f1081r = r10
            androidx.appcompat.widget.a0$a r1 = new androidx.appcompat.widget.a0$a
            r1.<init>(r6, r10)
            r6.f1078o = r1
            goto Lb6
        La6:
            androidx.appcompat.widget.a0$f r10 = new androidx.appcompat.widget.a0$f
            r10.<init>()
            r6.f1081r = r10
            int r1 = f.j.A2
            java.lang.String r1 = r0.o(r1)
            r10.g(r1)
        Lb6:
            int r10 = f.j.f23547y2
            java.lang.CharSequence[] r10 = r0.q(r10)
            if (r10 == 0) goto Lce
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = f.g.f23407t
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        Lce:
            r0.w()
            r6.f1080q = r11
            android.widget.SpinnerAdapter r7 = r6.f1079p
            if (r7 == 0) goto Ldc
            r6.setAdapter(r7)
            r6.f1079p = r2
        Ldc:
            androidx.appcompat.widget.e r7 = r6.f1076m
            r7.e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a0.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f1083t);
        Rect rect = this.f1083t;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        this.f1081r.l(d.b(this), d.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f1076m;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        j jVar = this.f1081r;
        return jVar != null ? jVar.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        j jVar = this.f1081r;
        return jVar != null ? jVar.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1081r != null ? this.f1082s : super.getDropDownWidth();
    }

    final j getInternalPopup() {
        return this.f1081r;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        j jVar = this.f1081r;
        return jVar != null ? jVar.e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1077n;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        j jVar = this.f1081r;
        return jVar != null ? jVar.n() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f1076m;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f1076m;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f1081r;
        if (jVar == null || !jVar.b()) {
            return;
        }
        this.f1081r.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1081r == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (!iVar.f1098m || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        j jVar = this.f1081r;
        iVar.f1098m = jVar != null && jVar.b();
        return iVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        l0 l0Var = this.f1078o;
        if (l0Var == null || !l0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        j jVar = this.f1081r;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.b()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1080q) {
            this.f1079p = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1081r != null) {
            Context context = this.f1077n;
            if (context == null) {
                context = getContext();
            }
            this.f1081r.o(new g(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f1076m;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.e eVar = this.f1076m;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        j jVar = this.f1081r;
        if (jVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            jVar.j(i10);
            this.f1081r.k(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        j jVar = this.f1081r;
        if (jVar != null) {
            jVar.i(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f1081r != null) {
            this.f1082s = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        j jVar = this.f1081r;
        if (jVar != null) {
            jVar.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(g.a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        j jVar = this.f1081r;
        if (jVar != null) {
            jVar.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f1076m;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f1076m;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}
