package e4;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f23162a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static m1 f23163b = null;

    /* renamed from: c, reason: collision with root package name */
    static HandlerThread f23164c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Executor f23165d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f23166e = false;

    public static i a(Context context) {
        synchronized (f23162a) {
            if (f23163b == null) {
                f23163b = new m1(context.getApplicationContext(), f23166e ? b().getLooper() : context.getMainLooper(), f23165d);
            }
        }
        return f23163b;
    }

    public static HandlerThread b() {
        synchronized (f23162a) {
            HandlerThread handlerThread = f23164c;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f23164c = handlerThread2;
            handlerThread2.start();
            return f23164c;
        }
    }

    protected abstract void c(i1 i1Var, ServiceConnection serviceConnection, String str);

    public final void d(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        c(new i1(str, str2, 4225, z10), serviceConnection, str3);
    }

    protected abstract boolean e(i1 i1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
