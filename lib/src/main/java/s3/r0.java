package s3;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.ma3;
import com.google.android.gms.internal.ads.t70;
import com.google.android.gms.internal.ads.tu2;
import com.google.android.gms.internal.ads.ze0;
import java.util.List;

/* loaded from: classes.dex */
final class r0 implements ma3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t70 f26856a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f26857b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f26858c;

    r0(c cVar, t70 t70Var, boolean z10) {
        this.f26858c = cVar;
        this.f26856a = t70Var;
        this.f26857b = z10;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final void a(Throwable th) {
        try {
            this.f26856a.s("Internal error: " + th.getMessage());
        } catch (RemoteException e5) {
            ze0.e("", e5);
        }
    }

    @Override // com.google.android.gms.internal.ads.ma3
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        tu2 tu2Var;
        String string;
        List<Uri> list = (List) obj;
        try {
            c.R5(this.f26858c, list);
            this.f26856a.P2(list);
            if (this.f26858c.B || this.f26857b) {
                for (Uri uri : list) {
                    if (this.f26858c.Z5(uri)) {
                        Uri uriI6 = c.i6(uri, this.f26858c.J, "1");
                        tu2Var = this.f26858c.f26792z;
                        string = uriI6.toString();
                    } else {
                        if (((Boolean) k3.w.c().b(ir.f9932e7)).booleanValue()) {
                            tu2Var = this.f26858c.f26792z;
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
