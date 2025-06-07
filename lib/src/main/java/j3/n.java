package j3;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
final class n implements View.OnTouchListener {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ s f24487m;

    n(s sVar) {
        this.f24487m = sVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        s sVar = this.f24487m;
        if (sVar.f24503t == null) {
            return false;
        }
        sVar.f24503t.d(motionEvent);
        return false;
    }
}
