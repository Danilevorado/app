package j5;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public class a implements View.OnTouchListener {

    /* renamed from: m, reason: collision with root package name */
    private final Dialog f24538m;

    /* renamed from: n, reason: collision with root package name */
    private final int f24539n;

    /* renamed from: o, reason: collision with root package name */
    private final int f24540o;

    /* renamed from: p, reason: collision with root package name */
    private final int f24541p;

    public a(Dialog dialog, Rect rect) {
        this.f24538m = dialog;
        this.f24539n = rect.left;
        this.f24540o = rect.top;
        this.f24541p = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f24539n + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f24540o + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f24541p;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f24538m.onTouchEvent(motionEventObtain);
    }
}
