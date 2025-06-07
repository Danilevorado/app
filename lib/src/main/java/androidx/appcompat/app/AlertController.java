package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.m0;
import androidx.core.view.w;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* renamed from: a, reason: collision with root package name */
    private final Context f408a;

    /* renamed from: b, reason: collision with root package name */
    final j f409b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f410c;

    /* renamed from: d, reason: collision with root package name */
    private final int f411d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f412e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f413f;

    /* renamed from: g, reason: collision with root package name */
    ListView f414g;

    /* renamed from: h, reason: collision with root package name */
    private View f415h;

    /* renamed from: i, reason: collision with root package name */
    private int f416i;

    /* renamed from: j, reason: collision with root package name */
    private int f417j;

    /* renamed from: k, reason: collision with root package name */
    private int f418k;

    /* renamed from: l, reason: collision with root package name */
    private int f419l;

    /* renamed from: m, reason: collision with root package name */
    private int f420m;

    /* renamed from: o, reason: collision with root package name */
    Button f422o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f423p;

    /* renamed from: q, reason: collision with root package name */
    Message f424q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f425r;

    /* renamed from: s, reason: collision with root package name */
    Button f426s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f427t;

    /* renamed from: u, reason: collision with root package name */
    Message f428u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f429v;

    /* renamed from: w, reason: collision with root package name */
    Button f430w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f431x;

    /* renamed from: y, reason: collision with root package name */
    Message f432y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f433z;

    /* renamed from: n, reason: collision with root package name */
    private boolean f421n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: m, reason: collision with root package name */
        private final int f434m;

        /* renamed from: n, reason: collision with root package name */
        private final int f435n;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f23437c2);
            this.f435n = typedArrayObtainStyledAttributes.getDimensionPixelOffset(f.j.f23442d2, -1);
            this.f434m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(f.j.f23447e2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f434m, getPaddingRight(), z11 ? getPaddingBottom() : this.f435n);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message messageObtain = ((view != alertController.f422o || (message2 = alertController.f424q) == null) && (view != alertController.f426s || (message2 = alertController.f428u) == null)) ? (view != alertController.f430w || (message = alertController.f432y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f409b).sendToTarget();
        }
    }

    public static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public e O;

        /* renamed from: a, reason: collision with root package name */
        public final Context f437a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f438b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f440d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f442f;

        /* renamed from: g, reason: collision with root package name */
        public View f443g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f444h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f445i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f446j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f447k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f448l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f449m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f450n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f451o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f452p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f453q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f455s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f456t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f457u;

        /* renamed from: v, reason: collision with root package name */
        public CharSequence[] f458v;

        /* renamed from: w, reason: collision with root package name */
        public ListAdapter f459w;

        /* renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f460x;

        /* renamed from: y, reason: collision with root package name */
        public int f461y;

        /* renamed from: z, reason: collision with root package name */
        public View f462z;

        /* renamed from: c, reason: collision with root package name */
        public int f439c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f441e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean P = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f454r = true;

        class a extends ArrayAdapter {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ RecycleListView f463m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f463m = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f463m.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0006b extends CursorAdapter {

            /* renamed from: m, reason: collision with root package name */
            private final int f465m;

            /* renamed from: n, reason: collision with root package name */
            private final int f466n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ RecycleListView f467o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ AlertController f468p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0006b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f467o = recycleListView;
                this.f468p = alertController;
                Cursor cursor2 = getCursor();
                this.f465m = cursor2.getColumnIndexOrThrow(b.this.L);
                this.f466n = cursor2.getColumnIndexOrThrow(b.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f465m));
                this.f467o.setItemChecked(cursor.getPosition(), cursor.getInt(this.f466n) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f438b.inflate(this.f468p.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ AlertController f470m;

            c(AlertController alertController) {
                this.f470m = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                b.this.f460x.onClick(this.f470m.f409b, i10);
                if (b.this.H) {
                    return;
                }
                this.f470m.f409b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ RecycleListView f472m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ AlertController f473n;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f472m = recycleListView;
                this.f473n = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f472m.isItemChecked(i10);
                }
                b.this.J.onClick(this.f473n.f409b, i10, this.f472m.isItemChecked(i10));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public b(Context context) {
            this.f437a = context;
            this.f438b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f438b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L26
                androidx.appcompat.app.AlertController$b$a r9 = new androidx.appcompat.app.AlertController$b$a
                android.content.Context r3 = r10.f437a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f458v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L26:
                androidx.appcompat.app.AlertController$b$b r9 = new androidx.appcompat.app.AlertController$b$b
                android.content.Context r3 = r10.f437a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.H
                if (r1 == 0) goto L3c
                int r1 = r11.N
                goto L3e
            L3c:
                int r1 = r11.O
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f437a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.f459w
                if (r9 == 0) goto L62
                goto L6b
            L62:
                androidx.appcompat.app.AlertController$d r9 = new androidx.appcompat.app.AlertController$d
                android.content.Context r1 = r10.f437a
                java.lang.CharSequence[] r3 = r10.f458v
                r9.<init>(r1, r4, r2, r3)
            L6b:
                androidx.appcompat.app.AlertController$b$e r1 = r10.O
                if (r1 == 0) goto L72
                r1.a(r0)
            L72:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f460x
                if (r1 == 0) goto L85
                androidx.appcompat.app.AlertController$b$c r1 = new androidx.appcompat.app.AlertController$b$c
                r1.<init>(r11)
            L81:
                r0.setOnItemClickListener(r1)
                goto L8f
            L85:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L8f
                androidx.appcompat.app.AlertController$b$d r1 = new androidx.appcompat.app.AlertController$b$d
                r1.<init>(r0, r11)
                goto L81
            L8f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.N
                if (r1 == 0) goto L96
                r0.setOnItemSelectedListener(r1)
            L96:
                boolean r1 = r10.H
                if (r1 == 0) goto L9e
                r0.setChoiceMode(r8)
                goto La6
            L9e:
                boolean r1 = r10.G
                if (r1 == 0) goto La6
                r1 = 2
                r0.setChoiceMode(r1)
            La6:
                r11.f414g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.b.b(androidx.appcompat.app.AlertController):void");
        }

        public void a(AlertController alertController) {
            View view = this.f443g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f442f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f440d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f439c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f441e;
                if (i11 != 0) {
                    alertController.m(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f444h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f445i;
            if (charSequence3 != null || this.f446j != null) {
                alertController.k(-1, charSequence3, this.f447k, null, this.f446j);
            }
            CharSequence charSequence4 = this.f448l;
            if (charSequence4 != null || this.f449m != null) {
                alertController.k(-2, charSequence4, this.f450n, null, this.f449m);
            }
            CharSequence charSequence5 = this.f451o;
            if (charSequence5 != null || this.f452p != null) {
                alertController.k(-3, charSequence5, this.f453q, null, this.f452p);
            }
            if (this.f458v != null || this.K != null || this.f459w != null) {
                b(alertController);
            }
            View view2 = this.f462z;
            if (view2 != null) {
                if (this.E) {
                    alertController.t(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController.s(view2);
                    return;
                }
            }
            int i12 = this.f461y;
            if (i12 != 0) {
                alertController.r(i12);
            }
        }
    }

    private static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference f475a;

        public c(DialogInterface dialogInterface) {
            this.f475a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f475a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, j jVar, Window window) {
        this.f408a = context;
        this.f409b = jVar;
        this.f410c = window;
        this.R = new c(jVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, f.j.F, f.a.f23298k, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(f.j.G, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(f.j.I, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(f.j.K, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(f.j.L, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(f.j.N, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(f.j.J, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(f.j.M, true);
        this.f411d = typedArrayObtainStyledAttributes.getDimensionPixelSize(f.j.H, 0);
        typedArrayObtainStyledAttributes.recycle();
        jVar.k(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int j() {
        int i10 = this.K;
        return (i10 != 0 && this.Q == 1) ? i10 : this.J;
    }

    private void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f410c.findViewById(f.f.f23383v);
        View viewFindViewById2 = this.f410c.findViewById(f.f.f23382u);
        w.D0(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void u(ViewGroup viewGroup) {
        int i10;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(R.id.button1);
        this.f422o = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f423p) && this.f425r == null) {
            this.f422o.setVisibility(8);
            i10 = 0;
        } else {
            this.f422o.setText(this.f423p);
            Drawable drawable = this.f425r;
            if (drawable != null) {
                int i11 = this.f411d;
                drawable.setBounds(0, 0, i11, i11);
                this.f422o.setCompoundDrawables(this.f425r, null, null, null);
            }
            this.f422o.setVisibility(0);
            i10 = 1;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button2);
        this.f426s = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f427t) && this.f429v == null) {
            this.f426s.setVisibility(8);
        } else {
            this.f426s.setText(this.f427t);
            Drawable drawable2 = this.f429v;
            if (drawable2 != null) {
                int i12 = this.f411d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f426s.setCompoundDrawables(this.f429v, null, null, null);
            }
            this.f426s.setVisibility(0);
            i10 |= 2;
        }
        Button button4 = (Button) viewGroup.findViewById(R.id.button3);
        this.f430w = button4;
        button4.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f431x) && this.f433z == null) {
            this.f430w.setVisibility(8);
        } else {
            this.f430w.setText(this.f431x);
            Drawable drawable3 = this.f433z;
            if (drawable3 != null) {
                int i13 = this.f411d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f430w.setCompoundDrawables(this.f433z, null, null, null);
            }
            this.f430w.setVisibility(0);
            i10 |= 4;
        }
        if (z(this.f408a)) {
            if (i10 == 1) {
                button = this.f422o;
            } else if (i10 == 2) {
                button = this.f426s;
            } else if (i10 == 4) {
                button = this.f430w;
            }
            b(button);
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f410c.findViewById(f.f.f23384w);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f413f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f414g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f414g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void w(ViewGroup viewGroup) {
        View viewInflate = this.f415h;
        if (viewInflate == null) {
            viewInflate = this.f416i != 0 ? LayoutInflater.from(this.f408a).inflate(this.f416i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f410c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f410c.findViewById(f.f.f23375n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f421n) {
            frameLayout.setPadding(this.f417j, this.f418k, this.f419l, this.f420m);
        }
        if (this.f414g != null) {
            ((LinearLayout.LayoutParams) ((m0.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void x(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f410c.findViewById(f.f.O).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f410c.findViewById(R.id.icon);
        if (!(!TextUtils.isEmpty(this.f412e)) || !this.P) {
            this.f410c.findViewById(f.f.O).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f410c.findViewById(f.f.f23371j);
        this.E = textView;
        textView.setText(this.f412e);
        int i10 = this.B;
        if (i10 != 0) {
            this.D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
        } else {
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void y() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f410c.findViewById(f.f.f23381t);
        int i10 = f.f.P;
        View viewFindViewById4 = viewFindViewById3.findViewById(i10);
        int i11 = f.f.f23374m;
        View viewFindViewById5 = viewFindViewById3.findViewById(i11);
        int i12 = f.f.f23372k;
        View viewFindViewById6 = viewFindViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(f.f.f23376o);
        w(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i10);
        View viewFindViewById8 = viewGroup.findViewById(i11);
        View viewFindViewById9 = viewGroup.findViewById(i12);
        ViewGroup viewGroupI = i(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupI2 = i(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupI3 = i(viewFindViewById9, viewFindViewById6);
        v(viewGroupI2);
        u(viewGroupI3);
        x(viewGroupI);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupI == null || viewGroupI.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (viewGroupI3 == null || viewGroupI3.getVisibility() == 8) ? false : true;
        if (!z12 && viewGroupI2 != null && (viewFindViewById2 = viewGroupI2.findViewById(f.f.K)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f413f == null && this.f414g == null) ? null : viewGroupI.findViewById(f.f.N);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupI2 != null && (viewFindViewById = viewGroupI2.findViewById(f.f.L)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f414g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f414g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                p(viewGroupI2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f414g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i13 = this.I;
        if (i13 > -1) {
            listView2.setItemChecked(i13, true);
            listView2.setSelection(i13);
        }
    }

    private static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(f.a.f23297j, typedValue, true);
        return typedValue.data != 0;
    }

    public Button c(int i10) {
        if (i10 == -3) {
            return this.f430w;
        }
        if (i10 == -2) {
            return this.f426s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f422o;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f408a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f414g;
    }

    public void f() {
        this.f409b.setContentView(j());
        y();
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.s(keyEvent);
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f431x = charSequence;
            this.f432y = message;
            this.f433z = drawable;
        } else if (i10 == -2) {
            this.f427t = charSequence;
            this.f428u = message;
            this.f429v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f423p = charSequence;
            this.f424q = message;
            this.f425r = drawable;
        }
    }

    public void l(View view) {
        this.G = view;
    }

    public void m(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void n(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void o(CharSequence charSequence) {
        this.f413f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(CharSequence charSequence) {
        this.f412e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i10) {
        this.f415h = null;
        this.f416i = i10;
        this.f421n = false;
    }

    public void s(View view) {
        this.f415h = view;
        this.f416i = 0;
        this.f421n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f415h = view;
        this.f416i = 0;
        this.f421n = true;
        this.f417j = i10;
        this.f418k = i11;
        this.f419l = i12;
        this.f420m = i13;
    }
}
