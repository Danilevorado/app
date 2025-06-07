package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.h0;
import androidx.core.view.w;
import androidx.fragment.app.v;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class i<S> extends androidx.fragment.app.d {
    static final Object Z0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: a1, reason: collision with root package name */
    static final Object f20951a1 = "CANCEL_BUTTON_TAG";

    /* renamed from: b1, reason: collision with root package name */
    static final Object f20952b1 = "TOGGLE_BUTTON_TAG";
    private final LinkedHashSet D0 = new LinkedHashSet();
    private final LinkedHashSet E0 = new LinkedHashSet();
    private final LinkedHashSet F0 = new LinkedHashSet();
    private final LinkedHashSet G0 = new LinkedHashSet();
    private int H0;
    private com.google.android.material.datepicker.d I0;
    private p J0;
    private com.google.android.material.datepicker.a K0;
    private h L0;
    private int M0;
    private CharSequence N0;
    private boolean O0;
    private int P0;
    private int Q0;
    private CharSequence R0;
    private int S0;
    private CharSequence T0;
    private TextView U0;
    private CheckableImageButton V0;
    private s5.g W0;
    private Button X0;
    private boolean Y0;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = i.this.D0.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(i.this.o2());
            }
            i.this.O1();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = i.this.E0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            i.this.O1();
        }
    }

    class c implements androidx.core.view.r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f20955a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f20956b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f20957c;

        c(int i10, View view, int i11) {
            this.f20955a = i10;
            this.f20956b = view;
            this.f20957c = i11;
        }

        @Override // androidx.core.view.r
        public h0 a(View view, h0 h0Var) {
            int i10 = h0Var.f(h0.m.c()).f2207b;
            if (this.f20955a >= 0) {
                this.f20956b.getLayoutParams().height = this.f20955a + i10;
                View view2 = this.f20956b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f20956b;
            view3.setPadding(view3.getPaddingLeft(), this.f20957c + i10, this.f20956b.getPaddingRight(), this.f20956b.getPaddingBottom());
            return h0Var;
        }
    }

    class d extends o {
        d() {
        }

        @Override // com.google.android.material.datepicker.o
        public void a(Object obj) {
            i.this.v2();
            i.this.X0.setEnabled(i.this.l2().o());
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.X0.setEnabled(i.this.l2().o());
            i.this.V0.toggle();
            i iVar = i.this;
            iVar.w2(iVar.V0);
            i.this.u2();
        }
    }

    private static Drawable j2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, g.a.b(context, c5.e.f4732b));
        stateListDrawable.addState(new int[0], g.a.b(context, c5.e.f4733c));
        return stateListDrawable;
    }

    private void k2(Window window) {
        if (this.Y0) {
            return;
        }
        View viewFindViewById = u1().findViewById(c5.f.f4743f);
        com.google.android.material.internal.d.a(window, true, com.google.android.material.internal.n.c(viewFindViewById), null);
        w.A0(viewFindViewById, new c(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.Y0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.material.datepicker.d l2() {
        if (this.I0 == null) {
            this.I0 = (com.google.android.material.datepicker.d) t().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.I0;
    }

    private static int n2(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(c5.d.f4728x);
        int i10 = l.m().f20968p;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(c5.d.f4730z) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(c5.d.C));
    }

    private int p2(Context context) {
        int i10 = this.H0;
        return i10 != 0 ? i10 : l2().k(context);
    }

    private void q2(Context context) {
        this.V0.setTag(f20952b1);
        this.V0.setImageDrawable(j2(context));
        this.V0.setChecked(this.P0 != 0);
        w.o0(this.V0, null);
        w2(this.V0);
        this.V0.setOnClickListener(new e());
    }

    static boolean r2(Context context) {
        return t2(context, R.attr.windowFullscreen);
    }

    static boolean s2(Context context) {
        return t2(context, c5.b.f4695w);
    }

    static boolean t2(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(p5.b.c(context, c5.b.f4692t, h.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u2() {
        int iP2 = p2(t1());
        this.L0 = h.d2(l2(), iP2, this.K0);
        this.J0 = this.V0.isChecked() ? k.N1(l2(), iP2, this.K0) : this.L0;
        v2();
        v vVarL = u().l();
        vVarL.m(c5.f.f4760w, this.J0);
        vVarL.h();
        this.J0.L1(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v2() {
        String strM2 = m2();
        this.U0.setContentDescription(String.format(V(c5.i.f4792i), strM2));
        this.U0.setText(strM2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w2(CheckableImageButton checkableImageButton) {
        this.V0.setContentDescription(checkableImageButton.getContext().getString(this.V0.isChecked() ? c5.i.f4795l : c5.i.f4797n));
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void P0(Bundle bundle) {
        super.P0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.H0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.I0);
        a.b bVar = new a.b(this.K0);
        if (this.L0.Y1() != null) {
            bVar.b(this.L0.Y1().f20970r);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.M0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.N0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.Q0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.R0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.S0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.T0);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void Q0() throws Resources.NotFoundException {
        super.Q0();
        Window window = X1().getWindow();
        if (this.O0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.W0);
            k2(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = P().getDimensionPixelOffset(c5.d.B);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.W0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new j5.a(X1(), rect));
        }
        u2();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void R0() {
        this.J0.M1();
        super.R0();
    }

    @Override // androidx.fragment.app.d
    public final Dialog T1(Bundle bundle) {
        Dialog dialog = new Dialog(t1(), p2(t1()));
        Context context = dialog.getContext();
        this.O0 = r2(context);
        int iC = p5.b.c(context, c5.b.f4684l, i.class.getCanonicalName());
        s5.g gVar = new s5.g(context, null, c5.b.f4692t, c5.j.f4814o);
        this.W0 = gVar;
        gVar.L(context);
        this.W0.V(ColorStateList.valueOf(iC));
        this.W0.U(w.w(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public String m2() {
        return l2().i(v());
    }

    public final Object o2() {
        return l2().s();
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.F0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.G0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) X();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void t0(Bundle bundle) {
        super.t0(bundle);
        if (bundle == null) {
            bundle = t();
        }
        this.H0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.I0 = (com.google.android.material.datepicker.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.K0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.M0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.N0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.P0 = bundle.getInt("INPUT_MODE_KEY");
        this.Q0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.R0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.S0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.T0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewFindViewById;
        LinearLayout.LayoutParams layoutParams;
        View viewInflate = layoutInflater.inflate(this.O0 ? c5.h.f4783r : c5.h.f4782q, viewGroup);
        Context context = viewInflate.getContext();
        if (this.O0) {
            viewFindViewById = viewInflate.findViewById(c5.f.f4760w);
            layoutParams = new LinearLayout.LayoutParams(n2(context), -2);
        } else {
            viewFindViewById = viewInflate.findViewById(c5.f.f4761x);
            layoutParams = new LinearLayout.LayoutParams(n2(context), -1);
        }
        viewFindViewById.setLayoutParams(layoutParams);
        TextView textView = (TextView) viewInflate.findViewById(c5.f.C);
        this.U0 = textView;
        w.q0(textView, 1);
        this.V0 = (CheckableImageButton) viewInflate.findViewById(c5.f.D);
        TextView textView2 = (TextView) viewInflate.findViewById(c5.f.E);
        CharSequence charSequence = this.N0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.M0);
        }
        q2(context);
        this.X0 = (Button) viewInflate.findViewById(c5.f.f4740c);
        if (l2().o()) {
            this.X0.setEnabled(true);
        } else {
            this.X0.setEnabled(false);
        }
        this.X0.setTag(Z0);
        CharSequence charSequence2 = this.R0;
        if (charSequence2 != null) {
            this.X0.setText(charSequence2);
        } else {
            int i10 = this.Q0;
            if (i10 != 0) {
                this.X0.setText(i10);
            }
        }
        this.X0.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(c5.f.f4738a);
        button.setTag(f20951a1);
        CharSequence charSequence3 = this.T0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i11 = this.S0;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        button.setOnClickListener(new b());
        return viewInflate;
    }
}
