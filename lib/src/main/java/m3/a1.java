package m3;

import android.content.Context;
import com.google.android.gms.internal.ads.ef0;

/* loaded from: classes.dex */
public final class a1 extends b0 {

    /* renamed from: c, reason: collision with root package name */
    private final ef0 f25189c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25190d;

    public a1(Context context, String str, String str2) {
        this.f25189c = new ef0(j3.t.r().z(context, str));
        this.f25190d = str2;
    }

    @Override // m3.b0
    public final void a() {
        this.f25189c.o(this.f25190d);
    }
}
