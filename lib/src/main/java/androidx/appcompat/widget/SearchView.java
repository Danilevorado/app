package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends m0 implements androidx.appcompat.view.c {
    static final o C0;
    private final AdapterView.OnItemSelectedListener A0;
    final SearchAutoComplete B;
    private TextWatcher B0;
    private final View C;
    private final View D;
    private final View E;
    final ImageView F;
    final ImageView G;
    final ImageView H;
    final ImageView I;
    private final View J;
    private q K;
    private Rect L;
    private Rect M;
    private int[] N;
    private int[] O;
    private final ImageView P;
    private final Drawable Q;
    private final int R;
    private final int S;
    private final Intent T;
    private final Intent U;
    private final CharSequence V;
    private m W;

    /* renamed from: a0, reason: collision with root package name */
    private l f975a0;

    /* renamed from: b0, reason: collision with root package name */
    View.OnFocusChangeListener f976b0;

    /* renamed from: c0, reason: collision with root package name */
    private n f977c0;

    /* renamed from: d0, reason: collision with root package name */
    private View.OnClickListener f978d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f979e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f980f0;

    /* renamed from: g0, reason: collision with root package name */
    d0.a f981g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f982h0;

    /* renamed from: i0, reason: collision with root package name */
    private CharSequence f983i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f984j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f985k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f986l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f987m0;

    /* renamed from: n0, reason: collision with root package name */
    private CharSequence f988n0;

    /* renamed from: o0, reason: collision with root package name */
    private CharSequence f989o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f990p0;

    /* renamed from: q0, reason: collision with root package name */
    private int f991q0;

    /* renamed from: r0, reason: collision with root package name */
    SearchableInfo f992r0;

    /* renamed from: s0, reason: collision with root package name */
    private Bundle f993s0;

    /* renamed from: t0, reason: collision with root package name */
    private final Runnable f994t0;

    /* renamed from: u0, reason: collision with root package name */
    private Runnable f995u0;

    /* renamed from: v0, reason: collision with root package name */
    private final WeakHashMap f996v0;

    /* renamed from: w0, reason: collision with root package name */
    private final View.OnClickListener f997w0;

    /* renamed from: x0, reason: collision with root package name */
    View.OnKeyListener f998x0;

    /* renamed from: y0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f999y0;

    /* renamed from: z0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f1000z0;

    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* renamed from: q, reason: collision with root package name */
        private int f1001q;

        /* renamed from: r, reason: collision with root package name */
        private SearchView f1002r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f1003s;

        /* renamed from: t, reason: collision with root package name */
        final Runnable f1004t;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, f.a.f23300m);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f1004t = new a();
            this.f1001q = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.C0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f1003s) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1003s = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1001q <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1003s) {
                removeCallbacks(this.f1004t);
                post(this.f1004t);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z10, i10, rect);
            this.f1002r.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1002r.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1002r.hasFocus() && getVisibility() == 0) {
                this.f1003s = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f1003s = false;
                removeCallbacks(this.f1004t);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1003s = true;
                    return;
                }
                this.f1003s = false;
                removeCallbacks(this.f1004t);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f1002r = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1001q = i10;
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.Y(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.a aVar = SearchView.this.f981g0;
            if (aVar instanceof u0) {
                aVar.a(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f976b0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.B();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SearchView searchView = SearchView.this;
            if (view == searchView.F) {
                searchView.V();
                return;
            }
            if (view == searchView.H) {
                searchView.R();
                return;
            }
            if (view == searchView.G) {
                searchView.W();
            } else if (view == searchView.I) {
                searchView.a0();
            } else if (view == searchView.B) {
                searchView.H();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f992r0 == null) {
                return false;
            }
            if (searchView.B.isPopupShowing() && SearchView.this.B.getListSelection() != -1) {
                return SearchView.this.X(view, i10, keyEvent);
            }
            if (SearchView.this.B.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, null, searchView2.B.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.S(i10, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.T(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
        boolean a(int i10);

        boolean b(int i10);
    }

    private static class o {

        /* renamed from: a, reason: collision with root package name */
        private Method f1016a;

        /* renamed from: b, reason: collision with root package name */
        private Method f1017b;

        /* renamed from: c, reason: collision with root package name */
        private Method f1018c;

        o() throws NoSuchMethodException, SecurityException {
            this.f1016a = null;
            this.f1017b = null;
            this.f1018c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1016a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1017b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1018c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f1017b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f1016a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f1018c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class p extends e0.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: o, reason: collision with root package name */
        boolean f1019o;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i10) {
                return new p[i10];
            }
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1019o = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1019o + "}";
        }

        @Override // e0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1019o));
        }
    }

    private static class q extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f1020a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f1021b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f1022c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f1023d;

        /* renamed from: e, reason: collision with root package name */
        private final int f1024e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f1025f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1024e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1021b = new Rect();
            this.f1023d = new Rect();
            this.f1022c = new Rect();
            a(rect, rect2);
            this.f1020a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1021b.set(rect);
            this.f1023d.set(rect);
            Rect rect3 = this.f1023d;
            int i10 = this.f1024e;
            rect3.inset(-i10, -i10);
            this.f1022c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            float width;
            int height;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f1025f;
                    if (z11 && !this.f1023d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f1025f;
                        this.f1025f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.f1021b.contains(x10, y10)) {
                this.f1025f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f1022c.contains(x10, y10)) {
                Rect rect = this.f1022c;
                width = x10 - rect.left;
                height = y10 - rect.top;
            } else {
                width = this.f1020a.getWidth() / 2;
                height = this.f1020a.getHeight() / 2;
            }
            motionEvent.setLocation(width, height);
            return this.f1020a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        C0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.F);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.L = new Rect();
        this.M = new Rect();
        this.N = new int[2];
        this.O = new int[2];
        this.f994t0 = new b();
        this.f995u0 = new c();
        this.f996v0 = new WeakHashMap();
        f fVar = new f();
        this.f997w0 = fVar;
        this.f998x0 = new g();
        h hVar = new h();
        this.f999y0 = hVar;
        i iVar = new i();
        this.f1000z0 = iVar;
        j jVar = new j();
        this.A0 = jVar;
        this.B0 = new a();
        int[] iArr = f.j.f23452f2;
        z0 z0VarV = z0.v(context, attributeSet, iArr, i10, 0);
        androidx.core.view.w.m0(this, context, iArr, attributeSet, z0VarV.r(), i10, 0);
        LayoutInflater.from(context).inflate(z0VarV.n(f.j.f23502p2, f.g.f23405r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(f.f.D);
        this.B = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.C = findViewById(f.f.f23387z);
        View viewFindViewById = findViewById(f.f.C);
        this.D = viewFindViewById;
        View viewFindViewById2 = findViewById(f.f.J);
        this.E = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(f.f.f23385x);
        this.F = imageView;
        ImageView imageView2 = (ImageView) findViewById(f.f.A);
        this.G = imageView2;
        ImageView imageView3 = (ImageView) findViewById(f.f.f23386y);
        this.H = imageView3;
        ImageView imageView4 = (ImageView) findViewById(f.f.E);
        this.I = imageView4;
        ImageView imageView5 = (ImageView) findViewById(f.f.B);
        this.P = imageView5;
        androidx.core.view.w.s0(viewFindViewById, z0VarV.g(f.j.f23507q2));
        androidx.core.view.w.s0(viewFindViewById2, z0VarV.g(f.j.f23527u2));
        int i11 = f.j.f23522t2;
        imageView.setImageDrawable(z0VarV.g(i11));
        imageView2.setImageDrawable(z0VarV.g(f.j.f23492n2));
        imageView3.setImageDrawable(z0VarV.g(f.j.f23477k2));
        imageView4.setImageDrawable(z0VarV.g(f.j.f23537w2));
        imageView5.setImageDrawable(z0VarV.g(i11));
        this.Q = z0VarV.g(f.j.f23517s2);
        d1.a(imageView, getResources().getString(f.h.f23419l));
        this.R = z0VarV.n(f.j.f23532v2, f.g.f23404q);
        this.S = z0VarV.n(f.j.f23482l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.B0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f998x0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(z0VarV.a(f.j.f23497o2, true));
        int iF = z0VarV.f(f.j.f23462h2, -1);
        if (iF != -1) {
            setMaxWidth(iF);
        }
        this.V = z0VarV.p(f.j.f23487m2);
        this.f983i0 = z0VarV.p(f.j.f23512r2);
        int iK = z0VarV.k(f.j.f23472j2, -1);
        if (iK != -1) {
            setImeOptions(iK);
        }
        int iK2 = z0VarV.k(f.j.f23467i2, -1);
        if (iK2 != -1) {
            setInputType(iK2);
        }
        setFocusable(z0VarV.a(f.j.f23457g2, true));
        z0VarV.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.T = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.U = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.J = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.f979e0);
        g0();
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f989o0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f993s0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f992r0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i10, String str) {
        int position;
        String strY;
        try {
            String strY2 = u0.y(cursor, "suggest_intent_action");
            if (strY2 == null) {
                strY2 = this.f992r0.getSuggestIntentAction();
            }
            if (strY2 == null) {
                strY2 = "android.intent.action.SEARCH";
            }
            String str2 = strY2;
            String strY3 = u0.y(cursor, "suggest_intent_data");
            if (strY3 == null) {
                strY3 = this.f992r0.getSuggestIntentData();
            }
            if (strY3 != null && (strY = u0.y(cursor, "suggest_intent_data_id")) != null) {
                strY3 = strY3 + "/" + Uri.encode(strY);
            }
            return C(str2, strY3 == null ? null : Uri.parse(strY3), u0.y(cursor, "suggest_intent_extra_data"), u0.y(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e5) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e5);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f993s0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void G() {
        this.B.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.N);
        getLocationInWindow(this.O);
        int[] iArr = this.N;
        int i10 = iArr[1];
        int[] iArr2 = this.O;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.f979e0 || this.Q == null) {
            return charSequence;
        }
        int textSize = (int) (this.B.getTextSize() * 1.25d);
        this.Q.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.Q), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.f992r0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f992r0.getVoiceSearchLaunchWebSearch()) {
            intent = this.T;
        } else if (this.f992r0.getVoiceSearchLaunchRecognizer()) {
            intent = this.U;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.f982h0 || this.f987m0) && !L();
    }

    private void O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e5) {
            Log.e("SearchView", "Failed launch activity: " + intent, e5);
        }
    }

    private boolean Q(int i10, int i11, String str) {
        Cursor cursorB = this.f981g0.b();
        if (cursorB == null || !cursorB.moveToPosition(i10)) {
            return false;
        }
        O(D(cursorB, i11, str));
        return true;
    }

    private void b0() {
        post(this.f994t0);
    }

    private void c0(int i10) {
        CharSequence charSequenceC;
        Editable text = this.B.getText();
        Cursor cursorB = this.f981g0.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i10) || (charSequenceC = this.f981g0.c(cursorB)) == null) {
            setQuery(text);
        } else {
            setQuery(charSequenceC);
        }
    }

    private void e0() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.B.getText());
        if (!z11 && (!this.f979e0 || this.f990p0)) {
            z10 = false;
        }
        this.H.setVisibility(z10 ? 0 : 8);
        Drawable drawable = this.H.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.B;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(f.d.f23327e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(f.d.f23328f);
    }

    private void h0() {
        this.B.setThreshold(this.f992r0.getSuggestThreshold());
        this.B.setImeOptions(this.f992r0.getImeOptions());
        int inputType = this.f992r0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f992r0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.B.setInputType(inputType);
        d0.a aVar = this.f981g0;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f992r0.getSuggestAuthority() != null) {
            u0 u0Var = new u0(getContext(), this, this.f992r0, this.f996v0);
            this.f981g0 = u0Var;
            this.B.setAdapter(u0Var);
            ((u0) this.f981g0).H(this.f984j0 ? 2 : 1);
        }
    }

    private void i0() {
        this.E.setVisibility((N() && (this.G.getVisibility() == 0 || this.I.getVisibility() == 0)) ? 0 : 8);
    }

    private void j0(boolean z10) {
        this.G.setVisibility((this.f982h0 && N() && hasFocus() && (z10 || !this.f987m0)) ? 0 : 8);
    }

    private void k0(boolean z10) {
        this.f980f0 = z10;
        int i10 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.B.getText());
        this.F.setVisibility(i10);
        j0(z11);
        this.C.setVisibility(z10 ? 8 : 0);
        this.P.setVisibility((this.P.getDrawable() == null || this.f979e0) ? 8 : 0);
        e0();
        l0(!z11);
        i0();
    }

    private void l0(boolean z10) {
        int i10 = 8;
        if (this.f987m0 && !L() && z10) {
            this.G.setVisibility(8);
            i10 = 0;
        }
        this.I.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.B.setText(charSequence);
        this.B.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void B() {
        if (this.J.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.D.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = j1.b(this);
            int dimensionPixelSize = this.f979e0 ? resources.getDimensionPixelSize(f.d.f23325c) + resources.getDimensionPixelSize(f.d.f23326d) : 0;
            this.B.getDropDownBackground().getPadding(rect);
            int i10 = rect.left;
            this.B.setDropDownHorizontalOffset(zB ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
            this.B.setDropDownWidth((((this.J.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    void H() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.B);
            return;
        }
        o oVar = C0;
        oVar.b(this.B);
        oVar.a(this.B);
    }

    public boolean L() {
        return this.f980f0;
    }

    void P(int i10, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void R() {
        if (!TextUtils.isEmpty(this.B.getText())) {
            this.B.setText("");
            this.B.requestFocus();
            this.B.setImeVisibility(true);
        } else if (this.f979e0) {
            l lVar = this.f975a0;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                k0(true);
            }
        }
    }

    boolean S(int i10, int i11, String str) {
        n nVar = this.f977c0;
        if (nVar != null && nVar.b(i10)) {
            return false;
        }
        Q(i10, 0, null);
        this.B.setImeVisibility(false);
        G();
        return true;
    }

    boolean T(int i10) {
        n nVar = this.f977c0;
        if (nVar != null && nVar.a(i10)) {
            return false;
        }
        c0(i10);
        return true;
    }

    protected void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void V() {
        k0(false);
        this.B.requestFocus();
        this.B.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f978d0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void W() {
        Editable text = this.B.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.W;
        if (mVar == null || !mVar.b(text.toString())) {
            if (this.f992r0 != null) {
                P(0, null, text.toString());
            }
            this.B.setImeVisibility(false);
            G();
        }
    }

    boolean X(View view, int i10, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f992r0 != null && this.f981g0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return S(this.B.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.B.setSelection(i10 == 21 ? 0 : this.B.length());
                this.B.setListSelection(0);
                this.B.clearListSelection();
                this.B.b();
                return true;
            }
            if (i10 == 19) {
                this.B.getListSelection();
                return false;
            }
        }
        return false;
    }

    void Y(CharSequence charSequence) {
        Editable text = this.B.getText();
        this.f989o0 = text;
        boolean z10 = !TextUtils.isEmpty(text);
        j0(z10);
        l0(!z10);
        e0();
        i0();
        if (this.W != null && !TextUtils.equals(charSequence, this.f988n0)) {
            this.W.a(charSequence.toString());
        }
        this.f988n0 = charSequence.toString();
    }

    void Z() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        k0(L());
        b0();
        if (this.B.hasFocus()) {
            H();
        }
    }

    void a0() {
        Intent intentE;
        SearchableInfo searchableInfo = this.f992r0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                intentE = F(this.T, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                intentE = E(this.U, searchableInfo);
            }
            getContext().startActivity(intentE);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // androidx.appcompat.view.c
    public void c() {
        if (this.f990p0) {
            return;
        }
        this.f990p0 = true;
        int imeOptions = this.B.getImeOptions();
        this.f991q0 = imeOptions;
        this.B.setImeOptions(imeOptions | 33554432);
        this.B.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f985k0 = true;
        super.clearFocus();
        this.B.clearFocus();
        this.B.setImeVisibility(false);
        this.f985k0 = false;
    }

    public void d0(CharSequence charSequence, boolean z10) {
        this.B.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.B;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f989o0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        W();
    }

    @Override // androidx.appcompat.view.c
    public void e() {
        d0("", false);
        clearFocus();
        k0(true);
        this.B.setImeOptions(this.f991q0);
        this.f990p0 = false;
    }

    void f0() {
        int[] iArr = this.B.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.D.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.E.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.B.getImeOptions();
    }

    public int getInputType() {
        return this.B.getInputType();
    }

    public int getMaxWidth() {
        return this.f986l0;
    }

    public CharSequence getQuery() {
        return this.B.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f983i0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f992r0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.V : getContext().getText(this.f992r0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.S;
    }

    int getSuggestionRowLayout() {
        return this.R;
    }

    public d0.a getSuggestionsAdapter() {
        return this.f981g0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f994t0);
        post(this.f995u0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.m0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            I(this.B, this.L);
            Rect rect = this.M;
            Rect rect2 = this.L;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            q qVar = this.K;
            if (qVar != null) {
                qVar.a(this.M, this.L);
                return;
            }
            q qVar2 = new q(this.M, this.L, this.B);
            this.K = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @Override // androidx.appcompat.widget.m0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.L()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.f986l0
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.f986l0
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.f986l0
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        k0(pVar.f1019o);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f1019o = L();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f985k0 || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.B.requestFocus(i10, rect);
        if (zRequestFocus) {
            k0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f993s0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f979e0 == z10) {
            return;
        }
        this.f979e0 = z10;
        k0(z10);
        g0();
    }

    public void setImeOptions(int i10) {
        this.B.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.B.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f986l0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.f975a0 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f976b0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.W = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f978d0 = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.f977c0 = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f983i0 = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f984j0 = z10;
        d0.a aVar = this.f981g0;
        if (aVar instanceof u0) {
            ((u0) aVar).H(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f992r0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean zK = K();
        this.f987m0 = zK;
        if (zK) {
            this.B.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f982h0 = z10;
        k0(L());
    }

    public void setSuggestionsAdapter(d0.a aVar) {
        this.f981g0 = aVar;
        this.B.setAdapter(aVar);
    }
}
