package m1;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;

/* loaded from: classes.dex */
final class a implements Camera.AutoFocusCallback {

    /* renamed from: c, reason: collision with root package name */
    private static final String f25162c = a.class.getName();

    /* renamed from: a, reason: collision with root package name */
    private Handler f25163a;

    /* renamed from: b, reason: collision with root package name */
    private int f25164b;

    a() {
    }

    void a(Handler handler, int i10) {
        this.f25163a = handler;
        this.f25164b = i10;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z10, Camera camera) {
        Handler handler = this.f25163a;
        if (handler == null) {
            Log.v(f25162c, "Got auto-focus callback, but no handler for it");
            return;
        }
        this.f25163a.sendMessageDelayed(handler.obtainMessage(this.f25164b, Boolean.valueOf(z10)), 1500L);
        this.f25163a = null;
    }
}
