package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.w;
import c5.h;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {
    private final Chip K;
    private final Chip L;
    private final ClockHandView M;
    private final ClockFaceView N;
    private final MaterialButtonToggleGroup O;
    private final View.OnClickListener P;
    private f Q;
    private g R;
    private e S;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.R != null) {
                TimePickerView.this.R.a(((Integer) view.getTag(c5.f.G)).intValue());
            }
        }
    }

    class b implements MaterialButtonToggleGroup.d {
        b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
            int i11 = i10 == c5.f.f4747j ? 1 : 0;
            if (TimePickerView.this.Q == null || !z10) {
                return;
            }
            TimePickerView.this.Q.a(i11);
        }
    }

    class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            e eVar = TimePickerView.this.S;
            if (eVar == null) {
                return false;
            }
            eVar.a();
            return true;
        }
    }

    class d implements View.OnTouchListener {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ GestureDetector f21305m;

        d(GestureDetector gestureDetector) {
            this.f21305m = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f21305m.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface e {
        void a();
    }

    interface f {
        void a(int i10);
    }

    interface g {
        void a(int i10);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.P = new a();
        LayoutInflater.from(context).inflate(h.f4774i, this);
        this.N = (ClockFaceView) findViewById(c5.f.f4745h);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(c5.f.f4748k);
        this.O = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new b());
        this.K = (Chip) findViewById(c5.f.f4751n);
        this.L = (Chip) findViewById(c5.f.f4749l);
        this.M = (ClockHandView) findViewById(c5.f.f4746i);
        F();
        E();
    }

    private void E() {
        Chip chip = this.K;
        int i10 = c5.f.G;
        chip.setTag(i10, 12);
        this.L.setTag(i10, 10);
        this.K.setOnClickListener(this.P);
        this.L.setOnClickListener(this.P);
        this.K.setAccessibilityClassName("android.view.View");
        this.L.setAccessibilityClassName("android.view.View");
    }

    private void F() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.K.setOnTouchListener(dVar);
        this.L.setOnTouchListener(dVar);
    }

    private void G() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.O.getVisibility() == 0) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.g(this);
            dVar.e(c5.f.f4744g, w.B(this) == 0 ? 2 : 1);
            dVar.c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onAttachedToWindow();
        G();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            G();
        }
    }
}
