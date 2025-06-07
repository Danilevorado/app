package n;

import a.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class e implements ServiceConnection {

    /* renamed from: m, reason: collision with root package name */
    private Context f25438m;

    class a extends c {
        a(a.b bVar, ComponentName componentName, Context context) {
            super(bVar, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, c cVar);

    void b(Context context) {
        this.f25438m = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f25438m == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        a(componentName, new a(b.a.C(iBinder), componentName, this.f25438m));
    }
}
