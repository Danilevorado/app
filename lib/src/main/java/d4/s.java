package d4;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class s extends l {

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.api.b f22924c;

    public s(com.google.android.gms.common.api.b bVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f22924c = bVar;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final com.google.android.gms.common.api.internal.b e(com.google.android.gms.common.api.internal.b bVar) {
        return this.f22924c.f(bVar);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context g() {
        return this.f22924c.i();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper h() {
        return this.f22924c.k();
    }
}
