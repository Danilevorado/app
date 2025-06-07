package s4;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class u {
    public static Looper a() {
        e4.p.p(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
