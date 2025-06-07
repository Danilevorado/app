package s3;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.ma3;
import com.google.android.gms.internal.ads.t70;
import com.google.android.gms.internal.ads.tu2;
import com.google.android.gms.internal.ads.ze0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class q0 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t70 f26852a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f26853b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f26854c;

    q0(c cVar, t70 t70Var, boolean z10) {
        this.f26854c = cVar;
        this.f26852a = t70Var;
        this.f26853b = z10;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        try {
            this.f26852a.s("Internal error: " + th.getMessage());
        } catch (RemoteException e5) {
            ze0.e("", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        tu2 tu2Var;
        String string;
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f26852a.P2(arrayList);
            if (this.f26854c.A || this.f26853b) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (this.f26854c.a6(uri)) {
                        Uri uriI6 = c.i6(uri, this.f26854c.J, "1");
                        tu2Var = this.f26854c.f26792z;
                        string = uriI6.toString();
                    } else {
                        if (((Boolean) k3.w.c().b(ir.f9932e7)).booleanValue()) {
                            tu2Var = this.f26854c.f26792z;
                            string = uri.toString();
                        }
                    }
                    tu2Var.c(string, null);
                }
            }
        } catch (RemoteException e5) {
            ze0.e("", e5);
        }
    }
}
