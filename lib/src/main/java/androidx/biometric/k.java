package androidx.biometric;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.lifecycle.g0;

/* loaded from: classes.dex */
public class k extends androidx.fragment.app.d {
    final Handler D0 = new Handler(Looper.getMainLooper());
    final Runnable E0 = new a();
    androidx.biometric.f F0;
    private int G0;
    private int H0;
    private ImageView I0;
    TextView J0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.f2();
        }
    }

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            k.this.F0.a0(true);
        }
    }

    class c implements androidx.lifecycle.t {
        c() {
        }

        @Override // androidx.lifecycle.t
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Integer num) {
            k kVar = k.this;
            kVar.D0.removeCallbacks(kVar.E0);
            k.this.h2(num.intValue());
            k.this.i2(num.intValue());
            k kVar2 = k.this;
            kVar2.D0.postDelayed(kVar2.E0, 2000L);
        }
    }

    class d implements androidx.lifecycle.t {
        d() {
        }

        @Override // androidx.lifecycle.t
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CharSequence charSequence) {
            k kVar = k.this;
            kVar.D0.removeCallbacks(kVar.E0);
            k.this.j2(charSequence);
            k kVar2 = k.this;
            kVar2.D0.postDelayed(kVar2.E0, 2000L);
        }
    }

    private static class e {
        static void a(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    private static class f {
        static int a() {
            return o.f1510a;
        }
    }

    private void b2() {
        androidx.fragment.app.e eVarK = k();
        if (eVarK == null) {
            return;
        }
        androidx.biometric.f fVar = (androidx.biometric.f) new g0(eVarK).a(androidx.biometric.f.class);
        this.F0 = fVar;
        fVar.s().e(this, new c());
        this.F0.q().e(this, new d());
    }

    private Drawable c2(int i10, int i11) {
        int i12;
        Context contextV = v();
        if (contextV == null) {
            Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            return null;
        }
        if (i10 == 0 && i11 == 1) {
            i12 = q.f1513b;
        } else if (i10 == 1 && i11 == 2) {
            i12 = q.f1512a;
        } else {
            if ((i10 != 2 || i11 != 1) && (i10 != 1 || i11 != 3)) {
                return null;
            }
            i12 = q.f1513b;
        }
        return androidx.core.content.a.e(contextV, i12);
    }

    private int d2(int i10) {
        Context contextV = v();
        androidx.fragment.app.e eVarK = k();
        if (contextV == null || eVarK == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        contextV.getTheme().resolveAttribute(i10, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = eVarK.obtainStyledAttributes(typedValue.data, new int[]{i10});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    static k e2() {
        return new k();
    }

    private boolean g2(int i10, int i11) {
        if (i10 == 0 && i11 == 1) {
            return false;
        }
        if (i10 == 1 && i11 == 2) {
            return true;
        }
        return i10 == 2 && i11 == 1;
    }

    @Override // androidx.fragment.app.Fragment
    public void J0() {
        super.J0();
        this.D0.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void O0() {
        super.O0();
        this.F0.X(0);
        this.F0.Y(1);
        this.F0.W(V(t.f1521c));
    }

    @Override // androidx.fragment.app.d
    public Dialog T1(Bundle bundle) {
        b.a aVar = new b.a(t1());
        aVar.s(this.F0.x());
        View viewInflate = LayoutInflater.from(aVar.b()).inflate(s.f1518a, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(r.f1517d);
        if (textView != null) {
            CharSequence charSequenceW = this.F0.w();
            if (TextUtils.isEmpty(charSequenceW)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequenceW);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(r.f1514a);
        if (textView2 != null) {
            CharSequence charSequenceP = this.F0.p();
            if (TextUtils.isEmpty(charSequenceP)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequenceP);
            }
        }
        this.I0 = (ImageView) viewInflate.findViewById(r.f1516c);
        this.J0 = (TextView) viewInflate.findViewById(r.f1515b);
        aVar.j(androidx.biometric.b.c(this.F0.f()) ? V(t.f1519a) : this.F0.v(), new b());
        aVar.t(viewInflate);
        androidx.appcompat.app.b bVarA = aVar.a();
        bVarA.setCanceledOnTouchOutside(false);
        return bVarA;
    }

    void f2() {
        Context contextV = v();
        if (contextV == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
        } else {
            this.F0.Y(1);
            this.F0.W(contextV.getString(t.f1521c));
        }
    }

    void h2(int i10) {
        int iR;
        Drawable drawableC2;
        if (this.I0 == null || (drawableC2 = c2((iR = this.F0.r()), i10)) == null) {
            return;
        }
        this.I0.setImageDrawable(drawableC2);
        if (g2(iR, i10)) {
            e.a(drawableC2);
        }
        this.F0.X(i10);
    }

    void i2(int i10) {
        TextView textView = this.J0;
        if (textView != null) {
            textView.setTextColor(i10 == 2 ? this.G0 : this.H0);
        }
    }

    void j2(CharSequence charSequence) {
        TextView textView = this.J0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.F0.U(true);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void t0(Bundle bundle) {
        int iC;
        super.t0(bundle);
        b2();
        if (Build.VERSION.SDK_INT >= 26) {
            iC = d2(f.a());
        } else {
            Context contextV = v();
            iC = contextV != null ? androidx.core.content.a.c(contextV, p.f1511a) : 0;
        }
        this.G0 = iC;
        this.H0 = d2(R.attr.textColorSecondary);
    }
}
