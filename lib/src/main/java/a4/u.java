package a4;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
abstract class u {

    /* renamed from: a, reason: collision with root package name */
    final int f147a;

    /* renamed from: b, reason: collision with root package name */
    final b5.j f148b = new b5.j();

    /* renamed from: c, reason: collision with root package name */
    final int f149c;

    /* renamed from: d, reason: collision with root package name */
    final Bundle f150d;

    u(int i10, int i11, Bundle bundle) {
        this.f147a = i10;
        this.f149c = i11;
        this.f150d = bundle;
    }

    abstract void a(Bundle bundle);

    abstract boolean b();

    final void c(v vVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(vVar);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
            sb2.append("Failing ");
            sb2.append(strValueOf);
            sb2.append(" with ");
            sb2.append(strValueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f148b.b(vVar);
    }

    final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 16 + strValueOf2.length());
            sb2.append("Finishing ");
            sb2.append(strValueOf);
            sb2.append(" with ");
            sb2.append(strValueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f148b.c(obj);
    }

    public final String toString() {
        int i10 = this.f149c;
        int i11 = this.f147a;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i10);
        sb2.append(" id=");
        sb2.append(i11);
        sb2.append(" oneWay=");
        sb2.append(b());
        sb2.append("}");
        return sb2.toString();
    }
}
