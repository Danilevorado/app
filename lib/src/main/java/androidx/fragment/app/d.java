package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;

/* loaded from: classes.dex */
public class d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private boolean A0;
    private boolean B0;

    /* renamed from: n0, reason: collision with root package name */
    private Handler f2813n0;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f2822w0;

    /* renamed from: y0, reason: collision with root package name */
    private Dialog f2824y0;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f2825z0;

    /* renamed from: o0, reason: collision with root package name */
    private Runnable f2814o0 = new a();

    /* renamed from: p0, reason: collision with root package name */
    private DialogInterface.OnCancelListener f2815p0 = new b();

    /* renamed from: q0, reason: collision with root package name */
    private DialogInterface.OnDismissListener f2816q0 = new c();

    /* renamed from: r0, reason: collision with root package name */
    private int f2817r0 = 0;

    /* renamed from: s0, reason: collision with root package name */
    private int f2818s0 = 0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f2819t0 = true;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f2820u0 = true;

    /* renamed from: v0, reason: collision with root package name */
    private int f2821v0 = -1;

    /* renamed from: x0, reason: collision with root package name */
    private androidx.lifecycle.t f2823x0 = new C0044d();
    private boolean C0 = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f2816q0.onDismiss(d.this.f2824y0);
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (d.this.f2824y0 != null) {
                d dVar = d.this;
                dVar.onCancel(dVar.f2824y0);
            }
        }
    }

    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (d.this.f2824y0 != null) {
                d dVar = d.this;
                dVar.onDismiss(dVar.f2824y0);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    class C0044d implements androidx.lifecycle.t {
        C0044d() {
        }

        @Override // androidx.lifecycle.t
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.lifecycle.n nVar) {
            if (nVar == null || !d.this.f2820u0) {
                return;
            }
            View viewU1 = d.this.u1();
            if (viewU1.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (d.this.f2824y0 != null) {
                if (m.F0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + d.this.f2824y0);
                }
                d.this.f2824y0.setContentView(viewU1);
            }
        }
    }

    class e extends g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f2830a;

        e(g gVar) {
            this.f2830a = gVar;
        }

        @Override // androidx.fragment.app.g
        public View e(int i10) {
            return this.f2830a.f() ? this.f2830a.e(i10) : d.this.U1(i10);
        }

        @Override // androidx.fragment.app.g
        public boolean f() {
            return this.f2830a.f() || d.this.V1();
        }
    }

    private void Q1(boolean z10, boolean z11) {
        if (this.A0) {
            return;
        }
        this.A0 = true;
        this.B0 = false;
        Dialog dialog = this.f2824y0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2824y0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f2813n0.getLooper()) {
                    onDismiss(this.f2824y0);
                } else {
                    this.f2813n0.post(this.f2814o0);
                }
            }
        }
        this.f2825z0 = true;
        if (this.f2821v0 >= 0) {
            J().U0(this.f2821v0, 1);
            this.f2821v0 = -1;
            return;
        }
        v vVarL = J().l();
        vVarL.l(this);
        if (z10) {
            vVarL.g();
        } else {
            vVarL.f();
        }
    }

    private void W1(Bundle bundle) {
        if (this.f2820u0 && !this.C0) {
            try {
                this.f2822w0 = true;
                Dialog dialogT1 = T1(bundle);
                this.f2824y0 = dialogT1;
                if (this.f2820u0) {
                    Z1(dialogT1, this.f2817r0);
                    Context contextV = v();
                    if (contextV instanceof Activity) {
                        this.f2824y0.setOwnerActivity((Activity) contextV);
                    }
                    this.f2824y0.setCancelable(this.f2819t0);
                    this.f2824y0.setOnCancelListener(this.f2815p0);
                    this.f2824y0.setOnDismissListener(this.f2816q0);
                    this.C0 = true;
                } else {
                    this.f2824y0 = null;
                }
            } finally {
                this.f2822w0 = false;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void A0() {
        super.A0();
        Dialog dialog = this.f2824y0;
        if (dialog != null) {
            this.f2825z0 = true;
            dialog.setOnDismissListener(null);
            this.f2824y0.dismiss();
            if (!this.A0) {
                onDismiss(this.f2824y0);
            }
            this.f2824y0 = null;
            this.C0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void B0() {
        super.B0();
        if (!this.B0 && !this.A0) {
            this.A0 = true;
        }
        Y().j(this.f2823x0);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater C0(Bundle bundle) {
        StringBuilder sb2;
        String str;
        LayoutInflater layoutInflaterC0 = super.C0(bundle);
        if (this.f2820u0 && !this.f2822w0) {
            W1(bundle);
            if (m.F0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f2824y0;
            return dialog != null ? layoutInflaterC0.cloneInContext(dialog.getContext()) : layoutInflaterC0;
        }
        if (m.F0(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (this.f2820u0) {
                sb2 = new StringBuilder();
                str = "mCreatingDialog = true: ";
            } else {
                sb2 = new StringBuilder();
                str = "mShowsDialog = false: ";
            }
            sb2.append(str);
            sb2.append(str2);
            Log.d("FragmentManager", sb2.toString());
        }
        return layoutInflaterC0;
    }

    public void O1() {
        Q1(false, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void P0(Bundle bundle) {
        super.P0(bundle);
        Dialog dialog = this.f2824y0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f2817r0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f2818s0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f2819t0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f2820u0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f2821v0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    public void P1() {
        Q1(true, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void Q0() {
        super.Q0();
        Dialog dialog = this.f2824y0;
        if (dialog != null) {
            this.f2825z0 = false;
            dialog.show();
            View decorView = this.f2824y0.getWindow().getDecorView();
            l0.a(decorView, this);
            m0.a(decorView, this);
            t0.f.a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void R0() {
        super.R0();
        Dialog dialog = this.f2824y0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public Dialog R1() {
        return this.f2824y0;
    }

    public int S1() {
        return this.f2818s0;
    }

    @Override // androidx.fragment.app.Fragment
    public void T0(Bundle bundle) {
        Bundle bundle2;
        super.T0(bundle);
        if (this.f2824y0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2824y0.onRestoreInstanceState(bundle2);
    }

    public Dialog T1(Bundle bundle) {
        if (m.F0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(t1(), S1());
    }

    View U1(int i10) {
        Dialog dialog = this.f2824y0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    boolean V1() {
        return this.C0;
    }

    public final Dialog X1() {
        Dialog dialogR1 = R1();
        if (dialogR1 != null) {
            return dialogR1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void Y1(boolean z10) {
        this.f2820u0 = z10;
    }

    public void Z1(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // androidx.fragment.app.Fragment
    void a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.a1(layoutInflater, viewGroup, bundle);
        if (this.T != null || this.f2824y0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2824y0.onRestoreInstanceState(bundle2);
    }

    public void a2(m mVar, String str) {
        this.A0 = false;
        this.B0 = true;
        v vVarL = mVar.l();
        vVarL.d(this, str);
        vVarL.f();
    }

    @Override // androidx.fragment.app.Fragment
    g g() {
        return new e(super.g());
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2825z0) {
            return;
        }
        if (m.F0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        Q1(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void q0(Context context) {
        super.q0(context);
        Y().f(this.f2823x0);
        if (this.B0) {
            return;
        }
        this.A0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void t0(Bundle bundle) {
        super.t0(bundle);
        this.f2813n0 = new Handler();
        this.f2820u0 = this.J == 0;
        if (bundle != null) {
            this.f2817r0 = bundle.getInt("android:style", 0);
            this.f2818s0 = bundle.getInt("android:theme", 0);
            this.f2819t0 = bundle.getBoolean("android:cancelable", true);
            this.f2820u0 = bundle.getBoolean("android:showsDialog", this.f2820u0);
            this.f2821v0 = bundle.getInt("android:backStackId", -1);
        }
    }
}
