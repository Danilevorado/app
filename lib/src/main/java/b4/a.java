package b4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class a implements ServiceConnection {

    /* renamed from: m, reason: collision with root package name */
    boolean f4391m = false;

    /* renamed from: n, reason: collision with root package name */
    private final BlockingQueue f4392n = new LinkedBlockingQueue();

    public IBinder a(long j10, TimeUnit timeUnit) throws TimeoutException {
        e4.p.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f4391m) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f4391m = true;
        IBinder iBinder = (IBinder) this.f4392n.poll(j10, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f4392n.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
