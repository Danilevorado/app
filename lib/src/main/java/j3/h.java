package j3;

import com.google.android.gms.internal.ads.hy2;

/* loaded from: classes.dex */
final class h implements hy2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f24462a;

    h(i iVar) {
        this.f24462a = iVar;
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void a(int i10, long j10, String str) {
        this.f24462a.f24470t.e(i10, System.currentTimeMillis() - j10, str);
    }

    @Override // com.google.android.gms.internal.ads.hy2
    public final void b(int i10, long j10) {
        this.f24462a.f24470t.d(i10, System.currentTimeMillis() - j10);
    }
}
