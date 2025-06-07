package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: m, reason: collision with root package name */
    private boolean f1609m;

    public Guideline(Context context) {
        super(context);
        this.f1609m = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1609m = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f1609m = z10;
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f1609m && bVar.f1551a == i10) {
            return;
        }
        bVar.f1551a = i10;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f1609m && bVar.f1553b == i10) {
            return;
        }
        bVar.f1553b = i10;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f5) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f1609m && bVar.f1555c == f5) {
            return;
        }
        bVar.f1555c = f5;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
