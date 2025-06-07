package l4;

import android.content.Context;
import android.os.IBinder;
import b4.i;
import e4.p;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f25107a;

    /* renamed from: b, reason: collision with root package name */
    private Object f25108b;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected c(String str) {
        this.f25107a = str;
    }

    protected abstract Object a(IBinder iBinder);

    protected final Object b(Context context) throws a {
        if (this.f25108b == null) {
            p.l(context);
            Context contextD = i.d(context);
            if (contextD == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.f25108b = a((IBinder) contextD.getClassLoader().loadClass(this.f25107a).newInstance());
            } catch (ClassNotFoundException e5) {
                throw new a("Could not load creator class.", e5);
            } catch (IllegalAccessException e10) {
                throw new a("Could not access creator.", e10);
            } catch (InstantiationException e11) {
                throw new a("Could not instantiate creator.", e11);
            }
        }
        return this.f25108b;
    }
}
