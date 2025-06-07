package p4;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class l extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f25924a;

    public l(Looper looper) {
        super(looper);
        this.f25924a = Looper.getMainLooper();
    }

    public l(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f25924a = Looper.getMainLooper();
    }
}
