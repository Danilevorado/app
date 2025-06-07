package j3;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.q80;
import com.google.android.gms.internal.ads.zb0;
import java.util.Collections;
import java.util.List;
import m3.b2;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24452a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f24453b;

    /* renamed from: c, reason: collision with root package name */
    private final zb0 f24454c;

    /* renamed from: d, reason: collision with root package name */
    private final q80 f24455d = new q80(false, Collections.emptyList());

    public b(Context context, zb0 zb0Var, q80 q80Var) {
        this.f24452a = context;
        this.f24454c = zb0Var;
    }

    private final boolean d() {
        zb0 zb0Var = this.f24454c;
        return (zb0Var != null && zb0Var.a().f17045r) || this.f24455d.f14186m;
    }

    public final void a() {
        this.f24453b = true;
    }

    public final void b(String str) {
        List<String> list;
        if (d()) {
            if (str == null) {
                str = "";
            }
            zb0 zb0Var = this.f24454c;
            if (zb0Var != null) {
                zb0Var.b(str, null, 3);
                return;
            }
            q80 q80Var = this.f24455d;
            if (!q80Var.f14186m || (list = q80Var.f14187n) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    t.r();
                    b2.g(this.f24452a, "", strReplace);
                }
            }
        }
    }

    public final boolean c() {
        return !d() || this.f24453b;
    }
}
