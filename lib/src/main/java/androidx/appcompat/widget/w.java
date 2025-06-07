package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* loaded from: classes.dex */
public class w extends RatingBar {

    /* renamed from: m, reason: collision with root package name */
    private final u f1395m;

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.E);
    }

    public w(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        v0.a(this, getContext());
        u uVar = new u(this);
        this.f1395m = uVar;
        uVar.c(attributeSet, i10);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap bitmapB = this.f1395m.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}
