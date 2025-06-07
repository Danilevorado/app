package r4;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class e extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f26573a;

    public e(Looper looper) {
        super(looper);
        this.f26573a = Looper.getMainLooper();
    }

    public e(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f26573a = Looper.getMainLooper();
    }
}
