package m3;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ads.is;
import com.google.android.gms.internal.ads.ks;
import com.google.android.gms.internal.ads.r44;
import n.d;

/* loaded from: classes.dex */
final class w1 implements is {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ks f25336a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f25337b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f25338c;

    w1(b2 b2Var, ks ksVar, Context context, Uri uri) {
        this.f25336a = ksVar;
        this.f25337b = context;
        this.f25338c = uri;
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void a() {
        n.d dVarA = new d.a(this.f25336a.a()).a();
        dVarA.f25427a.setPackage(r44.a(this.f25337b));
        dVarA.a(this.f25337b, this.f25338c);
        this.f25336a.f((Activity) this.f25337b);
    }
}
