package s3;

import android.util.JsonReader;
import com.google.android.gms.internal.ads.ab3;
import com.google.android.gms.internal.ads.k90;
import com.google.android.gms.internal.ads.qa3;
import com.google.android.gms.internal.ads.w93;
import com.google.android.gms.internal.ads.yr1;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class m implements w93 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f26831a;

    /* renamed from: b, reason: collision with root package name */
    private final yr1 f26832b;

    public m(Executor executor, yr1 yr1Var) {
        this.f26831a = executor;
        this.f26832b = yr1Var;
    }

    @Override // com.google.android.gms.internal.ads.w93
    public final /* bridge */ /* synthetic */ ab3 a(Object obj) {
        final k90 k90Var = (k90) obj;
        return qa3.m(this.f26832b.b(k90Var), new w93() { // from class: s3.l
            @Override // com.google.android.gms.internal.ads.w93
            public final ab3 a(Object obj2) {
                k90 k90Var2 = k90Var;
                o oVar = new o(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    oVar.f26838b = k3.t.b().j(k90Var2.f10913m).toString();
                } catch (JSONException unused) {
                    oVar.f26838b = "{}";
                }
                return qa3.h(oVar);
            }
        }, this.f26831a);
    }
}
