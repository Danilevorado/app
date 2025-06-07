package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
public class y extends SeekBar {

    /* renamed from: m, reason: collision with root package name */
    private final z f1404m;

    public y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.G);
    }

    public y(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        v0.a(this, getContext());
        z zVar = new z(this);
        this.f1404m = zVar;
        zVar.c(attributeSet, i10);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1404m.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1404m.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1404m.g(canvas);
    }
}
